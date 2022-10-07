package com.example.owfm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.owfm.databinding.FragmentHomeScreenBinding;

public class HomeScreenFragment extends Fragment {

    FragmentHomeScreenBinding binding;

    public HomeScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHomeScreenBinding.inflate(getLayoutInflater());
        setupUi();
        return binding.getRoot();
    }

    private void setupUi(){
        //open side drawer when burger menu is clicked
        binding.sideDrawerIconImageView.setOnClickListener(
                view -> binding.drawerLayout.openDrawer(GravityCompat.START));

        //open side drawer when add scan button is clicked
        binding.scanOrderImageView.setOnClickListener(
                view -> binding.drawerLayout.openDrawer(GravityCompat.START));
        //navigate to new work order fragment
        binding.addOrderImageView.setOnClickListener(view->
                Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_newWorkOrderFragment));

        //navigate to remedy settings fragment
        binding.userfullnameTextview.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.action_homeScreenFragment_to_remedySettingsFragment));

        //open dialog to confirm work order deletion
        binding.deleteOrderImageView.setOnClickListener(view -> Dialog("You are about to delete the selected work order(s)."));

        //open dialog to confirm scan order deletion
        binding.deleteScanOrderImageView.setOnClickListener(view -> Dialog("You are about to delete the selected scan order(s)."));
    }

    //dialog function
    private void Dialog(String message){
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


