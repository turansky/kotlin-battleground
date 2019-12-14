plugins {
    kotlin("js")
}

kotlin {
    target {
        browser {
            webpackTask {
                sourceMaps = false
            }
        }
    }

    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        test {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}
