package za.co.owfm.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentAuditBinding;

public class AuditFragment extends Fragment {

    FragmentAuditBinding binding;

    public AuditFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAuditBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}