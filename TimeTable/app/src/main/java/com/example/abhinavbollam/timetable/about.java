package com.example.abhinavbollam.timetable;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView tv= (TextView) findViewById(R.id.gamilabout);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] TO = {"abhinavbollam01@gmail.com"};

                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback/queries");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Write feedback/queries here");
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));

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
