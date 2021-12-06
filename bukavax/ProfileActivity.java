package com.example.bukavax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void toCreateProfile(View v){
        // launch a new activity
        Intent i = new Intent(this, CreateProfile.class);
        startActivity(i);
    }
    public void toUserProfile(View v){
        // launch a new activity
        Intent i = new Intent(this, user_profile.class);
        startActivity(i);
    }
    public void toFavorites(View v){
        // launch a new activity
        Intent i = new Intent(this, Favorites.class);
        startActivity(i);
    }
    public void toResults(View v) {
        // launch a new activity
        Intent i = new Intent(this, ResultsActivity.class);
        startActivity(i);
    }
}