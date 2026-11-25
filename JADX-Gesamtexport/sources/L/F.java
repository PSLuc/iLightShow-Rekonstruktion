package L;

import N.C0230o;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import com.spotify.protocol.WampClient;
import okhttp3.internal.http2.Http2;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N.W0 f2265a = new N.W0(E.i);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N.W0 f2266b = new N.W0(E.f2249j);

    public static final long a(D d6, long j4) {
        if (p035g0.r.c(j4, d6.f2211a)) {
            return d6.f2212b;
        }
        if (p035g0.r.c(j4, d6.f2216f)) {
            return d6.f2217g;
        }
        if (p035g0.r.c(j4, d6.f2219j)) {
            return d6.f2220k;
        }
        if (p035g0.r.c(j4, d6.f2223n)) {
            return d6.f2224o;
        }
        if (p035g0.r.c(j4, d6.f2232w)) {
            return d6.f2233x;
        }
        if (p035g0.r.c(j4, d6.f2213c)) {
            return d6.f2214d;
        }
        if (p035g0.r.c(j4, d6.f2218h)) {
            return d6.i;
        }
        if (p035g0.r.c(j4, d6.f2221l)) {
            return d6.f2222m;
        }
        if (p035g0.r.c(j4, d6.f2234y)) {
            return d6.f2235z;
        }
        if (p035g0.r.c(j4, d6.f2230u)) {
            return d6.f2231v;
        }
        boolean zC = p035g0.r.c(j4, d6.f2225p);
        long j6 = d6.f2226q;
        if (zC) {
            return j6;
        }
        if (p035g0.r.c(j4, d6.f2227r)) {
            return d6.f2228s;
        }
        if (p035g0.r.c(j4, d6.f2199D) || p035g0.r.c(j4, d6.f2201F) || p035g0.r.c(j4, d6.G) || p035g0.r.c(j4, d6.H) || p035g0.r.c(j4, d6.I) || p035g0.r.c(j4, d6.J)) {
            return j6;
        }
        int i = p035g0.r.f9086m;
        return p035g0.r.f9085l;
    }

    public static final long b(long j4, C0230o c0230o) {
        long jA = a((D) c0230o.k(f2265a), j4);
        return jA != p035g0.r.f9085l ? jA : ((p035g0.r) c0230o.k(K.f2350a)).f9087a;
    }

    public static D c(long j4, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i3) {
        return new D(j4, (i & 2) != 0 ? M.b.f3136j : j6, (i & 4) != 0 ? M.b.f3146t : j7, (i & 8) != 0 ? M.b.f3137k : j8, (i & 16) != 0 ? M.b.f3132e : j9, j10, (i & 64) != 0 ? M.b.f3138l : j11, (i & 128) != 0 ? M.b.f3148v : j12, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? M.b.f3139m : j13, j14, (i & 1024) != 0 ? M.b.f3142p : j15, (i & 2048) != 0 ? M.b.f3127F : j16, (i & 4096) != 0 ? M.b.f3143q : j17, (i & 8192) != 0 ? M.b.f3128a : j18, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? M.b.f3134g : j19, (32768 & i) != 0 ? M.b.f3149w : j20, (65536 & i) != 0 ? M.b.f3140n : j21, (131072 & i) != 0 ? M.b.f3126E : j22, (262144 & i) != 0 ? M.b.f3141o : j23, (524288 & i) != 0 ? j4 : j24, (1048576 & i) != 0 ? M.b.f3133f : j25, (2097152 & i) != 0 ? M.b.f3131d : j26, M.b.f3129b, M.b.f3135h, M.b.f3130c, M.b.i, (67108864 & i) != 0 ? M.b.f3144r : j27, (134217728 & i) != 0 ? M.b.f3145s : j28, (268435456 & i) != 0 ? M.b.f3147u : j29, (536870912 & i) != 0 ? M.b.f3150x : j30, (i3 & 8) != 0 ? M.b.f3125D : j36, (1073741824 & i) != 0 ? M.b.f3151y : j31, (i & Integer.MIN_VALUE) != 0 ? M.b.f3152z : j32, (i3 & 1) != 0 ? M.b.f3122A : j33, (i3 & 2) != 0 ? M.b.f3123B : j34, (i3 & 4) != 0 ? M.b.f3124C : j35);
    }

    public static final long d(D d6, int i) {
        switch (AbstractC0916i.d(i)) {
            case 0:
                return d6.f2223n;
            case 1:
                return d6.f2232w;
            case 2:
                return d6.f2234y;
            case 3:
                return d6.f2231v;
            case 4:
                return d6.f2215e;
            case 5:
                return d6.f2230u;
            case 6:
                return d6.f2224o;
            case 7:
                return d6.f2233x;
            case 8:
                return d6.f2235z;
            case 9:
                return d6.f2212b;
            case 10:
                return d6.f2214d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case WampClient.RequestType.SUBSCRIBED /* 33 */:
            default:
                return p035g0.r.f9085l;
            case 13:
                return d6.f2217g;
            case 14:
                return d6.i;
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                return d6.f2226q;
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                return d6.f2228s;
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                return d6.f2220k;
            case 20:
                return d6.f2222m;
            case 23:
                return d6.f2196A;
            case 24:
                return d6.f2197B;
            case 25:
                return d6.f2211a;
            case 26:
                return d6.f2213c;
            case 29:
                return d6.f2198C;
            case 30:
                return d6.f2216f;
            case 31:
                return d6.f2218h;
            case WampClient.RequestType.UNSUBSCRIBE /* 34 */:
                return d6.f2225p;
            case WampClient.RequestType.UNSUBSCRIBED /* 35 */:
                return d6.f2199D;
            case WampClient.RequestType.EVENT /* 36 */:
                return d6.f2201F;
            case 37:
                return d6.G;
            case 38:
                return d6.H;
            case 39:
                return d6.I;
            case 40:
                return d6.J;
            case 41:
                return d6.f2200E;
            case 42:
                return d6.f2229t;
            case 43:
                return d6.f2227r;
            case 44:
                return d6.f2219j;
            case 45:
                return d6.f2221l;
        }
    }

    public static final long e(int i, C0230o c0230o) {
        return d((D) c0230o.k(f2265a), i);
    }

    public static D f(long j4, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i3) {
        long j37 = (i & 1) != 0 ? M.c.f3177t : j4;
        return new D(j37, (i & 2) != 0 ? M.c.f3167j : j6, (i & 4) != 0 ? M.c.f3178u : j7, (i & 8) != 0 ? M.c.f3168k : j8, (i & 16) != 0 ? M.c.f3163e : j9, (i & 32) != 0 ? M.c.f3180w : j10, (i & 64) != 0 ? M.c.f3169l : j11, (i & 128) != 0 ? M.c.f3181x : j12, (i & HueLog.LogComponent.STREAMDTLS) != 0 ? M.c.f3170m : j13, (i & HueLog.LogComponent.APPCORE) != 0 ? M.c.H : j14, (i & 1024) != 0 ? M.c.f3173p : j15, (i & 2048) != 0 ? M.c.I : j16, (i & 4096) != 0 ? M.c.f3174q : j17, (i & 8192) != 0 ? M.c.f3159a : j18, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? M.c.f3165g : j19, (32768 & i) != 0 ? M.c.f3182y : j20, (65536 & i) != 0 ? M.c.f3171n : j21, (131072 & i) != 0 ? M.c.G : j22, (262144 & i) != 0 ? M.c.f3172o : j23, (524288 & i) != 0 ? j37 : j24, (1048576 & i) != 0 ? M.c.f3164f : j25, (2097152 & i) != 0 ? M.c.f3162d : j26, M.c.f3160b, M.c.f3166h, M.c.f3161c, M.c.i, (67108864 & i) != 0 ? M.c.f3175r : j27, (134217728 & i) != 0 ? M.c.f3176s : j28, (268435456 & i) != 0 ? M.c.f3179v : j29, (536870912 & i) != 0 ? M.c.f3183z : j30, (i3 & 8) != 0 ? M.c.f3158F : j36, (1073741824 & i) != 0 ? M.c.f3153A : j31, (i & Integer.MIN_VALUE) != 0 ? M.c.f3154B : j32, (i3 & 1) != 0 ? M.c.f3155C : j33, (i3 & 2) != 0 ? M.c.f3156D : j34, (i3 & 4) != 0 ? M.c.f3157E : j35);
    }

    public static final long g(D d6, float f6) {
        boolean zA = S0.e.a(f6, 0);
        long j4 = d6.f2225p;
        return zA ? j4 : p035g0.H.l(p035g0.r.b(((((float) Math.log(f6 + 1)) * 4.5f) + 2.0f) / 100.0f, d6.f2229t), j4);
    }
}
