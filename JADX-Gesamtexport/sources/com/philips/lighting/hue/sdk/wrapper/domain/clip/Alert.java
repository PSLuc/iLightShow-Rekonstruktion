package com.philips.lighting.hue.sdk.wrapper.domain.clip;

/* JADX INFO: loaded from: classes.dex */
public enum Alert {
    NONE("none"),
    SELECT("select"),
    LSELECT("lselect");

    private String description;

    Alert(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
