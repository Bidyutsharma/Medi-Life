package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class medicineDetails extends AppCompatActivity {

    Button cartBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_details);
        cartBtn = (Button) findViewById(R.id.cartBtn);
        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(medicineDetails.this,"Medicine added",Toast.LENGTH_SHORT).show();
                Intent intentCart = new Intent(medicineDetails.this,Cartt.class);
                startActivity(intentCart);
            }
        });

    }
}