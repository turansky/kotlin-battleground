plugins {
    kotlin("js") version "1.3.70"
}

repositories {
    jcenter()
}

tasks {
    wrapper {
        gradleVersion = "6.2.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
