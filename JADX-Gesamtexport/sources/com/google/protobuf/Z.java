package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends AbstractList implements InterfaceC0654w, RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0653v f8195h;

    public Z(C0653v c0653v) {
        this.f8195h = c0653v;
    }

    @Override // com.google.protobuf.InterfaceC0654w
    public final List a() {
        return Collections.unmodifiableList(this.f8195h.i);
    }

    @Override // com.google.protobuf.InterfaceC0654w
    public final void f(AbstractC0640h abstractC0640h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f8195h.get(i);
    }

    @Override // com.google.protobuf.InterfaceC0654w
    public final InterfaceC0654w h() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        Y y2 = new Y();
        y2.f8194h = this.f8195h.iterator();
        return y2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        X x6 = new X();
        x6.f8193h = this.f8195h.listIterator(i);
        return x6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8195h.i.size();
    }
}
