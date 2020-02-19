plugins {
    kotlin("js")
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":lib"))
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}
