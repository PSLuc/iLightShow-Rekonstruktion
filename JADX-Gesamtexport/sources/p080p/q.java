package p080p;

import p085q.a;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10765f;

    public q(int i) {
        this.f10760a = C.f10714a;
        this.f10761b = j.f10738a;
        this.f10762c = a.f11187c;
        if (i >= 0) {
            g(C.f(i));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f10764e = 0;
        long[] jArr = this.f10760a;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = this.f10760a;
            int i = this.f10763d;
            int i3 = i >> 3;
            long j4 = 255 << ((i & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        }
        k.j0(0, this.f10763d, this.f10762c);
        this.f10765f = C.c(this.f10763d) - this.f10764e;
    }

    public final boolean b(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10763d;
        int i8 = (i3 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f10760a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (this.f10761b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final boolean c(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10763d;
        int i8 = (i3 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f10760a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (this.f10761b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(int i) {
        long j4;
        int i3;
        long j6;
        long[] jArr;
        int[] iArr;
        int i6 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f10763d;
        int i11 = i8 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr2 = this.f10760a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            int i15 = 1;
            long j7 = ((jArr2[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr2[i13] >>> i14);
            long j8 = i9;
            int i16 = i12;
            int i17 = 0;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (j10 != 0) {
                int iNumberOfTrailingZeros = (i11 + (Long.numberOfTrailingZeros(j10) >> 3)) & i10;
                int i18 = i6;
                int i19 = i17;
                if (this.f10761b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
                j10 &= j10 - 1;
                i6 = i18;
                i17 = i19;
            }
            int i20 = i6;
            int i21 = i17;
            char c6 = '\b';
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iE = e(i8);
                long j11 = 255;
                if (this.f10765f != 0 || ((this.f10760a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j4 = 255;
                    i3 = 1;
                    j6 = 128;
                } else {
                    int i22 = this.f10763d;
                    if (i22 <= 8 || Long.compareUnsigned(((long) this.f10764e) * 32, ((long) i22) * 25) > 0) {
                        j4 = 255;
                        i3 = 1;
                        j6 = 128;
                        int iD = C.d(this.f10763d);
                        long[] jArr3 = this.f10760a;
                        int[] iArr2 = this.f10761b;
                        Object[] objArr = this.f10762c;
                        int i23 = this.f10763d;
                        g(iD);
                        long[] jArr4 = this.f10760a;
                        int[] iArr3 = this.f10761b;
                        Object[] objArr2 = this.f10762c;
                        int i24 = this.f10763d;
                        int i25 = i21;
                        while (i25 < i23) {
                            if (((jArr3[i25 >> 3] >> ((i25 & 7) << 3)) & 255) < 128) {
                                int i26 = iArr2[i25];
                                int iHashCode2 = Integer.hashCode(i26) * i20;
                                int i27 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i27 >>> 7);
                                jArr = jArr4;
                                long j12 = i27 & 127;
                                int i28 = iE2 >> 3;
                                int i29 = (iE2 & 7) << 3;
                                long j13 = (jArr[i28] & (~(255 << i29))) | (j12 << i29);
                                jArr[i28] = j13;
                                jArr[(((iE2 - 7) & i24) + (i24 & 7)) >> 3] = j13;
                                iArr3[iE2] = i26;
                                objArr2[iE2] = objArr[i25];
                            } else {
                                jArr = jArr4;
                            }
                            i25++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f10760a;
                        int i30 = this.f10763d;
                        int[] iArr4 = this.f10761b;
                        Object[] objArr3 = this.f10762c;
                        C.a(jArr5, i30);
                        int i31 = i21;
                        int iB = -1;
                        j6 = 128;
                        while (i31 != i30) {
                            int i32 = i31 >> 3;
                            int i33 = (i31 & 7) << 3;
                            long j14 = (jArr5[i32] >> i33) & j11;
                            if (j14 == 128) {
                                int i34 = i31;
                                i31++;
                                iB = i34;
                            } else if (j14 != 254) {
                                i31++;
                            } else {
                                int iHashCode3 = Integer.hashCode(iArr4[i31]) * i20;
                                int i35 = iHashCode3 ^ (iHashCode3 << 16);
                                char c7 = c6;
                                int i36 = i35 >>> 7;
                                int iE3 = e(i36);
                                int i37 = i36 & i30;
                                long j15 = j11;
                                if (((iE3 - i37) & i30) / 8 == ((i31 - i37) & i30) / 8) {
                                    int i38 = i15;
                                    jArr5[i32] = (((long) (i35 & 127)) << i33) | (jArr5[i32] & (~(j15 << i33)));
                                    jArr5[jArr5.length - i38] = (jArr5[i21] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31++;
                                    i15 = i38;
                                    c6 = c7;
                                    j11 = j15;
                                } else {
                                    int i39 = i15;
                                    int i40 = iE3 >> 3;
                                    long j16 = jArr5[i40];
                                    int i41 = (iE3 & 7) << 3;
                                    if (((j16 >> i41) & j15) == 128) {
                                        iArr = iArr4;
                                        jArr5[i40] = ((~(j15 << i41)) & j16) | (((long) (i35 & 127)) << i41);
                                        jArr5[i32] = (jArr5[i32] & (~(j15 << i33))) | (128 << i33);
                                        iArr[iE3] = iArr[i31];
                                        iArr[i31] = i21;
                                        objArr3[iE3] = objArr3[i31];
                                        objArr3[i31] = null;
                                        iB = i31;
                                    } else {
                                        iArr = iArr4;
                                        jArr5[i40] = ((~(j15 << i41)) & j16) | (((long) (i35 & 127)) << i41);
                                        if (iB == -1) {
                                            iB = C.b(jArr5, i31 + 1, i30);
                                        }
                                        iArr[iB] = iArr[iE3];
                                        iArr[iE3] = iArr[i31];
                                        iArr[i31] = iArr[iB];
                                        objArr3[iB] = objArr3[iE3];
                                        objArr3[iE3] = objArr3[i31];
                                        objArr3[i31] = objArr3[iB];
                                        i31--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[i21] & 72057594037927935L) | Long.MIN_VALUE;
                                    i31++;
                                    c6 = c7;
                                    iArr4 = iArr;
                                    j11 = j15;
                                    i15 = i39;
                                }
                            }
                        }
                        j4 = j11;
                        i3 = i15;
                        this.f10765f = C.c(this.f10763d) - this.f10764e;
                    }
                    iE = e(i8);
                }
                this.f10764e++;
                int i42 = this.f10765f;
                long[] jArr6 = this.f10760a;
                int i43 = iE >> 3;
                long j17 = jArr6[i43];
                int i44 = (iE & 7) << 3;
                if (((j17 >> i44) & j4) != j6) {
                    i3 = i21;
                }
                this.f10765f = i42 - i3;
                int i45 = this.f10763d;
                long j18 = (j17 & (~(j4 << i44))) | (j8 << i44);
                jArr6[i43] = j18;
                jArr6[(((iE - 7) & i45) + (i45 & 7)) >> 3] = j18;
                return iE;
            }
            i12 = i16 + 8;
            i11 = (i11 + i12) & i10;
            i6 = i20;
        }
    }

    public final int e(int i) {
        int i3 = this.f10763d;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10760a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j6 = j4 & ((~j4) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i6 + (Long.numberOfTrailingZeros(j6) >> 3)) & i3;
            }
            i7 += 8;
            i6 = (i6 + i7) & i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f10764e != this.f10764e) {
            return false;
        }
        int[] iArr = this.f10761b;
        Object[] objArr = this.f10762c;
        long[] jArr = this.f10760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i << 3) + i6;
                            int i8 = iArr[i7];
                            Object obj2 = objArr[i7];
                            if (obj2 == null) {
                                if (qVar.f(i8) != null || !qVar.c(i8)) {
                                    return false;
                                }
                            } else if (!obj2.equals(qVar.f(i8))) {
                                return false;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final Object f(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10763d;
        int i8 = (i3 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f10760a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (this.f10761b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f10762c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void g(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10763d = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10760a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10765f = C.c(this.f10763d) - this.f10764e;
        this.f10761b = new int[iMax];
        this.f10762c = new Object[iMax];
    }

    public final Object h(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10763d;
        int i8 = (i3 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f10760a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (this.f10761b[iNumberOfTrailingZeros] == i) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f10764e--;
        long[] jArr2 = this.f10760a;
        int i12 = this.f10763d;
        int i13 = iNumberOfTrailingZeros >> 3;
        int i14 = (iNumberOfTrailingZeros & 7) << 3;
        long j8 = (jArr2[i13] & (~(255 << i14))) | (254 << i14);
        jArr2[i13] = j8;
        jArr2[(((iNumberOfTrailingZeros - 7) & i12) + (i12 & 7)) >> 3] = j8;
        Object[] objArr = this.f10762c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f10761b;
        Object[] objArr = this.f10762c;
        long[] jArr = this.f10760a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i << 3) + i6;
                        int i8 = iArr[i7];
                        Object obj = objArr[i7];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i8);
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    public final void i(int i, Object obj) {
        int iD = d(i);
        this.f10761b[iD] = i;
        this.f10762c[iD] = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f10764e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f10761b;
        Object[] objArr = this.f10762c;
        long[] jArr = this.f10760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i3 = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j4) < 128) {
                            int i8 = (i << 3) + i7;
                            int i9 = iArr[i8];
                            Object obj = objArr[i8];
                            sb.append(i9);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i3++;
                            if (i3 < this.f10764e) {
                                sb.append(", ");
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        E4.k.e("s.append('}').toString()", string);
        return string;
    }

    public /* synthetic */ q() {
        this(6);
    }
}
