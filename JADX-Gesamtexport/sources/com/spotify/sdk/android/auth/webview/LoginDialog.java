package com.spotify.sdk.android.auth.webview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.spotify.sdk.android.auth.AuthorizationHandler;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.spotify.sdk.android.auth.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class LoginDialog extends Dialog {
    private static final int DEFAULT_THEME = 16973840;
    private static final int MAX_HEIGHT_DP = 640;
    private static final int MAX_WIDTH_DP = 400;
    private static final String TAG = "com.spotify.sdk.android.auth.webview.LoginDialog";
    private static final String WEBVIEW_URIS = "^(.+\\.facebook\\.com)|(accounts\\.spotify\\.com)$";
    private boolean mAttached;
    private AuthorizationHandler.OnCompleteListener mListener;
    private ProgressDialog mProgressDialog;
    private boolean mResultDelivered;
    private final Uri mUri;

    public LoginDialog(Activity activity, AuthorizationRequest authorizationRequest) {
        super(activity, 16973840);
        this.mUri = authorizationRequest.toUri();
    }

    public static void clearCookies(Context context) {
        WebViewUtils.clearFacebookCookies(context);
        WebViewUtils.clearCookiesForDomain(context, "spotify.com");
        WebViewUtils.clearCookiesForDomain(context, ".spotify.com");
        WebViewUtils.clearCookiesForDomain(context, "https://spotify.com");
        WebViewUtils.clearCookiesForDomain(context, "https://.spotify.com");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void createWebView(Uri uri) {
        internetPermissionGranted();
        final WebView webView = (WebView) findViewById(R.id.com_spotify_sdk_login_webview);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.com_spotify_sdk_login_webview_container);
        final String queryParameter = uri.getQueryParameter("redirect_uri");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        webView.setWebViewClient(new WebViewClient() { // from class: com.spotify.sdk.android.auth.webview.LoginDialog.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                if (LoginDialog.this.mAttached) {
                    LoginDialog.this.mProgressDialog.dismiss();
                }
                webView.setVisibility(0);
                linearLayout.setVisibility(0);
                super.onPageFinished(webView2, str);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                super.onPageStarted(webView2, str, bitmap);
                if (LoginDialog.this.mAttached) {
                    LoginDialog.this.mProgressDialog.show();
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView2, int i, String str, String str2) {
                super.onReceivedError(webView2, i, str, str2);
                LoginDialog.this.sendError(new Error(str + ", code: " + i + ", failing url: " + str2));
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                String str2 = queryParameter;
                Locale locale = Locale.ENGLISH;
                String lowerCase = str2.toLowerCase(locale);
                String lowerCase2 = str.toLowerCase(locale);
                Uri uri2 = Uri.parse(str);
                if (lowerCase2.startsWith(lowerCase)) {
                    LoginDialog.this.sendComplete(uri2);
                    return true;
                }
                if (uri2.getAuthority().matches(LoginDialog.WEBVIEW_URIS)) {
                    return false;
                }
                String str3 = String.format("Can't redirect due to mismatch. \nRequest redirect-uri: %s\nResponse redirect-uri: %s", queryParameter, uri2);
                String unused = LoginDialog.TAG;
                LoginDialog.this.sendError(new RuntimeException(str3));
                return true;
            }
        });
        webView.loadUrl(uri.toString());
    }

    private boolean internetPermissionGranted() {
        return getContext().getPackageManager().checkPermission("android.permission.INTERNET", getContext().getPackageName()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendComplete(Uri uri) {
        this.mResultDelivered = true;
        AuthorizationHandler.OnCompleteListener onCompleteListener = this.mListener;
        if (onCompleteListener != null) {
            onCompleteListener.onComplete(AuthorizationResponse.fromUri(uri));
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendError(Throwable th) {
        this.mResultDelivered = true;
        AuthorizationHandler.OnCompleteListener onCompleteListener = this.mListener;
        if (onCompleteListener != null) {
            onCompleteListener.onError(th);
        }
        close();
    }

    private void setLayoutSize() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f6 = displayMetrics.widthPixels;
        float f7 = displayMetrics.density;
        ((LinearLayout) findViewById(R.id.com_spotify_sdk_login_webview_container)).setLayoutParams(new FrameLayout.LayoutParams(f6 / f7 > 400.0f ? (int) (400.0f * f7) : -1, ((float) displayMetrics.heightPixels) / f7 > 640.0f ? (int) (f7 * 640.0f) : -1, 17));
    }

    public void close() {
        if (this.mAttached) {
            dismiss();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.mAttached = true;
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mResultDelivered = false;
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.mProgressDialog = progressDialog;
        progressDialog.setMessage(getContext().getString(R.string.com_spotify_sdk_login_progress));
        this.mProgressDialog.requestWindowFeature(1);
        this.mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.spotify.sdk.android.auth.webview.LoginDialog.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                LoginDialog.this.dismiss();
            }
        });
        requestWindowFeature(1);
        getWindow().setSoftInputMode(16);
        getWindow().setBackgroundDrawableResource(android.R.drawable.screen_background_dark_transparent);
        setContentView(R.layout.com_spotify_sdk_login_dialog);
        setLayoutSize();
        createWebView(this.mUri);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mAttached = false;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public void onStop() {
        AuthorizationHandler.OnCompleteListener onCompleteListener;
        if (!this.mResultDelivered && (onCompleteListener = this.mListener) != null) {
            onCompleteListener.onCancel();
        }
        this.mResultDelivered = true;
        this.mProgressDialog.dismiss();
        super.onStop();
    }

    public void setOnCompleteListener(AuthorizationHandler.OnCompleteListener onCompleteListener) {
        this.mListener = onCompleteListener;
    }

    public LoginDialog(Activity activity, int i, AuthorizationRequest authorizationRequest) {
        super(activity, i);
        this.mUri = authorizationRequest.toUri();
    }
}
