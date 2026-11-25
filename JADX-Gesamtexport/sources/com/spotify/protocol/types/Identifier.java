package com.spotify.protocol.types;

import S1.I;
import S1.InterfaceC0361x;
import com.spotify.sdk.android.auth.AuthorizationClient;
import p012c.k;
import p110u3.c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0361x(ignoreUnknown = true)
public class Identifier implements Item {

    @c(AuthorizationClient.PlayStoreParams.ID)
    @I(AuthorizationClient.PlayStoreParams.ID)
    public final String id;

    private Identifier() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Identifier)) {
            return false;
        }
        Identifier identifier = (Identifier) obj;
        String str = this.id;
        if (str != null) {
            return str.equals(identifier.id);
        }
        return identifier.id == null;
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return k.u(new StringBuilder("Identifier{id='"), this.id, "'}");
    }

    public Identifier(String str) {
        this.id = str;
    }
}
