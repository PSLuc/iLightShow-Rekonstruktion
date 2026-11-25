package B;

import F.C0074p;
import N.C0222k;
import N.C0230o;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class G extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0036s0 f89h;
    public final /* synthetic */ G0.J i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f90j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f91k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ W0 f92l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0.w f93m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0074p f94n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z.o f95o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z.o f96p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z.o f97q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z.o f98r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p129y.c f99s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ F.P f100t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f101u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ E4.l f102v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ M0.q f103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ S0.b f104x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(C0036s0 c0036s0, G0.J j4, int i, int i3, W0 w6, M0.w wVar, C0074p c0074p, Z.o oVar, Z.o oVar2, Z.o oVar3, Z.o oVar4, p129y.c cVar, F.P p6, boolean z5, D4.c cVar2, M0.q qVar, S0.b bVar) {
        super(2);
        this.f89h = c0036s0;
        this.i = j4;
        this.f90j = i;
        this.f91k = i3;
        this.f92l = w6;
        this.f93m = wVar;
        this.f94n = c0074p;
        this.f95o = oVar;
        this.f96p = oVar2;
        this.f97q = oVar3;
        this.f98r = oVar4;
        this.f99s = cVar;
        this.f100t = p6;
        this.f101u = z5;
        this.f102v = (E4.l) cVar2;
        this.f103w = qVar;
        this.f104x = bVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [D4.c, E4.l] */
    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        Z.o l1Var;
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            Z.l lVar = Z.l.f5957a;
            C0036s0 c0036s0 = this.f89h;
            Z.o oVarD = androidx.compose.foundation.layout.c.d(lVar, ((S0.e) c0036s0.f422g.getValue()).f4887h, Float.NaN);
            int i = this.f90j;
            int i3 = this.f91k;
            G0.J j4 = this.i;
            Z.o oVarA = Z.a.a(oVarD, new C0015h0(i, i3, j4));
            boolean zH = c0230o.h(c0036s0);
            Object objK = c0230o.K();
            if (zH || objK == C0222k.f3714a) {
                objK = new C0043w(2, c0036s0);
                c0230o.f0(objK);
            }
            D4.a aVar = (D4.a) objK;
            W0 w6 = this.f92l;
            p112v.W w7 = (p112v.W) w6.f256e.getValue();
            M0.w wVar = this.f93m;
            int i6 = G0.I.f1469c;
            long j6 = wVar.f3454b;
            int iE = (int) (j6 >> 32);
            long j7 = w6.f255d;
            if (iE == ((int) (j7 >> 32)) && (iE = (int) (j6 & 4294967295L)) == ((int) (j7 & 4294967295L))) {
                iE = G0.I.e(j6);
            }
            w6.f255d = j6;
            M0.C cO = AbstractC0029o0.o(this.f94n, wVar.f3453a);
            int iOrdinal = w7.ordinal();
            if (iOrdinal == 0) {
                l1Var = new l1(w6, iE, cO, aVar);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                l1Var = new C0019j0(w6, iE, cO, aVar);
            }
            p020d2.n.h(androidx.compose.foundation.relocation.a.a(Z.a.a(com.fasterxml.jackson.databind.deser.std.d0.l(oVarA).k(l1Var).k(this.f95o).k(this.f96p), new Z0(1, j4)).k(this.f97q).k(this.f98r), this.f99s), V.b.c(-363167407, new F(this.f100t, c0036s0, this.f101u, (D4.c) this.f102v, wVar, this.f103w, this.f104x, this.f91k), c0230o), c0230o, 48);
        }
        return p084p4.x.f10867a;
    }
}
