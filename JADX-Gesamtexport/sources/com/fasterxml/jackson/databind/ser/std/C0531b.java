package com.fasterxml.jackson.databind.ser.std;

import S1.EnumC0363z;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicReference;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531b extends P implements p093r2.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7702h;
    public final InterfaceC0472c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p071n2.e f7703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p015c2.o f7704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p109u2.s f7705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient AbstractC0599v0 f7706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f7707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7708o;

    public C0531b(p104t2.g gVar, p071n2.e eVar, p015c2.o oVar) {
        super(gVar);
        this.f7702h = gVar.f12509t;
        this.i = null;
        this.f7703j = eVar;
        this.f7704k = oVar;
        this.f7705l = null;
        this.f7707n = null;
        this.f7708o = false;
        this.f7706m = p098s2.i.f12180k;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        p015c2.o oVar = this.f7704k;
        if (oVar == null) {
            throw null;
        }
        oVar.acceptJsonFormatVisitor(bVar, this.f7702h);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        S1.A aF;
        Object obj;
        boolean z5;
        boolean zV0;
        boolean zK;
        p071n2.e eVar = this.f7703j;
        p071n2.e eVarG = eVar != null ? eVar.g(interfaceC0472c) : eVar;
        p015c2.o oVarFindAnnotatedContentSerializer = findAnnotatedContentSerializer(e6, interfaceC0472c);
        p015c2.C c6 = e6.f7226j;
        p015c2.o oVar = this.f7704k;
        p015c2.h hVar = this.f7702h;
        if (oVarFindAnnotatedContentSerializer == null) {
            if (oVar == null) {
                if (hVar.m0()) {
                    zK = false;
                } else if (Modifier.isFinal(hVar.f7281k.getModifiers()) || hVar.f7285o) {
                    zK = true;
                } else {
                    p015c2.B bD = c6.d();
                    if (interfaceC0472c != null && interfaceC0472c.e() != null) {
                        p020d2.i iVarT = bD.T(interfaceC0472c.e());
                        if (iVarT == p020d2.i.i) {
                            zK = true;
                        } else if (iVarT == p020d2.i.f8582h) {
                            zK = false;
                        }
                    }
                    zK = c6.k(p015c2.r.USE_STATIC_TYPING);
                }
                oVarFindAnnotatedContentSerializer = zK ? e6.l0(hVar, interfaceC0472c) : oVar;
            } else {
                oVarFindAnnotatedContentSerializer = e6.s0(oVar, interfaceC0472c);
            }
        }
        C0531b c0531b = (this.i == interfaceC0472c && eVar == eVarG && oVar == oVarFindAnnotatedContentSerializer) ? this : new C0531b(this, interfaceC0472c, eVarG, oVarFindAnnotatedContentSerializer, this.f7705l, this.f7707n, this.f7708o);
        if (interfaceC0472c != null && (aF = interfaceC0472c.f(c6, handledType())) != null) {
            EnumC0363z enumC0363z = EnumC0363z.f4986l;
            EnumC0363z enumC0363z2 = aF.i;
            if (enumC0363z2 != enumC0363z) {
                int iOrdinal = enumC0363z2.ordinal();
                Object objU = null;
                if (iOrdinal != 1) {
                    EnumC0363z enumC0363z3 = EnumC0363z.f4984j;
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            obj = enumC0363z3;
                            z5 = true;
                        } else if (iOrdinal != 4) {
                            if (iOrdinal == 5) {
                                objU = e6.u0(aF.f4908k);
                                zV0 = objU != null ? e6.v0(objU) : false;
                            }
                            obj = objU;
                            z5 = zV0;
                        } else {
                            objU = G4.a.u(hVar);
                            if (objU != null && objU.getClass().isArray()) {
                                objU = K2.k.a(objU);
                            }
                        }
                    } else if (hVar.D()) {
                        objU = enumC0363z3;
                    }
                    obj = objU;
                    z5 = true;
                } else {
                    obj = objU;
                    z5 = true;
                }
                if (this.f7707n != obj || this.f7708o != z5) {
                    return new C0531b(c0531b, c0531b.i, c0531b.f7703j, c0531b.f7704k, c0531b.f7705l, obj, z5);
                }
            }
        }
        return c0531b;
    }

    public final p015c2.o c(p015c2.E e6, Class cls) {
        p015c2.o oVarI = this.f7706m.I(cls);
        if (oVarI != null) {
            return oVarI;
        }
        p015c2.h hVar = this.f7702h;
        boolean zF0 = hVar.f0();
        InterfaceC0472c interfaceC0472c = this.i;
        p015c2.o oVarL0 = zF0 ? e6.l0(e6.f0(hVar, cls), interfaceC0472c) : e6.m0(cls, interfaceC0472c);
        p109u2.s sVar = this.f7705l;
        if (sVar != null) {
            oVarL0 = oVarL0.unwrappingSerializer(sVar);
        }
        this.f7706m = this.f7706m.G(cls, oVarL0);
        return oVarL0;
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        AtomicReference atomicReference = (AtomicReference) obj;
        if (atomicReference.get() == null) {
            return true;
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return this.f7708o;
        }
        Object obj3 = this.f7707n;
        if (obj3 == null) {
            return false;
        }
        p015c2.o oVarC = this.f7704k;
        if (oVarC == null) {
            try {
                oVarC = c(e6, obj2.getClass());
            } catch (JsonMappingException e7) {
                throw new RuntimeJsonMappingException(e7);
            }
        }
        return obj3 == EnumC0363z.f4984j ? oVarC.isEmpty(e6, obj2) : obj3.equals(obj2);
    }

    @Override // p015c2.o
    public final boolean isUnwrappingSerializer() {
        return this.f7705l != null;
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, p015c2.E e6) {
        Object obj2 = ((AtomicReference) obj).get();
        if (obj2 == null) {
            if (this.f7705l == null) {
                e6.g0(eVar);
                return;
            }
            return;
        }
        p015c2.o oVarC = this.f7704k;
        if (oVarC == null) {
            oVarC = c(e6, obj2.getClass());
        }
        p071n2.e eVar2 = this.f7703j;
        if (eVar2 != null) {
            oVarC.serializeWithType(obj2, eVar, e6, eVar2);
        } else {
            oVarC.serialize(obj2, eVar, e6);
        }
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) {
        Object obj2 = ((AtomicReference) obj).get();
        if (obj2 == null) {
            if (this.f7705l == null) {
                e6.g0(eVar);
            }
        } else {
            p015c2.o oVarC = this.f7704k;
            if (oVarC == null) {
                oVarC = c(e6, obj2.getClass());
            }
            oVarC.serializeWithType(obj2, eVar, e6, eVar2);
        }
    }

    @Override // p015c2.o
    public final p015c2.o unwrappingSerializer(p109u2.s sVar) {
        p015c2.o oVar;
        p015c2.o oVar2 = this.f7704k;
        if (oVar2 != null) {
            p015c2.o oVarUnwrappingSerializer = oVar2.unwrappingSerializer(sVar);
            if (oVarUnwrappingSerializer != oVar2) {
                oVar = oVarUnwrappingSerializer;
            }
            return this;
        }
        oVar = oVar2;
        p109u2.s sVar2 = this.f7705l;
        p109u2.s qVar = sVar2 == null ? sVar : new p109u2.q(sVar, sVar2);
        if (oVar2 != oVar || sVar2 != qVar) {
            return new C0531b(this, this.i, this.f7703j, oVar, qVar, this.f7707n, this.f7708o);
        }
        return this;
    }

    public C0531b(C0531b c0531b, InterfaceC0472c interfaceC0472c, p071n2.e eVar, p015c2.o oVar, p109u2.s sVar, Object obj, boolean z5) {
        super(c0531b);
        this.f7702h = c0531b.f7702h;
        this.f7706m = p098s2.i.f12180k;
        this.i = interfaceC0472c;
        this.f7703j = eVar;
        this.f7704k = oVar;
        this.f7705l = sVar;
        this.f7707n = obj;
        this.f7708o = z5;
    }
}
