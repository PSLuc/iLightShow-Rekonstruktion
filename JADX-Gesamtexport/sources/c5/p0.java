package c5;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f7477a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7478b = new g0("kotlin.String", a5.e.f6360r);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return cVar.y();
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7478b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        String str = (String) obj;
        E4.k.f("value", str);
        dVar.q(str);
    }
}
