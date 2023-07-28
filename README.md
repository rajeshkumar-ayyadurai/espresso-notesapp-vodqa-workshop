# espresso-notesapp-vodqa-workshop

## Setup Instructions For Espresso Workshop

### JAVA Installation
- Open a terminal and check java version: java -version If the version is less than 1.8 or the command is not recognized you need to install java
- Download JDK
- Open Downloads folder and double click the DMG file
- Double click the JDK install icon
- Click the Continue button
- Click the Install button
  
### Android Studio Setup

- Go to the Android Studio website: (click here) and download the latest version of Android Studio for your operating system. (Recommended Android Studio version is 3.4 and above, to have seamless experience have the latest Android Studio version i.e Flamingo)
- Refer beside site and ensure the Android Studio version is greater than 3.4 i.e its release date is on or after April 2019 (click here)
- Once the download is complete, run the installer
- Follow the on-screen instructions to install Android Studio
- Once Android Studio is installed, open it
- In the Welcome to Android Studio dialog, click Configure
- In the Configure Android Studio dialog, click SDK Manager
- In the SDK Manager, make sure that the following components are installed:
  _ Android SDK Platform [Under SDK Platforms tab, Checkmark Android 12.0 (S) which has API level 31 to get this installed if not already done]
  _ Android SDK Tools [Under SDK tools tab, checkmark Android SDK-Platform Tools to get this installed if not already done]
  _ Android SDK Build Tools  [Under SDK tools tab, checkmark Android SDK Build Tools to version 31.0.0 and get this installed if not already done]
  _ Android Emulator  [Under SDK tools tab, checkmark Android Emulator to get this installed if not already done]
- Click Apply and then Close

### Here are some additional references for setting up Android Studio
Mac Android Studio setup - https://treehouse.github.io/installation-guides/mac/android-studio-mac.html
Windows Android Studio setup - https://www.geeksforgeeks.org/guide-to-install-and-set-up-android-studio/
Linux Android Studio setup - https://www.linuxfordevices.com/tutorials/linux/installing-android-studio-on-linux 
Ubuntu Android Studio setup - https://www.geeksforgeeks.org/how-to-install-android-studio-on-ubuntu/

### Demo Repo Setup

- Open Android Studio
- In the Welcome to Android Studio dialog, click Check out project from Version Control
- In the Choose a Version Control System dialog, select Git
- In the Clone Repository dialog, enter repo URL i.e (vodQA-Espresso-Workshop-Repo)
- Click Clone
- Android Studio will clone the repo and open it in a new project window
  
### Here are some additional tips for cloning a repo and opening it from Android Studio

- You can also clone a repo from the command line. To do this, open a Terminal window and run the following command:
```git clone https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop.git```
- Once you have cloned the repo, you can open it from Android Studio by opening the File menu and selecting Open. Then, navigate to the directory where you cloned the repo and select the ./build.gradle file

### Emulator Setup

- In the Android Studio toolbar, click the Device Manager option
  <img width="578" alt="Screenshot 2023-07-20 at 5 51 49 PM" src="https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop/assets/112684368/2cdfb227-92f9-43a4-b743-f151efd7ee07">

- In the Device Manager, click the Create Device button
- In the Create Device dialog, select any Phone (Preferably Pixel 6)
- Click the Next button
- Then select the system image wrt the version of the operating system in emulator. Select any version (Preferably S which has API level 31 as its the stable version)
- Click the Next button
- In the AVD Name field, enter a name for your emulator that you want to emulate
- Click the Finish button
- Your emulator will be created
  
### Setup to run the Demo App on Emulator
- Once the repo is opened in the Android Studio window, the gradle build starts happening and the project gets compiled
- Once the gradle build is successful, the app name ( i.e app) would be automatically populated in the Run Configuration tab of tool bar
- Now in the toolbar select the Run icon
<img width="411" alt="Screenshot 2023-07-28 at 11 38 06 AM" src="https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop/assets/112684368/770e3946-5ad6-4245-bdf1-04d6d4920302">

- The app named Notes VodQA App will be installed on the emulator
<img width="395" alt="Screenshot 2023-07-28 at 11 33 32 AM" src="https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop/assets/112684368/1197672e-7bb1-4594-9efb-2d42be650d6e">

### Setup to run the basic espresso UI Automation test on Emulator       
- Once the app is running on the emulator, navigate to cloned repo’s ![#c5f015]`app/src/androidTest/java/com/thoughtworks/notesvodqa/ExampleInstrumentedTest.kt` file from project directory 
<img width="1295" alt="Screenshot 2023-07-28 at 11 41 40 AM" src="https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop/assets/112684368/7a0e0f9b-3239-4652-b2a1-5e3f8cc621b9">

- Now we can run the test, by clicking on the run button present beside the testname or by right-clicking on the test class and selecting Run 'testName' (i.e Run ‘useAppContext’)
- To ensure proper installation and setup, check that the test passes via the Run toolbar of Android Studio
<img width="601" alt="Screenshot 2023-07-28 at 11 40 38 AM" src="https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop/assets/112684368/8d510f6e-4d11-4379-a13e-783bf2328ed1">

  
Cheers!!! Now we are all ready for our vodQA Espresso Workshop. Eagerly awaiting to meet you all in person, till then happy coding 😊

<p align="center" width="100%">
    <img width="33%" src="https://github.com/rajeshkumar-ayyadurai/espresso-notesapp-vodqa-workshop/assets/112684368/f88723b9-55b1-4bff-acac-60e6de658c88">
</p>



