package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f6795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f6796b;

    static {
        S s6 = S.f6818c;
        H h6 = null;
        try {
            h6 = (H) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6795a = h6;
        f6796b = new H();
    }
}
