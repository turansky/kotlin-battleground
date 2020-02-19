plugins {
    kotlin("js")
}

kotlin.target.browser {
    dceTask {
        keep += "KT-TEST-app.Main"
    }
}

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
