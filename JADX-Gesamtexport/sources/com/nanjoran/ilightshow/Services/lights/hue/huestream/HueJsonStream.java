package com.nanjoran.ilightshow.Services.lights.hue.huestream;

/* JADX INFO: loaded from: classes.dex */
public final class HueJsonStream {
    public static final int $stable = 8;
    private Boolean active = Boolean.FALSE;
    private String owner;
    private String proxymode;
    private String proxynode;

    public final Boolean getActive() {
        return this.active;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getProxymode() {
        return this.proxymode;
    }

    public final String getProxynode() {
        return this.proxynode;
    }

    public final void setActive(Boolean bool) {
        this.active = bool;
    }

    public final void setOwner(String str) {
        this.owner = str;
    }

    public final void setProxymode(String str) {
        this.proxymode = str;
    }

    public final void setProxynode(String str) {
        this.proxynode = str;
    }
}
