package com.webakruti.collegemanagement.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.webakruti.collegemanagement.LandingActivity;
import com.webakruti.collegemanagement.R;


public class AdminLoginActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editTextEmailid;
    private EditText editTextAdminPassword;
    private Button buttonAdminLogin;
    private LinearLayout linearLayoutGoToRegistration;

    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);


        imageViewBack = (ImageView)findViewById(R.id.imageViewBack);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AdminLoginActivity.this, AdminLandingActivity.class);
                startActivity(intent2);
                finish();
            }
        });

        linearLayoutGoToRegistration = (LinearLayout)findViewById(R.id.linearLayoutGoToRegistration);
        linearLayoutGoToRegistration.setOnClickListener(this);
        buttonAdminLogin = (Button)findViewById(R.id.buttonAdminLogin);
        buttonAdminLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.linearLayoutGoToRegistration :
                Intent intent = new Intent(AdminLoginActivity.this,AdminRegistrationActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.buttonAdminLogin :
                Intent intent1 = new Intent(AdminLoginActivity.this,AdminHomeActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }
}
