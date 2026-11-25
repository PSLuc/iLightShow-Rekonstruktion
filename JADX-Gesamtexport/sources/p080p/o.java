package p080p;

import java.util.NoSuchElementException;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10752a = C.f10714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10757f;

    public o() {
        int[] iArr = j.f10738a;
        this.f10753b = iArr;
        this.f10754c = iArr;
        e(C.f(6));
    }

    public final void a() {
        this.f10756e = 0;
        long[] jArr = this.f10752a;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = this.f10752a;
            int i = this.f10755d;
            int i3 = i >> 3;
            long j4 = 255 << ((i & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        }
        this.f10757f = C.c(this.f10755d) - this.f10756e;
    }

    public final int b(int i) {
        int i3 = this.f10755d;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10752a;
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

    public final int c(int i) {
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10755d;
        int i8 = (i3 >>> 7) & i7;
        int i9 = 0;
        while (true) {
            long[] jArr = this.f10752a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (this.f10753b[iNumberOfTrailingZeros] == i) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
        }
    }

    public final int d(int i) {
        int iC = c(i);
        if (iC >= 0) {
            return this.f10754c[iC];
        }
        throw new NoSuchElementException(p012c.k.r(i, "Cannot find value for key "));
    }

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10755d = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10752a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10757f = C.c(this.f10755d) - this.f10756e;
        this.f10753b = new int[iMax];
        this.f10754c = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0023->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (oVar.f10756e != this.f10756e) {
            return false;
        }
        int[] iArr = this.f10753b;
        int[] iArr2 = this.f10754c;
        long[] jArr = this.f10752a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128) {
                            int i7 = (i << 3) + i6;
                            if (iArr2[i7] != oVar.d(iArr[i7])) {
                                return false;
                            }
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

    public final void f(int i, int i3) {
        long j4;
        long j6;
        int i6;
        int i7;
        long j7;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int i8;
        int i9 = i;
        int i10 = -862048943;
        int iHashCode = Integer.hashCode(i9) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f10755d;
        int i15 = i12 & i14;
        int i16 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f10752a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            int i19 = 1;
            int i20 = i16;
            int i21 = 0;
            long j8 = (((-i18) >> 63) & (jArr2[i17 + 1] << (64 - i18))) | (jArr2[i17] >>> i18);
            long j9 = i13;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (j10 - 72340172838076673L) & (~j10) & (-9187201950435737472L);
            while (j11 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i14;
                int i22 = i10;
                if (this.f10753b[iNumberOfTrailingZeros] == i9) {
                    break loop0;
                }
                j11 &= j11 - 1;
                i10 = i22;
            }
            int i23 = i10;
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                int iB = b(i12);
                long j12 = 255;
                if (this.f10757f != 0 || ((this.f10752a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j4 = j9;
                    j6 = 255;
                    i6 = 1;
                    i7 = 0;
                    j7 = 128;
                } else {
                    int i24 = this.f10755d;
                    if (i24 > 8) {
                        j7 = 128;
                        if (Long.compareUnsigned(((long) this.f10756e) * 32, ((long) i24) * 25) <= 0) {
                            long[] jArr3 = this.f10752a;
                            int i25 = this.f10755d;
                            int[] iArr = this.f10753b;
                            int[] iArr2 = this.f10754c;
                            C.a(jArr3, i25);
                            int i26 = 0;
                            int iB2 = -1;
                            while (i26 != i25) {
                                int i27 = i26 >> 3;
                                int i28 = (i26 & 7) << 3;
                                long j13 = (jArr3[i27] >> i28) & j12;
                                if (j13 == 128) {
                                    int i29 = i26;
                                    i26++;
                                    iB2 = i29;
                                } else if (j13 != 254) {
                                    i26++;
                                } else {
                                    int iHashCode2 = Integer.hashCode(iArr[i26]) * i23;
                                    int i30 = iHashCode2 ^ (iHashCode2 << 16);
                                    long j14 = j12;
                                    int i31 = i30 >>> 7;
                                    int iB3 = b(i31);
                                    int i32 = i31 & i25;
                                    int i33 = i19;
                                    if (((iB3 - i32) & i25) / 8 == ((i26 - i32) & i25) / 8) {
                                        jArr3[i27] = (jArr3[i27] & (~(j14 << i28))) | (((long) (i30 & 127)) << i28);
                                        jArr3[jArr3.length - 1] = (jArr3[i21] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                    } else {
                                        int i34 = iB3 >> 3;
                                        long j15 = jArr3[i34];
                                        int i35 = (iB3 & 7) << 3;
                                        if (((j15 >> i35) & j14) == 128) {
                                            i8 = i21;
                                            jArr3[i34] = (((long) (i30 & 127)) << i35) | (j15 & (~(j14 << i35)));
                                            jArr3[i27] = (jArr3[i27] & (~(j14 << i28))) | (128 << i28);
                                            iArr[iB3] = iArr[i26];
                                            iArr[i26] = i8;
                                            iArr2[iB3] = iArr2[i26];
                                            iArr2[i26] = i8;
                                            iB2 = i26;
                                        } else {
                                            i8 = i21;
                                            jArr3[i34] = (((long) (i30 & 127)) << i35) | (j15 & (~(j14 << i35)));
                                            if (iB2 == -1) {
                                                iB2 = C.b(jArr3, i26 + 1, i25);
                                            }
                                            iArr[iB2] = iArr[iB3];
                                            iArr[iB3] = iArr[i26];
                                            iArr[i26] = iArr[iB2];
                                            iArr2[iB2] = iArr2[iB3];
                                            iArr2[iB3] = iArr2[i26];
                                            iArr2[i26] = iArr2[iB2];
                                            i26--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i8] & 72057594037927935L) | Long.MIN_VALUE;
                                        i26++;
                                        i21 = i8;
                                    }
                                    j12 = j14;
                                    i19 = i33;
                                    j9 = j9;
                                }
                            }
                            j4 = j9;
                            j6 = j12;
                            i6 = i19;
                            i7 = i21;
                            this.f10757f = C.c(this.f10755d) - this.f10756e;
                        }
                        iB = b(i12);
                    } else {
                        j7 = 128;
                    }
                    j4 = j9;
                    j6 = 255;
                    i6 = 1;
                    i7 = 0;
                    int iD = C.d(this.f10755d);
                    long[] jArr4 = this.f10752a;
                    int[] iArr3 = this.f10753b;
                    int[] iArr4 = this.f10754c;
                    int i36 = this.f10755d;
                    e(iD);
                    long[] jArr5 = this.f10752a;
                    int[] iArr5 = this.f10753b;
                    int[] iArr6 = this.f10754c;
                    int i37 = this.f10755d;
                    int i38 = 0;
                    while (i38 < i36) {
                        if (((jArr4[i38 >> 3] >> ((i38 & 7) << 3)) & 255) < j7) {
                            int i39 = iArr3[i38];
                            int iHashCode3 = Integer.hashCode(i39) * i23;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i40 >>> 7);
                            jArr = jArr5;
                            long j16 = i40 & 127;
                            int i41 = iB4 >> 3;
                            int i42 = (iB4 & 7) << 3;
                            long j17 = (jArr[i41] & (~(255 << i42))) | (j16 << i42);
                            jArr[i41] = j17;
                            jArr[(((iB4 - 7) & i37) + (i37 & 7)) >> 3] = j17;
                            iArr5[iB4] = i39;
                            iArr6[iB4] = iArr4[i38];
                        } else {
                            jArr = jArr5;
                        }
                        i38++;
                        jArr5 = jArr;
                    }
                    iB = b(i12);
                }
                this.f10756e++;
                int i43 = this.f10757f;
                long[] jArr6 = this.f10752a;
                int i44 = iB >> 3;
                long j18 = jArr6[i44];
                int i45 = (iB & 7) << 3;
                if (((j18 >> i45) & j6) == j7) {
                    i7 = i6;
                }
                this.f10757f = i43 - i7;
                int i46 = this.f10755d;
                long j19 = (j18 & (~(j6 << i45))) | (j4 << i45);
                jArr6[i44] = j19;
                jArr6[(((iB - 7) & i46) + (i46 & 7)) >> 3] = j19;
                iNumberOfTrailingZeros = ~iB;
                break;
            }
            i16 = i20 + 8;
            i15 = (i15 + i16) & i14;
            i9 = i;
            i10 = i23;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f10753b[iNumberOfTrailingZeros] = i;
        this.f10754c[iNumberOfTrailingZeros] = i3;
    }

    public final int hashCode() {
        int[] iArr = this.f10753b;
        int[] iArr2 = this.f10754c;
        long[] jArr = this.f10752a;
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
                        iHashCode += Integer.hashCode(iArr2[i7]) ^ Integer.hashCode(i8);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
  0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f10756e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.f10753b;
        int[] iArr2 = this.f10754c;
        long[] jArr = this.f10752a;
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
                            int i10 = iArr2[i8];
                            sb.append(i9);
                            sb.append("=");
                            sb.append(i10);
                            i3++;
                            if (i3 < this.f10756e) {
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
}
