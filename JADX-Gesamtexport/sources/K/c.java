package K;

import B.C0031p0;
import N.InterfaceC0203a0;
import N.InterfaceC0250y0;
import P4.AbstractC0336x;
import P4.InterfaceC0335w;
import S1.V;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import p035g0.C0715p;
import p096s.C0907c;
import p124x0.F;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C1.b implements InterfaceC0250y0 {
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1964j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0203a0 f1965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC0203a0 f1966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final X.v f1967m;

    public c(boolean z5, float f6, InterfaceC0203a0 interfaceC0203a0, InterfaceC0203a0 interfaceC0203a1) {
        super(z5, interfaceC0203a1);
        this.i = z5;
        this.f1964j = f6;
        this.f1965k = interfaceC0203a0;
        this.f1966l = interfaceC0203a1;
        this.f1967m = new X.v();
    }

    @Override // N.InterfaceC0250y0
    public final void a() {
    }

    @Override // N.InterfaceC0250y0
    public final void b() {
        this.f1967m.clear();
    }

    @Override // N.InterfaceC0250y0
    public final void e() {
        this.f1967m.clear();
    }

    @Override // p101t.Y
    public final void f(F f6) {
        c cVar = this;
        F f7 = f6;
        long j4 = ((p035g0.r) cVar.f1965k.getValue()).f9087a;
        f7.b();
        cVar.i(f7, cVar.f1964j, j4);
        Iterator it = cVar.f1967m.i.iterator();
        while (((X.A) it).hasNext()) {
            o oVar = (o) ((Map.Entry) ((X.A) it).next()).getValue();
            float f8 = ((g) cVar.f1966l.getValue()).f1979d;
            if (f8 != 0.0f) {
                long jB = p035g0.r.b(f8, j4);
                Float f9 = oVar.f1999d;
                p044i0.b bVar = f7.f13862h;
                if (f9 == null) {
                    long jF = bVar.f();
                    float f10 = p.f2007a;
                    oVar.f1999d = Float.valueOf(Math.max(p030f0.f.d(jF), p030f0.f.b(jF)) * 0.3f);
                }
                Float f11 = oVar.f2000e;
                boolean z5 = oVar.f1998c;
                if (f11 == null) {
                    float f12 = oVar.f1997b;
                    oVar.f2000e = Float.isNaN(f12) ? Float.valueOf(p.a(f7, z5, bVar.f())) : Float.valueOf(f7.y(f12));
                }
                if (oVar.f1996a == null) {
                    oVar.f1996a = new p030f0.c(bVar.N());
                }
                if (oVar.f2001f == null) {
                    oVar.f2001f = new p030f0.c(p081p0.c.y(p030f0.f.d(bVar.f()) / 2.0f, p030f0.f.b(bVar.f()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) oVar.f2006l.getValue()).booleanValue() || ((Boolean) oVar.f2005k.getValue()).booleanValue()) ? ((Number) oVar.f2002g.c()).floatValue() : 1.0f;
                Float f13 = oVar.f1999d;
                E4.k.c(f13);
                float fFloatValue2 = f13.floatValue();
                Float f14 = oVar.f2000e;
                E4.k.c(f14);
                float fG = V.G(fFloatValue2, f14.floatValue(), ((Number) oVar.f2003h.c()).floatValue());
                p030f0.c cVar2 = oVar.f1996a;
                E4.k.c(cVar2);
                float fD = p030f0.c.d(cVar2.f8837a);
                p030f0.c cVar3 = oVar.f2001f;
                E4.k.c(cVar3);
                float fD2 = p030f0.c.d(cVar3.f8837a);
                C0907c c0907c = oVar.i;
                float fG2 = V.G(fD, fD2, ((Number) c0907c.c()).floatValue());
                p030f0.c cVar4 = oVar.f1996a;
                E4.k.c(cVar4);
                float fE = p030f0.c.e(cVar4.f8837a);
                p030f0.c cVar5 = oVar.f2001f;
                E4.k.c(cVar5);
                long jY = p081p0.c.y(fG2, V.G(fE, p030f0.c.e(cVar5.f8837a), ((Number) c0907c.c()).floatValue()));
                long jB2 = p035g0.r.b(p035g0.r.d(jB) * fFloatValue, jB);
                if (z5) {
                    float fD3 = p030f0.f.d(bVar.f());
                    float fB = p030f0.f.b(bVar.f());
                    C0031p0 c0031p0 = bVar.i;
                    long jL = c0031p0.l();
                    c0031p0.f().l();
                    ((C0031p0) ((C0715p) c0031p0.i).i).f().f(0.0f, 0.0f, fD3, fB, 1);
                    p044i0.d.c0(f6, jB2, fG, jY, null, 120);
                    c0031p0.f().i();
                    c0031p0.x(jL);
                } else {
                    p044i0.d.c0(f6, jB2, fG, jY, null, 120);
                }
            }
            cVar = this;
            f7 = f6;
        }
    }

    @Override // C1.b
    public final void h(p117w.o oVar, InterfaceC0335w interfaceC0335w) throws IllegalAccessException, InvocationTargetException {
        X.v vVar = this.f1967m;
        Iterator it = vVar.i.iterator();
        while (it.hasNext()) {
            o oVar2 = (o) ((Map.Entry) it.next()).getValue();
            oVar2.f2006l.setValue(Boolean.TRUE);
            oVar2.f2004j.R(p084p4.x.f10867a);
        }
        boolean z5 = this.i;
        o oVar3 = new o(z5 ? new p030f0.c(oVar.f13394a) : null, this.f1964j, z5);
        vVar.put(oVar, oVar3);
        AbstractC0336x.o(interfaceC0335w, null, new b(oVar3, this, oVar, null), 3);
    }

    @Override // C1.b
    public final void l(p117w.o oVar) throws IllegalAccessException, InvocationTargetException {
        o oVar2 = (o) this.f1967m.get(oVar);
        if (oVar2 != null) {
            oVar2.f2006l.setValue(Boolean.TRUE);
            oVar2.f2004j.R(p084p4.x.f10867a);
        }
    }
}
