plugins {
    kotlin("js") version "1.4.10"
}

repositories {
    jcenter()
}

kotlin.js {
    useCommonJs()

    browser()
    binaries.executable()
}

tasks {
    wrapper {
        gradleVersion = "6.6.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
