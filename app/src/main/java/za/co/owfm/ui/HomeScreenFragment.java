package za.co.owfm.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentHomeScreenBinding;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class HomeScreenFragment extends Fragment {

    FragmentHomeScreenBinding binding;

    public HomeScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeScreenBinding.inflate(getLayoutInflater());
        assert container != null;
        container.clearDisappearingChildren();
        setupUi();
        return binding.getRoot();
    }

    private void setupUi() {
        //navigating to login screen
        binding.loginButton.setOnClickListener(view -> Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_loginFragment));

        // When device back button is pressed navigate to home screen
        OnBackPressedCallback callback = new OnBackPressedCallback(true /* enabled by default */) {
            @Override
            public void handleOnBackPressed() {
                Navigation.findNavController(requireView()).navigate(R.id.homeScreenFragment);
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), callback);

        //open side drawer when burger menu is clicked
        binding.sideDrawerIconImageView.setOnClickListener(
                view -> binding.drawerLayout.openDrawer(GravityCompat.START));

        //open side drawer when add scan button is clicked
        binding.scanOrderImageView.setOnClickListener(
                view -> binding.drawerLayout.openDrawer(GravityCompat.START));

        //navigate to new work order fragment
        binding.addOrderImageView.setOnClickListener(view ->
                Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_newWorkOrderFragment));

        //navigate to remedy settings fragment
        binding.userfullnameTextview.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_remedySettingsFragment));

        //open dialog to confirm work order deletion
        binding.deleteOrderImageView.setOnClickListener(view -> Dialog("You are about to delete the selected work order(s)."));

        //open dialog to confirm scan order deletion
        binding.deleteScanOrderImageView.setOnClickListener(view -> Dialog("You are about to delete the selected scan order(s)."));

        binding.sideDrawerNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.audit_item) {
                    Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_remedySettingsFragment);
                }
                return true;
            }
        });
        //
        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    Navigation.findNavController(requireView()).navigate(R.id.homeScreenFragment);
                    break;
                case R.id.remedy_settings:
                    Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_remedySettingsFragment);
                    break;
                case R.id.application_settings:
                    Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_applicationSettingsFragment);
                    break;
                case R.id.appLogs:
                    Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_appLogsFragment);
                    break;
            }
            return true;
        });

        //Navigate to selected fragment Item clicked
        binding.homeToolbar.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()) {
                case R.id.sync_scanner_values:
                    Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_syncScannerValuesFragment);
                    break;

                case R.id.sync_work_order_values:
                    Navigation.findNavController(requireView()).navigate(R.id.action_homeScreenFragment_to_syncWorkOrderValuesFragment);
                    break;

                case R.id.logout_item:
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("Logout");
                    builder.setMessage("Are you sure you want to logout?");
                    builder.setCancelable(true);
                    builder.setPositiveButton(
                            "Yes, logout", (dialogInterface, i) -> dialogInterface.dismiss());

                    builder.setNegativeButton("Cancel", ((dialogInterface, i) ->
                            dialogInterface.dismiss()));

                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                    break;
            }
            return true;
        });
    }

    //dialog function
    private void Dialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Delete Order");
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.setPositiveButton(
                "Yes", (dialogInterface, i) -> dialogInterface.dismiss());

        builder.setNegativeButton("No", ((dialogInterface, i) ->
                dialogInterface.dismiss()));

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}


