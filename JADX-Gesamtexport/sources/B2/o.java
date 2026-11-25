package B2;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r f528n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, p122w4.c cVar) {
        super(cVar);
        this.f527m = rVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f525k = obj;
        this.f526l |= Integer.MIN_VALUE;
        return this.f527m.A(this);
    }
}
