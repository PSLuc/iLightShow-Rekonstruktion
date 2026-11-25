package com.spotify.sdk.android.auth.app;

import android.app.Activity;
import com.spotify.sdk.android.auth.AuthorizationHandler;
import com.spotify.sdk.android.auth.AuthorizationRequest;

/* JADX INFO: loaded from: classes.dex */
public class SpotifyAuthHandler implements AuthorizationHandler {
    private SpotifyNativeAuthUtil mSpotifyNativeAuthUtil;

    @Override // com.spotify.sdk.android.auth.AuthorizationHandler
    public void setOnCompleteListener(AuthorizationHandler.OnCompleteListener onCompleteListener) {
    }

    @Override // com.spotify.sdk.android.auth.AuthorizationHandler
    public boolean start(Activity activity, AuthorizationRequest authorizationRequest) {
        SpotifyNativeAuthUtil spotifyNativeAuthUtil = new SpotifyNativeAuthUtil(activity, authorizationRequest);
        this.mSpotifyNativeAuthUtil = spotifyNativeAuthUtil;
        return spotifyNativeAuthUtil.startAuthActivity();
    }

    @Override // com.spotify.sdk.android.auth.AuthorizationHandler
    public void stop() {
        SpotifyNativeAuthUtil spotifyNativeAuthUtil = this.mSpotifyNativeAuthUtil;
        if (spotifyNativeAuthUtil != null) {
            spotifyNativeAuthUtil.stopAuthActivity();
        }
    }
}
