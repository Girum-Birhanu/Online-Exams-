// Top-level build.gradle.kts
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.3.2")  // Android Gradle Plugin
        classpath("com.google.gms:google-services:4.4.2")   // Google Services
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
}