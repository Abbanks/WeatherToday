plugins {
    id("weathertoday.android.application")
    id("weathertoday.android.application.compose")
    id("weathertoday.android.application.jacoco")
    id("weathertoday.android.hilt")
    id("jacoco")
    id("weathertoday.android.application.firebase")

}

android {

    namespace = "com.olubankeeboda.weathertoday"

    defaultConfig {
        applicationId = "com.olubankeeboda.weathertoday"
        versionCode = 1
        versionName = "1.0"

//        // Custom test runner to set up Hilt dependency graph
//        testInstrumentationRunner = "com.google.samples.apps.nowinandroid.core.testing.NiaTestRunner"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }


//    testOptions {
//        unitTests {
//            isIncludeAndroidResources = true
//        }
//    }
    hilt {
        enableAggregatingTask = true
    }
}



dependencies {
//    implementation(project(":feature:home"))
//    implementation(project(":feature:map"))
//    implementation(project(":feature:settings"))
//
//    implementation(project(":core:common"))
//    implementation(project(":core:data"))
//    implementation(project(":core:database"))
//    implementation(project(":core:datastore"))
//    implementation(project(":core:model"))
//    implementation(project(":core:network"))
    implementation(project(":core:designsystem"))


    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.compose.runtime.tracing)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.coil.kt)
//    implementation(libs.androidx.window.manager)
//    implementation(libs.androidx.profileinstaller)

    androidTestImplementation(libs.androidx.navigation.testing)
    androidTestImplementation(libs.accompanist.testharness)
    androidTestImplementation(kotlin("test"))
    debugImplementation(libs.androidx.compose.ui.testManifest)
    androidTestImplementation(project(":core:testing"))
    androidTestImplementation(project(":core:datastore-test"))
    androidTestImplementation(project(":core:data-test"))
    androidTestImplementation(project(":core:network"))
//    implementation(project(":feature:interests"))
//    implementation(project(":feature:foryou"))
//    implementation(project(":feature:bookmarks"))
//    implementation(project(":feature:topic"))
//    implementation(project(":feature:search"))
//    implementation(project(":feature:settings"))
//
//    implementation(project(":core:common"))
//    implementation(project(":core:ui"))
//    implementation(project(":core:designsystem"))
//    implementation(project(":core:data"))
//    implementation(project(":core:model"))
//    implementation(project(":core:analytics"))
//
//    implementation(project(":sync:work"))
//
   // debugImplementation(project(":ui-test-hilt-manifest"))
//


}

// androidx.test is forcing JUnit, 4.12. This forces it to use 4.13
configurations.configureEach {
    resolutionStrategy {
        force(libs.junit4)
        // Temporary workaround for https://issuetracker.google.com/174733673
        force("org.objenesis:objenesis:2.6")
    }
}