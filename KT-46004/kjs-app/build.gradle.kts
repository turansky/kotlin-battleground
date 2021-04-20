plugins {
    kotlin("js")
}

kotlin.js {
    moduleName = "kjs-app"

    browser()
    useCommonJs()

    binaries.executable()
}

dependencies {
    runtimeOnly(project(":kjs-worker"))
}
