package D0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f746n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, p122w4.c cVar) {
        super(cVar);
        this.f745m = jVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f744l = obj;
        this.f746n |= Integer.MIN_VALUE;
        return this.f745m.b(0.0f, this);
    }
}
