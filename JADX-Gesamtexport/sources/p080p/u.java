package p080p;

import java.util.NoSuchElementException;
import p085q.a;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f10782a = C.f10714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f10783b = a.f11187c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f10784c = g.f10735a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10787f;

    public u() {
        d(C.f(6));
    }

    public final void a() {
        this.f10786e = 0;
        long[] jArr = this.f10782a;
        if (jArr != C.f10714a) {
            k.k0(jArr);
            long[] jArr2 = this.f10782a;
            int i = this.f10785d;
            int i3 = i >> 3;
            long j4 = 255 << ((i & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j4)) | j4;
        }
        k.j0(0, this.f10785d, this.f10783b);
        this.f10787f = C.c(this.f10785d) - this.f10786e;
    }

    public final int b(int i) {
        int i3 = this.f10785d;
        int i6 = i & i3;
        int i7 = 0;
        while (true) {
            long[] jArr = this.f10782a;
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

    public final int c(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i6 = i3 & 127;
        int i7 = this.f10785d;
        int i8 = i3 >>> 7;
        while (true) {
            int i9 = i8 & i7;
            long[] jArr = this.f10782a;
            int i10 = i9 >> 3;
            int i11 = (i9 & 7) << 3;
            long j4 = ((jArr[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr[i10] >>> i11);
            long j6 = (((long) i6) * 72340172838076673L) ^ j4;
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i9) & i7;
                if (E4.k.a(this.f10783b[iNumberOfTrailingZeros], obj)) {
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
        this.f10785d = iMax;
        if (iMax == 0) {
            jArr = C.f10714a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            k.k0(jArr);
        }
        this.f10782a = jArr;
        int i3 = iMax >> 3;
        long j4 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j4)) | j4;
        this.f10787f = C.c(this.f10785d) - this.f10786e;
        this.f10783b = new Object[iMax];
        this.f10784c = new float[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[LOOP:0: B:14:0x0023->B:31:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f10786e != this.f10786e) {
            return false;
        }
        Object[] objArr = this.f10783b;
        float[] fArr = this.f10784c;
        long[] jArr = this.f10782a;
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
                            Object obj2 = objArr[i7];
                            float f6 = fArr[i7];
                            int iC = uVar.c(obj2);
                            if (iC < 0) {
                                throw new NoSuchElementException("There is no key " + obj2 + " in the map");
                            }
                            if (f6 != uVar.f10784c[iC]) {
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

    public final int hashCode() {
        Object[] objArr = this.f10783b;
        float[] fArr = this.f10784c;
        long[] jArr = this.f10782a;
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
                        iHashCode += Float.hashCode(fArr[i7]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.f10786e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f10783b;
        float[] fArr = this.f10784c;
        long[] jArr = this.f10782a;
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
                            float f6 = fArr[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f6);
                            i3++;
                            if (i3 < this.f10786e) {
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
