package L;

import B.C0005c0;
import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: L.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138f1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2723h = 0;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.a f2724j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2725k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2726l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2727m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2728n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2729o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138f1(Z.o oVar, C0188w1 c0188w1, boolean z5, p117w.m mVar, V.a aVar, V.a aVar2, int i) {
        super(2);
        this.f2726l = oVar;
        this.f2727m = c0188w1;
        this.i = z5;
        this.f2728n = mVar;
        this.f2724j = aVar;
        this.f2729o = aVar2;
        this.f2725k = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f2723h) {
            case 0:
                ((Number) obj2).intValue();
                int iV = C0208d.V(this.f2725k | 1);
                V.a aVar = this.f2724j;
                V.a aVar2 = (V.a) this.f2729o;
                C0188w1 c0188w1 = (C0188w1) this.f2727m;
                boolean z5 = this.i;
                p117w.m mVar = (p117w.m) this.f2728n;
                AbstractC0176s1.h((Z.o) this.f2726l, c0188w1, z5, mVar, aVar, aVar2, (C0230o) obj, iV);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = C0208d.V(this.f2725k | 1);
                V.a aVar3 = this.f2724j;
                C0005c0 c0005c0 = (C0005c0) this.f2728n;
                Z.l lVar = (Z.l) this.f2729o;
                com.fasterxml.jackson.databind.deser.std.d0.g((p107u.l) this.f2726l, (D4.a) this.f2727m, c0005c0, lVar, this.i, aVar3, (C0230o) obj, iV2);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138f1(p107u.l lVar, D4.a aVar, C0005c0 c0005c0, Z.l lVar2, boolean z5, V.a aVar2, int i) {
        super(2);
        this.f2726l = lVar;
        this.f2727m = aVar;
        this.f2728n = c0005c0;
        this.f2729o = lVar2;
        this.i = z5;
        this.f2724j = aVar2;
        this.f2725k = i;
    }
}
