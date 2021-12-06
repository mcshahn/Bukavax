package com.example.bukavax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
    }
    public void toDetails(View v) {
        // launch a new activity
        Intent i = new Intent(this, Details.class);
        startActivity(i);
    }
}