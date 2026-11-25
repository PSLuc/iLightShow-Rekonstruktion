package com.spotify.protocol.client;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface PendingResult<T> {
    Result<T> await();

    Result<T> await(long j4, TimeUnit timeUnit);

    void cancel();

    boolean isCanceled();

    PendingResult<T> setErrorCallback(ErrorCallback errorCallback);
}
