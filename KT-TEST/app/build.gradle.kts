plugins {
    kotlin("js")
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("com.test.webpack:lib")
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }
}
