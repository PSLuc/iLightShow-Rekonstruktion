package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0543n extends P implements p093r2.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC0771g f7732h;
    public final p071n2.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p015c2.o f7733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0472c f7734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.h f7735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient AbstractC0599v0 f7737n;

    public C0543n(AbstractC0771g abstractC0771g, p071n2.e eVar, p015c2.o oVar) {
        super(abstractC0771g.h());
        this.f7732h = abstractC0771g;
        this.f7735l = abstractC0771g.h();
        this.i = eVar;
        this.f7733j = oVar;
        this.f7734k = null;
        this.f7736m = true;
        this.f7737n = p098s2.i.f12180k;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        Class clsN = this.f7732h.n();
        if (clsN != null) {
            Annotation[] annotationArr = p109u2.i.f12697a;
            if (Enum.class.isAssignableFrom(clsN)) {
                bVar.getClass();
                return;
            }
        }
        p015c2.o oVar = this.f7733j;
        if (oVar == null) {
            throw null;
        }
        oVar.acceptJsonFormatVisitor(bVar, this.f7735l);
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p071n2.e eVarG = this.i;
        if (eVarG != null) {
            eVarG = eVarG.g(interfaceC0472c);
        }
        boolean z5 = this.f7736m;
        p015c2.o oVar = this.f7733j;
        if (oVar != null) {
            return d(interfaceC0472c, eVarG, e6.s0(oVar, interfaceC0472c), z5);
        }
        boolean zK = e6.f7226j.k(p015c2.r.USE_STATIC_TYPING);
        p015c2.h hVar = this.f7735l;
        if (!zK && !Modifier.isFinal(hVar.f7281k.getModifiers())) {
            return interfaceC0472c != this.f7734k ? d(interfaceC0472c, eVarG, oVar, z5) : this;
        }
        p015c2.o oVarL0 = e6.l0(hVar, interfaceC0472c);
        Class cls = hVar.f7281k;
        boolean zIsDefaultSerializer = false;
        if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
            zIsDefaultSerializer = isDefaultSerializer(oVarL0);
        }
        return d(interfaceC0472c, eVarG, oVarL0, zIsDefaultSerializer);
    }

    public final p015c2.o c(p015c2.E e6, Class cls) {
        p015c2.o oVarI = this.f7737n.I(cls);
        if (oVarI != null) {
            return oVarI;
        }
        p015c2.h hVar = this.f7735l;
        boolean zF0 = hVar.f0();
        InterfaceC0472c interfaceC0472c = this.f7734k;
        if (!zF0) {
            p015c2.o oVarM0 = e6.m0(cls, interfaceC0472c);
            this.f7737n = this.f7737n.G(cls, oVarM0);
            return oVarM0;
        }
        p015c2.h hVarF0 = e6.f0(hVar, cls);
        p015c2.o oVarL0 = e6.l0(hVarF0, interfaceC0472c);
        AbstractC0599v0 abstractC0599v0 = this.f7737n;
        abstractC0599v0.getClass();
        this.f7737n = abstractC0599v0.G(hVarF0.f7281k, oVarL0);
        return oVarL0;
    }

    public final C0543n d(InterfaceC0472c interfaceC0472c, p071n2.e eVar, p015c2.o oVar, boolean z5) {
        return (this.f7734k == interfaceC0472c && this.i == eVar && this.f7733j == oVar && z5 == this.f7736m) ? this : new C0543n(this, interfaceC0472c, eVar, oVar, z5);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p015c2.o oVar = this.f7733j;
        if (oVar instanceof P) {
            return ((P) oVar).getSchema(e6, null);
        }
        p087q2.r rVar = new p087q2.r(p087q2.m.f11222h);
        rVar.q("type", "any");
        return rVar;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        Object objQ = this.f7732h.q(obj);
        if (objQ == null) {
            return true;
        }
        p015c2.o oVarC = this.f7733j;
        if (oVarC == null) {
            try {
                oVarC = c(e6, objQ.getClass());
            } catch (JsonMappingException e7) {
                throw new RuntimeJsonMappingException(e7);
            }
        }
        return oVarC.isEmpty(e6, objQ);
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) throws IOException {
        Object objQ;
        AbstractC0771g abstractC0771g = this.f7732h;
        try {
            objQ = abstractC0771g.q(obj);
        } catch (Exception e7) {
            wrapAndThrow(e6, e7, obj, abstractC0771g.getName() + "()");
            objQ = null;
        }
        if (objQ == null) {
            e6.g0(eVar);
            return;
        }
        p015c2.o oVarC = this.f7733j;
        if (oVarC == null) {
            oVarC = c(e6, objQ.getClass());
        }
        p071n2.e eVar2 = this.i;
        if (eVar2 != null) {
            oVarC.serializeWithType(objQ, eVar, e6, eVar2);
        } else {
            oVarC.serialize(objQ, eVar, e6);
        }
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) throws IOException {
        Object objQ;
        AbstractC0771g abstractC0771g = this.f7732h;
        try {
            objQ = abstractC0771g.q(obj);
        } catch (Exception e7) {
            wrapAndThrow(e6, e7, obj, abstractC0771g.getName() + "()");
            objQ = null;
        }
        if (objQ == null) {
            e6.g0(eVar);
            return;
        }
        p015c2.o oVarC = this.f7733j;
        if (oVarC == null) {
            oVarC = c(e6, objQ.getClass());
        } else if (this.f7736m) {
            p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.VALUE_STRING, obj));
            oVarC.serialize(objQ, eVar, e6);
            eVar2.f(eVar, aVarE);
            return;
        }
        oVarC.serializeWithType(objQ, eVar, e6, new C0542m(eVar2, obj));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(@JsonValue serializer for method ");
        AbstractC0771g abstractC0771g = this.f7732h;
        sb.append(abstractC0771g.n());
        sb.append("#");
        sb.append(abstractC0771g.getName());
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0543n(C0543n c0543n, InterfaceC0472c interfaceC0472c, p071n2.e eVar, p015c2.o oVar, boolean z5) {
        Class clsHandledType = c0543n.handledType();
        super(clsHandledType == null ? Object.class : clsHandledType);
        this.f7732h = c0543n.f7732h;
        this.f7735l = c0543n.f7735l;
        this.i = eVar;
        this.f7733j = oVar;
        this.f7734k = interfaceC0472c;
        this.f7736m = z5;
        this.f7737n = p098s2.i.f12180k;
    }
}
