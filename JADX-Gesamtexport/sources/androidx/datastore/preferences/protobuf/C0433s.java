package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0433s implements J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0433s f6923b = new C0433s(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6924a;

    public /* synthetic */ C0433s(int i) {
        this.f6924a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final U a(Class cls) {
        switch (this.f6924a) {
            case 0:
                if (!AbstractC0436v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0436v.d(cls.asSubclass(AbstractC0436v.class)).c(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean b(Class cls) {
        switch (this.f6924a) {
            case 0:
                return AbstractC0436v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
