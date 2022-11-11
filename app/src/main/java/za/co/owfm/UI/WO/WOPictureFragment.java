package za.co.owfm.UI.WO;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentWOPictureBinding;

public class WOPictureFragment extends Fragment {

    FragmentWOPictureBinding binding;

    public WOPictureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWOPictureBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi() {

    }
}