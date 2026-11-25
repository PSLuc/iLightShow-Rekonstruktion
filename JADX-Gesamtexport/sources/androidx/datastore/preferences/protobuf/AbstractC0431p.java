package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0431p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0430o f6899a = new C0430o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0430o f6900b;

    static {
        S s6 = S.f6818c;
        C0430o c0430o = null;
        try {
            c0430o = (C0430o) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6900b = c0430o;
    }
}
