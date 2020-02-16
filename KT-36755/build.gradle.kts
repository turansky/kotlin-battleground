plugins {
    kotlin("js") apply false
}

allprojects {
    repositories {
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
}

tasks.wrapper {
    gradleVersion = "6.1.1"
    distributionType = Wrapper.DistributionType.ALL
}
