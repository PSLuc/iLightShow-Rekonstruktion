package c5;

/* JADX INFO: renamed from: c5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0488i implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0488i f7456a = new C0488i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7457b = new g0("kotlin.Byte", a5.e.f6353k);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return Byte.valueOf(cVar.s());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7457b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.h(((Number) obj).byteValue());
    }
}
