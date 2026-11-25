package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.I;
import S1.InterfaceC0361x;
import java.util.Arrays;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class UriWithOptionExtras implements Item {

    @c("options")
    @I("options")
    public final String[] options;

    @c("uri")
    @I("uri")
    public final String uri;

    public UriWithOptionExtras() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UriWithOptionExtras)) {
            return false;
        }
        UriWithOptionExtras uriWithOptionExtras = (UriWithOptionExtras) obj;
        return this.uri.equals(uriWithOptionExtras.uri) && Arrays.equals(this.options, uriWithOptionExtras.options);
    }

    public int hashCode() {
        return (this.uri.hashCode() * 31) + Arrays.hashCode(this.options);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UriWithOptionExtras{uri='");
        sb.append(this.uri);
        sb.append("', options=");
        return AbstractC0013g0.m(sb, Arrays.toString(this.options), '}');
    }

    public UriWithOptionExtras(String str, String[] strArr) {
        this.uri = str;
        this.options = strArr;
    }
}
