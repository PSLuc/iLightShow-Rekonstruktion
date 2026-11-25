package F;

import N.C0208d;
import N.C0230o;

/* JADX INFO: renamed from: F.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0064f extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1172h = 0;
    public final /* synthetic */ boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1175l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064f(Z.o oVar, D4.a aVar, boolean z5, int i) {
        super(2);
        this.f1174k = oVar;
        this.f1175l = aVar;
        this.i = z5;
        this.f1173j = i;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        int i = this.f1172h;
        C0230o c0230o = (C0230o) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                int iV = C0208d.V(this.f1173j | 1);
                S1.V.n((Z.o) this.f1174k, (D4.a) this.f1175l, this.i, c0230o, iV);
                break;
            default:
                int iV2 = C0208d.V(this.f1173j | 1);
                p027e3.a.K(this.i, (R0.h) this.f1174k, (P) this.f1175l, c0230o, iV2);
                break;
        }
        return p084p4.x.f10867a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064f(boolean z5, R0.h hVar, P p6, int i) {
        super(2);
        this.i = z5;
        this.f1174k = hVar;
        this.f1175l = p6;
        this.f1173j = i;
    }
}
