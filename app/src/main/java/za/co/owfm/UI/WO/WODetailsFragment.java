package za.co.owfm.UI.WO;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentWODeatailsBinding;

public class WODetailsFragment extends Fragment {

    FragmentWODeatailsBinding binding;

    public WODetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWODeatailsBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }


    private void setupUi(){

        //add back button drawable on toolbar
        binding.workOrderDetailsToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        //navigate to home when toolbar back button is clicked
        binding.workOrderDetailsToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_WODetailsFragment_to_homeScreenFragment);
            }
        });

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(requireView()).navigate(R.id.homeScreenFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);


        //navigate to signature screen
        binding.signatureImageView.setOnClickListener(view ->{
            Navigation.findNavController(requireView()).navigate(R.id.action_WODetailsFragment_to_WOSignatureFragment);
        });

        //navigate to pictures screen
        binding.cameraImageView.setOnClickListener(View ->{
            Navigation.findNavController(requireView()).navigate(R.id.action_WODetailsFragment_to_WOPictureFragment);
        });

        //navigate to assets screen
        binding.assetsImageView.setOnClickListener(View ->{
            Navigation.findNavController(requireView()).navigate(R.id.action_WODetailsFragment_to_WOAssetsFragment);
        });
    }
}