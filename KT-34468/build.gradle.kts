plugins {
    kotlin("js") version "1.4-SNAPSHOT"
}

repositories {
    mavenLocal()
    jcenter()
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("@yworks/optimizer", "1.0.6"))

    testImplementation(kotlin("test-js"))
}
