package p009b2;

import B.AbstractC0013g0;
import D4.a;
import S1.EnumC0348j;
import S1.EnumC0352n;
import T1.m;
import com.fasterxml.jackson.databind.deser.std.AbstractC0525v;
import com.fasterxml.jackson.databind.deser.std.f0;
import com.fasterxml.jackson.databind.deser.std.h0;
import com.fasterxml.jackson.databind.deser.std.i0;
import com.fasterxml.jackson.databind.deser.std.k0;
import com.fasterxml.jackson.databind.deser.std.l0;
import com.fasterxml.jackson.databind.deser.std.m0;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import p015c2.B;
import p015c2.C0474e;
import p015c2.h;
import p015c2.i;
import p015c2.j;
import p015c2.q;
import p015c2.z;
import p026e2.n;
import p032f2.g;
import p032f2.t;
import p037g2.C0719c;
import p037g2.C0722f;
import p046i2.A;
import p046i2.C0765a;
import p046i2.C0766b;
import p046i2.C0767c;
import p046i2.C0772h;
import p046i2.D;
import p046i2.r;
import p046i2.s;
import p046i2.y;
import p084p4.f;
import p084p4.u;
import p104t2.c;
import p104t2.e;
import p109u2.C0965d;
import p109u2.InterfaceC0963b;
import p109u2.l;
import p115v2.o;

