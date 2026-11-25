package N;

/* JADX INFO: renamed from: N.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0247x extends AbstractC0231o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3850b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247x(D4.a aVar) {
        super(aVar);
        U u6 = U.f3673m;
        this.f3851c = u6;
    }

    @Override // N.AbstractC0231o0
    public final C0233p0 a(Object obj) {
        switch (this.f3850b) {
            case 0:
                return new C0233p0(this, obj, obj == null, null, true);
            default:
                return new C0233p0(this, obj, obj == null, (L0) this.f3851c, true);
        }
    }

    @Override // N.AbstractC0231o0
    public Y0 b() {
        switch (this.f3850b) {
            case 0:
                return (C0249y) this.f3851c;
            default:
                return super.b();
        }
    }

    public C0247x() {
        super(C0202a.f3680j);
        this.f3851c = new C0249y();
    }
}
