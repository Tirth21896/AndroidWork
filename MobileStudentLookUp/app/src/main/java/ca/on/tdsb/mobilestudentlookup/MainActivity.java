package ca.on.tdsb.mobilestudentlookup;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void LoginClick(View view){
        Intent SchoolPage = new Intent(this, SchoolActivity.class);

        startActivity(SchoolPage);

    }


    public void LoginAsync(String Email, String Password) {


    }


}
