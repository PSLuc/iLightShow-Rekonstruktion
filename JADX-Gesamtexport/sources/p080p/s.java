package p080p;

import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f10772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10776f;

    public final int a(int i) {
        int i3 = this.f10774d;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10771a;
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

    public final Object b(long j4) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j4) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i3 = i & 127;
        int i6 = this.f10774d;
        int i7 = (i >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f10771a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j6 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j7 = (((long) i3) * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                if (this.f10772b[iNumberOfTrailingZeros] == j4) {
                    break loop0;
                }
            }
            if ((j6 & ((~j6) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f10773c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10774d = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10771a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10776f = C.c(this.f10774d) - this.f10775e;
        this.f10772b = new long[iMax];
        this.f10773c = new Object[iMax];
    }

    public final void d(long j4, w wVar) {
        long j6;
        int i;
        int i3;
        long j7;
        int iNumberOfTrailingZeros;
        long[] jArr;
        long[] jArr2;
        int i6;
        int i7 = -862048943;
        int iHashCode = Long.hashCode(j4) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f10774d;
        int i12 = i9 & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f10771a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            int i16 = 1;
            long j8 = ((jArr3[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr3[i14] >>> i15);
            long j9 = i10;
            int i17 = i13;
            int i18 = 0;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
                int i19 = i7;
                if (this.f10772b[iNumberOfTrailingZeros] == j4) {
                    break loop0;
                }
                j11 &= j11 - 1;
                i7 = i19;
            }
            int i20 = i7;
            char c6 = '\b';
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iA = a(i9);
                long j12 = 255;
                if (this.f10776f != 0 || ((this.f10771a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j6 = 255;
                    i = 0;
                    i3 = 1;
                    j7 = 128;
                } else {
                    int i21 = this.f10774d;
                    if (i21 <= 8 || Long.compareUnsigned(((long) this.f10775e) * 32, ((long) i21) * 25) > 0) {
                        j6 = 255;
                        i = 0;
                        i3 = 1;
                        j7 = 128;
                        int iD = C.d(this.f10774d);
                        long[] jArr4 = this.f10771a;
                        long[] jArr5 = this.f10772b;
                        Object[] objArr = this.f10773c;
                        int i22 = this.f10774d;
                        c(iD);
                        long[] jArr6 = this.f10771a;
                        long[] jArr7 = this.f10772b;
                        Object[] objArr2 = this.f10773c;
                        int i23 = this.f10774d;
                        int i24 = 0;
                        while (i24 < i22) {
                            if (((jArr4[i24 >> 3] >> ((i24 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr5[i24];
                                int iHashCode2 = Long.hashCode(j13) * i20;
                                int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                jArr = jArr6;
                                int iA2 = a(i25 >>> 7);
                                long j14 = i25 & 127;
                                int i26 = iA2 >> 3;
                                int i27 = (iA2 & 7) << 3;
                                long j15 = (jArr[i26] & (~(255 << i27))) | (j14 << i27);
                                jArr[i26] = j15;
                                jArr[(((iA2 - 7) & i23) + (i23 & 7)) >> 3] = j15;
                                jArr7[iA2] = j13;
                                objArr2[iA2] = objArr[i24];
                            } else {
                                jArr = jArr6;
                            }
                            i24++;
                            jArr6 = jArr;
                            jArr4 = jArr4;
                        }
                    } else {
                        long[] jArr8 = this.f10771a;
                        int i28 = this.f10774d;
                        long[] jArr9 = this.f10772b;
                        Object[] objArr3 = this.f10773c;
                        C.a(jArr8, i28);
                        int i29 = 0;
                        int iB = -1;
                        j7 = 128;
                        while (i29 != i28) {
                            int i30 = i29 >> 3;
                            int i31 = (i29 & 7) << 3;
                            long j16 = (jArr8[i30] >> i31) & j12;
                            if (j16 == 128) {
                                iB = i29;
                                i29++;
                            } else if (j16 != 254) {
                                i29++;
                            } else {
                                int iHashCode3 = Long.hashCode(jArr9[i29]) * i20;
                                int i32 = iHashCode3 ^ (iHashCode3 << 16);
                                char c7 = c6;
                                int i33 = i32 >>> 7;
                                int iA3 = a(i33);
                                int i34 = i33 & i28;
                                long j17 = j12;
                                if (((iA3 - i34) & i28) / 8 == ((i29 - i34) & i28) / 8) {
                                    int i35 = i18;
                                    int i36 = i16;
                                    jArr8[i30] = (((long) (i32 & 127)) << i31) | (jArr8[i30] & (~(j17 << i31)));
                                    jArr8[jArr8.length - i36] = (jArr8[i35] & 72057594037927935L) | Long.MIN_VALUE;
                                    i29++;
                                    i16 = i36;
                                    c6 = c7;
                                    j12 = j17;
                                    i18 = i35;
                                } else {
                                    int i37 = i18;
                                    int i38 = i16;
                                    int i39 = iA3 >> 3;
                                    long j18 = jArr8[i39];
                                    int i40 = (iA3 & 7) << 3;
                                    if (((j18 >> i40) & j17) == 128) {
                                        jArr2 = jArr9;
                                        int i41 = i29;
                                        jArr8[i39] = ((~(j17 << i40)) & j18) | (((long) (i32 & 127)) << i40);
                                        jArr8[i30] = (jArr8[i30] & (~(j17 << i31))) | (128 << i31);
                                        jArr2[iA3] = jArr2[i41];
                                        jArr2[i41] = 0;
                                        objArr3[iA3] = objArr3[i41];
                                        objArr3[i41] = null;
                                        i6 = i41;
                                        iB = i6;
                                    } else {
                                        int i42 = i29;
                                        jArr2 = jArr9;
                                        jArr8[i39] = ((~(j17 << i40)) & j18) | (((long) (i32 & 127)) << i40);
                                        if (iB == -1) {
                                            iB = C.b(jArr8, i42 + 1, i28);
                                        }
                                        jArr2[iB] = jArr2[iA3];
                                        jArr2[iA3] = jArr2[i42];
                                        jArr2[i42] = jArr2[iB];
                                        objArr3[iB] = objArr3[iA3];
                                        objArr3[iA3] = objArr3[i42];
                                        objArr3[i42] = objArr3[iB];
                                        i6 = i42 - 1;
                                    }
                                    jArr8[jArr8.length - 1] = (jArr8[i37] & 72057594037927935L) | Long.MIN_VALUE;
                                    i29 = i6 + 1;
                                    c6 = c7;
                                    jArr9 = jArr2;
                                    j12 = j17;
                                    i18 = i37;
                                    i16 = i38;
                                }
                            }
                        }
                        j6 = j12;
                        i = i18;
                        i3 = i16;
                        this.f10776f = C.c(this.f10774d) - this.f10775e;
                    }
                    iA = a(i9);
                }
                iNumberOfTrailingZeros = iA;
                this.f10775e++;
                int i43 = this.f10776f;
                long[] jArr10 = this.f10771a;
                int i44 = iNumberOfTrailingZeros >> 3;
                long j19 = jArr10[i44];
                int i45 = (iNumberOfTrailingZeros & 7) << 3;
                if (((j19 >> i45) & j6) == j7) {
                    i = i3;
                }
                this.f10776f = i43 - i;
                int i46 = this.f10774d;
                long j20 = (j19 & (~(j6 << i45))) | (j9 << i45);
                jArr10[i44] = j20;
                jArr10[(((iNumberOfTrailingZeros - 7) & i46) + (i46 & 7)) >> 3] = j20;
                break;
            }
            i13 = i17 + 8;
            i12 = (i12 + i13) & i11;
            i7 = i20;
        }
        this.f10772b[iNumberOfTrailingZeros] = j4;
        this.f10773c[iNumberOfTrailingZeros] = wVar;
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        boolean z5;
        long[] jArr3;
        long[] jArr4;
        long j4;
        long j6;
        Object[] objArr2;
        int i;
        if (obj != this) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (sVar.f10775e == this.f10775e) {
                    long[] jArr5 = this.f10772b;
                    Object[] objArr3 = this.f10773c;
                    long[] jArr6 = this.f10771a;
                    int length = jArr6.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j7 = jArr6[i3];
                            char c6 = 7;
                            long j8 = -9187201950435737472L;
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i3 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j7 & 255) < 128) {
                                        int i9 = (i3 << 3) + i8;
                                        jArr4 = jArr5;
                                        long j9 = jArr4[i9];
                                        Object obj2 = objArr3[i9];
                                        if (obj2 != null) {
                                            jArr3 = jArr6;
                                            j4 = j7;
                                            j6 = j8;
                                            objArr2 = objArr3;
                                            if (!obj2.equals(sVar.b(j9))) {
                                                return false;
                                            }
                                        } else {
                                            if (sVar.b(j9) != null) {
                                                return false;
                                            }
                                            int iHashCode = Long.hashCode(j9) * (-862048943);
                                            int i10 = iHashCode ^ (iHashCode << 16);
                                            int i11 = i10 & 127;
                                            j6 = j8;
                                            int i12 = sVar.f10774d;
                                            int i13 = (i10 >>> 7) & i12;
                                            int i14 = 0;
                                            while (true) {
                                                long[] jArr7 = sVar.f10771a;
                                                int i15 = i13 >> 3;
                                                jArr3 = jArr6;
                                                int i16 = (i13 & 7) << 3;
                                                long j10 = jArr7[i15] >>> i16;
                                                long j11 = jArr7[i15 + 1] << (64 - i16);
                                                int i17 = i13;
                                                objArr2 = objArr3;
                                                long j12 = j10 | (j11 & ((-i16) >> 63));
                                                j4 = j7;
                                                long j13 = (((long) i11) * 72340172838076673L) ^ j12;
                                                for (long j14 = (j13 - 72340172838076673L) & (~j13) & j6; j14 != 0; j14 &= j14 - 1) {
                                                    int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i12;
                                                    if (sVar.f10772b[iNumberOfTrailingZeros] == j9) {
                                                        i = iNumberOfTrailingZeros;
                                                        break;
                                                    }
                                                }
                                                if ((j12 & ((~j12) << 6) & j6) != 0) {
                                                    i = -1;
                                                    break;
                                                }
                                                i14 += 8;
                                                i13 = (i17 + i14) & i12;
                                                objArr3 = objArr2;
                                                jArr6 = jArr3;
                                                j7 = j4;
                                            }
                                            if (!(i >= 0)) {
                                                return false;
                                            }
                                        }
                                    } else {
                                        jArr3 = jArr6;
                                        jArr4 = jArr5;
                                        j4 = j7;
                                        j6 = j8;
                                        objArr2 = objArr3;
                                    }
                                    j7 = j4 >> i6;
                                    i8++;
                                    c6 = c6;
                                    objArr3 = objArr2;
                                    jArr5 = jArr4;
                                    j8 = j6;
                                    jArr6 = jArr3;
                                    i6 = i6;
                                }
                                jArr = jArr6;
                                jArr2 = jArr5;
                                int i18 = i6;
                                z5 = true;
                                objArr = objArr3;
                                if (i7 != i18) {
                                    return true;
                                }
                            } else {
                                jArr = jArr6;
                                jArr2 = jArr5;
                                objArr = objArr3;
                                z5 = true;
                            }
                            if (i3 == length) {
                                return z5;
                            }
                            i3++;
                            objArr3 = objArr;
                            jArr5 = jArr2;
                            jArr6 = jArr;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f10772b;
        Object[] objArr = this.f10773c;
        long[] jArr2 = this.f10771a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j4 = jArr2[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i6 = 0; i6 < i3; i6++) {
                    if ((255 & j4) < 128) {
                        int i7 = (i << 3) + i6;
                        long j6 = jArr[i7];
                        Object obj = objArr[i7];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j6);
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

    public final String toString() {
        int i;
        int i3;
        if (this.f10775e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f10772b;
        Object[] objArr = this.f10773c;
        long[] jArr2 = this.f10771a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                long j4 = jArr2[i6];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j4) < 128) {
                            int i10 = (i6 << 3) + i9;
                            i3 = i6;
                            long j6 = jArr[i10];
                            Object obj = objArr[i10];
                            sb.append(j6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i7++;
                            if (i7 < this.f10775e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i6;
                        }
                        j4 >>= 8;
                        i9++;
                        i6 = i3;
                    }
                    int i11 = i6;
                    if (i8 != 8) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i6;
                }
                if (i == length) {
                    break;
                }
                i6 = i + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        E4.k.e("s.append('}').toString()", string);
        return string;
    }
}
