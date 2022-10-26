package za.co.owfm.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentWelcomeScreenBinding;

public class WelcomeScreenFragment extends Fragment {

    FragmentWelcomeScreenBinding binding;

    public WelcomeScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeScreenBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }


    private void setupUi(){
        SpannableString content = new SpannableString("Log In");
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        binding.loginTextView.setText(content);
    }
}