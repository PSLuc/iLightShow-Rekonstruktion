package p091r0;

import E4.s;
import E4.w;
import F1.G;
import Z.n;
import p013c0.c;
import p084p4.x;
import p124x0.AbstractC1098f;
import p124x0.InterfaceC1103k;
import p124x0.k0;
import p124x0.p0;
import p130y0.AbstractC1124c0;
import p130y0.C1147o;
import p130y0.F;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n implements p0, k0, InterfaceC1103k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0879a f11500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11501v;

    public final void A0() {
        x xVar;
        n nVar;
        if (this.f11501v) {
            this.f11501v = false;
            if (this.f5969t) {
                w wVar = new w();
                AbstractC1098f.w(this, new G(wVar, 2, (byte) 0));
                k kVar = (k) wVar.f1074h;
                if (kVar != null) {
                    kVar.y0();
                    xVar = x.f10867a;
                } else {
                    xVar = null;
                }
                if (xVar != null || (nVar = (n) AbstractC1098f.h(this, AbstractC1124c0.f14379s)) == null) {
                    return;
                }
                m.f11503a.getClass();
                F.f14216a.a(((C1147o) nVar).f14436a, o.f11504a);
            }
        }
    }

    @Override // p124x0.k0
    public final void X() {
        A0();
    }

    @Override // p124x0.k0
    public final void f0(i iVar, j jVar, long j4) {
        if (jVar == j.i) {
            int i = iVar.f11496c;
            if (i == 4) {
                this.f11501v = true;
                z0();
            } else if (i == 5) {
                A0();
            }
        }
    }

    @Override // p124x0.p0
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // Z.n
    public final void s0() {
        A0();
    }

    public final void y0() {
        w wVar = new w();
        AbstractC1098f.w(this, new L4.n(2, wVar));
        k kVar = (k) wVar.f1074h;
        C0879a c0879a = kVar != null ? kVar.f11500u : this.f11500u;
        n nVar = (n) AbstractC1098f.h(this, AbstractC1124c0.f14379s);
        if (nVar != null) {
            F.f14216a.a(((C1147o) nVar).f14436a, c0879a);
        }
    }

    public final void z0() {
        s sVar = new s();
        sVar.f1070h = true;
        AbstractC1098f.x(this, new c(sVar, 1));
        if (sVar.f1070h) {
            y0();
        }
    }
}
