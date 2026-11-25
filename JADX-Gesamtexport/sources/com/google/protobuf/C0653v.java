package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0653v extends AbstractC0634b implements InterfaceC0654w, RandomAccess {
    public final List i;

    static {
        new C0653v();
    }

    public C0653v(ArrayList arrayList) {
        super(true);
        this.i = arrayList;
    }

    @Override // com.google.protobuf.InterfaceC0654w
    public final List a() {
        return Collections.unmodifiableList(this.i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        c();
        this.i.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC0634b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.i.size(), collection);
    }

    @Override // com.google.protobuf.AbstractC0634b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC0651t
    public final InterfaceC0651t e(int i) {
        List list = this.i;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new C0653v(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC0654w
    public final void f(AbstractC0640h abstractC0640h) {
        c();
        this.i.add(abstractC0640h);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        List list = this.i;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof AbstractC0640h)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, AbstractC0652u.f8224a);
            G4.a aVar = g0.f8213a;
            if (g0.f8213a.x(bArr, 0, bArr.length)) {
                list.set(i, str2);
            }
            return str2;
        }
        AbstractC0640h abstractC0640h = (AbstractC0640h) obj;
        abstractC0640h.getClass();
        Charset charset = AbstractC0652u.f8224a;
        if (abstractC0640h.size() == 0) {
            str = "";
        } else {
            C0639g c0639g = (C0639g) abstractC0640h;
            str = new String(c0639g.f8212k, c0639g.j(), c0639g.size(), charset);
        }
        C0639g c0639g2 = (C0639g) abstractC0640h;
        int iJ = c0639g2.j();
        if (g0.f8213a.x(c0639g2.f8212k, iJ, c0639g2.size() + iJ)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // com.google.protobuf.InterfaceC0654w
    public final InterfaceC0654w h() {
        return this.f8196h ? new Z(this) : this;
    }

    @Override // com.google.protobuf.AbstractC0634b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = this.i.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC0640h)) {
            return new String((byte[]) objRemove, AbstractC0652u.f8224a);
        }
        AbstractC0640h abstractC0640h = (AbstractC0640h) objRemove;
        abstractC0640h.getClass();
        Charset charset = AbstractC0652u.f8224a;
        if (abstractC0640h.size() == 0) {
            return "";
        }
        C0639g c0639g = (C0639g) abstractC0640h;
        return new String(c0639g.f8212k, c0639g.j(), c0639g.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.i.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC0640h)) {
            return new String((byte[]) obj2, AbstractC0652u.f8224a);
        }
        AbstractC0640h abstractC0640h = (AbstractC0640h) obj2;
        abstractC0640h.getClass();
        Charset charset = AbstractC0652u.f8224a;
        if (abstractC0640h.size() == 0) {
            return "";
        }
        C0639g c0639g = (C0639g) abstractC0640h;
        return new String(c0639g.f8212k, c0639g.j(), c0639g.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i.size();
    }

    public C0653v() {
        super(false);
        this.i = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC0634b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof InterfaceC0654w) {
            collection = ((InterfaceC0654w) collection).a();
        }
        boolean zAddAll = this.i.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C0653v(int i) {
        this(new ArrayList(i));
    }
}
