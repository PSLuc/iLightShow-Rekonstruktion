package c5;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f7400a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7401b = new g0("kotlin.Int", a5.e.f6357o);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Integer.valueOf(cVar.q());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7401b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.j(((Number) obj).intValue());
    }
}
