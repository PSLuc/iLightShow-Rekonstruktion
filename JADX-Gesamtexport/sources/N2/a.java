package N2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p079o4.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f3890j = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile b f3891h;
    public volatile Object i;

    public static p079o4.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.i = f3890j;
        aVar.f3891h = bVar;
        return aVar;
    }

    @Override // p079o4.a
    public final Object get() {
        Object obj;
        Object obj2 = this.i;
        Object obj3 = f3890j;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.i;
                if (obj == obj3) {
                    obj = this.f3891h.get();
                    Object obj4 = this.i;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.i = obj;
                    this.f3891h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
