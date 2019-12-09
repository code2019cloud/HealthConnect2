package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProviderSigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providersignin);
    }

    public void patientSigninLinkClick(View view){
        //make database connection and validate
        //if success show homescreen or display msg and show the same screen
        Intent intent=new Intent(this, PatientHomeActivity.class);
        startActivity(intent);
    }

    public void patientSignupLinkClick(View view){
        Intent intent=new Intent(this, PatientSignupActivity.class);
        startActivity(intent);
    }
}
