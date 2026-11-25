package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class PlayerContext implements Item {

    @c("subtitle")
    @I("subtitle")
    public final String subtitle;

    @c("title")
    @I("title")
    public final String title;

    @c("type")
    @I("type")
    public final String type;

    @c("uri")
    @I("uri")
    public final String uri;

    public PlayerContext() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerContext)) {
            return false;
        }
        PlayerContext playerContext = (PlayerContext) obj;
        String str = this.uri;
        if (str == null ? playerContext.uri != null : !str.equals(playerContext.uri)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null ? playerContext.title != null : !str2.equals(playerContext.title)) {
            return false;
        }
        String str3 = this.subtitle;
        if (str3 == null ? playerContext.subtitle != null : !str3.equals(playerContext.subtitle)) {
            return false;
        }
        String str4 = this.type;
        if (str4 != null) {
            return !str4.equals(playerContext.type);
        }
        return playerContext.type != null;
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.type;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlayerContext{, uri=");
        sb.append(this.uri);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", type=");
        return AbstractC0013g0.m(sb, this.type, '}');
    }

    public PlayerContext(String str, String str2, String str3, String str4) {
        this.uri = str;
        this.title = str2;
        this.subtitle = str3;
        this.type = str4;
    }
}
