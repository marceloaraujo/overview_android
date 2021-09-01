package com.example.overviewandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextSenha;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        setListeners();
    }

    private void initUI() {
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
        buttonLogin = findViewById(R.id.buttonLogin);
    }

    private boolean validateFields() {
        if(editTextEmail.getText().toString().isEmpty() ||
           editTextSenha.getText().toString().isEmpty()) {
            return false;
        }
        return true;
    }

    private void setListeners() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateFields()) {
                    //navegar para outra tela
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("LOGIN_EMAIL", editTextEmail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}