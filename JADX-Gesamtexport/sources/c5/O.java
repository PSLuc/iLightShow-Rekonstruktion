package c5;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f7407a = new O();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7408b = new g0("kotlin.Long", a5.e.f6358p);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Long.valueOf(cVar.d());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7408b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.m(((Number) obj).longValue());
    }
}
