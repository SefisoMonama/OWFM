package za.co.owfm.Util.networkListener;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class DialogInternetReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String status = CheckInternet.getNetworkInfo(context);
        if (status.equals("connected")) {
            dialog("Connection Status: Online! ", context);
        } else if (status.equals("disconnected")) {
            dialog("Connection Status: Offline!", context);
        }
    }


    //dialog function
    private void dialog(String message, Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Connection Status");
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.setPositiveButton(
                "OK", (dialogInterface, i) -> dialogInterface.dismiss());

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
