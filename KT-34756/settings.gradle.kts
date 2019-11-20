rootProject.name = "no-stdlib-js"

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
}

include("yfiles-kotlin")
include("app-with-stdlib")
include("app-without-stdlib")
