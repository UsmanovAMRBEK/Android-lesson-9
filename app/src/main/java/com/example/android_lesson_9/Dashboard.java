package com.example.android_lesson_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initUI();
        getTextIntents();
    }
    private void initUI() {
        tvResult = findViewById(R.id.tv_result);
    }
    private void getTextIntents() {
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String email = "";
        String password = "";
        String firstName = "";
        String lastName = "";

        firstName = extras.getString("user_fname");
        lastName = extras.getString("user_lname");
        email = extras.getString("user_email");
        password = extras.getString("user_password");
        String res = "FirstName: " + firstName + "\nLastName: " + lastName + "\nPassword: " + password + "\nEmail: " + email;
        tvResult.setText(res);
    }

}