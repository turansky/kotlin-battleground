plugins {
    kotlin("js")
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("com.test.webpack", "lib", "0.0.1-KTEST")
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}
