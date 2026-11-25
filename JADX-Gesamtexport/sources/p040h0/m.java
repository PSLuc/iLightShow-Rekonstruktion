package p040h0;

import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9260h;
    public final /* synthetic */ q i;

    public /* synthetic */ m(q qVar, int i) {
        this.f9260h = i;
        this.i = qVar;
    }

    @Override // p040h0.i
    public final double b(double d6) {
        switch (this.f9260h) {
            case 0:
                q qVar = this.i;
                return c.M(qVar.f9271k.b(d6), qVar.f9266e, qVar.f9267f);
            default:
                q qVar2 = this.i;
                return qVar2.f9274n.b(c.M(d6, qVar2.f9266e, qVar2.f9267f));
        }
    }
}
