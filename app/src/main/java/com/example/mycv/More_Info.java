package com.example.mycv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.RelativeLayout;

public class More_Info extends AppCompatActivity {

    RelativeLayout rl_1,rl_2,rl_3,rl_4;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_info);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Vibrator vibrator = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        rl_1=(RelativeLayout) findViewById(R.id.rl_1);
        rl_2=(RelativeLayout) findViewById(R.id.rl_2);
        rl_3=(RelativeLayout) findViewById(R.id.rl_3);
        rl_4=(RelativeLayout) findViewById(R.id.rl_4);

        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.cv_frame, new Fragment_1()).commit();
            rl_1.setAlpha(1.0f);
            rl_2.setAlpha(0.4f);
            rl_3.setAlpha(0.4f);
            rl_4.setAlpha(0.4f);
        }


        rl_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Fragment_1());
                vibrator.vibrate(100);
                rl_1.setAlpha(1.0f);
                rl_2.setAlpha(0.4f);
                rl_3.setAlpha(0.4f);
                rl_4.setAlpha(0.4f);
            }
        });
        rl_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Fragment_2());
                vibrator.vibrate(100);
                rl_1.setAlpha(0.4f);
                rl_2.setAlpha(1.0f);
                rl_3.setAlpha(0.4f);
                rl_4.setAlpha(0.4f);
            }
        });

        rl_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Fragment_3());
                vibrator.vibrate(100);
                rl_1.setAlpha(0.4f);
                rl_2.setAlpha(0.4f);
                rl_3.setAlpha(1.0f);
                rl_4.setAlpha(0.4f);
            }
        });
        rl_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new Fragment_4());
                vibrator.vibrate(100);
                rl_1.setAlpha(0.4f);
                rl_2.setAlpha(0.4f);
                rl_3.setAlpha(0.4f);
                rl_4.setAlpha(1.0f);
            }
        });
    }


    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.cv_frame,fragment);
        fragmentTransaction.commit();
    }
    }