import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js") version "1.6.10"
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
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.0")
    implementation("io.ktor:ktor-client-js:2.0.0-beta-1")
    implementation(devNpm("webpack-bundle-analyzer", "4.4.0"))
}

tasks.withType<KotlinJsCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs += listOf(
            // "-Xir-property-lazy-initialization"
        )
        sourceMap = false
        sourceMapEmbedSources = null
    }
}

tasks.wrapper {
    gradleVersion = "7.3"
}
