package za.co.owfm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.view.View;

import com.example.owfm.R;
import com.example.owfm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    NavController navController;
    BroadcastReceiver broadcastReceiver = null;


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
        setContentView(view);
    }
}
