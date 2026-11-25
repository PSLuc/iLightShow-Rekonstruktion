package L;

import N.C0208d;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P1 f2401h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K1 f2403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p035g0.M f2404l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(P1 p6, boolean z5, p117w.m mVar, K1 k3, p035g0.M m6, int i) {
        super(2);
        this.f2401h = p6;
        this.i = z5;
        this.f2402j = mVar;
        this.f2403k = k3;
        this.f2404l = m6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(196609);
        K1 k3 = this.f2403k;
        boolean z5 = this.i;
        p117w.m mVar = this.f2402j;
        this.f2401h.a(z5, mVar, k3, this.f2404l, (C0230o) obj, iV);
        return p084p4.x.f10867a;
    }
}
