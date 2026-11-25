package p080p;

import p085q.a;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10777a = C.f10714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f10778b = k.f10739a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10781e;

    public t(int i) {
        if (i >= 0) {
            c(C.f(i));
        } else {
            a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(long j4) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j4) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i3 = i & 127;
        int i6 = this.f10779c;
        int i7 = (i >>> 7) & i6;
        int i8 = 0;
        loop0: while (true) {
            long[] jArr = this.f10777a;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j6 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j7 = (((long) i3) * 72340172838076673L) ^ j6;
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i6;
                if (this.f10778b[iNumberOfTrailingZeros] == j4) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b(int i) {
        int i3 = this.f10779c;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10777a;
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

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, C.e(i)) : 0;
        this.f10779c = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10777a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10781e = C.c(this.f10779c) - this.f10780d;
        this.f10778b = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[LOOP:0: B:14:0x001d->B:26:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (tVar.f10780d != this.f10780d) {
            return false;
        }
        long[] jArr = this.f10778b;
        long[] jArr2 = this.f10777a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr2[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i6 = 0; i6 < i3; i6++) {
                        if ((255 & j4) < 128 && !tVar.a(jArr[(i << 3) + i6])) {
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

    public final int hashCode() {
        long[] jArr = this.f10778b;
        long[] jArr2 = this.f10777a;
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
                        iHashCode = Long.hashCode(jArr[(i << 3) + i6]) + iHashCode;
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
        long[] jArr = this.f10778b;
        long[] jArr2 = this.f10777a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append((CharSequence) "]");
            break;
        }
        int i = 0;
        int i3 = 0;
        loop0: while (true) {
            long j4 = jArr2[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j4) < 128) {
                        long j6 = jArr[(i << 3) + i7];
                        if (i3 == -1) {
                            sb.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i3 != 0) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append(j6);
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
}
