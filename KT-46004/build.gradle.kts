import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js") version "1.5.0-RC" apply false
}

repositories {
    mavenCentral()
}

tasks {
    wrapper {
        gradleVersion = "6.8.3"
        distributionType = Wrapper.DistributionType.ALL
    }
}
