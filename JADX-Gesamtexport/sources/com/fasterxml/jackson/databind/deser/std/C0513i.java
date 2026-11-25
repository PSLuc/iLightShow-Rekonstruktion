package com.fasterxml.jackson.databind.deser.std;

import S1.EnumC0352n;
import c5.C0495p;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0513i extends AbstractC0514j implements p032f2.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p015c2.j f7597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p071n2.d f7598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p032f2.t f7599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p015c2.j f7600o;

    public C0513i(p104t2.c cVar, p015c2.j jVar, p071n2.d dVar, p032f2.t tVar) {
        this(cVar, jVar, dVar, tVar, null, null, null);
    }

    @Override // p032f2.i
    public final p015c2.j a(p015c2.f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        p015c2.j jVarFindDeserializer = null;
        p015c2.h hVar = this.f7605h;
        p032f2.t tVar = this.f7599n;
        if (tVar != null) {
            if (tVar.k()) {
                C0474e c0474e = fVar.f7249l;
                p015c2.h hVarB = tVar.B();
                if (hVarB == null) {
                    fVar.O(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", hVar, tVar.getClass().getName()));
                    throw null;
                }
                jVarFindDeserializer = findDeserializer(fVar, hVarB, interfaceC0472c);
            } else if (tVar.i()) {
                C0474e c0474e2 = fVar.f7249l;
                p015c2.h hVarY = tVar.y();
                if (hVarY == null) {
                    fVar.O(String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", hVar, tVar.getClass().getName()));
                    throw null;
                }
                jVarFindDeserializer = findDeserializer(fVar, hVarY, interfaceC0472c);
            }
        }
        p015c2.j jVar = jVarFindDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(fVar, interfaceC0472c, Collection.class, EnumC0352n.f4954h);
        p015c2.j jVar2 = this.f7597l;
        p015c2.j jVarFindConvertingContentDeserializer = findConvertingContentDeserializer(fVar, interfaceC0472c, jVar2);
        p015c2.h hVarY2 = hVar.Y();
        p015c2.j jVarF0 = jVarFindConvertingContentDeserializer == null ? fVar.f0(hVarY2, interfaceC0472c) : fVar.q0(jVarFindConvertingContentDeserializer, interfaceC0472c, hVarY2);
        p071n2.d dVar = this.f7598m;
        p071n2.d dVarF = dVar != null ? dVar.f(interfaceC0472c) : dVar;
        p032f2.l lVarFindContentNullProvider = findContentNullProvider(fVar, interfaceC0472c, jVarF0);
        return (Objects.equals(boolFindFormatFeature, this.f7607k) && lVarFindContentNullProvider == this.i && jVar == this.f7600o && jVarF0 == jVar2 && dVarF == dVar) ? this : i(jVar, jVarF0, dVarF, lVarFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.AbstractC0514j
    public final p015c2.j d() {
        return this.f7597l;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar, Object obj) {
        Collection collection = (Collection) obj;
        return iVar.w0() ? f(iVar, fVar, collection) : h(iVar, fVar, collection);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public Object deserializeWithType(T1.i iVar, p015c2.f fVar, p071n2.d dVar) {
        return dVar.c(iVar, fVar);
    }

    public Collection f(T1.i iVar, p015c2.f fVar, Collection collection) throws JsonMappingException {
        Object objDeserialize;
        Object objDeserialize2;
        iVar.E0(collection);
        p015c2.j jVar = this.f7597l;
        p037g2.r objectIdReader = jVar.getObjectIdReader();
        p071n2.d dVar = this.f7598m;
        p032f2.l lVar = this.i;
        boolean z5 = this.f7606j;
        if (objectIdReader == null) {
            while (true) {
                T1.k kVarB0 = iVar.B0();
                if (kVarB0 == T1.k.END_ARRAY) {
                    break;
                }
                try {
                    if (kVarB0 != T1.k.VALUE_NULL) {
                        objDeserialize = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                    } else if (!z5) {
                        objDeserialize = lVar.getNullValue(fVar);
                    }
                    collection.add(objDeserialize);
                } catch (Exception e6) {
                    if (fVar != null && !fVar.B0(p015c2.g.WRAP_EXCEPTIONS)) {
                        p109u2.i.E(e6);
                    }
                    throw JsonMappingException.i(e6, collection, collection.size());
                }
            }
        } else {
            if (!iVar.w0()) {
                return h(iVar, fVar, collection);
            }
            iVar.E0(collection);
            C0495p c0495p = new C0495p(this.f7605h.Y().f7281k, collection);
            while (true) {
                T1.k kVarB1 = iVar.B0();
                if (kVarB1 == T1.k.END_ARRAY) {
                    break;
                }
                try {
                    if (kVarB1 != T1.k.VALUE_NULL) {
                        objDeserialize2 = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
                    } else if (!z5) {
                        objDeserialize2 = lVar.getNullValue(fVar);
                    }
                    c0495p.n(objDeserialize2);
                } catch (UnresolvedForwardReference e7) {
                    ((ArrayList) c0495p.f7476j).add(new C0512h(c0495p, e7));
                    throw null;
                } catch (Exception e8) {
                    if (fVar != null && !fVar.B0(p015c2.g.WRAP_EXCEPTIONS)) {
                        p109u2.i.E(e8);
                    }
                    throw JsonMappingException.i(e8, collection, collection.size());
                }
            }
        }
        return collection;
    }

    public Collection g(p015c2.f fVar) {
        return (Collection) this.f7599n.v(fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final p032f2.t getValueInstantiator() {
        return this.f7599n;
    }

    public final Collection h(T1.i iVar, p015c2.f fVar, Collection collection) throws JsonMappingException {
        Object objDeserialize;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f7607k;
        if (bool2 != bool && (bool2 != null || !fVar.B0(p015c2.g.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            fVar.r0(iVar, this.f7605h);
            throw null;
        }
        try {
            if (!iVar.s0(T1.k.VALUE_NULL)) {
                p015c2.j jVar = this.f7597l;
                p071n2.d dVar = this.f7598m;
                objDeserialize = dVar == null ? jVar.deserialize(iVar, fVar) : jVar.deserializeWithType(iVar, fVar, dVar);
            } else {
                if (this.f7606j) {
                    return collection;
                }
                objDeserialize = this.i.getNullValue(fVar);
            }
            collection.add(objDeserialize);
            return collection;
        } catch (Exception e6) {
            if (!fVar.B0(p015c2.g.WRAP_EXCEPTIONS)) {
                p109u2.i.E(e6);
            }
            throw JsonMappingException.i(e6, Object.class, collection.size());
        }
    }

    public C0513i i(p015c2.j jVar, p015c2.j jVar2, p071n2.d dVar, p032f2.l lVar, Boolean bool) {
        return new C0513i(this.f7605h, jVar2, dVar, this.f7599n, jVar, lVar, bool);
    }

    @Override // p015c2.j
    public final boolean isCachable() {
        return this.f7597l == null && this.f7598m == null && this.f7600o == null;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.i;
    }

    public C0513i(p015c2.h hVar, p015c2.j jVar, p071n2.d dVar, p032f2.t tVar, p015c2.j jVar2, p032f2.l lVar, Boolean bool) {
        super(hVar, lVar, bool);
        this.f7597l = jVar;
        this.f7598m = dVar;
        this.f7599n = tVar;
        this.f7600o = jVar2;
    }

    @Override // p015c2.j
    public final Object deserialize(T1.i iVar, p015c2.f fVar) {
        C0513i c0513i;
        T1.i iVar2;
        p015c2.f fVar2;
        p026e2.b bVarE0;
        p015c2.j jVar = this.f7600o;
        if (jVar != null) {
            return (Collection) this.f7599n.w(fVar, jVar.deserialize(iVar, fVar));
        }
        if (iVar.w0()) {
            return f(iVar, fVar, g(fVar));
        }
        if (iVar.s0(T1.k.VALUE_STRING)) {
            String strI0 = iVar.i0();
            Class<?> clsHandledType = handledType();
            boolean zIsEmpty = strI0.isEmpty();
            p026e2.b bVar = p026e2.b.f8686h;
            p104t2.d dVar = p104t2.d.i;
            if (zIsEmpty) {
                p026e2.b bVarD0 = fVar.d0(dVar, clsHandledType, p026e2.d.f8695m);
                if (bVarD0 != null && bVarD0 != bVar) {
                    return (Collection) _deserializeFromEmptyString(iVar, fVar, bVarD0, clsHandledType, "empty String (\"\")");
                }
                c0513i = this;
                iVar2 = iVar;
                fVar2 = fVar;
            } else {
                c0513i = this;
                iVar2 = iVar;
                fVar2 = fVar;
                if (g0._isBlank(strI0) && (bVarE0 = fVar2.e0(dVar, clsHandledType)) != bVar) {
                    return (Collection) c0513i._deserializeFromEmptyString(iVar2, fVar2, bVarE0, clsHandledType, "blank String (all whitespace)");
                }
            }
            p015c2.f fVar3 = fVar2;
            return c0513i.h(iVar2, fVar3, c0513i.g(fVar3));
        }
        return h(iVar, fVar, g(fVar));
    }
}
