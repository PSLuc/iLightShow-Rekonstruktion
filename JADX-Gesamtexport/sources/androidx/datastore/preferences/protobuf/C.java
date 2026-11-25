package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class C implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J[] f6787a;

    @Override // androidx.datastore.preferences.protobuf.J
    public final U a(Class cls) {
        for (J j4 : this.f6787a) {
            if (j4.b(cls)) {
                return j4.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean b(Class cls) {
        for (J j4 : this.f6787a) {
            if (j4.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
