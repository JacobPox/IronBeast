package com.example.simple531;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Variants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variants);
    }

    public void settingsMenu(View view) {
        Intent myIntent = new Intent(Variants.this, Settings.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Variants.this.startActivity(myIntent);
    }
}
