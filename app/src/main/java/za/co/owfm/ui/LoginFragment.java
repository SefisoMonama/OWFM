package za.co.owfm.ui;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import za.co.owfm.Entities.Profile;
import za.co.owfm.DAO.ProfileDao;
import za.co.owfm.Database.DatabaseClass;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentLoginBinding;

import za.co.owfm.login.ApiClient;
import za.co.owfm.login.LoginRequest;
import za.co.owfm.login.LoginResponse;
import za.co.owfm.util.Constants;
import za.co.owfm.util.networkListener.DialogInternetReceiver;
import za.co.owfm.util.networkListener.InternetReceiver;

import java.util.ArrayList;
import java.util.Objects;

public class LoginFragment extends Fragment {

    FragmentLoginBinding binding;
    BroadcastReceiver broadcastReceiver = null;

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

        // When device back button is pressed do nothing.
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {

            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

        //navigate to home screen
        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = binding.usernameEditText.getText().toString().trim();
                String password = binding.passwordEditText.getText().toString().trim();

                //Make sure fields are not empty
                if (username.isEmpty()) {
                    binding.usernameEditText.setError("Username is a required field.");
                    binding.usernameEditText.requestFocus();
                } else if (password.isEmpty()) {
                    binding.passwordEditText.setError("password is a required field");
                    binding.passwordEditText.requestFocus();
                } else {
                    binding.loginProgressBar.setVisibility(View.VISIBLE);
                    login();
                }
                //confirmDataLoad();
                //authenticateLoggingData();
            }
        });

        //
        binding.signUpTextView.setOnClickListener(view -> {
            Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_signUpFragment);
        });

        //Network listener
        binding.testConnectionFloatingActionButton.setOnClickListener(view -> {
            broadcastReceiver = new InternetReceiver();
            broadcastReceiver = new DialogInternetReceiver();
            internetStatus();
        });
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

        if (!username.isEmpty() && !password.isEmpty()) {
            final Handler handler = new Handler();
            handler.postDelayed(() -> binding.loginProgressBar.setVisibility(View.VISIBLE), 2000);
            handler.postDelayed(() -> binding.loginProgressBar.setVisibility(View.GONE), 2000);
            //handler.postDelayed(() -> Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_homeScreenFragment),2000);
        }

        //check if data is correctly saved via logcat
        /** DatabaseClass databaseClass = DatabaseClass.getDB(requireActivity());
         ArrayList<Profile> profileInfo = (ArrayList<Profile>) databaseClass.profileDao().getAllData();
         ProfileDao dao = databaseClass.profileDao();
         if (!username.isEmpty() && !password.isEmpty()) {
         for (int i = 0; i < profileInfo.size(); i++) {
         if (Objects.equals(dao.getAllData().get(i).getUsername(), username) && Objects.equals(dao.getAllData().get(i).getPassword(), password)) {
         Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_homeScreenFragment);
         } else {
         Toast.makeText(getActivity(), "Authentication Error!", Toast.LENGTH_SHORT).show();
         }
         }
         }**/
    }

    public void internetStatus() {
        requireActivity().registerReceiver(broadcastReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }

    @Override
    public void onPause() {
        super.onPause();
        requireActivity().unregisterReceiver(broadcastReceiver);
    }

    public void login() {
        String username = binding.usernameEditText.getText().toString().trim();
        String password = binding.passwordEditText.getText().toString().trim();

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        loginRequest.setPassword(password);

        Call<LoginResponse> loginResponseCall = ApiClient.getUserService().userLogin(loginRequest);
        loginResponseCall.enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    binding.loginProgressBar.setVisibility(View.GONE);
                    dialog("Login successful", " Successfully logged in!", "OK");
                } else {
                    binding.loginProgressBar.setVisibility(View.GONE);
                    dialog("Login Failure", "Login credentials didn't match any in our database - please make sure you entered the correct Username and Password", "OK");
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                dialog("Login Failure", "Login credentials didn't match any in our database - please make sure you entered the correct Username and Password", "OK");
            }
        });

    }

    private void dialog(String title, String message, String positiveButton) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.setPositiveButton(
                positiveButton, (dialogInterface, i) ->
                        dialogInterface.dismiss());

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}