# Jetpack Trivia App

This repository contains an Android trivia app built with Jetpack Compose, Dagger Hilt, Retrofit, and Room.  The app fetches trivia questions from an external API and presents them to the user in an interactive quiz format.

## Key Features

* **Interactive Quiz:**  Users answer multiple-choice trivia questions.
* **Progress Tracking:** The app tracks the user's progress through the quiz.
* **Correct/Incorrect Feedback:**  Users receive immediate feedback on their answers.
* **Clean Architecture:** Uses MVVM architecture with dependency injection (Hilt).
* **Jetpack Compose UI:** Built with modern Android UI toolkit.
* **Network Calls with Retrofit:** Uses Retrofit for making network requests to fetch questions.


## Technologies Used

* **Kotlin:** Programming language.
* **Jetpack Compose:** Android UI toolkit.
* **Dagger Hilt:** Dependency Injection library.
* **Retrofit:** Type-safe HTTP client.
* **Room:** Offline database (not actively used in this provided codebase).
* **Coroutine:** For asynchronous operations.


## Prerequisites

* **Android Studio:**  The latest stable version is recommended.  This project uses Gradle 8.0, make sure your Android Studio supports this or higher.
* **JDK 17 or higher:** Ensure you have a compatible JDK installed.  The project is configured to use Java 17.
* **Android SDK:** Install the necessary Android SDK components, including the appropriate build tools and platform versions (specified in `app/build.gradle.kts`).


## Installation

1. **Clone the repository:**
   ```bash
   git clone <repository_url>
   ```

2. **Open the project in Android Studio:** Open the cloned directory in Android Studio.

3. **Sync the project:** Android Studio will automatically sync the project with Gradle. If it doesn't, you can manually do this by clicking the "Sync Project with Gradle Files" button (usually an elephant icon) in the toolbar.

4. **Install Dependencies:** Android Studio's Gradle system will automatically download all necessary dependencies defined in `app/build.gradle.kts`.

## Project Structure

```
app/
  src/
    androidTest/  // Android instrumentation tests
    main/         // Main application code
      java/       // Java/Kotlin source code
        com/
          example/
            jetpacktriviaapp/
              component/   // Composable UI components
              data/       // Data classes and DataOrException class
              di/         // Dependency Injection modules
              model/      // Data models
              network/    // Network API interfaces and Retrofit setup
              repository/ // Data access layer
              screens/    // ViewModels and composables for screens
              ui/         // UI-related code (theme, colors, typography)
              MainActivity.kt // Main Activity
              TriviaApplication.kt // Application class
      res/         // Resource files (layouts, drawables, values)
    test/         // Unit tests
  build.gradle.kts // Module-level Gradle configuration
  proguard-rules.pro // ProGuard rules
gradle/
  wrapper/       // Gradle wrapper files
README.md       // This file
build.gradle.kts // Top-level Gradle configuration
gradle.properties // Gradle properties
gradlew          // Gradle wrapper for Linux/macOS
gradlew.bat      // Gradle wrapper for Windows
settings.gradle.kts // Gradle settings
```

## Configuration

The `gradle.properties` file contains project-wide Gradle settings, including JVM arguments and AndroidX configuration. The `app/build.gradle.kts` file contains the module-level Gradle configuration and lists all dependencies.  No environment variables need to be set for this application to run.  The base URL for API calls is defined in `app/src/main/java/com/example/jetpacktriviaapp/util/Constants.kt`.


## Usage Examples

The app launches directly into the trivia quiz.  Users select answers and click "Next" to proceed.  Correct answers are indicated by green, incorrect by red.  The app displays the current question number and total number of questions.

## Scripts

* **`gradlew` (Linux/macOS) and `gradlew.bat` (Windows):** These are Gradle wrapper scripts. They allow you to run Gradle tasks (like building, running, and testing the app) without needing to install Gradle globally. You can use them to build the project from your command line using commands such as `./gradlew build` or `gradlew.bat build`.

## License

### Disclaimer

This repository contains code created while following the course  
**"Android Jetpack Compose - Build Android Native UIs Fast"** by **Paulo Dichone**,  
available at: [O’Reilly Learning Platform](https://learning.oreilly.com/course/android-jetpack-compose/9781803237718/)

The content is intended for educational purposes only and closely follows the structure and lessons from the original course.

All rights to the course content and materials belong to **Paulo Dichone**.  
This repository is not affiliated with or endorsed by Paulo Dichone or O’Reilly.

If you are the content owner and would like this repository modified or removed, please contact me directly.

## Error Handling

The application includes basic error handling within the `QuestionRepository` class.  If an exception occurs during the network request to fetch trivia questions, a generic error message will be logged. More robust error handling and user-facing error messages might be necessary for a production-ready application. The `DataOrException` class is used to manage potential errors during data fetching.

The `getAllQuestions()` function in `QuestionRepository` includes a try-catch block to catch potential exceptions during network requests.  However, currently, only the exception message is logged; better error handling (e.g. informing the user) should be implemented.


