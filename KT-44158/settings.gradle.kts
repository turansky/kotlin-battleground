rootProject.name = "no-highlight-example"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }

    plugins {
        fun version(target: String): String =
            extra["${target}.version"] as String

        val kotlinVersion = version("kotlin")
        kotlin("multiplatform") version kotlinVersion
        kotlin("android") version kotlinVersion
        kotlin("plugin.parcelize") version kotlinVersion

        val androidToolsVersion = version("android.gradle.tools")
        id("com.android.library") version androidToolsVersion
        id("com.android.application") version androidToolsVersion
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.library",
                "com.android.application"
                -> useModule("com.android.tools.build:gradle:${requested.version}")
            }
        }
    }
}

include(":multiplatform")
