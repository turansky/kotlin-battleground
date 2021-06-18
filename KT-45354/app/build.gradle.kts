plugins {
    kotlin("js")
}

kotlin {
    js {
        browser()
        useCommonJs()
    }

    js {
        browser()
        useCommonJs()

        binaries.executable()

        sourceSets {
            main {
                kotlin.srcDirs("src/common")
            }
        }
    }

    js {
        browser()
        useCommonJs()

        binaries.executable()

        sourceSets {
            main {
                kotlin.srcDirs("src/aaa")
            }
        }
    }

    js {
        browser()
        useCommonJs()

        binaries.executable()

        sourceSets {
            main {
                kotlin.srcDirs("src/bbb")
            }
        }
    }
}
