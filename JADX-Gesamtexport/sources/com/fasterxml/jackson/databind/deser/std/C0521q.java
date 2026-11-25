package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0352n;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.EnumSet;
import java.util.Objects;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p109u2.EnumC0962a;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0521q extends g0 implements p032f2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p015c2.h f7653h;
    public final p015c2.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p032f2.l f7654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f7656l;

    public C0521q(p015c2.h hVar) {
        super(EnumSet.class);
        this.f7653h = hVar;
        if (!hVar.l0()) {
            throw new IllegalArgumentException("Type " + hVar + " not Java Enum type");
        }
        this.i = null;
        this.f7656l = null;
        this.f7654j = null;
        this.f7655k = false;
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) {
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, EnumSet.class, EnumC0352n.f4954h);
        p015c2.j jVar = this.i;
        p015c2.h hVar = this.f7653h;
        p015c2.j jVarF0 = jVar == null ? fVar.f0(hVar, interfaceC0472c) : fVar.q0(jVar, interfaceC0472c, hVar);
        return (Objects.equals(this.f7656l, boolFindFormatFeature) && jVar == jVarF0 && this.f7654j == jVarF0) ? this : new C0521q(this, jVarF0, findContentNullProvider(fVar, interfaceC0472c, jVarF0), boolFindFormatFeature);
    }

    public final void d(T1.i iVar, p015c2.f fVar, EnumSet enumSet) throws JsonMappingException {
        Enum r6;
        while (true) {
            try {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    return;
                }
                if (kVarB0 != T1.k.VALUE_NULL) {
                    r6 = (Enum) this.i.deserialize(iVar, fVar);
                } else if (!this.f7655k) {
                    r6 = (Enum) this.f7654j.getNullValue(fVar);
                }
                if (r6 != null) {
                    enumSet.add(r6);
                }
            } catch (Exception e6) {
                throw JsonMappingException.i(e6, enumSet, enumSet.size());
            }
        }
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) throws JsonMappingException {
        EnumSet enumSet = (EnumSet) obj;
        if (iVar.w0()) {
            d(iVar, fVar, enumSet);
            return enumSet;
        }
        e(iVar, fVar, enumSet);
        return enumSet;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.c(iVar, fVar);
    }

    public final void e(T1.i iVar, p015c2.f fVar, EnumSet enumSet) throws JsonMappingException {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f7656l;
        if (bool2 != bool && (bool2 != null || !fVar.B0(p015c2.g.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            fVar.s0(iVar, EnumSet.class);
            throw null;
        }
        if (iVar.s0(T1.k.VALUE_NULL)) {
            fVar.r0(iVar, this.f7653h);
            throw null;
        }
        try {
            Enum r6 = (Enum) this.i.deserialize(iVar, fVar);
            if (r6 != null) {
                enumSet.add(r6);
            }
        } catch (Exception e6) {
            throw JsonMappingException.i(e6, enumSet, enumSet.size());
        }
    }

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.f12678j;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(p015c2.f fVar) {
        return EnumSet.noneOf(this.f7653h.f7281k);
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return this.f7653h.f7283m == null;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.i;
    }

    @Override // p015c2.j
    public final Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.TRUE;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) throws JsonMappingException {
        EnumSet enumSetNoneOf = EnumSet.noneOf(this.f7653h.f7281k);
        if (!iVar.w0()) {
            e(iVar, fVar, enumSetNoneOf);
            return enumSetNoneOf;
        }
        d(iVar, fVar, enumSetNoneOf);
        return enumSetNoneOf;
    }

    public C0521q(C0521q c0521q, p015c2.j jVar, p032f2.l lVar, Boolean bool) {
        super(c0521q);
        this.f7653h = c0521q.f7653h;
        this.i = jVar;
        this.f7654j = lVar;
        this.f7655k = p037g2.q.a(lVar);
        this.f7656l = bool;
    }
}
