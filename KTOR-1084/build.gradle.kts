import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js") version "1.5.21"
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
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.5.1")
    implementation("io.ktor:ktor-client-js:1.6.2")
    implementation(devNpm("webpack-bundle-analyzer", "4.4.0"))
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += listOf(
        // "-Xir-property-lazy-initialization"
    )
}

tasks {
    wrapper {
        gradleVersion = "7.1.1"
    }
}
