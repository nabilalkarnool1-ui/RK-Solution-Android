# RK Solution Android APK

The Android project and GitHub Actions build workflow are already added.

## One file still needs uploading

Upload the prepared HTML file as exactly:

`app/src/main/assets/index.html`

Use the file named **Rafique_Android_Clock_Calendar_Wallpaper.html** from the prepared download. When GitHub asks for the destination, make sure it is inside `app/src/main/assets/` and name it `index.html`.

## Build the APK

1. Open the **Actions** tab.
2. Select **Build RK Solution APK**.
3. Click **Run workflow** and confirm.
4. Wait for the run to finish with a green check.
5. Open that run and download **RK-Solution-debug-APK** under Artifacts.

The APK is not built until the workflow succeeds.
