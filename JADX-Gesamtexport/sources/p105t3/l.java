package p105t3;

import com.google.gson.internal.bind.r;
import p138z3.a;
import p138z3.c;

/* JADX INFO: loaded from: classes.dex */
public class l extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C f12566a = null;

    @Override // p105t3.C
    public final Object a(a aVar) {
        C c6 = this.f12566a;
        if (c6 != null) {
            return c6.a(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // p105t3.C
    public final void b(c cVar, Object obj) {
        C c6 = this.f12566a;
        if (c6 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        c6.b(cVar, obj);
    }

    @Override // com.google.gson.internal.bind.r
    public final C c() {
        C c6 = this.f12566a;
        if (c6 != null) {
            return c6;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
