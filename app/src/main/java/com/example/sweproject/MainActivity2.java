package com.example.sweproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    Button LogOut;
    Button Transit;
    Button Programs;
    Button Schedule;
    Button Calender;
    Button News;
    Button Contacts;
    Button Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Transit = findViewById(R.id.Transit);
        Transit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Transit.class);
                startActivity(intent);
            }
        });

        Programs = findViewById(R.id.Programs);
        Programs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Programs.class);
                startActivity(intent);
            }
        });

        LogOut = findViewById(R.id.LogOut);
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Schedule = findViewById(R.id.Schedule);
        Schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Schedule.class);
                startActivity(intent);
            }
        });

        Calender = findViewById(R.id.Calender);
        Calender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calender.class);
                startActivity(intent);
            }
        });

        News = findViewById(R.id.News);
        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), News.class);
                startActivity(intent);
            }
        });

        Contacts = findViewById(R.id.Contacts);
        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Contacts.class);
                startActivity(intent);
            }
        });

        Info = findViewById(R.id.Info);
        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Info.class);
                startActivity(intent);
            }
        });

    }
}