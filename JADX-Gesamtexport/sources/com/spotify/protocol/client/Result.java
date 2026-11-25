package com.spotify.protocol.client;

/* JADX INFO: loaded from: classes.dex */
public interface Result<T> {
    T getData();

    Throwable getError();

    String getErrorMessage();

    boolean isSuccessful();
}
