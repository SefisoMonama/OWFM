package com.example.owfm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.owfm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setTheme(R.style.Theme_OWFM);
        View view = binding.getRoot();
        setupUi();
        setContentView(view);
    }

    private void setupUi(){

    }
}