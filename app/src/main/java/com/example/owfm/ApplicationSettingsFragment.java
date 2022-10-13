package com.example.owfm;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentApplicationSettingsBinding;

public class ApplicationSettingsFragment extends Fragment {

    FragmentApplicationSettingsBinding binding;

    public ApplicationSettingsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentApplicationSettingsBinding.inflate(getLayoutInflater());
        assert container != null;
        container.clearDisappearingChildren();
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){
        binding.bottomNavigation.setSelectedItemId(R.id.application_settings);

            //add back button drawable on toolbar
            binding.applicationSettingsToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

            //navigate to home when toolbar back button is clicked
            binding.applicationSettingsToolbar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Navigation.findNavController(view).navigate(R.id.homeScreenFragment);
                }
            });

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(getView()).navigate(R.id.homeScreenFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

        //
        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    Navigation.findNavController(getView()).navigate(R.id.homeScreenFragment);
                    break;
                case R.id.remedy_settings:
                    Navigation.findNavController(getView()).navigate(R.id.action_applicationSettingsFragment_to_remedySettingsFragment);
                    break;
                case R.id.application_settings:
                    break;
                case R.id.appLogs:
                    Navigation.findNavController(getView()).navigate(R.id.action_applicationSettingsFragment_to_appLogsFragment);
                    break;
            }
            return true;
        });
    }

}