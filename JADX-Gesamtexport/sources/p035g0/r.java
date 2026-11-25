package p035g0;

import B.AbstractC0013g0;
import S1.h0;
import okhttp3.internal.ws.WebSocketProtocol;
import p040h0.c;
import p040h0.d;
import p040h0.g;
import p040h0.h;
import p040h0.j;
import p080p.q;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f9076b = H.d(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f9077c = H.d(4282664004L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f9078d = H.d(4287137928L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f9079e = H.d(4291611852L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f9080f = H.d(4294967295L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f9081g = H.d(4294901760L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f9082h = H.d(4278255360L);
    public static final long i = H.d(4278190335L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f9083j = H.d(4294967040L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f9084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f9085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f9086m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9087a;

    static {
        H.d(4278255615L);
        H.d(4294902015L);
        f9084k = H.c(0);
        float[] fArr = d.f9222a;
        f9085l = H.b(0.0f, 0.0f, 0.0f, 0.0f, d.f9239s);
    }

    public /* synthetic */ r(long j4) {
        this.f9087a = j4;
    }

    public static final long a(long j4, c cVar) {
        g gVarE;
        c cVarF = f(j4);
        int i3 = cVarF.f9221c;
        int i6 = cVar.f9221c;
        if ((i3 | i6) < 0) {
            gVarE = j.e(cVarF, cVar);
        } else {
            q qVar = h.f9249a;
            int i7 = i3 | (i6 << 6);
            Object objF = qVar.f(i7);
            if (objF == null) {
                objF = j.e(cVarF, cVar);
                qVar.i(i7, objF);
            }
            gVarE = (g) objF;
        }
        return gVarE.a(j4);
    }

    public static long b(float f6, long j4) {
        return H.b(h(j4), g(j4), e(j4), f6, f(j4));
    }

    public static final boolean c(long j4, long j6) {
        return j4 == j6;
    }

    public static final float d(long j4) {
        float fZ;
        float f6;
        if ((63 & j4) == 0) {
            fZ = (float) h0.z((j4 >>> 56) & 255);
            f6 = 255.0f;
        } else {
            fZ = (float) h0.z((j4 >>> 6) & 1023);
            f6 = 1023.0f;
        }
        return fZ / f6;
    }

    public static final float e(long j4) {
        int i3;
        int i6;
        int i7;
        if ((63 & j4) == 0) {
            return ((float) h0.z((j4 >>> 32) & 255)) / 255.0f;
        }
        short s6 = (short) ((j4 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i8 = Short.MIN_VALUE & s6;
        int i9 = ((65535 & s6) >>> 10) & 31;
        int i10 = s6 & 1023;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i3 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i3 = i9 + 112;
            }
            int i12 = i3;
            i6 = i11;
            i7 = i12;
        } else {
            if (i10 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + 1056964608) - v.f9091a;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i7 = 0;
            i6 = 0;
        }
        return Float.intBitsToFloat((i7 << 23) | (i8 << 16) | i6);
    }

    public static final c f(long j4) {
        float[] fArr = d.f9222a;
        return d.f9241u[(int) (j4 & 63)];
    }

    public static final float g(long j4) {
        int i3;
        int i6;
        int i7;
        if ((63 & j4) == 0) {
            return ((float) h0.z((j4 >>> 40) & 255)) / 255.0f;
        }
        short s6 = (short) ((j4 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i8 = Short.MIN_VALUE & s6;
        int i9 = ((65535 & s6) >>> 10) & 31;
        int i10 = s6 & 1023;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i3 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i3 = i9 + 112;
            }
            int i12 = i3;
            i6 = i11;
            i7 = i12;
        } else {
            if (i10 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + 1056964608) - v.f9091a;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i7 = 0;
            i6 = 0;
        }
        return Float.intBitsToFloat((i7 << 23) | (i8 << 16) | i6);
    }

    public static final float h(long j4) {
        int i3;
        int i6;
        int i7;
        if ((63 & j4) == 0) {
            return ((float) h0.z((j4 >>> 48) & 255)) / 255.0f;
        }
        short s6 = (short) ((j4 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i8 = Short.MIN_VALUE & s6;
        int i9 = ((65535 & s6) >>> 10) & 31;
        int i10 = s6 & 1023;
        if (i9 != 0) {
            int i11 = i10 << 13;
            if (i9 == 31) {
                i3 = 255;
                if (i11 != 0) {
                    i11 |= 4194304;
                }
            } else {
                i3 = i9 + 112;
            }
            int i12 = i3;
            i6 = i11;
            i7 = i12;
        } else {
            if (i10 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i10 + 1056964608) - v.f9091a;
                return i8 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i7 = 0;
            i6 = 0;
        }
        return Float.intBitsToFloat((i7 << 23) | (i8 << 16) | i6);
    }

    public static String i(long j4) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j4));
        sb.append(", ");
        sb.append(g(j4));
        sb.append(", ");
        sb.append(e(j4));
        sb.append(", ");
        sb.append(d(j4));
        sb.append(", ");
        return AbstractC0013g0.m(sb, f(j4).f9219a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f9087a == ((r) obj).f9087a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9087a);
    }

    public final String toString() {
        return i(this.f9087a);
    }
}
