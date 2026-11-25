package P4;

/* JADX INFO: loaded from: classes.dex */
public final class S extends W {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4625m;

    public /* synthetic */ S(int i, Object obj) {
        this.f4624l = i;
        this.f4625m = obj;
    }

    @Override // D4.c
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f4624l) {
            case 0:
                q((Throwable) obj);
                break;
            case 1:
                q((Throwable) obj);
                break;
            default:
                q((Throwable) obj);
                break;
        }
        return p084p4.x.f10867a;
    }

    @Override // P4.W
    public final void q(Throwable th) {
        switch (this.f4624l) {
            case 0:
                ((D4.c) this.f4625m).invoke(th);
                break;
            case 1:
                Object objI = p().I();
                boolean z5 = objI instanceof C0327n;
                X x6 = (X) this.f4625m;
                if (!z5) {
                    x6.g(AbstractC0336x.t(objI));
                } else {
                    x6.g(S1.V.v(((C0327n) objI).f4664a));
                }
                break;
            default:
                ((C0319f) this.f4625m).g(p084p4.x.f10867a);
                break;
        }
    }
}
