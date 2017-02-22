package com.lemon.demo;

import android.os.Bundle;

import java.util.ArrayList;

import lemon.library.BaseExceptionActivity;

public class MainActivity extends BaseExceptionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ArrayList<String> errorList = new ArrayList<>();
        errorList.get(1);
    }
}
