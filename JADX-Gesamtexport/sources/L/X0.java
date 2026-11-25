package L;

import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2562h;
    public final /* synthetic */ p117w.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ O0 f2563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2564k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X0(p117w.m mVar, O0 o6, boolean z5, int i) {
        super(3);
        this.f2562h = i;
        this.i = mVar;
        this.f2563j = o6;
        this.f2564k = z5;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f2562h) {
            case 0:
                C0230o c0230o = (C0230o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0230o.B()) {
                    c0230o.P();
                } else {
                    U0.f2512a.a(this.i, null, this.f2563j, this.f2564k, 0L, c0230o, 196614);
                }
                break;
            case 1:
                C0230o c0230o2 = (C0230o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    U0.f2512a.a(this.i, null, this.f2563j, this.f2564k, 0L, c0230o2, 196614);
                }
                break;
            default:
                C0230o c0230o3 = (C0230o) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0230o3.B()) {
                    c0230o3.P();
                } else {
                    U0.f2512a.a(this.i, null, this.f2563j, this.f2564k, 0L, c0230o3, 196608);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
