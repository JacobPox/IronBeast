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
        //Bundle of bundles
        Bundle allInfo = new Bundle();
        //allInfo.putBundle("allInfo", maxes);
        Intent myIntent = new Intent(Settings.this, MainActivity.class);
        myIntent.putExtra("allInfo", allInfo);
        Settings.this.startActivity(myIntent);
    }

    public void programMenu(View view) {
        Intent myIntent = new Intent(this, Program.class);
        //myIntent.putExtra("allInfo", allInfo);
        startActivity(myIntent);
    }
}
