package ca.on.tdsb.mobilestudentlookup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String[] Students = {"Tirth Patel","Michael Overall","Mayank Patel","Nandi Dave"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Students);
        ListView studentList = (ListView) findViewById(R.id.StudentList);

        studentList.setAdapter(adapter);

        studentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                NavProfilePage();
            }
        });


    }

    public void NavProfilePage(){
        Intent profilePage = new Intent(this, ProfileActivity.class);
        startActivity(profilePage);

    }
}
