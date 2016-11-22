package com.example.wayde.a3055scouting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button to switch to pit scouting form
        Button goToPitScoutingForm = (Button) findViewById(R.id.pitNavButton);
        goToPitScoutingForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PitScoutingForm.class);
                startActivity(intent);
            }
        });

        //Button to switch to robot/competition scouting form
        Button goToRobotScoutingForm = (Button) findViewById(R.id.botNavButton);
        goToRobotScoutingForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RobotScoutingForm.class);
                startActivity(intent);
            }
        });
    }
}
