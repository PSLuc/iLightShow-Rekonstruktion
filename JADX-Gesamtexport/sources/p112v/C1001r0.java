package p112v;

import B.C0003b0;
import B.C0031p0;
import E0.g;
import E0.h;
import E4.k;
import O1.B;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S0.b;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import c5.C0495p;
import p020d2.n;
import p024e0.l;
import p024e0.r;
import p035g0.C0715p;
import p058l0.I;
import p081p0.c;
import p081p0.d;
import p084p4.x;
import p086q0.e;
import p090r.v;
import p091r0.j;
import p091r0.q;
import p101t.N;
import p117w.m;
import p124x0.AbstractC1098f;
import p124x0.a0;
import p124x0.m0;
import p129y.i;

/* JADX INFO: renamed from: v.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1001r0 extends M implements a0, l, d, m0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p101t.m0 f13056E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0031p0 f13057F;
    public final C0972c0 G;
    public final C0495p H;
    public final C1017z0 I;
    public final B J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0987k f13058K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0967a f13059L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0003b0 f13060M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1000q0 f13061N;

    public C1001r0(p101t.m0 m0Var, W w6, InterfaceC1003s0 interfaceC1003s0, m mVar, boolean z5, boolean z6) {
        super(C0975e.f12969k, z5, mVar, w6);
        this.f13056E = m0Var;
        C0031p0 c0031p0 = new C0031p0(29);
        this.f13057F = c0031p0;
        C0972c0 c0972c0 = new C0972c0();
        c0972c0.f12966u = z5;
        y0(c0972c0);
        this.G = c0972c0;
        C0495p c0495p = new C0495p(new C0715p(23, new C0715p(a.f6607c)));
        this.H = c0495p;
        C1017z0 c1017z0 = new C1017z0(interfaceC1003s0, this.f13056E, c0495p, w6, z6, c0031p0);
        this.I = c1017z0;
        B b6 = new B(c1017z0, z5);
        this.J = b6;
        C0987k c0987k = new C0987k(w6, c1017z0, z6);
        y0(c0987k);
        this.f13058K = c0987k;
        y0(new e(b6, c0031p0));
        y0(new r());
        i iVar = new i();
        iVar.f14172u = c0987k;
        y0(iVar);
        v vVar = new v(8, this);
        N n6 = new N();
        n6.f12258u = vVar;
        y0(n6);
    }

    @Override // p124x0.a0
    public final void D() {
        AbstractC1098f.p(this, new I(8, this));
    }

    @Override // p112v.M
    public final Object F0(K k3, L l6) {
        C1017z0 c1017z0 = this.I;
        Object objE = c1017z0.e(2, new C0986j0(k3, c1017z0, null), l6);
        return objE == v4.a.f13292h ? objE : x.f10867a;
    }

    @Override // p112v.M
    public final void G0(long j4) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [D4.a, E4.l] */
    @Override // p112v.M
    public final void H0(long j4) {
        InterfaceC0335w interfaceC0335w = (InterfaceC0335w) ((E4.l) this.f13057F.f394j).invoke();
        if (interfaceC0335w == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        AbstractC0336x.o(interfaceC0335w, null, new C0988k0(this, j4, null), 3);
    }

    @Override // p112v.M
    public final boolean I0() {
        C1017z0 c1017z0 = this.I;
        if (c1017z0.f13104a.c()) {
            return true;
        }
        p101t.m0 m0Var = c1017z0.f13105b;
        return m0Var != null ? m0Var.b() : false;
    }

    @Override // p081p0.d
    public final boolean K(KeyEvent keyEvent) {
        long jY;
        if (!this.f12865y || ((!p081p0.a.a(c.k0(keyEvent), p081p0.a.f10824l) && !p081p0.a.a(n.b(keyEvent.getKeyCode()), p081p0.a.f10823k)) || c.o0(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z5 = this.I.f13107d == W.f12920h;
        C0987k c0987k = this.f13058K;
        if (z5) {
            int i = (int) (c0987k.f13005B & 4294967295L);
            jY = c.y(0.0f, p081p0.a.a(n.b(keyEvent.getKeyCode()), p081p0.a.f10823k) ? i : -i);
        } else {
            int i3 = (int) (c0987k.f13005B >> 32);
            jY = c.y(p081p0.a.a(n.b(keyEvent.getKeyCode()), p081p0.a.f10823k) ? i3 : -i3, 0.0f);
        }
        AbstractC0336x.o(n0(), null, new C0992m0(this, jY, null), 3);
        return true;
    }

    @Override // p024e0.l
    public final void P(p024e0.i iVar) {
        iVar.b(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @Override // p112v.M, p124x0.k0
    public final void f0(p091r0.i iVar, j jVar, long j4) {
        long j6;
        ?? r6 = iVar.f11494a;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) this.f12864x.invoke((q) r6.get(i))).booleanValue()) {
                super.f0(iVar, jVar, j4);
                break;
            }
        }
        if (jVar == j.i && iVar.f11496c == 6) {
            ?? r8 = iVar.f11494a;
            int size2 = r8.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (((q) r8.get(i3)).b()) {
                    return;
                }
            }
            k.c(this.f13059L);
            b bVar = AbstractC1098f.s(this).f13850x;
            p030f0.c cVar = new p030f0.c(0L);
            int size3 = r8.size();
            int i6 = 0;
            while (true) {
                j6 = cVar.f8837a;
                if (i6 >= size3) {
                    break;
                }
                cVar = new p030f0.c(p030f0.c.h(j6, ((q) r8.get(i6)).f11516j));
                i6++;
            }
            AbstractC0336x.o(n0(), null, new C0996o0(this, p030f0.c.i(-bVar.y(64), j6), null), 3);
            int size4 = r8.size();
            for (int i7 = 0; i7 < size4; i7++) {
                ((q) r8.get(i7)).a();
            }
        }
    }

    @Override // p124x0.m0
    public final void g0(h hVar) {
        if (this.f12865y && (this.f13060M == null || this.f13061N == null)) {
            this.f13060M = new C0003b0(20, this);
            this.f13061N = new C1000q0(this, null);
        }
        C0003b0 c0003b0 = this.f13060M;
        if (c0003b0 != null) {
            K4.e[] eVarArr = E0.q.f997a;
            hVar.i(g.f917d, new E0.a(null, c0003b0));
        }
        C1000q0 c1000q0 = this.f13061N;
        if (c1000q0 != null) {
            K4.e[] eVarArr2 = E0.q.f997a;
            hVar.i(g.f918e, c1000q0);
        }
    }

    @Override // p081p0.d
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // Z.n
    public final boolean o0() {
        return false;
    }

    @Override // Z.n
    public final void r0() {
        AbstractC1098f.p(this, new I(8, this));
        this.f13059L = C0967a.f12945a;
    }
}
