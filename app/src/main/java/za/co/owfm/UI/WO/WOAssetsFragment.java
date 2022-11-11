package za.co.owfm.UI.WO;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentWOAssetsBinding;

public class WOAssetsFragment extends Fragment {

    FragmentWOAssetsBinding binding;

    public WOAssetsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWOAssetsBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){

    }
}