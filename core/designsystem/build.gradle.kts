plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.library.compose")
    id("weathertoday.android.library.jacoco")
}

android {
    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
//    lint {
//        checkDependencies = true
//    }
    namespace = "com.olubankeeboda.weathertoday.core.designsystem"

}

dependencies {
    //lintPublish(project(":lint"))

    api(libs.androidx.compose.foundation)
    api(libs.androidx.compose.foundation.layout)
    api(libs.androidx.compose.material.iconsExtended)
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.runtime)
    api(libs.androidx.compose.ui.tooling.preview)
    api(libs.androidx.compose.ui.util)

    debugApi(libs.androidx.compose.ui.tooling)

    implementation(libs.androidx.core.ktx)
    implementation(libs.coil.kt.compose)

    androidTestImplementation(project(":core:testing"))
}