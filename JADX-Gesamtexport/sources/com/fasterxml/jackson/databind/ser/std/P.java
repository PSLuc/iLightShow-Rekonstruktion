package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0352n;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends p015c2.o implements Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    private static final long serialVersionUID = 1;
    protected final Class<Object> _handledType;

    public P(int i, Class cls) {
        this._handledType = cls;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    @Override // p015c2.o
    public void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        bVar.getClass();
    }

    public p087q2.r createSchemaNode(String str) {
        p087q2.r rVar = new p087q2.r(p087q2.m.f11222h);
        rVar.q("type", str);
        return rVar;
    }

    public p015c2.o findAnnotatedContentSerializer(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        Object objD;
        if (interfaceC0472c == null) {
            return null;
        }
        AbstractC0771g abstractC0771gE = interfaceC0472c.e();
        p015c2.B bD = e6.f7226j.d();
        if (abstractC0771gE == null || (objD = bD.d(abstractC0771gE)) == null) {
            return null;
        }
        return e6.y0(abstractC0771gE, objD);
    }

    public p015c2.o findContextualConvertingSerializer(p015c2.E e6, InterfaceC0472c interfaceC0472c, p015c2.o oVar) {
        Object obj = KEY_CONTENT_CONVERTER_LOCK;
        Map identityHashMap = (Map) e6.q0(obj);
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            p026e2.h hVar = e6.f7229m;
            p026e2.h hVar2 = p026e2.h.f8699l;
            hVar.getClass();
            Map map = Collections.EMPTY_MAP;
            HashMap map2 = hVar.f8701k;
            if (map2 == null) {
                HashMap map3 = new HashMap();
                map3.put(obj, identityHashMap);
                p026e2.h hVar3 = new p026e2.h();
                hVar3.f8701k = map3;
                hVar = hVar3;
            } else {
                map2.put(obj, identityHashMap);
            }
            e6.f7229m = hVar;
        } else if (identityHashMap.get(interfaceC0472c) != null) {
            return oVar;
        }
        identityHashMap.put(interfaceC0472c, Boolean.TRUE);
        try {
            p015c2.o oVarFindConvertingContentSerializer = findConvertingContentSerializer(e6, interfaceC0472c, oVar);
            return oVarFindConvertingContentSerializer != null ? e6.t0(oVarFindConvertingContentSerializer, interfaceC0472c) : oVar;
        } finally {
            identityHashMap.remove(interfaceC0472c);
        }
    }

    @Deprecated
    public p015c2.o findConvertingContentSerializer(p015c2.E e6, InterfaceC0472c interfaceC0472c, p015c2.o oVar) {
        AbstractC0771g abstractC0771gE;
        Object objP;
        p015c2.B bD = e6.f7226j.d();
        if (!_neitherNull(bD, interfaceC0472c) || (abstractC0771gE = interfaceC0472c.e()) == null || (objP = bD.P(abstractC0771gE)) == null) {
            return oVar;
        }
        interfaceC0472c.e();
        p109u2.l lVarM = e6.m(objP);
        e6.A();
        p015c2.h hVar = ((p037g2.m) lVarM).f9146a;
        if (oVar == null && !hVar.m0() && (oVar = e6.f7233q.a(hVar)) == null && (oVar = e6.f7228l.y(hVar)) == null && (oVar = e6.a0(hVar)) == null) {
            oVar = e6.r0(hVar.f7281k);
        }
        return new H(lVarM, hVar, oVar);
    }

    public Boolean findFormatFeature(p015c2.E e6, InterfaceC0472c interfaceC0472c, Class<?> cls, EnumC0352n enumC0352n) {
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, cls);
        if (c0355qFindFormatOverrides != null) {
            return c0355qFindFormatOverrides.b(enumC0352n);
        }
        return null;
    }

    public C0355q findFormatOverrides(p015c2.E e6, InterfaceC0472c interfaceC0472c, Class<?> cls) {
        return interfaceC0472c != null ? interfaceC0472c.b(e6.f7226j, cls) : e6.f7226j.f(cls);
    }

    public S1.A findIncludeOverrides(p015c2.E e6, InterfaceC0472c interfaceC0472c, Class<?> cls) {
        if (interfaceC0472c != null) {
            return interfaceC0472c.f(e6.f7226j, cls);
        }
        p015c2.C c6 = e6.f7226j;
        c6.e(cls);
        c6.f8724n.getClass();
        return S1.A.f4905l;
    }

    public p093r2.i findPropertyFilter(p015c2.E e6, Object obj, Object obj2) {
        e6.f7226j.getClass();
        e6.P("Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured", handledType());
        throw null;
    }

    public JsonNode getSchema(p015c2.E e6, Type type) {
        return createSchemaNode("string");
    }

    @Override // p015c2.o
    public Class<Object> handledType() {
        return this._handledType;
    }

    public boolean isDefaultSerializer(p015c2.o oVar) {
        return p109u2.i.v(oVar);
    }

    public void visitArrayFormat(p059l2.b bVar, p015c2.h hVar, p015c2.o oVar, p015c2.h hVar2) {
        bVar.getClass();
        if (_neitherNull(null, oVar)) {
            throw null;
        }
    }

    public void visitFloatFormat(p059l2.b bVar, p015c2.h hVar, T1.h hVar2) {
        bVar.getClass();
    }

    public void visitIntFormat(p059l2.b bVar, p015c2.h hVar, T1.h hVar2) {
        bVar.getClass();
        if (_neitherNull(null, hVar2)) {
            throw null;
        }
    }

    public void visitStringFormat(p059l2.b bVar, p015c2.h hVar) {
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public void wrapAndThrow(p015c2.E e6, Throwable th, Object obj, String str) throws IOException {
        boolean z5;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        p109u2.i.C(th);
        if (e6 != null) {
            if (e6.f7226j.p(p015c2.D.WRAP_EXCEPTIONS)) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = true;
        }
        if (th instanceof IOException) {
            if (!z5 || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z5) {
            p109u2.i.E(th);
        }
        int i = JsonMappingException.f7531k;
        throw JsonMappingException.h(th, new p015c2.k(str, obj));
    }

    public JsonNode getSchema(p015c2.E e6, Type type, boolean z5) {
        p087q2.r rVar = (p087q2.r) getSchema(e6, type);
        if (!z5) {
            rVar.r("required", !z5);
        }
        return rVar;
    }

    public void visitStringFormat(p059l2.b bVar, p015c2.h hVar, p059l2.c cVar) {
        bVar.getClass();
    }

    public P(p015c2.h hVar) {
        this._handledType = hVar.f7281k;
    }

    public p087q2.r createSchemaNode(String str, boolean z5) {
        p087q2.r rVarCreateSchemaNode = createSchemaNode(str);
        if (!z5) {
            rVarCreateSchemaNode.r("required", !z5);
        }
        return rVarCreateSchemaNode;
    }

    public void visitArrayFormat(p059l2.b bVar, p015c2.h hVar, p059l2.a aVar) {
        bVar.getClass();
    }

    public void visitIntFormat(p059l2.b bVar, p015c2.h hVar, T1.h hVar2, p059l2.c cVar) {
        bVar.getClass();
    }

    public P(P p6) {
        this._handledType = p6._handledType;
    }

    public P(Class cls) {
        this._handledType = cls;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    public void wrapAndThrow(p015c2.E e6, Throwable th, Object obj, int i) throws IOException {
        boolean z5;
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        p109u2.i.C(th);
        if (e6 != null) {
            if (e6.f7226j.p(p015c2.D.WRAP_EXCEPTIONS)) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = true;
        }
        if (th instanceof IOException) {
            if (!z5 || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z5) {
            p109u2.i.E(th);
        }
        throw JsonMappingException.i(th, obj, i);
    }
}
