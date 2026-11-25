package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2267h;
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.a f2269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D4.e f2270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2271m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2274p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(int i, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, p123x.a0 a0Var, V.a aVar5, int i3, int i6) {
        super(2);
        this.f2267h = i6;
        this.i = i;
        this.f2268j = aVar;
        this.f2269k = aVar2;
        this.f2270l = aVar3;
        this.f2271m = aVar4;
        this.f2272n = a0Var;
        this.f2273o = aVar5;
        this.f2274p = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i = this.f2267h;
        C0230o c0230o = (C0230o) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                int iV = C0208d.V(this.f2274p | 1);
                J0.a(this.i, this.f2268j, this.f2269k, (V.a) this.f2270l, (V.a) this.f2271m, (p123x.a0) this.f2272n, (V.a) this.f2273o, c0230o, iV);
                break;
            case 1:
                int iV2 = C0208d.V(this.f2274p | 1);
                J0.d(this.i, this.f2268j, this.f2269k, (V.a) this.f2270l, (V.a) this.f2271m, (p123x.a0) this.f2272n, (V.a) this.f2273o, c0230o, iV2);
                break;
            case 2:
                int iV3 = C0208d.V(this.f2274p | 1);
                J0.c(this.i, this.f2268j, this.f2269k, (V.a) this.f2270l, (V.a) this.f2271m, (p123x.a0) this.f2272n, (V.a) this.f2273o, c0230o, iV3);
                break;
            default:
                int iV4 = C0208d.V(this.i | 1);
                AbstractC0169q.b(this.f2270l, (Z.l) this.f2271m, this.f2268j, this.f2269k, (p123x.K) this.f2273o, (f2) this.f2272n, c0230o, iV4, this.f2274p);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(D4.e eVar, Z.l lVar, V.a aVar, V.a aVar2, p123x.K k3, f2 f2Var, int i, int i3) {
        super(2);
        this.f2267h = 3;
        this.f2270l = eVar;
        this.f2271m = lVar;
        this.f2268j = aVar;
        this.f2269k = aVar2;
        this.f2273o = k3;
        this.f2272n = f2Var;
        this.i = i;
        this.f2274p = i3;
    }
}
