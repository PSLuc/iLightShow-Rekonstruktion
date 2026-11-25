package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p012c.k;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Artist implements Item {

    @c("name")
    @I("name")
    public final String name;

    @c("uri")
    @I("uri")
    public final String uri;

    private Artist() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        String str = this.name;
        if (str == null ? artist.name != null : !str.equals(artist.name)) {
            return false;
        }
        String str2 = this.uri;
        if (str2 != null) {
            return str2.equals(artist.uri);
        }
        return artist.uri == null;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uri;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Artist{name='");
        sb.append(this.name);
        sb.append("', uri='");
        return k.u(sb, this.uri, "'}");
    }

    public Artist(String str, String str2) {
        this.name = str;
        this.uri = str2;
    }
}
