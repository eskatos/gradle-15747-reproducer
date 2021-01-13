plugins {
    `kotlin-dsl`
    id("some-buildSrc")
    id("some-included")
}

repositories {
    gradlePluginPortal()
}
