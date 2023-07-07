plugins {
    id("weathertoday.android.library")
}

android {
    namespace = "com.olubankeeboda.weathertoday.core.model"

}

dependencies {
    implementation(libs.kotlinx.datetime)
}

