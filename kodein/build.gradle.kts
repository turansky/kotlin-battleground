import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    kotlin("multiplatform") version "1.3.50" apply false
    kotlin("js") version "1.3.50" apply false
}

extra.set("kodeinVersion", "6.4.0")

allprojects {
    repositories {
        jcenter()
    }
}

subprojects {
    plugins.withType<KotlinJsPluginWrapper> {
        tasks.withType<KotlinJsCompile>().configureEach {
            kotlinOptions {
                moduleKind = "commonjs"
                allWarningsAsErrors = true
            }
        }
    }
}

tasks.wrapper {
    gradleVersion = "5.6.4"
    distributionType = Wrapper.DistributionType.ALL
}