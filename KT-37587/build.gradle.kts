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

// language=JavaScript
// must break karma webpack config
val CRASH_KARMA_SCRIPT = """
    ;
    if (config.mode == 'development') {
        config = undefined
    }
""".trimIndent()

tasks {
    named("browserTest") {
        doFirst {
            project.projectDir
                .resolve("webpack.config.d")
                .also { it.mkdir() }
                .resolve("crash-karma.js")
                .writeText(CRASH_KARMA_SCRIPT)
        }
    }

    wrapper {
        gradleVersion = "6.2.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
