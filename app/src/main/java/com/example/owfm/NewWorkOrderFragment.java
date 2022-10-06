package com.example.owfm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.example.owfm.databinding.FragmentNewWorkOrderBinding;

public class NewWorkOrderFragment extends Fragment {

    FragmentNewWorkOrderBinding binding;

    public NewWorkOrderFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentNewWorkOrderBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){
        //add back button on toolbar
        binding.newWorkOrderToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        binding.newWorkOrderToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_newWorkOrderFragment_to_homeScreenFragment);
            }
        });
    }
}