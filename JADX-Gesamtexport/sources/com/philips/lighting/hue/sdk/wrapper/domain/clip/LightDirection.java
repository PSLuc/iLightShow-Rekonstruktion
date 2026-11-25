package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum LightDirection {
    OMNIDIRECTIONAL("omnidirectional"),
    UPWARDS("upwards"),
    DOWNWARDS("downwards"),
    HORIZONTAL("horizontal"),
    VERTICAL("vertical"),
    UNKNOWN("unknowndirection");

    private String description;

    LightDirection(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
