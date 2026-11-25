package i5;

import E4.k;
import h5.B;
import h5.C0732j;
import h5.H;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f9593a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(M4.a.f3520a);
        k.e("this as java.lang.String).getBytes(charset)", bytes);
        f9593a = bytes;
    }

    public static final boolean a(H h6, int i, byte[] bArr, int i3) {
        int i6 = h6.f9323c;
        byte[] bArr2 = h6.f9321a;
        for (int i7 = 1; i7 < i3; i7++) {
            if (i == i6) {
                h6 = h6.f9326f;
                k.c(h6);
                i = h6.f9322b;
                i6 = h6.f9323c;
                bArr2 = h6.f9321a;
            }
            if (bArr2[i] != bArr[i7]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final String b(C0732j c0732j, long j4) throws EOFException {
        k.f("<this>", c0732j);
        if (j4 > 0) {
            long j6 = j4 - 1;
            if (c0732j.o(j6) == 13) {
                String strL = c0732j.L(j6, M4.a.f3520a);
                c0732j.l(2L);
                return strL;
            }
        }
        String strL2 = c0732j.L(j4, M4.a.f3520a);
        c0732j.l(1L);
        return strL2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ab A[LOOP:0: B:8:0x0021->B:48:0x00ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[SYNTHETIC] */
    public static final int c(C0732j c0732j, B b6, boolean z5) {
        int i;
        byte[] bArr;
        int i3;
        int i6;
        H h6;
        byte[] bArr2;
        int i7;
        k.f("<this>", c0732j);
        k.f("options", b6);
        H h7 = c0732j.f9351h;
        if (h7 == null) {
            return z5 ? -2 : -1;
        }
        int i8 = h7.f9322b;
        int i9 = h7.f9323c;
        byte[] bArr3 = h7.f9321a;
        H h8 = h7;
        int i10 = -1;
        int i11 = 0;
        loop0: while (true) {
            int i12 = i11 + 1;
            int[] iArr = b6.i;
            int i13 = iArr[i11];
            int i14 = i11 + 2;
            int i15 = iArr[i12];
            if (i15 != -1) {
                i10 = i15;
            }
            if (h8 == null) {
                break;
            }
            if (i13 >= 0) {
                int i16 = i8 + 1;
                int i17 = bArr3[i8] & 255;
                int i18 = i14 + i13;
                while (i14 != i18) {
                    if (i17 == iArr[i14]) {
                        i = iArr[i14 + i13];
                        if (i16 == i9) {
                            h8 = h8.f9326f;
                            k.c(h8);
                            i6 = h8.f9322b;
                            i3 = h8.f9323c;
                            bArr = h8.f9321a;
                            if (h8 == h7) {
                                h8 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i3 = i9;
                            i6 = i16;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        byte[] bArr4 = bArr;
                        i11 = -i;
                        i8 = i6;
                        i9 = i3;
                        bArr3 = bArr4;
                    } else {
                        i14++;
                    }
                }
                return i10;
            }
            int i19 = (i13 * (-1)) + i14;
            while (true) {
                int i20 = i8 + 1;
                int i21 = i14 + 1;
                if ((bArr3[i8] & 255) == iArr[i14]) {
                    boolean z6 = i21 == i19;
                    if (i20 == i9) {
                        k.c(h8);
                        H h9 = h8.f9326f;
                        k.c(h9);
                        i7 = h9.f9322b;
                        int i22 = h9.f9323c;
                        bArr2 = h9.f9321a;
                        if (h9 != h7) {
                            h6 = h9;
                            i9 = i22;
                        } else {
                            if (!z6) {
                                break loop0;
                            }
                            i9 = i22;
                            h6 = null;
                        }
                    } else {
                        h6 = h8;
                        bArr2 = bArr3;
                        i7 = i20;
                    }
                    if (z6) {
                        i = iArr[i21];
                        int i23 = i7;
                        i3 = i9;
                        i6 = i23;
                        byte[] bArr5 = bArr2;
                        h8 = h6;
                        bArr = bArr5;
                        break;
                    }
                    i8 = i7;
                    bArr3 = bArr2;
                    h8 = h6;
                    i14 = i21;
                }
                return i10;
            }
            if (i >= 0) {
                return i;
            }
            byte[] bArr6 = bArr;
            i11 = -i;
            i8 = i6;
            i9 = i3;
            bArr3 = bArr6;
        }
        if (z5) {
            return -2;
        }
        return i10;
    }
}
