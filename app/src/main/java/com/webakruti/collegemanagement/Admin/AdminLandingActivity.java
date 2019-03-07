package com.webakruti.collegemanagement.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.webakruti.collegemanagement.LandingActivity;
import com.webakruti.collegemanagement.R;


public class AdminLandingActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout linearLayoutPrincipal;
    private LinearLayout linearLayoutHOD;
    private LinearLayout linearLayoutFaculty;
    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_admin);

        imageViewBack = (ImageView)findViewById(R.id.imageViewBack);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AdminLandingActivity.this, LandingActivity.class);
                startActivity(intent2);
                finish();
            }
        });

        linearLayoutPrincipal = (LinearLayout)findViewById(R.id.linearLayoutPrincipal);
        linearLayoutHOD = (LinearLayout)findViewById(R.id.linearLayoutHOD);
        linearLayoutFaculty = (LinearLayout)findViewById(R.id.linearLayoutFaculty);

        linearLayoutPrincipal.setOnClickListener(this);
        linearLayoutHOD.setOnClickListener(this);
        linearLayoutFaculty.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.linearLayoutPrincipal :
                Intent intent = new Intent(AdminLandingActivity.this,AdminLoginActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.linearLayoutHOD :
                Intent intent1 = new Intent(AdminLandingActivity.this,AdminLoginActivity.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.linearLayoutFaculty :
                Intent intent2 = new Intent(AdminLandingActivity.this,AdminLoginActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
