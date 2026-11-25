package com.fasterxml.jackson.databind.ser.std;

import S1.C0355q;
import S1.EnumC0352n;
import c5.C0495p;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p015c2.InterfaceC0472c;
import p046i2.AbstractC0771g;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0537h extends p093r2.f implements p093r2.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7719h;
    public final InterfaceC0472c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f7720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f7721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p071n2.e f7722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p015c2.o f7723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AbstractC0599v0 f7724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7725o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0537h(Class cls, p015c2.h hVar, boolean z5, p077o2.q qVar, p015c2.o oVar, int i) {
        this(cls, hVar, z5, qVar, oVar);
        this.f7725o = i;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.P, p015c2.o
    public final void acceptJsonFormatVisitor(p059l2.b bVar, p015c2.h hVar) {
        p015c2.h hVar2 = this.f7719h;
        p015c2.o oVar = this.f7723m;
        if (oVar == null && hVar2 != null) {
            throw null;
        }
        visitArrayFormat(bVar, hVar, oVar, hVar2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // p093r2.g
    public final p015c2.o b(p015c2.E e6, InterfaceC0472c interfaceC0472c) {
        p015c2.o oVarY0;
        p015c2.h hVar;
        Object objD;
        p071n2.e eVar = this.f7722l;
        p071n2.e eVarG = eVar != null ? eVar.g(interfaceC0472c) : eVar;
        if (interfaceC0472c != null) {
            p015c2.B bD = e6.f7226j.d();
            AbstractC0771g abstractC0771gE = interfaceC0472c.e();
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
        p015c2.o oVar = this.f7723m;
        if (oVarY0 == null) {
            oVarY0 = oVar;
        }
        p015c2.o oVarFindContextualConvertingSerializer = findContextualConvertingSerializer(e6, interfaceC0472c, oVarY0);
        if (oVarFindContextualConvertingSerializer == null && (hVar = this.f7719h) != null && this.f7720j && !hVar.m0()) {
            oVarFindContextualConvertingSerializer = e6.h0(hVar, interfaceC0472c);
        }
        p015c2.o oVar2 = oVarFindContextualConvertingSerializer;
        if (oVar2 == oVar && interfaceC0472c == this.i && eVar == eVarG && Objects.equals(this.f7721k, boolB)) {
            return this;
        }
        switch (this.f7725o) {
            case 0:
                return new C0537h(this, interfaceC0472c, eVarG, oVar2, boolB, 0);
            case 1:
                return new C0537h(this, interfaceC0472c, eVarG, oVar2, boolB, 1);
            case 2:
                return new C0537h(this, interfaceC0472c, eVarG, oVar2, boolB, 2);
            case 3:
                return new C0537h(this, interfaceC0472c, eVarG, oVar2, boolB, 3);
            default:
                return new C0537h(this, interfaceC0472c, eVarG, oVar2, boolB, 4);
        }
    }

    @Override // p093r2.f
    public final p093r2.f c(p071n2.e eVar) {
        switch (this.f7725o) {
            case 0:
                return new C0537h(this, this.i, eVar, this.f7723m, this.f7721k, 0);
            case 1:
                return this;
            case 2:
                return new C0537h(this, this.i, eVar, this.f7723m, this.f7721k, 2);
            case 3:
                return new C0537h(this, this.i, eVar, this.f7723m, this.f7721k, 3);
            default:
                return new C0537h(this, this.i, eVar, this.f7723m, this.f7721k, 4);
        }
    }

    public final p015c2.o d(AbstractC0599v0 abstractC0599v0, p015c2.h hVar, p015c2.E e6) {
        C0495p c0495pU = abstractC0599v0.u(hVar, e6, this.i);
        AbstractC0599v0 abstractC0599v1 = (AbstractC0599v0) c0495pU.f7476j;
        if (abstractC0599v0 != abstractC0599v1) {
            this.f7724n = abstractC0599v1;
        }
        return (p015c2.o) c0495pU.i;
    }

    public final p015c2.o e(AbstractC0599v0 abstractC0599v0, Class cls, p015c2.E e6) {
        p015c2.o oVarI0 = e6.i0(cls, this.i);
        AbstractC0599v0 abstractC0599v0G = abstractC0599v0.G(cls, oVarI0);
        if (abstractC0599v0 != abstractC0599v0G) {
            this.f7724n = abstractC0599v0G;
        }
        return oVarI0;
    }

    public void f(Iterable iterable, T1.e eVar, p015c2.E e6) {
        p015c2.o oVar;
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Class<?> cls = null;
            p015c2.o oVarP0 = null;
            do {
                Object next = it.next();
                if (next == null) {
                    e6.g0(eVar);
                } else {
                    p015c2.o oVar2 = this.f7723m;
                    if (oVar2 == null) {
                        Class<?> cls2 = next.getClass();
                        if (cls2 != cls) {
                            oVarP0 = e6.p0(cls2, this.i);
                            cls = cls2;
                        }
                        oVar = oVarP0;
                    } else {
                        oVar = oVarP0;
                        oVarP0 = oVar2;
                    }
                    p071n2.e eVar2 = this.f7722l;
                    if (eVar2 == null) {
                        oVarP0.serialize(next, eVar, e6);
                    } else {
                        oVarP0.serializeWithType(next, eVar, e6, eVar2);
                    }
                    oVarP0 = oVar;
                }
            } while (it.hasNext());
        }
    }

    public void g(Collection collection, T1.e eVar, p015c2.E e6) throws IOException {
        p015c2.h hVar = this.f7719h;
        eVar.C(collection);
        p071n2.e eVar2 = this.f7722l;
        int i = 0;
        p015c2.o oVar = this.f7723m;
        if (oVar != null) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        try {
                            e6.g0(eVar);
                        } catch (Exception e7) {
                            wrapAndThrow(e6, e7, collection, i);
                        }
                    } else if (eVar2 == null) {
                        oVar.serialize(next, eVar, e6);
                    } else {
                        oVar.serializeWithType(next, eVar, e6, eVar2);
                    }
                    i++;
                } while (it.hasNext());
                return;
            }
            return;
        }
        Iterator it2 = collection.iterator();
        if (it2.hasNext()) {
            AbstractC0599v0 abstractC0599v0 = this.f7724n;
            do {
                try {
                    Object next2 = it2.next();
                    if (next2 == null) {
                        e6.g0(eVar);
                    } else {
                        Class<?> cls = next2.getClass();
                        p015c2.o oVarI = abstractC0599v0.I(cls);
                        if (oVarI == null) {
                            oVarI = hVar.f0() ? d(abstractC0599v0, e6.f0(hVar, cls), e6) : e(abstractC0599v0, cls, e6);
                            abstractC0599v0 = this.f7724n;
                        }
                        if (eVar2 == null) {
                            oVarI.serialize(next2, eVar, e6);
                        } else {
                            oVarI.serializeWithType(next2, eVar, e6, eVar2);
                        }
                    }
                    i++;
                } catch (Exception e8) {
                    wrapAndThrow(e6, e8, collection, i);
                    return;
                }
            } while (it2.hasNext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fasterxml.jackson.databind.JsonNode] */
    /* JADX WARN: Type inference failed for: r1v3, types: [q2.r] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fasterxml.jackson.databind.JsonNode, q2.r] */
    @Override // com.fasterxml.jackson.databind.ser.std.P
    public final JsonNode getSchema(p015c2.E e6, Type type) {
        ?? CreateSchemaNode = createSchemaNode("array", true);
        p015c2.o oVar = this.f7723m;
        if (oVar != null) {
            ?? schema = oVar instanceof P ? ((P) oVar).getSchema(e6, null) : 0;
            if (schema == 0) {
                schema = new p087q2.r(p087q2.m.f11222h);
                schema.q("type", "any");
            }
            CreateSchemaNode.w("items", schema);
        }
        return CreateSchemaNode;
    }

    public void h(EnumSet enumSet, T1.e eVar, p015c2.E e6) {
        Iterator it = enumSet.iterator();
        p015c2.o oVarI0 = this.f7723m;
        while (it.hasNext()) {
            Enum r6 = (Enum) it.next();
            if (oVarI0 == null) {
                oVarI0 = e6.i0(r6.getDeclaringClass(), this.i);
            }
            oVarI0.serialize(r6, eVar, e6);
        }
    }

    public void i(Iterator it, T1.e eVar, p015c2.E e6) {
        if (it.hasNext()) {
            p071n2.e eVar2 = this.f7722l;
            p015c2.o oVar = this.f7723m;
            if (oVar != null) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        e6.g0(eVar);
                    } else if (eVar2 == null) {
                        oVar.serialize(next, eVar, e6);
                    } else {
                        oVar.serializeWithType(next, eVar, e6, eVar2);
                    }
                } while (it.hasNext());
                return;
            }
            AbstractC0599v0 abstractC0599v0 = this.f7724n;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    e6.g0(eVar);
                } else {
                    Class<?> cls = next2.getClass();
                    p015c2.o oVarI = abstractC0599v0.I(cls);
                    if (oVarI == null) {
                        p015c2.h hVar = this.f7719h;
                        if (hVar.f0()) {
                            oVarI = d(abstractC0599v0, e6.f0(hVar, cls), e6);
                        } else {
                            oVarI = e6.i0(cls, this.i);
                            AbstractC0599v0 abstractC0599v0G = abstractC0599v0.G(cls, oVarI);
                            if (abstractC0599v0 != abstractC0599v0G) {
                                this.f7724n = abstractC0599v0G;
                            }
                        }
                        abstractC0599v0 = this.f7724n;
                    }
                    if (eVar2 == null) {
                        oVarI.serialize(next2, eVar, e6);
                    } else {
                        oVarI.serializeWithType(next2, eVar, e6, eVar2);
                    }
                }
            } while (it.hasNext());
        }
    }

    @Override // p015c2.o
    public final boolean isEmpty(p015c2.E e6, Object obj) {
        switch (this.f7725o) {
            case 0:
                return ((Collection) obj).isEmpty();
            case 1:
                return ((EnumSet) obj).isEmpty();
            case 2:
                return !((Iterable) obj).iterator().hasNext();
            case 3:
                return ((List) obj).isEmpty();
            default:
                return !((Iterator) obj).hasNext();
        }
    }

    public void j(List list, T1.e eVar, p015c2.E e6) throws IOException {
        p071n2.e eVar2 = this.f7722l;
        int i = 0;
        p015c2.o oVar = this.f7723m;
        if (oVar != null) {
            int size = list.size();
            if (size == 0) {
                return;
            }
            while (i < size) {
                Object obj = list.get(i);
                if (obj == null) {
                    try {
                        e6.g0(eVar);
                    } catch (Exception e7) {
                        wrapAndThrow(e6, e7, list, i);
                    }
                } else if (eVar2 == null) {
                    oVar.serialize(obj, eVar, e6);
                } else {
                    oVar.serializeWithType(obj, eVar, e6, eVar2);
                }
                i++;
            }
            return;
        }
        p015c2.h hVar = this.f7719h;
        if (eVar2 != null) {
            int size2 = list.size();
            if (size2 == 0) {
                return;
            }
            try {
                AbstractC0599v0 abstractC0599v0 = this.f7724n;
                while (i < size2) {
                    Object obj2 = list.get(i);
                    if (obj2 == null) {
                        e6.g0(eVar);
                    } else {
                        Class<?> cls = obj2.getClass();
                        p015c2.o oVarI = abstractC0599v0.I(cls);
                        if (oVarI == null) {
                            oVarI = hVar.f0() ? d(abstractC0599v0, e6.f0(hVar, cls), e6) : e(abstractC0599v0, cls, e6);
                            abstractC0599v0 = this.f7724n;
                        }
                        oVarI.serializeWithType(obj2, eVar, e6, eVar2);
                    }
                    i++;
                }
                return;
            } catch (Exception e8) {
                wrapAndThrow(e6, e8, list, i);
                return;
            }
        }
        int size3 = list.size();
        if (size3 == 0) {
            return;
        }
        try {
            AbstractC0599v0 abstractC0599v1 = this.f7724n;
            while (i < size3) {
                Object obj3 = list.get(i);
                if (obj3 == null) {
                    e6.g0(eVar);
                } else {
                    Class<?> cls2 = obj3.getClass();
                    p015c2.o oVarI2 = abstractC0599v1.I(cls2);
                    if (oVarI2 == null) {
                        oVarI2 = hVar.f0() ? d(abstractC0599v1, e6.f0(hVar, cls2), e6) : e(abstractC0599v1, cls2, e6);
                        abstractC0599v1 = this.f7724n;
                    }
                    oVarI2.serialize(obj3, eVar, e6);
                }
                i++;
            }
        } catch (Exception e9) {
            wrapAndThrow(e6, e9, list, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r0 == java.lang.Boolean.TRUE) goto L50;
     */
    @Override // p015c2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(java.lang.Object r4, T1.e r5, p015c2.E r6) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.C0537h.serialize(java.lang.Object, T1.e, c2.E):void");
    }

    @Override // p015c2.o
    public final void serializeWithType(Object obj, T1.e eVar, p015c2.E e6, p071n2.e eVar2) throws IOException {
        p003a2.a aVarE = eVar2.e(eVar, eVar2.d(T1.k.START_ARRAY, obj));
        eVar.C(obj);
        switch (this.f7725o) {
            case 0:
                g((Collection) obj, eVar, e6);
                break;
            case 1:
                h((EnumSet) obj, eVar, e6);
                break;
            case 2:
                f((Iterable) obj, eVar, e6);
                break;
            case 3:
                j((List) obj, eVar, e6);
                break;
            default:
                i((Iterator) obj, eVar, e6);
                break;
        }
        eVar2.f(eVar, aVarE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0537h(p015c2.h hVar, boolean z5, p077o2.q qVar, p015c2.o oVar) {
        this(Collection.class, hVar, z5, qVar, oVar);
        this.f7725o = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537h(Class cls, p015c2.h hVar, boolean z5, p077o2.q qVar, p015c2.o oVar) {
        super(0, cls);
        boolean z6 = false;
        this.f7719h = hVar;
        if (z5 || (hVar != null && Modifier.isFinal(hVar.f7281k.getModifiers()))) {
            z6 = true;
        }
        this.f7720j = z6;
        this.f7722l = qVar;
        this.i = null;
        this.f7723m = oVar;
        this.f7724n = p098s2.i.f12180k;
        this.f7721k = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537h(C0537h c0537h, InterfaceC0472c interfaceC0472c, p071n2.e eVar, p015c2.o oVar, Boolean bool, int i) {
        super(0, c0537h._handledType);
        this.f7725o = i;
        this.f7719h = c0537h.f7719h;
        this.f7720j = c0537h.f7720j;
        this.f7722l = eVar;
        this.i = interfaceC0472c;
        this.f7723m = oVar;
        this.f7724n = p098s2.i.f12180k;
        this.f7721k = bool;
    }
}
