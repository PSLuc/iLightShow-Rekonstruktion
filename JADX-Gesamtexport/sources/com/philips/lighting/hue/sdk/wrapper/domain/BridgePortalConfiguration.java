package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.clip.PortalConnectionState;

/* JADX INFO: loaded from: classes.dex */
public class BridgePortalConfiguration {
    private Boolean portalServices = null;
    private PortalConnectionState portalConnection = null;
    private BridgePortalState bridgePortalState = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgePortalConfiguration bridgePortalConfiguration = (BridgePortalConfiguration) obj;
        BridgePortalState bridgePortalState = this.bridgePortalState;
        if (bridgePortalState == null) {
            if (bridgePortalConfiguration.bridgePortalState != null) {
                return false;
            }
        } else if (!bridgePortalState.equals(bridgePortalConfiguration.bridgePortalState)) {
            return false;
        }
        if (this.portalConnection != bridgePortalConfiguration.portalConnection) {
            return false;
        }
        Boolean bool = this.portalServices;
        if (bool == null) {
            if (bridgePortalConfiguration.portalServices != null) {
                return false;
            }
        } else if (!bool.equals(bridgePortalConfiguration.portalServices)) {
            return false;
        }
        return true;
    }

    public BridgePortalState getBridgePortalState() {
        return this.bridgePortalState;
    }

    public PortalConnectionState getPortalConnection() {
        return this.portalConnection;
    }

    public Boolean getPortalServices() {
        return this.portalServices;
    }

    public int hashCode() {
        BridgePortalState bridgePortalState = this.bridgePortalState;
        int iHashCode = ((bridgePortalState == null ? 0 : bridgePortalState.hashCode()) + 31) * 31;
        PortalConnectionState portalConnectionState = this.portalConnection;
        int iHashCode2 = (iHashCode + (portalConnectionState == null ? 0 : portalConnectionState.hashCode())) * 31;
        Boolean bool = this.portalServices;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public void setPortalServices(Boolean bool) {
        this.portalServices = bool;
    }

    public void setPortalServices(boolean z5) {
        this.portalServices = new Boolean(z5);
    }
}
