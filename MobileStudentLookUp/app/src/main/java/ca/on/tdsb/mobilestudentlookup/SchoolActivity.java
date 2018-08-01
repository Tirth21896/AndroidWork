package ca.on.tdsb.mobilestudentlookup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.View;

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        String[] Schools = {"Claude watson school of arts","Albert einstein school of science"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Schools);
        ListView schoolList = (ListView) findViewById(R.id.SchoolList);
        schoolList.setAdapter(adapter);

        schoolList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                        NavSearchPage();
                    }
                }

        );


    }



    public void NavSearchPage(){
        Intent searchPage = new Intent(this, SearchActivity.class);
        startActivity(searchPage);
    }
}
