rootProject.name = "no-stdlib-js"

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

include("yfiles-kotlin")
include("app-with-stdlib")
include("app-without-stdlib")