package p116v3;

import F.L;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13287c;

    public n(Method method, Object obj) {
        this.f13286b = method;
        this.f13287c = obj;
    }

    @Override // p116v3.r
    public final Object a(Class cls) {
        String strD = L.d(cls);
        if (strD != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
        }
        return this.f13286b.invoke(this.f13287c, cls);
    }
}
