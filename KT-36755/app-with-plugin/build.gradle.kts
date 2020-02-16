plugins {
    kotlin("js")
}

apply<NoDistributionPlugin>()

kotlin {
    target {
        browser()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
}
