plugins {
    // kotlin("js") version "1.4.10"
    kotlin("js") version "1.4.255-SNAPSHOT"
}

repositories {
    jcenter()
    mavenLocal()
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
        gradleVersion = "6.6.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
