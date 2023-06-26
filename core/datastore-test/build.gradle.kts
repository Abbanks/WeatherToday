plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.hilt")
}

android {
    namespace = "com.olubankeeboda.weathertoday.core.datastore.test"
}

dependencies {
    api(project(":core:datastore"))
    api(libs.androidx.dataStore.core)

   // implementation(libs.protobuf.kotlin.lite)
    implementation(project(":core:common"))
    implementation(project(":core:testing"))
}
