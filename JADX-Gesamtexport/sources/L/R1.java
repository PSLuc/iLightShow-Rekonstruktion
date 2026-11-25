package L;

import N.C0208d;
import N.C0230o;
import N.InterfaceC0203a0;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class R1 extends E4.l implements D4.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ V.a f2473h;
    public final /* synthetic */ K1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D4.e f2476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p123x.O f2477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V.a f2479o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(V.a aVar, K1 k3, boolean z5, p117w.m mVar, String str, D4.e eVar, p123x.O o6, boolean z6, G0.J j4, G0.J j6, V.a aVar2) {
        super(7);
        this.f2473h = aVar;
        this.i = k3;
        this.f2474j = z5;
        this.f2475k = mVar;
        this.f2476l = eVar;
        this.f2477m = o6;
        this.f2478n = z6;
        this.f2479o = aVar2;
    }

    @Override // D4.h
    public final Object f(Float f6, p035g0.r rVar, p035g0.r rVar2, Float f7, Float f8, C0230o c0230o, Integer num) {
        int i;
        long j4;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        float fFloatValue = f6.floatValue();
        float fFloatValue2 = f7.floatValue();
        float fFloatValue3 = f8.floatValue();
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            i = (c0230o.c(fFloatValue) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        int i3 = iIntValue & 48;
        long j11 = rVar.f9087a;
        if (i3 == 0) {
            i |= c0230o.e(j11) ? 32 : 16;
        }
        int i6 = iIntValue & 384;
        long j12 = rVar2.f9087a;
        if (i6 == 0) {
            i |= c0230o.e(j12) ? HueLog.LogComponent.STREAMDTLS : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= c0230o.c(fFloatValue2) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= c0230o.c(fFloatValue3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i7 = i;
        if ((74899 & i7) == 74898 && c0230o.B()) {
            c0230o.P();
        } else {
            V.a aVar = this.f2473h;
            V.a aVarB = aVar != null ? V.b.b(c0230o, -382297919, new Q1(fFloatValue, j12, aVar, this.f2478n, j11)) : null;
            K1 k3 = this.i;
            c0230o.W(653850713);
            p117w.m mVar = this.f2475k;
            InterfaceC0203a0 interfaceC0203a0Q = p027e3.a.Q(mVar, c0230o, 0);
            boolean z5 = this.f2474j;
            if (z5) {
                j4 = ((Boolean) interfaceC0203a0Q.getValue()).booleanValue() ? k3.f2357B : k3.f2358C;
            } else {
                j4 = k3.f2359D;
            }
            InterfaceC0203a0 interfaceC0203a0N = C0208d.N(new p035g0.r(j4), c0230o);
            c0230o.p(false);
            long j13 = ((p035g0.r) interfaceC0203a0N.getValue()).f9087a;
            c0230o.W(129569364);
            InterfaceC0203a0 interfaceC0203a0Q2 = p027e3.a.Q(mVar, c0230o, 0);
            if (z5) {
                j6 = ((Boolean) interfaceC0203a0Q2.getValue()).booleanValue() ? k3.J : k3.f2362K;
            } else {
                j6 = k3.f2363L;
            }
            InterfaceC0203a0 interfaceC0203a0N2 = C0208d.N(new p035g0.r(j6), c0230o);
            c0230o.p(false);
            long j14 = ((p035g0.r) interfaceC0203a0N2.getValue()).f9087a;
            c0230o.W(1575329427);
            InterfaceC0203a0 interfaceC0203a0Q3 = p027e3.a.Q(mVar, c0230o, 0);
            if (z5) {
                j7 = ((Boolean) interfaceC0203a0Q3.getValue()).booleanValue() ? k3.f2365N : k3.f2366O;
            } else {
                j7 = k3.f2367P;
            }
            InterfaceC0203a0 interfaceC0203a0N3 = C0208d.N(new p035g0.r(j7), c0230o);
            c0230o.p(false);
            long j15 = ((p035g0.r) interfaceC0203a0N3.getValue()).f9087a;
            c0230o.W(925127045);
            InterfaceC0203a0 interfaceC0203a0Q4 = p027e3.a.Q(mVar, c0230o, 0);
            if (z5) {
                j8 = ((Boolean) interfaceC0203a0Q4.getValue()).booleanValue() ? k3.f2383p : k3.f2384q;
            } else {
                j8 = k3.f2385r;
            }
            InterfaceC0203a0 interfaceC0203a0N4 = C0208d.N(new p035g0.r(j8), c0230o);
            c0230o.p(false);
            long j16 = ((p035g0.r) interfaceC0203a0N4.getValue()).f9087a;
            c0230o.W(-109504137);
            InterfaceC0203a0 interfaceC0203a0Q5 = p027e3.a.Q(mVar, c0230o, 0);
            if (z5) {
                j9 = ((Boolean) interfaceC0203a0Q5.getValue()).booleanValue() ? k3.f2387t : k3.f2388u;
            } else {
                j9 = k3.f2389v;
            }
            InterfaceC0203a0 interfaceC0203a0N5 = C0208d.N(new p035g0.r(j9), c0230o);
            c0230o.p(false);
            long j17 = ((p035g0.r) interfaceC0203a0N5.getValue()).f9087a;
            c0230o.W(1464709698);
            InterfaceC0203a0 interfaceC0203a0Q6 = p027e3.a.Q(mVar, c0230o, 0);
            if (z5) {
                j10 = ((Boolean) interfaceC0203a0Q6.getValue()).booleanValue() ? k3.f2361F : k3.G;
            } else {
                j10 = k3.H;
            }
            InterfaceC0203a0 interfaceC0203a0N6 = C0208d.N(new p035g0.r(j10), c0230o);
            c0230o.p(false);
            long j18 = ((p035g0.r) interfaceC0203a0N6.getValue()).f9087a;
            c0230o.W(404042583);
            W1.b(this.f2476l, aVarB, null, null, null, null, null, fFloatValue, V.b.b(c0230o, -2124779163, new C0124b(this.f2479o, 4, (byte) 0)), null, this.f2477m, c0230o, ((i7 << 27) & 1879048192) | 6);
            c0230o.p(false);
        }
        return p084p4.x.f10867a;
    }
}
