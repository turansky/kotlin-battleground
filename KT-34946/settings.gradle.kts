rootProject.name = "dce-transitive-dependencies"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

include("aaa")
include("bbb")
include("ccc")
