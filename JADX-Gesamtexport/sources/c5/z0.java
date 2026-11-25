package c5;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f7515a = new z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f7516b = AbstractC0476a0.a(O.f7407a, "kotlin.ULong");

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return new p084p4.s(cVar.r(f7516b).d());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7516b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.k(f7516b).m(((p084p4.s) obj).f10862h);
    }
}
