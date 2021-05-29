import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

the<KotlinProjectExtension>().apply {
    sourceSets.configureEach {
        languageSettings {
            useExperimentalAnnotation("kotlin.ExperimentalStdlibApi")
        }
    }
}
