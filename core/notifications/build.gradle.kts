plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.library.compose")
    id("weathertoday.android.hilt")
}

android {
    namespace = "com.olubankeboda.weathertoday.core.notifications"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))

    implementation(libs.kotlinx.coroutines.android)
    //implementation(libs.androidx.browser)
    implementation(libs.androidx.compose.runtime)
    implementation(libs.androidx.core.ktx)

//    implementation(platform(libs.firebase.bom))
//    implementation(libs.firebase.cloud.messaging)
}
