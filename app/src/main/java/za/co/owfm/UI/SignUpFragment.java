package za.co.owfm.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentSignUpBinding;

public class SignUpFragment extends Fragment {

    FragmentSignUpBinding binding;

    public SignUpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){
        //
        binding.advancedSettingsSwitch.setChecked(true);
        //
        binding.loginInsteadTextView.setOnClickListener(view -> {
            Navigation.findNavController(requireView()).navigate(R.id.action_signUpFragment_to_loginFragment);
        });

        //
        binding.backImageView.setOnClickListener(view -> {
            Navigation.findNavController(requireView()).navigate(R.id.action_signUpFragment_to_loginFragment);
        });

        //display or hide advanced settings with switch
        binding.advancedSettingsSwitch.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked) {
                displayAdvancedSettings();
                binding.loginPathEditText.requestFocus();
            } else {
                hideAdvancedSettings();
            }
        });
    }

    private void displayAdvancedSettings() {
        binding.advancedTextView.setVisibility(View.VISIBLE);
        binding.advancedHorizontalView.setVisibility(View.VISIBLE);
        binding.loginPathLinearLayout.setVisibility(View.VISIBLE);
        binding.logoutPathLinearLayout.setVisibility(View.VISIBLE);
        binding.versionPathLinearLayout.setVisibility(View.VISIBLE);
        binding.prefixLinearLayout.setVisibility(View.VISIBLE);
    }

    private void hideAdvancedSettings() {
        binding.advancedTextView.setVisibility(View.GONE);
        binding.advancedHorizontalView.setVisibility(View.GONE);
        binding.loginPathLinearLayout.setVisibility(View.GONE);
        binding.logoutPathLinearLayout.setVisibility(View.GONE);
        binding.versionPathLinearLayout.setVisibility(View.GONE);
        binding.prefixLinearLayout.setVisibility(View.GONE);
    }
}