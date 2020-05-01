import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    kotlin("js") version "1.4-M1" apply false
}

subprojects {
    repositories {
        jcenter()
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
    }

    plugins.withType<KotlinJsPluginWrapper> {
        tasks.withType<KotlinJsCompile> {
            kotlinOptions.moduleKind = "commonjs"
        }
    }
}
