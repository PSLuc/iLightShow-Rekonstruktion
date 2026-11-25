package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    public static G a(Object obj, Object obj2) {
        G gB = (G) obj;
        G g6 = (G) obj2;
        if (!g6.isEmpty()) {
            if (!gB.f6794h) {
                gB = gB.b();
            }
            gB.a();
            if (!g6.isEmpty()) {
                gB.putAll(g6);
            }
        }
        return gB;
    }
}
