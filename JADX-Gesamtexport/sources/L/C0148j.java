package L;

import B.C0005c0;
import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: L.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148j extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2798h = 0;
    public final /* synthetic */ D4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p084p4.e f2802m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148j(D4.a aVar, Z.l lVar, V0.s sVar, V.a aVar2, int i) {
        super(2);
        this.i = aVar;
        this.f2800k = lVar;
        this.f2801l = sVar;
        this.f2802m = aVar2;
        this.f2799j = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2798h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f2799j | 1);
                V.a aVar = (V.a) this.f2802m;
                AbstractC0151k.b(this.i, (Z.l) this.f2800k, (V0.s) this.f2801l, aVar, (C0230o) obj, iV);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.f2799j | 1);
                C0005c0 c0005c0 = (C0005c0) this.f2802m;
                com.fasterxml.jackson.databind.deser.std.d0.f((p107u.l) this.f2800k, this.i, (Z.o) this.f2801l, c0005c0, (C0230o) obj, iV2);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = C0208d.V(this.f2799j | 1);
                C0005c0 c0005c1 = (C0005c0) this.f2802m;
                p107u.o.d((p107u.f) this.f2800k, this.i, (p107u.a) this.f2801l, c0005c1, (C0230o) obj, iV3);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148j(p107u.f fVar, D4.a aVar, p107u.a aVar2, C0005c0 c0005c0, int i) {
        super(2);
        this.f2800k = fVar;
        this.i = aVar;
        this.f2801l = aVar2;
        this.f2802m = c0005c0;
        this.f2799j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148j(p107u.l lVar, D4.a aVar, Z.o oVar, C0005c0 c0005c0, int i) {
        super(2);
        this.f2800k = lVar;
        this.i = aVar;
        this.f2801l = oVar;
        this.f2802m = c0005c0;
        this.f2799j = i;
    }
}
