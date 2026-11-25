package L;

import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class M1 extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f2411h;
    public final /* synthetic */ p117w.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ K1 f2412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p035g0.M f2413k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(boolean z5, p117w.m mVar, K1 k3, p035g0.M m6) {
        super(2);
        this.f2411h = z5;
        this.i = mVar;
        this.f2412j = k3;
        this.f2413k = m6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            P1 p6 = P1.f2454a;
            K1 k3 = this.f2412j;
            p6.a(this.f2411h, this.i, k3, this.f2413k, c0230o, 196608);
        }
        return p084p4.x.f10867a;
    }
}
