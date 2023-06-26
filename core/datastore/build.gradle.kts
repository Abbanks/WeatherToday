plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.library.jacoco")
    id("weathertoday.android.hilt")
//    alias(libs.plugins.protobuf)
}

android {
    namespace = "com.olubankeeboda.weathertoday.core.datastore"

}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(libs.androidx.dataStore.core)
    implementation(libs.kotlinx.coroutines.android)
   //implementation(libs.protobuf.kotlin.lite)

    testImplementation(project(":core:datastore-test"))
    testImplementation(project(":core:testing"))

}