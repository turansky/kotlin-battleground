group = "com.test.webpack"
version = "0.0.1-KTEST"

plugins {
    kotlin("js") version "1.3.61"
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

    wrapper {
        gradleVersion = "6.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
