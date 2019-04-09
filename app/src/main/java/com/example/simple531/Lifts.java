package com.example.simple531;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Lifts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifts);
    }

    public void settingsMenu(View view) {
        Intent myIntent = new Intent(Lifts.this, Settings.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Lifts.this.startActivity(myIntent);
    }
}
