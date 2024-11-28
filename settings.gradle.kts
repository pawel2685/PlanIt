pluginManagement {
    repositories {
        google {
            content {
                // Include only relevant groups from Google repository
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral() // Maven Central for additional dependencies
        gradlePluginPortal() // For Gradle plugins
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Fail if repositories are added in build.gradle files
    repositories {
        google() // Google repository for Android dependencies
        mavenCentral() // Maven Central for other dependencies
    }
}

rootProject.name = "PlanIt" // Set project name
include(":app") // Include app module
