package com.example.sweproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class News extends AppCompatActivity {
    WebView WVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_news);

        WVN = findViewById(R.id.WVN);
        WVN.getSettings().setJavaScriptEnabled(true);
        WVN.setWebViewClient(new WebViewClient());
        WVN.loadUrl("https://www.cna.nl.ca/news/Default?label=Showing%20all%20news%20articles%20since%20the%20begining%20of%20time");

    }
}