package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bkashPage extends AppCompatActivity {

    Button HomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bkash_page);
        HomeBtn = (Button) findViewById(R.id.HomeBtn);

        HomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(bkashPage.this,"homaepage",Toast.LENGTH_SHORT).show();
                Intent intentBack = new Intent(bkashPage.this,Homepage.class);
                startActivity(intentBack);
            }
        });
    }
}