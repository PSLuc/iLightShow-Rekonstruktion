package c5;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f7504a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f7505b = AbstractC0476a0.a(J.f7400a, "kotlin.UInt");

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return new p084p4.q(cVar.r(f7505b).q());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7505b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.k(f7505b).j(((p084p4.q) obj).f10860h);
    }
}
