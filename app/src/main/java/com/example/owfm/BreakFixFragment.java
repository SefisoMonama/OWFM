package com.example.owfm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentBreakFixBinding;

public class BreakFixFragment extends Fragment {

    FragmentBreakFixBinding binding;

    public BreakFixFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBreakFixBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}