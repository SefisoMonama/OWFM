package za.co.owfm.UI.WO;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentWOSignatureBinding;

public class WOSignatureFragment extends Fragment {

    FragmentWOSignatureBinding binding;

    public WOSignatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWOSignatureBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){
        //add back button drawable on toolbar
        binding.workOrderSignatureToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        //navigate to home when toolbar back button is clicked
        binding.workOrderSignatureToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_WOSignatureFragment_to_WODetailsFragment);
            }
        });

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(requireView()).navigate(R.id.WODetailsFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

        //clear signature from the view
        binding.clearSignatureButton.setOnClickListener(view ->{
                binding.signatureView.clearCanvas();
        });

        //load signature on the image view
        binding.saveUpdateSignatureButton.setOnClickListener(view ->{
            Bitmap signBitmap = binding.signatureView.getSignatureBitmap();
            if (signBitmap != null){
                binding.signatureImageView.setImageBitmap(signBitmap);
            }else {
                Toast.makeText(requireContext(), "Signature view empty!", Toast.LENGTH_SHORT).show();
            }
        });
    }




}