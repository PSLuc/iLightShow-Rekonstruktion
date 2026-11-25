package S4;

/* JADX INFO: renamed from: S4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0377n extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0375l f5102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public F.F f5103n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0377n(C0375l c0375l, p111u4.d dVar) {
        super(dVar);
        this.f5102m = c0375l;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f5100k = obj;
        this.f5101l |= Integer.MIN_VALUE;
        return this.f5102m.a(null, this);
    }
}
