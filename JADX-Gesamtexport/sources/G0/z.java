package G0;

import com.fasterxml.jackson.databind.deser.std.d0;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class z extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1595h;
    public static final z i = new z(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final z f1578j = new z(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z f1579k = new z(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f1580l = new z(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final z f1581m = new z(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final z f1582n = new z(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final z f1583o = new z(1, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final z f1584p = new z(1, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final z f1585q = new z(1, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z f1586r = new z(1, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final z f1587s = new z(1, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final z f1588t = new z(1, 11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final z f1589u = new z(1, 12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final z f1590v = new z(1, 13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z f1591w = new z(1, 14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final z f1592x = new z(1, 15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final z f1593y = new z(1, 16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final z f1594z = new z(1, 17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final z f1574A = new z(1, 18);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final z f1575B = new z(1, 19);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final z f1576C = new z(1, 20);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final z f1577D = new z(1, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i3, int i6) {
        super(i3);
        this.f1595h = i6;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r2v50, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r3v29, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r3v32, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r3v55, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r4v40, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r5v20, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r5v31, types: [D4.c, E4.l] */
    /* JADX WARN: Type inference failed for: r8v6, types: [D4.c, E4.l] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        int i3 = 0;
        List list = null;
        c = null;
        C c6 = null;
        mVar = null;
        S0.m mVar = null;
        l = null;
        p035g0.L l6 = null;
        pVar = null;
        R0.p pVar = null;
        h = null;
        H h6 = null;
        h = null;
        H h7 = null;
        c0114j = null;
        C0114j c0114j = null;
        c0115k = null;
        C0115k c0115k = null;
        k = null;
        K k3 = null;
        l = null;
        L l7 = null;
        c = null;
        C c7 = null;
        tVar = null;
        t tVar = null;
        list = null;
        switch (this.f1595h) {
            case 0:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list2 = (List) obj;
                Object obj2 = list2.get(1);
                D.x xVar = B.f1409a;
                Boolean bool = Boolean.FALSE;
                List list3 = (E4.k.a(obj2, bool) || obj2 == null) ? null : (List) ((D4.c) xVar.f707j).invoke(obj2);
                Object obj3 = list2.get(2);
                List list4 = (E4.k.a(obj3, bool) || obj3 == null) ? null : (List) ((D4.c) xVar.f707j).invoke(obj3);
                Object obj4 = list2.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                E4.k.c(str);
                if (list3 == null || list3.isEmpty()) {
                    list3 = null;
                }
                if (list4 == null || list4.isEmpty()) {
                    list4 = null;
                }
                Object obj5 = list2.get(3);
                if (!E4.k.a(obj5, bool) && obj5 != null) {
                    list = (List) ((D4.c) xVar.f707j).invoke(obj5);
                }
                return new C0110f(str, list3, list4, list);
            case 1:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list5 = (List) obj;
                ArrayList arrayList = new ArrayList(list5.size());
                int size = list5.size();
                while (i3 < size) {
                    Object obj6 = list5.get(i3);
                    C0108d c0108d = (E4.k.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (C0108d) ((D4.c) B.f1410b.f707j).invoke(obj6);
                    E4.k.c(c0108d);
                    arrayList.add(c0108d);
                    i3++;
                }
                return arrayList;
            case 2:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list6 = (List) obj;
                Object obj7 = list6.get(0);
                EnumC0112h enumC0112h = obj7 != null ? (EnumC0112h) obj7 : null;
                E4.k.c(enumC0112h);
                Object obj8 = list6.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                E4.k.c(num);
                int iIntValue = num.intValue();
                Object obj9 = list6.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                E4.k.c(num2);
                int iIntValue2 = num2.intValue();
                Object obj10 = list6.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                E4.k.c(str2);
                switch (enumC0112h.ordinal()) {
                    case 0:
                        Object obj11 = list6.get(1);
                        D.x xVar2 = B.f1415g;
                        if (!E4.k.a(obj11, Boolean.FALSE) && obj11 != null) {
                            tVar = (t) ((D4.c) xVar2.f707j).invoke(obj11);
                        }
                        E4.k.c(tVar);
                        return new C0108d(str2, iIntValue, iIntValue2, tVar);
                    case 1:
                        Object obj12 = list6.get(1);
                        D.x xVar3 = B.f1416h;
                        if (!E4.k.a(obj12, Boolean.FALSE) && obj12 != null) {
                            c7 = (C) ((D4.c) xVar3.f707j).invoke(obj12);
                        }
                        E4.k.c(c7);
                        return new C0108d(str2, iIntValue, iIntValue2, c7);
                    case 2:
                        Object obj13 = list6.get(1);
                        D.x xVar4 = B.f1411c;
                        if (!E4.k.a(obj13, Boolean.FALSE) && obj13 != null) {
                            l7 = (L) ((D4.c) xVar4.f707j).invoke(obj13);
                        }
                        E4.k.c(l7);
                        return new C0108d(str2, iIntValue, iIntValue2, l7);
                    case 3:
                        Object obj14 = list6.get(1);
                        D.x xVar5 = B.f1412d;
                        if (!E4.k.a(obj14, Boolean.FALSE) && obj14 != null) {
                            k3 = (K) ((D4.c) xVar5.f707j).invoke(obj14);
                        }
                        E4.k.c(k3);
                        return new C0108d(str2, iIntValue, iIntValue2, k3);
                    case 4:
                        Object obj15 = list6.get(1);
                        D.x xVar6 = B.f1413e;
                        if (!E4.k.a(obj15, Boolean.FALSE) && obj15 != null) {
                            c0115k = (C0115k) ((D4.c) xVar6.f707j).invoke(obj15);
                        }
                        E4.k.c(c0115k);
                        return new C0108d(str2, iIntValue, iIntValue2, c0115k);
                    case 5:
                        Object obj16 = list6.get(1);
                        D.x xVar7 = B.f1414f;
                        if (!E4.k.a(obj16, Boolean.FALSE) && obj16 != null) {
                            c0114j = (C0114j) ((D4.c) xVar7.f707j).invoke(obj16);
                        }
                        E4.k.c(c0114j);
                        return new C0108d(str2, iIntValue, iIntValue2, c0114j);
                    case 6:
                        Object obj17 = list6.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        E4.k.c(str3);
                        return new C0108d(str2, iIntValue, iIntValue2, str3);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
                E4.k.d("null cannot be cast to non-null type kotlin.Float", obj);
                return new R0.a(((Float) obj).floatValue());
            case 4:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list7 = (List) obj;
                Object obj18 = list7.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                E4.k.c(str4);
                Object obj19 = list7.get(1);
                D.x xVar8 = B.i;
                if (!E4.k.a(obj19, Boolean.FALSE) && obj19 != null) {
                    h7 = (H) ((D4.c) xVar8.f707j).invoke(obj19);
                }
                return new C0114j(str4, h7);
            case 5:
                if (E4.k.a(obj, Boolean.FALSE)) {
                    return new p035g0.r(p035g0.r.f9085l);
                }
                E4.k.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new p035g0.r(p035g0.H.c(((Integer) obj).intValue()));
            case 6:
                E4.k.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new L0.k(((Integer) obj).intValue());
            case 7:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list8 = (List) obj;
                Object obj20 = list8.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                E4.k.c(str5);
                Object obj21 = list8.get(1);
                D.x xVar9 = B.i;
                if (!E4.k.a(obj21, Boolean.FALSE) && obj21 != null) {
                    h6 = (H) ((D4.c) xVar9.f707j).invoke(obj21);
                }
                return new C0115k(str5, h6, 4);
            case 8:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i3 < size2) {
                    Object obj22 = list9.get(i3);
                    N0.a aVar = (E4.k.a(obj22, Boolean.FALSE) || obj22 == null) ? null : (N0.a) ((D4.c) B.f1427t.f707j).invoke(obj22);
                    E4.k.c(aVar);
                    arrayList2.add(aVar);
                    i3++;
                }
                return new N0.b(arrayList2);
            case 9:
                E4.k.d("null cannot be cast to non-null type kotlin.String", obj);
                N0.c.f3879a.getClass();
                Locale localeForLanguageTag = Locale.forLanguageTag((String) obj);
                E4.k.a(localeForLanguageTag.toLanguageTag(), "und");
                return new N0.a(localeForLanguageTag);
            case 10:
                if (E4.k.a(obj, Boolean.FALSE)) {
                    return new p030f0.c(9205357640488583168L);
                }
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list10 = (List) obj;
                Object obj23 = list10.get(0);
                Float f6 = obj23 != null ? (Float) obj23 : null;
                E4.k.c(f6);
                float fFloatValue = f6.floatValue();
                Object obj24 = list10.get(1);
                Float f7 = obj24 != null ? (Float) obj24 : null;
                E4.k.c(f7);
                return new p030f0.c(p081p0.c.y(fFloatValue, f7.floatValue()));
            case 11:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list11 = (List) obj;
                Object obj25 = list11.get(0);
                R0.i iVar = obj25 != null ? (R0.i) obj25 : null;
                E4.k.c(iVar);
                Object obj26 = list11.get(1);
                R0.k kVar = obj26 != null ? (R0.k) obj26 : null;
                E4.k.c(kVar);
                Object obj27 = list11.get(2);
                S0.n[] nVarArr = S0.m.f4900b;
                A a6 = B.f1424q;
                Boolean bool2 = Boolean.FALSE;
                S0.m mVar2 = ((E4.k.a(obj27, bool2) && a6 == null) || obj27 == null) ? null : (S0.m) a6.i.invoke(obj27);
                E4.k.c(mVar2);
                Object obj28 = list11.get(3);
                R0.p pVar2 = R0.p.f4756c;
                D.x xVar10 = B.f1419l;
                if (!E4.k.a(obj28, bool2) && obj28 != null) {
                    pVar = (R0.p) ((D4.c) xVar10.f707j).invoke(obj28);
                }
                return new t(iVar.f4745a, kVar.f4750a, mVar2.f4902a, pVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list12 = (List) obj;
                Object obj29 = list12.get(0);
                int i6 = p035g0.r.f9086m;
                A a7 = B.f1423p;
                Boolean bool3 = Boolean.FALSE;
                p035g0.r rVar = ((E4.k.a(obj29, bool3) && a7 == null) || obj29 == null) ? null : (p035g0.r) a7.i.invoke(obj29);
                E4.k.c(rVar);
                Object obj30 = list12.get(1);
                A a8 = B.f1425r;
                p030f0.c cVar = ((E4.k.a(obj30, bool3) && a8 == null) || obj30 == null) ? null : (p030f0.c) a8.i.invoke(obj30);
                E4.k.c(cVar);
                Object obj31 = list12.get(2);
                Float f8 = obj31 != null ? (Float) obj31 : null;
                E4.k.c(f8);
                return new p035g0.L(rVar.f9087a, cVar.f8837a, f8.floatValue());
            case 13:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list13 = (List) obj;
                Object obj32 = list13.get(0);
                int i7 = p035g0.r.f9086m;
                A a9 = B.f1423p;
                Boolean bool4 = Boolean.FALSE;
                p035g0.r rVar2 = ((E4.k.a(obj32, bool4) && a9 == null) || obj32 == null) ? null : (p035g0.r) a9.i.invoke(obj32);
                E4.k.c(rVar2);
                Object obj33 = list13.get(1);
                S0.n[] nVarArr2 = S0.m.f4900b;
                A a10 = B.f1424q;
                S0.m mVar3 = ((E4.k.a(obj33, bool4) && a10 == null) || obj33 == null) ? null : (S0.m) a10.i.invoke(obj33);
                E4.k.c(mVar3);
                Object obj34 = list13.get(2);
                L0.k kVar2 = L0.k.i;
                L0.k kVar3 = (E4.k.a(obj34, bool4) || obj34 == null) ? null : (L0.k) ((D4.c) B.f1420m.f707j).invoke(obj34);
                Object obj35 = list13.get(3);
                L0.i iVar2 = obj35 != null ? (L0.i) obj35 : null;
                Object obj36 = list13.get(4);
                L0.j jVar = obj36 != null ? (L0.j) obj36 : null;
                Object obj37 = list13.get(6);
                String str6 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list13.get(7);
                S0.m mVar4 = ((E4.k.a(obj38, bool4) && a10 == null) || obj38 == null) ? null : (S0.m) a10.i.invoke(obj38);
                E4.k.c(mVar4);
                Object obj39 = list13.get(8);
                R0.a aVar2 = (E4.k.a(obj39, bool4) || obj39 == null) ? null : (R0.a) ((D4.c) B.f1421n.f707j).invoke(obj39);
                Object obj40 = list13.get(9);
                R0.o oVar = (E4.k.a(obj40, bool4) || obj40 == null) ? null : (R0.o) ((D4.c) B.f1418k.f707j).invoke(obj40);
                Object obj41 = list13.get(10);
                N0.b bVar = N0.b.f3877j;
                N0.b bVar2 = (E4.k.a(obj41, bool4) || obj41 == null) ? null : (N0.b) ((D4.c) B.f1426s.f707j).invoke(obj41);
                Object obj42 = list13.get(11);
                p035g0.r rVar3 = ((E4.k.a(obj42, bool4) && a9 == null) || obj42 == null) ? null : (p035g0.r) a9.i.invoke(obj42);
                E4.k.c(rVar3);
                Object obj43 = list13.get(12);
                R0.j jVar2 = (E4.k.a(obj43, bool4) || obj43 == null) ? null : (R0.j) ((D4.c) B.f1417j.f707j).invoke(obj43);
                Object obj44 = list13.get(13);
                p035g0.L l8 = p035g0.L.f9034d;
                D.x xVar11 = B.f1422o;
                if (!E4.k.a(obj44, bool4) && obj44 != null) {
                    l6 = (p035g0.L) ((D4.c) xVar11.f707j).invoke(obj44);
                }
                return new C(rVar2.f9087a, mVar3.f4902a, kVar3, iVar2, jVar, (L0.p) null, str6, mVar4.f4902a, aVar2, oVar, bVar2, rVar3.f9087a, jVar2, l6, 49184);
            case 14:
                E4.k.d("null cannot be cast to non-null type kotlin.Int", obj);
                return new R0.j(((Integer) obj).intValue());
            case 15:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>", obj);
                List list14 = (List) obj;
                return new R0.o(((Number) list14.get(0)).floatValue(), ((Number) list14.get(1)).floatValue());
            case 16:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list15 = (List) obj;
                Object obj45 = list15.get(0);
                S0.n[] nVarArr3 = S0.m.f4900b;
                A a11 = B.f1424q;
                Boolean bool5 = Boolean.FALSE;
                S0.m mVar5 = ((E4.k.a(obj45, bool5) && a11 == null) || obj45 == null) ? null : (S0.m) a11.i.invoke(obj45);
                E4.k.c(mVar5);
                Object obj46 = list15.get(1);
                if ((!E4.k.a(obj46, bool5) || a11 != null) && obj46 != null) {
                    mVar = (S0.m) a11.i.invoke(obj46);
                }
                E4.k.c(mVar);
                return new R0.p(mVar5.f4902a, mVar.f4902a);
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>", obj);
                List list16 = (List) obj;
                Object obj47 = list16.get(0);
                D.x xVar12 = B.f1416h;
                Boolean bool6 = Boolean.FALSE;
                C c8 = (E4.k.a(obj47, bool6) || obj47 == null) ? null : (C) ((D4.c) xVar12.f707j).invoke(obj47);
                Object obj48 = list16.get(1);
                C c9 = (E4.k.a(obj48, bool6) || obj48 == null) ? null : (C) ((D4.c) xVar12.f707j).invoke(obj48);
                Object obj49 = list16.get(2);
                C c10 = (E4.k.a(obj49, bool6) || obj49 == null) ? null : (C) ((D4.c) xVar12.f707j).invoke(obj49);
                Object obj50 = list16.get(3);
                if (!E4.k.a(obj50, bool6) && obj50 != null) {
                    c6 = (C) ((D4.c) xVar12.f707j).invoke(obj50);
                }
                return new H(c8, c9, c10, c6);
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list17 = (List) obj;
                Object obj51 = list17.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                E4.k.c(num3);
                int iIntValue3 = num3.intValue();
                Object obj52 = list17.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                E4.k.c(num4);
                return new I(AbstractC0599v0.d(iIntValue3, num4.intValue()));
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                if (E4.k.a(obj, Boolean.FALSE)) {
                    return new S0.m(S0.m.f4901c);
                }
                E4.k.d("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>", obj);
                List list18 = (List) obj;
                Object obj53 = list18.get(0);
                Float f9 = obj53 != null ? (Float) obj53 : null;
                E4.k.c(f9);
                float fFloatValue2 = f9.floatValue();
                Object obj54 = list18.get(1);
                S0.n nVar = obj54 != null ? (S0.n) obj54 : null;
                E4.k.c(nVar);
                return new S0.m(d0.y(fFloatValue2, nVar.f4903a));
            case 20:
                String str7 = obj != null ? (String) obj : null;
                E4.k.c(str7);
                return new K(str7);
            default:
                String str8 = obj != null ? (String) obj : null;
                E4.k.c(str8);
                return new L(str8);
        }
    }
}
