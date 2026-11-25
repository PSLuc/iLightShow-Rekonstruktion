package B;

import java.util.List;

/* JADX INFO: renamed from: B.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0022l extends E4.l implements D4.c {
    public static final C0022l i = new C0022l(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0022l f353j = new C0022l(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0022l f354k = new C0022l(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0022l f355l = new C0022l(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0022l f356m = new C0022l(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0022l f357n = new C0022l(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0022l f358o = new C0022l(1, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0022l f359p = new C0022l(1, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0022l f360q = new C0022l(1, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0022l f361r = new C0022l(1, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0022l f362s = new C0022l(1, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f363h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0022l(int i3, int i6) {
        super(i3);
        this.f363h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        Integer numValueOf;
        p084p4.x xVar = p084p4.x.f10867a;
        switch (this.f363h) {
            case 0:
                return xVar;
            case 1:
                return xVar;
            case 2:
                return xVar;
            case 3:
                return xVar;
            case 4:
                F.M m6 = (F.M) obj;
                long j4 = m6.f1113f;
                int i3 = G0.I.f1469c;
                return new M0.g(((int) (j4 & 4294967295L)) - AbstractC0029o0.s((int) (j4 & 4294967295L), m6.f1114g.f1494h), 0);
            case 5:
                F.M m7 = (F.M) obj;
                String str = m7.f1114g.f1494h;
                long j6 = m7.f1113f;
                int i6 = G0.I.f1469c;
                int iP = AbstractC0029o0.p((int) (j6 & 4294967295L), str);
                if (iP != -1) {
                    return new M0.g(0, iP - ((int) (4294967295L & m7.f1113f)));
                }
                return null;
            case 6:
                F.M m8 = (F.M) obj;
                Integer numD = m8.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j7 = m8.f1113f;
                int i7 = G0.I.f1469c;
                return new M0.g(((int) (4294967295L & j7)) - iIntValue, 0);
            case 7:
                F.M m9 = (F.M) obj;
                Integer numC = m9.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue2 = numC.intValue();
                long j8 = m9.f1113f;
                int i8 = G0.I.f1469c;
                return new M0.g(0, iIntValue2 - ((int) (4294967295L & j8)));
            case 8:
                F.M m10 = (F.M) obj;
                G0.G g6 = m10.f1110c;
                if (g6 != null) {
                    int iE = G0.I.e(m10.f1113f);
                    M0.q qVar = m10.f1111d;
                    numValueOf = Integer.valueOf(qVar.a(g6.h(g6.e(qVar.b(iE)))));
                } else {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    return null;
                }
                int iIntValue3 = numValueOf.intValue();
                long j9 = m10.f1113f;
                int i9 = G0.I.f1469c;
                return new M0.g(((int) (4294967295L & j9)) - iIntValue3, 0);
            case 9:
                F.M m11 = (F.M) obj;
                Integer numB = m11.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j10 = m11.f1113f;
                int i10 = G0.I.f1469c;
                return new M0.g(0, iIntValue4 - ((int) (4294967295L & j10)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                E4.k.d("null cannot be cast to non-null type kotlin.Boolean", obj2);
                p112v.W w6 = ((Boolean) obj2).booleanValue() ? p112v.W.f12920h : p112v.W.i;
                Object obj3 = list.get(0);
                E4.k.d("null cannot be cast to non-null type kotlin.Float", obj3);
                return new W0(w6, ((Float) obj3).floatValue());
        }
    }
}
