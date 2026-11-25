package L;

import F.C0074p;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class T1 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f2503h;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0074p f2504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p117w.m f2505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V.a f2506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p035g0.M f2507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K1 f2508n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(String str, boolean z5, C0074p c0074p, p117w.m mVar, V.a aVar, p035g0.M m6, K1 k3) {
        super(3);
        this.f2503h = str;
        this.i = z5;
        this.f2504j = c0074p;
        this.f2505k = mVar;
        this.f2506l = aVar;
        this.f2507m = m6;
        this.f2508n = k3;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        D4.e eVar = (D4.e) obj;
        C0230o c0230o = (C0230o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0230o.h(eVar) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0230o.B()) {
            c0230o.P();
        } else {
            P1.f2454a.b(this.f2503h, eVar, this.i, this.f2504j, this.f2505k, this.f2506l, this.f2507m, this.f2508n, null, null, c0230o, (iIntValue << 3) & 112);
        }
        return p084p4.x.f10867a;
    }
}
