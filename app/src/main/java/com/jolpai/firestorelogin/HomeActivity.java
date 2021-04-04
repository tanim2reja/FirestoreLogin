package com.jolpai.firestorelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.getSupportActionBar().setTitle("Home");

        TextView txtWelcome = findViewById(R.id.txtWelcome);
        txtWelcome.setText("Welcome to Home.");
    }
}