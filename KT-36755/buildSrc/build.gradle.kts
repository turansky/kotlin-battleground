plugins {
    kotlin("jvm") version "1.3.70-eap-184"
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    implementation(kotlin("stdlib"))

    compileOnly(kotlin("gradle-plugin"))
}
