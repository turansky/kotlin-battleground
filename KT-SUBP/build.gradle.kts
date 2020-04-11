import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js") version "1.4-M1"
}

repositories {
    jcenter()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

kotlin {
    target {
        browser()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks {
    named<KotlinJsCompile>("compileKotlinJs") {
        doFirst {
            check(kotlinOptions.moduleKind == "commonjs") {
                """
                   Expected module kind: commonjs
                   Actual module kind: ${kotlinOptions.moduleKind}
               """.trimIndent()
            }
        }
    }

    wrapper {
        gradleVersion = "6.3"
        distributionType = Wrapper.DistributionType.ALL
    }
}
