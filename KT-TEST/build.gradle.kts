plugins {
    kotlin("js") version "1.3.61" apply false
}

allprojects {
    repositories {
        jcenter()
    }
}

tasks.wrapper {
    gradleVersion = "6.2"
    distributionType = Wrapper.DistributionType.ALL
}
