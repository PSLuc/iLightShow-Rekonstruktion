package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends AbstractC0576j0 implements RandomAccess {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object[] f7902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Q0 f7903l;
    public Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7904j;

    static {
        Object[] objArr = new Object[0];
        f7902k = objArr;
        f7903l = new Q0(objArr, 0, false);
    }

    public Q0(Object[] objArr, int i, boolean z5) {
        super(z5);
        this.i = objArr;
        this.f7904j = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        c();
        if (i < 0 || i > (i3 = this.f7904j)) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("Index:", i, this.f7904j, ", Size:"));
        }
        int i6 = i + 1;
        Object[] objArr = this.i;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i, objArr, i6, i3 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.i, 0, objArr2, 0, i);
            System.arraycopy(this.i, i, objArr2, i6, this.f7904j - i);
            this.i = objArr2;
        }
        this.i[i] = obj;
        this.f7904j++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.C0
    public final /* bridge */ /* synthetic */ C0 b(int i) {
        if (i >= this.f7904j) {
            return new Q0(i == 0 ? f7902k : Arrays.copyOf(this.i, i), this.f7904j, true);
        }
        throw new IllegalArgumentException();
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f7904j) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("Index:", i, this.f7904j, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.i[i];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576j0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        d(i);
        Object[] objArr = this.i;
        Object obj = objArr[i];
        int i3 = this.f7904j;
        if (i < i3 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i3 - i) - 1);
        }
        this.f7904j--;
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
        return this.f7904j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.f7904j;
        int length = this.i.length;
        if (i == length) {
            this.i = Arrays.copyOf(this.i, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.i;
        int i3 = this.f7904j;
        this.f7904j = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
