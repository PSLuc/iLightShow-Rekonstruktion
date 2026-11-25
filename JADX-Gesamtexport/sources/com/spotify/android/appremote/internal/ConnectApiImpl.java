package com.spotify.android.appremote.internal;

import com.spotify.android.appremote.api.ConnectApi;
import com.spotify.protocol.AppProtocol;
import com.spotify.protocol.client.CallResult;
import com.spotify.protocol.client.RemoteClient;
import com.spotify.protocol.client.Subscription;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.VolumeState;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public class ConnectApiImpl implements ConnectApi {
    private final RemoteClient mClient;

    public ConnectApiImpl(RemoteClient remoteClient) {
        this.mClient = remoteClient;
    }

    @Override // com.spotify.android.appremote.api.ConnectApi
    @Nonnull
    public CallResult<Empty> connectDecreaseVolume() {
        return this.mClient.call(AppProtocol.CallUri.CONNECT_DECREASE_VOLUME, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.ConnectApi
    @Nonnull
    public CallResult<Empty> connectIncreaseVolume() {
        return this.mClient.call(AppProtocol.CallUri.CONNECT_INCREASE_VOLUME, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.ConnectApi
    @Nonnull
    public CallResult<Empty> connectSetVolume(float f6) {
        return this.mClient.call(AppProtocol.CallUri.CONNECT_SET_VOLUME, new VolumeState(f6), Empty.class);
    }

    @Override // com.spotify.android.appremote.api.ConnectApi
    @Nonnull
    public CallResult<Empty> connectSwitchToLocalDevice() {
        return this.mClient.call(AppProtocol.CallUri.CONNECT_SWITCH_TO_LOCAL_DEVICE, Empty.class);
    }

    @Override // com.spotify.android.appremote.api.ConnectApi
    @Nonnull
    public Subscription<VolumeState> subscribeToVolumeState() {
        return this.mClient.subscribe(AppProtocol.Topic.CONNECT_VOLUME_STATE, VolumeState.class);
    }
}
