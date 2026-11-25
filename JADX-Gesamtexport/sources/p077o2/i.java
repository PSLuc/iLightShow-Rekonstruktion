package p077o2;

import T1.r;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;
import p012c.k;
import p015c2.C0474e;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p104t2.m;
import p104t2.n;
import p104t2.o;
import p104t2.p;

/* JADX INFO: loaded from: classes.dex */
public class i extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f10643c;

    public i(h hVar, n nVar, r rVar) {
        super(hVar, nVar);
        this.f10643c = rVar;
    }

    @Override // p077o2.o
    public final String a() {
        return "class name used as type id";
    }

    @Override // p077o2.o
    public String b(Object obj) {
        return e(obj, obj.getClass(), this.f10655a);
    }

    @Override // p077o2.o
    public final String c(Class cls, Object obj) {
        return e(obj, cls, this.f10655a);
    }

    @Override // p077o2.o
    public final h d(f fVar, String str) {
        return f(fVar, str);
    }

    public final String e(Object obj, Class cls, n nVar) {
        Class declaringClass;
        Class declaringClass2;
        Annotation[] annotationArr = p109u2.i.f12697a;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj instanceof EnumSet) {
                EnumSet enumSet = (EnumSet) obj;
                if (enumSet.isEmpty()) {
                    p109u2.h hVar = p109u2.h.f12692e;
                    Field field = hVar.f12693a;
                    if (field == null) {
                        throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + hVar.f12695c);
                    }
                    try {
                        declaringClass2 = (Class) field.get(enumSet);
                    } catch (Exception e6) {
                        throw new IllegalArgumentException(e6);
                    }
                } else {
                    declaringClass2 = ((Enum) enumSet.iterator().next()).getDeclaringClass();
                }
                return nVar.f(nVar.c(null, declaringClass2, n.f12537l), EnumSet.class).y0();
            }
            if (obj instanceof EnumMap) {
                EnumMap enumMap = (EnumMap) obj;
                if (enumMap.isEmpty()) {
                    p109u2.h hVar2 = p109u2.h.f12692e;
                    Field field2 = hVar2.f12694b;
                    if (field2 == null) {
                        throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + hVar2.f12696d);
                    }
                    try {
                        declaringClass = (Class) field2.get(enumMap);
                    } catch (Exception e7) {
                        throw new IllegalArgumentException(e7);
                    }
                } else {
                    declaringClass = ((Enum) enumMap.keySet().iterator().next()).getDeclaringClass();
                }
                m mVar = n.f12537l;
                return nVar.h(EnumMap.class, nVar.c(null, declaringClass, mVar), nVar.c(null, Object.class, mVar)).y0();
            }
        } else if (name.indexOf(36) >= 0 && p109u2.i.p(cls) != null) {
            h hVar3 = this.f10656b;
            if (p109u2.i.p(hVar3.f7281k) == null) {
                return hVar3.f7281k.getName();
            }
        }
        return name;
    }

    public h f(f fVar, String str) throws InvalidTypeIdException {
        h hVarI;
        fVar.getClass();
        int iIndexOf = str.indexOf(60);
        C0474e c0474e = fVar.f7249l;
        h hVar = this.f10656b;
        r rVar = this.f10643c;
        if (iIndexOf > 0) {
            str.substring(0, iIndexOf);
            if (rVar.b() == 2) {
                throw fVar.z0(hVar, str, "Configured `PolymorphicTypeValidator` (of type " + p109u2.i.f(rVar) + ") denied resolution");
            }
            p pVar = fVar.A().i;
            pVar.getClass();
            o oVar = new o(str.trim());
            hVarI = pVar.b(oVar);
            if (oVar.hasMoreTokens()) {
                throw p.a(oVar, "Unexpected tokens after complete type");
            }
            if (!hVarI.n0(hVar.f7281k)) {
                throw fVar.z0(hVar, str, "Not a subtype");
            }
        } else {
            if (rVar.b() == 2) {
                throw fVar.z0(hVar, str, "Configured `PolymorphicTypeValidator` (of type " + p109u2.i.f(rVar) + ") denied resolution");
            }
            try {
                fVar.A().getClass();
                Class clsK = n.k(str);
                if (!hVar.o0(clsK)) {
                    throw fVar.z0(hVar, str, "Not a subtype");
                }
                hVarI = c0474e.i.f8680h.i(hVar, clsK, false);
            } catch (ClassNotFoundException unused) {
                hVarI = null;
            } catch (Exception e6) {
                throw fVar.z0(hVar, str, k.s("problem: (", e6.getClass().getName(), ") ", p109u2.i.i(e6)));
            }
        }
        if (hVarI != null) {
            return hVarI;
        }
        c0474e.getClass();
        if (fVar.B0(g.FAIL_ON_INVALID_SUBTYPE)) {
            throw fVar.z0(hVar, str, "no such class found");
        }
        return null;
    }
}
