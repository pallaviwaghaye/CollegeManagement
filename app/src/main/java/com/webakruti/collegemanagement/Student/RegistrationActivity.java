package com.webakruti.collegemanagement.Student;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.webakruti.collegemanagement.R;


public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextFullname;
    private EditText editTextStudentId;
    private EditText editTextPassword;
    private Button buttonRegistration;
    private LinearLayout linearLayoutGotoLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextFullname = (EditText)findViewById(R.id.editTextFullname);
        editTextStudentId = (EditText)findViewById(R.id.editTextStudentId);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);

        buttonRegistration = (Button)findViewById(R.id.buttonRegistration);
        linearLayoutGotoLogin = (LinearLayout)findViewById(R.id.linearLayoutGotoLogin);

        buttonRegistration.setOnClickListener(this);
        linearLayoutGotoLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonRegistration :
                Intent intent = new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.linearLayoutGotoLogin :
                Intent intent1 = new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}
