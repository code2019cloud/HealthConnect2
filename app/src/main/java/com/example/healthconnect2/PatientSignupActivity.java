package com.example.healthconnect2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PatientSignupActivity extends AppCompatActivity {
    private EditText etDob;
    private Calendar myCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientsignup);

        myCalendar=Calendar.getInstance();
        final DatePickerDialog.OnDateSetListener date=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR,year);
                myCalendar.set(Calendar.MONTH,month);
                myCalendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                updateLabel();
            }
        };
        etDob=findViewById(R.id.signup_dob);
        etDob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(PatientSignupActivity.this,date,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show();

            }
        });
    }
    private void updateLabel(){
        String myFormat="dd/MM/yyyy";
        SimpleDateFormat sdf=new SimpleDateFormat(myFormat, Locale.US);
        etDob.setText(sdf.format(myCalendar.getTime()));
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

*/
    public void patientSignupSubmit(View view){
        final EditText etfirstname=findViewById(R.id.signup_fname);
        final EditText etlastname=findViewById(R.id.signup_lname);
        //final EditText etradio=findViewById(R.id.signup_radio);
        final EditText etdob=findViewById(R.id.signup_dob);
        final EditText ethname=findViewById(R.id.signup_housename);
        final EditText etstreetname=findViewById(R.id.signup_streetname);
       // final EditText etdist=findViewById(R.id.signup_spinner1);
        final EditText etpincode=findViewById(R.id.signup_pincode);
        final EditText etemail=findViewById(R.id.signup_email);
        final EditText etphoneno=findViewById(R.id.signup_phoneno);
        final EditText etpass=findViewById(R.id.signup_pass);
        final EditText depname=findViewById(R.id.signup_depname1);
        Intent intent=new Intent(this,PatientProfileActivity.class);
        startActivity(intent);
    }
    public void addDependOnClick(View view){
        /*make signup_depname1.visible
        int noofattempts;
         noofattempts++;
        if(noofattempts>3){
        Toast.makeText(getApplicationContext(),"You can add only 3dependents",Toast.LENGTH_LONG).show();
        }*/
        Button btn;
        final EditText etdep2=findViewById(R.id.signup_depname2);
        btn=(Button)findViewById(R.id.btnadddep1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etdep2.setVisibility(View.VISIBLE);
            }
        });


    }

}
