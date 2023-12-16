plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.tt"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.tt"
        minSdk = 29
        targetSdk = 32
        versionCode = 8
        versionName = "1.7"

        multiDexEnabled = true;
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true;
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.airbnb.android:lottie:3.4.0")
    implementation ("androidx.core:core-splashscreen:1.1.0-alpha02")
    implementation ("com.google.code.gson:gson:2.9.0")

    implementation("pl.droidsonroids.gif:android-gif-drawable:1.2.19")

    implementation ("com.airbnb.android:lottie:3.4.0")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")
    implementation ("androidx.fragment:fragment:1.6.2")

    implementation ("de.hdodenhof:circleimageview:3.1.0")

}