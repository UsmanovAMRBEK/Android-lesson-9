package com.example.android_lesson_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etEmail;
    EditText etPassword;
    AppCompatButton btnLogin;
    TextView tvSingUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        onClicks();
    }
    private void initUI() {
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        tvSingUp = findViewById(R.id.tv_singup);
    }

    private void onClicks() {
        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Dashboard.class);
            intent.putExtra("user_email", etEmail.getText());
            intent.putExtra("user_password", etPassword.getText());
            startActivity(intent);
//            finish();
        });
        tvSingUp.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SingUp.class);
            startActivity(intent);
            finish();
        });
    }
}