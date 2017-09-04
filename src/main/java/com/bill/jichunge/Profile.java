package com.bill.jichunge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    WebView web;
    TextView text;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        web = (WebView) findViewById(R.id.webview);
        text = (TextView) findViewById(R.id.textV2);
        img = (ImageView) findViewById(R.id.imageV3);
        web.loadUrl("file:///android_asset/profile.html");

    }
}
