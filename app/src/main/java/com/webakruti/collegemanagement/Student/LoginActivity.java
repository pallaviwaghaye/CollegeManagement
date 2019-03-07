package com.webakruti.collegemanagement.Student;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.webakruti.collegemanagement.LandingActivity;
import com.webakruti.collegemanagement.R;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextCollegeId;
    private EditText editTextStudentPassword;
    private Button buttonLogin;
    private LinearLayout linearLayoutGotoRegistration;
    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageViewBack = (ImageView)findViewById(R.id.imageViewBack);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(LoginActivity.this, LandingActivity.class);
                startActivity(intent2);
                finish();
            }
        });

        editTextCollegeId = (EditText)findViewById(R.id.editTextCollegeId);
        editTextStudentPassword = (EditText)findViewById(R.id.editTextStudentPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        linearLayoutGotoRegistration = (LinearLayout)findViewById(R.id.linearLayoutGotoRegistration);

        buttonLogin.setOnClickListener(this);
        linearLayoutGotoRegistration.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonLogin :
                Intent intent = new Intent(LoginActivity.this,HomeStudentActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.linearLayoutGotoRegistration :
                Intent intent1 = new Intent(LoginActivity.this,RegistrationActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}
