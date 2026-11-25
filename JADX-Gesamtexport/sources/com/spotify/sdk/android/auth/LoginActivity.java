package com.spotify.sdk.android.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class LoginActivity extends Activity implements AuthorizationClient.AuthorizationClientListener {
    static final String EXTRA_AUTH_REQUEST = "EXTRA_AUTH_REQUEST";
    static final String EXTRA_AUTH_RESPONSE = "EXTRA_AUTH_RESPONSE";
    static final String EXTRA_ERROR = "ERROR";
    static final String EXTRA_REPLY = "REPLY";
    private static final String NO_CALLER_ERROR = "Can't use LoginActivity with a null caller. Possible reasons: calling activity has a singleInstance mode or LoginActivity is in a singleInstance/singleTask mode";
    private static final String NO_REQUEST_ERROR = "No authorization request";
    public static final int REQUEST_CODE = 1138;
    public static final String REQUEST_KEY = "request";
    public static final String RESPONSE_KEY = "response";
    static final String RESPONSE_TYPE_CODE = "code";
    static final String RESPONSE_TYPE_TOKEN = "token";
    private static final int RESULT_ERROR = -2;
    private static final String TAG = "com.spotify.sdk.android.auth.LoginActivity";
    private AuthorizationClient mAuthorizationClient = new AuthorizationClient(this);

    public static Intent getAuthIntent(Activity activity, AuthorizationRequest authorizationRequest) {
        if (activity == null || authorizationRequest == null) {
            throw new IllegalArgumentException("Context activity or request can't be null");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(REQUEST_KEY, authorizationRequest);
        Intent intent = new Intent(activity, (Class<?>) LoginActivity.class);
        intent.putExtra(EXTRA_AUTH_REQUEST, bundle);
        return intent;
    }

    private AuthorizationRequest getRequestFromIntent() {
        Bundle bundleExtra = getIntent().getBundleExtra(EXTRA_AUTH_REQUEST);
        if (bundleExtra == null) {
            return null;
        }
        return (AuthorizationRequest) bundleExtra.getParcelable(REQUEST_KEY);
    }

    public static AuthorizationResponse getResponseFromIntent(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra(EXTRA_AUTH_RESPONSE)) == null) {
            return null;
        }
        return (AuthorizationResponse) bundleExtra.getParcelable(RESPONSE_KEY);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i3, Intent intent) {
        super.onActivityResult(i, i3, intent);
        if (i == 1138) {
            AuthorizationResponse.Builder builder = new AuthorizationResponse.Builder();
            if (i3 == RESULT_ERROR) {
                builder.setType(AuthorizationResponse.Type.ERROR);
                String stringExtra = intent == null ? "Invalid message format" : intent.getStringExtra(EXTRA_ERROR);
                if (stringExtra == null) {
                    stringExtra = "Unknown error";
                }
                builder.setError(stringExtra);
            } else if (i3 == -1) {
                Bundle bundle = (Bundle) intent.getParcelableExtra(EXTRA_REPLY);
                if (bundle == null) {
                    builder.setType(AuthorizationResponse.Type.ERROR);
                    builder.setError("Missing response data");
                } else {
                    String string = bundle.getString(IntentExtras.KEY_RESPONSE_TYPE, "unknown");
                    builder.setState(bundle.getString(IntentExtras.KEY_STATE, null));
                    string.getClass();
                    if (string.equals("code")) {
                        String string2 = bundle.getString(IntentExtras.KEY_AUTHORIZATION_CODE);
                        builder.setType(AuthorizationResponse.Type.CODE);
                        builder.setCode(string2);
                    } else if (string.equals(RESPONSE_TYPE_TOKEN)) {
                        String string3 = bundle.getString(IntentExtras.KEY_ACCESS_TOKEN);
                        int i6 = bundle.getInt(IntentExtras.KEY_EXPIRES_IN);
                        builder.setType(AuthorizationResponse.Type.TOKEN);
                        builder.setAccessToken(string3);
                        builder.setExpiresIn(i6);
                    } else {
                        builder.setType(AuthorizationResponse.Type.UNKNOWN);
                    }
                }
            } else {
                builder.setType(AuthorizationResponse.Type.EMPTY);
            }
            this.mAuthorizationClient.setOnCompleteListener(this);
            this.mAuthorizationClient.complete(builder.build());
        }
    }

    @Override // com.spotify.sdk.android.auth.AuthorizationClient.AuthorizationClientListener
    public void onClientCancelled() {
        setResult(0);
    }

    @Override // com.spotify.sdk.android.auth.AuthorizationClient.AuthorizationClientListener
    public void onClientComplete(AuthorizationResponse authorizationResponse) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESPONSE_KEY, authorizationResponse);
        intent.putExtra(EXTRA_AUTH_RESPONSE, bundle);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.com_spotify_sdk_login_activity);
        AuthorizationRequest requestFromIntent = getRequestFromIntent();
        this.mAuthorizationClient.setOnCompleteListener(this);
        if (getCallingActivity() == null) {
            finish();
            return;
        }
        if (requestFromIntent == null) {
            setResult(0);
            finish();
        } else if (bundle == null) {
            String string = requestFromIntent.toUri().toString();
            StringBuilder sb = new StringBuilder("Spotify Auth starting with the request [");
            sb.append(string);
            sb.append("]");
            this.mAuthorizationClient.authorize(requestFromIntent);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.mAuthorizationClient.cancel();
        this.mAuthorizationClient.setOnCompleteListener(null);
        super.onDestroy();
    }
}
