package com.example.simple531;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void homeMenu(View view) {
        Intent myIntent = new Intent(Settings.this, MainActivity.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Settings.this.startActivity(myIntent);
    }

    public void liftsMenu(View view) {
        Intent myIntent = new Intent(Settings.this, Lifts.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Settings.this.startActivity(myIntent);
    }

    public void variantMenu(View view) {
        Intent myIntent = new Intent(Settings.this, Variants.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Settings.this.startActivity(myIntent);
    }

    public void jokersMenu(View view) {
        Intent myIntent = new Intent(Settings.this, Jokers.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Settings.this.startActivity(myIntent);
    }

    public void downSetsMenu(View view) {
        Intent myIntent = new Intent(Settings.this, DownSets.class);
        /* If I want to send information
        myIntent.putExtra("key", value); //Optional parameters
        */
        Settings.this.startActivity(myIntent);
    }
}
