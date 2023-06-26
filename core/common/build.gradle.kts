plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.library.jacoco")
    id("weathertoday.android.hilt")
}

android {
    namespace = "com.olubankeeboda.weathertoday.core.common"

}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    testImplementation(project(":core:testing"))
}
