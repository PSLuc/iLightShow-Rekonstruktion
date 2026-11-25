package B;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f269h;
    public final /* synthetic */ p113v0.N i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(p113v0.N n6, int i) {
        super(1);
        this.f269h = i;
        this.i = n6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f269h) {
            case 0:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
            case 1:
                p113v0.M.d((p113v0.M) obj, this.i, 0, 0);
                break;
            case 2:
                p113v0.M.d((p113v0.M) obj, this.i, 0, 0);
                break;
            case 3:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
            case 4:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
            case 5:
                p113v0.M.d((p113v0.M) obj, this.i, 0, 0);
                break;
            case 6:
                p113v0.M.d((p113v0.M) obj, this.i, 0, 0);
                break;
            case 7:
                p113v0.M.g((p113v0.M) obj, this.i, 0, 0);
                break;
            case 8:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
            case 9:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
            case 10:
                p113v0.M m6 = (p113v0.M) obj;
                S0.k kVarB = m6.b();
                S0.k kVar = S0.k.f4897h;
                p113v0.N n6 = this.i;
                if (kVarB == kVar || m6.c() == 0) {
                    p113v0.M.a(m6, n6);
                    n6.h0(S0.h.c(0L, n6.f13140l), 0.0f, null);
                } else {
                    int i = (int) 0;
                    long jC = S1.h0.c((m6.c() - n6.f13137h) - i, i);
                    p113v0.M.a(m6, n6);
                    n6.h0(S0.h.c(jC, n6.f13140l), 0.0f, null);
                }
                break;
            case 11:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
            default:
                p113v0.M.f((p113v0.M) obj, this.i, 0, 0);
                break;
        }
        return p084p4.x.f10867a;
    }
}
