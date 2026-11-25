package B;

import F1.C0096m;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p130y0.C1126d0;

/* JADX INFO: loaded from: classes.dex */
public final class N extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f187h = 0;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f191m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C0036s0 c0036s0, p024e0.n nVar, boolean z5, F.P p6, M0.q qVar) {
        super(1);
        this.f188j = c0036s0;
        this.f189k = nVar;
        this.i = z5;
        this.f190l = p6;
        this.f191m = qVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f187h) {
            case 0:
                long j4 = ((p030f0.c) obj).f8837a;
                C0036s0 c0036s0 = (C0036s0) this.f188j;
                if (c0036s0.b()) {
                    p130y0.C0 c6 = c0036s0.f418c;
                    if (c6 != null) {
                        ((C1126d0) c6).b();
                    }
                } else {
                    ((p024e0.n) this.f189k).a(p024e0.h.f8652l);
                }
                if (c0036s0.b() && this.i) {
                    if (c0036s0.a() != EnumC0011f0.i) {
                        a1 a1VarD = c0036s0.d();
                        if (a1VarD != null) {
                            int iA = ((M0.q) this.f191m).a(a1VarD.b(j4, true));
                            c0036s0.f434t.invoke(M0.w.a((M0.w) c0036s0.f419d.i, null, AbstractC0599v0.d(iA, iA), 5));
                            if (c0036s0.f416a.f54a.f1494h.length() > 0) {
                                c0036s0.f425k.setValue(EnumC0011f0.f313j);
                            }
                        }
                    } else {
                        ((F.P) this.f190l).e(new p030f0.c(j4));
                    }
                }
                break;
            default:
                C0096m c0096m = (C0096m) obj;
                E4.k.f("entry", c0096m);
                ((E4.s) this.f188j).f1070h = true;
                ((E4.s) this.f189k).f1070h = true;
                ((F1.I) this.f190l).n(c0096m, this.i, (p089q4.j) this.f191m);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(E4.s sVar, E4.s sVar2, F1.I i, boolean z5, p089q4.j jVar) {
        super(1);
        this.f188j = sVar;
        this.f189k = sVar2;
        this.f190l = i;
        this.i = z5;
        this.f191m = jVar;
    }
}
