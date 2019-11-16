plugins {
    kotlin("js")
}

kotlin {
    target {
        browser {
            webpackTask {
                sourceMaps = false
            }

            dceTask {
                keep("dce-transitive-dependencies-ccc.ccc")
            }
        }
    }

    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))

                implementation(project(":bbb"))
            }
        }
    }
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "umd"
        }
    }
}