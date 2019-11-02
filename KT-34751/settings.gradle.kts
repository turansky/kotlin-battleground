rootProject.name = "dce"

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "kotlin-dce-js" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
            }
        }
    }
}

include("yfiles-kotlin")
include("yfiles-base")

include("test-app")
include("test-dce-app")