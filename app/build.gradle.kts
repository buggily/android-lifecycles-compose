plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = Build.Sdk.COMPILE

    defaultConfig {
        applicationId = Build.ID

        minSdk = Build.Sdk.MIN
        targetSdk = Build.Sdk.TARGET

        versionCode = Version.CODE
        versionName = Version.NAME

        testInstrumentationRunner = Build.RUNNER
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = Version.JAVA
        targetCompatibility = Version.JAVA
    }

    kotlinOptions {
        jvmTarget = Version.JAVA.toString()
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Version.Compose.COMPILER
    }
}

dependencies {
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.MATERIAL)
    implementation(Dependency.Compose.FOUNDATION)

    implementation(Dependency.Compose.ACTIVITY)
    implementation(Dependency.Compose.VIEW_MODEL)
    implementation(Dependency.Compose.LIVEDATA)

    debugImplementation(Dependency.Compose.Preview.IDENTITY)
    implementation(Dependency.Compose.Preview.PREVIEW)
}
