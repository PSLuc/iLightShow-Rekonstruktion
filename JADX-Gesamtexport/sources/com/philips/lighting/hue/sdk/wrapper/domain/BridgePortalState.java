package com.philips.lighting.hue.sdk.wrapper.domain;

import com.philips.lighting.hue.sdk.wrapper.domain.clip.PortalConnectionState;

/* JADX INFO: loaded from: classes.dex */
public class BridgePortalState {
    private Boolean portalSignedOn = null;
    private Boolean portalIncoming = null;
    private Boolean portalOutgoing = null;
    private PortalConnectionState portalCommunication = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgePortalState bridgePortalState = (BridgePortalState) obj;
        if (this.portalCommunication != bridgePortalState.portalCommunication) {
            return false;
        }
        Boolean bool = this.portalIncoming;
        if (bool == null) {
            if (bridgePortalState.portalIncoming != null) {
                return false;
            }
        } else if (!bool.equals(bridgePortalState.portalIncoming)) {
            return false;
        }
        Boolean bool2 = this.portalOutgoing;
        if (bool2 == null) {
            if (bridgePortalState.portalOutgoing != null) {
                return false;
            }
        } else if (!bool2.equals(bridgePortalState.portalOutgoing)) {
            return false;
        }
        Boolean bool3 = this.portalSignedOn;
        if (bool3 == null) {
            if (bridgePortalState.portalSignedOn != null) {
                return false;
            }
        } else if (!bool3.equals(bridgePortalState.portalSignedOn)) {
            return false;
        }
        return true;
    }

    public PortalConnectionState getPortalCommunication() {
        return this.portalCommunication;
    }

    public Boolean getPortalIncoming() {
        return this.portalIncoming;
    }

    public Boolean getPortalOutgoing() {
        return this.portalOutgoing;
    }

    public Boolean getPortalSignedOn() {
        return this.portalSignedOn;
    }

    public int hashCode() {
        PortalConnectionState portalConnectionState = this.portalCommunication;
        int iHashCode = ((portalConnectionState == null ? 0 : portalConnectionState.hashCode()) + 31) * 31;
        Boolean bool = this.portalIncoming;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.portalOutgoing;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.portalSignedOn;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
