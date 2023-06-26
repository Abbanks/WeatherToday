pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "WeatherToday"
include(":app")
include(":core:common")
include(":feature:settings")
include(":core:data")
include(":core:ui")
include(":feature:home")
include(":feature:map")
include(":core:database")
include(":core:datastore")
include(":core:network")
include(":core:model")
include(":core:testing")
include(":core:designsystem")
include(":core:notifications")
include(":core:datastore-test")
include(":core:data-test")
