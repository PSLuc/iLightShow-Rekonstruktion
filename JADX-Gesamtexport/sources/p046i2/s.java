package p046i2;

import O1.E;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p009b2.l;
import p015c2.B;
import p015c2.h;
import p026e2.n;
import p026e2.o;
import p104t2.a;
import p104t2.i;
import p104t2.m;
import p109u2.InterfaceC0963b;

/* JADX INFO: loaded from: classes.dex */
public final class s extends q implements Serializable {
    public static final r i = r.f(i.z0(String.class), null, new C0766b(String.class));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r f9570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f9571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f9572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f9573m;

    static {
        Class cls = Boolean.TYPE;
        f9570j = r.f(i.z0(cls), null, new C0766b(cls));
        Class cls2 = Integer.TYPE;
        f9571k = r.f(i.z0(cls2), null, new C0766b(cls2));
        Class cls3 = Long.TYPE;
        f9572l = r.f(i.z0(cls3), null, new C0766b(cls3));
        f9573m = r.f(i.z0(Object.class), null, new C0766b(Object.class));
    }

    public static r m(o oVar, h hVar) {
        if (!hVar.k0() || (hVar instanceof a)) {
            return null;
        }
        Class cls = hVar.f7281k;
        if (!p109u2.i.u(cls)) {
            return null;
        }
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return r.f(hVar, oVar, o(oVar, hVar, oVar));
        }
        return null;
    }

    public static r n(n nVar, h hVar) {
        Class cls = hVar.f7281k;
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE) {
                if (cls != Long.TYPE) {
                    if (cls != Boolean.TYPE) {
                        return null;
                    }
                    return f9570j;
                }
                return f9572l;
            }
            return f9571k;
        }
        if (!p109u2.i.u(cls)) {
            if (JsonNode.class.isAssignableFrom(cls)) {
                return r.f(hVar, nVar, new C0766b(cls));
            }
            return null;
        }
        if (cls == Object.class) {
            return f9573m;
        }
        if (cls == String.class) {
            return i;
        }
        if (cls != Integer.class) {
            if (cls != Long.class) {
                if (cls != Boolean.class) {
                    return null;
                }
                return f9570j;
            }
            return f9572l;
        }
        return f9571k;
    }

    public static C0766b o(n nVar, h hVar, u uVar) {
        hVar.getClass();
        boolean z5 = hVar instanceof a;
        Class cls = hVar.f7281k;
        if (z5 && (nVar == null || ((o) nVar).f8720j.a(cls) == null)) {
            return new C0766b(cls);
        }
        E e6 = new E(nVar, hVar, uVar);
        ArrayList arrayList = new ArrayList(8);
        if (!hVar.h0(Object.class)) {
            if (cls.isInterface()) {
                E.d(hVar, arrayList, false);
            } else {
                E.e(hVar, arrayList, false);
            }
        }
        InterfaceC0963b interfaceC0963bH = e6.h(arrayList);
        p104t2.n nVar2 = nVar.i.f8680h;
        return new C0766b(hVar, (Class) e6.f4448e, arrayList, (Class) e6.f4449f, interfaceC0963bH, (m) e6.f4447d, (B) e6.f4445b, uVar, nVar2, e6.f4444a);
    }

    public static D p(o oVar, h hVar, o oVar2, boolean z5) {
        y yVar;
        C0766b c0766bO = o(oVar, hVar, oVar2);
        boolean zX = p109u2.i.x(hVar.f7281k);
        p026e2.a aVar = oVar.i;
        if (zX) {
            l lVar = aVar.f8682k;
            yVar = new x(oVar, c0766bO);
        } else {
            l lVar2 = aVar.f8682k;
            yVar = new y(oVar, "set");
        }
        return new D(oVar, z5, hVar, c0766bO, yVar);
    }
}
