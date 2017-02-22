# LCaughtException
Android lib for debug mode or staging caught when app get error exception , it will print error log to a new page.

# Gradle
```
dependencies {
         compile 'com.lemon.library:caught-exception:1.0.0'
}
```

# Application
Create new class extedns **Application** then control is it debug mode. If true when crash will open a page list crash log, if false will back to normal.
```
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ExceptionSetting.setIsDebugMode(true);

    }
}
```

# AndroidManifest
Declare application on your **AndroidManifest**
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.lemon.customfont">

    <application
        android:name=".BaseApplication"
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```

# Activity
Every Activity extends **BaseExceptionActivity**
```
public class MainActivity extends BaseExceptionActivity {
```

# License
```
LCaughtException library for Android
Copyright (c) 2017 LemonNicholas (http://github.com/LemonNicholas).

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
