import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("multiplatform")
}

kotlin {
    targets {
        jvm {
            tasks.withType<KotlinCompile> {
                kotlinOptions {
                    jvmTarget = "1.8"
                }
            }
        }
        js {
            browser()
        }
    }

    sourceSets {
        getByName("commonMain").dependencies {
            implementation(kotlin("stdlib-common"))
            implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
        }
        getByName("jvmMain").dependencies {
            implementation(kotlin("stdlib-jdk8"))
        }
        getByName("jsMain").dependencies {
            implementation(kotlin("stdlib-js"))
        }
    }
}