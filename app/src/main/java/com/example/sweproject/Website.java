package com.example.sweproject;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Website extends AppCompatActivity {

    WebView Abu_Ghraib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_website);

        Abu_Ghraib = findViewById(R.id.Abu_Ghraib);
        Abu_Ghraib.getSettings().setJavaScriptEnabled(true);
        Abu_Ghraib.setWebViewClient(new WebViewClient());
        Abu_Ghraib.loadUrl("https://www.cna.nl.ca/");
    }
}