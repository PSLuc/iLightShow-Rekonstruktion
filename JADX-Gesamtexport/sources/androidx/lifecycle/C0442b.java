package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0442b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6982a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f6983b;

    public C0442b(HashMap map) {
        this.f6983b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0453m enumC0453m = (EnumC0453m) entry.getValue();
            List arrayList = (List) this.f6982a.get(enumC0453m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f6982a.put(enumC0453m, arrayList);
            }
            arrayList.add((C0443c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m, r rVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0443c c0443c = (C0443c) list.get(size);
                c0443c.getClass();
                try {
                    int i = c0443c.f6984a;
                    Method method = c0443c.f6985b;
                    if (i == 0) {
                        method.invoke(rVar, null);
                    } else if (i == 1) {
                        method.invoke(rVar, interfaceC0458s);
                    } else if (i == 2) {
                        method.invoke(rVar, interfaceC0458s, enumC0453m);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException("Failed to call observer method", e7.getCause());
                }
            }
        }
    }
}
