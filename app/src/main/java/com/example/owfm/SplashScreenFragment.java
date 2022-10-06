package com.example.owfm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentSplashScreenBinding;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SplashScreenFragment extends Fragment {

    FragmentSplashScreenBinding binding;

    public SplashScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSplashScreenBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){
        //navigate to home screen
        getFragmentManager().beginTransaction().replace(R.id.splashScreenFragment, new Fragment()).commit();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                assert getFragmentManager() != null;
                getFragmentManager().beginTransaction()
                        .replace(R.id.splashScreenFragment, new HomeScreenFragment()).commit();
            }
        };
    }
}