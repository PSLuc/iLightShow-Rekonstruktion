package p077o2;

import S1.T;
import S1.U;
import T1.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p012c.k;
import p015c2.C;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p015c2.h;
import p020d2.n;
import p026e2.a;
import p026e2.o;
import p071n2.b;
import p071n2.c;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U f10647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f10648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10650d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Class f10651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f10652f;

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    public final a a(C0474e c0474e, h hVar, ArrayList arrayList) {
        h hVar2;
        h hVarJ;
        if (this.f10647a == U.NONE || hVar.f7281k.isPrimitive()) {
            return null;
        }
        c0474e.i.getClass();
        r rVar = j.f10644h;
        r bVar = c0474e.k(p015c2.r.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES) ? new b() : rVar;
        U u6 = this.f10647a;
        if (u6 == U.CLASS || u6 == U.MINIMAL_CLASS) {
            int iA = bVar.a(hVar);
            if (iA == 2) {
                throw new IllegalArgumentException(k.s("Configured `PolymorphicTypeValidator` (of type ", i.f(bVar), ") denied resolution of all subtypes of base type ", i.f(hVar.f7281k)));
            }
            if (iA != 1) {
                rVar = bVar;
            }
        } else {
            rVar = bVar;
        }
        o oVarC = c(c0474e, hVar, rVar, arrayList, false, true);
        Class cls = this.f10651e;
        if (cls != null) {
            a aVar = c0474e.i;
            if (cls == Void.class || cls == n.class) {
                hVarJ = aVar.f8680h.j(cls);
            } else {
                if (!hVar.h0(cls)) {
                    if (hVar.o0(this.f10651e)) {
                        hVarJ = aVar.f8680h.i(hVar, this.f10651e, false);
                    } else if (!hVar.h0(this.f10651e)) {
                        if (c0474e.k(p015c2.r.USE_BASE_TYPE_AS_DEFAULT_IMPL) || hVar.i0()) {
                            hVar2 = null;
                        }
                    }
                }
                hVar2 = hVar;
            }
            hVar2 = hVarJ;
        } else {
            if (c0474e.k(p015c2.r.USE_BASE_TYPE_AS_DEFAULT_IMPL)) {
            }
            hVar2 = null;
        }
        if (this.f10647a == U.DEDUCTION) {
            return new b(hVar, oVarC, hVar2, c0474e, arrayList);
        }
        int iOrdinal = this.f10648b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new a(hVar, oVarC, this.f10649c, this.f10650d, hVar2, 1);
            }
            if (iOrdinal == 2) {
                return new a(hVar, oVarC, this.f10649c, this.f10650d, hVar2, 0);
            }
            if (iOrdinal == 3) {
                return new e(hVar, oVarC, this.f10649c, this.f10650d, hVar2, 0);
            }
            if (iOrdinal != 4) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f10648b);
            }
        }
        return new g(hVar, oVarC, this.f10649c, this.f10650d, hVar2, this.f10648b);
    }

    public final q b(C c6, h hVar, ArrayList arrayList) {
        InterfaceC0472c interfaceC0472c = null;
        if (this.f10647a == U.NONE || hVar.f7281k.isPrimitive()) {
            return null;
        }
        if (this.f10647a == U.DEDUCTION) {
            return c.f10637d;
        }
        c6.i.getClass();
        r bVar = j.f10644h;
        if (c6.k(p015c2.r.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES)) {
            bVar = new b();
        }
        o oVarC = c(c6, hVar, bVar, arrayList, true, false);
        int iOrdinal = this.f10648b.ordinal();
        if (iOrdinal == 0) {
            return new h(oVarC, null, this.f10649c);
        }
        if (iOrdinal == 1) {
            return new c(oVarC, interfaceC0472c, 2);
        }
        if (iOrdinal == 2) {
            return new c(oVarC, interfaceC0472c, 1);
        }
        if (iOrdinal == 3) {
            return new f(oVarC, null, this.f10649c);
        }
        if (iOrdinal == 4) {
            return new d(oVarC, null, this.f10649c);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f10648b);
    }

    public final o c(o oVar, h hVar, r rVar, ArrayList arrayList, boolean z5, boolean z6) {
        ConcurrentHashMap concurrentHashMap;
        String name;
        o oVar2 = this.f10652f;
        if (oVar2 != null) {
            return oVar2;
        }
        U u6 = this.f10647a;
        if (u6 == null) {
            throw new IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int iOrdinal = u6.ordinal();
        HashMap map = null;
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new k(hVar, oVar.i.f8680h, rVar);
            }
            if (iOrdinal == 3) {
                if (z5 == z6) {
                    throw new IllegalArgumentException();
                }
                if (z5) {
                    concurrentHashMap = new ConcurrentHashMap();
                } else {
                    map = new HashMap();
                    concurrentHashMap = new ConcurrentHashMap(4);
                }
                boolean zK = oVar.k(p015c2.r.ACCEPT_CASE_INSENSITIVE_VALUES);
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        c cVar = (c) obj;
                        Class cls = cVar.f10538h;
                        if (cVar.a()) {
                            name = cVar.f10539j;
                        } else {
                            name = cls.getName();
                            int iLastIndexOf = name.lastIndexOf(46);
                            if (iLastIndexOf >= 0) {
                                name = name.substring(iLastIndexOf + 1);
                            }
                        }
                        if (z5) {
                            concurrentHashMap.put(cls.getName(), name);
                        }
                        if (z6) {
                            if (zK) {
                                name = name.toLowerCase();
                            }
                            h hVar2 = (h) map.get(name);
                            if (hVar2 == null || !cls.isAssignableFrom(hVar2.f7281k)) {
                                map.put(name, oVar.c(cls));
                            }
                        }
                    }
                }
                return new p(oVar, hVar, concurrentHashMap, map);
            }
            if (iOrdinal != 4) {
                throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.f10647a);
            }
        }
        return new i(hVar, oVar.i.f8680h, rVar);
    }
}
