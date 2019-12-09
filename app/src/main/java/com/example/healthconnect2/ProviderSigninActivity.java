package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProviderSigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_providersignin);
    }

    public void patientSigninLinkClick(View view){
            //make database connection and validate
            //if success show homescreen or display error msg and show the same screen
            final EditText etusername = findViewById(R.id.prouser);
            final EditText etpassword = findViewById(R.id.propass);
            String prousername = etusername.getText().toString();
            String propassword = etpassword.getText().toString();
            if (prousername.equals("user") && propassword.equals("pass")) {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ProviderProfileActivity.class);
                // Intent intent = new Intent(getApplicationContext(), PatientSearchMainActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG).show();
            }
        }

    public void providerSignupLinkClick(View view){
        Intent intent=new Intent(this, PatientSignupActivity.class);
        startActivity(intent);
    }
}
