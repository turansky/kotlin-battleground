plugins {
    kotlin("js") version "1.4-M1"
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

kotlin {
    target {
        useCommonJs()

        browser()
        produceExecutable()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
    testImplementation(kotlin("test-js"))
}

tasks {
    wrapper {
        gradleVersion = "6.3"
        distributionType = Wrapper.DistributionType.ALL
    }
}
