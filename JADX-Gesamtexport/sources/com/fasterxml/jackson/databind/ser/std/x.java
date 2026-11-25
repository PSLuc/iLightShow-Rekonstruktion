package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0352n;
import c5.C0495p;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.IOException;
import java.util.Objects;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0530a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p015c2.h f7766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p071n2.e f7767l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.o f7768m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AbstractC0599v0 f7769n;

    public x(p015c2.h hVar, boolean z5, p071n2.e eVar, p015c2.o oVar) {
        super(Object[].class);
        this.f7766k = hVar;
        this.f7765j = z5;
        this.f7767l = eVar;
        this.f7769n = p098s2.i.f12180k;
        this.f7768m = oVar;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a, p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVarY0;
        p015c2.h hVar;
        Object objD;
        p071n2.e eVar = this.f7767l;
        p071n2.e eVarG = eVar != null ? eVar.g(interfaceC0472c) : eVar;
        if (interfaceC0472c != null) {
            AbstractC0771g abstractC0771gE = interfaceC0472c.e();
            p015c2.B bD = e6.f7226j.d();
            if (abstractC0771gE == null || (objD = bD.d(abstractC0771gE)) == null) {
                oVarY0 = null;
            } else {
                oVarY0 = e6.y0(abstractC0771gE, objD);
            }
        } else {
            oVarY0 = null;
        }
        C0355q c0355qFindFormatOverrides = findFormatOverrides(e6, interfaceC0472c, handledType());
        Boolean boolB = c0355qFindFormatOverrides != null ? c0355qFindFormatOverrides.b(EnumC0352n.f4955j) : null;
        p015c2.o oVar = this.f7768m;
        if (oVarY0 == null) {
            oVarY0 = oVar;
        }
        p015c2.o oVarFindContextualConvertingSerializer = findContextualConvertingSerializer(e6, interfaceC0472c, oVarY0);
        if (oVarFindContextualConvertingSerializer == null && (hVar = this.f7766k) != null && this.f7765j && !hVar.m0()) {
            oVarFindContextualConvertingSerializer = e6.h0(hVar, interfaceC0472c);
        }
        p015c2.o oVar2 = oVarFindContextualConvertingSerializer;
        return (this.f7701h == interfaceC0472c && oVar2 == oVar && eVar == eVarG && Objects.equals(this.i, boolB)) ? this : new x(this, interfaceC0472c, eVarG, oVar2, boolB);
    }

    @Override // p093r2.f
    public final p093r2.f c(p071n2.e eVar) {
        return new x(this.f7766k, this.f7765j, eVar, this.f7768m);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    public final p015c2.o e(InterfaceC0472c interfaceC0472c, Boolean bool) {
        return new x(this, interfaceC0472c, this.f7767l, this.f7768m, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC0530a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(Object[] objArr, T1.e eVar, p015c2.E e6) throws IOException {
        AbstractC0599v0 abstractC0599v0G;
        p015c2.h hVar = this.f7766k;
        int length = objArr.length;
        if (length == 0) {
            return;
        }
        p015c2.o oVar = this.f7768m;
        p071n2.e eVar2 = this.f7767l;
        Object obj = null;
        int i = 0;
        if (oVar != null) {
            int length2 = objArr.length;
            while (i < length2) {
                try {
                    obj = objArr[i];
                    if (obj == null) {
                        e6.g0(eVar);
                    } else if (eVar2 == null) {
                        oVar.serialize(obj, eVar, e6);
                    } else {
                        oVar.serializeWithType(obj, eVar, e6, eVar2);
                    }
                    i++;
                } catch (Exception e7) {
                    wrapAndThrow(e6, e7, obj, i);
                    return;
                }
            }
            return;
        }
        InterfaceC0472c interfaceC0472c = this.f7701h;
        if (eVar2 != null) {
            int length3 = objArr.length;
            try {
                AbstractC0599v0 abstractC0599v0 = this.f7769n;
                while (i < length3) {
                    obj = objArr[i];
                    if (obj == null) {
                        e6.g0(eVar);
                    } else {
                        Class<?> cls = obj.getClass();
                        p015c2.o oVarI = abstractC0599v0.I(cls);
                        if (oVarI == null && abstractC0599v0 != (abstractC0599v0G = abstractC0599v0.G(cls, (oVarI = e6.i0(cls, interfaceC0472c))))) {
                            this.f7769n = abstractC0599v0G;
                        }
                        oVarI.serializeWithType(obj, eVar, e6, eVar2);
                    }
                    i++;
                }
                return;
            } catch (Exception e8) {
                wrapAndThrow(e6, e8, obj, i);
                return;
            }
        }
        try {
            AbstractC0599v0 abstractC0599v1 = this.f7769n;
            while (i < length) {
                obj = objArr[i];
                if (obj == null) {
                    e6.g0(eVar);
                } else {
                    Class<?> cls2 = obj.getClass();
                    p015c2.o oVarI2 = abstractC0599v1.I(cls2);
                    if (oVarI2 == null) {
                        if (hVar.f0()) {
                            C0495p c0495pU = abstractC0599v1.u(e6.f0(hVar, cls2), e6, interfaceC0472c);
                            AbstractC0599v0 abstractC0599v2 = (AbstractC0599v0) c0495pU.f7476j;
                            if (abstractC0599v1 != abstractC0599v2) {
                                this.f7769n = abstractC0599v2;
                            }
                            oVarI2 = (p015c2.o) c0495pU.i;
                        } else {
                            oVarI2 = e6.i0(cls2, interfaceC0472c);
                            AbstractC0599v0 abstractC0599v0G2 = abstractC0599v1.G(cls2, oVarI2);
                            if (abstractC0599v1 != abstractC0599v0G2) {
                                this.f7769n = abstractC0599v0G2;
                            }
                        }
                    }
                    oVarI2.serialize(obj, eVar, e6);
                }
                i++;
            }
        } catch (Exception e9) {
            wrapAndThrow(e6, e9, obj, i);
        }
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        return ((Object[]) obj).length == 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L10;
     */
    @Override // p015c2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(java.lang.Object r4, T1.e r5, p015c2.E r6) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1c
            java.lang.Boolean r0 = r3.i
            if (r0 != 0) goto L14
            c2.D r1 = p015c2.D.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            c2.C r2 = r6.f7226j
            boolean r1 = r2.p(r1)
            if (r1 != 0) goto L18
        L14:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            if (r0 != r1) goto L1c
        L18:
            r3.f(r4, r5, r6)
            return
        L1c:
            r5.n0(r4)
            r3.f(r4, r5, r6)
            r5.L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.x.serialize(java.lang.Object, T1.e, c2.E):void");
    }

    public x(x xVar, InterfaceC0472c interfaceC0472c, p071n2.e eVar, p015c2.o oVar, Boolean bool) {
        super(xVar, interfaceC0472c, bool);
        this.f7766k = xVar.f7766k;
        this.f7767l = eVar;
        this.f7765j = xVar.f7765j;
        this.f7769n = p098s2.i.f12180k;
        this.f7768m = oVar;
    }
}
