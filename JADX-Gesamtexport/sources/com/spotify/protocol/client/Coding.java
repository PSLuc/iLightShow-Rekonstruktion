package com.spotify.protocol.client;

/* JADX INFO: loaded from: classes.dex */
public final class Coding {
    private Coding() {
    }

    public static <T> T checkNotNull(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException("Null is not allowed here.");
    }
}
