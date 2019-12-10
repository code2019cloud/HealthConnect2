package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProviderDrActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providerdr);
    }

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
}
