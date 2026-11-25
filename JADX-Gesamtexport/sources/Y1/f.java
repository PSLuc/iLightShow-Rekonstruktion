package Y1;

import T1.m;
import T1.n;
import V1.g;
import V1.h;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p009b2.o;
import p015c2.u;
import p109u2.C0966e;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final char[] f5855B = V1.b.a(true);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final char[] f5856C = V1.b.a(false);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public char[] f5857A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f5858u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final char f5859v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public char[] f5860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5861x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5862y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f5863z;

    /* JADX WARN: Type inference failed for: r2v5, types: [char[], java.io.Serializable] */
    public f(I1.b bVar, int i, u uVar, g gVar, char c6) {
        super(bVar, i, uVar);
        this.f5858u = gVar;
        if (((char[]) bVar.f1819g) != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        ?? A5 = ((p009b2.a) bVar.f1817e).a(1, 0);
        bVar.f1819g = A5;
        this.f5860w = A5;
        this.f5863z = A5.length;
        this.f5859v = c6;
        if (c6 != '\"') {
            int[] iArrCopyOf = V1.b.f5491h;
            if (c6 != '\"') {
                int[][] iArr = V1.a.f5482b.f5483a;
                int[] iArr2 = iArr[c6];
                if (iArr2 == null) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, 128);
                    if (iArrCopyOf[c6] == 0) {
                        iArrCopyOf[c6] = -1;
                    }
                    iArr[c6] = iArrCopyOf;
                } else {
                    iArrCopyOf = iArr2;
                }
            }
            this.f5814o = iArrCopyOf;
        }
    }

    public static int G0(C0966e c0966e, byte[] bArr, int i, int i3, int i6) {
        int i7;
        int i8 = 0;
        while (i < i3) {
            bArr[i8] = bArr[i];
            i8++;
            i++;
        }
        int iMin = Math.min(i6, bArr.length);
        do {
            int i9 = iMin - i8;
            if (i9 == 0 || (i7 = c0966e.read(bArr, i8, i9)) < 0) {
                return i8;
            }
            i8 += i7;
        } while (i8 < 3);
        return i8;
    }

    public final char[] B0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.f5857A = cArr;
        return cArr;
    }

    public final void C0(char c6, int i) {
        int i3;
        int i6 = this.f5863z;
        if (i >= 0) {
            if (this.f5862y + 2 > i6) {
                D0();
            }
            char[] cArr = this.f5860w;
            int i7 = this.f5862y;
            int i8 = i7 + 1;
            this.f5862y = i8;
            cArr[i7] = '\\';
            this.f5862y = i7 + 2;
            cArr[i8] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.f5862y + 5 >= i6) {
            D0();
        }
        int i9 = this.f5862y;
        char[] cArr2 = this.f5860w;
        char[] cArr3 = this.f5818s ? f5855B : f5856C;
        cArr2[i9] = '\\';
        int i10 = i9 + 2;
        cArr2[i9 + 1] = 'u';
        if (c6 > 255) {
            int i11 = c6 >> '\b';
            int i12 = i9 + 3;
            cArr2[i10] = cArr3[(i11 & 255) >> 4];
            i3 = i9 + 4;
            cArr2[i12] = cArr3[i11 & 15];
            c6 = (char) (c6 & 255);
        } else {
            int i13 = i9 + 3;
            cArr2[i10] = '0';
            i3 = i9 + 4;
            cArr2[i13] = '0';
        }
        cArr2[i3] = cArr3[c6 >> 4];
        cArr2[i3 + 1] = cArr3[c6 & 15];
        this.f5862y = i3 + 2;
    }

    @Override // T1.e
    public final int D(T1.a aVar, C0966e c0966e, int i) {
        y0("write a binary value");
        int i3 = this.f5862y;
        int i6 = this.f5863z;
        if (i3 >= i6) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i7 = this.f5862y;
        this.f5862y = i7 + 1;
        char c6 = this.f5859v;
        cArr[i7] = c6;
        I1.b bVar = this.f5813n;
        if (bVar.f1814b != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
        p009b2.a aVar2 = (p009b2.a) bVar.f1817e;
        int i8 = p009b2.a.f7054c[3];
        if (i8 <= 0) {
            i8 = 0;
        }
        byte[] bArr = (byte[]) aVar2.f7056a.getAndSet(3, null);
        if (bArr == null || bArr.length < i8) {
            bArr = new byte[i8];
        }
        bVar.f1814b = bArr;
        try {
            if (i < 0) {
                i = H0(aVar, c0966e, bArr);
            } else {
                int iI0 = I0(aVar, c0966e, bArr, i);
                if (iI0 > 0) {
                    b("Too few bytes available: missing " + iI0 + " bytes (out of " + i + ")");
                    throw null;
                }
            }
            bVar.b(bArr);
            if (this.f5862y >= i6) {
                D0();
            }
            char[] cArr2 = this.f5860w;
            int i9 = this.f5862y;
            this.f5862y = i9 + 1;
            cArr2[i9] = c6;
            return i;
        } catch (Throwable th) {
            bVar.b(bArr);
            throw th;
        }
    }

    public final void D0() {
        int i = this.f5862y;
        int i3 = this.f5861x;
        int i6 = i - i3;
        if (i6 > 0) {
            this.f5861x = 0;
            this.f5862y = 0;
            this.f5858u.write(this.f5860w, i3, i6);
        }
    }

    public final int E0(char[] cArr, int i, int i3, char c6, int i6) {
        int i7;
        g gVar = this.f5858u;
        if (i6 >= 0) {
            if (i > 1 && i < i3) {
                int i8 = i - 2;
                cArr[i8] = '\\';
                cArr[i - 1] = (char) i6;
                return i8;
            }
            char[] cArrB0 = this.f5857A;
            if (cArrB0 == null) {
                cArrB0 = B0();
            }
            cArrB0[1] = (char) i6;
            gVar.write(cArrB0, 0, 2);
            return i;
        }
        if (i6 == -2) {
            throw null;
        }
        char[] cArr2 = this.f5818s ? f5855B : f5856C;
        if (i <= 5 || i >= i3) {
            char[] cArrB1 = this.f5857A;
            if (cArrB1 == null) {
                cArrB1 = B0();
            }
            this.f5861x = this.f5862y;
            if (c6 <= 255) {
                cArrB1[6] = cArr2[c6 >> 4];
                cArrB1[7] = cArr2[c6 & 15];
                gVar.write(cArrB1, 2, 6);
                return i;
            }
            int i9 = c6 >> '\b';
            cArrB1[10] = cArr2[(i9 & 255) >> 4];
            cArrB1[11] = cArr2[i9 & 15];
            cArrB1[12] = cArr2[(c6 & 255) >> 4];
            cArrB1[13] = cArr2[c6 & 15];
            gVar.write(cArrB1, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i10 = i - 4;
        cArr[i - 5] = 'u';
        if (c6 > 255) {
            int i11 = c6 >> '\b';
            int i12 = i - 3;
            cArr[i10] = cArr2[(i11 & 255) >> 4];
            i7 = i - 2;
            cArr[i12] = cArr2[i11 & 15];
            c6 = (char) (c6 & 255);
        } else {
            int i13 = i - 3;
            cArr[i10] = '0';
            i7 = i - 2;
            cArr[i13] = '0';
        }
        cArr[i7] = cArr2[c6 >> 4];
        cArr[i7 + 1] = cArr2[c6 & 15];
        return i7 - 4;
    }

    public final void F0(char c6, int i) {
        int i3;
        g gVar = this.f5858u;
        if (i >= 0) {
            int i6 = this.f5862y;
            if (i6 >= 2) {
                int i7 = i6 - 2;
                this.f5861x = i7;
                char[] cArr = this.f5860w;
                cArr[i7] = '\\';
                cArr[i6 - 1] = (char) i;
                return;
            }
            char[] cArrB0 = this.f5857A;
            if (cArrB0 == null) {
                cArrB0 = B0();
            }
            this.f5861x = this.f5862y;
            cArrB0[1] = (char) i;
            gVar.write(cArrB0, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        char[] cArr2 = this.f5818s ? f5855B : f5856C;
        int i8 = this.f5862y;
        if (i8 < 6) {
            char[] cArrB1 = this.f5857A;
            if (cArrB1 == null) {
                cArrB1 = B0();
            }
            this.f5861x = this.f5862y;
            if (c6 <= 255) {
                cArrB1[6] = cArr2[c6 >> 4];
                cArrB1[7] = cArr2[c6 & 15];
                gVar.write(cArrB1, 2, 6);
                return;
            } else {
                int i9 = c6 >> '\b';
                cArrB1[10] = cArr2[(i9 & 255) >> 4];
                cArrB1[11] = cArr2[i9 & 15];
                cArrB1[12] = cArr2[(c6 & 255) >> 4];
                cArrB1[13] = cArr2[c6 & 15];
                gVar.write(cArrB1, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.f5860w;
        int i10 = i8 - 6;
        this.f5861x = i10;
        cArr3[i10] = '\\';
        cArr3[i8 - 5] = 'u';
        if (c6 > 255) {
            int i11 = c6 >> '\b';
            cArr3[i8 - 4] = cArr2[(i11 & 255) >> 4];
            i3 = i8 - 3;
            cArr3[i3] = cArr2[i11 & 15];
            c6 = (char) (c6 & 255);
        } else {
            cArr3[i8 - 4] = '0';
            i3 = i8 - 3;
            cArr3[i3] = '0';
        }
        cArr3[i3 + 1] = cArr2[c6 >> 4];
        cArr3[i3 + 2] = cArr2[c6 & 15];
    }

    @Override // T1.e
    public final void G(T1.a aVar, byte[] bArr, int i, int i3) throws JsonGenerationException {
        int iE;
        if (bArr == null) {
            b("Invalid `byte[]` argument: `null`");
            throw null;
        }
        int length = bArr.length;
        int i6 = i + i3;
        if ((i | i3 | i6 | (length - i6)) < 0) {
            b(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(length)));
            throw null;
        }
        y0("write a binary value");
        int i7 = this.f5862y;
        int i8 = this.f5863z;
        if (i7 >= i8) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i9 = this.f5862y;
        this.f5862y = i9 + 1;
        char c6 = this.f5859v;
        cArr[i9] = c6;
        int i10 = i6 - 3;
        int i11 = i8 - 6;
        int i12 = aVar.f5154m;
        loop0: while (true) {
            int i13 = i12 >> 2;
            do {
                if (i > i10) {
                    break loop0;
                }
                if (this.f5862y > i11) {
                    D0();
                }
                int i14 = i + 2;
                int i15 = ((bArr[i + 1] & 255) | (bArr[i] << 8)) << 8;
                i += 3;
                iE = aVar.e(this.f5860w, i15 | (bArr[i14] & 255), this.f5862y);
                this.f5862y = iE;
                i13--;
            } while (i13 > 0);
            char[] cArr2 = this.f5860w;
            int i16 = iE + 1;
            this.f5862y = i16;
            cArr2[iE] = '\\';
            this.f5862y = iE + 2;
            cArr2[i16] = 'n';
            i12 = aVar.f5154m;
        }
        int i17 = i6 - i;
        if (i17 > 0) {
            if (this.f5862y > i11) {
                D0();
            }
            int i18 = i + 1;
            int i19 = bArr[i] << 16;
            if (i17 == 2) {
                i19 |= (bArr[i18] & 255) << 8;
            }
            this.f5862y = aVar.f(i19, i17, this.f5862y, this.f5860w);
        }
        if (this.f5862y >= i8) {
            D0();
        }
        char[] cArr3 = this.f5860w;
        int i20 = this.f5862y;
        this.f5862y = i20 + 1;
        cArr3[i20] = c6;
    }

    public final int H0(T1.a aVar, C0966e c0966e, byte[] bArr) {
        int i = this.f5863z - 6;
        int i3 = 2;
        int i6 = aVar.f5154m >> 2;
        int i7 = -3;
        int i8 = 0;
        int iG0 = 0;
        int i9 = 0;
        while (true) {
            if (i8 > i7) {
                iG0 = G0(c0966e, bArr, i8, iG0, bArr.length);
                if (iG0 < 3) {
                    break;
                }
                i7 = iG0 - 3;
                i8 = 0;
            }
            if (this.f5862y > i) {
                D0();
            }
            int i10 = i8 + 2;
            int i11 = ((bArr[i8 + 1] & 255) | (bArr[i8] << 8)) << 8;
            i8 += 3;
            i9 += 3;
            int iE = aVar.e(this.f5860w, (bArr[i10] & 255) | i11, this.f5862y);
            this.f5862y = iE;
            i6--;
            if (i6 <= 0) {
                char[] cArr = this.f5860w;
                int i12 = iE + 1;
                this.f5862y = i12;
                cArr[iE] = '\\';
                this.f5862y = iE + 2;
                cArr[i12] = 'n';
                i6 = aVar.f5154m >> 2;
            }
        }
        if (iG0 <= 0) {
            return i9;
        }
        if (this.f5862y > i) {
            D0();
        }
        int i13 = bArr[0] << 16;
        if (1 < iG0) {
            i13 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i14 = i9 + i3;
        this.f5862y = aVar.f(i13, i3, this.f5862y, this.f5860w);
        return i14;
    }

    public final int I0(T1.a aVar, C0966e c0966e, byte[] bArr, int i) {
        int iG0;
        int i3 = this.f5863z - 6;
        int i6 = 2;
        int i7 = aVar.f5154m >> 2;
        int i8 = -3;
        int i9 = 0;
        int iG1 = 0;
        while (i > 2) {
            if (i9 > i8) {
                iG1 = G0(c0966e, bArr, i9, iG1, i);
                if (iG1 < 3) {
                    i9 = 0;
                    break;
                }
                i8 = iG1 - 3;
                i9 = 0;
            }
            if (this.f5862y > i3) {
                D0();
            }
            int i10 = i9 + 2;
            int i11 = ((bArr[i9 + 1] & 255) | (bArr[i9] << 8)) << 8;
            i9 += 3;
            i -= 3;
            int iE = aVar.e(this.f5860w, (bArr[i10] & 255) | i11, this.f5862y);
            this.f5862y = iE;
            i7--;
            if (i7 <= 0) {
                char[] cArr = this.f5860w;
                int i12 = iE + 1;
                this.f5862y = i12;
                cArr[iE] = '\\';
                this.f5862y = iE + 2;
                cArr[i12] = 'n';
                i7 = aVar.f5154m >> 2;
            }
        }
        if (i <= 0 || (iG0 = G0(c0966e, bArr, i9, iG1, i)) <= 0) {
            return i;
        }
        if (this.f5862y > i3) {
            D0();
        }
        int i13 = bArr[0] << 16;
        if (1 < iG0) {
            i13 |= (bArr[1] & 255) << 8;
        } else {
            i6 = 1;
        }
        this.f5862y = aVar.f(i13, i6, this.f5862y, this.f5860w);
        return i - i6;
    }

    @Override // T1.e
    public final void J(boolean z5) {
        int i;
        y0("write a boolean value");
        if (this.f5862y + 5 >= this.f5863z) {
            D0();
        }
        int i3 = this.f5862y;
        char[] cArr = this.f5860w;
        if (z5) {
            cArr[i3] = 't';
            cArr[i3 + 1] = 'r';
            cArr[i3 + 2] = 'u';
            i = i3 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i3] = 'f';
            cArr[i3 + 1] = 'a';
            cArr[i3 + 2] = 'l';
            cArr[i3 + 3] = 's';
            i = i3 + 4;
            cArr[i] = 'e';
        }
        this.f5862y = i + 1;
    }

    public final void J0() {
        if (this.f5862y + 4 >= this.f5863z) {
            D0();
        }
        int i = this.f5862y;
        char[] cArr = this.f5860w;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.f5862y = i + 4;
    }

    public final void K0(String str) {
        int i = this.f5862y;
        int i3 = this.f5863z;
        if (i >= i3) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i6 = this.f5862y;
        this.f5862y = i6 + 1;
        char c6 = this.f5859v;
        cArr[i6] = c6;
        i0(str);
        if (this.f5862y >= i3) {
            D0();
        }
        char[] cArr2 = this.f5860w;
        int i7 = this.f5862y;
        this.f5862y = i7 + 1;
        cArr2[i7] = c6;
    }

    @Override // T1.e
    public final void L() throws JsonGenerationException {
        if (!this.f5307l.d()) {
            b("Current context not Array but ".concat(this.f5307l.h()));
            throw null;
        }
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.b(this, this.f5307l.f5216b + 1);
        } else {
            if (this.f5862y >= this.f5863z) {
                D0();
            }
            char[] cArr = this.f5860w;
            int i = this.f5862y;
            this.f5862y = i + 1;
            cArr[i] = ']';
        }
        d dVar = this.f5307l;
        dVar.f5834g = null;
        this.f5307l = dVar.f5830c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[PHI: r16
  0x004b: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:18:0x0046, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[LOOP:2: B:13:0x0039->B:28:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[EDGE_INSN: B:90:0x004f->B:22:0x004f BREAK  A[LOOP:2: B:13:0x0039->B:28:0x0068], SYNTHETIC] */
    public final void L0(String str) {
        int i;
        int i3;
        int i6;
        int i7;
        int i8;
        char[] cArr;
        char c6;
        char[] cArr2;
        int i9;
        char c7;
        int length = str.length();
        int i10 = this.f5863z;
        g gVar = this.f5858u;
        if (length <= i10) {
            if (this.f5862y + length > i10) {
                D0();
            }
            str.getChars(0, length, this.f5860w, this.f5862y);
            int i11 = this.f5815p;
            if (i11 == 0) {
                int i12 = this.f5862y + length;
                int[] iArr = this.f5814o;
                int length2 = iArr.length;
                while (this.f5862y < i12) {
                    do {
                        char[] cArr3 = this.f5860w;
                        int i13 = this.f5862y;
                        char c8 = cArr3[i13];
                        if (c8 >= length2 || iArr[c8] == 0) {
                            i = i13 + 1;
                            this.f5862y = i;
                        } else {
                            int i14 = this.f5861x;
                            int i15 = i13 - i14;
                            if (i15 > 0) {
                                gVar.write(cArr3, i14, i15);
                            }
                            char[] cArr4 = this.f5860w;
                            int i16 = this.f5862y;
                            this.f5862y = i16 + 1;
                            char c9 = cArr4[i16];
                            F0(c9, iArr[c9]);
                        }
                    } while (i < i12);
                    return;
                }
                return;
            }
            int i17 = this.f5862y + length;
            int[] iArr2 = this.f5814o;
            int iMin = Math.min(iArr2.length, i11 + 1);
            while (this.f5862y < i17) {
                do {
                    char[] cArr5 = this.f5860w;
                    int i18 = this.f5862y;
                    char c10 = cArr5[i18];
                    if (c10 < iMin) {
                        i3 = iArr2[c10];
                        if (i3 != 0) {
                            i6 = this.f5861x;
                            i7 = i18 - i6;
                            if (i7 > 0) {
                                gVar.write(cArr5, i6, i7);
                            }
                            this.f5862y++;
                            F0(c10, i3);
                        }
                        i8 = i18 + 1;
                        this.f5862y = i8;
                    } else {
                        if (c10 > i11) {
                            i3 = -1;
                            i6 = this.f5861x;
                            i7 = i18 - i6;
                            if (i7 > 0) {
                                gVar.write(cArr5, i6, i7);
                            }
                            this.f5862y++;
                            F0(c10, i3);
                        }
                        i8 = i18 + 1;
                        this.f5862y = i8;
                    }
                } while (i8 < i17);
                return;
            }
            return;
        }
        D0();
        int length3 = str.length();
        int i19 = 0;
        while (true) {
            int i20 = i19 + i10 > length3 ? length3 - i19 : i10;
            int i21 = i19 + i20;
            str.getChars(i19, i21, this.f5860w, 0);
            int i22 = this.f5815p;
            if (i22 != 0) {
                int[] iArr3 = this.f5814o;
                int iMin2 = Math.min(iArr3.length, i22 + 1);
                int i23 = 0;
                int iE0 = 0;
                int i24 = 0;
                while (i23 < i20) {
                    while (true) {
                        cArr2 = this.f5860w;
                        i9 = i24;
                        c7 = cArr2[i23];
                        if (c7 < iMin2) {
                            i9 = iArr3[c7];
                            if (i9 != 0) {
                                break;
                            }
                            i23++;
                            if (i23 >= i20) {
                                break;
                            } else {
                                i24 = i9;
                            }
                        } else {
                            if (c7 > i22) {
                                i9 = -1;
                                break;
                            }
                            i23++;
                            if (i23 >= i20) {
                                break;
                                break;
                            }
                            i24 = i9;
                        }
                    }
                    int i25 = i23 - iE0;
                    if (i25 > 0) {
                        gVar.write(cArr2, iE0, i25);
                        if (i23 >= i20) {
                            break;
                        }
                    }
                    int i26 = i23 + 1;
                    int i27 = i9;
                    iE0 = E0(this.f5860w, i26, i20, c7, i27);
                    i23 = i26;
                    i24 = i27;
                }
            } else {
                int[] iArr4 = this.f5814o;
                int length4 = iArr4.length;
                int i28 = 0;
                int iE1 = 0;
                while (i28 < i20) {
                    do {
                        cArr = this.f5860w;
                        c6 = cArr[i28];
                        if (c6 < length4 && iArr4[c6] != 0) {
                            break;
                        } else {
                            i28++;
                        }
                    } while (i28 < i20);
                    int i29 = i28 - iE1;
                    if (i29 > 0) {
                        gVar.write(cArr, iE1, i29);
                        if (i28 >= i20) {
                            break;
                        }
                    }
                    int i30 = i28 + 1;
                    iE1 = E0(this.f5860w, i30, i20, c6, iArr4[c6]);
                    i28 = i30;
                }
            }
            if (i21 >= length3) {
                return;
            } else {
                i19 = i21;
            }
        }
    }

    @Override // T1.e
    public final void M() throws JsonGenerationException {
        if (!this.f5307l.e()) {
            b("Current context not Object but ".concat(this.f5307l.h()));
            throw null;
        }
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.h(this, this.f5307l.f5216b + 1);
        } else {
            if (this.f5862y >= this.f5863z) {
                D0();
            }
            char[] cArr = this.f5860w;
            int i = this.f5862y;
            this.f5862y = i + 1;
            cArr[i] = '}';
        }
        d dVar = this.f5307l;
        dVar.f5834g = null;
        this.f5307l = dVar.f5830c;
    }

    public final void M0(char c6) {
        if (this.f5862y >= this.f5863z) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        this.f5862y = i + 1;
        cArr[i] = c6;
    }

    public final void N0(char[] cArr, int i) throws JsonGenerationException {
        int length = cArr.length;
        if (((length - i) | i) < 0) {
            b(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", 0, Integer.valueOf(i), Integer.valueOf(length)));
            throw null;
        }
        if (i >= 32) {
            D0();
            this.f5858u.write(cArr, 0, i);
        } else {
            if (i > this.f5863z - this.f5862y) {
                D0();
            }
            System.arraycopy(cArr, 0, this.f5860w, this.f5862y, i);
            this.f5862y += i;
        }
    }

    @Override // T1.e
    public final void Q(n nVar) throws JsonGenerationException {
        h hVar = (h) nVar;
        int iK = this.f5307l.k(hVar.f5505h);
        if (iK == 4) {
            b("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z5 = iK == 1;
        m mVar = this.f5181h;
        char c6 = this.f5859v;
        int i = this.f5863z;
        if (mVar != null) {
            if (z5) {
                mVar.i(this);
            } else {
                mVar.c(this);
            }
            char[] cArrA = hVar.a();
            if (this.f5817r) {
                N0(cArrA, cArrA.length);
                return;
            }
            if (this.f5862y >= i) {
                D0();
            }
            char[] cArr = this.f5860w;
            int i3 = this.f5862y;
            this.f5862y = i3 + 1;
            cArr[i3] = c6;
            N0(cArrA, cArrA.length);
            if (this.f5862y >= i) {
                D0();
            }
            char[] cArr2 = this.f5860w;
            int i6 = this.f5862y;
            this.f5862y = i6 + 1;
            cArr2[i6] = c6;
            return;
        }
        if (this.f5862y + 1 >= i) {
            D0();
        }
        if (z5) {
            char[] cArr3 = this.f5860w;
            int i7 = this.f5862y;
            this.f5862y = i7 + 1;
            cArr3[i7] = ',';
        }
        if (this.f5817r) {
            char[] cArrA2 = hVar.a();
            N0(cArrA2, cArrA2.length);
            return;
        }
        char[] cArr4 = this.f5860w;
        int i8 = this.f5862y;
        int i9 = i8 + 1;
        this.f5862y = i9;
        cArr4[i8] = c6;
        char[] cArrA3 = hVar.i;
        if (cArrA3 == null) {
            h.f5504j.getClass();
            cArrA3 = V1.d.a(hVar.f5505h);
            hVar.i = cArrA3;
        }
        int length = cArrA3.length;
        if (i9 + length > cArr4.length) {
            length = -1;
        } else {
            System.arraycopy(cArrA3, 0, cArr4, i9, length);
        }
        if (length < 0) {
            char[] cArrA4 = hVar.a();
            N0(cArrA4, cArrA4.length);
            if (this.f5862y >= i) {
                D0();
            }
            char[] cArr5 = this.f5860w;
            int i10 = this.f5862y;
            this.f5862y = i10 + 1;
            cArr5[i10] = c6;
            return;
        }
        int i11 = this.f5862y + length;
        this.f5862y = i11;
        if (i11 >= i) {
            D0();
        }
        char[] cArr6 = this.f5860w;
        int i12 = this.f5862y;
        this.f5862y = i12 + 1;
        cArr6[i12] = c6;
    }

    @Override // T1.e
    public final void T(String str) throws JsonGenerationException {
        int iK = this.f5307l.k(str);
        if (iK == 4) {
            b("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z5 = iK == 1;
        m mVar = this.f5181h;
        char c6 = this.f5859v;
        int i = this.f5863z;
        if (mVar != null) {
            if (z5) {
                mVar.i(this);
            } else {
                mVar.c(this);
            }
            if (this.f5817r) {
                L0(str);
                return;
            }
            if (this.f5862y >= i) {
                D0();
            }
            char[] cArr = this.f5860w;
            int i3 = this.f5862y;
            this.f5862y = i3 + 1;
            cArr[i3] = c6;
            L0(str);
            if (this.f5862y >= i) {
                D0();
            }
            char[] cArr2 = this.f5860w;
            int i6 = this.f5862y;
            this.f5862y = i6 + 1;
            cArr2[i6] = c6;
            return;
        }
        if (this.f5862y + 1 >= i) {
            D0();
        }
        if (z5) {
            char[] cArr3 = this.f5860w;
            int i7 = this.f5862y;
            this.f5862y = i7 + 1;
            cArr3[i7] = ',';
        }
        if (this.f5817r) {
            L0(str);
            return;
        }
        char[] cArr4 = this.f5860w;
        int i8 = this.f5862y;
        this.f5862y = i8 + 1;
        cArr4[i8] = c6;
        L0(str);
        if (this.f5862y >= i) {
            D0();
        }
        char[] cArr5 = this.f5860w;
        int i9 = this.f5862y;
        this.f5862y = i9 + 1;
        cArr5[i9] = c6;
    }

    @Override // T1.e
    public final void V() {
        y0("write a null");
        J0();
    }

    @Override // T1.e
    public final void X(double d6) {
        if (!this.f5306k) {
            String str = V1.f.f5498a;
            if ((!Double.isNaN(d6) && !Double.isInfinite(d6)) || !v(T1.d.QUOTE_NON_NUMERIC_NUMBERS)) {
                y0("write a number");
                i0(V1.f.f(d6, v(T1.d.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        s0(V1.f.f(d6, v(T1.d.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // T1.e
    public final void Y(float f6) {
        if (!this.f5306k) {
            String str = V1.f.f5498a;
            if ((!Float.isNaN(f6) && !Float.isInfinite(f6)) || !v(T1.d.QUOTE_NON_NUMERIC_NUMBERS)) {
                y0("write a number");
                i0(V1.f.g(f6, v(T1.d.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        s0(V1.f.g(f6, v(T1.d.USE_FAST_DOUBLE_WRITER)));
    }

    @Override // T1.e
    public final void Z(int i) {
        y0("write a number");
        boolean z5 = this.f5306k;
        int i3 = this.f5863z;
        if (!z5) {
            if (this.f5862y + 11 >= i3) {
                D0();
            }
            this.f5862y = V1.f.d(this.f5860w, i, this.f5862y);
            return;
        }
        if (this.f5862y + 13 >= i3) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i6 = this.f5862y;
        int i7 = i6 + 1;
        this.f5862y = i7;
        char c6 = this.f5859v;
        cArr[i6] = c6;
        int iD = V1.f.d(cArr, i, i7);
        char[] cArr2 = this.f5860w;
        this.f5862y = iD + 1;
        cArr2[iD] = c6;
    }

    @Override // T1.e
    public final void a0(long j4) {
        y0("write a number");
        boolean z5 = this.f5306k;
        int i = this.f5863z;
        if (!z5) {
            if (this.f5862y + 21 >= i) {
                D0();
            }
            this.f5862y = V1.f.e(j4, this.f5860w, this.f5862y);
            return;
        }
        if (this.f5862y + 23 >= i) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i3 = this.f5862y;
        int i6 = i3 + 1;
        this.f5862y = i6;
        char c6 = this.f5859v;
        cArr[i3] = c6;
        int iE = V1.f.e(j4, cArr, i6);
        char[] cArr2 = this.f5860w;
        this.f5862y = iE + 1;
        cArr2[iE] = c6;
    }

    @Override // T1.e
    public final void b0(String str) {
        y0("write a number");
        if (str == null) {
            J0();
        } else if (this.f5306k) {
            K0(str);
        } else {
            i0(str);
        }
    }

    @Override // T1.e
    public final void c0(BigDecimal bigDecimal) {
        y0("write a number");
        if (bigDecimal == null) {
            J0();
        } else if (this.f5306k) {
            K0(x0(bigDecimal));
        } else {
            i0(x0(bigDecimal));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            if (this.f5860w != null && v(T1.d.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    d dVar = this.f5307l;
                    if (!dVar.d()) {
                        if (!dVar.e()) {
                            break;
                        } else {
                            M();
                        }
                    } else {
                        L();
                    }
                }
            }
            D0();
            e = null;
        } catch (IOException e6) {
            e = e6;
        }
        this.f5861x = 0;
        this.f5862y = 0;
        g gVar = this.f5858u;
        I1.b bVar = this.f5813n;
        if (gVar != null) {
            try {
                if (!bVar.f1813a && !v(T1.d.AUTO_CLOSE_TARGET)) {
                    v(T1.d.FLUSH_PASSED_TO_STREAM);
                }
            } catch (IOException | RuntimeException e7) {
                if (e != null) {
                    e7.addSuppressed(e);
                }
                throw e7;
            }
        }
        char[] cArr = this.f5860w;
        if (cArr != null) {
            this.f5860w = null;
            char[] cArr2 = (char[]) bVar.f1819g;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
            bVar.f1819g = null;
            ((p009b2.a) bVar.f1817e).f7057b.set(1, cArr);
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // T1.e
    public final void d0(BigInteger bigInteger) {
        y0("write a number");
        if (bigInteger == null) {
            J0();
        } else if (this.f5306k) {
            K0(bigInteger.toString());
        } else {
            i0(bigInteger.toString());
        }
    }

    @Override // T1.e
    public final void e0(short s6) {
        y0("write a number");
        boolean z5 = this.f5306k;
        int i = this.f5863z;
        if (!z5) {
            if (this.f5862y + 6 >= i) {
                D0();
            }
            this.f5862y = V1.f.d(this.f5860w, s6, this.f5862y);
            return;
        }
        if (this.f5862y + 8 >= i) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i3 = this.f5862y;
        int i6 = i3 + 1;
        this.f5862y = i6;
        char c6 = this.f5859v;
        cArr[i3] = c6;
        int iD = V1.f.d(cArr, s6, i6);
        char[] cArr2 = this.f5860w;
        this.f5862y = iD + 1;
        cArr2[iD] = c6;
    }

    @Override // T1.e, java.io.Flushable
    public final void flush() {
        D0();
        if (this.f5858u != null) {
            v(T1.d.FLUSH_PASSED_TO_STREAM);
        }
    }

    @Override // T1.e
    public final void h0(n nVar) {
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        String str = ((h) nVar).f5505h;
        int length = str.length();
        if (i + length > cArr.length) {
            length = -1;
        } else {
            str.getChars(0, length, cArr, i);
        }
        if (length < 0) {
            i0(((h) nVar).f5505h);
        } else {
            this.f5862y += length;
        }
    }

    @Override // T1.e
    public final void i0(String str) {
        int length = str.length();
        int i = this.f5862y;
        int i3 = this.f5863z;
        int i6 = i3 - i;
        if (i6 == 0) {
            D0();
            i6 = i3 - this.f5862y;
        }
        if (i6 >= length) {
            str.getChars(0, length, this.f5860w, this.f5862y);
            this.f5862y += length;
            return;
        }
        int i7 = this.f5862y;
        int i8 = i3 - i7;
        str.getChars(0, i8, this.f5860w, i7);
        this.f5862y += i8;
        D0();
        int length2 = str.length() - i8;
        while (length2 > i3) {
            int i9 = i8 + i3;
            str.getChars(i8, i9, this.f5860w, 0);
            this.f5861x = 0;
            this.f5862y = i3;
            D0();
            length2 -= i3;
            i8 = i9;
        }
        str.getChars(i8, i8 + length2, this.f5860w, 0);
        this.f5861x = 0;
        this.f5862y = length2;
    }

    @Override // T1.e
    public final void l0() {
        y0("start an array");
        d dVar = this.f5307l;
        d dVar2 = dVar.f5832e;
        if (dVar2 == null) {
            H1.d dVar3 = dVar.f5831d;
            dVar2 = new d(1, dVar, dVar3 != null ? dVar3.d() : null);
            dVar.f5832e = dVar2;
        } else {
            dVar2.f5215a = 1;
            dVar2.f5216b = -1;
            dVar2.f5833f = null;
            dVar2.f5835h = false;
            dVar2.f5834g = null;
            H1.d dVar4 = dVar2.f5831d;
            if (dVar4 != null) {
                dVar4.f1757h = null;
                dVar4.f1758j = null;
                dVar4.f1759k = null;
            }
        }
        this.f5307l = dVar2;
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.k(this);
            return;
        }
        if (this.f5862y >= this.f5863z) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        this.f5862y = i + 1;
        cArr[i] = '[';
    }

    @Override // T1.e
    public final void m0(Object obj) {
        y0("start an array");
        this.f5307l = this.f5307l.i(obj);
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.k(this);
            return;
        }
        if (this.f5862y >= this.f5863z) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        this.f5862y = i + 1;
        cArr[i] = '[';
    }

    @Override // T1.e
    public final void n0(Object obj) {
        y0("start an array");
        this.f5307l = this.f5307l.i(obj);
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.k(this);
            return;
        }
        if (this.f5862y >= this.f5863z) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        this.f5862y = i + 1;
        cArr[i] = '[';
    }

    @Override // T1.e
    public final void o0() {
        y0("start an object");
        d dVar = this.f5307l;
        d dVar2 = dVar.f5832e;
        if (dVar2 == null) {
            H1.d dVar3 = dVar.f5831d;
            dVar2 = new d(2, dVar, dVar3 != null ? dVar3.d() : null);
            dVar.f5832e = dVar2;
        } else {
            dVar2.f5215a = 2;
            dVar2.f5216b = -1;
            dVar2.f5833f = null;
            dVar2.f5835h = false;
            dVar2.f5834g = null;
            H1.d dVar4 = dVar2.f5831d;
            if (dVar4 != null) {
                dVar4.f1757h = null;
                dVar4.f1758j = null;
                dVar4.f1759k = null;
            }
        }
        this.f5307l = dVar2;
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.j(this);
            return;
        }
        if (this.f5862y >= this.f5863z) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        this.f5862y = i + 1;
        cArr[i] = '{';
    }

    @Override // T1.e
    public final void p0(Object obj) {
        y0("start an object");
        this.f5307l = this.f5307l.j(obj);
        m mVar = this.f5181h;
        if (mVar != null) {
            mVar.j(this);
            return;
        }
        if (this.f5862y >= this.f5863z) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i = this.f5862y;
        this.f5862y = i + 1;
        cArr[i] = '{';
    }

    @Override // T1.e
    public final void r0(n nVar) {
        y0("write a string");
        int i = this.f5862y;
        int i3 = this.f5863z;
        if (i >= i3) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i6 = this.f5862y;
        int i7 = i6 + 1;
        this.f5862y = i7;
        char c6 = this.f5859v;
        cArr[i6] = c6;
        h hVar = (h) nVar;
        char[] cArrA = hVar.i;
        if (cArrA == null) {
            h.f5504j.getClass();
            cArrA = V1.d.a(hVar.f5505h);
            hVar.i = cArrA;
        }
        int length = cArrA.length;
        if (i7 + length > cArr.length) {
            length = -1;
        } else {
            System.arraycopy(cArrA, 0, cArr, i7, length);
        }
        if (length >= 0) {
            int i8 = this.f5862y + length;
            this.f5862y = i8;
            if (i8 >= i3) {
                D0();
            }
            char[] cArr2 = this.f5860w;
            int i9 = this.f5862y;
            this.f5862y = i9 + 1;
            cArr2[i9] = c6;
            return;
        }
        char[] cArrA2 = hVar.a();
        int length2 = cArrA2.length;
        if (length2 < 32) {
            if (length2 > i3 - this.f5862y) {
                D0();
            }
            System.arraycopy(cArrA2, 0, this.f5860w, this.f5862y, length2);
            this.f5862y += length2;
        } else {
            D0();
            this.f5858u.write(cArrA2, 0, length2);
        }
        if (this.f5862y >= i3) {
            D0();
        }
        char[] cArr3 = this.f5860w;
        int i10 = this.f5862y;
        this.f5862y = i10 + 1;
        cArr3[i10] = c6;
    }

    @Override // T1.e
    public final void s0(String str) {
        y0("write a string");
        if (str == null) {
            J0();
            return;
        }
        int i = this.f5862y;
        int i3 = this.f5863z;
        if (i >= i3) {
            D0();
        }
        char[] cArr = this.f5860w;
        int i6 = this.f5862y;
        this.f5862y = i6 + 1;
        char c6 = this.f5859v;
        cArr[i6] = c6;
        L0(str);
        if (this.f5862y >= i3) {
            D0();
        }
        char[] cArr2 = this.f5860w;
        int i7 = this.f5862y;
        this.f5862y = i7 + 1;
        cArr2[i7] = c6;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[PHI: r11
  0x0045: PHI (r11v6 int) = (r11v3 int), (r11v7 int) binds: [B:15:0x0041, B:13:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // T1.e
    public final void t0(char[] cArr, int i, int i3) {
        char c6;
        y0("write a string");
        int i6 = this.f5862y;
        int i7 = this.f5863z;
        if (i6 >= i7) {
            D0();
        }
        char[] cArr2 = this.f5860w;
        int i8 = this.f5862y;
        this.f5862y = i8 + 1;
        char c7 = this.f5859v;
        cArr2[i8] = c7;
        int i9 = this.f5815p;
        g gVar = this.f5858u;
        int i10 = 32;
        if (i9 != 0) {
            int i11 = i3 + i;
            int[] iArr = this.f5814o;
            int iMin = Math.min(iArr.length, i9 + 1);
            int i12 = 0;
            int i13 = i;
            while (i13 < i11) {
                int i14 = i13;
                do {
                    c6 = cArr[i14];
                    if (c6 < iMin) {
                        i12 = iArr[c6];
                        if (i12 != 0) {
                            break;
                        } else {
                            i14++;
                        }
                    } else {
                        if (c6 > i9) {
                            i12 = -1;
                            break;
                        }
                        i14++;
                    }
                } while (i14 < i11);
                int i15 = i14 - i13;
                if (i15 < i10) {
                    if (this.f5862y + i15 > i7) {
                        D0();
                    }
                    if (i15 > 0) {
                        System.arraycopy(cArr, i13, this.f5860w, this.f5862y, i15);
                        this.f5862y += i15;
                    }
                } else {
                    D0();
                    gVar.write(cArr, i13, i15);
                }
                if (i14 >= i11) {
                    break;
                }
                i13 = i14 + 1;
                C0(c6, i12);
                i10 = 32;
            }
        } else {
            int i16 = i3 + i;
            int[] iArr2 = this.f5814o;
            int length = iArr2.length;
            int i17 = i;
            while (i17 < i16) {
                int i18 = i17;
                do {
                    char c8 = cArr[i18];
                    if (c8 < length && iArr2[c8] != 0) {
                        break;
                    } else {
                        i18++;
                    }
                } while (i18 < i16);
                int i19 = i18 - i17;
                if (i19 < 32) {
                    if (this.f5862y + i19 > i7) {
                        D0();
                    }
                    if (i19 > 0) {
                        System.arraycopy(cArr, i17, this.f5860w, this.f5862y, i19);
                        this.f5862y += i19;
                    }
                } else {
                    D0();
                    gVar.write(cArr, i17, i19);
                }
                if (i18 >= i16) {
                    break;
                }
                i17 = i18 + 1;
                char c9 = cArr[i18];
                C0(c9, iArr2[c9]);
            }
        }
        if (this.f5862y >= i7) {
            D0();
        }
        char[] cArr3 = this.f5860w;
        int i20 = this.f5862y;
        this.f5862y = i20 + 1;
        cArr3[i20] = c7;
    }

    @Override // U1.a
    public final void y0(String str) {
        char c6;
        int iL = this.f5307l.l();
        m mVar = this.f5181h;
        if (mVar == null) {
            if (iL == 1) {
                c6 = ',';
            } else {
                if (iL != 2) {
                    if (iL != 3) {
                        if (iL != 5) {
                            return;
                        }
                        z0(str);
                        throw null;
                    }
                    h hVar = this.f5816q;
                    if (hVar != null) {
                        i0(hVar.f5505h);
                        return;
                    }
                    return;
                }
                c6 = ':';
            }
            if (this.f5862y >= this.f5863z) {
                D0();
            }
            char[] cArr = this.f5860w;
            int i = this.f5862y;
            this.f5862y = i + 1;
            cArr[i] = c6;
            return;
        }
        if (iL == 0) {
            if (this.f5307l.d()) {
                this.f5181h.f(this);
                return;
            } else {
                if (this.f5307l.e()) {
                    this.f5181h.c(this);
                    return;
                }
                return;
            }
        }
        if (iL == 1) {
            mVar.e(this);
            return;
        }
        if (iL == 2) {
            mVar.g(this);
            return;
        }
        if (iL == 3) {
            mVar.a(this);
        } else {
            if (iL != 5) {
                o.a();
                throw null;
            }
            z0(str);
            throw null;
        }
    }
}
