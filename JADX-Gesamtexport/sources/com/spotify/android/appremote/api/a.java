package com.spotify.android.appremote.api;

import com.spotify.protocol.client.OnConnectionTerminatedListener;
import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.UserStatus;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnConnectionTerminatedListener, Subscription.EventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Connector.ConnectionListener f8545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpotifyAppRemote f8546b;

    public /* synthetic */ a(Connector.ConnectionListener connectionListener, SpotifyAppRemote spotifyAppRemote) {
        this.f8545a = connectionListener;
        this.f8546b = spotifyAppRemote;
    }

    @Override // com.spotify.protocol.client.OnConnectionTerminatedListener
    public void onConnectionTerminated() {
        LocalConnector.AnonymousClass1.lambda$onConnected$0(this.f8546b, this.f8545a);
    }

    @Override // com.spotify.protocol.client.Subscription.EventCallback
    public void onEvent(Object obj) {
        LocalConnector.AnonymousClass1.lambda$onConnected$1(this.f8545a, this.f8546b, (UserStatus) obj);
    }

    public /* synthetic */ a(SpotifyAppRemote spotifyAppRemote, Connector.ConnectionListener connectionListener) {
        this.f8546b = spotifyAppRemote;
        this.f8545a = connectionListener;
    }
}
