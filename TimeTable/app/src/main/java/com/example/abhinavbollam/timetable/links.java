package com.example.abhinavbollam.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class links extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);
        ImageView iv= (ImageView) findViewById(R.id.webmail);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),webmail.class);
                startActivity(i);
            }
        });
        ImageView iv2= (ImageView) findViewById(R.id.facebook);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),facebook.class);
                startActivity(i);
            }
        });
        ImageView iv3= (ImageView) findViewById(R.id.facultyimage);
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),faculty.class);
                startActivity(i);
            }
        });
        ImageView iv4= (ImageView) findViewById(R.id.books);
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),books.class);
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
