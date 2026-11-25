package p077o2;

import S1.T;
import T1.k;
import com.fasterxml.jackson.databind.deser.std.E;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;
import p015c2.InterfaceC0472c;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p071n2.d;
import p109u2.A;
import p109u2.i;

/* JADX INFO: loaded from: classes.dex */
public class a extends d implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f10626h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC0472c f10627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f10628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f10630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f10631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f10632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10633p;

    public a(h hVar, o oVar, String str, boolean z5, h hVar2, int i) {
        this.f10633p = i;
        this.i = hVar;
        this.f10626h = oVar;
        Annotation[] annotationArr = i.f12697a;
        this.f10629l = str == null ? "" : str;
        this.f10630m = z5;
        this.f10631n = new ConcurrentHashMap(16, 0.75f, 2);
        this.f10628k = hVar2;
        this.f10627j = null;
    }

    @Override // p071n2.d
    public Object b(T1.i iVar, f fVar) {
        switch (this.f10633p) {
            case 0:
                break;
        }
        return h(iVar, fVar);
    }

    @Override // p071n2.d
    public final Object c(T1.i iVar, f fVar) {
        switch (this.f10633p) {
            case 0:
                break;
        }
        return h(iVar, fVar);
    }

    @Override // p071n2.d
    public Object d(T1.i iVar, f fVar) {
        switch (this.f10633p) {
            case 0:
                break;
        }
        return h(iVar, fVar);
    }

    @Override // p071n2.d
    public final Object e(T1.i iVar, f fVar) {
        switch (this.f10633p) {
            case 0:
                break;
        }
        return h(iVar, fVar);
    }

    @Override // p071n2.d
    public d f(InterfaceC0472c interfaceC0472c) {
        switch (this.f10633p) {
            case 0:
                return interfaceC0472c == this.f10627j ? this : new a(this, interfaceC0472c, 0);
            default:
                return interfaceC0472c == this.f10627j ? this : new a(this, interfaceC0472c, 1);
        }
    }

    @Override // p071n2.d
    public T g() {
        switch (this.f10633p) {
            case 0:
                return T.f4914j;
            default:
                return T.i;
        }
    }

    public final Object h(T1.i iVar, f fVar) throws MismatchedInputException {
        String strI0;
        Object objN0;
        Object objN1;
        switch (this.f10633p) {
            case 0:
                if (iVar.c() && (objN0 = iVar.n0()) != null) {
                    return i(iVar, fVar, objN0);
                }
                boolean zW0 = iVar.w0();
                boolean zW1 = iVar.w0();
                h hVar = this.i;
                if (zW1) {
                    k kVarB0 = iVar.B0();
                    k kVar = k.VALUE_STRING;
                    if (kVarB0 != kVar && (kVarB0 == null || !kVarB0.f5237o)) {
                        fVar.K0(kVar, "need JSON String, Number of Boolean that contains type id (for subtype of %s)", hVar.f7281k.getName());
                        throw null;
                    }
                    strI0 = iVar.i0();
                    iVar.B0();
                } else {
                    if (this.f10628k == null) {
                        fVar.K0(k.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class ".concat(hVar.f7281k.getName()), new Object[0]);
                        throw null;
                    }
                    o oVar = this.f10626h;
                    strI0 = oVar.c(oVar.f10656b.f7281k, null);
                }
                j jVarK = k(fVar, strI0);
                if (this.f10630m && !(this instanceof e) && iVar.s0(k.START_OBJECT)) {
                    A aA0 = fVar.a0(iVar);
                    aA0.o0();
                    aA0.T(this.f10629l);
                    aA0.s0(strI0);
                    iVar.k();
                    iVar = p009b2.j.H0(aA0.G0(iVar), iVar);
                    iVar.B0();
                }
                if (zW0 && iVar.s() == k.END_ARRAY) {
                    return jVarK.getNullValue(fVar);
                }
                Object objDeserialize = jVarK.deserialize(iVar, fVar);
                if (!zW0) {
                    return objDeserialize;
                }
                k kVarB1 = iVar.B0();
                k kVar2 = k.END_ARRAY;
                if (kVarB1 == kVar2) {
                    return objDeserialize;
                }
                fVar.K0(kVar2, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
                throw null;
            default:
                if (iVar.c() && (objN1 = iVar.n0()) != null) {
                    return i(iVar, fVar, objN1);
                }
                k kVarS = iVar.s();
                k kVar3 = k.START_OBJECT;
                h hVar2 = this.i;
                if (kVarS == kVar3) {
                    k kVarB2 = iVar.B0();
                    k kVar4 = k.FIELD_NAME;
                    if (kVarB2 != kVar4) {
                        fVar.K0(kVar4, "need JSON String that contains type id (for subtype of " + hVar2.f7281k.getName() + ")", new Object[0]);
                        throw null;
                    }
                } else if (kVarS != k.FIELD_NAME) {
                    fVar.K0(kVar3, "need JSON Object to contain As.WRAPPER_OBJECT type information for class ".concat(hVar2.f7281k.getName()), new Object[0]);
                    throw null;
                }
                String strI1 = iVar.i0();
                j jVarK2 = k(fVar, strI1);
                iVar.B0();
                if (this.f10630m && iVar.s0(kVar3)) {
                    A aA1 = fVar.a0(iVar);
                    aA1.o0();
                    aA1.T(this.f10629l);
                    aA1.s0(strI1);
                    iVar.k();
                    iVar = p009b2.j.H0(aA1.G0(iVar), iVar);
                    iVar.B0();
                }
                Object objDeserialize2 = jVarK2.deserialize(iVar, fVar);
                k kVarB3 = iVar.B0();
                k kVar5 = k.END_OBJECT;
                if (kVarB3 == kVar5) {
                    return objDeserialize2;
                }
                fVar.K0(kVar5, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
                throw null;
        }
    }

    public final Object i(T1.i iVar, f fVar, Object obj) {
        return k(fVar, obj instanceof String ? (String) obj : String.valueOf(obj)).deserialize(iVar, fVar);
    }

    public final j j(f fVar) {
        j jVar;
        h hVar = this.f10628k;
        if (hVar == null) {
            if (fVar.B0(g.FAIL_ON_INVALID_SUBTYPE)) {
                return null;
            }
            return E.f7551h;
        }
        if (i.t(hVar.f7281k)) {
            return E.f7551h;
        }
        synchronized (this.f10628k) {
            try {
                if (this.f10632o == null) {
                    this.f10632o = fVar.f0(this.f10628k, this.f10627j);
                }
                jVar = this.f10632o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public final j k(f fVar, String str) throws InvalidTypeIdException {
        j jVarF0;
        ConcurrentHashMap concurrentHashMap = this.f10631n;
        j jVar = (j) concurrentHashMap.get(str);
        if (jVar != null) {
            return jVar;
        }
        o oVar = this.f10626h;
        h hVarD = oVar.d(fVar, str);
        InterfaceC0472c interfaceC0472c = this.f10627j;
        h hVar = this.i;
        if (hVarD == null) {
            jVarF0 = j(fVar);
            if (jVarF0 == null) {
                String strA = oVar.a();
                String strConcat = strA == null ? "type ids are not statically known" : "known type ids = ".concat(strA);
                if (interfaceC0472c != null) {
                    strConcat = strConcat + " (for POJO property '" + interfaceC0472c.getName() + "')";
                }
                fVar.f7249l.getClass();
                if (fVar.B0(g.FAIL_ON_INVALID_SUBTYPE)) {
                    throw fVar.z0(hVar, str, strConcat);
                }
                return E.f7551h;
            }
        } else {
            if (hVar != null && hVar.getClass() == hVarD.getClass() && !hVarD.f0()) {
                try {
                    Class cls = hVarD.f7281k;
                    fVar.getClass();
                    hVarD = hVar.h0(cls) ? hVar : fVar.f7249l.i.f8680h.i(hVar, cls, false);
                } catch (IllegalArgumentException e6) {
                    throw fVar.z0(hVar, str, e6.getMessage());
                }
            }
            jVarF0 = fVar.f0(hVarD, interfaceC0472c);
        }
        concurrentHashMap.put(str, jVarF0);
        return jVarF0;
    }

    public final String toString() {
        return "[" + getClass().getName() + "; base-type:" + this.i + "; id-resolver: " + this.f10626h + ']';
    }

    public a(a aVar, InterfaceC0472c interfaceC0472c, int i) {
        this.f10633p = i;
        this.i = aVar.i;
        this.f10626h = aVar.f10626h;
        this.f10629l = aVar.f10629l;
        this.f10630m = aVar.f10630m;
        this.f10631n = aVar.f10631n;
        this.f10628k = aVar.f10628k;
        this.f10632o = aVar.f10632o;
        this.f10627j = interfaceC0472c;
    }
}
