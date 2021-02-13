import java.util.*

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    jcenter()
    google()
}

kotlinDslPluginOptions {
    experimentalWarning.set(false)
}

val props = Properties().apply {
    file("../gradle.properties").inputStream().use { load(it) }
}

fun version(target: String): String =
    props.getProperty("${target}.version")

dependencies {
    implementation(kotlin("gradle-plugin", version("kotlin")))
    implementation("com.android.tools.build:gradle:${version("android.gradle.tools")}")
}
