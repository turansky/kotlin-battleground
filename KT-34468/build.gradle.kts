plugins {
    kotlin("js") version "1.3.71"
}

repositories {
    jcenter()
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("@yworks/optimizer", "1.0.6"))

    testImplementation(kotlin("test-js"))
}
