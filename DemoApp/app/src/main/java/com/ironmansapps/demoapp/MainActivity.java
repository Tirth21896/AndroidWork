package com.ironmansapps.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    public void BtnClicked(View view){d

        EditText Name = (EditText) findViewById(R.id.Name);
        Log.i("Info", Name.getText().toString());
        Toast.makeText(MainActivity.this, "Hellow" + Name.getText().toString(), LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
