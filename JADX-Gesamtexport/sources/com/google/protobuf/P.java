package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class P extends AbstractC0634b implements RandomAccess {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final P f8179k = new P(new Object[0], 0, false);
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8180j;

    public P(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.i = objArr;
        this.f8180j = i;
    }

    @Override // com.google.protobuf.AbstractC0634b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.f8180j;
        Object[] objArr = this.i;
        if (i == objArr.length) {
            this.i = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.i;
        int i3 = this.f8180j;
        this.f8180j = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f8180j) {
            StringBuilder sbV = p012c.k.v(i, "Index:", ", Size:");
            sbV.append(this.f8180j);
            throw new IndexOutOfBoundsException(sbV.toString());
        }
    }

    @Override // com.google.protobuf.InterfaceC0651t
    public final InterfaceC0651t e(int i) {
        if (i >= this.f8180j) {
            return new P(Arrays.copyOf(this.i, i), this.f8180j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.i[i];
    }

    @Override // com.google.protobuf.AbstractC0634b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        d(i);
        Object[] objArr = this.i;
        Object obj = objArr[i];
        int i3 = this.f8180j;
        if (i < i3 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i3 - i) - 1);
        }
        this.f8180j--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        d(i);
        Object[] objArr = this.i;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8180j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        c();
        if (i >= 0 && i <= (i3 = this.f8180j)) {
            Object[] objArr = this.i;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
            } else {
                Object[] objArr2 = new Object[((i3 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.i, i, objArr2, i + 1, this.f8180j - i);
                this.i = objArr2;
            }
            this.i[i] = obj;
            this.f8180j++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbV = p012c.k.v(i, "Index:", ", Size:");
        sbV.append(this.f8180j);
        throw new IndexOutOfBoundsException(sbV.toString());
    }
}
