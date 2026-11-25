package W4;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f5624k;

    static {
        int i = k.f5632c;
        int i3 = k.f5633d;
        long j4 = k.f5634e;
        String str = k.f5630a;
        d dVar = new d();
        dVar.f5626j = new b(i, i3, j4, str);
        f5624k = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // P4.AbstractC0331s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
