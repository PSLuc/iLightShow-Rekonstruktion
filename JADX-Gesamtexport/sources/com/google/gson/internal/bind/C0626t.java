package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.gson.internal.bind.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0626t extends p105t3.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8137d;

    public C0626t(Class cls) {
        this.f8134a = 1;
        this.f8135b = new HashMap();
        this.f8136c = new HashMap();
        this.f8137d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new Y(cls))) {
                Enum r6 = (Enum) field.get(null);
                String strName = r6.name();
                String string = r6.toString();
                p110u3.c cVar = (p110u3.c) field.getAnnotation(p110u3.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        ((HashMap) this.f8135b).put(str, r6);
                    }
                }
                ((HashMap) this.f8135b).put(strName, r6);
                ((HashMap) this.f8136c).put(string, r6);
                ((HashMap) this.f8137d).put(r6, strName);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // p105t3.C
    public final Object a(p138z3.a aVar) throws IOException {
        switch (this.f8134a) {
            case 0:
                return ((p105t3.C) this.f8136c).a(aVar);
            default:
                if (aVar.f0() == 9) {
                    aVar.b0();
                    return null;
                }
                String strD0 = aVar.d0();
                Enum r6 = (Enum) ((HashMap) this.f8135b).get(strD0);
                return r6 == null ? (Enum) ((HashMap) this.f8136c).get(strD0) : r6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    @Override // p105t3.C
    public final void b(p138z3.c cVar, Object obj) {
        p105t3.C c6;
        switch (this.f8134a) {
            case 0:
                Type type = (Type) this.f8137d;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                p105t3.C c7 = (p105t3.C) this.f8136c;
                if (type2 != type) {
                    p105t3.C cG = ((p105t3.m) this.f8135b).g(p132y3.a.get(type2));
                    if (cG instanceof AbstractC0621n) {
                        p105t3.C c8 = c7;
                        while ((c8 instanceof r) && (c6 = ((r) c8).c()) != c8) {
                            c8 = c6;
                        }
                        if (c8 instanceof AbstractC0621n) {
                            c7 = cG;
                        }
                    } else {
                        c7 = cG;
                    }
                }
                c7.b(cVar, obj);
                break;
            default:
                Enum r6 = (Enum) obj;
                cVar.Z(r6 == null ? null : (String) ((HashMap) this.f8137d).get(r6));
                break;
        }
    }

    public C0626t(p105t3.m mVar, p105t3.C c6, Type type) {
        this.f8134a = 0;
        this.f8135b = mVar;
        this.f8136c = c6;
        this.f8137d = type;
    }
}
