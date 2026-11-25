package p101t;

import B.c1;
import E4.w;
import S0.k;
import S1.h0;
import Z.n;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.ws.WebSocketProtocol;
import p030f0.a;
import p030f0.e;
import p030f0.f;
import p035g0.AbstractC0712m;
import p035g0.B;
import p035g0.C;
import p035g0.C0706g;
import p035g0.D;
import p035g0.E;
import p035g0.H;
import p035g0.M;
import p035g0.r;
import p044i0.b;
import p044i0.d;
import p044i0.g;
import p081p0.c;
import p124x0.AbstractC1098f;
import p124x0.F;
import p124x0.InterfaceC1107o;
import p124x0.a0;

/* JADX INFO: renamed from: t.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948p extends n implements InterfaceC1107o, a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public E f12389A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public M f12390B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f12391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC0712m f12392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f12393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public M f12394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f12395y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f12396z;

    @Override // p124x0.a0
    public final void D() {
        this.f12395y = 9205357640488583168L;
        this.f12396z = null;
        this.f12389A = null;
        this.f12390B = null;
        AbstractC1098f.l(this);
    }

    @Override // p124x0.InterfaceC1107o
    public final void b(F f6) {
        AbstractC0712m abstractC0712m;
        C0706g c0706g;
        if (this.f12394x == H.f9016a) {
            if (!r.c(this.f12391u, r.f9085l)) {
                d.k0(f6, this.f12391u, 0L, WebSocketProtocol.PAYLOAD_SHORT);
            }
            AbstractC0712m abstractC0712m2 = this.f12392v;
            if (abstractC0712m2 != null) {
                d.q(f6, abstractC0712m2, 0L, 0L, this.f12393w, null, 118);
            }
        } else {
            w wVar = new w();
            b bVar = f6.f13862h;
            if (f.a(bVar.f(), this.f12395y) && f6.getLayoutDirection() == this.f12396z && E4.k.a(this.f12390B, this.f12394x)) {
                E e6 = this.f12389A;
                E4.k.c(e6);
                wVar.f1074h = e6;
            } else {
                AbstractC1098f.p(this, new c1(wVar, this, f6, 1));
            }
            this.f12389A = (E) wVar.f1074h;
            this.f12395y = bVar.f();
            this.f12396z = f6.getLayoutDirection();
            this.f12390B = this.f12394x;
            Object obj = wVar.f1074h;
            E4.k.c(obj);
            E e7 = (E) obj;
            boolean zC = r.c(this.f12391u, r.f9085l);
            g gVar = g.f9389a;
            if (!zC) {
                long j4 = this.f12391u;
                if (e7 instanceof C) {
                    p030f0.d dVar = ((C) e7).f9010a;
                    f6.p(j4, c.y(dVar.f8839a, dVar.f8840b), h0.f(dVar.c(), dVar.b()), gVar, 3);
                    gVar = gVar;
                } else if (e7 instanceof D) {
                    D d6 = (D) e7;
                    C0706g c0706g2 = d6.f9012b;
                    if (c0706g2 != null) {
                        f6.d(c0706g2, j4, gVar);
                    } else {
                        e eVar = d6.f9011a;
                        float fB = a.b(eVar.f8850h);
                        long jY = c.y(eVar.f8843a, eVar.f8844b);
                        long jF = h0.f(eVar.b(), eVar.a());
                        long jA = p020d2.n.a(fB, fB);
                        bVar.f9385h.f9383c.j(p030f0.c.d(jY), p030f0.c.e(jY), f.d(jF) + p030f0.c.d(jY), f.b(jF) + p030f0.c.e(jY), a.b(jA), a.c(jA), b.b(bVar, j4, gVar, 3));
                    }
                } else {
                    if (!(e7 instanceof B)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f6.d(((B) e7).f9009a, j4, gVar);
                }
            }
            AbstractC0712m abstractC0712m3 = this.f12392v;
            if (abstractC0712m3 != null) {
                float f7 = this.f12393w;
                if (e7 instanceof C) {
                    p030f0.d dVar2 = ((C) e7).f9010a;
                    f6.e(abstractC0712m3, c.y(dVar2.f8839a, dVar2.f8840b), h0.f(dVar2.c(), dVar2.b()), f7, gVar);
                } else {
                    if (e7 instanceof D) {
                        D d7 = (D) e7;
                        abstractC0712m = abstractC0712m3;
                        c0706g = d7.f9012b;
                        if (c0706g == null) {
                            e eVar2 = d7.f9011a;
                            float fB2 = a.b(eVar2.f8850h);
                            f6.g(abstractC0712m, c.y(eVar2.f8843a, eVar2.f8844b), h0.f(eVar2.b(), eVar2.a()), p020d2.n.a(fB2, fB2), f7, gVar);
                        }
                    } else {
                        if (!(e7 instanceof B)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractC0712m = abstractC0712m3;
                        c0706g = ((B) e7).f9009a;
                    }
                    f6.G(c0706g, abstractC0712m, f7, gVar, 3);
                }
            }
        }
        f6.b();
    }
}
