rootProject.name = "dce-transitive-dependencies"

pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
    }
}

include("aaa")
include("bbb")
include("ccc")