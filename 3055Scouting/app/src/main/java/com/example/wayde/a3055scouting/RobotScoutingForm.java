package com.example.wayde.a3055scouting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.Spinner;

public class RobotScoutingForm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot_scouting_form);

        //Bot Type Selection Spinner
        Spinner botTypeSelect = (Spinner)findViewById(R.id.botTypeSpinner);
        String[] botTypes = new String[]{"Choose Type", "Defense", "Spy", "Regular"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, botTypes);
        botTypeSelect.setAdapter(adapter);


    }
}
