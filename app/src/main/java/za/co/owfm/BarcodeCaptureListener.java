package za.co.owfm;

import androidx.annotation.NonNull;

import com.scandit.datacapture.barcode.capture.BarcodeCapture;
import com.scandit.datacapture.barcode.capture.BarcodeCaptureSession;
import com.scandit.datacapture.core.data.FrameData;

public interface BarcodeCaptureListener{


    void onObservationStarted(@NonNull BarcodeCapture barcodeCapture);

    void onObservationStopped(@NonNull BarcodeCapture barcodeCapture);

    void onBarcodeScanned(@NonNull BarcodeCapture barcodeCapture,
                          @NonNull BarcodeCaptureSession session,
                          FrameData data);

    void onSessionUpdated(@NonNull BarcodeCapture barcodeCapture,
                          @NonNull BarcodeCaptureSession session,
                          FrameData data);

}
