package P4;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends W {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f4629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z f4630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0323j f4631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f4632o;

    public Y(b0 b0Var, Z z5, C0323j c0323j, Object obj) {
        this.f4629l = b0Var;
        this.f4630m = z5;
        this.f4631n = c0323j;
        this.f4632o = obj;
    }

    @Override // D4.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q((Throwable) obj);
        return p084p4.x.f10867a;
    }

    @Override // P4.W
    public final void q(Throwable th) {
        C0323j c0323j = this.f4631n;
        b0 b0Var = this.f4629l;
        b0Var.getClass();
        C0323j c0323jU = b0.U(c0323j);
        Z z5 = this.f4630m;
        Object obj = this.f4632o;
        if (c0323jU != null) {
            while (c0323jU.f4655l.s((2 & 1) == 0, (2 & 2) != 0, new Y(b0Var, z5, c0323jU, obj)) == f0.f4652h) {
                c0323jU = b0.U(c0323jU);
                if (c0323jU == null) {
                }
            }
            return;
        }
        b0Var.p(b0Var.A(z5, obj));
    }
}
