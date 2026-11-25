package p071n2;

import S1.T;
import T1.i;
import T1.k;
import p015c2.InterfaceC0472c;
import p015c2.f;
import p015c2.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static Object a(i iVar, h hVar) {
        Class cls = hVar.f7281k;
        k kVarS = iVar.s();
        if (kVarS == null) {
            return null;
        }
        switch (kVarS.ordinal()) {
            case 7:
                if (cls.isAssignableFrom(String.class)) {
                    return iVar.i0();
                }
                return null;
            case 8:
                if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(iVar.Z());
                }
                return null;
            case 9:
                if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(iVar.V());
                }
                return null;
            case 10:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.TRUE;
                }
                return null;
            case 11:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract Object b(i iVar, f fVar);

    public abstract Object c(i iVar, f fVar);

    public abstract Object d(i iVar, f fVar);

    public abstract Object e(i iVar, f fVar);

    public abstract d f(InterfaceC0472c interfaceC0472c);

    public abstract T g();
}
