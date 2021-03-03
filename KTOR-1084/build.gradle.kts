import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js") version "1.5.0-M1"
}

repositories {
    mavenCentral()
}

kotlin.js {
    useCommonJs()

    browser()
    binaries.executable()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.4.3")
    implementation("io.ktor:ktor-client-js:1.5.2")
    implementation(devNpm("webpack-bundle-analyzer", "4.4.0"))
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += listOf(
        // "-Xir-property-lazy-initialization",
        "-Xir-per-module"
    )
}

tasks {
    wrapper {
        gradleVersion = "6.8.1"
        distributionType = Wrapper.DistributionType.ALL
    }
}
