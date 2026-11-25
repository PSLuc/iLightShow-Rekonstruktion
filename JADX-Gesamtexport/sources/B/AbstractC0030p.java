package B;

import F.C0074p;
import G0.C0110f;
import N.C0208d;
import N.C0222k;
import N.C0230o;
import N.C0235q0;
import N.InterfaceC0203a0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: B.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0030p {
    static {
        float f6 = 40;
        G4.a.c(f6, f6);
    }

    public static final void a(String str, D4.c cVar, Z.o oVar, boolean z5, G0.J j4, C0034r0 c0034r0, C0033q0 c0033q0, int i, int i3, C0074p c0074p, C0022l c0022l, p117w.m mVar, p035g0.O o6, V.a aVar, C0230o c0230o, int i6) {
        C0022l c0022l2;
        C0022l c0022l3;
        c0230o.X(945255183);
        int i7 = i6 | (c0230o.f(str) ? 4 : 2) | (c0230o.h(cVar) ? 32 : 16) | (c0230o.f(oVar) ? HueLog.LogComponent.STREAMDTLS : 128) | (c0230o.g(z5) ? 2048 : 1024) | (c0230o.g(false) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (c0230o.f(j4) ? 131072 : 65536) | (c0230o.f(c0034r0) ? 1048576 : 524288) | (c0230o.f(c0033q0) ? 8388608 : 4194304) | (c0230o.g(false) ? 67108864 : 33554432) | (c0230o.d(i) ? 536870912 : 268435456);
        int i8 = 196608 | (c0230o.d(i3) ? 4 : 2) | (c0230o.f(c0074p) ? 32 : 16) | 384 | (c0230o.f(mVar) ? 2048 : 1024) | (c0230o.f(o6) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((i7 & 306783379) == 306783378 && (74899 & i8) == 74898 && c0230o.B()) {
            c0230o.P();
            c0022l3 = c0022l;
        } else {
            c0230o.R();
            if ((i6 & 1) == 0 || c0230o.z()) {
                c0022l2 = C0022l.i;
            } else {
                c0230o.P();
                c0022l2 = c0022l;
            }
            c0230o.q();
            Object objK = c0230o.K();
            C0022l c0022l4 = c0022l2;
            Object obj = C0222k.f3714a;
            N.U u6 = N.U.f3673m;
            if (objK == obj) {
                objK = C0208d.K(new M0.w(6, str, 0L), u6);
                c0230o.f0(objK);
            }
            InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
            M0.w wVar = (M0.w) interfaceC0203a0.getValue();
            M0.w wVar2 = new M0.w(new C0110f(str, null, 6), wVar.f3454b, wVar.f3455c);
            boolean zF = c0230o.f(wVar2);
            Object objK2 = c0230o.K();
            if (zF || objK2 == obj) {
                objK2 = new C0024m(wVar2, 0, interfaceC0203a0);
                c0230o.f0(objK2);
            }
            C0208d.g((D4.a) objK2, c0230o);
            boolean z6 = (i7 & 14) == 4;
            Object objK3 = c0230o.K();
            if (z6 || objK3 == obj) {
                objK3 = C0208d.K(str, u6);
                c0230o.f0(objK3);
            }
            Object obj2 = (InterfaceC0203a0) objK3;
            c0034r0.getClass();
            M0.m mVar2 = new M0.m(0, true, 1, 1, N0.b.f3877j);
            boolean zF2 = c0230o.f(obj2) | ((i7 & 112) == 32);
            Object objK4 = c0230o.K();
            if (zF2 || objK4 == obj) {
                objK4 = new C0026n(cVar, interfaceC0203a0, obj2, 0);
                c0230o.f0(objK4);
            }
            int i9 = i8 << 9;
            AbstractC0029o0.d(wVar2, (D4.c) objK4, oVar, j4, c0074p, c0022l4, mVar, o6, true, i, i3, mVar2, c0033q0, z5, aVar, c0230o, (i7 & 896) | ((i7 >> 6) & 7168) | (i9 & 57344) | 196608 | (3670016 & i9) | (i9 & 29360128), (i7 & 57344) | ((i7 >> 15) & 896) | (i7 & 7168) | 196608);
            c0022l3 = c0022l4;
        }
        C0235q0 c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0028o(str, cVar, oVar, z5, j4, c0034r0, c0033q0, i, i3, c0074p, c0022l3, mVar, o6, aVar, i6);
        }
    }
}
