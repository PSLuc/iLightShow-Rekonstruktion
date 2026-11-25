package F;

import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0710k;

/* JADX INFO: renamed from: F.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066h extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1179h;
    public final /* synthetic */ D4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1180j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066h(long j4, D4.a aVar, boolean z5) {
        super(1);
        this.f1179h = j4;
        this.i = aVar;
        this.f1180j = z5;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        p019d0.c cVar = (p019d0.c) obj;
        C0704e c0704eW = S1.V.w(cVar, p030f0.f.d(cVar.f8571h.f()) / 2.0f);
        C0710k c0710k = C0710k.f9071a;
        long j4 = this.f1179h;
        return cVar.b(new C0065g(this.i, this.f1180j, c0704eW, new C0709j(j4, 5, c0710k.a(j4, 5))));
    }
}
