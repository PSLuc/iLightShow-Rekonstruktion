package com.google.android.gms.internal.play_billing;

import B.AbstractC0013g0;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0590q0 extends S1.V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f7984h = Logger.getLogger(C0590q0.class.getName());
    public static final boolean i = AbstractC0550a1.f7934e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H0 f7985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f7986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7988g;

    public C0590q0(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC0013g0.g("Array range is invalid. Buffer.length=", length, i3, ", offset=0, length="));
        }
        this.f7986e = bArr;
        this.f7988g = 0;
        this.f7987f = i3;
    }

    public static int R(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public static int g0(String str) {
        int length;
        try {
            length = AbstractC0556c1.c(str);
        } catch (C0553b1 unused) {
            length = str.getBytes(D0.f7817a).length;
        }
        return h0(length) + length;
    }

    public static int h0(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public final void S(byte[] bArr, int i3, int i6) {
        try {
            System.arraycopy(bArr, i3, this.f7986e, this.f7988g, i6);
            this.f7988g += i6;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzel(this.f7988g, this.f7987f, i6, e6);
        }
    }

    public final void T(int i3, AbstractC0586o0 abstractC0586o0) throws zzel {
        d0((i3 << 3) | 2);
        d0(abstractC0586o0.i());
        abstractC0586o0.k(this);
    }

    public final void U(int i3, int i6) throws zzel {
        d0((i3 << 3) | 5);
        V(i6);
    }

    public final void V(int i3) throws zzel {
        int i6 = this.f7988g;
        try {
            byte[] bArr = this.f7986e;
            bArr[i6] = (byte) i3;
            bArr[i6 + 1] = (byte) (i3 >> 8);
            bArr[i6 + 2] = (byte) (i3 >> 16);
            bArr[i6 + 3] = (byte) (i3 >> 24);
            this.f7988g = i6 + 4;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzel(i6, this.f7987f, 4, e6);
        }
    }

    public final void W(int i3, long j4) throws zzel {
        d0((i3 << 3) | 1);
        X(j4);
    }

    public final void X(long j4) throws zzel {
        int i3 = this.f7988g;
        try {
            byte[] bArr = this.f7986e;
            bArr[i3] = (byte) j4;
            bArr[i3 + 1] = (byte) (j4 >> 8);
            bArr[i3 + 2] = (byte) (j4 >> 16);
            bArr[i3 + 3] = (byte) (j4 >> 24);
            bArr[i3 + 4] = (byte) (j4 >> 32);
            bArr[i3 + 5] = (byte) (j4 >> 40);
            bArr[i3 + 6] = (byte) (j4 >> 48);
            bArr[i3 + 7] = (byte) (j4 >> 56);
            this.f7988g = i3 + 8;
        } catch (IndexOutOfBoundsException e6) {
            throw new zzel(i3, this.f7987f, 8, e6);
        }
    }

    public final void Y(int i3, int i6) throws zzel {
        d0(i3 << 3);
        Z(i6);
    }

    public final void Z(int i3) throws zzel {
        if (i3 >= 0) {
            d0(i3);
        } else {
            f0(i3);
        }
    }

    public final void a0(int i3, String str) throws zzel {
        d0((i3 << 3) | 2);
        int i6 = this.f7988g;
        try {
            int iH0 = h0(str.length() * 3);
            int iH1 = h0(str.length());
            byte[] bArr = this.f7986e;
            int i7 = this.f7987f;
            if (iH1 != iH0) {
                d0(AbstractC0556c1.c(str));
                int i8 = this.f7988g;
                this.f7988g = AbstractC0556c1.b(i8, i7 - i8, str, bArr);
            } else {
                int i9 = i6 + iH1;
                this.f7988g = i9;
                int iB = AbstractC0556c1.b(i9, i7 - i9, str, bArr);
                this.f7988g = i6;
                d0((iB - i6) - iH1);
                this.f7988g = iB;
            }
        } catch (C0553b1 e6) {
            this.f7988g = i6;
            f7984h.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(D0.f7817a);
            try {
                int length = bytes.length;
                d0(length);
                S(bytes, 0, length);
            } catch (IndexOutOfBoundsException e7) {
                throw new zzel(e7);
            }
        } catch (IndexOutOfBoundsException e8) {
            throw new zzel(e8);
        }
    }

    public final void b0(int i3, int i6) throws zzel {
        d0((i3 << 3) | i6);
    }

    public final void c0(int i3, int i6) throws zzel {
        d0(i3 << 3);
        d0(i6);
    }

    public final void d0(int i3) throws zzel {
        int i6;
        int i7 = this.f7988g;
        while (true) {
            int i8 = i3 & (-128);
            byte[] bArr = this.f7986e;
            if (i8 == 0) {
                i6 = i7 + 1;
                bArr[i7] = (byte) i3;
                this.f7988g = i6;
                return;
            } else {
                i6 = i7 + 1;
                try {
                    bArr[i7] = (byte) (i3 | 128);
                    i3 >>>= 7;
                    i7 = i6;
                } catch (IndexOutOfBoundsException e6) {
                    throw new zzel(i6, this.f7987f, 1, e6);
                }
            }
            throw new zzel(i6, this.f7987f, 1, e6);
        }
    }

    public final void e0(int i3, long j4) throws zzel {
        d0(i3 << 3);
        f0(j4);
    }

    public final void f0(long j4) throws zzel {
        int i3;
        int i6 = this.f7988g;
        byte[] bArr = this.f7986e;
        boolean z5 = i;
        int i7 = this.f7987f;
        if (!z5 || i7 - i6 < 10) {
            long j6 = j4;
            while ((j6 & (-128)) != 0) {
                i3 = i6 + 1;
                try {
                    bArr[i6] = (byte) (((int) j6) | 128);
                    j6 >>>= 7;
                    i6 = i3;
                } catch (IndexOutOfBoundsException e6) {
                    throw new zzel(i3, i7, 1, e6);
                }
            }
            i3 = i6 + 1;
            bArr[i6] = (byte) j6;
        } else {
            long j7 = j4;
            while ((j7 & (-128)) != 0) {
                AbstractC0550a1.f7932c.d(bArr, AbstractC0550a1.f7935f + ((long) i6), (byte) (((int) j7) | 128));
                j7 >>>= 7;
                i6++;
            }
            i3 = i6 + 1;
            AbstractC0550a1.f7932c.d(bArr, AbstractC0550a1.f7935f + ((long) i6), (byte) j7);
        }
        this.f7988g = i3;
    }
}
