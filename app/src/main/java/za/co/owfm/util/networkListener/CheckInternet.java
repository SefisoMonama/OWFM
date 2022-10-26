package za.co.owfm.util.networkListener;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.net.NetworkInterface;

import javax.security.auth.callback.Callback;

public class CheckInternet{

    public static String getNetworkInfo(Context context){
        String status = null;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null){
            status = "connected";
            return status;
        }else{
            status= "disconnected";
            return status;
        }
    }


}
