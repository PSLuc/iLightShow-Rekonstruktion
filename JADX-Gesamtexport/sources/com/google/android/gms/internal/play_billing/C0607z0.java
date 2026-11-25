package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0607z0 extends AbstractC0576j0 implements RandomAccess, B0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f8021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0607z0 f8022l;
    public int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8023j;

    static {
        int[] iArr = new int[0];
        f8021k = iArr;
        f8022l = new C0607z0(iArr, 0, false);
    }

    public C0607z0(int[] iArr, int i, boolean z5) {
        super(z5);
        this.i = iArr;
        this.f8023j = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i < 0 || i > (i3 = this.f8023j)) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("Index:", i, this.f8023j, ", Size:"));
        }
        int i6 = i + 1;
        int[] iArr = this.i;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i, iArr, i6, i3 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.i, 0, iArr2, 0, i);
            System.arraycopy(this.i, i, iArr2, i6, this.f8023j - i);
            this.i = iArr2;
        }
        this.i[i] = iIntValue;
        this.f8023j++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576j0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = D0.f7817a;
        collection.getClass();
        if (!(collection instanceof C0607z0)) {
            return super.addAll(collection);
        }
        C0607z0 c0607z0 = (C0607z0) collection;
        int i = c0607z0.f8023j;
        if (i == 0) {
            return false;
        }
        int i3 = this.f8023j;
        if (Integer.MAX_VALUE - i3 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i3 + i;
        int[] iArr = this.i;
        if (i6 > iArr.length) {
            this.i = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(c0607z0.i, 0, this.i, this.f8023j, c0607z0.f8023j);
        this.f8023j = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.C0
    public final /* bridge */ /* synthetic */ C0 b(int i) {
        if (i >= this.f8023j) {
            return new C0607z0(i == 0 ? f8021k : Arrays.copyOf(this.i, i), this.f8023j, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        i(i);
        return this.i[i];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576j0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0607z0)) {
            return super.equals(obj);
        }
        C0607z0 c0607z0 = (C0607z0) obj;
        if (this.f8023j != c0607z0.f8023j) {
            return false;
        }
        int[] iArr = c0607z0.i;
        for (int i = 0; i < this.f8023j; i++) {
            if (this.i[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i) {
        c();
        int i3 = this.f8023j;
        int length = this.i.length;
        if (i3 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.i, 0, iArr, 0, this.f8023j);
            this.i = iArr;
        }
        int[] iArr2 = this.i;
        int i6 = this.f8023j;
        this.f8023j = i6 + 1;
        iArr2[i6] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        i(i);
        return Integer.valueOf(this.i[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576j0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i3 = 0; i3 < this.f8023j; i3++) {
            i = (i * 31) + this.i[i3];
        }
        return i;
    }

    public final void i(int i) {
        if (i < 0 || i >= this.f8023j) {
            throw new IndexOutOfBoundsException(AbstractC0013g0.g("Index:", i, this.f8023j, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f8023j;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.i[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0576j0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        i(i);
        int[] iArr = this.i;
        int i3 = iArr[i];
        int i6 = this.f8023j;
        if (i < i6 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i6 - i) - 1);
        }
        this.f8023j--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i3) {
        c();
        if (i3 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.i;
        System.arraycopy(iArr, i3, iArr, i, this.f8023j - i3);
        this.f8023j -= i3 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        i(i);
        int[] iArr = this.i;
        int i3 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8023j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
