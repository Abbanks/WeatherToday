plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.library.jacoco")
    id("weathertoday.android.hilt")
    id("weathertoday.android.room")
}

android {
    namespace = "com.olubankeeboda.weathertoday.core.database"

}

dependencies {
    implementation(project(":core:model"))

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.datetime)

    androidTestImplementation(project(":core:testing"))

}