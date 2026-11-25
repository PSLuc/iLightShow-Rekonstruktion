package p080p;

import p085q.a;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10801f;

    public x(int i) {
        this.f10796a = C.f10714a;
        Object[] objArr = a.f11187c;
        this.f10797b = objArr;
        this.f10798c = objArr;
        if (i >= 0) {
            f(C.f(i));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f10800e = 0;
        long[] jArr = this.f10796a;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = this.f10796a;
            int i = this.f10799d;
            int i3 = i >> 3;
            long j4 = 255 << ((i & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        }
        k.j0(0, this.f10799d, this.f10798c);
        k.j0(0, this.f10799d, this.f10797b);
        this.f10801f = C.c(this.f10799d) - this.f10800e;
    }

    public final boolean b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i3 = i & 127;
        int i6 = this.f10799d;
        int i7 = (i >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f10796a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j4 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = (((long) i3) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i6;
                if (E4.k.a(this.f10797b[iNumberOfTrailingZeros], obj)) {
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

    public final int c(int i) {
        int i3 = this.f10799d;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10796a;
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

    public final int d(Object obj) {
        long j4;
        long j6;
        long[] jArr;
        Object[] objArr;
        int i;
        int i3 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f10799d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.f10796a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j7 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
            long j8 = i8;
            int i15 = i8;
            int i16 = 0;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
            while (j10 != 0) {
                int iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j10) >> 3)) & i9;
                int i17 = i3;
                if (E4.k.a(this.f10797b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j10 &= j10 - 1;
                i3 = i17;
            }
            int i18 = i3;
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iC = c(i7);
                long j11 = 128;
                long j12 = 255;
                if (this.f10801f != 0 || ((this.f10796a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j4 = 128;
                    j6 = 255;
                } else {
                    int i19 = this.f10799d;
                    if (i19 <= 8 || Long.compareUnsigned(((long) this.f10800e) * 32, ((long) i19) * 25) > 0) {
                        j4 = 128;
                        j6 = 255;
                        int iD = C.d(this.f10799d);
                        long[] jArr3 = this.f10796a;
                        Object[] objArr2 = this.f10797b;
                        Object[] objArr3 = this.f10798c;
                        int i20 = this.f10799d;
                        f(iD);
                        long[] jArr4 = this.f10796a;
                        Object[] objArr4 = this.f10797b;
                        Object[] objArr5 = this.f10798c;
                        int i21 = this.f10799d;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr3[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i22];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i16) * i18;
                                int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                int iC2 = c(i23 >>> 7);
                                jArr = jArr4;
                                long j13 = i23 & 127;
                                int i24 = iC2 >> 3;
                                int i25 = (iC2 & 7) << 3;
                                long j14 = (jArr[i24] & (~(255 << i25))) | (j13 << i25);
                                jArr[i24] = j14;
                                jArr[(((iC2 - 7) & i21) + (i21 & 7)) >> 3] = j14;
                                objArr4[iC2] = obj2;
                                objArr5[iC2] = objArr3[i22];
                            } else {
                                jArr = jArr4;
                            }
                            i22++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                            i16 = 0;
                        }
                    } else {
                        long[] jArr5 = this.f10796a;
                        int i26 = this.f10799d;
                        Object[] objArr6 = this.f10797b;
                        Object[] objArr7 = this.f10798c;
                        C.a(jArr5, i26);
                        int i27 = 0;
                        int iB = -1;
                        while (i27 != i26) {
                            int i28 = i27 >> 3;
                            int i29 = (i27 & 7) << 3;
                            long j15 = (jArr5[i28] >> i29) & j12;
                            if (j15 == j11) {
                                int i30 = i27;
                                i27++;
                                iB = i30;
                            } else if (j15 != 254) {
                                i27++;
                            } else {
                                Object obj3 = objArr6[i27];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i18;
                                int i31 = iHashCode3 ^ (iHashCode3 << 16);
                                long j16 = j11;
                                int i32 = i31 >>> 7;
                                int iC3 = c(i32);
                                int i33 = i32 & i26;
                                long j17 = j12;
                                if (((iC3 - i33) & i26) / 8 == ((i27 - i33) & i26) / 8) {
                                    jArr5[i28] = (((long) (i31 & 127)) << i29) | (jArr5[i28] & (~(j17 << i29)));
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i27++;
                                    j11 = j16;
                                    j12 = j17;
                                } else {
                                    int i34 = i27;
                                    int i35 = iC3 >> 3;
                                    long j18 = jArr5[i35];
                                    int i36 = (iC3 & 7) << 3;
                                    if (((j18 >> i36) & j17) == j16) {
                                        objArr = objArr6;
                                        jArr5[i35] = ((~(j17 << i36)) & j18) | (((long) (i31 & 127)) << i36);
                                        jArr5[i28] = (jArr5[i28] & (~(j17 << i29))) | (j16 << i29);
                                        objArr[iC3] = objArr[i34];
                                        objArr[i34] = null;
                                        objArr7[iC3] = objArr7[i34];
                                        objArr7[i34] = null;
                                        iB = i34;
                                        i = iB;
                                    } else {
                                        objArr = objArr6;
                                        jArr5[i35] = ((~(j17 << i36)) & j18) | (((long) (i31 & 127)) << i36);
                                        if (iB == -1) {
                                            iB = C.b(jArr5, i34 + 1, i26);
                                        }
                                        objArr[iB] = objArr[iC3];
                                        objArr[iC3] = objArr[i34];
                                        objArr[i34] = objArr[iB];
                                        objArr7[iB] = objArr7[iC3];
                                        objArr7[iC3] = objArr7[i34];
                                        objArr7[i34] = objArr7[iB];
                                        i = i34 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    objArr6 = objArr;
                                    j12 = j17;
                                    i27 = i + 1;
                                    j11 = j16;
                                }
                            }
                        }
                        j4 = j11;
                        j6 = j12;
                        this.f10801f = C.c(this.f10799d) - this.f10800e;
                    }
                    iC = c(i7);
                }
                this.f10800e++;
                int i37 = this.f10801f;
                long[] jArr6 = this.f10796a;
                int i38 = iC >> 3;
                long j19 = jArr6[i38];
                int i39 = (iC & 7) << 3;
                if (((j19 >> i39) & j6) != j4) {
                    i14 = 0;
                }
                this.f10801f = i37 - i14;
                int i40 = this.f10799d;
                long j20 = (j19 & (~(j6 << i39))) | (j8 << i39);
                jArr6[i38] = j20;
                jArr6[(((iC - 7) & i40) + (i40 & 7)) >> 3] = j20;
                return ~iC;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i15;
            i3 = i18;
        }
    }

    public final Object e(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10799d;
        int i8 = i3 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f10796a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i7;
                if (E4.k.a(this.f10797b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i8 = i9 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f10798c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (xVar.f10800e != this.f10800e) {
            return false;
        }
        Object[] objArr = this.f10797b;
        Object[] objArr2 = this.f10798c;
        long[] jArr = this.f10796a;
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
                            Object obj2 = objArr[i7];
                            Object obj3 = objArr2[i7];
                            if (obj3 == null) {
                                if (xVar.e(obj2) != null || !xVar.b(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(xVar.e(obj2))) {
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

    public final void f(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10799d = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10796a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10801f = C.c(this.f10799d) - this.f10800e;
        this.f10797b = new Object[iMax];
        this.f10798c = new Object[iMax];
    }

    public final Object g(Object obj) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10799d;
        int i8 = i3 >>> 7;
        loop0: while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f10796a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i7;
                if (E4.k.a(this.f10797b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i8 = i9 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return h(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object h(int i) {
        this.f10800e--;
        long[] jArr = this.f10796a;
        int i3 = this.f10799d;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j4 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j4;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j4;
        this.f10797b[i] = null;
        Object[] objArr = this.f10798c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final int hashCode() {
        Object[] objArr = this.f10797b;
        Object[] objArr2 = this.f10798c;
        long[] jArr = this.f10796a;
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
                        Object obj = objArr[i7];
                        Object obj2 = objArr2[i7];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final void i(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f10797b[iD] = obj;
        this.f10798c[iD] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0070 A[DONT_INVERT, PHI: r8
  0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[LOOP:0: B:9:0x001e->B:27:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[EDGE_INSN: B:31:0x0075->B:28:0x0075 BREAK  A[LOOP:0: B:9:0x001e->B:27:0x0072], SYNTHETIC] */
    public final String toString() {
        if (this.f10800e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f10797b;
        Object[] objArr2 = this.f10798c;
        long[] jArr = this.f10796a;
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
                            Object obj = objArr[i8];
                            Object obj2 = objArr2[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i3++;
                            if (i3 < this.f10800e) {
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

    public /* synthetic */ x() {
        this(6);
    }
}
