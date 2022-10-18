package com.example.owfm.ui;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.owfm.Database.DatabaseClass;
import com.example.owfm.Entities.Profile;
import com.example.owfm.R;
import com.example.owfm.databinding.FragmentRemedySettingsBinding;
import com.facebook.stetho.Stetho;

import java.util.ArrayList;
import java.util.Objects;

public class RemedySettingsFragment extends Fragment {

    FragmentRemedySettingsBinding binding;


    public RemedySettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentRemedySettingsBinding.inflate(getLayoutInflater());
        assert container != null;
        container.clearDisappearingChildren();
        setupUi();
        return binding.getRoot();
    }

    private void setupUi() {
        //
        Stetho.initializeWithDefaults(requireActivity());


        //declare
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();
        String server = binding.serverEditText.getText().toString().trim();
        String port = binding.portNumberEditText.getText().toString().trim();
        String protocol = binding.protocolEditText.getText().toString();
        String hostServer = binding.hostserverEditText.getText().toString();

        binding.saveSyncRemedySettingsButtons.setOnClickListener(view -> {

            //save data locally by calling appropriate defined functions
            confirmDataLoad();
            saveDataLocally();
            getLocalData();
        });

        //highlight current nav item
        binding.bottomNavigation.setSelectedItemId(R.id.remedy_settings);

        //add back button drawable on toolbar
        binding.remedySettingsToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        //navigate to home when toolbar back button is clicked
        binding.remedySettingsToolbar.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.homeScreenFragment));

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(requireView()).navigate(R.id.homeScreenFragment);
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
                    break;
                case R.id.application_settings:
                    Navigation.findNavController(getView()).navigate(R.id.action_remedySettingsFragment_to_applicationSettingsFragment);
                    break;
                case R.id.appLogs:
                    Navigation.findNavController(getView()).navigate(R.id.action_remedySettingsFragment_to_appLogsFragment);
                    break;
            }
            return true;
        });

    }

    private void confirmDataLoad() {
        //declare
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();
        String server = binding.serverEditText.getText().toString().trim();
        String port = binding.portNumberEditText.getText().toString().trim();
        String protocol = binding.protocolEditText.getText().toString();
        String hostServer = binding.hostserverEditText.getText().toString();


        //Make sure fields are not empty
        if (username.isEmpty()) {
            binding.usernameEditText.setError("Username is a required field.");
            binding.usernameEditText.requestFocus();
        }

        if (password.isEmpty()) {
            binding.passwordEditText.setError("password is a required field");
            binding.passwordEditText.requestFocus();
        }

        if (password.length() < 8) {
            binding.passwordEditText.setError("password cannot be less than 8 characters.");
            binding.passwordEditText.requestFocus();
        }

        if (server.isEmpty()) {
            binding.serverEditText.setError("Server number is a required field.");
            binding.serverEditText.requestFocus();
        }

        if (port.isEmpty()) {
            binding.portNumberEditText.setError("port number is a required field.");
            binding.portNumberEditText.requestFocus();
        }

        if (protocol.isEmpty()) {
            binding.protocolEditText.setError("protocol field is a required field.");
            binding.protocolEditText.requestFocus();
        }

        if (hostServer.isEmpty()) {
            binding.hostserverEditText.setError("Host server is a required field.");
            binding.hostserverEditText.requestFocus();
        }
    }

    private void saveDataLocally() {
        //declare
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();
        String server = binding.serverEditText.getText().toString().trim();
        String port = binding.portNumberEditText.getText().toString().trim();
        String protocol = binding.protocolEditText.getText().toString();
        String hostServer = binding.hostserverEditText.getText().toString();

        if (!username.isEmpty() && !password.isEmpty() && password.length() >= 8 && !port.isEmpty() && !server.isEmpty() && !protocol.isEmpty() && !hostServer.isEmpty()) {
            DatabaseClass databaseClass = DatabaseClass.getDB(requireActivity());
            databaseClass.dao().insertAllData(
                    new Profile(username, password, server, port, protocol, hostServer)
            );

            Toast.makeText(getActivity(), "Profile info successfully saved!", Toast.LENGTH_SHORT).show();
        }
    }

    private void getLocalData(){
        //declare
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();
        String server = binding.serverEditText.getText().toString().trim();
        String port = binding.portNumberEditText.getText().toString().trim();
        String protocol = binding.protocolEditText.getText().toString();
        String hostServer = binding.hostserverEditText.getText().toString();

        //check if data is correctly saved via logcat
        DatabaseClass databaseClass = DatabaseClass.getDB(requireActivity());
        ArrayList<Profile> profileInfo = (ArrayList<Profile>) databaseClass.dao().getAllData();

        for (int i = 0; i < profileInfo.size(); i++) {
            Log.d("Profile Sefiso", "id" + profileInfo.get(i).getKeys() + "Username" + profileInfo.get(i).getUsername() + "Password" + profileInfo.get(i).getPassword() + "Server" + profileInfo.get(i).getServer() + "Port" + profileInfo.get(i).getPort() + "Protocol" + profileInfo.get(i).getProtocol() + "Host Server" + profileInfo.get(i).getHostServer());
        }

    }
}

