package com.example.abhinavbollam.timetable;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class faculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        ListView lv;
        String[] fac=getResources().getStringArray(R.array.faculty);
        lv= (ListView) findViewById(R.id.facultytable);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(faculty.this,android.R.layout.simple_list_item_1,fac);
        lv.setAdapter(adp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 2:
                        Intent itel=new Intent();
                        itel.setAction(Intent.ACTION_CALL);
                        itel.setData(Uri.parse("tel:03612582502"));
                        startActivity(itel);
                        break;
                    case 3:
                        Intent emailIntent = new Intent(Intent.ACTION_SEND);
                        String[] TO1={"prabin@iitg.ernet.in"};
                        emailIntent.setData(Uri.parse("mailto:"));
                        emailIntent.setType("text/plain");
                        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO1);
                     //   emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback/queries");
                     //   emailIntent.putExtra(Intent.EXTRA_TEXT, "Write feedback/queries here");
                        startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                        break;
                    case 7:
                        Intent itel2=new Intent();
                        itel2.setAction(Intent.ACTION_CALL);
                        itel2.setData(Uri.parse("tel:03612582515"));
                        startActivity(itel2);
                        break;
                    case 8:
                        Intent emailIntent2 = new Intent(Intent.ACTION_SEND);
                        String[] TO2={"dass@iitg.ernet.in"};
                        emailIntent2.setData(Uri.parse("mailto:"));
                        emailIntent2.setType("text/plain");
                        emailIntent2.putExtra(Intent.EXTRA_EMAIL, TO2);
                   //     emailIntent2.putExtra(Intent.EXTRA_SUBJECT, "Feedback/queries");
                   //     emailIntent2.putExtra(Intent.EXTRA_TEXT, "Write feedback/queries here");
                        startActivity(Intent.createChooser(emailIntent2, "Send mail..."));
                        break;
                    case 12:
                        Intent itel3=new Intent();
                        itel3.setAction(Intent.ACTION_CALL);
                        itel3.setData(Uri.parse("tel:03612582509"));
                        startActivity(itel3);
                        break;
                    case 13:
                        Intent emailIntent3 = new Intent(Intent.ACTION_SEND);
                        String[] TO3={"harshal@iitg.ernet.in"};
                        emailIntent3.setData(Uri.parse("mailto:"));
                        emailIntent3.setType("text/plain");
                        emailIntent3.putExtra(Intent.EXTRA_EMAIL, TO3);
                      //  emailIntent3.putExtra(Intent.EXTRA_SUBJECT, "Feedback/queries");
                      //  emailIntent3.putExtra(Intent.EXTRA_TEXT, "Write  here");
                        startActivity(Intent.createChooser(emailIntent3, "Send mail..."));
                        break;
                    case 17:
                        Intent itel4=new Intent();
                        itel4.setAction(Intent.ACTION_CALL);
                        itel4.setData(Uri.parse("tel:03612583455"));
                        startActivity(itel4);
                        break;
                    case 18:
                        Intent emailIntent4 = new Intent(Intent.ACTION_SEND);
                        String[] TO4={"amitabh_c@iitg.ernet.in"};
                        emailIntent4.setData(Uri.parse("mailto:"));
                        emailIntent4.setType("text/plain");
                        emailIntent4.putExtra(Intent.EXTRA_EMAIL, TO4);
                      //  emailIntent4.putExtra(Intent.EXTRA_SUBJECT, "Feedback/queries");
                     //   emailIntent4.putExtra(Intent.EXTRA_TEXT, "Write Subject here");
                        startActivity(Intent.createChooser(emailIntent4, "Send mail..."));
                        break;
                }
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
