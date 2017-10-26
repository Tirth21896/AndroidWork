package com.ironmansapps.textfeilddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void loginClicked(View view){

        EditText UserName = (EditText) findViewById(R.id.UserName);
        EditText Password = (EditText) findViewById(R.id.Password);
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
