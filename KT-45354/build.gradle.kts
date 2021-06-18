plugins {
    kotlin("js") version "1.5.10" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}

tasks {
    wrapper {
        gradleVersion = "7.1"
    }
}
