plugins {
    kotlin("js") version "1.4.0"
}

repositories {
    jcenter()
}

kotlin.js {
    useCommonJs()

    browser()
    binaries.executable()
}

dependencies {
    testImplementation(kotlin("test-js"))
}

tasks {
    wrapper {
        gradleVersion = "6.3"
        distributionType = Wrapper.DistributionType.ALL
    }
}
