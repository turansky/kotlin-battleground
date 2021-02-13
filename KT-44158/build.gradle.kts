subprojects {
    repositories {
        mavenCentral()
        jcenter()
        google()
    }
}

tasks {
    wrapper {
        gradleVersion = "6.8.2"
        distributionType = Wrapper.DistributionType.ALL
    }
}
