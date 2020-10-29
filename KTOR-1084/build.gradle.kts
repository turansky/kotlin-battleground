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

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.4.0")
    implementation("io.ktor:ktor-client-js:1.4.1")
}

tasks {
    wrapper {
        gradleVersion = "6.6.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
