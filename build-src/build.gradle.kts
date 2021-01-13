plugins {
    `kotlin-dsl`
}

group = "gradle-15747"
version = "1.0"

repositories {
    gradlePluginPortal()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        allWarningsAsErrors = true
    }
}
