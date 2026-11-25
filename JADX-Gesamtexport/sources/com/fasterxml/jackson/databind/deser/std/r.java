package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.IOException;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p046i2.C0772h;

/* JADX INFO: loaded from: classes.dex */
public final class r extends g0 implements p032f2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7660h;
    public final C0772h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p015c2.j f7661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f7662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p032f2.r[] f7663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f7664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient O1.u f7665n;

    public r(Class cls, C0772h c0772h, p015c2.h hVar, o0 o0Var, p032f2.r[] rVarArr) {
        super(cls);
        this.i = c0772h;
        this.f7664m = true;
        this.f7660h = (hVar.h0(String.class) || hVar.h0(CharSequence.class)) ? null : hVar;
        this.f7661j = null;
        this.f7662k = o0Var;
        this.f7663l = rVarArr;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        p015c2.h hVar;
        return (this.f7661j == null && (hVar = this.f7660h) != null && this.f7663l == null) ? new r(this, fVar.f0(hVar, interfaceC0472c)) : this;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws IOException {
        String strQ0;
        Object objDeserialize;
        C0772h c0772h = this.i;
        p015c2.j jVar = this.f7661j;
        if (jVar != null) {
            objDeserialize = jVar.deserialize(iVar, fVar);
        } else {
            if (!this.f7664m) {
                iVar.F0();
                try {
                    return c0772h.u();
                } catch (Exception e6) {
                    Throwable thQ = p109u2.i.q(e6);
                    p109u2.i.D(thQ);
                    fVar.n0(this._valueClass, thQ);
                    throw null;
                }
            }
            boolean z5 = true;
            p032f2.r[] rVarArr = this.f7663l;
            if (rVarArr != null) {
                if (!iVar.x0()) {
                    Object[] objArr = {p109u2.i.r(getValueType(fVar)), c0772h, iVar.s()};
                    fVar.getClass();
                    throw new MismatchedInputException(fVar.f7252o, String.format("Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s", objArr));
                }
                if (this.f7665n == null) {
                    this.f7665n = O1.u.f(fVar, this.f7662k, rVarArr, fVar.f7249l.k(p015c2.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                iVar.B0();
                O1.u uVar = this.f7665n;
                p037g2.z zVarV = uVar.v(iVar, fVar, null);
                T1.k kVarS = iVar.s();
                while (kVarS == T1.k.FIELD_NAME) {
                    String strO = iVar.o();
                    iVar.B0();
                    p032f2.r rVarG = uVar.g(strO);
                    if (!zVarV.d(strO) || rVarG != null) {
                        if (rVarG != null) {
                            try {
                                zVarV.b(rVarG, rVarG.i(iVar, fVar));
                            } catch (Exception e7) {
                                Class<?> clsHandledType = handledType();
                                String str = rVarG.f8933j.f7195h;
                                Throwable thQ2 = p109u2.i.q(e7);
                                p109u2.i.C(thQ2);
                                if (fVar != null && !fVar.B0(p015c2.g.WRAP_EXCEPTIONS)) {
                                    z5 = false;
                                }
                                if (thQ2 instanceof IOException) {
                                    if (!z5 || !(thQ2 instanceof JacksonException)) {
                                        throw ((IOException) thQ2);
                                    }
                                } else if (!z5) {
                                    p109u2.i.E(thQ2);
                                }
                                int i = JsonMappingException.f7531k;
                                throw JsonMappingException.h(thQ2, new p015c2.k(str, clsHandledType));
                            }
                        } else {
                            iVar.F0();
                        }
                    }
                    kVarS = iVar.B0();
                }
                return uVar.d(fVar, zVarV);
            }
            T1.k kVarS2 = iVar.s();
            z5 = kVarS2 == T1.k.START_ARRAY && fVar.B0(p015c2.g.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (z5) {
                kVarS2 = iVar.B0();
            }
            if (kVarS2 == null || !kVarS2.f5237o) {
                iVar.F0();
                strQ0 = "";
            } else {
                strQ0 = iVar.q0();
            }
            if (z5 && iVar.B0() != T1.k.END_ARRAY) {
                handleMissingEndArrayForSingle(iVar, fVar);
            }
            objDeserialize = strQ0;
        }
        try {
            return c0772h.f9547l.invoke(this._valueClass, objDeserialize);
        } catch (Exception e8) {
            Throwable thQ3 = p109u2.i.q(e8);
            p109u2.i.D(thQ3);
            if ((thQ3 instanceof IllegalArgumentException) && fVar.B0(p015c2.g.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            fVar.n0(this._valueClass, thQ3);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return this.f7661j == null ? deserialize(iVar, fVar) : dVar.b(iVar, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p032f2.t getValueInstantiator() {
        return this.f7662k;
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12499p;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.FALSE;
    }

    public r(Class cls, C0772h c0772h) {
        super(cls);
        this.i = c0772h;
        this.f7664m = false;
        this.f7660h = null;
        this.f7661j = null;
        this.f7662k = null;
        this.f7663l = null;
    }

    public r(r rVar, p015c2.j jVar) {
        super(rVar._valueClass);
        this.f7660h = rVar.f7660h;
        this.i = rVar.i;
        this.f7664m = rVar.f7664m;
        this.f7662k = rVar.f7662k;
        this.f7663l = rVar.f7663l;
        this.f7661j = jVar;
    }
}
