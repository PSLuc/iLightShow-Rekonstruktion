package p077o2;

import B.AbstractC0013g0;
import S1.T;
import T1.i;
import T1.k;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import p015c2.AbstractC0473d;
import p015c2.InterfaceC0472c;
import p015c2.f;
import p015c2.h;
import p015c2.j;
import p015c2.r;
import p071n2.d;
import p109u2.A;

/* JADX INFO: loaded from: classes.dex */
public class g extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final T f10640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10641r;

    public g(h hVar, o oVar, String str, boolean z5, h hVar2, T t6) {
        super(hVar, oVar, str, z5, hVar2, 0);
        this.f10641r = AbstractC0013g0.i("missing type id property '", this.f10629l, "'");
        this.f10640q = t6;
    }

    @Override // p077o2.a, p071n2.d
    public final Object b(i iVar, f fVar) {
        return iVar.s0(k.START_ARRAY) ? h(iVar, fVar) : d(iVar, fVar);
    }

    @Override // p077o2.a, p071n2.d
    public Object d(i iVar, f fVar) {
        String strQ0;
        Object objN0;
        if (iVar.c() && (objN0 = iVar.n0()) != null) {
            return i(iVar, fVar, objN0);
        }
        k kVarS = iVar.s();
        k kVar = k.START_OBJECT;
        String str = this.f10641r;
        A aA0 = null;
        if (kVarS == kVar) {
            kVarS = iVar.B0();
        } else if (kVarS != k.FIELD_NAME) {
            return m(iVar, fVar, null, str);
        }
        boolean zK = fVar.f7249l.k(r.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (kVarS == k.FIELD_NAME) {
            String strO = iVar.o();
            iVar.B0();
            String str2 = this.f10629l;
            if ((strO.equals(str2) || (zK && strO.equalsIgnoreCase(str2))) && (strQ0 = iVar.q0()) != null) {
                return l(iVar, fVar, aA0, strQ0);
            }
            if (aA0 == null) {
                aA0 = fVar.a0(iVar);
            }
            aA0.T(strO);
            aA0.I0(iVar);
            kVarS = iVar.B0();
        }
        return m(iVar, fVar, aA0, str);
    }

    @Override // p077o2.a, p071n2.d
    public d f(InterfaceC0472c interfaceC0472c) {
        return interfaceC0472c == this.f10627j ? this : new g(this, interfaceC0472c);
    }

    @Override // p077o2.a, p071n2.d
    public final T g() {
        return this.f10640q;
    }

    public final Object l(i iVar, f fVar, A a6, String str) throws InvalidTypeIdException {
        j jVarK = k(fVar, str);
        if (this.f10630m) {
            if (a6 == null) {
                a6 = fVar.a0(iVar);
            }
            a6.T(iVar.o());
            a6.s0(str);
        }
        if (a6 != null) {
            iVar.k();
            iVar = p009b2.j.H0(a6.G0(iVar), iVar);
        }
        if (iVar.s() != k.END_OBJECT) {
            iVar.B0();
        }
        return jVarK.deserialize(iVar, fVar);
    }

    public final Object m(i iVar, f fVar, A a6, String str) throws InvalidTypeIdException {
        boolean z5 = this.f10628k != null;
        h hVar = this.i;
        if (!z5) {
            Object objA = d.a(iVar, hVar);
            if (objA != null) {
                return objA;
            }
            if (iVar.w0()) {
                return h(iVar, fVar);
            }
            if (iVar.s0(k.VALUE_STRING) && fVar.B0(p015c2.g.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && iVar.i0().trim().isEmpty()) {
                return null;
            }
        }
        j jVarJ = j(fVar);
        if (jVarJ == null) {
            fVar.f7249l.getClass();
            throw new InvalidTypeIdException(fVar.f7252o, AbstractC0473d.c(String.format("Could not resolve subtype of %s", hVar), str));
        }
        if (a6 != null) {
            a6.M();
            iVar = a6.G0(iVar);
            iVar.B0();
        }
        return jVarJ.deserialize(iVar, fVar);
    }

    public g(g gVar, InterfaceC0472c interfaceC0472c) {
        String strJ;
        super(gVar, interfaceC0472c, 0);
        if (interfaceC0472c == null) {
            strJ = AbstractC0013g0.i("missing type id property '", this.f10629l, "'");
        } else {
            strJ = AbstractC0013g0.j("missing type id property '", this.f10629l, "' (for POJO property '", interfaceC0472c.getName(), "')");
        }
        this.f10641r = strJ;
        this.f10640q = gVar.f10640q;
    }
}
