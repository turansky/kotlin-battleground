group = "com.test.webpack"

plugins {
    kotlin("js") version "1.3.61"
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}
