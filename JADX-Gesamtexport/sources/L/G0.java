package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2291h = 0;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2297o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(int i, V.a aVar, V.a aVar2, V.a aVar3, V.a aVar4, C0164o0 c0164o0, V.a aVar5) {
        super(2);
        this.f2292j = i;
        this.i = aVar;
        this.f2293k = aVar2;
        this.f2294l = aVar3;
        this.f2295m = aVar4;
        this.f2297o = c0164o0;
        this.f2296n = aVar5;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [D4.c, E4.l] */
    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2291h) {
            case 0:
                C0230o c0230o = (C0230o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
                    c0230o.P();
                } else {
                    J0.d(this.f2292j, this.i, (V.a) this.f2293k, (V.a) this.f2294l, (V.a) this.f2295m, (C0164o0) this.f2297o, (V.a) this.f2296n, c0230o, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f2292j) | 1;
                Float f6 = (Float) this.f2296n;
                Float f7 = (Float) this.f2297o;
                Float f8 = (Float) this.f2293k;
                p035g0.r rVar = (p035g0.r) this.f2294l;
                p035g0.r rVar2 = (p035g0.r) this.f2295m;
                this.i.a(f8, rVar, rVar2, f6, f7, (C0230o) obj, iV);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.f2292j | 1);
                ?? r6 = (E4.l) this.f2297o;
                V.a aVar = this.i;
                D4.c cVar = (D4.c) this.f2295m;
                Z.g gVar = (Z.g) this.f2296n;
                p081p0.c.s((p096s.o0) this.f2293k, (Z.o) this.f2294l, cVar, gVar, r6, aVar, (C0230o) obj, iV2);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(V.a aVar, Float f6, p035g0.r rVar, p035g0.r rVar2, Float f7, Float f8, int i) {
        super(2);
        this.i = aVar;
        this.f2293k = f6;
        this.f2294l = rVar;
        this.f2295m = rVar2;
        this.f2296n = f7;
        this.f2297o = f8;
        this.f2292j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G0(p096s.o0 o0Var, Z.o oVar, D4.c cVar, Z.g gVar, D4.c cVar2, V.a aVar, int i) {
        super(2);
        this.f2293k = o0Var;
        this.f2294l = oVar;
        this.f2295m = cVar;
        this.f2296n = gVar;
        this.f2297o = (E4.l) cVar2;
        this.i = aVar;
        this.f2292j = i;
    }
}
