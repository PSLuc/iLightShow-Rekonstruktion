package p015c2;

import B.AbstractC0013g0;
import O1.u;
import S1.d0;
import T1.o;
import U1.c;
import W4.i;
import Y1.d;
import c5.C0495p;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import p009b2.k;
import p026e2.b;
import p026e2.p;
import p032f2.g;
import p037g2.C;
import p046i2.AbstractC0771g;
import p046i2.r;
import p046i2.t;
import p077o2.a;
import p104t2.n;
import p109u2.A;
import p109u2.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractC0473d implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f7247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f7248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0474e f7249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f7251n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient c f7252o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient K2.k f7253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient u f7254q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient DateFormat f7255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0495p f7256s;

    public f() {
        this.f7248k = g.f8914l;
        this.f7247j = new k();
        this.f7250m = 0;
        this.f7251n = null;
        this.f7249l = null;
    }

    public static MismatchedInputException O0(c cVar, T1.k kVar, String str) {
        return new MismatchedInputException((Closeable) cVar, AbstractC0473d.c("Unexpected token (" + cVar.f5340j + "), expected " + kVar, str));
    }

    @Override // p015c2.AbstractC0473d
    public final n A() {
        return this.f7249l.i.f8680h;
    }

    public final boolean A0(o oVar) {
        i iVar = this.f7251n;
        iVar.getClass();
        return (iVar.f5628a & oVar.b()) != 0;
    }

    public final boolean B0(g gVar) {
        return (this.f7250m & gVar.i) != 0;
    }

    public abstract q C0(Object obj);

    public final u D0() {
        u uVar = this.f7254q;
        if (uVar == null) {
            return new u();
        }
        this.f7254q = null;
        return uVar;
    }

    public final Date E0(String str) {
        try {
            DateFormat dateFormat = this.f7255r;
            if (dateFormat == null) {
                dateFormat = (DateFormat) this.f7249l.i.f8683l.clone();
                this.f7255r = dateFormat;
            }
            return dateFormat.parse(str);
        } catch (ParseException e6) {
            throw new IllegalArgumentException(p012c.k.s("Failed to parse Date value '", str, "': ", p109u2.i.i(e6)));
        }
    }

    public final Object F0(T1.i iVar, Class cls) throws InvalidDefinitionException {
        h hVarJ = A().j(cls);
        j jVarK0 = k0(hVarJ);
        if (jVarK0 != null) {
            return jVarK0.deserialize(iVar, this);
        }
        O("Could not find JsonDeserializer for type " + p109u2.i.r(hVarJ));
        throw null;
    }

    public final void G0(r rVar, t tVar, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        Annotation[] annotationArr = p109u2.i.f12697a;
        StringBuilder sbO = AbstractC0013g0.o("Invalid definition for property ", p109u2.i.c(tVar.getName()), " (of type ", p109u2.i.z(rVar.f9562a.f7281k), "): ");
        sbO.append(str);
        throw new InvalidDefinitionException(this.f7252o, sbO.toString());
    }

    public final void H0(r rVar, String str, Object... objArr) throws InvalidDefinitionException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new InvalidDefinitionException(this.f7252o, p012c.k.s("Invalid type definition for type ", p109u2.i.z(rVar.f9562a.f7281k), ": ", str));
    }

    public final void I0(InterfaceC0472c interfaceC0472c, String str, Object... objArr) {
        AbstractC0771g abstractC0771gE;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        if (interfaceC0472c != null) {
            interfaceC0472c.getType();
        }
        MismatchedInputException mismatchedInputException = new MismatchedInputException(this.f7252o, str);
        if (interfaceC0472c == null || (abstractC0771gE = interfaceC0472c.e()) == null) {
            throw mismatchedInputException;
        }
        mismatchedInputException.e(interfaceC0472c.getName(), abstractC0771gE.n());
        throw mismatchedInputException;
    }

    public final void J0(j jVar, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        jVar.handledType();
        throw new MismatchedInputException((Closeable) this.f7252o, str);
    }

    public final void K0(T1.k kVar, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        c cVar = this.f7252o;
        throw new MismatchedInputException(cVar, AbstractC0473d.c("Unexpected token (" + cVar.f5340j + "), expected " + kVar, str));
    }

    public final void L0(j jVar, T1.k kVar, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        jVar.handledType();
        throw O0(this.f7252o, kVar, str);
    }

    public final void M0(u uVar) {
        u uVar2 = this.f7254q;
        if (uVar2 != null) {
            Object[] objArr = (Object[]) uVar.f4536d;
            int length = objArr == null ? 0 : objArr.length;
            Object[] objArr2 = (Object[]) uVar2.f4536d;
            if (length < (objArr2 != null ? objArr2.length : 0)) {
                return;
            }
        }
        this.f7254q = uVar;
    }

    public final InvalidFormatException N0(Class cls, String str, String str2) {
        StringBuilder sbO = AbstractC0013g0.o("Cannot deserialize value of type ", p109u2.i.z(cls), " from String ", AbstractC0473d.d(str), ": ");
        sbO.append(str2);
        return new InvalidFormatException(this.f7252o, sbO.toString(), str);
    }

    @Override // p015c2.AbstractC0473d
    public final Object O(String str) throws InvalidDefinitionException {
        throw new InvalidDefinitionException(this.f7252o, str);
    }

    public final A a0(T1.i iVar) {
        A a6 = new A();
        a6.f12666u = false;
        a6.i = iVar.L();
        a6.f12655j = iVar.f0();
        a6.f12656k = A.f12654w;
        a6.f12667v = new d(0, null, null);
        z zVar = new z();
        a6.f12662q = zVar;
        a6.f12661p = zVar;
        a6.f12663r = 0;
        a6.f12657l = iVar.c();
        boolean zB = iVar.b();
        a6.f12658m = zB;
        a6.f12659n = a6.f12657l || zB;
        a6.f12660o = B0(g.USE_BIG_DECIMAL_FOR_FLOATS);
        return a6;
    }

    public final h b0(Class cls) {
        if (cls == null) {
            return null;
        }
        return this.f7249l.c(cls);
    }

    public abstract j c0(Object obj);

    /* JADX WARN: Code duplicated, block: B:26:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0084  */
    public final b d0(p104t2.d dVar, Class cls, p026e2.d dVar2) {
        p104t2.d dVar3;
        boolean z5;
        C0474e c0474e = this.f7249l;
        p026e2.c cVar = c0474e.f7245s;
        cVar.getClass();
        b bVar = cVar.i.f8726h[dVar2.ordinal()];
        if (bVar != null) {
            return bVar;
        }
        int iOrdinal = dVar2.ordinal();
        b bVar2 = b.f8687j;
        b bVar3 = b.i;
        b bVar4 = b.f8686h;
        p104t2.d dVar4 = p104t2.d.f12496m;
        if (iOrdinal == 2) {
            if (dVar != p104t2.d.f12499p || !c0474e.p(g.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                dVar3 = p104t2.d.f12497n;
                if (dVar != dVar3) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (z5) {
                }
                if (dVar2 != p026e2.d.f8695m) {
                    return cVar.f8690h;
                }
                if (!z5) {
                    if (dVar == p104t2.d.f12503t) {
                        return bVar3;
                    }
                }
                return bVar2;
            }
            return bVar4;
        }
        if (iOrdinal == 3) {
            if (dVar == dVar4) {
                if (c0474e.p(g.ACCEPT_FLOAT_AS_INT)) {
                    return bVar3;
                }
                return bVar4;
            }
            dVar3 = p104t2.d.f12497n;
            if (dVar != dVar3) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (z5) {
            }
            if (dVar2 != p026e2.d.f8695m) {
                return cVar.f8690h;
            }
            if (!z5) {
                if (dVar == p104t2.d.f12503t) {
                    return bVar3;
                }
                return bVar4;
            }
            return bVar2;
        }
        if (iOrdinal == 7) {
            if (c0474e.p(g.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return bVar2;
            }
            return bVar4;
        }
        dVar3 = p104t2.d.f12497n;
        if (dVar != dVar3 || dVar == dVar4 || dVar == p104t2.d.f12498o || dVar == p104t2.d.f12502s) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 || c0474e.k(r.ALLOW_COERCION_OF_SCALARS) || (dVar == dVar3 && dVar2 == p026e2.d.f8691h)) {
            if (dVar2 != p026e2.d.f8695m) {
                return cVar.f8690h;
            }
            if (!z5 && !c0474e.p(g.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                if (dVar == p104t2.d.f12503t) {
                    return bVar3;
                }
            }
            return bVar2;
        }
        return bVar4;
    }

    public final b e0(p104t2.d dVar, Class cls) {
        b bVar = b.f8686h;
        C0474e c0474e = this.f7249l;
        p026e2.c cVar = c0474e.f7245s;
        cVar.getClass();
        p pVar = cVar.i;
        pVar.getClass();
        b bVar2 = pVar.f8726h[9];
        if (!Boolean.FALSE.equals(null)) {
            if (bVar2 != null) {
                return bVar2;
            }
            boolean z5 = dVar == p104t2.d.f12497n || dVar == p104t2.d.f12496m || dVar == p104t2.d.f12498o || dVar == p104t2.d.f12502s;
            b bVar3 = b.f8687j;
            if (z5 || c0474e.p(g.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return bVar3;
            }
        }
        return bVar;
    }

    public final j f0(h hVar, InterfaceC0472c interfaceC0472c) {
        return q0(this.f7247j.r(this, this.f7248k, hVar), interfaceC0472c, hVar);
    }

    public final Object g0(Object obj) {
        Annotation[] annotationArr = p109u2.i.f12697a;
        P(String.format("No 'injectableValues' configured, cannot inject value with id [%s]", obj), obj == null ? null : obj.getClass());
        throw null;
    }

    public final q h0(h hVar) throws InvalidDefinitionException {
        try {
            k kVar = this.f7247j;
            g gVar = this.f7248k;
            kVar.getClass();
            return k.q(this, gVar, hVar);
        } catch (IllegalArgumentException e6) {
            O(p109u2.i.i(e6));
            throw null;
        }
    }

    public final j i0(h hVar) {
        return this.f7247j.r(this, this.f7248k, hVar);
    }

    public abstract p037g2.A j0(Object obj, d0 d0Var);

    public final j k0(h hVar) {
        k kVar = this.f7247j;
        g gVar = this.f7248k;
        j jVarQ0 = q0(kVar.r(this, gVar, hVar), null, hVar);
        a aVarM0 = gVar.m0(this.f7249l, hVar);
        return aVarM0 != null ? new C(aVarM0.f(null), jVarQ0) : jVarQ0;
    }

    public final K2.k l0() {
        if (this.f7253p == null) {
            K2.k kVar = new K2.k();
            kVar.f2102h = null;
            kVar.i = null;
            kVar.f2103j = null;
            kVar.f2104k = null;
            kVar.f2105l = null;
            kVar.f2106m = null;
            kVar.f2107n = null;
            this.f7253p = kVar;
        }
        return this.f7253p;
    }

    public final void m0(j jVar) throws InvalidDefinitionException {
        if (this.f7249l.k(r.IGNORE_MERGE_FOR_UNMERGEABLE)) {
            return;
        }
        throw new InvalidDefinitionException(this.f7252o, AbstractC0013g0.i("Invalid configuration: values of type ", p109u2.i.r(b0(jVar.handledType())), " cannot be merged"));
    }

    public final void n0(Class cls, Throwable th) throws ValueInstantiationException {
        this.f7249l.getClass();
        p109u2.i.D(th);
        if (!B0(g.WRAP_EXCEPTIONS)) {
            p109u2.i.E(th);
        }
        throw y0(cls, th);
    }

    public final Object o0(Class cls, p032f2.t tVar, String str, Object... objArr) throws MismatchedInputException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f7249l.getClass();
        if (tVar == null) {
            P(p012c.k.s("Cannot construct instance of ", p109u2.i.z(cls), ": ", str), cls);
            throw null;
        }
        if (tVar.l()) {
            throw new MismatchedInputException((Closeable) this.f7252o, p012c.k.s("Cannot construct instance of ", p109u2.i.z(cls), " (although at least one Creator exists): ", str));
        }
        P(p012c.k.s("Cannot construct instance of ", p109u2.i.z(cls), " (no Creators, like default constructor, exist): ", str), cls);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j p0(j jVar, InterfaceC0472c interfaceC0472c, h hVar) {
        if (!(jVar instanceof p032f2.i)) {
            return jVar;
        }
        this.f7256s = new C0495p(hVar, 23, this.f7256s);
        try {
            return ((p032f2.i) jVar).a(this, interfaceC0472c);
        } finally {
            this.f7256s = (C0495p) this.f7256s.f7476j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j q0(j jVar, InterfaceC0472c interfaceC0472c, h hVar) {
        if (!(jVar instanceof p032f2.i)) {
            return jVar;
        }
        this.f7256s = new C0495p(hVar, 23, this.f7256s);
        try {
            return ((p032f2.i) jVar).a(this, interfaceC0472c);
        } finally {
            this.f7256s = (C0495p) this.f7256s.f7476j;
        }
    }

    public final void r0(T1.i iVar, h hVar) throws MismatchedInputException {
        t0(hVar, iVar.s(), iVar, null, new Object[0]);
        throw null;
    }

    public final void s0(T1.i iVar, Class cls) throws MismatchedInputException {
        t0(b0(cls), iVar.s(), iVar, null, new Object[0]);
        throw null;
    }

    public final void t0(h hVar, T1.k kVar, T1.i iVar, String str, Object... objArr) throws MismatchedInputException {
        String str2;
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f7249l.getClass();
        if (str == null) {
            String strR = p109u2.i.r(hVar);
            if (kVar == null) {
                str = "Unexpected end-of-input when trying read value of type " + strR;
            } else {
                switch (kVar.ordinal()) {
                    case 1:
                    case 2:
                    case 5:
                        str2 = "Object value";
                        break;
                    case 3:
                    case 4:
                        str2 = "Array value";
                        break;
                    case 6:
                        str2 = "Embedded Object";
                        break;
                    case 7:
                        str2 = "String value";
                        break;
                    case 8:
                        str2 = "Integer value";
                        break;
                    case 9:
                        str2 = "Floating-point value";
                        break;
                    case 10:
                    case 11:
                        str2 = "Boolean value";
                        break;
                    case 12:
                        str2 = "Null value";
                        break;
                    default:
                        str2 = "[Unavailable value]";
                        break;
                }
                StringBuilder sbO = AbstractC0013g0.o("Cannot deserialize value of type ", strR, " from ", str2, " (token `JsonToken.");
                sbO.append(kVar);
                sbO.append("`)");
                str = sbO.toString();
            }
        }
        if (kVar != null && kVar.f5237o) {
            iVar.i0();
        }
        throw new MismatchedInputException(this.f7252o, str);
    }

    public final void u0(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        this.f7249l.getClass();
        StringBuilder sbO = AbstractC0013g0.o("Cannot deserialize Map key of type ", p109u2.i.z(cls), " from String ", AbstractC0473d.d(str), ": ");
        sbO.append(str2);
        throw new InvalidFormatException(this.f7252o, sbO.toString(), str);
    }

    public final void v0(Class cls, Number number, String str, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        this.f7249l.getClass();
        StringBuilder sbO = AbstractC0013g0.o("Cannot deserialize value of type ", p109u2.i.z(cls), " from number ", String.valueOf(number), ": ");
        sbO.append(str);
        throw new InvalidFormatException(this.f7252o, sbO.toString(), number);
    }

    public final void w0(Class cls, String str, String str2, Object... objArr) throws InvalidFormatException {
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        this.f7249l.getClass();
        throw N0(cls, str, str2);
    }

    public final boolean x0(int i) {
        return (this.f7250m & i) != 0;
    }

    @Override // p015c2.AbstractC0473d
    public final p026e2.n y() {
        return this.f7249l;
    }

    public final ValueInstantiationException y0(Class cls, Throwable th) {
        String strI;
        if (th == null) {
            strI = "N/A";
        } else {
            strI = p109u2.i.i(th);
            if (strI == null) {
                strI = p109u2.i.z(th.getClass());
            }
        }
        String strS = p012c.k.s("Cannot construct instance of ", p109u2.i.z(cls), ", problem: ", strI);
        b0(cls);
        return new ValueInstantiationException(this.f7252o, strS, th);
    }

    public final InvalidTypeIdException z0(h hVar, String str, String str2) {
        return new InvalidTypeIdException(this.f7252o, AbstractC0473d.c(p012c.k.s("Could not resolve type id '", str, "' as a subtype of ", p109u2.i.r(hVar)), str2));
    }

    public f(f fVar, C0474e c0474e) {
        this.f7247j = fVar.f7247j;
        this.f7248k = fVar.f7248k;
        this.f7251n = null;
        this.f7249l = c0474e;
        this.f7250m = c0474e.f7246t;
        this.f7252o = null;
    }

    public f(f fVar, C0474e c0474e, c cVar) {
        this.f7247j = fVar.f7247j;
        this.f7248k = fVar.f7248k;
        this.f7251n = cVar.g0();
        this.f7249l = c0474e;
        this.f7250m = c0474e.f7246t;
        this.f7252o = cVar;
    }
}
