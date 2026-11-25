package com.google.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class X implements ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListIterator f8193h;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f8193h.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8193h.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f8193h.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8193h.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f8193h.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8193h.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
