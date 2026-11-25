package p080p;

import E4.k;
import java.util.NoSuchElementException;
import p085q.a;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f10790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10793f;

    public v(int i) {
        this.f10788a = C.f10714a;
        this.f10789b = a.f11187c;
        this.f10790c = j.f10738a;
        if (i >= 0) {
            d(C.f(i));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
        int i3 = this.f10791d;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10788a;
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

    public final int b(Object obj) {
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
        int i9 = this.f10791d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.f10788a;
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
                if (k.a(this.f10789b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j10 &= j10 - 1;
                i3 = i17;
            }
            int i18 = i3;
            if ((((~j7) << 6) & j7 & (-9187201950435737472L)) != 0) {
                int iA = a(i7);
                long j11 = 128;
                long j12 = 255;
                if (this.f10793f != 0 || ((this.f10788a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j4 = 128;
                    j6 = 255;
                } else {
                    int i19 = this.f10791d;
                    if (i19 <= 8 || Long.compareUnsigned(((long) this.f10792e) * 32, ((long) i19) * 25) > 0) {
                        j4 = 128;
                        j6 = 255;
                        int iD = C.d(this.f10791d);
                        long[] jArr3 = this.f10788a;
                        Object[] objArr2 = this.f10789b;
                        int[] iArr = this.f10790c;
                        int i20 = this.f10791d;
                        d(iD);
                        long[] jArr4 = this.f10788a;
                        Object[] objArr3 = this.f10789b;
                        int[] iArr2 = this.f10790c;
                        int i21 = this.f10791d;
                        int i22 = 0;
                        while (i22 < i20) {
                            if (((jArr3[i22 >> 3] >> ((i22 & 7) << 3)) & 255) < 128) {
                                Object obj2 = objArr2[i22];
                                int iHashCode2 = (obj2 != null ? obj2.hashCode() : i16) * i18;
                                int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                int iA2 = a(i23 >>> 7);
                                jArr = jArr4;
                                long j13 = i23 & 127;
                                int i24 = iA2 >> 3;
                                int i25 = (iA2 & 7) << 3;
                                long j14 = (jArr[i24] & (~(255 << i25))) | (j13 << i25);
                                jArr[i24] = j14;
                                jArr[(((iA2 - 7) & i21) + (i21 & 7)) >> 3] = j14;
                                objArr3[iA2] = obj2;
                                iArr2[iA2] = iArr[i22];
                            } else {
                                jArr = jArr4;
                            }
                            i22++;
                            jArr3 = jArr3;
                            jArr4 = jArr;
                            i16 = 0;
                        }
                    } else {
                        long[] jArr5 = this.f10788a;
                        int i26 = this.f10791d;
                        Object[] objArr4 = this.f10789b;
                        int[] iArr3 = this.f10790c;
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
                                Object obj3 = objArr4[i27];
                                int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i18;
                                int i31 = iHashCode3 ^ (iHashCode3 << 16);
                                long j16 = j11;
                                int i32 = i31 >>> 7;
                                int iA3 = a(i32);
                                int i33 = i32 & i26;
                                long j17 = j12;
                                if (((iA3 - i33) & i26) / 8 == ((i27 - i33) & i26) / 8) {
                                    jArr5[i28] = (((long) (i31 & 127)) << i29) | (jArr5[i28] & (~(j17 << i29)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i27++;
                                    j11 = j16;
                                    j12 = j17;
                                } else {
                                    int i34 = i27;
                                    int i35 = iA3 >> 3;
                                    long j18 = jArr5[i35];
                                    int i36 = (iA3 & 7) << 3;
                                    if (((j18 >> i36) & j17) == j16) {
                                        objArr = objArr4;
                                        jArr5[i35] = ((~(j17 << i36)) & j18) | (((long) (i31 & 127)) << i36);
                                        jArr5[i28] = (jArr5[i28] & (~(j17 << i29))) | (j16 << i29);
                                        objArr[iA3] = objArr[i34];
                                        objArr[i34] = null;
                                        iArr3[iA3] = iArr3[i34];
                                        iArr3[i34] = 0;
                                        iB = i34;
                                        i = iB;
                                    } else {
                                        objArr = objArr4;
                                        jArr5[i35] = ((~(j17 << i36)) & j18) | (((long) (i31 & 127)) << i36);
                                        if (iB == -1) {
                                            iB = C.b(jArr5, i34 + 1, i26);
                                        }
                                        objArr[iB] = objArr[iA3];
                                        objArr[iA3] = objArr[i34];
                                        objArr[i34] = objArr[iB];
                                        iArr3[iB] = iArr3[iA3];
                                        iArr3[iA3] = iArr3[i34];
                                        iArr3[i34] = iArr3[iB];
                                        i = i34 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    objArr4 = objArr;
                                    j12 = j17;
                                    i27 = i + 1;
                                    j11 = j16;
                                }
                            }
                        }
                        j4 = j11;
                        j6 = j12;
                        this.f10793f = C.c(this.f10791d) - this.f10792e;
                    }
                    iA = a(i7);
                }
                this.f10792e++;
                int i37 = this.f10793f;
                long[] jArr6 = this.f10788a;
                int i38 = iA >> 3;
                long j19 = jArr6[i38];
                int i39 = (iA & 7) << 3;
                if (((j19 >> i39) & j6) != j4) {
                    i14 = 0;
                }
                this.f10793f = i37 - i14;
                int i40 = this.f10791d;
                long j20 = (j19 & (~(j6 << i39))) | (j8 << i39);
                jArr6[i38] = j20;
                jArr6[(((iA - 7) & i40) + (i40 & 7)) >> 3] = j20;
                return ~iA;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i15;
            i3 = i18;
        }
    }

    public final int c(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10791d;
        int i8 = i3 >>> 7;
        while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f10788a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i7;
                if (k.a(this.f10789b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i8 = i9 + i;
        }
    }

    public final void d(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10791d = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            p089q4.k.k0(jArr);
        }
        this.f10788a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10793f = C.c(this.f10791d) - this.f10792e;
        this.f10789b = new Object[iMax];
        this.f10790c = new int[iMax];
    }

    public final void e(int i) {
        this.f10792e--;
        long[] jArr = this.f10788a;
        int i3 = this.f10791d;
        int i6 = i >> 3;
        int i7 = (i & 7) << 3;
        long j4 = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        jArr[i6] = j4;
        jArr[(((i - 7) & i3) + (i3 & 7)) >> 3] = j4;
        this.f10789b[i] = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (vVar.f10792e == this.f10792e) {
                Object[] objArr = this.f10789b;
                int[] iArr = this.f10790c;
                long[] jArr = this.f10788a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                while (true) {
                    long j4 = jArr[i];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i - length)) >>> 31);
                        for (int i6 = 0; i6 < i3; i6++) {
                            if ((255 & j4) < 128) {
                                int i7 = (i << 3) + i6;
                                Object obj2 = objArr[i7];
                                int i8 = iArr[i7];
                                int iC = vVar.c(obj2);
                                if (iC < 0) {
                                    throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                                }
                                if (i8 != vVar.f10790c[iC]) {
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i3 != 8) {
                            return true;
                        }
                    }
                    if (i == length) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f10789b;
        int[] iArr = this.f10790c;
        long[] jArr = this.f10788a;
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
                        iHashCode += Integer.hashCode(iArr[i7]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f10792e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f10789b;
        int[] iArr = this.f10790c;
        long[] jArr = this.f10788a;
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
                            int i9 = iArr[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i9);
                            i3++;
                            if (i3 < this.f10792e) {
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
        k.e("s.append('}').toString()", string);
        return string;
    }

    public /* synthetic */ v() {
        this(6);
    }
}
