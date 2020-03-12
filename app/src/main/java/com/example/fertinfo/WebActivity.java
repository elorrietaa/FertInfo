package com.example.fertinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {
    WebView myWebView;
    String url = "https://www.osakidetza.euskadi.eus/inicio/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pedir cita");

         myWebView = (WebView) findViewById(R.id.webview);
        //final WebSettings ajustesVisorWeb = myWebView.getSettings();
        //ajustesVisorWeb.setJavaScriptEnabled(true);


        myWebView.loadUrl(url);
    }public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            Intent i = new Intent(this,AnalisisActivity.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }

}
