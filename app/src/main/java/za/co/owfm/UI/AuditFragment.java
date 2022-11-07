package za.co.owfm.UI;

import android.graphics.Camera;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.example.owfm.R;
import com.example.owfm.databinding.FragmentAuditBinding;
import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureListener;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.ui.DataCaptureView;

import java.util.List;
import java.util.Objects;

public class AuditFragment extends Fragment {

    private CodeScanner mCodeScanner;
    private DataCaptureContext dataCaptureContext;
    private BarcodeCapture barcodeCapture;
    private DataCaptureView dataCaptureView;
    private com.scandit.datacapture.core.source.Camera camera;


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
        binding.serialNumberScannerView.setOnClickListener(view -> {
            mCodeScanner.startPreview();
        });

        binding.tagNumberButton.setOnClickListener(view -> {
            binding.tagNumberEditText.setText("");
            mCodeScanner.startPreview();
        });
        //
        binding.saveScanButton.setOnClickListener(view ->
                confirmDataLoad());
        //add back button drawable on toolbar
        binding.auditToolbar.setNavigationIcon(R.drawable.ic_arrow_back);

        //navigate to home when toolbar back button is clicked
        binding.auditToolbar.setOnClickListener(view -> Navigation.findNavController(requireView()).navigate(R.id.action_auditFragment_to_homeScreenFragment));

        binding.closeButton.setOnClickListener(v -> Navigation.findNavController(requireView()).navigate(R.id.action_auditFragment_to_homeScreenFragment));

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                if (binding.serialNumberScannerView.getVisibility() == View.VISIBLE) {
                    binding.serialNumberScannerView.setVisibility(View.GONE);
                } else {
                    mCodeScanner.stopPreview();
                    Toast.makeText(requireContext(), "Use the close button to navigate back to home screen!", Toast.LENGTH_SHORT).show();
                }
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

       /** binding.serialNumberButton.setOnClickListener(view -> {
            binding.serialNumberEditText.setText("");
            serialNumberScan();
        });

        binding.tagNumberButton.setOnClickListener(view -> {
            binding.tagNumberEditText.setText("");
            tagNumberScan();
        });**/

    }


    private void serialNumberScan() {
        binding.tagNumberScannerView.setVisibility(View.GONE);
        binding.serialNumberScannerView.setVisibility(View.VISIBLE);
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
    }

    private void confirmDataLoad() {
        //declare
        String serialNumber = binding.serialNumberEditText.getText().toString().trim();
        String location = binding.locationEditText.getText().toString().trim();
        String tagNumber = binding.tagNumberEditText.getText().toString().trim();


        //Make sure fields are not empty
        if (serialNumber.isEmpty()) {
            binding.serialNumberEditText.setError("Username is a required field!");
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

}
