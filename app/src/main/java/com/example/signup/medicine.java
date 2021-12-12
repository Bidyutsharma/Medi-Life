package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class medicine extends AppCompatActivity {
    Button aceBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);
        aceBtn = (Button) findViewById(R.id.aceBtn);
        aceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(medicine.this,"Ace medicine added",Toast.LENGTH_SHORT).show();
                Intent intentMedi = new Intent(medicine.this,medicineDetails.class);
                startActivity(intentMedi);
            }
        });
    }
}