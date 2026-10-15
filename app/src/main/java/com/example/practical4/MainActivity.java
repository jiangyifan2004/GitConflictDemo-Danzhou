package com.example.practical4;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the screen defined in activity_main.xml.
        setContentView(R.layout.activity_main);
    }
}
