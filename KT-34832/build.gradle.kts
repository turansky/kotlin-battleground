plugins {
    kotlin("multiplatform") version "1.3.60" apply false
    kotlin("js") version "1.3.60" apply false
}

allprojects {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
}

tasks.wrapper {
    gradleVersion = "5.6.4"
    distributionType = Wrapper.DistributionType.ALL
}
