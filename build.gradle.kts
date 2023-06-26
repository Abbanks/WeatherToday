buildscript {

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.serialization) apply false
//    alias(libs.plugins.firebase.crashlytics) apply false
//    alias(libs.plugins.firebase.perf) apply false
//    alias(libs.plugins.gms) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.kotlin.parcelize) apply false
}

println("")

