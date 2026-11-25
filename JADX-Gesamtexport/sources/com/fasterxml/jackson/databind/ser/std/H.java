package com.fasterxml.jackson.databind.ser.std;

import c5.C0495p;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.Type;
import p015c2.InterfaceC0472c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends P implements p093r2.g, p093r2.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p109u2.l f7693h;
    public final p015c2.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p015c2.o f7694j;

    public H(p109u2.l lVar, p015c2.h hVar, p015c2.o oVar) {
        super(hVar);
        this.f7693h = lVar;
        this.i = hVar;
        this.f7694j = oVar;
    }

    public static p015c2.o c(p015c2.E e6, Object obj) {
        Class<?> cls = obj.getClass();
        p015c2.o oVarB = e6.f7233q.b(cls);
        if (oVarB != null) {
            return oVarB;
        }
        C0495p c0495p = e6.f7228l;
        p015c2.o oVarZ = c0495p.z(cls);
        if (oVarZ != null) {
            return oVarZ;
        }
        p015c2.o oVarY = c0495p.y(e6.f7226j.c(cls));
        return (oVarY == null && (oVarY = e6.b0(cls)) == null) ? e6.r0(cls) : oVarY;
    }

    @Override // p093r2.j
    public final void a(p015c2.E e6) {
        Object obj = this.f7694j;
        if (obj == null || !(obj instanceof p093r2.j)) {
            return;
        }
        ((p093r2.j) obj).a(e6);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        p015c2.o oVar = this.f7694j;
        if (oVar != null) {
            oVar.acceptJsonFormatVisitor(bVar, hVar);
        }
    }

    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVarT0;
        p015c2.h hVar;
        p109u2.l lVar = this.f7693h;
        p015c2.o oVar = this.f7694j;
        p015c2.h hVar2 = this.i;
        if (oVar == null) {
            if (hVar2 == null) {
                e6.A();
                hVar = ((p037g2.m) lVar).f9146a;
            } else {
                hVar = hVar2;
            }
            if (hVar.m0()) {
                oVarT0 = oVar;
            } else {
                oVarT0 = e6.f7233q.a(hVar);
                if (oVarT0 == null && (oVarT0 = e6.f7228l.y(hVar)) == null && (oVarT0 = e6.a0(hVar)) == null) {
                    oVarT0 = e6.r0(hVar.f7281k);
                }
            }
        } else {
            oVarT0 = oVar;
            hVar = hVar2;
        }
        if (oVarT0 instanceof p093r2.g) {
            oVarT0 = e6.t0(oVarT0, interfaceC0472c);
        }
        if (oVarT0 == oVar && hVar == hVar2) {
            return this;
        }
        p109u2.i.F(this, H.class, "withDelegate");
        return new H(lVar, hVar, oVarT0);
    }

    @Override // p015c2.o
    public final p015c2.o getDelegatee() {
        return this.f7694j;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        p015c2.o oVar = this.f7694j;
        return oVar instanceof P ? ((P) oVar).getSchema(e6, type) : super.getSchema(e6, type);
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        Object objB = ((p037g2.m) this.f7693h).b(obj);
        if (objB == null) {
            return true;
        }
        p015c2.o oVar = this.f7694j;
        if (oVar == null) {
            return obj == null;
        }
        return oVar.isEmpty(e6, objB);
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Object objB = ((p037g2.m) this.f7693h).b(obj);
        if (objB == null) {
            e6.g0(eVar);
            return;
        }
        p015c2.o oVarC = this.f7694j;
        if (oVarC == null) {
            oVarC = c(e6, objB);
        }
        oVarC.serialize(objB, eVar, e6);
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        Object objB = ((p037g2.m) this.f7693h).b(obj);
        p015c2.o oVarC = this.f7694j;
        if (oVarC == null) {
            oVarC = c(e6, obj);
        }
        oVarC.serializeWithType(objB, eVar, e6, eVar2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type, boolean z5) {
        p015c2.o oVar = this.f7694j;
        if (oVar instanceof P) {
            return ((P) oVar).getSchema(e6, type, z5);
        }
        return super.getSchema(e6, type);
    }
}
