package p080p;

import N.S0;
import p085q.a;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10712e;

    public A(int i) {
        this.f10708a = C.f10714a;
        this.f10709b = a.f11187c;
        if (i >= 0) {
            f(C.f(i));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f10711d;
        this.f10709b[d(obj)] = obj;
        return this.f10711d != i;
    }

    public final void b() {
        this.f10711d = 0;
        long[] jArr = this.f10708a;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = this.f10708a;
            int i = this.f10710c;
            int i3 = i >> 3;
            long j4 = 255 << ((i & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        }
        k.j0(0, this.f10710c, this.f10709b);
        this.f10712e = C.c(this.f10710c) - this.f10711d;
    }

    public final boolean c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i3 = i & 127;
        int i6 = this.f10710c;
        int i7 = (i >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f10708a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = (((long) i3) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i6;
                if (E4.k.a(this.f10709b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final int d(Object obj) {
        long j4;
        long j6;
        long j7;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 >>> 7;
        int i7 = i3 & 127;
        int i8 = this.f10710c;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.f10708a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j8 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j9 = i7;
            int i13 = i7;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j11) >> 3)) & i8;
                int i14 = i;
                if (E4.k.a(this.f10709b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i = i14;
            }
            int i15 = i;
            char c6 = '\b';
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iE = e(i6);
                long j12 = 128;
                long j13 = 255;
                if (this.f10712e != 0 || ((this.f10708a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j4 = 128;
                    j6 = 255;
                    j7 = j9;
                } else {
                    int i16 = this.f10710c;
                    if (i16 <= 8 || Long.compareUnsigned(((long) this.f10711d) * 32, ((long) i16) * 25) > 0) {
                        j4 = 128;
                        j6 = 255;
                        j7 = j9;
                        int iD = C.d(this.f10710c);
                        long[] jArr3 = this.f10708a;
                        Object[] objArr2 = this.f10709b;
                        int i17 = this.f10710c;
                        f(iD);
                        long[] jArr4 = this.f10708a;
                        Object[] objArr3 = this.f10709b;
                        int i18 = this.f10710c;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr3[i19 >> 3] >> ((i19 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i19];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i15;
                                int i20 = iHashCode2 ^ (iHashCode2 << 16);
                                int iE2 = e(i20 >>> 7);
                                long j14 = i20 & 127;
                                int i21 = iE2 >> 3;
                                int i22 = (iE2 & 7) << 3;
                                jArr = jArr4;
                                long j15 = (jArr4[i21] & (~(255 << i22))) | (j14 << i22);
                                jArr[i21] = j15;
                                jArr[(((iE2 - 7) & i18) + (i18 & 7)) >> 3] = j15;
                                objArr3[iE2] = obj2;
                            } else {
                                jArr = jArr4;
                            }
                            i19++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                        }
                    } else {
                        long[] jArr5 = this.f10708a;
                        int i23 = this.f10710c;
                        Object[] objArr4 = this.f10709b;
                        C.a(jArr5, i23);
                        int i24 = 0;
                        int iB = -1;
                        while (i24 != i23) {
                            int i25 = i24 >> 3;
                            int i26 = (i24 & 7) << 3;
                            long j16 = (jArr5[i25] >> i26) & j13;
                            if (j16 == j12) {
                                iB = i24;
                                i24++;
                            } else if (j16 != 254) {
                                i24++;
                            } else {
                                Object obj3 = objArr4[i24];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i15;
                                int i27 = iHashCode3 ^ (iHashCode3 << 16);
                                char c7 = c6;
                                int i28 = i27 >>> 7;
                                int iE3 = e(i28);
                                int i29 = i28 & i23;
                                long j17 = j12;
                                if (((iE3 - i29) & i23) / 8 == ((i24 - i29) & i23) / 8) {
                                    long j18 = j13;
                                    jArr5[i25] = (((long) (i27 & 127)) << i26) | (jArr5[i25] & (~(j18 << i26)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i24++;
                                    c6 = c7;
                                    j12 = j17;
                                    j13 = j18;
                                } else {
                                    long j19 = j13;
                                    int i30 = iE3 >> 3;
                                    long j20 = jArr5[i30];
                                    int i31 = (iE3 & 7) << 3;
                                    if (((j20 >> i31) & j19) == j17) {
                                        objArr = objArr4;
                                        jArr5[i30] = ((~(j19 << i31)) & j20) | (((long) (i27 & 127)) << i31);
                                        jArr5[i25] = (jArr5[i25] & (~(j19 << i26))) | (j17 << i26);
                                        objArr[iE3] = objArr[i24];
                                        objArr[i24] = null;
                                        iB = i24;
                                    } else {
                                        objArr = objArr4;
                                        jArr5[i30] = (((long) (i27 & 127)) << i31) | (j20 & (~(j19 << i31)));
                                        if (iB == -1) {
                                            iB = C.b(jArr5, i24 + 1, i23);
                                        }
                                        objArr[iB] = objArr[iE3];
                                        objArr[iE3] = objArr[i24];
                                        objArr[i24] = objArr[iB];
                                        i24--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i24++;
                                    objArr4 = objArr;
                                    c6 = c7;
                                    j12 = j17;
                                    j13 = j19;
                                    j9 = j9;
                                }
                            }
                        }
                        j4 = j12;
                        j6 = j13;
                        j7 = j9;
                        this.f10712e = C.c(this.f10710c) - this.f10711d;
                    }
                    iE = e(i6);
                }
                this.f10711d++;
                int i32 = this.f10712e;
                long[] jArr6 = this.f10708a;
                int i33 = iE >> 3;
                long j21 = jArr6[i33];
                int i34 = (iE & 7) << 3;
                this.f10712e = i32 - (((j21 >> i34) & j6) == j4 ? 1 : 0);
                int i35 = this.f10710c;
                long j22 = (j21 & (~(j6 << i34))) | (j7 << i34);
                jArr6[i33] = j22;
                jArr6[(((iE - 7) & i35) + (i35 & 7)) >> 3] = j22;
                return iE;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i7 = i13;
            i = i15;
        }
    }

    public final int e(int i) {
        int i3 = this.f10710c;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10708a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        if (a6.f10711d != this.f10711d) {
            return false;
        }
        Object[] objArr = this.f10709b;
        long[] jArr = this.f10708a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128 && !a6.c(objArr[(i << 3) + i6])) {
                            return false;
                        }
                        j4 >>= 8;
                    }
                    if (i3 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10710c = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10708a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10712e = C.c(this.f10710c) - this.f10711d;
        this.f10709b = new Object[iMax];
    }

    public final boolean g() {
        return this.f10711d == 0;
    }

    public final boolean h() {
        return this.f10711d != 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f10709b;
        long[] jArr = this.f10708a;
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
                        Object obj = objArr[(i << 3) + i6];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final void i(A a6) {
        E4.k.f("elements", a6);
        Object[] objArr = a6.f10709b;
        long[] jArr = a6.f10708a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        Object obj = objArr[(i << 3) + i6];
                        this.f10709b[d(obj)] = obj;
                    }
                    j4 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean j(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i3 = i & 127;
        int i6 = this.f10710c;
        int i7 = (i >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f10708a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = (((long) i3) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i6;
                if (E4.k.a(this.f10709b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        boolean z5 = iNumberOfTrailingZeros >= 0;
        if (z5) {
            k(iNumberOfTrailingZeros);
        }
        return z5;
    }

    public final void k(int i) {
        this.f10711d--;
        long[] jArr = this.f10708a;
        int i3 = this.f10710c;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j4 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j4;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j4;
        this.f10709b[i] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r7
  0x0066: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        S0 s1 = new S0(this, 1);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f10709b;
        long[] jArr = this.f10708a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i3 = 0;
        loop0: while (true) {
            long j4 = jArr[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j4) < 128) {
                        Object obj = objArr[(i << 3) + i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) s1.invoke(obj));
                        i3++;
                    }
                    j4 >>= 8;
                }
                if (i6 == 8) {
                    if (i == length) {
                        i++;
                    }
                }
                sb.append((CharSequence) "]");
                break;
            }
            if (i == length) {
                sb.append((CharSequence) "]");
                break;
            }
            i++;
        }
        String string = sb.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public /* synthetic */ A() {
        this(6);
    }
}
