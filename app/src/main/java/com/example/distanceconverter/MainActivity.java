package com.example.distanceconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private Button B1;
    private Button B2;
    private EditText T1;
    private EditText T2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.miletokm);
        B2 = findViewById(R.id.kmtomile);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1 = findViewById(R.id.edmile);
                T2 = findViewById(R.id.edkm);
                double vMiles = Double.valueOf(T1.getText().toString());

                double vKm= vMiles/0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                T2.setText(formatVal.format(vKm));


            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                T1 = findViewById(R.id.edmile);
                T2 = findViewById(R.id.edkm);
                double vKm = Double.valueOf(T2.getText().toString());

                double vMiles= vKm*0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                T1.setText(formatVal.format(vMiles));


            }
        });
    }
}