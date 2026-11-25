package B2;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p122w4.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f524m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, p122w4.c cVar) {
        super(cVar);
        this.f524m = rVar;
    }

    @Override // p122w4.a
    public final Object o(Object obj) {
        this.f522k = obj;
        this.f523l |= Integer.MIN_VALUE;
        return this.f524m.z(this);
    }
}
