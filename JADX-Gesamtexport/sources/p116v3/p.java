package p116v3;

import F.L;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13290b;

    public p(Method method) {
        this.f13290b = method;
    }

    @Override // p116v3.r
    public final Object a(Class cls) {
        String strD = L.d(cls);
        if (strD != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
        }
        return this.f13290b.invoke(null, cls, Object.class);
    }
}
