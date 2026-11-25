package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f6785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A f6786b;

    static {
        S s6 = S.f6818c;
        A a6 = null;
        try {
            a6 = (A) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f6785a = a6;
        f6786b = new A();
    }
}
