package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class B implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G[] f8151a;

    @Override // com.google.protobuf.G
    public final Q a(Class cls) {
        for (G g6 : this.f8151a) {
            if (g6.b(cls)) {
                return g6.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.protobuf.G
    public final boolean b(Class cls) {
        for (G g6 : this.f8151a) {
            if (g6.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
