package G1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends F1.C {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f1622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D4.g f1623h;

    public j(i iVar, E4.f fVar, D4.g gVar) {
        super(iVar, fVar, p089q4.v.f11238h);
        this.f1622g = iVar;
        this.f1623h = gVar;
    }

    @Override // F1.C
    public final F1.B a() {
        return (h) super.a();
    }

    @Override // F1.C
    public final F1.B b() {
        return new h(this.f1622g, this.f1623h);
    }
}
