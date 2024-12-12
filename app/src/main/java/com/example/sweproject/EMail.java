package com.example.sweproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EMail extends AppCompatActivity {

    Button Return;
    Button Send;
    EditText Target;
    EditText Subject;
    EditText Content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_email);
        Send = findViewById(R.id.Send);
        Return = findViewById(R.id.Return);
        Target = findViewById(R.id.Target);
        Subject = findViewById(R.id.Subject);
        Content = findViewById(R.id.Content);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Contacts.class);
                startActivity(intent);
            }
        });
        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject, content, target;
                subject = Subject.getText().toString();
                content = Content.getText().toString();
                target = Target.getText().toString();
                sendEmail(subject, content, target);
            }
        });
        }
        public void sendEmail(String Subject, String Content, String Target){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {Target});
            intent.putExtra(Intent.EXTRA_SUBJECT, new String[] {Subject});
            intent.putExtra(Intent.EXTRA_TEXT, new String[] {Content});
            intent.setType("message/rfc822");
            startActivity(Intent.createChooser(intent, "Choose an Email Client"));
    }
}