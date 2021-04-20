plugins {
    kotlin("js")
}

kotlin.js {
    moduleName = "kjs-worker"

    browser()
    useCommonJs()

    binaries.executable()
}
