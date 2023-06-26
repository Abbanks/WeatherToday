plugins {
    id("weathertoday.android.library")
    id("weathertoday.android.hilt")
}

android {
    namespace = "com.weathertoday.core.data.test"
}

dependencies {
    api(project(":core:data"))
    implementation(project(":core:testing"))
    implementation(project(":core:common"))
}
