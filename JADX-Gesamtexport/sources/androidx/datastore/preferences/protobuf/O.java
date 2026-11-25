package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f6816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N f6817b;

    static {
        S s6 = S.f6818c;
        N n6 = null;
        try {
            n6 = (N) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6816a = n6;
        f6817b = new N();
    }
}
