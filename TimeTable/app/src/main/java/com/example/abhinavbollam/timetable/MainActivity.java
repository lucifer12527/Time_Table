package com.example.abhinavbollam.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.abhinavbollam.timetable.R.styleable.MenuItem;

public class MainActivity extends AppCompatActivity {

    Button mon,tue,wed,thu,fri;
   TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mon= (Button) findViewById(R.id.monday);
        tue = (Button) findViewById(R.id.tuesday);
        wed = (Button) findViewById(R.id.wednesday);
        thu = (Button) findViewById(R.id.thursday);
        fri = (Button) findViewById(R.id.friday);
        tv= (TextView) findViewById(R.id.otherlinks);
        thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i=new Intent(getApplicationContext(),thurday.class);
            startActivity(i);
            }
        });
        fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),friday.class);
                startActivity(i);
            }
        });
        tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),tuesday.class);
                startActivity(i);
            }
        });
        wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),wednesday.class);
                startActivity(i);
            }
        });
        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),monday2.class);
                startActivity(i);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),links.class);
                startActivity(i);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu m){
        m.add(1,1,0,"Home");
        m.add(1,2,1,"Webmail");
        m.add(1,3,1,"facebook");
        m.add(1,4,1,"About");
        return true;
    }
    public boolean onOptionsItemSelected(android.view.MenuItem mi){
        switch(mi.getItemId()){
            case 1:
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                break;
            case 2:
                Intent i2=new Intent(getApplicationContext(),webmail.class);
                startActivity(i2);
                break;
            case 3:Intent i3=new Intent(getApplicationContext(),facebook.class);
                startActivity(i3);
                break;
            case 4:Intent i4= new Intent(getApplicationContext(),about.class);
                startActivity(i4);
                break;
        }
        return true;
    }
}