/* JADX INFO: loaded from: classes.dex */
public final class k implements m, Serializable, InterfaceC0963b, f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7080h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f7081j;

    public /* synthetic */ k(int i) {
        this.f7080h = i;
    }

    public static j m(p015c2.f fVar, g gVar, h hVar) throws InvalidDefinitionException {
        j jVarC0;
        h hVarS0;
        r rVarN;
        Object objC;
        j jVarC1;
        h hVarB0;
        Object objR;
        q qVarC0;
        h hVar2 = hVar;
        C0474e c0474e = fVar.f7249l;
        if (hVar2.i0() || (hVar2 instanceof e) || (hVar2 instanceof c)) {
            gVar.o0(hVar);
        }
        r rVarN2 = c0474e.n(hVar2);
        n nVar = fVar.f7249l;
        B bD = nVar.d();
        C0766b c0766b = rVarN2.f9566e;
        Object objJ = bD.j(c0766b);
        if (objJ == null) {
            jVarC0 = null;
        } else {
            jVarC0 = fVar.c0(objJ);
            Object objI = nVar.d().i(c0766b);
            l lVarM = objI == null ? null : fVar.m(objI);
            if (lVarM != null) {
                fVar.A();
                jVarC0 = new f0(lVarM, ((p037g2.m) lVarM).f9146a, jVarC0);
            }
        }
        if (jVarC0 != null) {
            return jVarC0;
        }
        B bD2 = nVar.d();
        if (!(hVar2 instanceof e) || (hVarB0 = hVar2.b0()) == null || hVarB0.f7283m != null || (objR = bD2.r(c0766b)) == null || (qVarC0 = fVar.C0(objR)) == null) {
            hVarS0 = hVar2;
        } else {
            e eVar = (e) hVar2;
            hVarS0 = new e(eVar.f7281k, eVar.f12515r, eVar.f12513p, eVar.f12514q, eVar.f12505t.w0(qVarC0), eVar.f12506u, eVar.f7283m, eVar.f7284n, eVar.f7285o);
        }
        h hVarY = hVarS0.Y();
        if (hVarY != null && hVarY.f7283m == null && (objC = bD2.c(c0766b)) != null) {
            if (objC instanceof j) {
                jVarC1 = (j) objC;
            } else {
                Class cls = (Class) objC;
                if (cls == i.class || p109u2.i.t(cls)) {
                    cls = null;
                }
                jVarC1 = cls != null ? fVar.c0(cls) : null;
            }
            if (jVarC1 != null) {
                hVarS0 = hVarS0.s0(jVarC1);
            }
        }
        h hVarO0 = bD2.o0(nVar, c0766b, hVarS0);
        if (hVarO0 != hVar2) {
            rVarN = c0474e.n(hVarO0);
            hVar2 = hVarO0;
        } else {
            rVarN = rVarN2;
        }
        C0766b c0766b2 = rVarN.f9566e;
        B b6 = rVarN.f9565d;
        Class clsA = b6 == null ? null : b6.A(c0766b2);
        Class<?> cls2 = hVar2.f7281k;
        if (clsA == null) {
            h hVar3 = hVar2;
            l lVarA = b6 == null ? null : rVarN.a(b6.i(c0766b2));
            if (lVarA == null) {
                return n(fVar, gVar, hVar3, rVarN);
            }
            fVar.A();
            h hVar4 = ((p037g2.m) lVarA).f9146a;
            if (!hVar4.h0(cls2)) {
                rVarN = c0474e.n(hVar4);
            }
            return new f0(lVarA, hVar4, n(fVar, gVar, hVar4, rVarN));
        }
        gVar.getClass();
        h hVarC = nVar.k(p015c2.r.INFER_BUILDER_TYPE_BINDINGS) ? fVar.A().c(null, clsA, hVar2.X()) : fVar.b0(clsA);
        nVar.i.i.getClass();
        C0766b c0766bO = s.o(nVar, hVarC, nVar);
        B bD3 = nVar.k(p015c2.r.USE_ANNOTATIONS) ? nVar.d() : null;
        O1.k kVarB = bD3 == null ? null : bD3.B(c0766bO);
        r rVar = new r(new D(nVar, false, hVarC, c0766bO, new y(nVar, kVarB == null ? "with" : kVarB.f4511b)));
        try {
            t tVarN0 = gVar.n0(fVar, rVar);
            p032f2.f fVar2 = new p032f2.f(fVar, rVar);
            fVar2.i = tVarN0;
            gVar.r0(fVar, rVar, fVar2);
            g.t0(fVar, rVar, fVar2);
            gVar.q0(fVar, rVar, fVar2);
            g.s0(rVar, fVar2);
            C0766b c0766b3 = rVar.f9566e;
            B b7 = rVar.f9565d;
            O1.k kVarB2 = b7 == null ? null : b7.B(c0766b3);
            String str = kVarB2 == null ? "build" : kVarB2.f4510a;
            LinkedHashMap linkedHashMap = c0766b3.n().f9554h;
            C0772h c0772h = linkedHashMap == null ? null : (C0772h) linkedHashMap.get(new A(str, null));
            if (c0772h != null && nVar.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                p109u2.i.e(c0772h.f9547l, nVar.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            fVar2.f8912m = c0772h;
            p026e2.k kVar = gVar.f8878j;
            if (kVar.c()) {
                C0965d c0965dA = kVar.a();
                if (c0965dA.hasNext()) {
                    throw p012c.k.q(c0965dA);
                }
            }
            C0772h c0772h2 = fVar2.f8912m;
            r rVar2 = fVar2.f8903c;
            p015c2.f fVar3 = fVar2.f8902b;
            if (c0772h2 != null) {
                Class<?> returnType = c0772h2.f9547l.getReturnType();
                if (returnType != cls2 && !returnType.isAssignableFrom(cls2) && !cls2.isAssignableFrom(returnType)) {
                    h hVar5 = rVar2.f9562a;
                    String strO = fVar2.f8912m.o();
                    String strM = p109u2.i.m(returnType);
                    String strR = p109u2.i.r(hVar2);
                    StringBuilder sbO = AbstractC0013g0.o("Build method `", strO, "` has wrong return type (", strM, "), not compatible with POJO type (");
                    sbO.append(strR);
                    sbO.append(")");
                    fVar3.O(sbO.toString());
                    throw null;
                }
            } else if (!str.isEmpty()) {
                fVar3.O(AbstractC0013g0.j("Builder class ", p109u2.i.r(rVar2.f9562a), " does not have build method (name: '", str, "')"));
                throw null;
            }
            Collection collectionValues = fVar2.f8904d.values();
            fVar2.b(collectionValues);
            Map mapA = fVar2.a(collectionValues);
            Boolean boolB = rVar2.d().b(EnumC0352n.i);
            C0474e c0474e2 = fVar2.f8901a;
            C0719c c0719c = new C0719c(boolB == null ? c0474e2.k(p015c2.r.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolB.booleanValue(), collectionValues, mapA, c0474e2.i.f8684m);
            c0719c.g();
            boolean zK = c0474e2.k(p015c2.r.DEFAULT_VIEW_INCLUSION);
            boolean z5 = !zK;
            if (zK) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((p032f2.r) it.next()).v()) {
                        z5 = true;
                        break;
                    }
                }
            }
            boolean z6 = z5;
            if (fVar2.f8909j != null) {
                c0719c = c0719c.m(new p037g2.t(fVar2.f8909j, z.f7337o));
            }
            p032f2.h hVar6 = new p032f2.h(fVar2, fVar2.f8903c, hVar2, c0719c, fVar2.f8906f, fVar2.f8907g, fVar2.f8911l, fVar2.f8908h, z6);
            if (kVar.c()) {
                C0965d c0965dA2 = kVar.a();
                if (c0965dA2.hasNext()) {
                    throw p012c.k.q(c0965dA2);
                }
            }
            return hVar6;
        } catch (IllegalArgumentException e6) {
            throw new InvalidDefinitionException(fVar.f7252o, p109u2.i.i(e6));
        } catch (NoClassDefFoundError e7) {
            return new C0722f(e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0308 A[PHI: r13
  0x0308: PHI (r13v9 java.lang.Class) = 
  (r13v8 java.lang.Class)
  (r13v8 java.lang.Class)
  (r13v11 java.lang.Class)
  (r13v11 java.lang.Class)
  (r13v11 java.lang.Class)
  (r13v12 java.lang.Class)
 binds: [B:156:0x02f6, B:158:0x02fc, B:148:0x02cf, B:150:0x02d5, B:142:0x02b3, B:135:0x0296] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:392:0x069a  */
    /* JADX WARN: Code duplicated, block: B:394:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:396:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:397:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:399:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:400:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:402:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:403:0x06be  */
    /* JADX WARN: Code duplicated, block: B:404:0x06c1 A[PHI: r6
  0x06c1: PHI (r6v27 c2.j) = (r6v26 c2.j), (r6v31 c2.j), (r6v32 c2.j) binds: [B:391:0x0698, B:399:0x06b0, B:396:0x06a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:463:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:464:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:506:0x0835  */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0884, code lost:
    
        if (r5.endsWith("DataSource") != false) goto L563;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p015c2.j n(p015c2.f r29, p032f2.g r30, p015c2.h r31, p046i2.r r32) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instruction units count: 2436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p009b2.k.n(c2.f, f2.g, c2.h, i2.r):c2.j");
    }

    public static boolean o(h hVar) {
        if (!hVar.k0()) {
            return false;
        }
        h hVarY = hVar.Y();
        if (hVarY == null || (hVarY.f7283m == null && hVarY.f7284n == null)) {
            return (hVar instanceof e) && hVar.b0().f7283m != null;
        }
        return true;
    }

    public static k p(n nVar, Class cls) {
        Annotation[] annotationArr = p109u2.i.f12697a;
        Class superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] strArrL = nVar.d().l(superclass, enumArr, new String[enumArr.length]);
        T1.n[] nVarArr = new T1.n[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum r6 = enumArr[i];
            String strName = strArrL[i];
            if (strName == null) {
                strName = r6.name();
            }
            nVarArr[r6.ordinal()] = new V1.h(strName);
        }
        return new k(cls, nVarArr);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01b8 A[PHI: r11
  0x01b8: PHI (r11v2 c2.q) = (r11v1 c2.q), (r11v4 c2.q), (r11v26 c2.q), (r11v27 c2.q) binds: [B:84:0x00f5, B:88:0x0105, B:99:0x0135, B:93:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0281  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v3, types: [c2.q] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [i2.g] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19, types: [i2.h] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10, types: [i2.a] */
    /* JADX WARN: Type inference failed for: r7v12, types: [i2.a] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static q q(p015c2.f fVar, g gVar, h hVar) throws Throwable {
        r rVarJ;
        q qVarL0;
        p026e2.k kVar;
        Throwable th;
        ?? A5;
        List list;
        ?? r7;
        p026e2.k kVar2;
        r rVar;
        Iterator it;
        int i;
        Object c0765a;
        Class clsA;
        ?? r6;
        l0 l0VarA;
        q i0Var;
        l0 k0Var;
        k0 k0Var2;
        int i3;
        gVar.getClass();
        C0474e c0474e = fVar.f7249l;
        p026e2.k kVar3 = gVar.f8878j;
        l[] lVarArr = kVar3.i;
        Throwable th2 = null;
        if (lVarArr.length > 0) {
            rVarJ = c0474e.i(hVar);
            qVarL0 = null;
            int i6 = 0;
            while (i6 < lVarArr.length) {
                if (i6 >= lVarArr.length) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 + 1;
                lVarArr[i6].getClass();
                Class clsG = hVar.f7281k;
                if (clsG.isPrimitive()) {
                    clsG = p109u2.i.G(clsG);
                }
                if (clsG == String.class || clsG == Object.class || clsG == CharSequence.class || clsG == Serializable.class) {
                    if (clsG == String.class) {
                        k0Var2 = k0.f7611k;
                    } else if (clsG == Object.class) {
                        k0Var2 = k0.f7612l;
                    } else {
                        k0Var = new k0(clsG);
                    }
                    k0Var = k0Var2;
                } else {
                    if (clsG == UUID.class) {
                        i3 = 12;
                    } else if (clsG == Integer.class) {
                        i3 = 5;
                    } else if (clsG == Long.class) {
                        i3 = 6;
                    } else if (clsG == Date.class) {
                        i3 = 10;
                    } else if (clsG == Calendar.class) {
                        i3 = 11;
                    } else if (clsG == Boolean.class) {
                        i3 = 1;
                    } else if (clsG == Byte.class) {
                        i3 = 2;
                    } else if (clsG == Character.class) {
                        i3 = 4;
                    } else if (clsG == Short.class) {
                        i3 = 3;
                    } else if (clsG == Float.class) {
                        i3 = 7;
                    } else if (clsG == Double.class) {
                        i3 = 8;
                    } else if (clsG == URI.class) {
                        i3 = 13;
                    } else if (clsG == URL.class) {
                        i3 = 14;
                    } else if (clsG == Class.class) {
                        i3 = 15;
                    } else if (clsG == Locale.class) {
                        k0Var = new l0(9, clsG, AbstractC0525v.h(Locale.class));
                    } else if (clsG == Currency.class) {
                        k0Var = new l0(16, clsG, AbstractC0525v.h(Currency.class));
                    } else if (clsG == byte[].class) {
                        i3 = 17;
                    } else {
                        k0Var = null;
                    }
                    k0Var = new l0(i3, clsG, null);
                }
                if (k0Var != null) {
                    qVarL0 = k0Var;
                    break;
                }
                i6 = i7;
                qVarL0 = k0Var;
            }
        } else {
            rVarJ = null;
            qVarL0 = null;
        }
        if (qVarL0 != null) {
            kVar = kVar3;
            th = null;
            A5 = qVarL0;
        } else {
            if (rVarJ == null) {
                rVarJ = c0474e.j(hVar.f7281k);
            }
            qVarL0 = p032f2.c.l0(fVar, rVarJ.f9566e);
            if (qVarL0 != null) {
                kVar = kVar3;
                th = null;
                A5 = qVarL0;
            } else if (hVar.l0()) {
                C0474e c0474e2 = fVar.f7249l;
                r rVarN = c0474e2.n(hVar);
                C0766b c0766b = rVarN.f9566e;
                q qVarL1 = p032f2.c.l0(fVar, c0766b);
                if (qVarL1 != null) {
                    qVarL0 = qVarL1;
                } else {
                    C0965d c0965dB = kVar3.b();
                    if (c0965dB.hasNext()) {
                        throw p012c.k.q(c0965dB);
                    }
                    j jVarK0 = p032f2.c.k0(fVar, c0766b);
                    Class<?> cls = hVar.f7281k;
                    if (jVarK0 == null) {
                        p109u2.m mVarI0 = p032f2.c.i0(cls, c0474e2, rVarN.e());
                        Iterator it2 = rVarN.g().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                i0Var = new i0(mVarI0, null);
                                break;
                            }
                            C0772h c0772h = (C0772h) it2.next();
                            if (p032f2.c.g0(fVar, c0772h)) {
                                if (c0772h.f9547l.getParameterCount() == 1) {
                                    Method method = c0772h.f9547l;
                                    if (method.getReturnType().isAssignableFrom(cls)) {
                                        if (c0772h.A(0) == String.class) {
                                            if (c0474e2.k(p015c2.r.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                                                p109u2.i.e(method, c0474e2.k(p015c2.r.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                                            }
                                            i0Var = new i0(mVarI0, c0772h);
                                            break;
                                        }
                                    }
                                }
                                throw new IllegalArgumentException("Unsuitable method (" + c0772h + ") decorated with @JsonCreator (for Enum type " + cls.getName() + ")");
                            }
                        }
                    } else {
                        i0Var = new h0(cls, jVarK0);
                    }
                    qVarL0 = i0Var;
                }
                kVar = kVar3;
                th = null;
                A5 = qVarL0;
            } else {
                r rVarO = c0474e.o(hVar);
                C0766b c0766b2 = rVarO.f9566e;
                List<C0767c> list2 = (List) c0766b2.m().f394j;
                boolean zIsEmpty = list2.isEmpty();
                EnumC0348j enumC0348j = EnumC0348j.f4952k;
                n nVar = rVarO.f9564c;
                B b6 = rVarO.f9565d;
                if (zIsEmpty) {
                    list = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C0767c c0767c : list2) {
                        th2 = th2;
                        EnumC0348j enumC0348jE = b6.e(nVar, c0767c);
                        if (enumC0348jE != enumC0348j) {
                            arrayList.add(new C0765a(c0767c, enumC0348jE));
                        }
                    }
                    list = arrayList;
                }
                th = th2;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        r7 = th;
                        break;
                    }
                    r7 = (C0765a) it3.next();
                    C0767c c0767c2 = (C0767c) r7.f9522a;
                    if (c0767c2.f9538l.getParameterCount() == 1 && String.class == c0767c2.A(0)) {
                        break;
                    }
                }
                if (r7 == 0 || r7.f9523b == null) {
                    List list3 = (List) c0766b2.m().f395k;
                    if (list3.isEmpty()) {
                        kVar = kVar3;
                        r6 = Collections.EMPTY_LIST;
                    } else {
                        Iterator it4 = list3.iterator();
                        ?? arrayList2 = th;
                        while (it4.hasNext()) {
                            C0772h c0772h2 = (C0772h) it4.next();
                            if (rVarO.f9562a.f7281k.isAssignableFrom(c0772h2.f9547l.getReturnType())) {
                                EnumC0348j enumC0348jE2 = b6.e(nVar, c0772h2);
                                if (enumC0348jE2 != null) {
                                    if (enumC0348jE2 == enumC0348j) {
                                        c0765a = th;
                                    } else {
                                        c0765a = new C0765a(c0772h2, enumC0348jE2);
                                    }
                                    kVar2 = kVar3;
                                    rVar = rVarO;
                                    it = it4;
                                } else {
                                    Method method2 = c0772h2.f9547l;
                                    kVar2 = kVar3;
                                    String name = method2.getName();
                                    rVar = rVarO;
                                    if ("valueOf".equals(name)) {
                                        it = it4;
                                        i = 1;
                                        if (method2.getParameterCount() == 1) {
                                            c0765a = new C0765a(c0772h2, enumC0348jE2);
                                        }
                                    } else {
                                        it = it4;
                                        i = 1;
                                    }
                                    c0765a = ("fromString".equals(name) && method2.getParameterCount() == i && ((clsA = c0772h2.A(0)) == String.class || CharSequence.class.isAssignableFrom(clsA))) ? new C0765a(c0772h2, enumC0348jE2) : th;
                                }
                            } else {
                                c0765a = th;
                                kVar2 = kVar3;
                                rVar = rVarO;
                                it = it4;
                            }
                            if (c0765a != null) {
                                if (arrayList2 == 0) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(c0765a);
                            }
                            kVar3 = kVar2;
                            rVarO = rVar;
                            it4 = it;
                            arrayList2 = arrayList2;
                        }
                        kVar = kVar3;
                        r6 = arrayList2 == 0 ? Collections.EMPTY_LIST : arrayList2;
                    }
                    r6.removeIf(new m0());
                    ?? r8 = th;
                    for (C0765a c0765a2 : r6) {
                        if (c0765a2.f9523b != null) {
                            p046i2.m mVar = c0765a2.f9522a;
                            if (r8 != 0) {
                                throw new IllegalArgumentException("Multiple suitable annotated Creator factory methods to be used as the Key deserializer for type " + p109u2.i.z(((C0772h) mVar).f9547l.getDeclaringClass()));
                            }
                            r8 = (C0772h) mVar;
                        }
                    }
                    if (r8 != 0) {
                        l0VarA = l.a(c0474e, r8);
                    } else if (r7 != 0) {
                        l0VarA = l.a(c0474e, r7.f9522a);
                    } else if (r6.isEmpty()) {
                        A5 = th;
                    } else {
                        l0VarA = l.a(c0474e, ((C0765a) r6.get(0)).f9522a);
                    }
                    A5 = l0VarA;
                } else {
                    A5 = l.a(c0474e, r7.f9522a);
                    kVar = kVar3;
                }
            }
        }
        if (A5 != 0 && kVar.c()) {
            C0965d c0965dA = kVar.a();
            if (c0965dA.hasNext()) {
                throw p012c.k.q(c0965dA);
            }
        }
        if (A5 != 0) {
            if (A5 instanceof p032f2.m) {
                ((p032f2.m) A5).b(fVar);
            }
            return A5;
        }
        fVar.O("Cannot find a (Map) Key deserializer for type " + hVar);
        throw th;
    }

    @Override // T1.m
    public void a(Y1.f fVar) {
        String str = (String) this.i;
        if (str != null) {
            fVar.i0(str);
        }
    }

    @Override // T1.m
    public void b(Y1.f fVar, int i) {
        fVar.M0(']');
    }

    @Override // T1.m
    public void c(Y1.f fVar) {
    }

    @Override // p109u2.InterfaceC0963b
    public Annotation d(Class cls) {
        if (((Class) this.i) == cls) {
            return (Annotation) this.f7081j;
        }
        return null;
    }

    @Override // T1.m
    public void e(Y1.f fVar) {
        ((l) this.f7081j).getClass();
        fVar.M0(',');
    }

    @Override // T1.m
    public void f(Y1.f fVar) {
    }

    @Override // T1.m
    public void g(Y1.f fVar) {
        ((l) this.f7081j).getClass();
        fVar.M0(':');
    }

    @Override // p084p4.f
    public Object getValue() {
        if (this.f7081j == u.f10864a) {
            a aVar = (a) this.i;
            E4.k.c(aVar);
            this.f7081j = aVar.invoke();
            this.i = null;
        }
        return this.f7081j;
    }

    @Override // T1.m
    public void h(Y1.f fVar, int i) {
        fVar.M0('}');
    }

    @Override // T1.m
    public void i(Y1.f fVar) {
        ((l) this.f7081j).getClass();
        fVar.M0(',');
    }

    @Override // T1.m
    public void j(Y1.f fVar) {
        fVar.M0('{');
    }

    @Override // T1.m
    public void k(Y1.f fVar) {
        fVar.M0('[');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j l(p015c2.f fVar, g gVar, h hVar) throws InvalidDefinitionException {
        try {
            j jVarM = m(fVar, gVar, hVar);
            if (jVarM == 0) {
                return null;
            }
            boolean z5 = !o(hVar) && jVarM.isCachable();
            if (jVarM instanceof p032f2.m) {
                HashMap map = (HashMap) this.f7081j;
                map.put(hVar, jVarM);
                ((p032f2.m) jVarM).b(fVar);
                map.remove(hVar);
            }
            if (z5) {
                ((o) ((p109u2.n) this.i).f12708h).g(hVar, jVarM, false);
            }
            return jVarM;
        } catch (IllegalArgumentException e6) {
            fVar.O(p109u2.i.i(e6));
            throw null;
        }
    }

    public j r(p015c2.f fVar, g gVar, h hVar) throws InvalidDefinitionException {
        j jVar;
        j jVar2;
        if (hVar == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        }
        j jVar3 = o(hVar) ? null : (j) ((o) ((p109u2.n) this.i).f12708h).get(hVar);
        if (jVar3 != null) {
            return jVar3;
        }
        synchronized (((HashMap) this.f7081j)) {
            try {
                jVar = o(hVar) ? null : (j) ((o) ((p109u2.n) this.i).f12708h).get(hVar);
                if (jVar == null) {
                    int size = ((HashMap) this.f7081j).size();
                    if (size <= 0 || (jVar2 = (j) ((HashMap) this.f7081j).get(hVar)) == null) {
                        try {
                            j jVarL = l(fVar, gVar, hVar);
                            if (size == 0 && ((HashMap) this.f7081j).size() > 0) {
                                ((HashMap) this.f7081j).clear();
                            }
                            jVar = jVarL;
                        } catch (Throwable th) {
                            if (size == 0 && ((HashMap) this.f7081j).size() > 0) {
                                ((HashMap) this.f7081j).clear();
                            }
                            throw th;
                        }
                    } else {
                        jVar = jVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            return jVar;
        }
        Class cls = hVar.f7281k;
        Annotation[] annotationArr = p109u2.i.f12697a;
        if ((cls.getModifiers() & 1536) == 0) {
            fVar.O("Cannot find a Value deserializer for type " + hVar);
            throw null;
        }
        fVar.O("Cannot find a Value deserializer for abstract type " + hVar);
        throw null;
    }

    public boolean s(Object obj) {
        Set set = (Set) this.f7081j;
        return !(set == null || set.contains(obj)) || ((Set) this.i).contains(obj);
    }

    @Override // p109u2.InterfaceC0963b
    public int size() {
        return 1;
    }

    public String toString() {
        switch (this.f7080h) {
            case 3:
                return this.f7081j != u.f10864a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
            default:
                return super.toString();
        }
    }

    public k(Class cls, T1.n[] nVarArr) {
        this.f7080h = 4;
        this.i = cls;
        this.f7081j = nVarArr;
    }

    public k() {
        this.f7080h = 1;
        this.f7081j = new HashMap(8);
        this.i = new p109u2.n(Math.min(64, 500), 2000);
    }

    public k(Set set, Set set2) {
        this.f7080h = 5;
        this.i = set == null ? Collections.EMPTY_SET : set;
        this.f7081j = set2;
    }

    public k(Class cls, Annotation annotation) {
        this.f7080h = 2;
        this.i = cls;
        this.f7081j = annotation;
    }
}
