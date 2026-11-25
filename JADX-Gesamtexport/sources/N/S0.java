package N;

/* JADX INFO: loaded from: classes.dex */
public final class S0 extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3661h;
    public final /* synthetic */ p080p.A i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S0(p080p.A a6, int i) {
        super(1);
        this.f3661h = i;
        this.i = a6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f3661h) {
            case 0:
                if (obj instanceof X.C) {
                    ((X.C) obj).f(4);
                }
                this.i.a(obj);
                return p084p4.x.f10867a;
            default:
                return obj == this.i ? "(this)" : String.valueOf(obj);
        }
    }
}
