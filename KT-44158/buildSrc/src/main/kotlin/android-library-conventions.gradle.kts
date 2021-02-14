plugins {
    id("com.android.library")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(26)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            buildConfigField("String", "SERVER_URL", "\"https://example.com\"")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main") {
            manifest.srcFile("src/androidMain/AndroidManifest.xml")
            java.srcDir("src/androidMain/kotlin")
            res.srcDir("src/androidMain/res")
        }
    }
}
