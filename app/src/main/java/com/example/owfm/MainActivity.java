package com.example.owfm;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.google.android.material.internal.ContextUtils.getActivity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.DocumentsContract;
import android.view.MenuItem;
import android.view.View;

import com.example.owfm.databinding.ActivityMainBinding;
import com.facebook.stetho.Stetho;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    NavController navController;

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setTheme(R.style.Theme_OWFM);
        View view = binding.getRoot();
        setupUi();
        setContentView(view);
    }

    private void setupUi() {

        //
        Stetho.initializeWithDefaults(this);
        //populate with home screen fragment on create
        /**loadFrag(new HomeScreenFragment(), 0);

        //
        BottomNavigationView bottomNavigationView;
        bottomNavigationView = binding.bottomNavigation;

        //on item listener to navigate to proper fragment when describing item is clicked
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        loadFrag(new HomeScreenFragment(), 0);
                          break;
                    case R.id.remedy_settings:
                        loadFrag(new RemedySettingsFragment(), 1);
                        break;
                    case R.id.application_settings:
                        loadFrag(new ApplicationSettingsFragment(), 2);
                        break;
                    case R.id.appLogs:
                        loadFrag(new AppLogsFragment(), 3);
                        break;
                }
                return true;
            }
        });**/
    }

    public void loadFrag(Fragment fragment, int flag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (flag == 0)
            fragmentTransaction.add(R.id.navHostFragment, fragment);
        else
            fragmentTransaction.replace(R.id.navHostFragment, fragment);

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
