val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("js")
}

kotlin {
    target {
        browser()
    }

    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))

                implementation(project(":mpp-lib"))
                implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
            }
        }
        test {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}