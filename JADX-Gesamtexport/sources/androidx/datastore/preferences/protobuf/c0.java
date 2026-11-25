package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f6844f = new c0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6848d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6849e;

    public c0(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f6845a = i;
        this.f6846b = iArr;
        this.f6847c = objArr;
        this.f6849e = z5;
    }

    public final void a(int i) {
        int[] iArr = this.f6846b;
        if (i > iArr.length) {
            int i3 = this.f6845a;
            int i6 = (i3 / 2) + i3;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f6846b = Arrays.copyOf(iArr, i);
            this.f6847c = Arrays.copyOf(this.f6847c, i);
        }
    }

    public final int b() {
        int iU;
        int iW;
        int iU2;
        int i = this.f6848d;
        if (i != -1) {
            return i;
        }
        int i3 = 0;
        for (int i6 = 0; i6 < this.f6845a; i6++) {
            int i7 = this.f6846b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f6847c[i6]).getClass();
                    iU2 = C0427l.U(i8) + 8;
                } else if (i9 == 2) {
                    iU2 = C0427l.S(i8, (C0422g) this.f6847c[i6]);
                } else if (i9 == 3) {
                    iU = C0427l.U(i8) * 2;
                    iW = ((c0) this.f6847c[i6]).b();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.b());
                    }
                    ((Integer) this.f6847c[i6]).getClass();
                    iU2 = C0427l.U(i8) + 4;
                }
                i3 = iU2 + i3;
            } else {
                long jLongValue = ((Long) this.f6847c[i6]).longValue();
                iU = C0427l.U(i8);
                iW = C0427l.W(jLongValue);
            }
            i3 = iW + iU + i3;
        }
        this.f6848d = i3;
        return i3;
    }

    public final void c(int i, Object obj) {
        if (!this.f6849e) {
            throw new UnsupportedOperationException();
        }
        a(this.f6845a + 1);
        int[] iArr = this.f6846b;
        int i3 = this.f6845a;
        iArr[i3] = i;
        this.f6847c[i3] = obj;
        this.f6845a = i3 + 1;
    }

    public final void d(D d6) {
        if (this.f6845a == 0) {
            return;
        }
        d6.getClass();
        for (int i = 0; i < this.f6845a; i++) {
            int i3 = this.f6846b[i];
            Object obj = this.f6847c[i];
            int i6 = i3 >>> 3;
            int i7 = i3 & 7;
            C0427l c0427l = (C0427l) d6.f6789a;
            if (i7 == 0) {
                c0427l.q0(i6, ((Long) obj).longValue());
            } else if (i7 == 1) {
                c0427l.g0(i6, ((Long) obj).longValue());
            } else if (i7 == 2) {
                c0427l.c0(i6, (C0422g) obj);
            } else if (i7 == 3) {
                c0427l.n0(i6, 3);
                ((c0) obj).d(d6);
                c0427l.n0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.b());
                }
                c0427l.e0(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i = this.f6845a;
        if (i == c0Var.f6845a) {
            int[] iArr = this.f6846b;
            int[] iArr2 = c0Var.f6846b;
            for (int i3 = 0; i3 < i; i3++) {
                if (iArr[i3] == iArr2[i3]) {
                }
            }
            Object[] objArr = this.f6847c;
            Object[] objArr2 = c0Var.f6847c;
            int i6 = this.f6845a;
            for (int i7 = 0; i7 < i6; i7++) {
                if (objArr[i7].equals(objArr2[i7])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f6845a;
        int i3 = (527 + i) * 31;
        int[] iArr = this.f6846b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i3 + i6) * 31;
        Object[] objArr = this.f6847c;
        int i9 = this.f6845a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
