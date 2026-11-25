package c5;

/* JADX INFO: renamed from: c5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0494o implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0494o f7471a = new C0494o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7472b = new g0("kotlin.Char", a5.e.f6354l);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Character.valueOf(cVar.i());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7472b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.o(((Character) obj).charValue());
    }
}
