package com.ironmansapps.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextFeild = (EditText) findViewById(R.id.UserName);
        EditText myTextFeild1 = (EditText) findViewById(R.id.Password);
        Log.i("info",myTextFeild.getText().toString());
        Log.i("info1",myTextFeild1.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
