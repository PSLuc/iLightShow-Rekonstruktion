package p116v3;

import F.L;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f13288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13289c;

    public o(int i, Method method) {
        this.f13288b = method;
        this.f13289c = i;
    }

    @Override // p116v3.r
    public final Object a(Class cls) {
        String strD = L.d(cls);
        if (strD != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strD));
        }
        return this.f13288b.invoke(null, cls, Integer.valueOf(this.f13289c));
    }
}
