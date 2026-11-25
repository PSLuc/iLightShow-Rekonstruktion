package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum LightFunction {
    FUNCTIONAL("functional"),
    DECORATIVE("decorative"),
    MIXED("mixed"),
    UNKNOWN("unknownfunction");

    private String description;

    LightFunction(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
