package com.webakruti.collegemanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.webakruti.collegemanagement.Admin.AdminLandingActivity;
import com.webakruti.collegemanagement.Student.LoginActivity;


public class LandingActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearLayoutStudent;
    private LinearLayout linearLayoutAdmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        linearLayoutStudent = (LinearLayout)findViewById(R.id.linearLayoutStudent);
        linearLayoutAdmin = (LinearLayout)findViewById(R.id.linearLayoutAdmin);

        linearLayoutStudent.setOnClickListener(this);

        linearLayoutAdmin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.linearLayoutStudent:
                Intent intent = new Intent(LandingActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.linearLayoutAdmin:
                Intent intent1 = new Intent(LandingActivity.this, AdminLandingActivity.class);
                startActivity(intent1);
                finish();
                break;
        }

    }
}
