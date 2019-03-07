package com.webakruti.collegemanagement.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.webakruti.collegemanagement.R;


public class AdminRegistrationActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout linearLayoutGotoLogin;
    private Button buttonAdminRegistration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_admin);

        linearLayoutGotoLogin =(LinearLayout)findViewById(R.id.linearLayoutGotoLogin);
        linearLayoutGotoLogin.setOnClickListener(this);
        buttonAdminRegistration= (Button)findViewById(R.id.buttonAdminRegistration);
        buttonAdminRegistration.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.linearLayoutGotoLogin :
                Intent intent = new Intent(AdminRegistrationActivity.this,AdminLoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.buttonAdminRegistration :
                Intent intent1 = new Intent(AdminRegistrationActivity.this,AdminLoginActivity.class);
                startActivity(intent1);
                finish();
                break;
        }

    }
}
