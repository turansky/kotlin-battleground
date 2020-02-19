group = "com.test.webpack"
version = "0.0.1-KTEST"

plugins {
    kotlin("js") version "1.3.61"
    id("maven-publish")
}

repositories {
    jcenter()
}

kotlin.target.browser()

dependencies {
    implementation(kotlin("stdlib-js"))
}

tasks {
    compileKotlinJs {
        kotlinOptions {
            moduleKind = "commonjs"
        }
    }

    JsJar {
        from(projectDir) {
            include("package.json")
        }
    }

    wrapper {
        gradleVersion = "6.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenKotlin") {
            from(components["kotlin"])
        }
    }
}
