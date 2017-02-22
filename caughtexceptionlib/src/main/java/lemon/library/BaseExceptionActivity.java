package lemon.library;

import android.app.Activity;
import android.os.Bundle;

import lemon.library.util.ExceptionSetting;

/**
 * Created by NicholasTan on 22/02/2017.
 */
public class BaseExceptionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (ExceptionSetting.isDebugMode())
            Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
    }

}
