package c5;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f7379a = new B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7380b = new g0("kotlin.Float", a5.e.f6356n);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Float.valueOf(cVar.z());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7380b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.l(((Number) obj).floatValue());
    }
}
