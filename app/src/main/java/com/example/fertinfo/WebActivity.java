package com.example.fertinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {
    WebView myWebView;
    String url = "https://www.osakidetza.euskadi.eus/inicio/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

         myWebView = (WebView) findViewById(R.id.webview);
        //final WebSettings ajustesVisorWeb = myWebView.getSettings();
        //ajustesVisorWeb.setJavaScriptEnabled(true);


        myWebView.loadUrl(url);
    }
}
