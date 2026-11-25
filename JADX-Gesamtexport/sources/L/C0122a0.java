package L;

/* JADX INFO: renamed from: L.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0122a0 extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0125b0 f2607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0125b0 f2609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2610n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122a0(C0125b0 c0125b0, p122w4.c cVar) {
        super(cVar);
        this.f2609m = c0125b0;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f2608l = obj;
        this.f2610n |= Integer.MIN_VALUE;
        return this.f2609m.b(this);
    }
}
