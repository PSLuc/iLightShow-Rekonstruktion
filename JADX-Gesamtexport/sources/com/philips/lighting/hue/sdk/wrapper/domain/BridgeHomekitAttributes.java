package com.philips.lighting.hue.sdk.wrapper.domain;

/* JADX INFO: loaded from: classes.dex */
public class BridgeHomekitAttributes {
    private Boolean resetPairing = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BridgeHomekitAttributes bridgeHomekitAttributes = (BridgeHomekitAttributes) obj;
        Boolean bool = this.resetPairing;
        if (bool == null) {
            if (bridgeHomekitAttributes.resetPairing != null) {
                return false;
            }
        } else if (!bool.equals(bridgeHomekitAttributes.resetPairing)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.resetPairing;
        return 31 + (bool == null ? 0 : bool.hashCode());
    }

    public void setResetPairing(Boolean bool) {
        this.resetPairing = bool;
    }

    public void setResetPairing(boolean z5) {
        this.resetPairing = new Boolean(z5);
    }
}
