package za.co.owfm.util.networkListener;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.owfm.R;
import com.example.owfm.databinding.FragmentLoginBinding;

public class InternetReceiver extends BroadcastReceiver {

    //FragmentLoginBinding binding;

    @Override
    public void onReceive(Context context, Intent intent) {
        String status = CheckInternet.getNetworkInfo(context);
        if (status.equals("connected")) {
            //binding.networkStatusTextView.setText("Connected");
            //binding.networkStatusTextView.setBackgroundResource(R.color.green);
            Toast.makeText(context, "No internet connection!", Toast.LENGTH_SHORT).show();
        } else if (status.equals("disconnected")) {
            //binding.networkStatusTextView.setText("Disconnected");
            //binding.networkStatusTextView.setBackgroundResource(R.color.red);
            Toast.makeText(context, "No internet connection!", Toast.LENGTH_SHORT).show();
        }
    }
}
