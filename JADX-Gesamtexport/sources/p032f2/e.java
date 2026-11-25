package p032f2;

import B.AbstractC0013g0;
import B.C0031p0;
import G0.p;
import O1.u;
import S1.C0355q;
import S1.C0360w;
import S1.EnumC0352n;
import S1.EnumC0354p;
import S1.T;
import S1.V;
import S1.d0;
import S1.f0;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.g0;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p012c.k;
import p015c2.A;
import p015c2.B;
import p015c2.C0471b;
import p015c2.C0474e;
import p015c2.InterfaceC0472c;
import p015c2.f;
import p015c2.g;
import p015c2.h;
import p015c2.j;
import p015c2.z;
import p037g2.C0719c;
import p037g2.E;
import p037g2.F;
import p037g2.m;
import p037g2.o;
import p037g2.r;
import p037g2.t;
import p037g2.v;
import p046i2.AbstractC0771g;
import p046i2.C;
import p046i2.C0766b;
import p071n2.d;
import p077o2.a;
import p104t2.b;
import p104t2.n;
import p109u2.EnumC0962a;
import p109u2.i;
import p109u2.l;
import p109u2.s;
import p109u2.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends g0 implements i, m {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final A f8881B = new A("#temporary-name", null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final r f8882A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f8883h;
    public final EnumC0354p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f8884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f8885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f8886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u f8887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8889o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0719c f8890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F[] f8891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f8892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set f8893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Set f8894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f8895u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f8896v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f8897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient HashMap f8898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public E f8899y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f8900z;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(f fVar, p046i2.r rVar, C0719c c0719c, HashMap map, HashSet hashSet, boolean z5, HashSet hashSet2, boolean z6) {
        h hVar = rVar.f9562a;
        super(hVar);
        this.f8883h = hVar;
        t tVar = fVar.i;
        this.f8884j = tVar;
        F[] fArr = null;
        this.f8885k = null;
        this.f8886l = null;
        this.f8887m = null;
        this.f8890p = c0719c;
        this.f8897w = map;
        this.f8893s = hashSet;
        this.f8895u = z5;
        this.f8894t = hashSet2;
        this.f8892r = fVar.f8910k;
        ArrayList arrayList = fVar.f8905e;
        if (arrayList != null && !arrayList.isEmpty()) {
            fArr = (F[]) arrayList.toArray(new F[arrayList.size()]);
        }
        this.f8891q = fArr;
        r rVar2 = fVar.f8909j;
        this.f8882A = rVar2;
        this.f8888n = this.f8899y != null || tVar.k() || tVar.g() || !tVar.j();
        this.i = rVar.d().i;
        this.f8896v = z6;
        this.f8889o = !this.f8888n && fArr == null && !z6 && rVar2 == null;
    }

    public static void h(C0719c c0719c, r[] rVarArr, r rVar, r rVar2) {
        int length = c0719c.f9116l.length;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = c0719c.f9116l;
            if (objArr[i] == rVar) {
                objArr[i] = rVar2;
                c0719c.f9117m[c0719c.c(rVar)] = rVar2;
                if (rVarArr != null) {
                    int length2 = rVarArr.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (rVarArr[i3] == rVar) {
                            rVarArr[i3] = rVar2;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        throw new NoSuchElementException(k.u(new StringBuilder("No entry '"), rVar.f8933j.f7195h, "' found, can't replace"));
    }

    public static void y(f fVar, Exception exc, Object obj, String str) throws IOException {
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        i.C(cause);
        boolean z5 = fVar == null || fVar.B0(g.WRAP_EXCEPTIONS);
        if (cause instanceof IOException) {
            if (!z5 || !(cause instanceof JacksonException)) {
                throw ((IOException) cause);
            }
        } else if (!z5) {
            i.E(cause);
        }
        int i = JsonMappingException.f7531k;
        throw JsonMappingException.h(cause, new p015c2.k(str, obj));
    }

    @Override // p032f2.i
    public final j a(f fVar, InterfaceC0472c interfaceC0472c) throws InvalidDefinitionException {
        r rVar;
        C cY;
        r rVar2;
        d0 d0VarJ;
        h hVar;
        u uVar;
        B bD = fVar.f7249l.d();
        EnumC0354p enumC0354p = null;
        AbstractC0771g abstractC0771gE = g0._neitherNull(interfaceC0472c, bD) ? interfaceC0472c.e() : null;
        h hVar2 = this.f8883h;
        C0719c c0719c = this.f8890p;
        r rVar3 = this.f8882A;
        if (abstractC0771gE == null || (cY = bD.y(abstractC0771gE)) == null) {
            rVar = rVar3;
        } else {
            C cZ = bD.z(abstractC0771gE, cY);
            Class cls = cZ.f9477b;
            fVar.K(cZ);
            A a6 = cZ.f9476a;
            if (cls == f0.class) {
                String str = a6.f7195h;
                r rVarI = c0719c == null ? null : c0719c.i(str);
                if (rVarI == null && (uVar = this.f8887m) != null) {
                    rVarI = uVar.g(str);
                }
                if (rVarI == null) {
                    fVar.O("Invalid Object Id definition for " + i.z(hVar2.f7281k) + ": cannot find property with name " + i.c(str));
                    throw null;
                }
                v vVar = new v(cZ.f9479d);
                hVar = rVarI.f8934k;
                d0VarJ = vVar;
                rVar2 = rVarI;
            } else {
                h hVarB0 = fVar.b0(cls);
                fVar.A().getClass();
                h hVar3 = n.l(hVarB0, d0.class)[0];
                rVar2 = null;
                d0VarJ = fVar.J(cZ);
                hVar = hVar3;
            }
            rVar = new r(hVar, a6, d0VarJ, fVar.k0(hVar), rVar2);
        }
        e eVarX = (rVar == null || rVar == rVar3) ? this : x(rVar);
        if (abstractC0771gE != null) {
            C0360w c0360wH = bD.H(abstractC0771gE);
            if (c0360wH.i && !this.f8895u) {
                eVarX = eVarX.w();
            }
            Set set = c0360wH.f4981k ? Collections.EMPTY_SET : c0360wH.f4979h;
            boolean zIsEmpty = set.isEmpty();
            Set set2 = eVarX.f8893s;
            if (zIsEmpty) {
                set = set2;
            } else if (set2 != null && !set2.isEmpty()) {
                HashSet hashSet = new HashSet(set2);
                hashSet.addAll(set);
                set = hashSet;
            }
            Set<String> set3 = bD.K(abstractC0771gE).f4909h;
            Set set4 = eVarX.f8894t;
            if (set4 != null) {
                if (set3 == null) {
                    set3 = set4;
                } else {
                    HashSet hashSet2 = new HashSet();
                    for (String str2 : set3) {
                        if (set4.contains(str2)) {
                            hashSet2.add(str2);
                        }
                    }
                    set3 = hashSet2;
                }
            }
            if (set != set2 || set3 != set4) {
                eVarX = eVarX.v(set, set3);
            }
        }
        C0355q c0355qFindFormatOverrides = findFormatOverrides(fVar, interfaceC0472c, hVar2.f7281k);
        if (c0355qFindFormatOverrides != null) {
            EnumC0354p enumC0354p2 = EnumC0354p.f4961h;
            EnumC0354p enumC0354p3 = c0355qFindFormatOverrides.i;
            enumC0354p = enumC0354p3 != enumC0354p2 ? enumC0354p3 : null;
            Boolean boolB = c0355qFindFormatOverrides.b(EnumC0352n.i);
            if (boolB != null) {
                boolean zBooleanValue = boolB.booleanValue();
                C0719c c0719c2 = c0719c.f9113h == zBooleanValue ? c0719c : new C0719c(c0719c, zBooleanValue);
                if (c0719c2 != c0719c) {
                    eVarX = eVarX.u(c0719c2);
                }
            }
        }
        if (enumC0354p == null) {
            enumC0354p = this.i;
        }
        return enumC0354p == EnumC0354p.f4963k ? eVarX.i() : eVarX;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31, types: [u2.s] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r22v0, types: [c2.d, c2.f] */
    /* JADX WARN: Type inference failed for: r5v22, types: [c2.j] */
    @Override // p032f2.m
    public final void b(f fVar) throws Throwable {
        r[] rVarArrC;
        boolean z5;
        Throwable th;
        int i;
        ?? r6;
        l lVarFindValueNullProvider;
        Class cls;
        Class clsP;
        AbstractC0771g abstractC0771g;
        ?? R5;
        j jVarUnwrappingDeserializer;
        s sVarZ;
        j jVarI0;
        t tVar = this.f8884j;
        if (tVar.g()) {
            rVarArrC = tVar.C(fVar.f7249l);
            Set set = this.f8894t;
            Set set2 = this.f8893s;
            if (set2 != null || set != null) {
                int length = rVarArrC.length;
                for (int i3 = 0; i3 < length; i3++) {
                    if (V.M(rVarArrC[i3].f8933j.f7195h, set2, set)) {
                        rVarArrC[i3].y();
                    }
                }
            }
        } else {
            rVarArrC = null;
        }
        C0719c<r> c0719c = this.f8890p;
        for (r rVar : c0719c) {
            if (!rVar.t()) {
                Object objI = fVar.f7249l.d().i(rVar.e());
                if (objI != null) {
                    rVar.e();
                    l lVarM = fVar.m(objI);
                    fVar.A();
                    h hVar = ((m) lVarM).f9146a;
                    jVarI0 = new com.fasterxml.jackson.databind.deser.std.f0(lVarM, hVar, fVar.i0(hVar));
                } else {
                    jVarI0 = null;
                }
                if (jVarI0 == null) {
                    jVarI0 = fVar.i0(rVar.f8934k);
                }
                h(c0719c, rVarArrC, rVar, rVar.E(jVarI0));
            }
        }
        Iterator it = c0719c.iterator();
        C0031p0 c0031p0 = null;
        E e6 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            h hVar2 = this.f8883h;
            if (!zHasNext) {
                t tVar2 = tVar;
                p pVar = this.f8892r;
                if (pVar != null && pVar.f8928k == null) {
                    this.f8892r = pVar.e(findDeserializer(fVar, pVar.f8927j, pVar.f8926h));
                }
                if (tVar2.k()) {
                    C0474e c0474e = fVar.f7249l;
                    h hVarB = tVar2.B();
                    if (hVarB == null) {
                        fVar.O(AbstractC0013g0.j("Invalid delegate-creator definition for ", i.r(hVar2), ": value instantiator (", i.f(tVar2), ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"));
                        throw null;
                    }
                    this.f8885k = f(fVar, hVarB, tVar2.A());
                }
                if (tVar2.i()) {
                    C0474e c0474e2 = fVar.f7249l;
                    h hVarY = tVar2.y();
                    if (hVarY == null) {
                        fVar.O(AbstractC0013g0.j("Invalid delegate-creator definition for ", i.r(hVar2), ": value instantiator (", i.f(tVar2), ") returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"));
                        throw null;
                    }
                    this.f8886l = f(fVar, hVarY, tVar2.x());
                }
                if (rVarArrC != null) {
                    int length2 = rVarArrC.length;
                    r[] rVarArr = new r[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        r rVarE = rVarArrC[i6];
                        if (!rVarE.t() && !rVarE.x()) {
                            rVarE = rVarE.E(fVar.f0(rVarE.f8934k, rVarE));
                        }
                        rVarArr[i6] = rVarE;
                    }
                    this.f8887m = new u(fVar, this.f8884j, rVarArr, c0719c.f9113h, true);
                }
                if (c0031p0 != null) {
                    ArrayList arrayList = (ArrayList) c0031p0.f394j;
                    int size = arrayList.size();
                    p037g2.g[] gVarArr = new p037g2.g[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        p037g2.g gVar = (p037g2.g) arrayList.get(i7);
                        r rVarI = c0719c.i(gVar.f9137c);
                        if (rVarI != null) {
                            gVar.f9138d = rVarI;
                        }
                        gVarArr[i7] = gVar;
                    }
                    this.f8900z = new p((h) c0031p0.i, gVarArr, (HashMap) c0031p0.f395k);
                    z5 = true;
                    this.f8888n = true;
                } else {
                    z5 = true;
                }
                this.f8899y = e6;
                if (e6 != null) {
                    this.f8888n = z5;
                }
                this.f8889o = (!this.f8889o || this.f8888n) ? false : z5;
                return;
            }
            r rVar2 = (r) it.next();
            r rVarE2 = rVar2.E(fVar.p0(rVar2.r(), rVar2, rVar2.f8934k));
            String strP = rVarE2.p();
            if (strP == null) {
                th = null;
                i = 0;
            } else {
                r rVarFindBackReference = rVarE2.r().findBackReference(strP);
                th = null;
                i = 0;
                h hVar3 = rVarE2.f8934k;
                if (rVarFindBackReference == null) {
                    fVar.O("Cannot handle managed/back reference " + i.c(strP) + ": no back reference property found from type " + i.r(hVar3));
                    throw null;
                }
                boolean zK0 = hVar3.k0();
                h hVar4 = rVarFindBackReference.f8934k;
                if (!hVar4.f7281k.isAssignableFrom(hVar2.f7281k)) {
                    String strC = i.c(strP);
                    String strR = i.r(hVar4);
                    String name = hVar2.f7281k.getName();
                    StringBuilder sbO = AbstractC0013g0.o("Cannot handle managed/back reference ", strC, ": back reference type (", strR, ") not compatible with managed type (");
                    sbO.append(name);
                    sbO.append(")");
                    fVar.O(sbO.toString());
                    throw null;
                }
                rVarE2 = new p037g2.n(rVarE2, strP, rVarFindBackReference, zK0);
            }
            if (!(rVarE2 instanceof p037g2.n)) {
                C cQ = rVarE2.q();
                j jVarR = rVarE2.r();
                Object objectIdReader = jVarR == null ? th : jVarR.getObjectIdReader();
                if (cQ != null || objectIdReader != null) {
                    rVarE2 = new p037g2.s(rVarE2, cQ);
                }
            }
            AbstractC0771g abstractC0771gE = rVarE2.e();
            C0474e c0474e3 = fVar.f7249l;
            if (abstractC0771gE == null || (sVarZ = c0474e3.d().Z(abstractC0771gE)) == null) {
                r6 = th;
            } else {
                r6 = sVarZ;
                if (rVarE2 instanceof j) {
                    fVar.O("Cannot define Creator property \"" + rVarE2.f8933j.f7195h + "\" as `@JsonUnwrapped`: combination not yet supported");
                    throw th;
                }
            }
            if (r6 == 0 || (jVarUnwrappingDeserializer = (R5 = rVarE2.r()).unwrappingDeserializer(r6)) == R5 || jVarUnwrappingDeserializer == null) {
                z zVarC = rVarE2.c();
                O1.B b6 = zVarC.f7343l;
                if (b6 != null) {
                    j jVarR2 = rVarE2.r();
                    Boolean boolSupportsUpdate = jVarR2.supportsUpdate(c0474e3);
                    boolean z6 = b6.f4438a;
                    if (boolSupportsUpdate == null) {
                        if (!z6) {
                            boolean zK = c0474e3.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
                            abstractC0771g = (AbstractC0771g) b6.f4439b;
                            abstractC0771g.m(zK);
                            if (!(rVarE2 instanceof p037g2.B)) {
                                rVarE2 = new o(rVarE2, abstractC0771g);
                            }
                            lVarFindValueNullProvider = findValueNullProvider(fVar, rVarE2, zVarC);
                            if (lVarFindValueNullProvider != null) {
                                rVarE2 = rVarE2.D(lVarFindValueNullProvider);
                            }
                        }
                    } else if (boolSupportsUpdate.booleanValue()) {
                        boolean zK2 = c0474e3.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
                        abstractC0771g = (AbstractC0771g) b6.f4439b;
                        abstractC0771g.m(zK2);
                        if (!(rVarE2 instanceof p037g2.B)) {
                            rVarE2 = new o(rVarE2, abstractC0771g);
                        }
                        lVarFindValueNullProvider = findValueNullProvider(fVar, rVarE2, zVarC);
                        if (lVarFindValueNullProvider != null) {
                            rVarE2 = rVarE2.D(lVarFindValueNullProvider);
                        }
                    } else if (!z6) {
                        fVar.m0(jVarR2);
                    }
                } else {
                    lVarFindValueNullProvider = findValueNullProvider(fVar, rVarE2, zVarC);
                    if (lVarFindValueNullProvider != null) {
                        rVarE2 = rVarE2.D(lVarFindValueNullProvider);
                    }
                }
                j jVarR3 = rVarE2.r();
                if ((jVarR3 instanceof e) && !((e) jVarR3).f8884j.j() && (clsP = i.p((cls = rVarE2.f8934k.f7281k))) != null && clsP == hVar2.f7281k) {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length3 = constructors.length;
                    int i8 = i;
                    while (i8 < length3) {
                        Constructor<?> constructor = constructors[i8];
                        Constructor<?>[] constructorArr = constructors;
                        if (constructor.getParameterCount() == 1 && clsP.equals(constructor.getParameterTypes()[i])) {
                            c0474e3.getClass();
                            if (c0474e3.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                i.e(constructor, c0474e3.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                            }
                            rVarE2 = new p037g2.j(rVarE2, constructor);
                            break;
                        }
                        i8++;
                        constructors = constructorArr;
                    }
                }
                if (rVarE2 != rVar2) {
                    h(c0719c, rVarArrC, rVar2, rVarE2);
                }
                if (rVarE2.u()) {
                    d dVarS = rVarE2.s();
                    if (dVarS.g() == T.f4915k) {
                        if (c0031p0 == null) {
                            c0031p0 = new C0031p0(hVar2);
                        }
                        ArrayList arrayList2 = (ArrayList) c0031p0.f394j;
                        Integer numValueOf = Integer.valueOf(arrayList2.size());
                        arrayList2.add(new p037g2.g(rVarE2, dVarS));
                        c0031p0.a(rVarE2.f8933j.f7195h, numValueOf);
                        c0031p0.a(((a) dVarS).f10629l, numValueOf);
                        c0719c.l(rVarE2);
                    }
                }
            } else {
                r rVarE3 = rVarE2.E(jVarUnwrappingDeserializer);
                if (e6 == null) {
                    e6 = new E();
                }
                e6.f9105a.add(rVarE3);
                c0719c.l(rVarE3);
            }
            tVar = tVar;
            it = it;
        }
    }

    public final j d() {
        j jVar = this.f8885k;
        return jVar == null ? this.f8886l : jVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Object deserializeWithType(T1.i iVar, f fVar, d dVar) {
        Object objE0;
        r rVar = this.f8882A;
        if (rVar != null) {
            if (iVar.b() && (objE0 = iVar.e0()) != null) {
                dVar.d(iVar, fVar);
                g(iVar, fVar, objE0);
                throw null;
            }
            T1.k kVarS = iVar.s();
            if (kVarS != null) {
                if (kVarS.f5237o) {
                    m(iVar, fVar);
                    throw null;
                }
                if (kVarS == T1.k.START_OBJECT) {
                    kVarS = iVar.B0();
                }
                if (kVarS == T1.k.FIELD_NAME) {
                    rVar.f9159j.getClass();
                }
            }
        }
        return dVar.d(iVar, fVar);
    }

    public abstract Object e(T1.i iVar, f fVar);

    public final j f(f fVar, h hVar, p046i2.m mVar) {
        C0471b c0471b = new C0471b(f8881B, hVar, null, mVar, z.f7338p);
        d dVarA = (d) hVar.f7284n;
        if (dVarA == null) {
            C0474e c0474e = fVar.f7249l;
            c0474e.getClass();
            p046i2.r rVarJ = c0474e.j(hVar.f7281k);
            B bD = c0474e.d();
            C0766b c0766b = rVarJ.f9566e;
            p077o2.m mVarY = bD.Y(hVar, c0474e, c0766b);
            if (mVarY == null) {
                c0474e.i.getClass();
                dVarA = null;
            } else {
                dVarA = mVarY.a(c0474e, hVar, c0474e.f8721k.V(c0474e, c0766b));
            }
        }
        j jVar = (j) hVar.f7283m;
        j jVarFindDeserializer = jVar == null ? findDeserializer(fVar, hVar, c0471b) : fVar.q0(jVar, c0471b, hVar);
        return dVarA != null ? new p037g2.C(dVarA.f(c0471b), jVarFindDeserializer) : jVarFindDeserializer;
    }

    @Override // p015c2.j
    public final r findBackReference(String str) {
        HashMap map = this.f8897w;
        if (map == null) {
            return null;
        }
        return (r) map.get(str);
    }

    public final void g(T1.i iVar, f fVar, Object obj) {
        r rVar = this.f8882A;
        j jVar = rVar.f9160k;
        if (jVar.handledType() != obj.getClass()) {
            p109u2.A aA0 = fVar.a0(iVar);
            if (obj instanceof String) {
                aA0.s0((String) obj);
            } else if (obj instanceof Long) {
                aA0.B0(T1.k.VALUE_NUMBER_INT, (Long) obj);
            } else if (obj instanceof Integer) {
                aA0.B0(T1.k.VALUE_NUMBER_INT, (Integer) obj);
            } else {
                aA0.f0(obj);
            }
            T1.i iVarH0 = aA0.H0(aA0.i);
            iVarH0.B0();
            obj = jVar.deserialize(iVarH0, fVar);
        }
        fVar.j0(obj, rVar.f9159j).getClass();
        throw null;
    }

    @Override // p015c2.j
    public final EnumC0962a getEmptyAccessPattern() {
        return EnumC0962a.f12678j;
    }

    @Override // p015c2.j
    public final Object getEmptyValue(f fVar) throws JsonMappingException {
        try {
            return this.f8884j.v(fVar);
        } catch (IOException e6) {
            i.B(fVar, e6);
            throw null;
        }
    }

    @Override // p015c2.j
    public final Collection getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8890p.iterator();
        while (it.hasNext()) {
            arrayList.add(((r) it.next()).f8933j.f7195h);
        }
        return arrayList;
    }

    @Override // p015c2.j
    public final EnumC0962a getNullAccessPattern() {
        return EnumC0962a.f12677h;
    }

    @Override // p015c2.j
    public final r getObjectIdReader() {
        return this.f8882A;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final t getValueInstantiator() {
        return this.f8884j;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final h getValueType() {
        return this.f8883h;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0
    public final void handleUnknownProperty(T1.i iVar, f fVar, Object obj, String str) throws UnrecognizedPropertyException, IgnoredPropertyException {
        if (this.f8895u) {
            iVar.F0();
            return;
        }
        if (V.M(str, this.f8893s, this.f8894t)) {
            p(iVar, fVar, obj, str);
        }
        super.handleUnknownProperty(iVar, fVar, obj, str);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.g0, p015c2.j
    public final Class handledType() {
        return this.f8883h.f7281k;
    }

    public abstract e i();

    @Override // p015c2.j
    public final boolean isCachable() {
        return true;
    }

    public final Object j(T1.i iVar, f fVar) throws MismatchedInputException {
        j jVarD = d();
        t tVar = this.f8884j;
        if (jVarD == null || tVar.c()) {
            return tVar.o(fVar, iVar.s() == T1.k.VALUE_TRUE);
        }
        Object objW = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
        if (this.f8891q != null) {
            t(fVar, objW);
        }
        return objW;
    }

    public final Object k(T1.i iVar, f fVar) throws MismatchedInputException {
        T1.h hVarB0 = iVar.b0();
        T1.h hVar = T1.h.f5211l;
        F[] fArr = this.f8891q;
        t tVar = this.f8884j;
        if (hVarB0 == hVar || hVarB0 == T1.h.f5210k) {
            j jVarD = d();
            if (jVarD == null || tVar.d()) {
                return tVar.p(fVar, iVar.V());
            }
            Object objW = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
            if (fArr != null) {
                t(fVar, objW);
            }
            return objW;
        }
        if (hVarB0 != T1.h.f5212m) {
            fVar.o0(this.f8883h.f7281k, tVar, "no suitable creator method found to deserialize from Number value (%s)", iVar.c0());
            throw null;
        }
        j jVarD2 = d();
        if (jVarD2 == null || tVar.a()) {
            return tVar.m(fVar, iVar.T());
        }
        Object objW2 = tVar.w(fVar, jVarD2.deserialize(iVar, fVar));
        if (fArr != null) {
            t(fVar, objW2);
        }
        return objW2;
    }

    public final Object l(T1.i iVar, f fVar) throws MismatchedInputException {
        if (this.f8882A != null) {
            m(iVar, fVar);
            throw null;
        }
        j jVarD = d();
        T1.h hVarB0 = iVar.b0();
        T1.h hVar = T1.h.f5208h;
        t tVar = this.f8884j;
        F[] fArr = this.f8891q;
        if (hVarB0 == hVar) {
            if (jVarD == null || tVar.e()) {
                return tVar.q(fVar, iVar.Z());
            }
            Object objW = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
            if (fArr != null) {
                t(fVar, objW);
            }
            return objW;
        }
        if (hVarB0 == T1.h.i) {
            if (jVarD == null || tVar.e()) {
                return tVar.r(fVar, iVar.a0());
            }
            Object objW2 = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
            if (fArr != null) {
                t(fVar, objW2);
            }
            return objW2;
        }
        if (hVarB0 != T1.h.f5209j) {
            fVar.o0(this.f8883h.f7281k, tVar, "no suitable creator method found to deserialize from Number value (%s)", iVar.c0());
            throw null;
        }
        if (jVarD == null || tVar.b()) {
            return tVar.n(fVar, iVar.C());
        }
        Object objW3 = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
        if (fArr != null) {
            t(fVar, objW3);
        }
        return objW3;
    }

    @Override // p015c2.j
    public final p104t2.d logicalType() {
        return p104t2.d.f12494k;
    }

    public final void m(T1.i iVar, f fVar) {
        r rVar = this.f8882A;
        fVar.j0(rVar.f9160k.deserialize(iVar, fVar), rVar.f9159j).getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    public final Object n(T1.i iVar, f fVar) throws MismatchedInputException {
        boolean z5;
        j jVarD = d();
        t tVar = this.f8884j;
        if (jVarD != null) {
            Object objW = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
            if (this.f8891q != null) {
                t(fVar, objW);
            }
            return objW;
        }
        if (this.f8887m != null) {
            return e(iVar, fVar);
        }
        Class cls = this.f8883h.f7281k;
        Annotation[] annotationArr = i.f12697a;
        if (Modifier.isStatic(cls.getModifiers())) {
            z5 = false;
        } else {
            if ((i.w(cls) ? null : cls.getEnclosingClass()) != null) {
                z5 = true;
            } else {
                z5 = false;
            }
        }
        if (z5) {
            fVar.o0(cls, null, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]);
            throw null;
        }
        if (p109u2.u.a(cls)) {
            fVar.o0(cls, null, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]);
            throw null;
        }
        fVar.o0(cls, tVar, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
        throw null;
    }

    public final Object o(T1.i iVar, f fVar) throws MismatchedInputException {
        if (this.f8882A != null) {
            m(iVar, fVar);
            throw null;
        }
        j jVarD = d();
        if (jVarD != null) {
            t tVar = this.f8884j;
            if (!tVar.h()) {
                Object objW = tVar.w(fVar, jVarD.deserialize(iVar, fVar));
                if (this.f8891q != null) {
                    t(fVar, objW);
                }
                return objW;
            }
        }
        return _deserializeFromString(iVar, fVar);
    }

    public final void p(T1.i iVar, f fVar, Object obj, String str) throws IgnoredPropertyException {
        if (!fVar.B0(g.FAIL_ON_IGNORED_PROPERTIES)) {
            iVar.F0();
            return;
        }
        Collection knownPropertyNames = getKnownPropertyNames();
        int i = IgnoredPropertyException.f7686n;
        IgnoredPropertyException ignoredPropertyException = new IgnoredPropertyException(iVar, AbstractC0013g0.j("Ignored field \"", str, "\" (class ", (obj instanceof Class ? (Class) obj : obj.getClass()).getName(), ") encountered; mapper configured not to allow this"), iVar.M(), knownPropertyNames);
        ignoredPropertyException.e(str, obj);
        throw ignoredPropertyException;
    }

    public final Object q(T1.i iVar, f fVar, Object obj, p109u2.A a6) throws UnrecognizedPropertyException, InvalidDefinitionException, IgnoredPropertyException {
        j jVarK0;
        synchronized (this) {
            HashMap map = this.f8898x;
            jVarK0 = map == null ? null : (j) map.get(new b(obj.getClass()));
        }
        if (jVarK0 == null && (jVarK0 = fVar.k0(fVar.b0(obj.getClass()))) != null) {
            synchronized (this) {
                try {
                    if (this.f8898x == null) {
                        this.f8898x = new HashMap();
                    }
                    this.f8898x.put(new b(obj.getClass()), jVarK0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (jVarK0 == null) {
            if (a6 != null) {
                r(fVar, obj, a6);
            }
            return iVar != null ? deserialize(iVar, fVar, obj) : obj;
        }
        if (a6 != null) {
            a6.M();
            y yVarH0 = a6.H0(a6.i);
            yVarH0.B0();
            obj = jVarK0.deserialize(yVarH0, fVar, obj);
        }
        return iVar != null ? jVarK0.deserialize(iVar, fVar, obj) : obj;
    }

    public final void r(f fVar, Object obj, p109u2.A a6) throws UnrecognizedPropertyException, IgnoredPropertyException {
        a6.M();
        y yVarH0 = a6.H0(a6.i);
        while (yVarH0.B0() != T1.k.END_OBJECT) {
            String strO = yVarH0.o();
            yVarH0.B0();
            handleUnknownProperty(yVarH0, fVar, obj, strO);
        }
    }

    public final void s(T1.i iVar, f fVar, Object obj, String str) throws IOException {
        if (V.M(str, this.f8893s, this.f8894t)) {
            p(iVar, fVar, obj, str);
            return;
        }
        p pVar = this.f8892r;
        if (pVar == null) {
            handleUnknownProperty(iVar, fVar, obj, str);
            return;
        }
        try {
            pVar.c(iVar, fVar, obj, str);
        } catch (Exception e6) {
            y(fVar, e6, obj, str);
            throw null;
        }
    }

    @Override // p015c2.j
    public Boolean supportsUpdate(C0474e c0474e) {
        return Boolean.TRUE;
    }

    public final void t(f fVar, Object obj) {
        F[] fArr = this.f8891q;
        if (fArr.length <= 0) {
            return;
        }
        fVar.g0(fArr[0].f9106l);
        throw null;
    }

    public abstract e u(C0719c c0719c);

    @Override // p015c2.j
    public abstract j unwrappingDeserializer(s sVar);

    public abstract e v(Set set, Set set2);

    public abstract e w();

    public abstract e x(r rVar);

    public final void z(Exception exc, f fVar) throws IOException {
        Throwable cause = exc;
        while ((cause instanceof InvocationTargetException) && cause.getCause() != null) {
            cause = cause.getCause();
        }
        i.C(cause);
        if (cause instanceof IOException) {
            throw ((IOException) cause);
        }
        if (fVar == null) {
            throw new IllegalArgumentException(cause.getMessage(), cause);
        }
        if (!fVar.B0(g.WRAP_EXCEPTIONS)) {
            i.E(cause);
        }
        fVar.n0(this.f8883h.f7281k, cause);
        throw null;
    }

    public e(e eVar) {
        this(eVar, eVar.f8895u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(e eVar, boolean z5) {
        h hVar = eVar.f8883h;
        super(hVar);
        this.f8883h = hVar;
        this.f8884j = eVar.f8884j;
        this.f8885k = eVar.f8885k;
        this.f8886l = eVar.f8886l;
        this.f8887m = eVar.f8887m;
        this.f8890p = eVar.f8890p;
        this.f8897w = eVar.f8897w;
        this.f8893s = eVar.f8893s;
        this.f8895u = z5;
        this.f8894t = eVar.f8894t;
        this.f8892r = eVar.f8892r;
        this.f8891q = eVar.f8891q;
        this.f8882A = eVar.f8882A;
        this.f8888n = eVar.f8888n;
        this.f8899y = eVar.f8899y;
        this.f8896v = eVar.f8896v;
        this.i = eVar.i;
        this.f8889o = eVar.f8889o;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(e eVar, s sVar) {
        A a6;
        j jVarUnwrappingDeserializer;
        A a7;
        j jVarUnwrappingDeserializer2;
        h hVar = eVar.f8883h;
        super(hVar);
        this.f8883h = hVar;
        this.f8884j = eVar.f8884j;
        this.f8885k = eVar.f8885k;
        this.f8886l = eVar.f8886l;
        this.f8887m = eVar.f8887m;
        this.f8897w = eVar.f8897w;
        this.f8893s = eVar.f8893s;
        this.f8895u = sVar != null || eVar.f8895u;
        this.f8894t = eVar.f8894t;
        this.f8892r = eVar.f8892r;
        this.f8891q = eVar.f8891q;
        this.f8882A = eVar.f8882A;
        this.f8888n = eVar.f8888n;
        E e6 = eVar.f8899y;
        if (sVar != null) {
            String str = null;
            if (e6 != null) {
                ArrayList arrayList = e6.f9105a;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    r rVarC = (r) obj;
                    String strA = sVar.a(rVarC.f8933j.f7195h);
                    A a8 = rVarC.f8933j;
                    if (a8 != null) {
                        strA = strA == null ? "" : strA;
                        a7 = strA.equals(a8.f7195h) ? a8 : new A(strA, a8.i);
                    } else {
                        a7 = new A(strA, null);
                    }
                    rVarC = a7 != a8 ? rVarC.C(a7) : rVarC;
                    j jVarR = rVarC.r();
                    if (jVarR != null && (jVarUnwrappingDeserializer2 = jVarR.unwrappingDeserializer(sVar)) != jVarR) {
                        rVarC = rVarC.E(jVarUnwrappingDeserializer2);
                    }
                    arrayList2.add(rVarC);
                }
                e6 = new E(arrayList2);
            }
            C0719c c0719c = eVar.f8890p;
            c0719c.getClass();
            if (sVar != s.f12712h) {
                r[] rVarArr = c0719c.f9117m;
                int length = rVarArr.length;
                ArrayList arrayList3 = new ArrayList(length);
                int i3 = 0;
                while (i3 < length) {
                    r rVarC2 = rVarArr[i3];
                    if (rVarC2 == null) {
                        arrayList3.add(rVarC2);
                    } else {
                        A a9 = rVarC2.f8933j;
                        String strA2 = sVar.a(a9.f7195h);
                        if (a9 != null) {
                            strA2 = strA2 == null ? "" : strA2;
                            a6 = strA2.equals(a9.f7195h) ? a9 : new A(strA2, a9.i);
                        } else {
                            a6 = new A(strA2, str);
                        }
                        rVarC2 = a6 != a9 ? rVarC2.C(a6) : rVarC2;
                        j jVarR2 = rVarC2.r();
                        if (jVarR2 != null && (jVarUnwrappingDeserializer = jVarR2.unwrappingDeserializer(sVar)) != jVarR2) {
                            rVarC2 = rVarC2.E(jVarUnwrappingDeserializer);
                        }
                        arrayList3.add(rVarC2);
                    }
                    i3++;
                    str = null;
                }
                c0719c = new C0719c(c0719c.f9113h, arrayList3, c0719c.f9118n, c0719c.f9120p);
            }
            this.f8890p = c0719c;
        } else {
            this.f8890p = eVar.f8890p;
        }
        this.f8899y = e6;
        this.f8896v = eVar.f8896v;
        this.i = eVar.i;
        this.f8889o = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(e eVar, r rVar) {
        h hVar = eVar.f8883h;
        super(hVar);
        this.f8883h = hVar;
        this.f8884j = eVar.f8884j;
        this.f8885k = eVar.f8885k;
        this.f8886l = eVar.f8886l;
        this.f8887m = eVar.f8887m;
        this.f8897w = eVar.f8897w;
        this.f8893s = eVar.f8893s;
        this.f8895u = eVar.f8895u;
        this.f8894t = eVar.f8894t;
        this.f8892r = eVar.f8892r;
        this.f8891q = eVar.f8891q;
        this.f8888n = eVar.f8888n;
        this.f8899y = eVar.f8899y;
        this.f8896v = eVar.f8896v;
        this.i = eVar.i;
        this.f8882A = rVar;
        this.f8890p = eVar.f8890p.m(new t(rVar, z.f7337o));
        this.f8889o = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(e eVar, Set set, Set set2) {
        h hVar = eVar.f8883h;
        super(hVar);
        this.f8883h = hVar;
        this.f8884j = eVar.f8884j;
        this.f8885k = eVar.f8885k;
        this.f8886l = eVar.f8886l;
        this.f8887m = eVar.f8887m;
        this.f8897w = eVar.f8897w;
        this.f8893s = set;
        this.f8895u = eVar.f8895u;
        this.f8894t = set2;
        this.f8892r = eVar.f8892r;
        this.f8891q = eVar.f8891q;
        this.f8888n = eVar.f8888n;
        this.f8899y = eVar.f8899y;
        this.f8896v = eVar.f8896v;
        this.i = eVar.i;
        this.f8889o = eVar.f8889o;
        this.f8882A = eVar.f8882A;
        C0719c c0719c = eVar.f8890p;
        c0719c.getClass();
        if ((set != null && !set.isEmpty()) || set2 != null) {
            r[] rVarArr = c0719c.f9117m;
            ArrayList arrayList = new ArrayList(rVarArr.length);
            for (r rVar : rVarArr) {
                if (rVar != null && !V.M(rVar.f8933j.f7195h, set, set2)) {
                    arrayList.add(rVar);
                }
            }
            c0719c = new C0719c(c0719c.f9113h, arrayList, c0719c.f9118n, c0719c.f9120p);
        }
        this.f8890p = c0719c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(e eVar, C0719c c0719c) {
        h hVar = eVar.f8883h;
        super(hVar);
        this.f8883h = hVar;
        this.f8884j = eVar.f8884j;
        this.f8885k = eVar.f8885k;
        this.f8886l = eVar.f8886l;
        this.f8887m = eVar.f8887m;
        this.f8890p = c0719c;
        this.f8897w = eVar.f8897w;
        this.f8893s = eVar.f8893s;
        this.f8895u = eVar.f8895u;
        this.f8894t = eVar.f8894t;
        this.f8892r = eVar.f8892r;
        this.f8891q = eVar.f8891q;
        this.f8882A = eVar.f8882A;
        this.f8888n = eVar.f8888n;
        this.f8899y = eVar.f8899y;
        this.f8896v = eVar.f8896v;
        this.i = eVar.i;
        this.f8889o = eVar.f8889o;
    }
}
