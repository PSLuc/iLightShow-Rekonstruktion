package F;

import N.C0208d;
import N.C0230o;
import p130y0.AbstractC1124c0;
import p130y0.G0;

/* JADX INFO: renamed from: F.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0061c extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ G0 f1160h;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z.o f1162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0070l f1163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061c(G0 g6, long j4, boolean z5, Z.o oVar, InterfaceC0070l interfaceC0070l) {
        super(2);
        this.f1160h = g6;
        this.i = j4;
        this.f1161j = z5;
        this.f1162k = oVar;
        this.f1163l = interfaceC0070l;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) throws Throwable {
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            C0208d.a(AbstractC1124c0.f14377q.a(this.f1160h), V.b.c(-1426434671, new C0060b(this.i, this.f1161j, this.f1162k, this.f1163l), c0230o), c0230o, 56);
        }
        return p084p4.x.f10867a;
    }
}
