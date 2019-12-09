package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PatientSigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientsignin);
    }

    public void patientSigninLinkClick(View view) {
        //make database connection and validate
        //if success show homescreen or display error msg and show the same screen
        final EditText etusername = findViewById(R.id.edittext1);
        // final EditText etphoneno=findViewById(R.id.edittext2);
        final EditText etpassword = findViewById(R.id.edittext2);
        String username = etusername.getText().toString();
        String password = etpassword.getText().toString();
        if (username.equals("user") && password.equals("pass")) {
            Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, PatientHomeActivity.class);
            // Intent intent = new Intent(getApplicationContext(), PatientSearchMainActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Credentials", Toast.LENGTH_LONG).show();
        }
    }


    public void patientSignupLinkClick(View view){
        Intent intent=new Intent(this, PatientSignupActivity.class);
        startActivity(intent);
    }
}
