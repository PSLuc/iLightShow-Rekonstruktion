package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class r extends D implements ListIterator {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0594t f7990k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC0594t abstractC0594t, int i) {
        super(0);
        int size = abstractC0594t.size();
        S1.h0.D(i, size);
        this.i = size;
        this.f7989j = i;
        this.f7990k = abstractC0594t;
    }

    public final Object a(int i) {
        return this.f7990k.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7989j < this.i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7989j > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7989j;
        this.f7989j = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7989j;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f7989j - 1;
        this.f7989j = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7989j - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
