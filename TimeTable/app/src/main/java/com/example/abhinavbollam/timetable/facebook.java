package com.example.abhinavbollam.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class facebook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        // initialize
        WebView webView = (WebView) findViewById(R.id.webView2);

        // enable javascript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.facebook.com/groups/448465095325962/");

        //handling multiple link pages
        webView.setWebViewClient(new WebViewClient());

        //support zoom to complete page
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        //To set initial layout of 100 resolution of webpage
        webView.setInitialScale(1);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
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
