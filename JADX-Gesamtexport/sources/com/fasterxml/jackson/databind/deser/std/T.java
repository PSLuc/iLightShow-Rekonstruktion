package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.lang.reflect.Array;
import java.util.Objects;
import p015c2.InterfaceC0472c;
import p109u2.EnumC0962a;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0514j implements p032f2.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Class f7576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p015c2.j f7577n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p071n2.d f7578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object[] f7579p;

    public T(p015c2.h hVar, p015c2.j jVar, p071n2.d dVar) {
        super(hVar, (p032f2.l) null, (Boolean) null);
        p104t2.a aVar = (p104t2.a) hVar;
        Class cls = aVar.f12487t.f7281k;
        this.f7576m = cls;
        this.f7575l = cls == Object.class;
        this.f7577n = jVar;
        this.f7578o = dVar;
        this.f7579p = (Object[]) aVar.f12488u;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        p015c2.h hVar = this.f7605h;
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, hVar.f7281k, EnumC0352n.f4954h);
        p015c2.j jVar = this.f7577n;
        p015c2.j jVarFindConvertingContentDeserializer = findConvertingContentDeserializer(fVar, interfaceC0472c, jVar);
        p015c2.h hVarY = hVar.Y();
        p015c2.j jVarF0 = jVarFindConvertingContentDeserializer == null ? fVar.f0(hVarY, interfaceC0472c) : fVar.q0(jVarFindConvertingContentDeserializer, interfaceC0472c, hVarY);
        p071n2.d dVar = this.f7578o;
        p071n2.d dVarF = dVar != null ? dVar.f(interfaceC0472c) : dVar;
        p032f2.l lVarFindContentNullProvider = findContentNullProvider(fVar, interfaceC0472c, jVarF0);
        return (Objects.equals(boolFindFormatFeature, this.f7607k) && lVarFindContentNullProvider == this.i && jVarF0 == jVar && dVarF == dVar) ? this : new T(this, jVarF0, dVarF, lVarFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j
    public final p015c2.j d() {
        return this.f7577n;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws JsonMappingException {
        Object[] objArrE;
        Object objDeserialize;
        int i;
        Object[] objArr = (Object[]) obj;
        if (!iVar.w0()) {
            Object[] objArrF = f(iVar, fVar);
            if (objArrF == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrF.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrF, 0, objArr2, length, objArrF.length);
            return objArr2;
        }
        O1.u uVarD0 = fVar.D0();
        int length2 = objArr.length;
        Object[] objArrK = uVarD0.k(objArr, length2);
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    break;
                }
                try {
                    if (kVarB0 != T1.k.VALUE_NULL) {
                        p015c2.j jVar = this.f7577n;
                        p071n2.d dVar = this.f7578o;
                        objDeserialize = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                    } else if (!this.f7606j) {
                        objDeserialize = this.i.getNullValue(fVar);
                    }
                    objArrK[length2] = objDeserialize;
                    length2 = i;
                } catch (Exception e6) {
                    e = e6;
                    length2 = i;
                    throw JsonMappingException.i(e, objArrK, uVarD0.f4533a + length2);
                }
                if (length2 >= objArrK.length) {
                    objArrK = uVarD0.c(objArrK);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
        if (this.f7575l) {
            int i3 = uVarD0.f4533a + length2;
            objArrE = new Object[i3];
            uVarD0.a(i3, length2, objArrE, objArrK);
            uVarD0.b();
        } else {
            objArrE = uVarD0.e(objArrK, length2, this.f7576m);
        }
        fVar.M0(uVarD0);
        return objArrE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return (Object[]) dVar.c(iVar, fVar);
    }

    public final Object[] f(T1.i iVar, p015c2.f fVar) throws MismatchedInputException {
        T t6;
        T1.i iVar2;
        p015c2.f fVar2;
        Object objDeserialize;
        p026e2.b bVarE0;
        Boolean bool = Boolean.TRUE;
        Class cls = this.f7576m;
        Boolean bool2 = this.f7607k;
        if (bool2 != bool && (bool2 != null || !fVar.B0(p015c2.g.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!iVar.s0(T1.k.VALUE_STRING)) {
                fVar.r0(iVar, this.f7605h);
                throw null;
            }
            if (cls != Byte.class) {
                return (Object[]) _deserializeFromString(iVar, fVar);
            }
            byte[] bArrD = iVar.D(fVar.f7249l.i.f8685n);
            Byte[] bArr = new Byte[bArrD.length];
            int length = bArrD.length;
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.valueOf(bArrD[i]);
            }
            return bArr;
        }
        if (!iVar.s0(T1.k.VALUE_NULL)) {
            if (iVar.s0(T1.k.VALUE_STRING)) {
                String strI0 = iVar.i0();
                boolean zIsEmpty = strI0.isEmpty();
                p026e2.b bVar = p026e2.b.f8686h;
                p104t2.d dVar = p104t2.d.f12492h;
                if (zIsEmpty) {
                    p026e2.b bVarD0 = fVar.d0(dVar, handledType(), p026e2.d.f8695m);
                    if (bVarD0 != bVar) {
                        return (Object[]) _deserializeFromEmptyString(iVar, fVar, bVarD0, handledType(), "empty String (\"\")");
                    }
                    t6 = this;
                    iVar2 = iVar;
                    fVar2 = fVar;
                } else {
                    t6 = this;
                    iVar2 = iVar;
                    fVar2 = fVar;
                    if (g0._isBlank(strI0) && (bVarE0 = fVar2.e0(dVar, t6.handledType())) != bVar) {
                        return (Object[]) t6._deserializeFromEmptyString(iVar2, fVar2, bVarE0, t6.handledType(), "blank String (all whitespace)");
                    }
                }
            } else {
                t6 = this;
                iVar2 = iVar;
                fVar2 = fVar;
            }
            p015c2.j jVar = t6.f7577n;
            p071n2.d dVar2 = t6.f7578o;
            objDeserialize = dVar2 == null ? jVar.deserialize(iVar2, fVar2) : jVar.deserializeWithType(iVar2, fVar2, dVar2);
        } else {
            if (this.f7606j) {
                return this.f7579p;
            }
            objDeserialize = this.i.getNullValue(fVar);
            t6 = this;
        }
        Object[] objArr = t6.f7575l ? new Object[1] : (Object[]) Array.newInstance((Class<?>) cls, 1);
        objArr[0] = objDeserialize;
        return objArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j, p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.i;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j, p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return this.f7579p;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return this.f7577n == null && this.f7578o == null;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12492h;
    }

    public T(T t6, p015c2.j jVar, p071n2.d dVar, p032f2.l lVar, Boolean bool) {
        super(t6, lVar, bool);
        this.f7576m = t6.f7576m;
        this.f7575l = t6.f7575l;
        this.f7579p = t6.f7579p;
        this.f7577n = jVar;
        this.f7578o = dVar;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        Object[] objArrE;
        Object objDeserializeWithType;
        int i;
        if (!iVar.w0()) {
            return f(iVar, fVar);
        }
        O1.u uVarD0 = fVar.D0();
        Object[] objArrJ = uVarD0.j();
        int i3 = 0;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    break;
                }
                try {
                    if (kVarB0 == T1.k.VALUE_NULL) {
                        if (!this.f7606j) {
                            objDeserializeWithType = this.i.getNullValue(fVar);
                        }
                    } else {
                        p015c2.j jVar = this.f7577n;
                        p071n2.d dVar = this.f7578o;
                        if (dVar == null) {
                            objDeserializeWithType = jVar.deserialize(iVar, fVar);
                        } else {
                            objDeserializeWithType = jVar.deserializeWithType(iVar, fVar, dVar);
                        }
                    }
                    objArrJ[i3] = objDeserializeWithType;
                    i3 = i;
                } catch (Exception e6) {
                    e = e6;
                    i3 = i;
                    throw JsonMappingException.i(e, objArrJ, uVarD0.f4533a + i3);
                }
                if (i3 >= objArrJ.length) {
                    objArrJ = uVarD0.c(objArrJ);
                    i3 = 0;
                }
                i = i3 + 1;
            } catch (Exception e7) {
                e = e7;
            }
        }
        if (this.f7575l) {
            int i6 = uVarD0.f4533a + i3;
            objArrE = new Object[i6];
            uVarD0.a(i6, i3, objArrE, objArrJ);
            uVarD0.b();
        } else {
            objArrE = uVarD0.e(objArrJ, i3, this.f7576m);
        }
        fVar.M0(uVarD0);
        return objArrE;
    }
}
