package c5;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0 f7382a = new C0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f7383b = AbstractC0476a0.a(o0.f7473a, "kotlin.UShort");

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return new p084p4.v(cVar.r(f7383b).x());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7383b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.k(f7383b).g(((p084p4.v) obj).f10865h);
    }
}
