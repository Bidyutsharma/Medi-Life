package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cartt extends AppCompatActivity {

    Button MediPayBtn;
    Button BuyMoreBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartt);
        MediPayBtn = (Button) findViewById(R.id.MediPayBtn);
        BuyMoreBtn = (Button) findViewById(R.id.BuyMoreBtn);

        MediPayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Cartt.this,"Calculate amount",Toast.LENGTH_SHORT).show();
                Intent intentCart = new Intent(Cartt.this,bkashPage.class);
                startActivity(intentCart);
            }
        });

        BuyMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Cartt.this,"Need More",Toast.LENGTH_SHORT).show();
                Intent intentBuy = new Intent(Cartt.this,medicine.class);
                startActivity(intentBuy);
            }
        });



    }
}