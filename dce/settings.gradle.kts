rootProject.name = "dce"

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
    }
}

include("yfiles-kotlin")
include("yfiles-base")

include("test-app")