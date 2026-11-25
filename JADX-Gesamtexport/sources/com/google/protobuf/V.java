package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final V f8188e = new V(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f8190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f8191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8192d;

    public V(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f8189a = i;
        this.f8190b = iArr;
        this.f8191c = objArr;
        this.f8192d = z5;
    }

    public static V b() {
        return new V(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.f8190b;
        if (i > iArr.length) {
            int i3 = this.f8189a;
            int i6 = (i3 / 2) + i3;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f8190b = Arrays.copyOf(iArr, i);
            this.f8191c = Arrays.copyOf(this.f8191c, i);
        }
    }

    public final void c(int i, Object obj) {
        if (!this.f8192d) {
            throw new UnsupportedOperationException();
        }
        a(this.f8189a + 1);
        int[] iArr = this.f8190b;
        int i3 = this.f8189a;
        iArr[i3] = i;
        this.f8191c[i3] = obj;
        this.f8189a = i3 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof V)) {
            return false;
        }
        V v6 = (V) obj;
        int i = this.f8189a;
        if (i == v6.f8189a) {
            int[] iArr = this.f8190b;
            int[] iArr2 = v6.f8190b;
            for (int i3 = 0; i3 < i; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f8191c;
            Object[] objArr2 = v6.f8191c;
            int i6 = this.f8189a;
            for (int i7 = 0; i7 < i6; i7++) {
                if (objArr[i7].equals(objArr2[i7])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f8189a;
        int i3 = (527 + i) * 31;
        int[] iArr = this.f8190b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i3 + i6) * 31;
        Object[] objArr = this.f8191c;
        int i9 = this.f8189a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
