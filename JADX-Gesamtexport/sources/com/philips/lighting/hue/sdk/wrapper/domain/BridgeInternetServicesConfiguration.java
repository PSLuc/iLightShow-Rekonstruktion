package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.clip.ConnectionState;

/* JADX INFO: loaded from: classes.dex */
public class BridgeInternetServicesConfiguration {
    private ConnectionState internet;
    private ConnectionState remoteAccess;
    private ConnectionState swUpdate;
    private ConnectionState time;

    public BridgeInternetServicesConfiguration() {
        ConnectionState connectionState = ConnectionState.NO_VALUE;
        this.internet = connectionState;
        this.remoteAccess = connectionState;
        this.time = connectionState;
        this.swUpdate = connectionState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeInternetServicesConfiguration bridgeInternetServicesConfiguration = (BridgeInternetServicesConfiguration) obj;
        ConnectionState connectionState = this.internet;
        return connectionState == bridgeInternetServicesConfiguration.internet && connectionState == bridgeInternetServicesConfiguration.remoteAccess && connectionState == bridgeInternetServicesConfiguration.time && connectionState == bridgeInternetServicesConfiguration.swUpdate;
    }

    public ConnectionState getInternet() {
        return this.internet;
    }

    public ConnectionState getRemoteAccess() {
        return this.remoteAccess;
    }

    public ConnectionState getSwUpdate() {
        return this.swUpdate;
    }

    public ConnectionState getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.swUpdate.getValue() + ((this.time.getValue() + ((this.remoteAccess.getValue() + ((this.internet.getValue() + 31) * 31)) * 31)) * 31);
    }
}
