plugins {
    kotlin("js")

    id("com.github.turansky.yfiles")
}

kotlin {
    target {
        browser()
    }

    sourceSets {
        main {
            dependencies {
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