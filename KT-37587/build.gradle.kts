plugins {
    kotlin("js") version "1.3.70"
}

repositories {
    jcenter()
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
    testImplementation(kotlin("test-js"))
}

tasks {
    wrapper {
        gradleVersion = "6.2.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
