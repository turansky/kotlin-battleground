plugins {
    kotlin("js")
    id("kotlin-dce-js")

    id("com.github.turansky.yfiles")
}

kotlin {
    target {
        browser {
            webpackTask {
                sourceMaps = false

                dependsOn(tasks.runDceKotlin)
            }
        }
    }

    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))

                implementation(project(":yfiles-kotlin"))
                implementation(project(":yfiles-base"))
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

    runDceKotlin {
        dceOptions {
            outputDirectory = rootProject.buildDir
                .resolve("js")
                .resolve("packages")
                .resolve("app-minified")
                .canonicalPath
        }

        keep("dce-test-dce-app.com.test.app.Comparables")
    }
}