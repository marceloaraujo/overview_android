package com.example.overviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initUI();
        getParameters();
    }


    private void initUI() {
        textViewEmail = findViewById(R.id.textViewEmail);
    }

    private void getParameters() {
        String email = getIntent().getStringExtra("LOGIN_EMAIL");
        textViewEmail.setText(email);
    }
}
