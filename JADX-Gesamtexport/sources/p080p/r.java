package p080p;

import p085q.a;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10770e;

    public r(int i) {
        this.f10766a = C.f10714a;
        this.f10767b = j.f10738a;
        if (i >= 0) {
            e(C.f(i));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final boolean a(int i) {
        long j4;
        boolean z5;
        long j6;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i3 = this.f10769d;
        int i6 = -862048943;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i7 = iHashCode ^ (iHashCode << 16);
        int i8 = i7 >>> 7;
        int i9 = i7 & 127;
        int i10 = this.f10768c;
        int i11 = i8 & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f10766a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            boolean z6 = true;
            int i15 = i12;
            long j7 = (((-i14) >> 63) & (jArr2[i13 + 1] << (64 - i14))) | (jArr2[i13] >>> i14);
            long j8 = i9;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                int i16 = i6;
                if (this.f10767b[iNumberOfTrailingZeros] == i) {
                    z5 = true;
                    break loop0;
                }
                j10 &= j10 - 1;
                i6 = i16;
            }
            int i17 = i6;
            long j11 = j7 & ((~j7) << 6) & (-9187201950435737472L);
            char c6 = '\b';
            if (j11 != 0) {
                int iD = d(i8);
                long j12 = 255;
                if (this.f10770e != 0 || ((this.f10766a[iD >> 3] >> ((iD & 7) << 3)) & 255) == 254) {
                    j4 = 255;
                    z5 = true;
                    j6 = 128;
                } else {
                    int i18 = this.f10768c;
                    if (i18 > 8) {
                        j6 = 128;
                        if (Long.compareUnsigned(((long) this.f10769d) * 32, ((long) i18) * 25) <= 0) {
                            long[] jArr3 = this.f10766a;
                            int i19 = this.f10768c;
                            int[] iArr2 = this.f10767b;
                            C.a(jArr3, i19);
                            int i20 = 0;
                            int iB = -1;
                            while (i20 != i19) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr3[i21] >> i22) & j12;
                                if (j13 == 128) {
                                    iB = i20;
                                    i20++;
                                } else if (j13 != 254) {
                                    i20++;
                                } else {
                                    int iHashCode2 = Integer.hashCode(iArr2[i20]) * i17;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    c6 = c6;
                                    int i24 = i23 >>> 7;
                                    int iD2 = d(i24);
                                    int i25 = i24 & i19;
                                    long j14 = j12;
                                    if (((iD2 - i25) & i19) / 8 == ((i20 - i25) & i19) / 8) {
                                        jArr3[i21] = (jArr3[i21] & (~(j14 << i22))) | (((long) (i23 & 127)) << i22);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                    } else {
                                        int i26 = iD2 >> 3;
                                        long j15 = jArr3[i26];
                                        int i27 = (iD2 & 7) << 3;
                                        if (((j15 >> i27) & j14) == 128) {
                                            iArr = iArr2;
                                            jArr3[i26] = ((~(j14 << i27)) & j15) | (((long) (i23 & 127)) << i27);
                                            jArr3[i21] = (jArr3[i21] & (~(j14 << i22))) | (128 << i22);
                                            iArr[iD2] = iArr[i20];
                                            iArr[i20] = 0;
                                            iB = i20;
                                        } else {
                                            iArr = iArr2;
                                            jArr3[i26] = ((~(j14 << i27)) & j15) | (((long) (i23 & 127)) << i27);
                                            if (iB == -1) {
                                                iB = C.b(jArr3, i20 + 1, i19);
                                            }
                                            iArr[iB] = iArr[iD2];
                                            iArr[iD2] = iArr[i20];
                                            iArr[i20] = iArr[iB];
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i20++;
                                        iArr2 = iArr;
                                    }
                                    j12 = j14;
                                }
                            }
                            j4 = j12;
                            this.f10770e = C.c(this.f10768c) - this.f10769d;
                        }
                        z5 = z6;
                        iD = d(i8);
                    } else {
                        j6 = 128;
                    }
                    j4 = 255;
                    int iD3 = C.d(this.f10768c);
                    long[] jArr4 = this.f10766a;
                    int[] iArr3 = this.f10767b;
                    int i28 = this.f10768c;
                    e(iD3);
                    long[] jArr5 = this.f10766a;
                    int[] iArr4 = this.f10767b;
                    int i29 = this.f10768c;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr4[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < j6) {
                            int i31 = iArr3[i30];
                            int iHashCode3 = Integer.hashCode(i31) * i17;
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iD4 = d(i32 >>> 7);
                            jArr = jArr5;
                            long j16 = i32 & 127;
                            int i33 = iD4 >> 3;
                            int i34 = (iD4 & 7) << 3;
                            long j17 = (jArr[i33] & (~(255 << i34))) | (j16 << i34);
                            jArr[i33] = j17;
                            jArr[(((iD4 - 7) & i29) + (i29 & 7)) >> 3] = j17;
                            iArr4[iD4] = i31;
                        } else {
                            jArr = jArr5;
                        }
                        i30++;
                        z6 = z6;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    z5 = z6;
                    iD = d(i8);
                }
                iNumberOfTrailingZeros = iD;
                this.f10769d++;
                int i35 = this.f10770e;
                long[] jArr6 = this.f10766a;
                int i36 = iNumberOfTrailingZeros >> 3;
                long j18 = jArr6[i36];
                int i37 = (iNumberOfTrailingZeros & 7) << 3;
                this.f10770e = i35 - (((j18 >> i37) & j4) == j6 ? z5 : 0);
                int i38 = this.f10768c;
                long j19 = (j18 & (~(j4 << i37))) | (j8 << i37);
                jArr6[i36] = j19;
                jArr6[(((iNumberOfTrailingZeros - 7) & i38) + (i38 & 7)) >> 3] = j19;
                break;
            }
            i12 = i15 + 8;
            i11 = (i11 + i12) & i10;
            i6 = i17;
        }
        this.f10767b[iNumberOfTrailingZeros] = i;
        if (this.f10769d != i3) {
            return z5;
        }
        return false;
    }

    public final void b() {
        this.f10769d = 0;
        long[] jArr = this.f10766a;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = this.f10766a;
            int i = this.f10768c;
            int i3 = i >> 3;
            long j4 = 255 << ((i & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        }
        this.f10770e = C.c(this.f10768c) - this.f10769d;
    }

    public final boolean c(int i) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10768c;
        int i8 = (i3 >>> 7) & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr = this.f10766a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                if (this.f10767b[iNumberOfTrailingZeros] == i) {
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
        int i3 = this.f10768c;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10766a;
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

    public final void e(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10768c = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10766a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10770e = C.c(this.f10768c) - this.f10769d;
        this.f10767b = new int[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f10769d != this.f10769d) {
            return false;
        }
        int[] iArr = this.f10767b;
        long[] jArr = this.f10766a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128 && !rVar.c(iArr[(i << 3) + i6])) {
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
        this.f10769d--;
        long[] jArr = this.f10766a;
        int i3 = this.f10768c;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j4 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j4;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j4;
    }

    public final int hashCode() {
        int[] iArr = this.f10767b;
        long[] jArr = this.f10766a;
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
                        iHashCode = Integer.hashCode(iArr[(i << 3) + i6]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT, PHI: r5
  0x005b: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0024, B:18:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x0016->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f10767b;
        long[] jArr = this.f10766a;
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
                        int i8 = iArr[(i << 3) + i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(i8);
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

    public /* synthetic */ r() {
        this(6);
    }
}
