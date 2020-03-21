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
    named("browserTest") {
        doFirst {
            project.projectDir
                .resolve("webpack.config.d")
                .also { it.mkdir() }
                .resolve("no-output-library.js")
                .writeText("; config = {}") // must break webpack config
        }
    }

    wrapper {
        gradleVersion = "6.2.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
