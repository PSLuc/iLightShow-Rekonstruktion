package p046i2;

import B.AbstractC0013g0;
import S1.C;
import S1.C0340b;
import S1.C0353o;
import S1.C0355q;
import S1.C0360w;
import S1.D;
import S1.E;
import S1.EnumC0345g;
import S1.EnumC0348j;
import S1.EnumC0352n;
import S1.EnumC0354p;
import S1.EnumC0363z;
import S1.F;
import S1.G;
import S1.H;
import S1.I;
import S1.InterfaceC0339a;
import S1.InterfaceC0341c;
import S1.InterfaceC0342d;
import S1.InterfaceC0343e;
import S1.InterfaceC0344f;
import S1.InterfaceC0346h;
import S1.InterfaceC0347i;
import S1.InterfaceC0349k;
import S1.InterfaceC0350l;
import S1.InterfaceC0351m;
import S1.InterfaceC0356s;
import S1.InterfaceC0357t;
import S1.InterfaceC0358u;
import S1.InterfaceC0359v;
import S1.InterfaceC0361x;
import S1.InterfaceC0362y;
import S1.J;
import S1.K;
import S1.L;
import S1.M;
import S1.N;
import S1.O;
import S1.P;
import S1.Q;
import S1.S;
import S1.T;
import S1.U;
import S1.V;
import S1.W;
import S1.X;
import S1.Y;
import S1.Z;
import S1.a0;
import S1.b0;
import S1.e0;
import S1.g0;
import S1.r;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.C0545p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p015c2.A;
import p015c2.B;
import p015c2.C0470a;
import p015c2.h;
import p020d2.d;
import p020d2.e;
import p020d2.f;
import p020d2.g;
import p020d2.j;
import p020d2.k;
import p020d2.l;
import p041h2.b;
import p071n2.c;
import p077o2.m;
import p077o2.o;
import p098s2.a;
import p109u2.i;
import p109u2.n;
import p109u2.p;
import p109u2.s;
import p109u2.w;

/* JADX INFO: loaded from: classes.dex */
public final class z extends B {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class[] f9585j = {j.class, a0.class, r.class, W.class, L.class, Y.class, InterfaceC0347i.class, F.class};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Class[] f9586k = {e.class, a0.class, r.class, W.class, Y.class, InterfaceC0347i.class, F.class, G.class};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient n f9587h;
    public boolean i;

    static {
        try {
            int i = b.f9288a;
        } catch (Throwable unused) {
        }
    }

    public static Class r0(Class cls) {
        if (cls == null || i.t(cls)) {
            return null;
        }
        return cls;
    }

