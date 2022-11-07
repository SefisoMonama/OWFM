package za.co.owfm.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.IllegalFormatCodePointException;

public abstract class CameraPermissionActivity extends AppCompatActivity {

    private static final String CAMERA_PERMISSION = Manifest.permission.CAMERA;
    private static  final int CAMERA_PERMISSION_REQUEST = 0;

    private boolean permissionDeniedOnce = false;
    private  boolean paused = true;

    public abstract View onCreateView(LayoutInflater inflater, ViewGroup container,
                                      Bundle savedInstanceState);

    @Override
    protected void onPause() {
        super.onPause();
        paused = true;
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        paused = false;
    }

    protected boolean hasCameraPermission(){
        return (Build.VERSION.SDK_INT < Build.VERSION_CODES.M
        || checkSelfPermission(CAMERA_PERMISSION) == PackageManager.PERMISSION_GRANTED);
    }

    @TargetApi(Build.VERSION_CODES.M)
    protected void requestCameraPermission(){
        if(!hasCameraPermission()){
            if (!permissionDeniedOnce) {
                requestPermissions(new String[]{CAMERA_PERMISSION}, CAMERA_PERMISSION_REQUEST);
            }
        }else {
            onCameraPermissionGranted();
        }
    }

    public void onCameraPermissionGranted(){

    }

    public void onRequestPermissionResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults){
        if (requestCode == CAMERA_PERMISSION_REQUEST) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                permissionDeniedOnce = false;
                if (!paused) {
                    // Only call the function if not paused - camera should not be used otherwise.
                    onCameraPermissionGranted();
                }
            } else {
                // The user denied the permission - we are not going to ask again.
                permissionDeniedOnce = true;
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

}