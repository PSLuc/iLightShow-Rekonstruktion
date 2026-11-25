package G0;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class y extends E4.l implements D4.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1573h;
    public static final y i = new y(2, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y f1556j = new y(2, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final y f1557k = new y(2, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final y f1558l = new y(2, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y f1559m = new y(2, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final y f1560n = new y(2, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final y f1561o = new y(2, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final y f1562p = new y(2, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final y f1563q = new y(2, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f1564r = new y(2, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f1565s = new y(2, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f1566t = new y(2, 11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f1567u = new y(2, 12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f1568v = new y(2, 13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y f1569w = new y(2, 14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y f1570x = new y(2, 15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y f1571y = new y(2, 16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final y f1572z = new y(2, 17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final y f1552A = new y(2, 18);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final y f1553B = new y(2, 19);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final y f1554C = new y(2, 20);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final y f1555D = new y(2, 21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i3, int i6) {
        super(i3);
        this.f1573h = i6;
    }

    @Override // D4.e
    public final Object d(Object obj, Object obj2) {
        EnumC0112h enumC0112h;
        int i3 = 0;
        switch (this.f1573h) {
            case 0:
                W.b bVar = (W.b) obj;
                C0110f c0110f = (C0110f) obj2;
                String str = c0110f.f1494h;
                D.x xVar = B.f1409a;
                List listB = c0110f.b();
                D.x xVar2 = B.f1409a;
                Object objA = B.a(listB, xVar2, bVar);
                Object obj3 = c0110f.f1495j;
                if (obj3 == null) {
                    obj3 = p089q4.u.f11237h;
                }
                return p089q4.m.J(str, objA, B.a(obj3, xVar2, bVar), B.a(c0110f.f1496k, xVar2, bVar));
            case 1:
                W.b bVar2 = (W.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i3 < size) {
                    arrayList.add(B.a((C0108d) list.get(i3), B.f1410b, bVar2));
                    i3++;
                }
                return arrayList;
            case 2:
                W.b bVar3 = (W.b) obj;
                C0108d c0108d = (C0108d) obj2;
                Object obj4 = c0108d.f1490a;
                if (obj4 instanceof t) {
                    enumC0112h = EnumC0112h.f1498h;
                } else if (obj4 instanceof C) {
                    enumC0112h = EnumC0112h.i;
                } else if (obj4 instanceof L) {
                    enumC0112h = EnumC0112h.f1499j;
                } else if (obj4 instanceof K) {
                    enumC0112h = EnumC0112h.f1500k;
                } else if (obj4 instanceof C0115k) {
                    enumC0112h = EnumC0112h.f1501l;
                } else {
                    enumC0112h = obj4 instanceof C0114j ? EnumC0112h.f1502m : EnumC0112h.f1503n;
                }
                int iOrdinal = enumC0112h.ordinal();
                Object objA2 = c0108d.f1490a;
                switch (iOrdinal) {
                    case 0:
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle", objA2);
                        objA2 = B.a((t) objA2, B.f1415g, bVar3);
                        break;
                    case 1:
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle", objA2);
                        objA2 = B.a((C) objA2, B.f1416h, bVar3);
                        break;
                    case 2:
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation", objA2);
                        objA2 = B.a((L) objA2, B.f1411c, bVar3);
                        break;
                    case 3:
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation", objA2);
                        objA2 = B.a((K) objA2, B.f1412d, bVar3);
                        break;
                    case 4:
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url", objA2);
                        objA2 = B.a((C0115k) objA2, B.f1413e, bVar3);
                        break;
                    case 5:
                        E4.k.d("null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable", objA2);
                        objA2 = B.a((C0114j) objA2, B.f1414f, bVar3);
                        break;
                    case 6:
                        D.x xVar3 = B.f1409a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return p089q4.m.J(enumC0112h, objA2, Integer.valueOf(c0108d.f1491b), Integer.valueOf(c0108d.f1492c), c0108d.f1493d);
            case 3:
                return Float.valueOf(((R0.a) obj2).f4730a);
            case 4:
                C0114j c0114j = (C0114j) obj2;
                return p089q4.m.J(c0114j.f1505a, B.a(c0114j.f1506b, B.i, (W.b) obj));
            case 5:
                long j4 = ((p035g0.r) obj2).f9087a;
                return j4 == 16 ? Boolean.FALSE : Integer.valueOf(p035g0.H.v(j4));
            case 6:
                return Integer.valueOf(((L0.k) obj2).f3028h);
            case 7:
                C0115k c0115k = (C0115k) obj2;
                return p089q4.m.J(c0115k.f1507a, B.a(c0115k.f1508b, B.i, (W.b) obj));
            case 8:
                W.b bVar4 = (W.b) obj;
                List list2 = ((N0.b) obj2).f3878h;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                while (i3 < size2) {
                    arrayList2.add(B.a((N0.a) list2.get(i3), B.f1427t, bVar4));
                    i3++;
                }
                return arrayList2;
            case 9:
                return ((N0.a) obj2).f3876a.toLanguageTag();
            case 10:
                long j6 = ((p030f0.c) obj2).f8837a;
                if (p030f0.c.b(j6, 9205357640488583168L)) {
                    return Boolean.FALSE;
                }
                Float fValueOf = Float.valueOf(p030f0.c.d(j6));
                D.x xVar4 = B.f1409a;
                return p089q4.m.J(fValueOf, Float.valueOf(p030f0.c.e(j6)));
            case 11:
                W.b bVar5 = (W.b) obj;
                t tVar = (t) obj2;
                R0.i iVar = new R0.i(tVar.f1537a);
                D.x xVar5 = B.f1409a;
                R0.k kVar = new R0.k(tVar.f1538b);
                Object objA3 = B.a(new S0.m(tVar.f1539c), B.f1424q, bVar5);
                R0.p pVar = R0.p.f4756c;
                return p089q4.m.J(iVar, kVar, objA3, B.a(tVar.f1540d, B.f1419l, bVar5));
            case 12:
                W.b bVar6 = (W.b) obj;
                p035g0.L l6 = (p035g0.L) obj2;
                return p089q4.m.J(B.a(new p035g0.r(l6.f9035a), B.f1423p, bVar6), B.a(new p030f0.c(l6.f9036b), B.f1425r, bVar6), Float.valueOf(l6.f9037c));
            case 13:
                W.b bVar7 = (W.b) obj;
                C c6 = (C) obj2;
                p035g0.r rVar = new p035g0.r(c6.f1428a.a());
                A a6 = B.f1423p;
                Object objA4 = B.a(rVar, a6, bVar7);
                S0.m mVar = new S0.m(c6.f1429b);
                A a7 = B.f1424q;
                Object objA5 = B.a(mVar, a7, bVar7);
                L0.k kVar2 = L0.k.i;
                Object objA6 = B.a(c6.f1430c, B.f1420m, bVar7);
                Object objA7 = B.a(new S0.m(c6.f1435h), a7, bVar7);
                Object objA8 = B.a(c6.i, B.f1421n, bVar7);
                Object objA9 = B.a(c6.f1436j, B.f1418k, bVar7);
                N0.b bVar8 = N0.b.f3877j;
                Object objA10 = B.a(c6.f1437k, B.f1426s, bVar7);
                Object objA11 = B.a(new p035g0.r(c6.f1438l), a6, bVar7);
                Object objA12 = B.a(c6.f1439m, B.f1417j, bVar7);
                p035g0.L l7 = p035g0.L.f9034d;
                return p089q4.m.J(objA4, objA5, objA6, c6.f1431d, c6.f1432e, -1, c6.f1434g, objA7, objA8, objA9, objA10, objA11, objA12, B.a(c6.f1440n, B.f1422o, bVar7));
            case 14:
                return Integer.valueOf(((R0.j) obj2).f4749a);
            case 15:
                R0.o oVar = (R0.o) obj2;
                return p089q4.m.J(Float.valueOf(oVar.f4754a), Float.valueOf(oVar.f4755b));
            case 16:
                W.b bVar9 = (W.b) obj;
                R0.p pVar2 = (R0.p) obj2;
                S0.m mVar2 = new S0.m(pVar2.f4757a);
                A a8 = B.f1424q;
                return p089q4.m.J(B.a(mVar2, a8, bVar9), B.a(new S0.m(pVar2.f4758b), a8, bVar9));
            case defpackage.b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                W.b bVar10 = (W.b) obj;
                H h6 = (H) obj2;
                C c7 = h6.f1464a;
                D.x xVar6 = B.f1416h;
                return p089q4.m.J(B.a(c7, xVar6, bVar10), B.a(h6.f1465b, xVar6, bVar10), B.a(h6.f1466c, xVar6, bVar10), B.a(h6.f1467d, xVar6, bVar10));
            case defpackage.b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                long j7 = ((I) obj2).f1470a;
                int i6 = I.f1469c;
                Integer numValueOf = Integer.valueOf((int) (j7 >> 32));
                D.x xVar7 = B.f1409a;
                return p089q4.m.J(numValueOf, Integer.valueOf((int) (j7 & 4294967295L)));
            case defpackage.b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                long j8 = ((S0.m) obj2).f4902a;
                if (S0.m.a(j8, S0.m.f4901c)) {
                    return Boolean.FALSE;
                }
                Float fValueOf2 = Float.valueOf(S0.m.c(j8));
                D.x xVar8 = B.f1409a;
                return p089q4.m.J(fValueOf2, new S0.n(S0.m.b(j8)));
            case 20:
                String str2 = ((K) obj2).f1475a;
                D.x xVar9 = B.f1409a;
                return str2;
            default:
                String str3 = ((L) obj2).f1476a;
                D.x xVar10 = B.f1409a;
                return str3;
        }
    }
}
