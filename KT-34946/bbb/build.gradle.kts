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

                implementation(project(":aaa"))
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