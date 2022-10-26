package za.co.owfm.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import za.co.owfm.Entities.Profile;
import za.co.owfm.DAO.Dao;
import za.co.owfm.Database.DatabaseClass;

import com.example.owfm.R;

import za.co.owfm.util.networkListener.ConnectivityReceiver;

import java.util.ArrayList;
import java.util.Objects;

public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;
    BroadcastReceiver broadcastReceiver = null;
    private static LoginFragment mInstance;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }


    private void setupUi() {

        if(!isConnected()){
            binding.networkStatusTextView.setText("Disconnected");
            binding.networkStatusTextView.setBackgroundResource(R.color.red);
        }else{
            binding.networkStatusTextView.setText("Connected");
            binding.networkStatusTextView.setBackgroundResource(R.color.green);
        };

        mInstance= this;

        //navigate to home screen
        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmDataLoad();
                //authenticateLoggingData();
            }
        });

        binding.signUpTextView.setOnClickListener(view -> {
            Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_signUpFragment);
        });

        //Network listener
        broadcastReceiver = new ConnectivityReceiver();
        internetStatus();

    }

    private void confirmDataLoad() {
        //declare
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();

        //Make sure fields are not empty
        if (username.isEmpty()) {
            binding.usernameEditText.setError("Username is a required field.");
            binding.usernameEditText.requestFocus();
        }

        if (password.isEmpty()) {
            binding.passwordEditText.setError("password is a required field");
            binding.passwordEditText.requestFocus();
        }
    }

    private void authenticateLoggingData() {
        //declare
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();


        //check if data is correctly saved via logcat
        DatabaseClass databaseClass = DatabaseClass.getDB(requireActivity());
        ArrayList<Profile> profileInfo = (ArrayList<Profile>) databaseClass.dao().getAllData();
        Dao dao = databaseClass.dao();
        if (!username.isEmpty() && !password.isEmpty()) {
            for (int i = 0; i < profileInfo.size(); i++) {
                if (Objects.equals(dao.getAllData().get(i).getUsername(), username) && Objects.equals(dao.getAllData().get(i).getPassword(), password)) {
                    Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_homeScreenFragment);
                } else {
                    Toast.makeText(getActivity(), "Authentication Error!", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void internetStatus() {
        requireActivity().registerReceiver(broadcastReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }

    public boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null  && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}