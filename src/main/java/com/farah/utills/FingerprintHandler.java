package com.farah.utills;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;

import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;

@RequiresApi(api = Build.VERSION_CODES.M)
public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {
    private Context context;
    private String message;
    private boolean isSuccess;
    private Callback callback;

    public FingerprintHandler(Context mContext) {
        context = mContext;
        callback = (Callback) mContext;
    }

    public void startAuth(FingerprintManager manager, FingerprintManager.CryptoObject cryptoObject) {
        CancellationSignal cancellationSignal = new CancellationSignal();
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        manager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
    }

    @Override
    public void onAuthenticationError(int errMsgId, CharSequence errString) {
        this.isSuccess = false;
        this.message = "Fingerprint Authentication error\n" + errString;
    }

    @Override
    public void onAuthenticationHelp(int helpMsgId, CharSequence helpString) {
        isSuccess = false;
        this.message = "Fingerprint Authentication help\n" + helpString;
    }

    @Override
    public void onAuthenticationFailed() {
        this.isSuccess = false;
        this.message = "Fingerprint Authentication failed.";
        callback.onAuthenticationFailed();
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        this.isSuccess = true;
        this.message = "Fingerprint Authentication succeeded.";
        callback.onAuthenticationSucceeded(result);
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public interface Callback {
        void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result);
        void onAuthenticationFailed();
    }
}