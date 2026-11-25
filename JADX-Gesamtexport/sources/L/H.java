package L;

import N.C0230o;
import p096s.AbstractC0909d;
import p096s.AbstractC0931y;

/* JADX INFO: loaded from: classes.dex */
public final class H extends E4.l implements D4.f {
    public static final H i = new H(3, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final H f2299j = new H(3, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final H f2300k = new H(3, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2301h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i3, int i6) {
        super(i3);
        this.f2301h = i6;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Object v0Var;
        switch (this.f2301h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0230o.B()) {
                    c0230o.P();
                }
                return p084p4.x.f10867a;
            case 1:
                p113v0.H h6 = (p113v0.H) obj;
                long j4 = ((S0.a) obj3).f4883a;
                int iH = h6.H(AbstractC0178t0.f2915a);
                int i3 = iH * 2;
                p113v0.N nC = ((p113v0.E) obj2).c(p081p0.c.w0(0, i3, j4));
                return h6.u(nC.f13137h, nC.i - i3, p089q4.v.f11238h, new C0175s0(nC, iH));
            default:
                p096s.k0 k0Var = (p096s.k0) obj;
                C0230o c0230o2 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o2.W(-1635067817);
                EnumC0152k0 enumC0152k0 = EnumC0152k0.f2809h;
                EnumC0152k0 enumC0152k1 = EnumC0152k0.i;
                if (k0Var.a(enumC0152k0, enumC0152k1)) {
                    v0Var = AbstractC0909d.k(67, 2, AbstractC0931y.f12148c);
                } else {
                    v0Var = (k0Var.a(enumC0152k1, enumC0152k0) || k0Var.a(EnumC0152k0.f2810j, enumC0152k1)) ? new p096s.v0(83, 67, AbstractC0931y.f12148c) : AbstractC0909d.j(7, null);
                }
                c0230o2.p(false);
                return v0Var;
        }
    }
}
