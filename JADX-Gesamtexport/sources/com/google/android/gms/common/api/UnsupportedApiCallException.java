package com.google.android.gms.common.api;

import W2.c;

/* JADX INFO: loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f7780h;

    public UnsupportedApiCallException(c cVar) {
        this.f7780h = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7780h));
    }
}
