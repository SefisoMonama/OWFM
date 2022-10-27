package za.co.owfm.util.networkListener;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentLoginBinding;

public class InternetReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String status = CheckInternet.getNetworkInfo(context);
        if (status.equals("connected")) {
           Toast.makeText(context, "Connected!", Toast.LENGTH_SHORT).show();
        } else if (status.equals("disconnected")) {
            Toast.makeText(context, "No internet connection!", Toast.LENGTH_SHORT).show();
        }
    }
}
