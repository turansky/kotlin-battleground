import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("js")
}

kotlin {
    target {
        browser()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks.named<KotlinJsCompile>("compileKotlinJs") {
    doFirst {
        val moduleKind = kotlinOptions.moduleKind
        check(moduleKind == "commonjs") {
            """
                   Expected module kind: commonjs
                   Actual module kind: $moduleKind
               """.trimIndent()
        }

        println("OK")
    }
}
