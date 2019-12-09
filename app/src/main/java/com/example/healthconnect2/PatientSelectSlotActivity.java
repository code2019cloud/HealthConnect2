package com.example.healthconnect2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PatientSelectSlotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientselectslot);
    }

  /*  public void hospitalLinkClick(View view){
        Intent intent=new Intent(this, PatientSearchMainActivity.class);
        startActivity(intent);
    }

    public void specialitiesLinkClick(View view){
        Intent intent=new Intent(this, PatientSelectDeptActivity.class);
        startActivity(intent);
    }
    public void doctorLinkClick(View view){
        Intent intent=new Intent(this, PatientSelectDoctorActivity.class);
        startActivity(intent);
    }
    */
    public void patientBookConfirmClick(View view){
        Intent intent=new Intent(this, PatientBookConfirmedActivity.class);
        startActivity(intent);
    }


}
