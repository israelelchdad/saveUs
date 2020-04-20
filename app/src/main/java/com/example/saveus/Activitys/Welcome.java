package com.example.saveus.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.saveus.Fragments.OnBoarding1;
import com.example.saveus.Fragments.OnBoarding2;
import com.example.saveus.Fragments.OnBoarding3;
import com.example.saveus.R;

public class Welcome extends AppCompatActivity implements View.OnClickListener, OnBoarding1.OnFragmentInteractionListener {
    OnBoarding1 onBoarding1 = new OnBoarding1();
    OnBoarding2 onBoarding2 = new OnBoarding2();
    OnBoarding3 onBoarding3 = new OnBoarding3();
     Button moveToOnboarding1;
    Button moveToOnboarding2;
    Button moveToOnboarding3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        moveToFragment(new OnBoarding1());
        moveToOnboarding1= findViewById(R.id.f_boarding1_button);
        moveToOnboarding1.setOnClickListener(this);
        moveToOnboarding2= findViewById(R.id.f_boarding2_button);
        moveToOnboarding2.setOnClickListener(this);
        moveToOnboarding3= findViewById(R.id.f_boarding3_button);
        moveToOnboarding3.setOnClickListener(this);
    }

    private void moveToFragment(Fragment myfragment) {
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.Activity_welcom_fremlayot, myfragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction() {


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.f_boarding1_button:
                moveToFragment(onBoarding1);
                break;
            case R.id.f_boarding2_button:
                moveToFragment(onBoarding2);
                break;
            case R.id.f_boarding3_button:
                moveToFragment(onBoarding3);
                break;

        }

    }
}
