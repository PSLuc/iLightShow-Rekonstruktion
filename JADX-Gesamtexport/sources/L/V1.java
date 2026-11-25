package L;

import N.C0213f0;
import N.C0217h0;
import p101t.C0952u;

/* JADX INFO: loaded from: classes.dex */
public final class V1 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2543h = 0;
    public final /* synthetic */ float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2544j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(float f6, C0952u c0952u) {
        super(1);
        this.i = f6;
        this.f2544j = c0952u;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f2543h) {
            case 0:
                p124x0.F f6 = (p124x0.F) obj;
                f6.b();
                float f7 = this.i;
                if (!S0.e.a(f7, 0.0f)) {
                    p044i0.b bVar = f6.f13862h;
                    float fA = bVar.a() * f7;
                    float fB = p030f0.f.b(bVar.f()) - (fA / 2);
                    p044i0.d.x(f6, ((C0952u) this.f2544j).f12433b, p081p0.c.y(0.0f, fB), p081p0.c.y(p030f0.f.d(bVar.f()), fB), fA, 0.0f, 496);
                }
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                p096s.o0 o0Var = (p096s.o0) this.f2544j;
                if (!o0Var.g()) {
                    C0213f0 c0213f0 = o0Var.f12062g;
                    if (c0213f0.h() == Long.MIN_VALUE) {
                        c0213f0.j(jLongValue);
                        ((C0217h0) o0Var.f12056a.f603h).setValue(Boolean.TRUE);
                    }
                    long jH = jLongValue - c0213f0.h();
                    float f8 = this.i;
                    if (f8 != 0.0f) {
                        jH = G4.a.E(jH / ((double) f8));
                    }
                    o0Var.o(jH);
                    o0Var.h(jH, f8 == 0.0f);
                }
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(p096s.o0 o0Var, float f6) {
        super(1);
        this.f2544j = o0Var;
        this.i = f6;
    }
}
