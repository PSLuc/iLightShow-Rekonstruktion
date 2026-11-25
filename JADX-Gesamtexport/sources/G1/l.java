package G1;

import B.C0026n;
import F1.C0096m;
import N.C0208d;
import N.C0222k;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class l extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0096m f1628h;
    public final /* synthetic */ p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ W.g f1629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X.s f1630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f1631l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0096m c0096m, p pVar, W.g gVar, X.s sVar, o oVar) {
        super(2);
        this.f1628h = c0096m;
        this.i = pVar;
        this.f1629j = gVar;
        this.f1630k = sVar;
        this.f1631l = oVar;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        C0230o c0230o = (C0230o) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0230o.B()) {
            c0230o.P();
        } else {
            C0096m c0096m = this.f1628h;
            boolean zH = c0230o.h(c0096m);
            p pVar = this.i;
            boolean zF = zH | c0230o.f(pVar);
            Object objK = c0230o.K();
            if (zF || objK == C0222k.f3714a) {
                objK = new C0026n(this.f1630k, c0096m, pVar, 3);
                c0230o.f0(objK);
            }
            C0208d.c(c0096m, (D4.c) objK, c0230o);
            p081p0.c.w(c0096m, this.f1629j, V.b.c(-497631156, new A2.d(this.f1631l, 2, c0096m), c0230o), c0230o, 384);
        }
        return p084p4.x.f10867a;
    }
}
