package c5;

/* JADX INFO: renamed from: c5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0499u implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0499u f7492a = new C0499u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7493b = new g0("kotlin.Double", a5.e.f6355m);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Double.valueOf(cVar.C());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7493b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.f(((Number) obj).doubleValue());
    }
}
