package com.example.abhinavbollam.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        ListView lv;
        String[] courses=getResources().getStringArray(R.array.monday);
        lv= (ListView)findViewById(R.id.mondaytable);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(Monday.this,android.R.layout.simple_list_item_1,courses);
        lv.setAdapter(adp);
    }
}
