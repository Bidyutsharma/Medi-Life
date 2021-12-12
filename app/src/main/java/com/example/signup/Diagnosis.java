package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Diagnosis extends AppCompatActivity {
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        ok = (Button) findViewById(R.id.OkBtn);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Diagnosis.this,"Checking..",Toast.LENGTH_SHORT).show();
                Intent intentOk = new Intent(Diagnosis.this,DiagnosisDetails.class);
                startActivity(intentOk);
            }
        });
    }
}