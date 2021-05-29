plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

tasks {
    wrapper {
        gradleVersion = "7.0.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
