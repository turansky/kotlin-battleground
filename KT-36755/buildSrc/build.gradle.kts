plugins {
    id("org.gradle.kotlin.kotlin-dsl") version "1.3.3"
    kotlin("jvm") version "1.3.70-eap-184"
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(gradleApi())

    implementation(kotlin("gradle-plugin"))
}
