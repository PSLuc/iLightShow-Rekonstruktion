package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import p012c.k;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Uri implements Item {

    @c("uri")
    @I("uri")
    public final String uri;

    private Uri() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uri)) {
            return false;
        }
        Uri uri = (Uri) obj;
        String str = this.uri;
        if (str != null) {
            return str.equals(uri.uri);
        }
        return uri.uri == null;
    }

    public int hashCode() {
        String str = this.uri;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return k.u(new StringBuilder("Uri{uri='"), this.uri, "'}");
    }

    public Uri(String str) {
        this.uri = str;
    }
}
