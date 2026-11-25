package p124x0;

import p024e0.i;
import p027e3.a;

/* JADX INFO: renamed from: x0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1099g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1099g f14023a = new C1099g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f14024b;

    @Override // p024e0.i
    public final boolean a() {
        Boolean bool = f14024b;
        if (bool != null) {
            return bool.booleanValue();
        }
        a.z0("canFocus is read before it is written");
        throw null;
    }

    @Override // p024e0.i
    public final void b(boolean z5) {
        f14024b = Boolean.valueOf(z5);
    }
}
