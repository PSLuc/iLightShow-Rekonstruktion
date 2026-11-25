package p040h0;

import D4.c;
import E4.l;

/* JADX INFO: loaded from: classes.dex */
public final class p extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9263h;
    public final /* synthetic */ q i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f9263h = i;
        this.i = qVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f9263h) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.i;
                return Double.valueOf(qVar.f9274n.b(p081p0.c.M(dDoubleValue, qVar.f9266e, qVar.f9267f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.i;
                return Double.valueOf(p081p0.c.M(qVar2.f9271k.b(dDoubleValue2), qVar2.f9266e, qVar2.f9267f));
        }
    }
}
