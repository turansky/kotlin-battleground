plugins {
    kotlin("js") version "1.3.70-dev-1666" apply false
}

allprojects {
    repositories {
        gradlePluginPortal()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
    }
}

tasks.wrapper {
    gradleVersion = "6.0"
    distributionType = Wrapper.DistributionType.ALL
}