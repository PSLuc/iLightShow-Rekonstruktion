package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0647o implements G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0647o f8221b = new C0647o(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8222a;

    public /* synthetic */ C0647o(int i) {
        this.f8222a = i;
    }

    @Override // com.google.protobuf.G
    public final Q a(Class cls) {
        switch (this.f8222a) {
            case 0:
                if (!r.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Q) r.b(cls.asSubclass(r.class)).a(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.protobuf.G
    public final boolean b(Class cls) {
        switch (this.f8222a) {
            case 0:
                return r.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
