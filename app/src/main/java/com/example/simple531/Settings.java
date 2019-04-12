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

    /* May be implemented in the future for allowing one rep max to be converted to training max.

    public void calculatePressTM(View view) {
        try {
            EditText max = findViewById(R.id.lift1EditText);
            double trainingMax = Double.parseDouble(max.getText().toString()) * .9;
            max.setText(String.valueOf(trainingMax));
        }catch (Exception e) {
            //do nothing, likely means that they entered no number yet.
        }
    }

    */

    public void homeMenu(View view) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }

    public void programMenu(View view) {
        EditText pressMaxTM = findViewById(R.id.lift1EditText);
        EditText squatMaxTM = findViewById(R.id.lift2EditText);
        EditText benchMaxTM = findViewById(R.id.lift3EditText);
        EditText deadliftMaxTM = findViewById(R.id.lift4EditText);

        // Rounds down
        int pressMax = (int) Double.parseDouble(pressMaxTM.getText().toString());
        int squatMax = (int) Double.parseDouble(squatMaxTM.getText().toString());
        int benchMax = (int) Double.parseDouble(benchMaxTM.getText().toString());
        int deadliftMax = (int) Double.parseDouble(deadliftMaxTM.getText().toString());

        Intent myIntent = new Intent(this, Program.class);
        //myIntent.putExtra("allInfo", allInfo);
        startActivity(myIntent);
    }
}
