package D;

import B.C0026n;
import B.F0;
import B.J;
import G0.I;
import P4.AbstractC0336x;
import P4.i0;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import p124x0.AbstractC1098f;
import p130y0.AbstractC1124c0;
import p130y0.C0;
import p130y0.C1126d0;

/* JADX INFO: renamed from: D.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0057g implements M0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S4.E f690d;

    @Override // M0.r
    public final void a() {
        j(null);
    }

    @Override // M0.r
    public final void b() {
        C0 c6;
        z zVar = this.f687a;
        if (zVar == null || (c6 = (C0) AbstractC1098f.h(zVar, AbstractC1124c0.f14374n)) == null) {
            return;
        }
        ((C1126d0) c6).b();
    }

    @Override // M0.r
    public final void c(M0.w wVar, M0.q qVar, G0.G g6, A2.e eVar, p030f0.d dVar, p030f0.d dVar2) {
        D d6 = this.f689c;
        if (d6 != null) {
            A a6 = d6.f656m;
            synchronized (a6.f629c) {
                try {
                    a6.f635j = wVar;
                    a6.f637l = qVar;
                    a6.f636k = g6;
                    a6.f638m = dVar;
                    a6.f639n = dVar2;
                    if (a6.f631e || a6.f630d) {
                        a6.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // M0.r
    public final void d() {
        C0 c6;
        z zVar = this.f687a;
        if (zVar == null || (c6 = (C0) AbstractC1098f.h(zVar, AbstractC1124c0.f14374n)) == null) {
            return;
        }
        ((C1126d0) c6).a();
    }

    @Override // M0.r
    public final void e() {
        i0 i0Var = this.f688b;
        if (i0Var != null) {
            i0Var.c(null);
        }
        this.f688b = null;
        S4.x xVarI = i();
        if (xVarI != null) {
            S4.E e6 = (S4.E) xVarI;
            synchronized (e6) {
                e6.u(e6.o() + ((long) e6.f5031r), e6.f5030q, e6.o() + ((long) e6.f5031r), e6.o() + ((long) e6.f5031r) + ((long) e6.f5032s));
            }
        }
    }

    @Override // M0.r
    public final void f(p030f0.d dVar) {
        Rect rect;
        D d6 = this.f689c;
        if (d6 != null) {
            d6.f655l = new Rect(G4.a.D(dVar.f8839a), G4.a.D(dVar.f8840b), G4.a.D(dVar.f8841c), G4.a.D(dVar.f8842d));
            if (!d6.f653j.isEmpty() || (rect = d6.f655l) == null) {
                return;
            }
            d6.f645a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // M0.r
    public final void g(M0.w wVar, M0.m mVar, C0026n c0026n, J j4) {
        j(new F0(wVar, this, mVar, c0026n, j4));
    }

    @Override // M0.r
    public final void h(M0.w wVar, M0.w wVar2) {
        D d6 = this.f689c;
        if (d6 != null) {
            boolean z5 = (I.a(d6.f652h.f3454b, wVar2.f3454b) && E4.k.a(d6.f652h.f3455c, wVar2.f3455c)) ? false : true;
            d6.f652h = wVar2;
            int size = d6.f653j.size();
            for (int i = 0; i < size; i++) {
                F f6 = (F) ((WeakReference) d6.f653j.get(i)).get();
                if (f6 != null) {
                    f6.f664g = wVar2;
                }
            }
            A a6 = d6.f656m;
            synchronized (a6.f629c) {
                a6.f635j = null;
                a6.f637l = null;
                a6.f636k = null;
                a6.f638m = null;
                a6.f639n = null;
            }
            if (E4.k.a(wVar, wVar2)) {
                if (z5) {
                    x xVar = d6.f646b;
                    int iE = I.e(wVar2.f3454b);
                    int iD = I.d(wVar2.f3454b);
                    I i3 = d6.f652h.f3455c;
                    int iE2 = i3 != null ? I.e(i3.f1470a) : -1;
                    I i6 = d6.f652h.f3455c;
                    xVar.m().updateSelection((View) xVar.i, iE, iD, iE2, i6 != null ? I.d(i6.f1470a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!E4.k.a(wVar.f3453a.f1494h, wVar2.f3453a.f1494h) || (I.a(wVar.f3454b, wVar2.f3454b) && !E4.k.a(wVar.f3455c, wVar2.f3455c)))) {
                x xVar2 = d6.f646b;
                xVar2.m().restartInput((View) xVar2.i);
                return;
            }
            int size2 = d6.f653j.size();
            for (int i7 = 0; i7 < size2; i7++) {
                F f7 = (F) ((WeakReference) d6.f653j.get(i7)).get();
                if (f7 != null) {
                    M0.w wVar3 = d6.f652h;
                    x xVar3 = d6.f646b;
                    if (f7.f667k) {
                        f7.f664g = wVar3;
                        if (f7.i) {
                            xVar3.m().updateExtractedText((View) xVar3.i, f7.f665h, G4.a.j(wVar3));
                        }
                        I i8 = wVar3.f3455c;
                        int iE3 = i8 != null ? I.e(i8.f1470a) : -1;
                        I i9 = wVar3.f3455c;
                        int iD2 = i9 != null ? I.d(i9.f1470a) : -1;
                        long j4 = wVar3.f3454b;
                        xVar3.m().updateSelection((View) xVar3.i, I.e(j4), I.d(j4), iE3, iD2);
                    }
                }
            }
        }
    }

    public final S4.x i() {
        S4.E e6 = this.f690d;
        if (e6 != null) {
            return e6;
        }
        if (!C.e.f596a) {
            return null;
        }
        S4.E eA = S4.F.a(3, 2);
        this.f690d = eA;
        return eA;
    }

    public final void j(F0 f6) {
        z zVar = this.f687a;
        if (zVar == null) {
            return;
        }
        this.f688b = zVar.f5969t ? AbstractC0336x.o(zVar.n0(), null, new y(zVar, new C0056f(f6, this, zVar, null), null), 1) : null;
    }

    public final void k(z zVar) {
        if (this.f687a == zVar) {
            this.f687a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + zVar + " but was " + this.f687a).toString());
    }
}
