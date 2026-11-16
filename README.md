# RK Solution Android APK

This repository builds the RK Solution Clock + Calendar Android app with GitHub Actions.

## Add the Android project files

Upload the **contents inside** the `RK_Solution_Android_Project` folder from the provided ZIP to this repository's root (not the enclosing folder itself). Keep the `.github/workflows/build-apk.yml` file.

Required project files include:
- `settings.gradle`
- `build.gradle`
- `gradle.properties`
- `app/build.gradle`
- `app/src/main/AndroidManifest.xml`
- `app/src/main/java/com/rksolution/clockcalendar/MainActivity.java`
- `app/src/main/assets/index.html`

## Build

After the project files are uploaded, push to `main` or open Actions and run **Build RK Solution APK**. Download `RK-Solution-debug-APK` from the run's Artifacts section.
