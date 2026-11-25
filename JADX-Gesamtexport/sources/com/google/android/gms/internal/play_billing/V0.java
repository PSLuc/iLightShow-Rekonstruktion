package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class V0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final V0 f7918f = new V0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f7920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f7921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7922d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7923e;

    public V0(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f7919a = i;
        this.f7920b = iArr;
        this.f7921c = objArr;
        this.f7923e = z5;
    }

    public static V0 b() {
        return new V0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iH0;
        int iR;
        int iH1;
        int i = this.f7922d;
        if (i != -1) {
            return i;
        }
        int iK = 0;
        for (int i3 = 0; i3 < this.f7919a; i3++) {
            int i6 = this.f7920b[i3];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        int i9 = i7 << 3;
                        AbstractC0586o0 abstractC0586o0 = (AbstractC0586o0) this.f7921c[i3];
                        int iH2 = C0590q0.h0(i9);
                        int i10 = abstractC0586o0.i();
                        iK = p012c.k.k(i10, i10, iH2, iK);
                    } else if (i8 == 3) {
                        int iH3 = C0590q0.h0(i7 << 3);
                        iH0 = iH3 + iH3;
                        iR = ((V0) this.f7921c[i3]).a();
                    } else {
                        if (i8 != 5) {
                            throw new IllegalStateException(new zzfn());
                        }
                        ((Integer) this.f7921c[i3]).getClass();
                        iH1 = C0590q0.h0(i7 << 3) + 4;
                    }
                } else {
                    ((Long) this.f7921c[i3]).getClass();
                    iH1 = C0590q0.h0(i7 << 3) + 8;
                }
                iK = iH1 + iK;
            } else {
                int i11 = i7 << 3;
                long jLongValue = ((Long) this.f7921c[i3]).longValue();
                iH0 = C0590q0.h0(i11);
                iR = C0590q0.R(jLongValue);
            }
            iK = iR + iH0 + iK;
        }
        this.f7922d = iK;
        return iK;
    }

    public final void c(int i, Object obj) {
        if (!this.f7923e) {
            throw new UnsupportedOperationException();
        }
        e(this.f7919a + 1);
        int[] iArr = this.f7920b;
        int i3 = this.f7919a;
        iArr[i3] = i;
        this.f7921c[i3] = obj;
        this.f7919a = i3 + 1;
    }

    public final void d(H0 h1) throws zzel {
        if (this.f7919a != 0) {
            for (int i = 0; i < this.f7919a; i++) {
                int i3 = this.f7920b[i];
                Object obj = this.f7921c[i];
                int i6 = i3 & 7;
                int i7 = i3 >>> 3;
                if (i6 == 0) {
                    ((C0590q0) h1.f7855a).e0(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    ((C0590q0) h1.f7855a).W(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    ((C0590q0) h1.f7855a).T(i7, (AbstractC0586o0) obj);
                } else if (i6 == 3) {
                    ((C0590q0) h1.f7855a).b0(i7, 3);
                    ((V0) obj).d(h1);
                    ((C0590q0) h1.f7855a).b0(i7, 4);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new zzfn());
                    }
                    ((C0590q0) h1.f7855a).U(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.f7920b;
        if (i > iArr.length) {
            int i3 = this.f7919a;
            int i6 = (i3 / 2) + i3;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f7920b = Arrays.copyOf(iArr, i);
            this.f7921c = Arrays.copyOf(this.f7921c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof V0)) {
            return false;
        }
        V0 v6 = (V0) obj;
        int i = this.f7919a;
        if (i == v6.f7919a) {
            int[] iArr = this.f7920b;
            int[] iArr2 = v6.f7920b;
            for (int i3 = 0; i3 < i; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f7921c;
            Object[] objArr2 = v6.f7921c;
            int i6 = this.f7919a;
            for (int i7 = 0; i7 < i6; i7++) {
                if (objArr[i7].equals(objArr2[i7])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f7919a;
        int i3 = i + 527;
        int[] iArr = this.f7920b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = ((i3 * 31) + i6) * 31;
        Object[] objArr = this.f7921c;
        int i9 = this.f7919a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
