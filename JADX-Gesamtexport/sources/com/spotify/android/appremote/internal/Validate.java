package com.spotify.android.appremote.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Validate {
    private Validate() {
    }

    public static <T> T checkNotNull(T t6) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException("The object is expected to be not null");
    }
}
