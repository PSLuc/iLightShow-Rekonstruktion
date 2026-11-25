package c5;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f7473a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7474b = new g0("kotlin.Short", a5.e.f6359q);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Short.valueOf(cVar.x());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7474b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.g(((Number) obj).shortValue());
    }
}
