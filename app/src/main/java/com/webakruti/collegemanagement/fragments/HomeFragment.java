package com.webakruti.collegemanagement.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.webakruti.collegemanagement.R;
import com.webakruti.collegemanagement.Student.AcademicDetailsActivity;
import com.webakruti.collegemanagement.Student.AttendanceActivity;
import com.webakruti.collegemanagement.Student.ExamScheduleActivity;
import com.webakruti.collegemanagement.Student.MyProfileActivity;
import com.webakruti.collegemanagement.Student.ResultActivity;

public class HomeFragment extends Fragment implements View.OnClickListener{
   private  View rootView;
   private LinearLayout linearLayoutProfile;
   private LinearLayout  linearLayoutAcademicDetails;
   private LinearLayout linearLayoutAttendance;
   private LinearLayout linearLayoutExam;
   private LinearLayout  linearLayoutResult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        initViews();
        return rootView;
    }

    private void initViews() {
        linearLayoutProfile = (LinearLayout)rootView.findViewById(R.id.linearLayoutProfile);
        linearLayoutAcademicDetails = (LinearLayout)rootView.findViewById(R.id.linearLayoutAcademicDetails);
        linearLayoutAttendance = (LinearLayout)rootView.findViewById(R.id.linearLayoutAttendance);
        linearLayoutExam = (LinearLayout)rootView.findViewById(R.id.linearLayoutExam);
        linearLayoutResult = (LinearLayout)rootView.findViewById(R.id.linearLayoutResult);

        linearLayoutProfile.setOnClickListener(this);
        linearLayoutAcademicDetails.setOnClickListener(this);
        linearLayoutAttendance.setOnClickListener(this);
        linearLayoutExam.setOnClickListener(this);
        linearLayoutResult.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.linearLayoutProfile :
                Intent intent = new Intent(getActivity(), MyProfileActivity.class);
                startActivity(intent);
                break;
            case R.id.linearLayoutAcademicDetails :
                Intent intent1 = new Intent(getActivity(), AcademicDetailsActivity.class);
                startActivity(intent1);
                break;
            case R.id.linearLayoutAttendance :
                Intent intent2 = new Intent(getActivity(), AttendanceActivity.class);
                startActivity(intent2);
                break;
            case R.id.linearLayoutExam :
                Intent intent3 = new Intent(getActivity(), ExamScheduleActivity.class);
                startActivity(intent3);
                break;
            case R.id.linearLayoutResult :
                Intent intent4 = new Intent(getActivity(), ResultActivity.class);
                startActivity(intent4);
                break;

        }
    }
}
