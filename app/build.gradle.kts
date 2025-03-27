plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.filmssearch"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.filmssearch"
        minSdk = 29
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.constraint.layout)
    implementation(libs.androidx.material)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.cardview)
    implementation(libs.design)
    implementation(libs.androidx.viewpager2)
    implementation(libs.support.fragment)
    implementation(libs.navigation.fragment)
    implementation(libs.androidx.gridlayout)
    implementation(libs.androidx.viewbinding)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.ui.android.text)
    implementation(libs.recyclerview.v7)
    implementation(libs.androidx.material.navigation)
    implementation(libs.androidx.versionedparcelable)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.recyclerview.selection)
    implementation(libs.versionedparcelable)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}