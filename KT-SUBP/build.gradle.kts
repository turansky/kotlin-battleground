import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    // Works
    // kotlin("js") version "1.4-M1" apply false
    // ERROR
    kotlin("js") version "1.4.0-dev-5808" apply false
}

subprojects {
    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        maven("https://dl.bintray.com/kotlin/kotlin-dev")
    }

    plugins.withType<KotlinJsPluginWrapper> {
        tasks.withType<KotlinJsCompile> {
            kotlinOptions.moduleKind = "commonjs"
        }
    }
}
