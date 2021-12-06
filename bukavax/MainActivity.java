package com.example.bukavax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bukavax.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void disable(View v) {

        findViewById(R.id.start_button).setEnabled(false);
//        myView.setEnabled(false);
//        Button button = ((Button) (findViewById(R.id.start_button)).setText("New Disabled"));
//        button.setText("New Disabled");
        /*
        v.setEnabled(false);
        Log.d("success", "Button Disabled");
        //type cast view to button to change text
        Button button = (Button)  v;
        button.setText("Disabled");

         */

        //access objects by ids --> use R.id to use button name
        //Button b = (Button)findViewById(R.id.startpg_start_button);
    }
    public void toWelcomePage(View v){
        setContentView(R.layout.welcome_page);
    }
    public void toUsernamePage(View v){
        setContentView(R.layout.username_page);
    }
//    public void handleText(View v){
//        EditText t = findViewById(R.id.Username_Text);
//        String input = t.getText().toString();
//        ((TextView) findViewById(R.id.password_text)).setText(input);
//        //make alert (popup)
//        Toast.makeText(this, "Alert", Toast.LENGTH_LONG).show();
////        Log.d("info", input);
//    }
    public void toLogin(View v){
        // launch a new activity
        Intent i = new Intent(this, LoginTemp.class);
        startActivity(i);
    }







}