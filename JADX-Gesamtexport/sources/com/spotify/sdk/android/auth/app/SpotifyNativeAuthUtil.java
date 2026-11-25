package com.spotify.sdk.android.auth.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.IntentExtras;
import com.spotify.sdk.android.auth.LoginActivity;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class SpotifyNativeAuthUtil {
    private static final int PROTOCOL_VERSION = 1;
    private static final String SPOTIFY_AUTH_ACTIVITY_ACTION = "com.spotify.sso.action.START_AUTH_FLOW";
    private static final String SPOTIFY_PACKAGE_NAME = "com.spotify.music";
    private Activity mContextActivity;
    private AuthorizationRequest mRequest;
    private static final String[] SPOTIFY_PACKAGE_SUFFIXES = {".debug", ".canary", ".partners", ""};
    private static final String[] SPOTIFY_SIGNATURE_HASH = {"25a9b2d2745c098361edaa3b87936dc29a28e7f1", "80abdd17dcc4cb3a33815d354355bf87c9378624", "88df4d670ed5e01fc7b3eff13b63258628ff5a00", "d834ae340d1e854c5f4092722f9788216d9221e5", "1cbedd9e7345f64649bad2b493a20d9eea955352", "4b3d76a2de89033ea830f476a1f815692938e33b"};
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    public SpotifyNativeAuthUtil(Activity activity, AuthorizationRequest authorizationRequest) {
        this.mContextActivity = activity;
        this.mRequest = authorizationRequest;
    }

    private static String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b6 = bArr[i];
            int i3 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[(b6 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    private Intent createAuthActivityIntent() {
        Intent intentTryResolveActivity = null;
        for (String str : SPOTIFY_PACKAGE_SUFFIXES) {
            intentTryResolveActivity = tryResolveActivity(SPOTIFY_PACKAGE_NAME + str);
            if (intentTryResolveActivity != null) {
                return intentTryResolveActivity;
            }
        }
        return intentTryResolveActivity;
    }

    private static String sha1Hash(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            return bytesToHex(messageDigest.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private Intent tryResolveActivity(String str) {
        Intent intent = new Intent(SPOTIFY_AUTH_ACTIVITY_ACTION);
        intent.setPackage(str);
        ComponentName componentNameResolveActivity = intent.resolveActivity(this.mContextActivity.getPackageManager());
        if (componentNameResolveActivity != null && validateSignature(componentNameResolveActivity.getPackageName())) {
            return intent;
        }
        return null;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private boolean validateSignature(String str) {
        try {
            Signature[] signatureArr = this.mContextActivity.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String strSha1Hash = sha1Hash(signature.toCharsString());
                for (String str2 : SPOTIFY_SIGNATURE_HASH) {
                    if (str2.equals(strSha1Hash)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public boolean startAuthActivity() {
        Intent intentCreateAuthActivityIntent = createAuthActivityIntent();
        if (intentCreateAuthActivityIntent == null) {
            return false;
        }
        intentCreateAuthActivityIntent.putExtra(IntentExtras.KEY_VERSION, 1);
        intentCreateAuthActivityIntent.putExtra(IntentExtras.KEY_CLIENT_ID, this.mRequest.getClientId());
        intentCreateAuthActivityIntent.putExtra(IntentExtras.KEY_REDIRECT_URI, this.mRequest.getRedirectUri());
        intentCreateAuthActivityIntent.putExtra(IntentExtras.KEY_RESPONSE_TYPE, this.mRequest.getResponseType());
        intentCreateAuthActivityIntent.putExtra(IntentExtras.KEY_REQUESTED_SCOPES, this.mRequest.getScopes());
        intentCreateAuthActivityIntent.putExtra(IntentExtras.KEY_STATE, this.mRequest.getState());
        try {
            this.mContextActivity.startActivityForResult(intentCreateAuthActivityIntent, LoginActivity.REQUEST_CODE);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void stopAuthActivity() {
        this.mContextActivity.finishActivity(LoginActivity.REQUEST_CODE);
    }
}
