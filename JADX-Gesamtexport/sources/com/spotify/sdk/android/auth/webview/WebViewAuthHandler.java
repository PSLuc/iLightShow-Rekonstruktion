package com.spotify.sdk.android.auth.webview;

import android.app.Activity;
import com.spotify.sdk.android.auth.AuthorizationHandler;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* JADX INFO: loaded from: classes.dex */
public class WebViewAuthHandler implements AuthorizationHandler {
    private static String TAG = "WebViewAuthHandler";
    private AuthorizationHandler.OnCompleteListener mListener;
    private LoginDialog mLoginDialog;

    @Override // com.spotify.sdk.android.auth.AuthorizationHandler
    public void setOnCompleteListener(AuthorizationHandler.OnCompleteListener onCompleteListener) {
        this.mListener = onCompleteListener;
        LoginDialog loginDialog = this.mLoginDialog;
        if (loginDialog != null) {
            loginDialog.setOnCompleteListener(onCompleteListener);
        }
    }

    @Override // com.spotify.sdk.android.auth.AuthorizationHandler
    public boolean start(Activity activity, AuthorizationRequest authorizationRequest) {
        LoginDialog loginDialog = new LoginDialog(activity, authorizationRequest);
        this.mLoginDialog = loginDialog;
        loginDialog.setOnCompleteListener(this.mListener);
        this.mLoginDialog.show();
        return true;
    }

    @Override // com.spotify.sdk.android.auth.AuthorizationHandler
    public void stop() {
        LoginDialog loginDialog = this.mLoginDialog;
        if (loginDialog != null) {
            loginDialog.close();
            this.mLoginDialog = null;
        }
    }
}
