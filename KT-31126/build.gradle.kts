plugins {
    kotlin("js") version "1.4-SNAPSHOT"
}

repositories {
    jcenter()
    mavenLocal()
}

kotlin {
    js {
        useCommonJs()

        browser()
        binaries.executable()
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
