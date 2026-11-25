package K;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f1980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1983n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, p122w4.c cVar) {
        super(cVar);
        this.f1982m = oVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f1981l = obj;
        this.f1983n |= Integer.MIN_VALUE;
        return this.f1982m.a(this);
    }
}
