plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")  // Add this without version
}

android {
    namespace = "com.gdesign.onlineexams"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.gdesign.onlineexams"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    // Add Firebase BOM first
    implementation(platform("com.google.firebase:firebase-bom:32.8.1"))

    // Existing dependencies
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Firebase dependencies (without versions - managed by BOM)
    implementation(libs.google.firebase.database)
    implementation(libs.google.firebase.auth)
    implementation(libs.credentials)
    implementation(libs.credentials.play.services.auth)
    implementation(libs.googleid)

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}