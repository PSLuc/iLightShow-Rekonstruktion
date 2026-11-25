package com.philips.lighting.hue.sdk.wrapper.domain.resource;

/* JADX INFO: loaded from: classes.dex */
public enum ResourceLinkType {
    UNKNOWN(-1),
    NONE(0),
    LINK(1);

    private int value;

    ResourceLinkType(int i) {
        this.value = i;
    }

    public static ResourceLinkType fromValue(int i) {
        for (ResourceLinkType resourceLinkType : values()) {
            if (resourceLinkType.getValue() == i) {
                return resourceLinkType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.value;
    }
}
