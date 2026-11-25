package c5;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f7490a = new t0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f7491b = AbstractC0476a0.a(C0488i.f7456a, "kotlin.UByte");

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        return new p084p4.o(cVar.r(f7491b).s());
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7491b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        dVar.k(f7491b).h(((p084p4.o) obj).f10858h);
    }
}
