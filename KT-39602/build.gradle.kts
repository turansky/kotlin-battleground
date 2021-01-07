plugins {
    kotlin("js") version "1.5.255-SNAPSHOT"
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
        gradleVersion = "6.7.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
