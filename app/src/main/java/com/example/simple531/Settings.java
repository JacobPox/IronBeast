package com.example.simple531;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


    }

    public void calculatePressTM(View view) {
        try {
            EditText max = findViewById(R.id.lift1EditText);
            double trainingMax = Double.parseDouble(max.getText().toString()) * .9;
            max.setText(String.valueOf(trainingMax));
        }catch (Exception e) {
            //do nothing, likely means that they entered no number yet.
        }
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
