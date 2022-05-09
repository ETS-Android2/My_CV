package com.example.mycv;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class Fragment_2 extends Fragment {

    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_2, container, false);
        LottieAnimationView line = (LottieAnimationView) view.findViewById(R.id.line_anim_1);
        LottieAnimationView line_1 = (LottieAnimationView) view.findViewById(R.id.line_anim_2);
        LottieAnimationView line_2 = (LottieAnimationView) view.findViewById(R.id.line_anim_3);
        line.playAnimation();
        line.setMinAndMaxProgress(0.0f,0.9f);
        line_1.playAnimation();
        line_1.setMinAndMaxProgress(0.0f,0.75f);
        line_2.playAnimation();
        line_2.setMinAndMaxProgress(0.0f,0.65f);
        return view;
    }
}