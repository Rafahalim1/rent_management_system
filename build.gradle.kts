// android {
//    namespace = "com.example.myapplication"
//    compileSdk {
//        version = release(37)
//    }
//
//    defaultConfig {
//        applicationId = "com.example.myapplication"
//        minSdk = 24
//        targetSdk = 37
//        versionCode = 1
//        versionName = "1.0"
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildFeatures {
//        viewBinding = true
//        dataBinding = true
//    }
//
//    buildTypes {
//        release {
//            // ...
//        }
//    }
//}
plugins {
    alias(libs.plugins.android.application) apply false
    // Safe Args: generates classes for passing data between screens
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}