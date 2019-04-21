package com.example.testfullapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCal;
    Button btnCamera;
    Button btnAnim;
    Button btnSensor;
    Button btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCal = (Button) findViewById(R.id.btncal);
        btnCamera = (Button) findViewById(R.id.btnCamera);
        btnAnim = (Button) findViewById(R.id.btnAnim);
        btnSensor = (Button) findViewById(R.id.btnSensor);
        btnMap = (Button) findViewById(R.id.btnMap);



        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculator.class);
                startActivity(intent);
            }
        });

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, camera.class);
                startActivity(intent);
            }
        });

        btnAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Animations.class);
                startActivity(intent);
            }
        });

        btnSensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sensor.class);
                startActivity(intent);
            }
        });

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Map.class);
                startActivity(intent);
            }
        });
    }
}
