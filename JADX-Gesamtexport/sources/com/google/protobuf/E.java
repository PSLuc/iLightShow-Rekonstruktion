package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class E {
    public static D a(Object obj, Object obj2) {
        D d6 = (D) obj;
        D d7 = (D) obj2;
        if (!d7.isEmpty()) {
            if (!d6.f8154h) {
                if (d6.isEmpty()) {
                    d6 = new D();
                } else {
                    D d8 = new D(d6);
                    d8.f8154h = true;
                    d6 = d8;
                }
            }
            d6.a();
            if (!d7.isEmpty()) {
                d6.putAll(d7);
            }
        }
        return d6;
    }
}
