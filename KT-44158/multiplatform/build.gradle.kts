plugins {
    kotlin("multiplatform")

    `android-library-conventions`
}

kotlin {
    android()
    jvm()

    sourceSets {
        val commonMain by getting {}
        val jvmMain by getting {}
        val androidMain by getting {}
    }
}
