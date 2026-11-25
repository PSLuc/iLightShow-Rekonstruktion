package p098s2;

import G4.a;
import K2.k;
import S1.A;
import S1.EnumC0363z;
import c5.C0495p;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.IOException;
import java.util.Map;
import p015c2.B;
import p015c2.C;
import p015c2.E;
import p015c2.InterfaceC0472c;
import p015c2.h;
import p015c2.o;
import p046i2.AbstractC0771g;
import p071n2.e;
import p077o2.q;
import p093r2.g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p093r2.f implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0472c f12167h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f12168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f12169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f12170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f12171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f12172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0599v0 f12173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f12174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f12175q;

    public f(h hVar, h hVar2, h hVar3, boolean z5, q qVar, InterfaceC0472c interfaceC0472c) {
        super(hVar);
        this.f12168j = hVar2;
        this.f12169k = hVar3;
        this.i = z5;
        this.f12172n = qVar;
        this.f12167h = interfaceC0472c;
        this.f12173o = i.f12180k;
        this.f12174p = null;
        this.f12175q = false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    @Override // p093r2.g
    public final o b(E e6, InterfaceC0472c interfaceC0472c) {
        o oVarY0;
        o oVarY1;
        boolean zV0;
        boolean z5;
        Object obj;
        A aF;
        C c6 = e6.f7226j;
        B bD = c6.d();
        Object objU = null;
        AbstractC0771g abstractC0771gE = interfaceC0472c == null ? null : interfaceC0472c.e();
        if (abstractC0771gE != null) {
            Object objS = bD.s(abstractC0771gE);
            oVarY1 = objS != null ? e6.y0(abstractC0771gE, objS) : null;
            Object objD = bD.d(abstractC0771gE);
            oVarY0 = objD != null ? e6.y0(abstractC0771gE, objD) : null;
        } else {
            oVarY0 = null;
            oVarY1 = null;
        }
        if (oVarY0 == null) {
            oVarY0 = this.f12171m;
        }
        o oVarFindContextualConvertingSerializer = findContextualConvertingSerializer(e6, interfaceC0472c, oVarY0);
        h hVar = this.f12169k;
        if (oVarFindContextualConvertingSerializer == null && this.i && !hVar.m0()) {
            oVarFindContextualConvertingSerializer = e6.h0(hVar, interfaceC0472c);
        }
        o oVar = oVarFindContextualConvertingSerializer;
        if (oVarY1 == null) {
            oVarY1 = this.f12170l;
        }
        o oVarJ0 = oVarY1 == null ? e6.j0(this.f12168j, interfaceC0472c) : e6.t0(oVarY1, interfaceC0472c);
        if (interfaceC0472c == null || (aF = interfaceC0472c.f(c6, null)) == null) {
            objU = this.f12174p;
            zV0 = this.f12175q;
            z5 = zV0;
            obj = objU;
        } else {
            EnumC0363z enumC0363z = EnumC0363z.f4986l;
            EnumC0363z enumC0363z2 = aF.i;
            if (enumC0363z2 != enumC0363z) {
                int iOrdinal = enumC0363z2.ordinal();
                zV0 = true;
                if (iOrdinal != 1) {
                    EnumC0363z enumC0363z3 = EnumC0363z.f4984j;
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            z5 = true;
                            obj = enumC0363z3;
                        } else if (iOrdinal == 4) {
                            objU = a.u(hVar);
                            if (objU != null && objU.getClass().isArray()) {
                                objU = k.a(objU);
                            }
                        } else if (iOrdinal != 5) {
                            zV0 = false;
                        } else {
                            objU = e6.u0(aF.f4908k);
                            if (objU != null) {
                                zV0 = e6.v0(objU);
                            }
                        }
                    } else if (hVar.D()) {
                        objU = enumC0363z3;
                    }
                }
            } else {
                objU = this.f12174p;
                zV0 = this.f12175q;
            }
            z5 = zV0;
            obj = objU;
        }
        return new f(this, oVarJ0, oVar, obj, z5);
    }

    @Override // p093r2.f
    public final p093r2.f c(e eVar) {
        return new f(this, this.f12170l, this.f12171m, this.f12174p, this.f12175q);
    }

    public final void d(Map.Entry entry, T1.e eVar, E e6) throws IOException {
        o oVar;
        Object key = entry.getKey();
        o oVar2 = key == null ? e6.f7232p : this.f12170l;
        Object value = entry.getValue();
        if (value != null) {
            oVar = this.f12171m;
            if (oVar == null) {
                Class<?> cls = value.getClass();
                o oVarI = this.f12173o.I(cls);
                if (oVarI == null) {
                    h hVar = this.f12169k;
                    boolean zF0 = hVar.f0();
                    InterfaceC0472c interfaceC0472c = this.f12167h;
                    if (zF0) {
                        AbstractC0599v0 abstractC0599v0 = this.f12173o;
                        C0495p c0495pU = abstractC0599v0.u(e6.f0(hVar, cls), e6, interfaceC0472c);
                        AbstractC0599v0 abstractC0599v1 = (AbstractC0599v0) c0495pU.f7476j;
                        if (abstractC0599v0 != abstractC0599v1) {
                            this.f12173o = abstractC0599v1;
                        }
                        oVar = (o) c0495pU.i;
                    } else {
                        AbstractC0599v0 abstractC0599v2 = this.f12173o;
                        abstractC0599v2.getClass();
                        o oVarI0 = e6.i0(cls, interfaceC0472c);
                        AbstractC0599v0 abstractC0599v0G = abstractC0599v2.G(cls, oVarI0);
                        if (abstractC0599v2 != abstractC0599v0G) {
                            this.f12173o = abstractC0599v0G;
                        }
                        oVar = oVarI0;
                    }
                } else {
                    oVar = oVarI;
                }
            }
            Object obj = this.f12174p;
            if (obj != null && ((obj == EnumC0363z.f4984j && oVar.isEmpty(e6, value)) || obj.equals(value))) {
                return;
            }
        } else if (this.f12175q) {
            return;
        } else {
            oVar = e6.f7231o;
        }
        oVar2.serialize(key, eVar, e6);
        q qVar = this.f12172n;
        try {
            if (qVar == null) {
                oVar.serialize(value, eVar, e6);
            } else {
                oVar.serializeWithType(value, eVar, e6, qVar);
            }
        } catch (Exception e7) {
            wrapAndThrow(e6, e7, entry, "" + key);
        }
    }

    @Override // p015c2.o
    public final boolean isEmpty(E e6, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this.f12175q;
        }
        Object obj2 = this.f12174p;
        if (obj2 == null) {
            return false;
        }
        o oVar = this.f12171m;
        if (oVar == null) {
            Class<?> cls = value.getClass();
            o oVarI = this.f12173o.I(cls);
            if (oVarI == null) {
                try {
                    AbstractC0599v0 abstractC0599v0 = this.f12173o;
                    abstractC0599v0.getClass();
                    o oVarI0 = e6.i0(cls, this.f12167h);
                    AbstractC0599v0 abstractC0599v0G = abstractC0599v0.G(cls, oVarI0);
                    if (abstractC0599v0 != abstractC0599v0G) {
                        this.f12173o = abstractC0599v0G;
                    }
                    oVar = oVarI0;
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                oVar = oVarI;
            }
        }
        return obj2 == EnumC0363z.f4984j ? oVar.isEmpty(e6, value) : obj2.equals(value);
    }

    @Override // p015c2.o
    public final void serialize(Object obj, T1.e eVar, E e6) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        eVar.p0(entry);
        d(entry, eVar, e6);
        eVar.M();
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, E e6, e eVar2) throws IOException {
        Map.Entry entry = (Map.Entry) obj;
        eVar.C(entry);
        p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.START_OBJECT, entry));
        d(entry, eVar, e6);
        eVar2.f(eVar, aVarE);
    }

    public f(f fVar, o oVar, o oVar2, Object obj, boolean z5) {
        super(0, Map.class);
        fVar.getClass();
        this.f12168j = fVar.f12168j;
        this.f12169k = fVar.f12169k;
        this.i = fVar.i;
        this.f12172n = fVar.f12172n;
        this.f12170l = oVar;
        this.f12171m = oVar2;
        this.f12173o = i.f12180k;
        this.f12167h = fVar.f12167h;
        this.f12174p = obj;
        this.f12175q = z5;
    }
}
