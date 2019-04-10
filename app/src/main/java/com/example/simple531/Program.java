package com.example.simple531;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Program extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }

    public void settingsMenu(View view) {
        Intent myIntent = new Intent(this, Settings.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        startActivity(myIntent);
    }
}
