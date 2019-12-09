package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LandingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingscreen);
    }

    public void patientLinkClick(View view) {
        Intent intent = new Intent(this, PatientSigninActivity.class);
        startActivity(intent);
    }

    public void providerLinkclick(View view) {
        Intent intent = new Intent(this, ProviderSigninActivity.class);
        startActivity(intent);
    }

}
