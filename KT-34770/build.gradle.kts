plugins {
    kotlin("js") version "1.4-SNAPSHOT"
}

repositories {
    mavenLocal()
    jcenter()
}

kotlin {
    js {
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
