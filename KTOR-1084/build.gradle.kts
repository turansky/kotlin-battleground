plugins {
    kotlin("js") version "1.4.30-M1"
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
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.4.2")
    implementation("io.ktor:ktor-client-js:1.5.0")
}

tasks {
    wrapper {
        gradleVersion = "6.8.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
