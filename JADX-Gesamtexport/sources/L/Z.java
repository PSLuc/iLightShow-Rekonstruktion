package L;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0125b0 f2586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p117w.l f2587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0125b0 f2589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2590o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0125b0 c0125b0, p122w4.c cVar) {
        super(cVar);
        this.f2589n = c0125b0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f2588m = obj;
        this.f2590o |= Integer.MIN_VALUE;
        return this.f2589n.a(null, this);
    }
}
