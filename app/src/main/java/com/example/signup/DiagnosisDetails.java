package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DiagnosisDetails extends AppCompatActivity {
    Button bkashBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis_details);
        bkashBtn = (Button) findViewById(R.id.bkashBtn);

        bkashBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DiagnosisDetails.this,"Item Clicked",Toast.LENGTH_SHORT).show();
                Intent intentBkash = new Intent(DiagnosisDetails.this,bkashPage.class);
                startActivity(intentBkash);
            }
        });
    }
}