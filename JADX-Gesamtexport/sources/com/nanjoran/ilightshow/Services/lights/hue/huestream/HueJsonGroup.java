package com.nanjoran.ilightshow.Services.lights.hue.huestream;

import E4.k;
import com.spotify.sdk.android.auth.AuthorizationClient;

/* JADX INFO: loaded from: classes.dex */
public final class HueJsonGroup {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: class, reason: not valid java name */
    private String f0class;
    public String id;
    private String[] lights;
    private String name;
    private HueJsonStream stream;
    private String type;

    public final String getClass() {
        return this.f0class;
    }

    public final String getId() {
        String str = this.id;
        if (str != null) {
            return str;
        }
        k.m(AuthorizationClient.PlayStoreParams.ID);
        throw null;
    }

    public final String[] getLights() {
        return this.lights;
    }

    public final String getName() {
        return this.name;
    }

    public final HueJsonStream getStream() {
        return this.stream;
    }

    public final String getType() {
        return this.type;
    }

    public final void setClass(String str) {
        this.f0class = str;
    }

    public final void setId(String str) {
        k.f("<set-?>", str);
        this.id = str;
    }

    public final void setLights(String[] strArr) {
        this.lights = strArr;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setStream(HueJsonStream hueJsonStream) {
        this.stream = hueJsonStream;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
