plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

// WORKS
val kotlinVersion = "1.5.10"
// ERROR
// val kotlinVersion = "1.5.20-M1"

dependencies {
    implementation(kotlin("gradle-plugin", kotlinVersion))
}
