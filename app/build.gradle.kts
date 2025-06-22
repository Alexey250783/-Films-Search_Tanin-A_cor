plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.filmssearch"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.filmssearch"
        minSdk = 31
        targetSdk = 36
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
        dataBinding = true
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
    implementation(libs.androidx.databinding.runtime)
    implementation(libs.com.android.legacy.kapt.gradle.plugin)
    implementation(libs.material.navigation)
    implementation(libs.androidx.fragment.testing.manifest)
    implementation(libs.glide)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.animation.graphics)
    implementation(libs.design.bottomnavigation)
    implementation(libs.androidx.animation.graphics.android)
    implementation(libs.play.services.appsearch)
    implementation(libs.androidx.pdf.viewer.fragment)
    implementation(libs.databinding.library)
    implementation(libs.design.widget)
    implementation(libs.widgets)
    implementation(libs.design.floatingactionbutton)
    implementation(libs.fragment)
    implementation(libs.gson)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}