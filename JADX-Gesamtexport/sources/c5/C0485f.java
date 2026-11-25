package c5;

/* JADX INFO: renamed from: c5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0485f implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0485f f7447a = new C0485f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7448b = new g0("kotlin.Boolean", a5.e.f6352j);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Boolean.valueOf(cVar.f());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7448b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.i(((Boolean) obj).booleanValue());
    }
}
