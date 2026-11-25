package p101t;

import S0.b;
import S0.k;
import Z.l;
import Z.o;
import p030f0.c;
import p030f0.d;
import p030f0.f;
import p035g0.C;
import p035g0.E;
import p035g0.M;
import p084p4.x;
import p090r.v;
import p112v.C1013x0;
import p112v.C1017z0;
import p124x0.F;
import v4.a;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Y, m0, M {
    public static final j0 i = new j0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j0 f12361j = new j0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j0 f12362k = new j0(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12363h;

    public /* synthetic */ j0(int i3) {
        this.f12363h = i3;
    }

    @Override // p035g0.M
    public E a(long j4, k kVar, b bVar) {
        switch (this.f12363h) {
            case 4:
                float fH = bVar.H(AbstractC0956y.f12441a);
                return new C(new d(0.0f, -fH, f.d(j4), f.b(j4) + fH));
            default:
                float fH2 = bVar.H(AbstractC0956y.f12441a);
                return new C(new d(-fH2, 0.0f, f.d(j4) + fH2, f.b(j4)));
        }
    }

    @Override // p101t.m0
    public boolean b() {
        return false;
    }

    @Override // p101t.m0
    public o c() {
        return l.f5957a;
    }

    @Override // p101t.m0
    public long d(long j4, int i3, v vVar) {
        vVar.getClass();
        C1017z0 c1017z0 = (C1017z0) vVar.i;
        return new c(C1017z0.a(c1017z0, c1017z0.f13111h, j4, c1017z0.f13110g)).f8837a;
    }

    @Override // p101t.m0
    public Object e(long j4, C1013x0 c1013x0, p111u4.d dVar) {
        C1013x0 c1013x1 = new C1013x0(c1013x0.f13096o, dVar);
        c1013x1.f13095n = j4;
        x xVar = x.f10867a;
        Object objO = c1013x1.o(xVar);
        return objO == a.f13292h ? objO : xVar;
    }

    @Override // p101t.Y
    public void f(F f6) {
        f6.b();
    }
}
