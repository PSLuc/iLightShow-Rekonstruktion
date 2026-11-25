package com.spotify.protocol.types;

import B.AbstractC0013g0;
import S1.B;
import S1.EnumC0363z;
import S1.I;
import S1.InterfaceC0361x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
@B(EnumC0363z.i)
public class Uris implements Item {

    @I("uris")
    public final String[] uris;

    public Uris() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Uris) {
            return Arrays.equals(this.uris, ((Uris) obj).uris);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.uris);
    }

    public String toString() {
        return AbstractC0013g0.m(new StringBuilder("Uris{uris="), Arrays.toString(this.uris), '}');
    }

    public Uris(String[] strArr) {
        this.uris = strArr;
    }
}
