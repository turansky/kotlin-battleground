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

    testImplementation(kotlin("test-js"))
}
