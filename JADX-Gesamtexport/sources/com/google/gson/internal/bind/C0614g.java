package com.google.gson.internal.bind;

import java.io.Writer;

/* JADX INFO: renamed from: com.google.gson.internal.bind.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0614g extends Writer implements AutoCloseable {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new AssertionError();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw new AssertionError();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i3) {
        throw new AssertionError();
    }
}
