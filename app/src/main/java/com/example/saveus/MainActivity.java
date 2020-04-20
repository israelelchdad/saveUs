package com.example.saveus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.saveus.Activitys.Welcome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moveToWelcome();

    }

    private void moveToWelcome() {
        Intent goToWelcomActivity = new Intent(getApplicationContext(), Welcome.class);
        startActivity(goToWelcomActivity);
    }
}
