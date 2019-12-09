package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PatientBookConfirmedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientbookconfirmed);
    }
    public void patientHomeClick(View view)
    {
        Intent intent=new Intent(this, PatientHomeActivity.class);
        startActivity(intent);
    }
    public void patientSearchClick(View view){
        Intent intent=new Intent(this, PatientSearchMainActivity.class);
        startActivity(intent);
    }
    public void patientProfileClick(View view)
    {
        Intent intent=new Intent(this, PatientProfileActivity.class);
        startActivity(intent);
    }/*
    public void patientHistoryClick(View view)
    {
        Intent intent=new Intent(this, PatientBookHistoryActivity.class);
        startActivity(intent);
    }

   */
}
