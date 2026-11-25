package L;

import N.C0208d;
import N.C0230o;
import p096s.C0919l;

/* JADX INFO: loaded from: classes.dex */
public final class I1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2328h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B1 f2329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0919l f2330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p035g0.M f2332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f2334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f2335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2336q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(boolean z5, boolean z6, B1 b6, C0919l c0919l, p117w.m mVar, p035g0.M m6, float f6, float f7, float f8, int i) {
        super(2);
        this.f2328h = z5;
        this.i = z6;
        this.f2329j = b6;
        this.f2330k = c0919l;
        this.f2331l = mVar;
        this.f2332m = m6;
        this.f2333n = f6;
        this.f2334o = f7;
        this.f2335p = f8;
        this.f2336q = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = C0208d.V(this.f2336q | 1);
        p035g0.M m6 = this.f2332m;
        float f6 = this.f2333n;
        J1.b(this.f2328h, this.i, this.f2329j, this.f2330k, this.f2331l, m6, f6, this.f2334o, this.f2335p, (C0230o) obj, iV);
        return p084p4.x.f10867a;
    }
}
