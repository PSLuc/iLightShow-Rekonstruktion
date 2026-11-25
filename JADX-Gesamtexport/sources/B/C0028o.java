package B;

import F.C0074p;
import L.K1;
import L.P1;
import L.S1;
import L.T1;
import N.C0208d;
import N.C0230o;
import N.InterfaceC0203a0;
import com.nanjoran.ilightshow.R;

/* JADX INFO: renamed from: B.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0028o extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f376h = 1;
    public final /* synthetic */ Z.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D4.c f378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G0.J f380m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0034r0 f381n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0033q0 f382o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0074p f385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p117w.m f386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V.a f387t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f388u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f389v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028o(Z.o oVar, K1 k3, String str, D4.c cVar, boolean z5, G0.J j4, C0034r0 c0034r0, C0033q0 c0033q0, int i, int i3, C0074p c0074p, p117w.m mVar, V.a aVar, p035g0.M m6) {
        super(2);
        this.i = oVar;
        this.f388u = k3;
        this.f377j = str;
        this.f378k = cVar;
        this.f379l = z5;
        this.f380m = j4;
        this.f381n = c0034r0;
        this.f382o = c0033q0;
        this.f383p = i;
        this.f384q = i3;
        this.f385r = c0074p;
        this.f386s = mVar;
        this.f387t = aVar;
        this.f389v = m6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        p084p4.x xVar = p084p4.x.f10867a;
        Object obj3 = this.f389v;
        Object obj4 = this.f388u;
        switch (this.f376h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(1);
                p035g0.O o6 = (p035g0.O) obj3;
                V.a aVar = this.f387t;
                C0022l c0022l = (C0022l) obj4;
                p117w.m mVar = this.f386s;
                AbstractC0030p.a(this.f377j, this.f378k, this.i, this.f379l, this.f380m, this.f381n, this.f382o, this.f383p, this.f384q, this.f385r, c0022l, mVar, o6, aVar, (C0230o) obj, iV);
                break;
            default:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    L.L.i(R.string.default_error_message, c0230o);
                    float f6 = S1.f2489b;
                    Z.o oVarA = androidx.compose.foundation.layout.c.a(this.i, P1.f2456c, P1.f2455b);
                    K1 k3 = (K1) obj4;
                    c0230o.W(-1885422187);
                    InterfaceC0203a0 interfaceC0203a0N = C0208d.N(new p035g0.r(k3.i), c0230o);
                    c0230o.p(false);
                    p035g0.O o7 = new p035g0.O(((p035g0.r) interfaceC0203a0N.getValue()).f9087a);
                    String str = this.f377j;
                    boolean z5 = this.f379l;
                    C0074p c0074p = this.f385r;
                    p117w.m mVar2 = this.f386s;
                    V.a aVarB = V.b.b(c0230o, -288211827, new T1(str, z5, c0074p, mVar2, this.f387t, (p035g0.M) obj3, k3));
                    AbstractC0030p.a(str, this.f378k, oVarA, z5, this.f380m, this.f381n, this.f382o, this.f383p, this.f384q, c0074p, null, mVar2, o7, aVarB, c0230o, 0);
                }
                break;
        }
        return xVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028o(String str, D4.c cVar, Z.o oVar, boolean z5, G0.J j4, C0034r0 c0034r0, C0033q0 c0033q0, int i, int i3, C0074p c0074p, C0022l c0022l, p117w.m mVar, p035g0.O o6, V.a aVar, int i6) {
        super(2);
        this.f377j = str;
        this.f378k = cVar;
        this.i = oVar;
        this.f379l = z5;
        this.f380m = j4;
        this.f381n = c0034r0;
        this.f382o = c0033q0;
        this.f383p = i;
        this.f384q = i3;
        this.f385r = c0074p;
        this.f388u = c0022l;
        this.f386s = mVar;
        this.f389v = o6;
        this.f387t = aVar;
    }
}
