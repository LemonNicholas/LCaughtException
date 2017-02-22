package lemon.library;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ExceptionActivity extends Activity {

    TextView mError;
    String error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));
        setContentView(R.layout.activity_exception);

        error = getIntent().getStringExtra("error");

        mError = (TextView) findViewById(R.id.error);

        mError.setText(error);

        Log.e(ExceptionActivity.this.getClass().getName(), error);
    }
}
