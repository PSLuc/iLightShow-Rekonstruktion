package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum GamutType {
    A("A"),
    B("B"),
    C("C"),
    Other("other");

    private String description;

    GamutType(String str) {
        this.description = str;
    }

    public static GamutType fromDescription(String str) {
        for (GamutType gamutType : values()) {
            if (gamutType.getDescription() == str) {
                return gamutType;
            }
        }
        return Other;
    }

    public String getDescription() {
        return this.description;
    }
}
