plugins {
    kotlin("js")
    id("com.github.turansky.yfiles")
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

                implementation(project(":yfiles-kotlin"))
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