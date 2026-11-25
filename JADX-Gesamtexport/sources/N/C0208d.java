package N;

import B.AbstractC0013g0;
import B.C0018j;
import B.C0031p0;
import O.C0304a;
import P4.AbstractC0336x;
import P4.C0332t;
import S4.InterfaceC0368e;
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: N.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0208d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0205b0 f3687a = new C0205b0("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0205b0 f3688b = new C0205b0("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0205b0 f3689c = new C0205b0("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0205b0 f3690d = new C0205b0("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0205b0 f3691e = new C0205b0("reference");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D3.k f3692f = new D3.k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f3693g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G f3694h = new G();

    public static final void A(G0 g6, C0237s c0237s) {
        int i;
        int iC;
        int iO;
        int i3 = g6.f3607t;
        int i6 = g6.f3608u;
        while (i3 < i6) {
            Object objW = g6.w(i3);
            if (objW instanceof InterfaceC0220j) {
                c0237s.h((InterfaceC0220j) objW, g6.o() - g6.E(g6.f3590b, g6.p(i3)), -1, -1);
            }
            int iE = g6.E(g6.f3590b, g6.p(i3));
            int i7 = i3 + 1;
            int iF = g6.f(g6.f3590b, g6.p(i7));
            int i8 = iE;
            while (i8 < iF) {
                int i9 = i8 - iE;
                Object obj = g6.f3591c[g6.g(i8)];
                boolean z5 = obj instanceof C0252z0;
                U u6 = C0222k.f3714a;
                if (z5) {
                    C0252z0 c0252z0 = (C0252z0) obj;
                    InterfaceC0250y0 interfaceC0250y0 = c0252z0.f3874a;
                    if (interfaceC0250y0 instanceof C0224l) {
                        i = i6;
                    } else {
                        int iG = g6.g(g6.F(i3, i9));
                        Object[] objArr = g6.f3591c;
                        i = i6;
                        Object obj2 = objArr[iG];
                        objArr[iG] = u6;
                        if (obj != obj2) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        int iO2 = g6.o() - i9;
                        C0206c c0206c = c0252z0.f3875b;
                        if (c0206c == null || !c0206c.a()) {
                            iC = -1;
                            iO = -1;
                        } else {
                            iC = g6.c(c0206c);
                            iO = g6.o() - g6.f(g6.f3590b, g6.p(g6.q(iC) + iC));
                        }
                        c0237s.h(interfaceC0250y0, iO2, iC, iO);
                    }
                } else {
                    i = i6;
                    if (obj instanceof C0235q0) {
                        int iG2 = g6.g(g6.F(i3, i9));
                        Object[] objArr2 = g6.f3591c;
                        Object obj3 = objArr2[iG2];
                        objArr2[iG2] = u6;
                        if (obj != obj3) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        ((C0235q0) obj).d();
                    } else {
                        continue;
                    }
                }
                i8++;
                i6 = i;
            }
            i3 = i7;
        }
    }

    public static final P.d B() {
        C0031p0 c0031p0 = M0.f3631b;
        P.d dVar = (P.d) c0031p0.get();
        if (dVar != null) {
            return dVar;
        }
        P.d dVar2 = new P.d(new C0228n[0]);
        c0031p0.s(dVar2);
        return dVar2;
    }

    public static final D C(D4.a aVar) {
        C0031p0 c0031p0 = M0.f3630a;
        return new D(aVar);
    }

    public static final int D(int i, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i6 = (i3 + size) >>> 1;
            int iH = E4.k.h(((M) arrayList.get(i6)).f3628b, i);
            if (iH < 0) {
                i3 = i6 + 1;
            } else {
                if (iH <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int E(C0230o c0230o) {
        return c0230o.f3744P;
    }

    public static final V F(p111u4.i iVar) {
        V v6 = (V) iVar.J(U.i);
        if (v6 != null) {
            return v6;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void G(C0230o c0230o, D4.e eVar) {
        E4.k.d("null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>", eVar);
        E4.z.d(2, eVar);
        eVar.d(c0230o, 1);
    }

    public static List H(G0 g6, int i, G0 g7, boolean z5, boolean z6, boolean z7) {
        List list;
        boolean zB;
        C0206c c0206cI;
        int iQ = g6.q(i);
        int i3 = i + iQ;
        int iF = g6.f(g6.f3590b, g6.p(i));
        int iF2 = g6.f(g6.f3590b, g6.p(i3));
        int i6 = iF2 - iF;
        boolean z8 = i >= 0 && (g6.f3590b[(g6.p(i) * 5) + 1] & 201326592) != 0;
        g7.r(iQ);
        g7.s(i6, g7.f3607t);
        if (g6.f3595g < i3) {
            g6.u(i3);
        }
        if (g6.f3598k < iF2) {
            g6.v(iF2, i3);
        }
        int[] iArr = g7.f3590b;
        int i7 = g7.f3607t;
        int i8 = i7 * 5;
        p089q4.k.c0(i8, i * 5, i3 * 5, g6.f3590b, iArr);
        Object[] objArr = g7.f3591c;
        int i9 = g7.i;
        p089q4.k.e0(g6.f3591c, objArr, i9, iF, iF2);
        int i10 = g7.f3609v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i;
        int i12 = i7 + iQ;
        int iF3 = i9 - g7.f(iArr, i7);
        int i13 = g7.f3600m;
        int i14 = g7.f3599l;
        int length = objArr.length;
        boolean z9 = z8;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int i18 = i11;
            iArr[(i16 * 5) + 4] = G0.h(g7.f(iArr, i16) + iF3, i15 < i16 ? 0 : g7.f3598k, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i12 = i12;
            i11 = i18;
        }
        int i19 = i11;
        int i20 = i12;
        g7.f3600m = i15;
        int iN = n(g6.f3592d, i, g6.n());
        int iN2 = n(g6.f3592d, i3, g6.n());
        if (iN < iN2) {
            ArrayList arrayList = g6.f3592d;
            ArrayList arrayList2 = new ArrayList(iN2 - iN);
            for (int i21 = iN; i21 < iN2; i21++) {
                C0206c c0206c = (C0206c) arrayList.get(i21);
                c0206c.f3685a += i19;
                arrayList2.add(c0206c);
            }
            g7.f3592d.addAll(n(g7.f3592d, g7.f3607t, g7.n()), arrayList2);
            arrayList.subList(iN, iN2).clear();
            list = arrayList2;
        } else {
            list = p089q4.u.f11237h;
        }
        if (!list.isEmpty()) {
            HashMap map = g6.f3593e;
            HashMap map2 = g7.f3593e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i22 = 0; i22 < size; i22++) {
                }
            }
        }
        int i23 = g7.f3609v;
        HashMap map3 = g7.f3593e;
        if (map3 != null && (c0206cI = g7.I(i10)) != null) {
        }
        int iX = g6.x(g6.f3590b, i);
        if (!z7) {
            zB = false;
        } else if (z5) {
            boolean z10 = iX >= 0;
            if (z10) {
                g6.G();
                g6.a(iX - g6.f3607t);
                g6.G();
            }
            g6.a(i - g6.f3607t);
            boolean zA = g6.A();
            if (z10) {
                g6.D();
                g6.i();
                g6.D();
                g6.i();
            }
            zB = zA;
        } else {
            zB = g6.B(i, iQ);
            g6.C(iF, i6, i - 1);
        }
        if (zB) {
            w("Unexpectedly removed anchors");
            throw null;
        }
        g7.f3602o += m(iArr, i7) ? 1 : o(iArr, i7);
        if (z6) {
            g7.f3607t = i20;
            g7.i = i9 + i6;
        }
        if (z9) {
            g7.K(i10);
        }
        return list;
    }

    public static final C0209d0 I(float f6) {
        int i = AbstractC0204b.f3683b;
        return new C0209d0(f6);
    }

    public static final C0211e0 J(int i) {
        int i3 = AbstractC0204b.f3683b;
        return new C0211e0(i);
    }

    public static final C0217h0 K(Object obj, L0 l6) {
        int i = AbstractC0204b.f3683b;
        return new C0217h0(obj, l6);
    }

    public static final Object L(InterfaceC0225l0 interfaceC0225l0, AbstractC0231o0 abstractC0231o0) {
        E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>", abstractC0231o0);
        V.e eVar = (V.e) interfaceC0225l0;
        Object objB = eVar.get(abstractC0231o0);
        if (objB == null) {
            objB = abstractC0231o0.b();
        }
        return ((Y0) objB).a(eVar);
    }

    public static final C0226m M(C0230o c0230o) throws Throwable {
        C0230o c0230o2;
        c0230o.S(206, f3691e);
        if (c0230o.f3743O) {
            G0 g6 = c0230o.H;
            int i = g6.f3609v;
            int iP = g6.p(i);
            int[] iArr = g6.f3590b;
            int i3 = (iP * 5) + 1;
            int i6 = iArr[i3];
            if ((i6 & 134217728) == 0) {
                iArr[i3] = i6 | 134217728;
                if (!h(iArr, iP)) {
                    g6.K(g6.x(g6.f3590b, i));
                }
            }
        }
        Object objD = c0230o.D();
        C0224l c0224l = objD instanceof C0224l ? (C0224l) objD : null;
        if (c0224l == null) {
            c0230o2 = c0230o;
            c0224l = new C0224l(new C0226m(c0230o2, c0230o.f3744P, c0230o.f3759p, c0230o.f3734B, c0230o.f3751g.f3814w));
            c0230o2.g0(c0224l);
        } else {
            c0230o2 = c0230o;
        }
        InterfaceC0225l0 interfaceC0225l0M = c0230o2.m();
        C0226m c0226m = c0224l.f3721h;
        c0226m.f3727f.setValue(interfaceC0225l0M);
        c0230o2.p(false);
        return c0226m;
    }

    public static final InterfaceC0203a0 N(Object obj, C0230o c0230o) {
        Object objK = c0230o.K();
        if (objK == C0222k.f3714a) {
            objK = K(obj, U.f3673m);
            c0230o.f0(objK);
        }
        InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK;
        interfaceC0203a0.setValue(obj);
        return interfaceC0203a0;
    }

    public static final void O(G0 g6, C0237s c0237s) {
        int iO;
        int[] iArr = g6.f3590b;
        int i = g6.f3607t;
        int iF = g6.f(iArr, g6.p(g6.q(i) + i));
        for (int iF2 = g6.f(g6.f3590b, g6.p(g6.f3607t)); iF2 < iF; iF2++) {
            Object obj = g6.f3591c[g6.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC0220j) {
                int iO2 = g6.o() - iF2;
                InterfaceC0220j interfaceC0220j = (InterfaceC0220j) obj;
                p080p.A a6 = (p080p.A) c0237s.f3797g;
                if (a6 == null) {
                    int i3 = p080p.D.f10715a;
                    a6 = new p080p.A();
                    c0237s.f3797g = a6;
                }
                a6.f10709b[a6.d(interfaceC0220j)] = interfaceC0220j;
                c0237s.h(interfaceC0220j, iO2, -1, -1);
            }
            if (obj instanceof C0252z0) {
                int iO3 = g6.o() - iF2;
                C0252z0 c0252z0 = (C0252z0) obj;
                C0206c c0206c = c0252z0.f3875b;
                if (c0206c == null || !c0206c.a()) {
                    iO = -1;
                } else {
                    iC = g6.c(c0206c);
                    iO = g6.o() - g6.f(g6.f3590b, g6.p(g6.q(iC) + iC));
                }
                c0237s.h(c0252z0.f3874a, iO3, iC, iO);
            }
            if (obj instanceof C0235q0) {
                ((C0235q0) obj).d();
            }
        }
        g6.A();
    }

    public static final void P(boolean z5) {
        if (z5) {
            return;
        }
        w("Check failed");
        throw null;
    }

    public static final int Q(ArrayList arrayList, int i, int i3) {
        int size = arrayList.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            int i8 = ((C0206c) arrayList.get(i7)).f3685a;
            if (i8 < 0) {
                i8 += i3;
            }
            int iH = E4.k.h(i8, i);
            if (iH < 0) {
                i6 = i7 + 1;
            } else {
                if (iH <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static final void R(D4.e eVar, C0230o c0230o, Object obj) {
        if (c0230o.f3743O || !E4.k.a(c0230o.K(), obj)) {
            c0230o.f0(obj);
            c0230o.b(obj, eVar);
        }
    }

    public static final void S(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void T(String str) {
        throw new IllegalStateException(str);
    }

    public static final X.s U(List list) {
        X.s sVar = new X.s();
        sVar.addAll(list);
        return sVar;
    }

    public static final int V(int i) {
        int i3 = 306783378 & i;
        int i6 = 613566756 & i;
        return (i & (-920350135)) | (i6 >> 1) | i3 | ((i3 << 1) & i6);
    }

    public static final V.e W(C0233p0[] c0233p0Arr, InterfaceC0225l0 interfaceC0225l0, InterfaceC0225l0 interfaceC0225l1) {
        V.e eVar = V.e.f5395k;
        V.d dVar = new V.d(eVar);
        dVar.f5394n = eVar;
        for (C0233p0 c0233p0 : c0233p0Arr) {
            AbstractC0231o0 abstractC0231o0 = c0233p0.f3771a;
            if (c0233p0.f3776f || !((V.e) interfaceC0225l0).containsKey(abstractC0231o0)) {
                dVar.put(abstractC0231o0, abstractC0231o0.c(c0233p0, (Y0) ((V.e) interfaceC0225l1).get(abstractC0231o0)));
            }
        }
        return dVar.d();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(C0233p0 c0233p0, D4.e eVar, C0230o c0230o, int i) throws Throwable {
        Y0 y2;
        InterfaceC0225l0 eVar2;
        boolean z5;
        InterfaceC0225l0 interfaceC0225l0;
        C0235q0 c0235q0T;
        InterfaceC0225l0 interfaceC0225l1;
        V.e eVar3;
        K3.e eVarU;
        InterfaceC0225l0 eVar4;
        c0230o.X(-1350970552);
        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
        c0230o.S(201, f3688b);
        Object objK = c0230o.K();
        if (E4.k.a(objK, C0222k.f3714a)) {
            y2 = null;
        } else {
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>", objK);
            y2 = (Y0) objK;
        }
        AbstractC0231o0 abstractC0231o0 = c0233p0.f3771a;
        Object objC = abstractC0231o0.c(c0233p0, y2);
        boolean zEquals = objC.equals(y2);
        if (!zEquals) {
            c0230o.f0(objC);
        }
        if (!c0230o.f3743O) {
            D0 d1 = c0230o.f3738F;
            Object objB = d1.b(d1.f3565b, d1.f3570g);
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", objB);
            InterfaceC0225l0 interfaceC0225l2 = (InterfaceC0225l0) objB;
            if (!(c0230o.B() && zEquals) && (c0233p0.f3776f || !((V.e) interfaceC0225l0M).containsKey(abstractC0231o0))) {
                V.e eVar5 = (V.e) interfaceC0225l0M;
                eVar5.getClass();
                K3.e eVarU2 = eVar5.f4857h.u(abstractC0231o0.hashCode(), 0, abstractC0231o0, objC);
                eVar2 = eVar5;
                if (eVarU2 != null) {
                    eVar2 = new V.e((S.n) eVarU2.f2139c, eVar5.i + eVarU2.f2138b);
                }
            } else {
                eVar2 = interfaceC0225l2;
            }
            interfaceC0225l1 = eVar2;
            if (c0230o.f3767x || interfaceC0225l2 != eVar2) {
                z5 = true;
                interfaceC0225l0 = eVar2;
            }
            if (z5 && !c0230o.f3743O) {
                c0230o.I(interfaceC0225l0);
            }
            boolean z6 = c0230o.f3765v;
            L l6 = c0230o.f3766w;
            l6.b(z6 ? 1 : 0);
            c0230o.f3765v = z5;
            c0230o.J = interfaceC0225l0;
            c0230o.Q(202, 0, f3689c, interfaceC0225l0);
            eVar.d(c0230o, Integer.valueOf((i >> 3) & 14));
            c0230o.p(false);
            c0230o.p(false);
            c0230o.f3765v = l6.a() != 0;
            c0230o.J = null;
            c0235q0T = c0230o.t();
            if (c0235q0T != null) {
                c0235q0T.f3780d = new C0018j(i, 4, c0233p0, eVar);
            }
        }
        if (c0233p0.f3776f) {
            eVar3 = (V.e) interfaceC0225l0M;
            eVar3.getClass();
            eVarU = eVar3.f4857h.u(abstractC0231o0.hashCode(), 0, abstractC0231o0, objC);
            eVar4 = eVar3;
            if (eVarU != null) {
                eVar4 = new V.e((S.n) eVarU.f2139c, eVar3.i + eVarU.f2138b);
            }
        } else {
            boolean zContainsKey = ((V.e) interfaceC0225l0M).containsKey(abstractC0231o0);
            eVar4 = interfaceC0225l0M;
            if (!zContainsKey) {
                eVar3 = (V.e) interfaceC0225l0M;
                eVar3.getClass();
                eVarU = eVar3.f4857h.u(abstractC0231o0.hashCode(), 0, abstractC0231o0, objC);
                eVar4 = eVar3;
                if (eVarU != null) {
                    eVar4 = new V.e((S.n) eVarU.f2139c, eVar3.i + eVarU.f2138b);
                }
            }
        }
        c0230o.I = true;
        interfaceC0225l1 = eVar4;
        z5 = false;
        interfaceC0225l0 = interfaceC0225l1;
        if (z5) {
            c0230o.I(interfaceC0225l0);
        }
        boolean z7 = c0230o.f3765v;
        L l7 = c0230o.f3766w;
        l7.b(z7 ? 1 : 0);
        c0230o.f3765v = z5;
        c0230o.J = interfaceC0225l0;
        c0230o.Q(202, 0, f3689c, interfaceC0225l0);
        eVar.d(c0230o, Integer.valueOf((i >> 3) & 14));
        c0230o.p(false);
        c0230o.p(false);
        c0230o.f3765v = l7.a() != 0;
        c0230o.J = null;
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 4, c0233p0, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(C0233p0[] c0233p0Arr, D4.e eVar, C0230o c0230o, int i) {
        InterfaceC0225l0 interfaceC0225l0E0;
        boolean z5;
        C0235q0 c0235q0T;
        c0230o.X(-1390796515);
        InterfaceC0225l0 interfaceC0225l0M = c0230o.m();
        c0230o.S(201, f3688b);
        if (c0230o.f3743O) {
            interfaceC0225l0E0 = c0230o.e0(interfaceC0225l0M, W(c0233p0Arr, interfaceC0225l0M, V.e.f5395k));
            c0230o.I = true;
        } else {
            D0 d1 = c0230o.f3738F;
            Object objG = d1.g(d1.f3570g, 0);
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", objG);
            InterfaceC0225l0 interfaceC0225l0 = (InterfaceC0225l0) objG;
            D0 d6 = c0230o.f3738F;
            Object objG2 = d6.g(d6.f3570g, 1);
            E4.k.d("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", objG2);
            InterfaceC0225l0 interfaceC0225l1 = (InterfaceC0225l0) objG2;
            V.e eVarW = W(c0233p0Arr, interfaceC0225l0M, interfaceC0225l1);
            if (!c0230o.B() || c0230o.f3767x || !interfaceC0225l1.equals(eVarW)) {
                interfaceC0225l0E0 = c0230o.e0(interfaceC0225l0M, eVarW);
                if (c0230o.f3767x || !E4.k.a(interfaceC0225l0E0, interfaceC0225l0)) {
                    z5 = true;
                }
                if (z5 && !c0230o.f3743O) {
                    c0230o.I(interfaceC0225l0E0);
                }
                boolean z6 = c0230o.f3765v;
                L l6 = c0230o.f3766w;
                l6.b(z6 ? 1 : 0);
                c0230o.f3765v = z5;
                c0230o.J = interfaceC0225l0E0;
                c0230o.Q(202, 0, f3689c, interfaceC0225l0E0);
                eVar.d(c0230o, Integer.valueOf((i >> 3) & 14));
                c0230o.p(false);
                c0230o.p(false);
                c0230o.f3765v = l6.a() != 0;
                c0230o.J = null;
                c0235q0T = c0230o.t();
                if (c0235q0T != null) {
                    c0235q0T.f3780d = new C0018j(i, 3, c0233p0Arr, eVar);
                }
            }
            c0230o.f3754k = c0230o.f3738F.l() + c0230o.f3754k;
            interfaceC0225l0E0 = interfaceC0225l0;
        }
        z5 = false;
        if (z5) {
            c0230o.I(interfaceC0225l0E0);
        }
        boolean z7 = c0230o.f3765v;
        L l7 = c0230o.f3766w;
        l7.b(z7 ? 1 : 0);
        c0230o.f3765v = z5;
        c0230o.J = interfaceC0225l0E0;
        c0230o.Q(202, 0, f3689c, interfaceC0225l0E0);
        eVar.d(c0230o, Integer.valueOf((i >> 3) & 14));
        c0230o.p(false);
        c0230o.p(false);
        c0230o.f3765v = l7.a() != 0;
        c0230o.J = null;
        c0235q0T = c0230o.t();
        if (c0235q0T != null) {
            c0235q0T.f3780d = new C0018j(i, 3, c0233p0Arr, eVar);
        }
    }

    public static final void c(Object obj, D4.c cVar, C0230o c0230o) {
        boolean zF = c0230o.f(obj);
        Object objK = c0230o.K();
        if (zF || objK == C0222k.f3714a) {
            objK = new E(cVar);
            c0230o.f0(objK);
        }
    }

    public static final void d(Object obj, Object obj2, D4.c cVar, C0230o c0230o) {
        boolean zF = c0230o.f(obj) | c0230o.f(obj2);
        Object objK = c0230o.K();
        if (zF || objK == C0222k.f3714a) {
            objK = new E(cVar);
            c0230o.f0(objK);
        }
    }

    public static final void e(D4.e eVar, C0230o c0230o, Object obj) {
        p111u4.i iVarH = c0230o.f3746b.h();
        boolean zF = c0230o.f(obj);
        Object objK = c0230o.K();
        if (zF || objK == C0222k.f3714a) {
            objK = new Q(iVarH, eVar);
            c0230o.f0(objK);
        }
    }

    public static final void f(Object obj, Object obj2, D4.e eVar, C0230o c0230o) {
        p111u4.i iVarH = c0230o.f3746b.h();
        boolean zF = c0230o.f(obj) | c0230o.f(obj2);
        Object objK = c0230o.K();
        if (zF || objK == C0222k.f3714a) {
            objK = new Q(iVarH, eVar);
            c0230o.f0(objK);
        }
    }

    public static final void g(D4.a aVar, C0230o c0230o) {
        C0304a c0304a = c0230o.f3740L.f4351b;
        c0304a.getClass();
        O.v vVar = O.v.f4385c;
        O.D d6 = c0304a.f4349j;
        d6.M0(vVar);
        p020d2.n.M(d6, 0, aVar);
        int i = d6.f4347p;
        int i3 = vVar.f4339a;
        int iF0 = O.D.F0(d6, i3);
        int i6 = vVar.f4340b;
        if (i == iF0 && d6.f4348q == O.D.F0(d6, i6)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            if (((1 << i8) & d6.f4347p) != 0) {
                if (i7 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.b(i8));
                i7++;
            }
        }
        String string = sb.toString();
        StringBuilder sbN = AbstractC0013g0.n(string, "StringBuilder().apply(builderAction).toString()");
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            if (((1 << i10) & d6.f4348q) != 0) {
                if (i7 > 0) {
                    sbN.append(", ");
                }
                sbN.append(vVar.c(i10));
                i9++;
            }
        }
        String string2 = sbN.toString();
        E4.k.e("StringBuilder().apply(builderAction).toString()", string2);
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(vVar);
        sb2.append(". Not all arguments were provided. Missing ");
        AbstractC0013g0.s(sb2, i7, " int arguments (", string, ") and ");
        AbstractC0013g0.u(sb2, i9, " object arguments (", string2, ").");
        throw null;
    }

    public static final boolean h(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int j(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final boolean k(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i, int i3) {
        int iQ = Q(arrayList, i, i3);
        return iQ >= 0 ? iQ : -(iQ + 1);
    }

    public static final int o(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int p(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final void q(ArrayList arrayList, int i, int i3) {
        int iD = D(i, arrayList);
        if (iD < 0) {
            iD = -(iD + 1);
        }
        while (iD < arrayList.size() && ((M) arrayList.get(iD)).f3628b < i3) {
            arrayList.remove(iD);
        }
    }

    public static final int r(int[] iArr, int i) {
        int i3 = i * 5;
        int i6 = iArr[i3 + 4];
        int i7 = 1;
        switch (iArr[i3 + 1] >> 28) {
            case 0:
                i7 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        return i7 + i6;
    }

    public static final void s(int i, int i3, int[] iArr) {
        P(i3 >= 0);
        iArr[(i * 5) + 3] = i3;
    }

    public static final void t(int i, int i3, int[] iArr) {
        P(i3 >= 0 && i3 < 67108863);
        int i6 = (i * 5) + 1;
        iArr[i6] = i3 | (iArr[i6] & (-67108864));
    }

    public static final InterfaceC0203a0 u(InterfaceC0368e interfaceC0368e, Object obj, p111u4.i iVar, C0230o c0230o, int i, int i3) {
        if ((i3 & 2) != 0) {
            iVar = p111u4.j.f12751h;
        }
        boolean zH = c0230o.h(iVar) | c0230o.h(interfaceC0368e);
        Object objK = c0230o.K();
        Object obj2 = C0222k.f3714a;
        if (zH || objK == obj2) {
            objK = new R0(iVar, interfaceC0368e, null);
            c0230o.f0(objK);
        }
        D4.e eVar = (D4.e) objK;
        Object objK2 = c0230o.K();
        if (objK2 == obj2) {
            objK2 = K(obj, U.f3673m);
            c0230o.f0(objK2);
        }
        InterfaceC0203a0 interfaceC0203a0 = (InterfaceC0203a0) objK2;
        boolean zH2 = c0230o.h(eVar);
        Object objK3 = c0230o.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new O0(eVar, interfaceC0203a0, null);
            c0230o.f0(objK3);
        }
        f(interfaceC0368e, iVar, (D4.e) objK3, c0230o);
        return interfaceC0203a0;
    }

    public static final InterfaceC0203a0 v(S4.z zVar, C0230o c0230o) {
        return u(zVar, zVar.getValue(), p111u4.j.f12751h, c0230o, 0, 0);
    }

    public static final void w(String str) {
        throw new ComposeRuntimeError(AbstractC0013g0.i("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void x(String str) {
        throw new ComposeRuntimeError(AbstractC0013g0.i("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final U4.d y(C0230o c0230o) {
        p111u4.j jVar = p111u4.j.f12751h;
        C0332t c0332t = C0332t.i;
        p111u4.i iVarH = c0230o.f3746b.h();
        return AbstractC0336x.a(iVarH.o(new P4.V((P4.T) iVarH.J(c0332t))).o(jVar));
    }

    public static final long z() {
        return Thread.currentThread().getId();
    }
}
