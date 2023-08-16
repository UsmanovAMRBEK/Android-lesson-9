package com.example.android_lesson_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SingUp extends AppCompatActivity {

    EditText etFname;
    EditText etLname;
    EditText etEmail;
    EditText etPassword;
    AppCompatButton btnSingUpContinue;
    TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        initUI();
        onClicks();
    }
    private void initUI() {
        etFname = findViewById(R.id.et_fname);
        etLname = findViewById(R.id.et_lname);
        etEmail = findViewById(R.id.et_sp_email);
        etPassword = findViewById(R.id.et_sp_password);
        btnSingUpContinue = findViewById(R.id.btn_singup_continue);
        tvLogin = findViewById(R.id.tv_login);
    }
    private void onClicks() {
        btnSingUpContinue.setOnClickListener(view -> {
            Intent intent = new Intent(SingUp.this, Dashboard.class);
            intent.putExtra("user_fname", etFname.getText());
            intent.putExtra("user_lname", etLname.getText());
            intent.putExtra("user_email", etEmail.getText());
            intent.putExtra("user_password", etPassword.getText());
            startActivity(intent);
//            finish();
        });
        tvLogin.setOnClickListener(view -> {
            Intent intent = new Intent(SingUp.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}