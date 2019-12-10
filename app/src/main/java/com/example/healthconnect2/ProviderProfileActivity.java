package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProviderProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providerprofile);
    }
    /*
    public void addDependentClick(View view){
        Intent intent=new Intent(this, PatientSigninActivity.class);
        startActivity(intent);
    }
    public void providerLinkclick(View view){
        Intent intent=new Intent(this, ProviderSigninActivity.class);
        startActivity(intent);
    }


    public void patientProfileedit(View view){
        Intent intent=new Intent(this, ProviderProfileActivity.class);
        startActivity(intent);
    }*/
    public void providerHomeClick(View view)
    {
        Intent intent=new Intent(this, LandingScreenActivity.class);
        startActivity(intent);
    }
    public void providerProfileClick(View view){
        Intent intent=new Intent(this, ProviderProfileActivity.class);
        startActivity(intent);
    }

    public void providerDrClick(View view)
    {
        Intent intent=new Intent(this, ProviderDrActivity.class);
        startActivity(intent);
    }
    public void providerSpecialityClick(View view)
    {
        Intent intent=new Intent(this, ProviderDepActivity.class);
        startActivity(intent);
    }
   /* public void patientHistoryClick(View view)
    {
        Intent intent=new Intent(this, PatientBookHistoryActivity.class);
        startActivity(intent);
    }

   */

}
