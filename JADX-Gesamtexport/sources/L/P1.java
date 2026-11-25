package L;

import F.C0074p;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;
import p096s.AbstractC0909d;
import p123x.AbstractC1084q;

/* JADX INFO: loaded from: classes.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P1 f2454a = new P1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f2455b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f2456c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f2457d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f2458e = 2;

    public static p123x.O c() {
        float f6 = S1.f2489b;
        return new p123x.O(f6, S1.f2491d, f6, 0);
    }

    public final void a(boolean z5, p117w.m mVar, K1 k3, p035g0.M m6, C0230o c0230o, int i) {
        long j4;
        c0230o.X(918564008);
        int i3 = i | (c0230o.g(z5) ? 4 : 2) | (c0230o.g(false) ? 32 : 16) | (c0230o.f(mVar) ? HueLog.LogComponent.STREAMDTLS : 128) | (c0230o.f(k3) ? 2048 : 1024) | (c0230o.f(m6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((74899 & i3) == 74898 && c0230o.B()) {
            c0230o.P();
        } else {
            c0230o.R();
            if ((i & 1) != 0 && !c0230o.z()) {
                c0230o.P();
            }
            c0230o.q();
            Z.l lVar = Z.l.f5957a;
            c0230o.W(-1921164569);
            InterfaceC0203a0 interfaceC0203a0Q = p027e3.a.Q(mVar, c0230o, ((i3 & 8190) >> 6) & 14);
            if (z5) {
                j4 = ((Boolean) interfaceC0203a0Q.getValue()).booleanValue() ? k3.f2373e : k3.f2374f;
            } else {
                j4 = k3.f2375g;
            }
            N.V0 v0A = p090r.M.a(j4, AbstractC0909d.k(150, 6, null), null, c0230o, 48, 12);
            c0230o.p(false);
            AbstractC1084q.a(Z.a.a(androidx.compose.foundation.a.b(lVar, ((p035g0.r) v0A.getValue()).f9087a, m6), new O1(z5, mVar, k3, f2458e, f2457d)), c0230o, 0);
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new L1(this, z5, mVar, k3, m6, i);
        }
    }

    public final void b(String str, D4.e eVar, boolean z5, C0074p c0074p, p117w.m mVar, V.a aVar, p035g0.M m6, K1 k3, p123x.O o6, V.a aVar2, C0230o c0230o, int i) {
        String str2;
        int i3;
        C0074p c0074p2;
        p123x.O o7;
        int i6;
        V.a aVarB;
        p123x.O o8;
        V.a aVar3;
        c0230o.X(289640444);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (c0230o.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c0230o.h(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c0230o.g(z5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c0230o.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            c0074p2 = c0074p;
            i3 |= c0230o.f(c0074p2) ? 16384 : 8192;
        } else {
            c0074p2 = c0074p;
        }
        if ((i & 196608) == 0) {
            i3 |= c0230o.f(mVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c0230o.g(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c0230o.h(aVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c0230o.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c0230o.h(null) ? 536870912 : 268435456;
        }
        int i7 = 100663296 | (c0230o.h(null) ? 4 : 2) | (c0230o.h(null) ? 32 : 16) | (c0230o.h(null) ? 256 : 128) | (c0230o.h(null) ? 2048 : 1024) | (c0230o.f(m6) ? 16384 : 8192) | (c0230o.f(k3) ? 131072 : 65536) | 13107200;
        if ((306783379 & i3) == 306783378 && (38347923 & i7) == 38347922 && c0230o.B()) {
            c0230o.P();
            o8 = o6;
            aVar3 = aVar2;
        } else {
            c0230o.R();
            if ((i & 1) == 0 || c0230o.z()) {
                if (aVar == null) {
                    float f6 = S1.f2489b;
                    o7 = new p123x.O(f6, f6, f6, f6);
                } else {
                    float f7 = S1.f2489b;
                    float f8 = W1.f2557a;
                    o7 = new p123x.O(f7, f8, f7, f8);
                }
                i6 = i7 & (-3670017);
                aVarB = V.b.b(c0230o, -435523791, new M1(z5, mVar, k3, m6));
            } else {
                c0230o.P();
                i6 = i7 & (-3670017);
                o7 = o6;
                aVarB = aVar2;
            }
            c0230o.q();
            int i8 = i3 << 3;
            int i9 = i3 >> 3;
            int i10 = i3 >> 9;
            int i11 = i6 << 21;
            int i12 = ((i6 << 3) & 3670016) | ((i6 >> 9) & 14) | ((i3 >> 6) & 112) | (i3 & 896) | (i10 & 7168) | (i9 & 57344) | 12582912;
            p123x.O o9 = o7;
            S1.a(str2, eVar, c0074p2, aVar, z5, mVar, o9, k3, aVarB, c0230o, (i8 & 896) | (i8 & 112) | 6 | (i9 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), i12);
            o8 = o9;
            aVar3 = aVarB;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new N1(this, str, eVar, z5, c0074p, mVar, aVar, m6, k3, o8, aVar3, i);
        }
    }
}
