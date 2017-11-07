package com.ironmansapps.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText amount = (EditText) findViewById(R.id.dollar);

        Double dollarAmt = Double.parseDouble(amount.getText().toString());
        Double Rupee = dollarAmt * 50;

        Toast.makeText(MainActivity.this,Rupee.toString(),Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
