package K;

import B.C0043w;
import N.C0208d;
import N.C0217h0;
import N.InterfaceC0203a0;
import N.InterfaceC0250y0;
import N.U;
import P4.InterfaceC0335w;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p035g0.AbstractC0702c;
import p035g0.InterfaceC0714o;
import p124x0.F;

/* JADX INFO: renamed from: K.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120a extends C1.b implements InterfaceC0250y0 {
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0203a0 f1951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0203a0 f1952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ViewGroup f1953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f1954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0217h0 f1955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0217h0 f1956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f1957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0043w f1959s;

    public C0120a(boolean z5, float f6, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1, ViewGroup viewGroup) {
        super(z5, interfaceC0203a1);
        this.i = z5;
        this.f1950j = f6;
        this.f1951k = interfaceC0203a0;
        this.f1952l = interfaceC0203a1;
        this.f1953m = viewGroup;
        U u6 = U.f3673m;
        this.f1955o = C0208d.K(null, u6);
        this.f1956p = C0208d.K(Boolean.TRUE, u6);
        this.f1957q = 0L;
        this.f1958r = -1;
        this.f1959s = new C0043w(16, this);
    }

    @Override // N.InterfaceC0250y0
    public final void a() {
    }

    @Override // N.InterfaceC0250y0
    public final void b() {
        p();
    }

    @Override // N.InterfaceC0250y0
    public final void e() {
        p();
    }

    @Override // p101t.Y
    public final void f(F f6) {
        int iH;
        p044i0.b bVar = f6.f13862h;
        this.f1957q = bVar.f();
        float f7 = this.f1950j;
        if (Float.isNaN(f7)) {
            iH = G4.a.D(p.a(f6, this.i, bVar.f()));
        } else {
            iH = bVar.H(f7);
        }
        this.f1958r = iH;
        long j4 = ((p035g0.r) this.f1951k.getValue()).f9087a;
        float f8 = ((g) this.f1952l.getValue()).f1979d;
        f6.b();
        i(f6, f7, j4);
        InterfaceC0714o interfaceC0714oF = bVar.i.f();
        ((Boolean) this.f1956p.getValue()).booleanValue();
        r rVar = (r) this.f1955o.getValue();
        if (rVar != null) {
            rVar.e(bVar.f(), this.f1958r, j4, f8);
            rVar.draw(AbstractC0702c.a(interfaceC0714oF));
        }
    }

    @Override // C1.b
    public final void h(p117w.o oVar, InterfaceC0335w interfaceC0335w) {
        q qVar = this.f1954n;
        if (qVar == null) {
            ViewGroup viewGroup = this.f1953m;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof q) {
                    this.f1954n = (q) childAt;
                    break;
                }
            }
            if (this.f1954n == null) {
                q qVar2 = new q(viewGroup.getContext());
                viewGroup.addView(qVar2);
                this.f1954n = qVar2;
            }
            qVar = this.f1954n;
            E4.k.c(qVar);
        }
        D.x xVar = qVar.f2010k;
        r rVar = (r) ((LinkedHashMap) xVar.i).get(this);
        if (rVar == null) {
            ArrayList arrayList = qVar.f2009j;
            E4.k.f("<this>", arrayList);
            rVar = (r) (arrayList.isEmpty() ? null : arrayList.remove(0));
            LinkedHashMap linkedHashMap = (LinkedHashMap) xVar.f707j;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) xVar.i;
            if (rVar == null) {
                int i3 = qVar.f2011l;
                ArrayList arrayList2 = qVar.i;
                if (i3 > p089q4.m.L(arrayList2)) {
                    rVar = new r(qVar.getContext());
                    qVar.addView(rVar);
                    arrayList2.add(rVar);
                } else {
                    rVar = (r) arrayList2.get(qVar.f2011l);
                    C0120a c0120a = (C0120a) linkedHashMap.get(rVar);
                    if (c0120a != null) {
                        c0120a.f1955o.setValue(null);
                        r rVar2 = (r) linkedHashMap2.get(c0120a);
                        if (rVar2 != null) {
                        }
                        linkedHashMap2.remove(c0120a);
                        rVar.c();
                    }
                }
                int i6 = qVar.f2011l;
                if (i6 < qVar.f2008h - 1) {
                    qVar.f2011l = i6 + 1;
                } else {
                    qVar.f2011l = 0;
                }
            }
            linkedHashMap2.put(this, rVar);
            linkedHashMap.put(rVar, this);
        }
        r rVar3 = rVar;
        rVar3.b(oVar, this.i, this.f1957q, this.f1958r, ((p035g0.r) this.f1951k.getValue()).f9087a, ((g) this.f1952l.getValue()).f1979d, this.f1959s);
        this.f1955o.setValue(rVar3);
    }

    @Override // C1.b
    public final void l(p117w.o oVar) {
        r rVar = (r) this.f1955o.getValue();
        if (rVar != null) {
            rVar.d();
        }
    }

    public final void p() {
        q qVar = this.f1954n;
        if (qVar != null) {
            this.f1955o.setValue(null);
            D.x xVar = qVar.f2010k;
            r rVar = (r) ((LinkedHashMap) xVar.i).get(this);
            if (rVar != null) {
                rVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) xVar.i;
                r rVar2 = (r) linkedHashMap.get(this);
                if (rVar2 != null) {
                }
                linkedHashMap.remove(this);
                qVar.f2009j.add(rVar);
            }
        }
    }
}
