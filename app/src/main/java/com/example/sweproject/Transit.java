package com.example.sweproject;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Transit extends AppCompatActivity {

    WebView Metrobus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transit);

        Metrobus = findViewById(R.id.Metrobus);
        Metrobus.getSettings().setJavaScriptEnabled(true);
        Metrobus.setWebViewClient(new WebViewClient());
        Metrobus.loadUrl("https://metrobus.com/home/");


    }
}