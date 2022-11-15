package za.co.owfm.UI;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.example.owfm.R;
import com.example.owfm.databinding.FragmentAuditBinding;
import za.co.owfm.Database.DatabaseClass;
import za.co.owfm.Entities.ScanIntegration;

public class AuditFragment extends Fragment {

    private CodeScanner mCodeScanner;


    private AlertDialog dialog;

    FragmentAuditBinding binding;

    public AuditFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAuditBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi() {
        //
        binding.saveScanButton.setOnClickListener(view ->{
                confirmDataLoad();
                saveDataLocally();
        });
        binding.closeButton.setOnClickListener(view -> Navigation.findNavController(requireView()).navigate(R.id.action_auditFragment_to_homeScreenFragment));

        //add back button drawable on toolbar
        binding.auditToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

          //navigate to home when toolbar back button is clicked
        binding.auditToolbar.setOnClickListener(view -> Navigation.findNavController(requireView()).navigate(R.id.action_auditFragment_to_homeScreenFragment));

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(getView()).navigate(R.id.homeScreenFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

        binding.serialNumberButton.setOnClickListener(view -> {
            binding.serialNumberEditText.requestFocus();
            InputMethodManager imm = (InputMethodManager) requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(binding.serialNumberEditText, InputMethodManager.SHOW_IMPLICIT);
            //serialNumberScan();
        });

        binding.tagNumberButton.setOnClickListener(view -> {
            binding.tagNumberEditText.requestFocus();
            InputMethodManager imm = (InputMethodManager) requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(binding.tagNumberEditText, InputMethodManager.SHOW_IMPLICIT);
            //tagNumberScan();
        });

    }


    /**private void serialNumberScan() {
       // binding.tagNumberScannerView.setVisibility(View.GONE);
        //binding.serialNumberScannerView.setVisibility(View.VISIBLE);
        CodeScannerView scannerView = binding.serialNumberScannerView;
        mCodeScanner = new CodeScanner(requireActivity(), scannerView);

            mCodeScanner.startPreview();
            mCodeScanner.setAutoFocusEnabled(true);


        mCodeScanner.setDecodeCallback(result -> requireActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String readableresult = result.getText();
                binding.serialNumberEditText.setText(readableresult);
                binding.serialNumberScannerView.setFrameVisible(false);
                mCodeScanner.releaseResources();
                mCodeScanner.stopPreview();
                binding.serialNumberScannerView.setVisibility(View.GONE);
            }
        }));

    }

    private void tagNumberScan() {
        binding.serialNumberScannerView.setVisibility(View.GONE);
        binding.tagNumberScannerView.setVisibility(View.VISIBLE);
        CodeScannerView scannerView = binding.tagNumberScannerView;
        mCodeScanner = new CodeScanner(requireActivity(), scannerView);


            mCodeScanner.startPreview();
            mCodeScanner.setAutoFocusEnabled(true);


        mCodeScanner.setDecodeCallback(result -> requireActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                String readableresult = result.getText();
                binding.tagNumberEditText.setText(readableresult);
                binding.tagNumberScannerView.setFrameVisible(false);
                mCodeScanner.releaseResources();
                binding.tagNumberScannerView.setVisibility(View.GONE);
            }
        }));
    }**/

    private void confirmDataLoad() {
        //declare
        String serialNumber = binding.serialNumberEditText.getText().toString().trim();
        String location = binding.locationEditText.getText().toString().trim();
        String tagNumber = binding.tagNumberEditText.getText().toString().trim();
        String ticketNumber = binding.ticketNumberEditText.getText().toString().trim();


        //Make sure fields are not empty
        if (serialNumber.isEmpty()) {
            binding.serialNumberEditText.setError("Serial number is a required field!");
            binding.serialNumberEditText.requestFocus();
        }

        if (location.isEmpty()) {
            binding.locationEditText.setError("location is a required field!");
            binding.locationEditText.requestFocus();
        }

        if (tagNumber.isEmpty()) {
            binding.tagNumberEditText.setError("Tag number is a require field!");
            binding.tagNumberEditText.requestFocus();
        }

        if(ticketNumber.isEmpty()){
            binding.ticketNumberEditText.setError("Ticket number is a required field!");
            binding.ticketNumberEditText.requestFocus();
        }
    }

    /** @Override
    public void onResume() {
        super.onResume();
        //mCodeScanner.startPreview();
    }

    @Override
    public void onPause() {
        mCodeScanner.releaseResources();
        super.onPause();
    }

    @Override
    public void onStop() {

        mCodeScanner.releaseResources();
        super.onStop();
    }

    @Override
    public void onDestroy() {
        mCodeScanner.releaseResources();
        super.onDestroy();
    }**/

   private void saveDataLocally() {
       //declare
       String ticketNumber = binding.ticketNumberEditText.getText().toString().trim();
       String serialNumber = binding.serialNumberEditText.getText().toString().trim();
       String tagNumber = binding.tagNumberEditText.getText().toString().trim();
       String location = binding.locationEditText.getText().toString().trim();
       String product = binding.productEditText.getText().toString();
       String notes = binding.notesEditText.getText().toString();

       if (!ticketNumber.isEmpty() && !serialNumber.isEmpty() && !tagNumber.isEmpty() && !location.isEmpty()) {

           DatabaseClass databaseClass = DatabaseClass.getDB(requireActivity());
           databaseClass.scanIntegrationDao().insertScanIntergration(
                   new ScanIntegration(ticketNumber, serialNumber, tagNumber, location, product, notes)
                   );

           Toast.makeText(getActivity(), "Audit Parent details successfully saved!", Toast.LENGTH_SHORT).show();
       }else{
           Toast.makeText(getActivity(), "fill in required filled first, before trying to save!", Toast.LENGTH_SHORT).show();
       }
   }

}
