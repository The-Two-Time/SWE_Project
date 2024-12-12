package com.example.sweproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Phone extends AppCompatActivity {

    EditText editTextPhone;
    Button Call;
    Button Return;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_phone);

        editTextPhone = findViewById(R.id.editTextPhone);
        Call = findViewById(R.id.Call);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String phone = editTextPhone.getText().toString();

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:" + phone));
            startActivity(intent);
            }
            });
        Return = findViewById(R.id.Return);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Contacts.class);
                startActivity(intent);
            }
        });
    }
}