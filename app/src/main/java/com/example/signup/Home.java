package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    Button blood;
    Button pharmacyBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        blood= (Button) findViewById(R.id.bloodBtn3);
        pharmacyBtn1 = (Button) findViewById(R.id.pharmacyBtn1);

        blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this,"Item Clicked",Toast.LENGTH_SHORT).show();
                Intent intentBlood = new Intent(Home.this,Diagnosis.class);
                startActivity(intentBlood);


            }
        });

        pharmacyBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this,"Item Clicked",Toast.LENGTH_SHORT).show();
                Intent intentmedicine = new Intent(Home.this,medicine.class);
                startActivity(intentmedicine);
            }
        });
    }
}