plugins {
    id("weathertoday.android.library")
}

android {
    namespace = "com.olubankeeboda.core.model"

}

dependencies {
    implementation(libs.kotlinx.datetime)
}

