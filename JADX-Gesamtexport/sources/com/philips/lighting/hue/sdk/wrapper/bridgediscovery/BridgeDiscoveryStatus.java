package com.philips.lighting.hue.sdk.wrapper.bridgediscovery;

import java.util.EnumSet;
import java.util.Iterator;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public enum BridgeDiscoveryStatus {
    SUCCESS,
    CANCELED,
    BRIDGE_DISCOVERY_FAILURE,
    BRIDGE_NOT_FOUND;

    public final int flag = 1 << ordinal();

    BridgeDiscoveryStatus() {
    }

    @Nonnull
    public static EnumSet<BridgeDiscoveryStatus> enumSetFromValue(long j4) {
        EnumSet<BridgeDiscoveryStatus> enumSetNoneOf = EnumSet.noneOf(BridgeDiscoveryStatus.class);
        for (BridgeDiscoveryStatus bridgeDiscoveryStatus : EnumSet.allOf(BridgeDiscoveryStatus.class)) {
            if ((((long) bridgeDiscoveryStatus.flag) & j4) != 0) {
                enumSetNoneOf.add(bridgeDiscoveryStatus);
            }
        }
        return enumSetNoneOf;
    }

    public static long valueFromEnumSet(@Nonnull EnumSet<BridgeDiscoveryStatus> enumSet) {
        Iterator<BridgeDiscoveryStatus> it = enumSet.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 |= (long) it.next().flag;
        }
        return j4;
    }
}
