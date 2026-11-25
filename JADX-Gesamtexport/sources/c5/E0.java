package c5;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E0 f7393a = new E0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7394b = new g0("kotlin.uuid.Uuid", a5.e.f6360r);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        String strY = cVar.y();
        E4.k.f("uuidString", strY);
        if (strY.length() != 36) {
            throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
        }
        long jB = M4.d.b(0, strY, 8);
        p081p0.c.A(8, strY);
        long jB2 = M4.d.b(9, strY, 13);
        p081p0.c.A(13, strY);
        long jB3 = M4.d.b(14, strY, 18);
        p081p0.c.A(18, strY);
        long jB4 = M4.d.b(19, strY, 23);
        p081p0.c.A(23, strY);
        long j4 = (jB << 32) | (jB2 << 16) | jB3;
        long jB5 = M4.d.b(24, strY, 36) | (jB4 << 48);
        return (j4 == 0 && jB5 == 0) ? O4.a.f4576j : new O4.a(j4, jB5);
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7394b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        O4.a aVar = (O4.a) obj;
        E4.k.f("value", aVar);
        dVar.q(aVar.toString());
    }
}
