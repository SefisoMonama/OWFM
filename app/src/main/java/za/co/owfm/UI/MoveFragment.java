package za.co.owfm.UI;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentMoveBinding;

public class MoveFragment extends Fragment {

    FragmentMoveBinding binding;

    public MoveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMoveBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void setupUi() {
        //add back button drawable on toolbar
        binding.moveToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        //navigate to home when toolbar back button is clicked
        binding.moveToolbar.setOnClickListener(view -> Navigation.findNavController(requireView()).navigate(R.id.homeScreenFragment));

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(requireView()).navigate(R.id.homeScreenFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

    }
}