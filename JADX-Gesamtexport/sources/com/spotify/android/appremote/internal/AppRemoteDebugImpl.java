package com.spotify.android.appremote.internal;

import com.spotify.android.appremote.api.SpotifyAppRemote;
import com.spotify.protocol.client.Debug;

/* JADX INFO: loaded from: classes.dex */
public class AppRemoteDebugImpl implements Debug.Logger, Debug.Assertion {
    private static final String SPOTIFY_APP_REMOTE = "SPOTIFY_APP_REMOTE";

    @Override // com.spotify.protocol.client.Debug.Assertion
    public void assertTrue(boolean z5, String str) {
        if (SpotifyAppRemote.isDebugMode() && !z5) {
            throw new AssertionError(str);
        }
    }

    @Override // com.spotify.protocol.client.Debug.Logger
    public void d(Throwable th, String str, Object... objArr) {
        if (SpotifyAppRemote.isDebugMode()) {
            String.format(str, objArr);
        }
    }

    @Override // com.spotify.protocol.client.Debug.Logger
    public void e(Throwable th, String str, Object... objArr) {
        String.format(str, objArr);
    }

    @Override // com.spotify.protocol.client.Debug.Logger
    public void e(String str, Object... objArr) {
        e(null, str, objArr);
    }

    @Override // com.spotify.protocol.client.Debug.Logger
    public void d(String str, Object... objArr) {
        d(null, str, objArr);
    }
}
