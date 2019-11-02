plugins {
    kotlin("js") version "1.3.60-eap-76" apply false
}

allprojects {
    repositories {
        gradlePluginPortal()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks.wrapper {
    gradleVersion = "5.6.4"
    distributionType = Wrapper.DistributionType.ALL
}