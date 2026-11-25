package L;

import N.C0230o;

/* JADX INFO: renamed from: L.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0142h extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D4.e f2760h;
    public final /* synthetic */ V.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p035g0.M f2761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2762k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f2763l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2764m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f2765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f2766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.a f2767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ V.a f2768q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142h(D4.e eVar, V.a aVar, p035g0.M m6, long j4, float f6, long j6, long j7, long j8, V.a aVar2, V.a aVar3) {
        super(2);
        this.f2760h = eVar;
        this.i = aVar;
        this.f2761j = m6;
        this.f2762k = j4;
        this.f2763l = f6;
        this.f2764m = j6;
        this.f2765n = j7;
        this.f2766o = j8;
        this.f2767p = aVar2;
        this.f2768q = aVar3;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            V.a aVarB = V.b.b(c0230o, -3244296, new C0139g(this.f2767p, this.f2768q, 1));
            float f6 = M.d.f3184a;
            AbstractC0136f.a(aVarB, null, this.f2760h, this.i, this.f2761j, this.f2762k, this.f2763l, F.e(26, c0230o), this.f2764m, this.f2765n, this.f2766o, c0230o, 6);
        }
        return p084p4.x.f10867a;
    }
}
