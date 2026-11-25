package B;

import L.D1;
import L.E1;
import P4.AbstractC0336x;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0715p;
import p035g0.InterfaceC0714o;
import p096s.C0907c;
import p096s.C0920m;

/* JADX INFO: renamed from: B.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0006d extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f298h;
    public final /* synthetic */ float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f300k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0006d(float f6, C0704e c0704e, C0709j c0709j) {
        super(1);
        this.f298h = 0;
        this.i = f6;
        this.f299j = c0704e;
        this.f300k = c0709j;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        long jE;
        switch (this.f298h) {
            case 0:
                p124x0.F f6 = (p124x0.F) obj;
                f6.b();
                float f7 = this.i;
                C0704e c0704e = (C0704e) this.f299j;
                C0709j c0709j = (C0709j) this.f300k;
                p044i0.b bVar = f6.f13862h;
                C0031p0 c0031p0 = bVar.i;
                long jL = c0031p0.l();
                c0031p0.f().l();
                try {
                    C0715p c0715p = (C0715p) c0031p0.i;
                    c0715p.B(f7, 0.0f);
                    InterfaceC0714o interfaceC0714oF = ((C0031p0) c0715p.i).f();
                    interfaceC0714oF.g(p030f0.c.d(0L), p030f0.c.e(0L));
                    interfaceC0714oF.h();
                    interfaceC0714oF.g(-p030f0.c.d(0L), -p030f0.c.e(0L));
                    bVar.d(c0704e, c0709j);
                    return p084p4.x.f10867a;
                } finally {
                    c0031p0.f().i();
                    c0031p0.x(jL);
                }
            case 1:
                C0907c c0907c = (C0907c) this.f299j;
                float fFloatValue = ((Number) c0907c.f11955e.getValue()).floatValue();
                float f8 = this.i;
                if (fFloatValue != f8) {
                    AbstractC0336x.o((U4.d) this.f300k, null, new D1(c0907c, f8, null), 3);
                }
                return new E1();
            default:
                long jLongValue = ((Number) obj).longValue();
                p112v.b1 b1Var = (p112v.b1) this.f299j;
                if (b1Var.f12958b == Long.MIN_VALUE) {
                    b1Var.f12958b = jLongValue;
                }
                float f9 = b1Var.f12961e;
                C0920m c0920m = new C0920m(f9);
                float f10 = this.i;
                C0920m c0920m2 = p112v.b1.f12956f;
                if (f10 == 0.0f) {
                    jE = b1Var.f12957a.b(new C0920m(f9), c0920m2, b1Var.f12959c);
                } else {
                    jE = G4.a.E((jLongValue - b1Var.f12958b) / f10);
                }
                long j4 = jE;
                float f11 = ((C0920m) b1Var.f12957a.f(j4, c0920m, c0920m2, b1Var.f12959c)).f12032a;
                b1Var.f12959c = (C0920m) b1Var.f12957a.k(j4, c0920m, c0920m2, b1Var.f12959c);
                b1Var.f12958b = jLongValue;
                float f12 = b1Var.f12961e - f11;
                b1Var.f12961e = f11;
                ((D4.c) this.f300k).invoke(Float.valueOf(f12));
                return p084p4.x.f10867a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0006d(Object obj, float f6, Object obj2, int i) {
        super(1);
        this.f298h = i;
        this.f299j = obj;
        this.i = f6;
        this.f300k = obj2;
    }
}