    public static JsonMappingException s0(IllegalArgumentException illegalArgumentException, String str) {
        return new JsonMappingException(null, str, illegalArgumentException);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    public static m t0(p026e2.n nVar, q qVar) {
        m mVar;
        k kVar;
        U uUse;
        T tInclude;
        String strProperty;
        Class clsDefaultImpl;
        W w6 = (W) qVar.f(W.class);
        l lVar = (l) qVar.f(l.class);
        o oVar = null;
        if (lVar != null) {
            if (w6 != null) {
                Class clsValue = lVar.value();
                nVar.h();
                mVar = (m) i.h(clsValue, nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS));
                kVar = (k) qVar.f(k.class);
                if (kVar != null) {
                    Class clsValue2 = kVar.value();
                    nVar.h();
                    oVar = (o) i.h(clsValue2, nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS));
                }
                uUse = w6.use();
                if (uUse != null) {
                    mVar.getClass();
                    throw new IllegalArgumentException("idType cannot be null");
                }
                mVar.f10647a = uUse;
                mVar.f10652f = oVar;
                mVar.f10649c = uUse.f4922h;
                tInclude = w6.include();
                if (tInclude == T.f4915k && (qVar instanceof C0766b)) {
                    tInclude = T.f4913h;
                }
                if (tInclude != null) {
                    throw new IllegalArgumentException("includeAs cannot be null");
                }
                mVar.f10648b = tInclude;
                strProperty = w6.property();
                if (strProperty != null || strProperty.isEmpty()) {
                    strProperty = mVar.f10647a.f4922h;
                }
                mVar.f10649c = strProperty;
                clsDefaultImpl = w6.defaultImpl();
                if (clsDefaultImpl != V.class && !clsDefaultImpl.isAnnotation()) {
                    mVar.f10651e = clsDefaultImpl;
                }
                mVar.f10650d = w6.visible();
                return mVar;
            }
            return null;
        }
        if (w6 != null) {
            U uUse2 = w6.use();
            U u6 = U.NONE;
            if (uUse2 == u6) {
                m mVar2 = new m();
                mVar2.f10647a = u6;
                mVar2.f10652f = null;
                mVar2.f10649c = null;
                return mVar2;
            }
            mVar = new m();
            kVar = (k) qVar.f(k.class);
            if (kVar != null) {
                Class clsValue3 = kVar.value();
                nVar.h();
                oVar = (o) i.h(clsValue3, nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS));
            }
            uUse = w6.use();
            if (uUse != null) {
                mVar.getClass();
                throw new IllegalArgumentException("idType cannot be null");
            }
            mVar.f10647a = uUse;
            mVar.f10652f = oVar;
            mVar.f10649c = uUse.f4922h;
            tInclude = w6.include();
            if (tInclude == T.f4915k) {
                tInclude = T.f4913h;
            }
            if (tInclude != null) {
                throw new IllegalArgumentException("includeAs cannot be null");
            }
            mVar.f10648b = tInclude;
            strProperty = w6.property();
            if (strProperty != null) {
                strProperty = mVar.f10647a.f4922h;
            } else {
                strProperty = mVar.f10647a.f4922h;
            }
            mVar.f10649c = strProperty;
            clsDefaultImpl = w6.defaultImpl();
            if (clsDefaultImpl != V.class) {
                mVar.f10651e = clsDefaultImpl;
            }
            mVar.f10650d = w6.visible();
            return mVar;
        }
        return null;
    }

    public static boolean u0(h hVar, Class cls) {
        if (hVar.f7281k.isPrimitive()) {
            return hVar.h0(i.A(cls));
        }
        return cls.isPrimitive() && cls == i.A(hVar.f7281k);
    }

    public static boolean v0(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            return cls == i.A(cls2);
        }
        return cls2.isPrimitive() && cls2 == i.A(cls);
    }

    @Override // p015c2.B
    public final Class A(C0766b c0766b) {
        e eVar = (e) c0766b.f9533r.d(e.class);
        if (eVar == null) {
            return null;
        }
        return r0(eVar.builder());
    }

    @Override // p015c2.B
    public final O1.k B(C0766b c0766b) {
        g gVar = (g) c0766b.f9533r.d(g.class);
        if (gVar == null) {
            return null;
        }
        String strBuildMethodName = gVar.buildMethodName();
        String strWithPrefix = gVar.withPrefix();
        O1.k kVar = new O1.k();
        kVar.f4510a = strBuildMethodName;
        kVar.f4511b = strWithPrefix;
        return kVar;
    }

    @Override // p015c2.B
    public final H C(q qVar) {
        I i = (I) qVar.f(I.class);
        if (i != null) {
            return i.access();
        }
        return null;
    }

    @Override // p015c2.B
    public final List D(AbstractC0771g abstractC0771g) {
        InterfaceC0342d interfaceC0342d = (InterfaceC0342d) abstractC0771g.f(InterfaceC0342d.class);
        if (interfaceC0342d == null) {
            return null;
        }
        String[] strArrValue = interfaceC0342d.value();
        int length = strArrValue.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : strArrValue) {
            arrayList.add(A.a(str));
        }
        return arrayList;
    }

    @Override // p015c2.B
    public final m E(p026e2.n nVar, AbstractC0771g abstractC0771g, h hVar) {
        if (hVar.Y() != null) {
            return t0(nVar, abstractC0771g);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + hVar + ")");
    }

    @Override // p015c2.B
    public final String F(AbstractC0771g abstractC0771g) {
        I i = (I) abstractC0771g.f(I.class);
        if (i != null) {
            String strDefaultValue = i.defaultValue();
            if (!strDefaultValue.isEmpty()) {
                return strDefaultValue;
            }
        }
        return null;
    }

    @Override // p015c2.B
    public final String G(AbstractC0771g abstractC0771g) {
        J j4 = (J) abstractC0771g.f(J.class);
        if (j4 == null) {
            return null;
        }
        return j4.value();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set] */
    @Override // p015c2.B
    public final C0360w H(q qVar) {
        ?? hashSet;
        InterfaceC0361x interfaceC0361x = (InterfaceC0361x) qVar.f(InterfaceC0361x.class);
        if (interfaceC0361x == null) {
            return C0360w.f4978m;
        }
        C0360w c0360w = C0360w.f4978m;
        String[] strArrValue = interfaceC0361x.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        ?? r6 = hashSet;
        boolean zIgnoreUnknown = interfaceC0361x.ignoreUnknown();
        boolean zAllowGetters = interfaceC0361x.allowGetters();
        boolean zAllowSetters = interfaceC0361x.allowSetters();
        C0360w c0360w2 = C0360w.f4978m;
        return (zIgnoreUnknown == c0360w2.i && zAllowGetters == c0360w2.f4980j && zAllowSetters == c0360w2.f4981k && !c0360w2.f4982l && (r6 == 0 || r6.size() == 0)) ? c0360w2 : new C0360w(r6, zIgnoreUnknown, zAllowGetters, zAllowSetters, false);
    }

    @Override // p015c2.B
    public final C0360w I(q qVar) {
        return H(qVar);
    }

    @Override // p015c2.B
    public final S1.A J(q qVar) {
        S1.A a6;
        j jVar;
        S1.B b6 = (S1.B) qVar.f(S1.B.class);
        EnumC0363z enumC0363z = EnumC0363z.f4986l;
        if (b6 == null) {
            a6 = S1.A.f4905l;
        } else {
            S1.A a7 = S1.A.f4905l;
            EnumC0363z enumC0363zValue = b6.value();
            EnumC0363z enumC0363zContent = b6.content();
            if (enumC0363zValue == enumC0363z && enumC0363zContent == enumC0363z) {
                a6 = a7;
            } else {
                Class clsValueFilter = b6.valueFilter();
                if (clsValueFilter == Void.class) {
                    clsValueFilter = null;
                }
                Class clsContentFilter = b6.contentFilter();
                a6 = new S1.A(enumC0363zValue, enumC0363zContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
            }
        }
        if (a6.f4906h != enumC0363z || (jVar = (j) qVar.f(j.class)) == null) {
            return a6;
        }
        int iOrdinal = jVar.include().ordinal();
        if (iOrdinal == 0) {
            return a6.b(EnumC0363z.f4983h);
        }
        if (iOrdinal == 1) {
            return a6.b(EnumC0363z.i);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? a6 : a6.b(EnumC0363z.f4984j);
        }
        return a6.b(EnumC0363z.f4985k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet] */
    @Override // p015c2.B
    public final C K(q qVar) {
        ?? hashSet;
        D d6 = (D) qVar.f(D.class);
        if (d6 == null) {
            return C.i;
        }
        String[] strArrValue = d6.value();
        if (strArrValue == null || strArrValue.length == 0) {
            hashSet = Collections.EMPTY_SET;
        } else {
            hashSet = new HashSet(strArrValue.length);
            for (String str : strArrValue) {
                hashSet.add(str);
            }
        }
        return new C(hashSet);
    }

    @Override // p015c2.B
    public final Integer L(AbstractC0771g abstractC0771g) {
        int iIndex;
        I i = (I) abstractC0771g.f(I.class);
        if (i == null || (iIndex = i.index()) == -1) {
            return null;
        }
        return Integer.valueOf(iIndex);
    }

    @Override // p015c2.B
    public final m M(p026e2.n nVar, AbstractC0771g abstractC0771g, h hVar) {
        if (hVar.k0() || hVar.D()) {
            return null;
        }
        return t0(nVar, abstractC0771g);
    }

    @Override // p015c2.B
    public final C0470a N(AbstractC0771g abstractC0771g) {
        F f6 = (F) abstractC0771g.f(F.class);
        if (f6 != null) {
            return new C0470a(1, f6.value());
        }
        InterfaceC0347i interfaceC0347i = (InterfaceC0347i) abstractC0771g.f(InterfaceC0347i.class);
        if (interfaceC0347i != null) {
            return new C0470a(2, interfaceC0347i.value());
        }
        return null;
    }

    @Override // p015c2.B
    public final A O(C0766b c0766b) {
        M m6 = (M) c0766b.f9533r.d(M.class);
        if (m6 == null) {
            return null;
        }
        String strNamespace = m6.namespace();
        return A.b(m6.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
    }

    @Override // p015c2.B
    public final Object P(AbstractC0771g abstractC0771g) {
        Class clsR0;
        j jVar = (j) abstractC0771g.f(j.class);
        if (jVar == null || (clsR0 = r0(jVar.contentConverter())) == null || clsR0 == p109u2.k.class) {
            return null;
        }
        return clsR0;
    }

    @Override // p015c2.B
    public final Object Q(q qVar) {
        Class clsR0;
        j jVar = (j) qVar.f(j.class);
        if (jVar == null || (clsR0 = r0(jVar.converter())) == null || clsR0 == p109u2.k.class) {
            return null;
        }
        return clsR0;
    }

    @Override // p015c2.B
    public final String[] R(C0766b c0766b) {
        K k3 = (K) c0766b.f9533r.d(K.class);
        if (k3 == null) {
            return null;
        }
        return k3.value();
    }

    @Override // p015c2.B
    public final Boolean S(q qVar) {
        K k3 = (K) qVar.f(K.class);
        if (k3 == null || !k3.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    @Override // p015c2.B
    public final p020d2.i T(q qVar) {
        j jVar = (j) qVar.f(j.class);
        if (jVar == null) {
            return null;
        }
        return jVar.typing();
    }

    @Override // p015c2.B
    public final Object U(q qVar) {
        Class clsUsing;
        j jVar = (j) qVar.f(j.class);
        if (jVar != null && (clsUsing = jVar.using()) != p015c2.n.class) {
            return clsUsing;
        }
        L l6 = (L) qVar.f(L.class);
        if (l6 == null || !l6.value()) {
            return null;
        }
        return new C0545p(0, 3, qVar.g());
    }

    @Override // p015c2.B
    public final N V(AbstractC0771g abstractC0771g) {
        O o6 = (O) abstractC0771g.f(O.class);
        N n6 = N.f4911j;
        if (o6 != null) {
            b0 b0VarNulls = o6.nulls();
            b0 b0VarContentNulls = o6.contentNulls();
            b0 b0Var = b0.f4930k;
            if (b0VarNulls == null) {
                b0VarNulls = b0Var;
            }
            if (b0VarContentNulls == null) {
                b0VarContentNulls = b0Var;
            }
            if (b0VarNulls != b0Var || b0VarContentNulls != b0Var) {
                return new N(b0VarNulls, b0VarContentNulls);
            }
        }
        return n6;
    }

    @Override // p015c2.B
    public final List W(q qVar) {
        Q q6 = (Q) qVar.f(Q.class);
        if (q6 == null) {
            return null;
        }
        P[] pArrValue = q6.value();
        if (!q6.failOnRepeatedNames()) {
            ArrayList arrayList = new ArrayList(pArrValue.length);
            for (P p6 : pArrValue) {
                arrayList.add(new c(p6.name(), p6.value()));
                for (String str : p6.names()) {
                    arrayList.add(new c(str, p6.value()));
                }
            }
            return arrayList;
        }
        String name = qVar.getName();
        ArrayList arrayList2 = new ArrayList(pArrValue.length);
        HashSet hashSet = new HashSet();
        for (P p7 : pArrValue) {
            String strName = p7.name();
            if (!strName.isEmpty() && hashSet.contains(strName)) {
                throw new IllegalArgumentException(AbstractC0013g0.j("Annotated type [", name, "] got repeated subtype name [", strName, "]"));
            }
            hashSet.add(strName);
            arrayList2.add(new c(strName, p7.value()));
            for (String str2 : p7.names()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException(AbstractC0013g0.j("Annotated type [", name, "] got repeated subtype name [", str2, "]"));
                }
                hashSet.add(str2);
                arrayList2.add(new c(str2, p7.value()));
            }
        }
        return arrayList2;
    }

    @Override // p015c2.B
    public final String X(C0766b c0766b) {
        X x6 = (X) c0766b.f9533r.d(X.class);
        if (x6 == null) {
            return null;
        }
        return x6.value();
    }

    @Override // p015c2.B
    public final m Y(h hVar, p026e2.n nVar, C0766b c0766b) {
        return t0(nVar, c0766b);
    }

    @Override // p015c2.B
    public final s Z(AbstractC0771g abstractC0771g) {
        Y y2 = (Y) abstractC0771g.f(Y.class);
        if (y2 == null || !y2.enabled()) {
            return null;
        }
        String strPrefix = y2.prefix();
        String strSuffix = y2.suffix();
        boolean z5 = false;
        boolean z6 = (strPrefix == null || strPrefix.isEmpty()) ? false : true;
        if (strSuffix != null && !strSuffix.isEmpty()) {
            z5 = true;
        }
        if (z6) {
            return z5 ? new p109u2.o(strPrefix, strSuffix) : new p(strPrefix, 0);
        }
        return z5 ? new p(strSuffix, 1) : s.f12712h;
    }

    @Override // p015c2.B
    public final void a(p026e2.n nVar, C0766b c0766b, ArrayList arrayList) {
        Class cls;
        A a6;
        A a7;
        d dVar = (d) c0766b.f9533r.d(d.class);
        if (dVar == null) {
            return;
        }
        boolean zPrepend = dVar.prepend();
        p020d2.b[] bVarArrAttrs = dVar.attrs();
        int length = bVarArrAttrs.length;
        h hVarC = null;
        int i = 0;
        while (true) {
            cls = c0766b.f9525j;
            if (i >= length) {
                break;
            }
            if (hVarC == null) {
                hVarC = nVar.c(Object.class);
            }
            p020d2.b bVar = bVarArrAttrs[i];
            p015c2.z zVar = bVar.required() ? p015c2.z.f7337o : p015c2.z.f7338p;
            String strValue = bVar.value();
            String strPropName = bVar.propName();
            String strPropNamespace = bVar.propNamespace();
            if (strPropName.isEmpty()) {
                a7 = A.f7193k;
            } else {
                a7 = (strPropNamespace == null || strPropNamespace.isEmpty()) ? A.a(strPropName) : A.b(strPropName, strPropNamespace);
            }
            if (a7.f7195h.isEmpty()) {
                a7 = A.a(strValue);
            }
            a aVar = new a(strValue, w.B(nVar, new K(c0766b, cls, strValue, hVarC), a7, zVar, bVar.include()), c0766b.f9533r, hVarC);
            if (zPrepend) {
                arrayList.add(i, aVar);
            } else {
                arrayList.add(aVar);
            }
            i++;
        }
        p020d2.c[] cVarArrProps = dVar.props();
        if (cVarArrProps.length > 0) {
            p020d2.c cVar = cVarArrProps[0];
            p015c2.z zVar2 = cVar.required() ? p015c2.z.f7337o : p015c2.z.f7338p;
            String strName = cVar.name();
            String strNamespace = cVar.namespace();
            if (strName.isEmpty()) {
                a6 = A.f7193k;
            } else {
                a6 = (strNamespace == null || strNamespace.isEmpty()) ? A.a(strName) : A.b(strName, strNamespace);
            }
            w.B(nVar, new K(c0766b, cls, a6.f7195h, nVar.c(cVar.type())), a6, zVar2, cVar.include());
            Class clsValue = cVar.value();
            nVar.h();
            ((a) i.h(clsValue, nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS))).getClass();
            throw new IllegalStateException("Should not be called on this type");
        }
    }

    @Override // p015c2.B
    public final Object a0(C0766b c0766b) {
        p020d2.m mVar = (p020d2.m) c0766b.f9533r.d(p020d2.m.class);
        if (mVar == null) {
            return null;
        }
        return mVar.value();
    }

    @Override // p015c2.B
    public final L b(C0766b c0766b, L l6) {
        InterfaceC0346h interfaceC0346h = (InterfaceC0346h) c0766b.f9533r.d(InterfaceC0346h.class);
        if (interfaceC0346h == null) {
            return l6;
        }
        l6.getClass();
        EnumC0345g enumC0345g = interfaceC0346h.getterVisibility();
        EnumC0345g enumC0345g2 = EnumC0345g.f4938k;
        EnumC0345g enumC0345g3 = l6.f9518h;
        EnumC0345g enumC0345g4 = enumC0345g == enumC0345g2 ? enumC0345g3 : enumC0345g;
        EnumC0345g enumC0345gIsGetterVisibility = interfaceC0346h.isGetterVisibility();
        EnumC0345g enumC0345g5 = l6.i;
        EnumC0345g enumC0345g6 = enumC0345gIsGetterVisibility == enumC0345g2 ? enumC0345g5 : enumC0345gIsGetterVisibility;
        EnumC0345g enumC0345g7 = interfaceC0346h.setterVisibility();
        EnumC0345g enumC0345g8 = l6.f9519j;
        if (enumC0345g7 == enumC0345g2) {
            enumC0345g7 = enumC0345g8;
        }
        EnumC0345g enumC0345gCreatorVisibility = interfaceC0346h.creatorVisibility();
        EnumC0345g enumC0345g9 = l6.f9520k;
        if (enumC0345gCreatorVisibility == enumC0345g2) {
            enumC0345gCreatorVisibility = enumC0345g9;
        }
        EnumC0345g enumC0345gFieldVisibility = interfaceC0346h.fieldVisibility();
        EnumC0345g enumC0345g10 = l6.f9521l;
        if (enumC0345gFieldVisibility == enumC0345g2) {
            enumC0345gFieldVisibility = enumC0345g10;
        }
        if (enumC0345g4 == enumC0345g3 && enumC0345g6 == enumC0345g5 && enumC0345g7 == enumC0345g8 && enumC0345gCreatorVisibility == enumC0345g9 && enumC0345gFieldVisibility == enumC0345g10) {
            return l6;
        }
        return new L(enumC0345g4, enumC0345g6, enumC0345g7, enumC0345gCreatorVisibility, enumC0345gFieldVisibility);
    }

    @Override // p015c2.B
    public final Class[] b0(q qVar) {
        a0 a0Var = (a0) qVar.f(a0.class);
        if (a0Var == null) {
            return null;
        }
        return a0Var.value();
    }

    @Override // p015c2.B
    public final Object c(q qVar) {
        Class clsContentUsing;
        e eVar = (e) qVar.f(e.class);
        if (eVar == null || (clsContentUsing = eVar.contentUsing()) == p015c2.i.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // p015c2.B
    public final Boolean c0(AbstractC0771g abstractC0771g) {
        InterfaceC0343e interfaceC0343e = (InterfaceC0343e) abstractC0771g.f(InterfaceC0343e.class);
        if (interfaceC0343e == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC0343e.enabled());
    }

    @Override // p015c2.B
    public final Object d(q qVar) {
        Class clsContentUsing;
        j jVar = (j) qVar.f(j.class);
        if (jVar == null || (clsContentUsing = jVar.contentUsing()) == p015c2.n.class) {
            return null;
        }
        return clsContentUsing;
    }

    @Override // p015c2.B
    public final boolean d0(C0772h c0772h) {
        return c0772h.r(InterfaceC0343e.class);
    }

    @Override // p015c2.B
    public final EnumC0348j e(p026e2.n nVar, q qVar) {
        InterfaceC0349k interfaceC0349k = (InterfaceC0349k) qVar.f(InterfaceC0349k.class);
        if (interfaceC0349k != null) {
            return interfaceC0349k.mode();
        }
        if (!this.i || !nVar.k(p015c2.r.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES)) {
            return null;
        }
        boolean z5 = qVar instanceof C0767c;
        return null;
    }

    @Override // p015c2.B
    public final Boolean e0(AbstractC0771g abstractC0771g) {
        InterfaceC0344f interfaceC0344f = (InterfaceC0344f) abstractC0771g.f(InterfaceC0344f.class);
        if (interfaceC0344f == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC0344f.enabled());
    }

    @Override // p015c2.B
    public final EnumC0348j f(q qVar) {
        InterfaceC0349k interfaceC0349k = (InterfaceC0349k) qVar.f(InterfaceC0349k.class);
        if (interfaceC0349k == null) {
            return null;
        }
        return interfaceC0349k.mode();
    }

    @Override // p015c2.B
    public final Boolean f0(AbstractC0771g abstractC0771g) {
        E e6 = (E) abstractC0771g.f(E.class);
        if (e6 == null) {
            return null;
        }
        return Boolean.valueOf(e6.value());
    }

    @Override // p015c2.B
    public final Enum g(Class cls) {
        Annotation[] annotationArr = i.f12697a;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(InterfaceC0350l.class) != null) {
                String name = field.getName();
                for (Enum r7 : (Enum[]) cls.getEnumConstants()) {
                    if (name.equals(r7.name())) {
                        return r7;
                    }
                }
            }
        }
        return null;
    }

    @Override // p015c2.B
    public final Boolean g0(AbstractC0771g abstractC0771g) {
        Z z5 = (Z) abstractC0771g.f(Z.class);
        if (z5 == null) {
            return null;
        }
        return Boolean.valueOf(z5.value());
    }

    @Override // p015c2.B
    public final Object h(AbstractC0771g abstractC0771g) {
        Class clsR0;
        e eVar = (e) abstractC0771g.f(e.class);
        if (eVar == null || (clsR0 = r0(eVar.contentConverter())) == null || clsR0 == p109u2.k.class) {
            return null;
        }
        return clsR0;
    }

    @Override // p015c2.B
    public final boolean h0(C0772h c0772h) {
        Z z5 = (Z) c0772h.f(Z.class);
        return z5 != null && z5.value();
    }

    @Override // p015c2.B
    public final Object i(q qVar) {
        Class clsR0;
        e eVar = (e) qVar.f(e.class);
        if (eVar == null || (clsR0 = r0(eVar.converter())) == null || clsR0 == p109u2.k.class) {
            return null;
        }
        return clsR0;
    }

    @Override // p015c2.B
    public final boolean i0(q qVar) {
        InterfaceC0349k interfaceC0349k = (InterfaceC0349k) qVar.f(InterfaceC0349k.class);
        if (interfaceC0349k != null) {
            if (interfaceC0349k.mode() != EnumC0348j.f4952k) {
                return true;
            }
        } else if (this.i) {
            boolean z5 = qVar instanceof C0767c;
        }
        return false;
    }

    @Override // p015c2.B
    public final Object j(q qVar) {
        Class clsUsing;
        e eVar = (e) qVar.f(e.class);
        if (eVar == null || (clsUsing = eVar.using()) == p015c2.i.class) {
            return null;
        }
        return clsUsing;
    }

    @Override // p015c2.B
    public final boolean j0(AbstractC0771g abstractC0771g) {
        InterfaceC0359v interfaceC0359v = (InterfaceC0359v) abstractC0771g.f(InterfaceC0359v.class);
        if (interfaceC0359v != null) {
            return interfaceC0359v.value();
        }
        return false;
    }

    @Override // p015c2.B
    public final void k(Class cls, Enum[] enumArr, String[][] strArr) {
        InterfaceC0342d interfaceC0342d;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (interfaceC0342d = (InterfaceC0342d) field.getAnnotation(InterfaceC0342d.class)) != null) {
                String[] strArrValue = interfaceC0342d.value();
                if (strArrValue.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i = 0; i < length; i++) {
                        if (name.equals(enumArr[i].name())) {
                            strArr[i] = strArrValue;
                        }
                    }
                }
            }
        }
    }

    @Override // p015c2.B
    public final Boolean k0(AbstractC0771g abstractC0771g) {
        I i = (I) abstractC0771g.f(I.class);
        if (i != null) {
            return Boolean.valueOf(i.required());
        }
        return null;
    }

    @Override // p015c2.B
    public final String[] l(Class cls, Enum[] enumArr, String[] strArr) {
        I i;
        HashMap map = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (i = (I) field.getAnnotation(I.class)) != null) {
                String strValue = i.value();
                if (!strValue.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(field.getName(), strValue);
                }
            }
        }
        if (map != null) {
            int length = enumArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                String str = (String) map.get(enumArr[i3].name());
                if (str != null) {
                    strArr[i3] = str;
                }
            }
        }
        return strArr;
    }

    @Override // p015c2.B
    public final boolean l0(Annotation annotation) {
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        n nVar = this.f9587h;
        Boolean boolValueOf = (Boolean) ((p115v2.o) nVar.f12708h).get(clsAnnotationType);
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(clsAnnotationType.getAnnotation(InterfaceC0339a.class) != null);
            ((p115v2.o) nVar.f12708h).g(clsAnnotationType, boolValueOf, true);
        }
        return boolValueOf.booleanValue();
    }

    @Override // p015c2.B
    public final Object m(q qVar) {
        InterfaceC0351m interfaceC0351m = (InterfaceC0351m) qVar.f(InterfaceC0351m.class);
        if (interfaceC0351m == null) {
            return null;
        }
        String strValue = interfaceC0351m.value();
        if (strValue.isEmpty()) {
            return null;
        }
        return strValue;
    }

    @Override // p015c2.B
    public final Boolean m0(C0766b c0766b) {
        InterfaceC0362y interfaceC0362y = (InterfaceC0362y) c0766b.f9533r.d(InterfaceC0362y.class);
        if (interfaceC0362y == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC0362y.value());
    }

    @Override // p015c2.B
    public final C0355q n(q qVar) {
        r rVar = (r) qVar.f(r.class);
        if (rVar == null) {
            return null;
        }
        String strPattern = rVar.pattern();
        EnumC0354p enumC0354pShape = rVar.shape();
        String strLocale = rVar.locale();
        String strTimezone = rVar.timezone();
        EnumC0352n[] enumC0352nArrWith = rVar.with();
        EnumC0352n[] enumC0352nArrWithout = rVar.without();
        int iOrdinal = 0;
        for (EnumC0352n enumC0352n : enumC0352nArrWith) {
            iOrdinal |= 1 << enumC0352n.ordinal();
        }
        int iOrdinal2 = 0;
        for (EnumC0352n enumC0352n2 : enumC0352nArrWithout) {
            iOrdinal2 |= 1 << enumC0352n2.ordinal();
        }
        C0353o c0353o = new C0353o(iOrdinal, iOrdinal2);
        g0 g0VarLenient = rVar.lenient();
        g0VarLenient.getClass();
        return new C0355q(strPattern, enumC0354pShape, strLocale, strTimezone, c0353o, g0VarLenient != g0.i ? g0VarLenient == g0.f4940h ? Boolean.TRUE : Boolean.FALSE : null);
    }

    @Override // p015c2.B
    public final Boolean n0(AbstractC0771g abstractC0771g) {
        return Boolean.valueOf(abstractC0771g.r(S.class));
    }

    @Override // p015c2.B
    public final void o(AbstractC0771g abstractC0771g) {
        if (abstractC0771g instanceof C0776l) {
            m mVar = ((C0776l) abstractC0771g).f9555k;
        }
    }

    @Override // p015c2.B
    public final h o0(p026e2.n nVar, q qVar, h hVar) throws JsonMappingException {
        p104t2.n nVar2 = nVar.i.f8680h;
        e eVar = (e) qVar.f(e.class);
        Class clsR0 = eVar == null ? null : r0(eVar.as());
        if (clsR0 != null && !hVar.h0(clsR0) && !u0(hVar, clsR0)) {
            try {
                hVar = nVar2.i(hVar, clsR0, false);
            } catch (IllegalArgumentException e6) {
                throw s0(e6, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", hVar, clsR0.getName(), qVar.getName(), e6.getMessage()));
            }
        }
        hVar.getClass();
        if (hVar instanceof p104t2.e) {
            h hVarB0 = hVar.b0();
            Class clsR1 = eVar == null ? null : r0(eVar.keyAs());
            if (clsR1 != null && !u0(hVarB0, clsR1)) {
                try {
                    hVar = ((p104t2.e) hVar).z0(nVar2.i(hVarB0, clsR1, false));
                } catch (IllegalArgumentException e7) {
                    throw s0(e7, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsR1.getName(), qVar.getName(), e7.getMessage()));
                }
            }
        }
        h hVarY = hVar.Y();
        if (hVarY != null) {
            Class clsR2 = eVar != null ? r0(eVar.contentAs()) : null;
            if (clsR2 != null && !u0(hVarY, clsR2)) {
                try {
                    return hVar.q0(nVar2.i(hVarY, clsR2, false));
                } catch (IllegalArgumentException e8) {
                    throw s0(e8, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsR2.getName(), qVar.getName(), e8.getMessage()));
                }
            }
        }
        return hVar;
    }

    @Override // p015c2.B
    public final C0340b p(AbstractC0771g abstractC0771g) {
        Boolean bool;
        String name;
        InterfaceC0341c interfaceC0341c = (InterfaceC0341c) abstractC0771g.f(InterfaceC0341c.class);
        if (interfaceC0341c == null) {
            return null;
        }
        String strValue = interfaceC0341c.value();
        g0 g0VarUseInput = interfaceC0341c.useInput();
        g0VarUseInput.getClass();
        if (g0VarUseInput == g0.i) {
            bool = null;
        } else {
            bool = g0VarUseInput == g0.f4940h ? Boolean.TRUE : Boolean.FALSE;
        }
        String str = "".equals(strValue) ? null : strValue;
        C0340b c0340b = (str == null && bool == null) ? C0340b.f4926j : new C0340b(str, bool);
        Object obj = c0340b.f4927h;
        if (obj == null) {
            if (abstractC0771g instanceof C0772h) {
                C0772h c0772h = (C0772h) abstractC0771g;
                name = c0772h.f9547l.getParameterCount() == 0 ? abstractC0771g.g().getName() : c0772h.A(0).getName();
            } else {
                name = abstractC0771g.g().getName();
            }
            if (!name.equals(obj)) {
                return new C0340b(name, c0340b.i);
            }
        }
        return c0340b;
    }

    @Override // p015c2.B
    public final h p0(p026e2.n nVar, q qVar, h hVar) throws JsonMappingException {
        h hVarU0;
        h hVarU1;
        p104t2.n nVar2 = nVar.i.f8680h;
        j jVar = (j) qVar.f(j.class);
        Class<?> clsR0 = jVar == null ? null : r0(jVar.as());
        if (clsR0 != null) {
            if (hVar.h0(clsR0)) {
                hVar = hVar.u0();
            } else {
                Class<?> cls = hVar.f7281k;
                try {
                    if (clsR0.isAssignableFrom(cls)) {
                        nVar2.getClass();
                        hVar = p104t2.n.g(hVar, clsR0);
                    } else if (cls.isAssignableFrom(clsR0)) {
                        hVar = nVar2.i(hVar, clsR0, false);
                    } else {
                        if (!v0(cls, clsR0)) {
                            throw new JsonMappingException(null, String.format("Cannot refine serialization type %s into %s; types not related", hVar, clsR0.getName()));
                        }
                        hVar = hVar.u0();
                    }
                } catch (IllegalArgumentException e6) {
                    throw s0(e6, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", hVar, clsR0.getName(), qVar.getName(), e6.getMessage()));
                }
            }
        }
        hVar.getClass();
        if (hVar instanceof p104t2.e) {
            h hVarB0 = hVar.b0();
            Class<?> clsR1 = jVar == null ? null : r0(jVar.keyAs());
            if (clsR1 != null) {
                if (hVarB0.h0(clsR1)) {
                    hVarU1 = hVarB0.u0();
                } else {
                    Class<?> cls2 = hVarB0.f7281k;
                    try {
                        if (clsR1.isAssignableFrom(cls2)) {
                            nVar2.getClass();
                            hVarU1 = p104t2.n.g(hVarB0, clsR1);
                        } else if (cls2.isAssignableFrom(clsR1)) {
                            hVarU1 = nVar2.i(hVarB0, clsR1, false);
                        } else {
                            if (!v0(cls2, clsR1)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization key type %s into %s; types not related", hVarB0, clsR1.getName()));
                            }
                            hVarU1 = hVarB0.u0();
                        }
                    } catch (IllegalArgumentException e7) {
                        throw s0(e7, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsR1.getName(), qVar.getName(), e7.getMessage()));
                    }
                }
                hVar = ((p104t2.e) hVar).z0(hVarU1);
            }
        }
        h hVarY = hVar.Y();
        if (hVarY != null) {
            Class<?> clsR2 = jVar == null ? null : r0(jVar.contentAs());
            if (clsR2 != null) {
                if (hVarY.h0(clsR2)) {
                    hVarU0 = hVarY.u0();
                } else {
                    Class<?> cls3 = hVarY.f7281k;
                    try {
                        if (clsR2.isAssignableFrom(cls3)) {
                            nVar2.getClass();
                            hVarU0 = p104t2.n.g(hVarY, clsR2);
                        } else if (cls3.isAssignableFrom(clsR2)) {
                            hVarU0 = nVar2.i(hVarY, clsR2, false);
                        } else {
                            if (!v0(cls3, clsR2)) {
                                throw new JsonMappingException(null, String.format("Cannot refine serialization content type %s into %s; types not related", hVarY, clsR2.getName()));
                            }
                            hVarU0 = hVarY.u0();
                        }
                    } catch (IllegalArgumentException e8) {
                        throw s0(e8, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", hVar, clsR2.getName(), qVar.getName(), e8.getMessage()));
                    }
                }
                return hVar.q0(hVarU0);
            }
        }
        return hVar;
    }

    @Override // p015c2.B
    public final Object q(AbstractC0771g abstractC0771g) {
        C0340b c0340bP = p(abstractC0771g);
        if (c0340bP == null) {
            return null;
        }
        return c0340bP.f4927h;
    }

    @Override // p015c2.B
    public final C0772h q0(C0772h c0772h, C0772h c0772h2) {
        Class clsA = c0772h.A(0);
        Class clsA2 = c0772h2.A(0);
        if (!clsA.isPrimitive()) {
            if (!clsA2.isPrimitive()) {
                if (clsA == String.class) {
                    if (clsA2 == String.class) {
                        return null;
                    }
                } else if (clsA2 != String.class) {
                    return null;
                }
            }
            return c0772h2;
        }
        if (clsA2.isPrimitive()) {
            return null;
        }
        return c0772h;
    }

    @Override // p015c2.B
    public final Object r(q qVar) {
        Class clsKeyUsing;
        e eVar = (e) qVar.f(e.class);
        if (eVar == null || (clsKeyUsing = eVar.keyUsing()) == p015c2.p.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // p015c2.B
    public final Object s(q qVar) {
        Class clsKeyUsing;
        j jVar = (j) qVar.f(j.class);
        if (jVar == null || (clsKeyUsing = jVar.keyUsing()) == p015c2.n.class) {
            return null;
        }
        return clsKeyUsing;
    }

    @Override // p015c2.B
    public final Boolean t(AbstractC0771g abstractC0771g) {
        G g6 = (G) abstractC0771g.f(G.class);
        if (g6 == null) {
            return null;
        }
        g0 g0VarValue = g6.value();
        g0VarValue.getClass();
        if (g0VarValue == g0.i) {
            return null;
        }
        return g0VarValue == g0.f4940h ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // p015c2.B
    public final A u(AbstractC0771g abstractC0771g) {
        boolean z5;
        O o6 = (O) abstractC0771g.f(O.class);
        if (o6 != null) {
            String strValue = o6.value();
            if (!strValue.isEmpty()) {
                return A.a(strValue);
            }
            z5 = true;
        } else {
            z5 = false;
        }
        I i = (I) abstractC0771g.f(I.class);
        if (i != null) {
            String strNamespace = i.namespace();
            return A.b(i.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z5 || abstractC0771g.s(f9586k)) {
            return A.f7193k;
        }
        return null;
    }

    @Override // p015c2.B
    public final A v(AbstractC0771g abstractC0771g) {
        boolean z5;
        InterfaceC0356s interfaceC0356s = (InterfaceC0356s) abstractC0771g.f(InterfaceC0356s.class);
        if (interfaceC0356s != null) {
            String strValue = interfaceC0356s.value();
            if (!strValue.isEmpty()) {
                return A.a(strValue);
            }
            z5 = true;
        } else {
            z5 = false;
        }
        I i = (I) abstractC0771g.f(I.class);
        if (i != null) {
            String strNamespace = i.namespace();
            return A.b(i.value(), (strNamespace == null || !strNamespace.isEmpty()) ? strNamespace : null);
        }
        if (z5 || abstractC0771g.s(f9585j)) {
            return A.f7193k;
        }
        return null;
    }

    @Override // p015c2.B
    public final Object w(C0766b c0766b) {
        f fVar = (f) c0766b.f9533r.d(f.class);
        if (fVar == null) {
            return null;
        }
        return fVar.value();
    }

    @Override // p015c2.B
    public final Object x(AbstractC0771g abstractC0771g) {
        Class clsNullsUsing;
        j jVar = (j) abstractC0771g.f(j.class);
        if (jVar == null || (clsNullsUsing = jVar.nullsUsing()) == p015c2.n.class) {
            return null;
        }
        return clsNullsUsing;
    }

    @Override // p015c2.B
    public final C y(q qVar) {
        InterfaceC0357t interfaceC0357t = (InterfaceC0357t) qVar.f(InterfaceC0357t.class);
        if (interfaceC0357t == null || interfaceC0357t.generator() == e0.class) {
            return null;
        }
        return new C(A.a(interfaceC0357t.property()), interfaceC0357t.scope(), interfaceC0357t.generator(), false, interfaceC0357t.resolver());
    }

    @Override // p015c2.B
    public final C z(q qVar, C c6) {
        InterfaceC0358u interfaceC0358u = (InterfaceC0358u) qVar.f(InterfaceC0358u.class);
        if (interfaceC0358u == null) {
            return c6;
        }
        if (c6 == null) {
            c6 = C.f9475f;
        }
        boolean zAlwaysAsId = interfaceC0358u.alwaysAsId();
        if (c6.f9480e == zAlwaysAsId) {
            return c6;
        }
        return new C(c6.f9476a, c6.f9479d, c6.f9477b, zAlwaysAsId, c6.f9478c);
    }
}
