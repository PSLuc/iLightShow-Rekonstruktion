package G1;

import F1.E;
import F1.I;
import N.C0208d;
import N.C0230o;
import S1.V;

/* JADX INFO: loaded from: classes.dex */
public final class B extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1600h;
    public final /* synthetic */ I i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E f1601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z.l f1602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z.g f1603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D4.c f1604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D4.c f1605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D4.c f1606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4.c f1607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1608q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(I i, E e6, Z.l lVar, Z.g gVar, D4.c cVar, D4.c cVar2, D4.c cVar3, D4.c cVar4, int i3, int i6) {
        super(2);
        this.f1600h = i6;
        this.i = i;
        this.f1601j = e6;
        this.f1602k = lVar;
        this.f1603l = gVar;
        this.f1604m = cVar;
        this.f1605n = cVar2;
        this.f1606o = cVar3;
        this.f1607p = cVar4;
        this.f1608q = i3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1600h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f1608q | 1);
                D4.c cVar = this.f1607p;
                D4.c cVar2 = this.f1604m;
                D4.c cVar3 = this.f1605n;
                D4.c cVar4 = this.f1606o;
                V.g(this.i, this.f1601j, this.f1602k, this.f1603l, cVar2, cVar3, cVar4, cVar, (C0230o) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.f1608q | 1);
                D4.c cVar5 = this.f1607p;
                D4.c cVar6 = this.f1604m;
                D4.c cVar7 = this.f1605n;
                D4.c cVar8 = this.f1606o;
                V.g(this.i, this.f1601j, this.f1602k, this.f1603l, cVar6, cVar7, cVar8, cVar5, (C0230o) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0208d.V(this.f1608q | 1);
                D4.c cVar9 = this.f1607p;
                D4.c cVar10 = this.f1604m;
                D4.c cVar11 = this.f1605n;
                D4.c cVar12 = this.f1606o;
                V.g(this.i, this.f1601j, this.f1602k, this.f1603l, cVar10, cVar11, cVar12, cVar9, (C0230o) obj, iV3);
                break;
        }
        return p084p4.x.f10867a;
    }
}
