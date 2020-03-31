rootProject.name = "js-configurable-properties"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

/*
includeBuild("../../kotlin-fork") {
    dependencySubstitution {
        substitute(module("org.jetbrains.kotlin:kotlin-compiler"))
            .with(project(":include:kotlin-compiler"))
    }
}
*/
