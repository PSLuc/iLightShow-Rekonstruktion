package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f8194h;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8194h.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f8194h.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
