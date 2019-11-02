plugins {
    kotlin("js")
}

kotlin {
    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
    }
}