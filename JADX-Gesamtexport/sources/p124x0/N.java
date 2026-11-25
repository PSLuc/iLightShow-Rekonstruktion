package p124x0;

import D4.c;
import E4.k;
import S0.h;
import java.util.LinkedHashMap;
import p015c2.AbstractC0473d;
import p084p4.x;
import p113v0.D;
import p113v0.E;
import p113v0.G;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public abstract class N extends M implements E {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Y f13939s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinkedHashMap f13941u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public G f13943w;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13940t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final D f13942v = new D(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f13944x = new LinkedHashMap();

    public N(Y y2) {
        this.f13939s = y2;
    }

    public static final void A0(N n6, G g6) {
        x xVar;
        LinkedHashMap linkedHashMap;
        if (g6 != null) {
            n6.n0(AbstractC0473d.b(g6.f(), g6.d()));
            xVar = x.f10867a;
        } else {
            xVar = null;
        }
        if (xVar == null) {
            n6.n0(0L);
        }
        if (!k.a(n6.f13943w, g6) && g6 != null && ((((linkedHashMap = n6.f13941u) != null && !linkedHashMap.isEmpty()) || !g6.b().isEmpty()) && !k.a(g6.b(), n6.f13941u))) {
            H h6 = n6.f13939s.f13989s.f13829D.f13924s;
            k.c(h6);
            h6.f13881x.f();
            LinkedHashMap linkedHashMap2 = n6.f13941u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                n6.f13941u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(g6.b());
        }
        n6.f13943w = g6;
    }

    public void B0() {
        v0().c();
    }

    public final void C0(long j4) {
        if (!h.a(this.f13940t, j4)) {
            this.f13940t = j4;
            Y y2 = this.f13939s;
            H h6 = y2.f13989s.f13829D.f13924s;
            if (h6 != null) {
                h6.r0();
            }
            M.y0(y2);
        }
        if (this.f13935o) {
            return;
        }
        q0(new j0(v0(), this));
    }

    public final long D0(N n6, boolean z5) {
        long jC = 0;
        while (!this.equals(n6)) {
            if (!this.f13933m || !z5) {
                jC = h.c(jC, this.f13940t);
            }
            Y y2 = this.f13939s.f13991u;
            k.c(y2);
            this = y2.K0();
            k.c(this);
        }
        return jC;
    }

    @Override // S0.b
    public final float a() {
        return this.f13939s.a();
    }

    @Override // p113v0.InterfaceC1030m
    public final S0.k getLayoutDirection() {
        return this.f13939s.f13989s.f13851y;
    }

    @Override // p113v0.N
    public final void h0(long j4, float f6, c cVar) {
        C0(j4);
        if (this.f13934n) {
            return;
        }
        B0();
    }

    @Override // p113v0.N, p113v0.E
    public final Object i() {
        return this.f13939s.i();
    }

    @Override // S0.b
    public final float n() {
        return this.f13939s.n();
    }

    @Override // p124x0.M
    public final M r0() {
        Y y2 = this.f13939s.f13990t;
        if (y2 != null) {
            return y2.K0();
        }
        return null;
    }

    @Override // p124x0.M, p113v0.InterfaceC1030m
    public final boolean s() {
        return true;
    }

    @Override // p124x0.M
    public final InterfaceC1033p s0() {
        return this.f13942v;
    }

    @Override // p124x0.M
    public final boolean t0() {
        return this.f13943w != null;
    }

    @Override // p124x0.M
    public final D u0() {
        return this.f13939s.f13989s;
    }

    @Override // p124x0.M
    public final G v0() {
        G g6 = this.f13943w;
        if (g6 != null) {
            return g6;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p124x0.M
    public final M w0() {
        Y y2 = this.f13939s.f13991u;
        if (y2 != null) {
            return y2.K0();
        }
        return null;
    }

    @Override // p124x0.M
    public final long x0() {
        return this.f13940t;
    }

    @Override // p124x0.M
    public final void z0() {
        h0(this.f13940t, 0.0f, null);
    }
}
