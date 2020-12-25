package com.example.distanceconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Animals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        ListView l = findViewById(R.id.listanimal);
        ArrayAdapter<CharSequence> adap = ArrayAdapter.createFromResource(this,R.array.aniarray,android.R.layout.simple_list_item_1);
        l.setAdapter(adap);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent , View view ,int position ,long id){
                String ms = getString(R.string.choice) +" "+ adap.getItem(position);
                Toast.makeText(getApplicationContext() , ms , Toast.LENGTH_SHORT).show();

            }
        });
    }
}