package p124x0;

import D4.c;
import E4.l;
import P.d;
import p035g0.P;
import p084p4.x;
import p130y0.r;

/* JADX INFO: renamed from: x0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1097e extends l implements c {
    public static final C1097e i = new C1097e(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C1097e f14009j = new C1097e(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C1097e f14010k = new C1097e(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C1097e f14011l = new C1097e(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C1097e f14012m = new C1097e(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C1097e f14013n = new C1097e(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1097e f14014o = new C1097e(1, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1097e f14015p = new C1097e(1, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1097e f14016q = new C1097e(1, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1097e f14017r = new C1097e(1, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1097e f14018s = new C1097e(1, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1097e f14019t = new C1097e(1, 11);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14020h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1097e(int i3, int i6) {
        super(i3);
        this.f14020h = i6;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f14020h) {
            case 0:
                ((C1095c) obj).A0();
                break;
            case 1:
                j0 j0Var = (j0) obj;
                if (j0Var.z()) {
                    j0Var.i.q0(j0Var);
                }
                break;
            case 2:
                e0 e0Var = ((Y) obj).f13988K;
                if (e0Var != null) {
                    e0Var.invalidate();
                }
                break;
            case 3:
                Y y2 = (Y) obj;
                if (y2.z()) {
                    C1112u c1112u = y2.G;
                    if (c1112u == null) {
                        y2.i1(true);
                    } else {
                        C1112u c1112u2 = Y.f13978M;
                        c1112u2.getClass();
                        c1112u2.f14062a = c1112u.f14062a;
                        c1112u2.f14063b = c1112u.f14063b;
                        c1112u2.f14064c = c1112u.f14064c;
                        c1112u2.f14065d = c1112u.f14065d;
                        c1112u2.f14066e = c1112u.f14066e;
                        y2.i1(true);
                        if (c1112u2.f14062a != c1112u.f14062a || c1112u2.f14063b != c1112u.f14063b || c1112u2.f14064c != c1112u.f14064c || c1112u2.f14065d != c1112u.f14065d || !P.a(c1112u2.f14066e, c1112u.f14066e)) {
                            D d6 = y2.f13989s;
                            J j4 = d6.f13829D;
                            if (j4.f13919n > 0) {
                                if (j4.f13918m || j4.f13917l) {
                                    d6.P(false);
                                }
                                j4.f13923r.s0();
                            }
                            r rVar = d6.f13842p;
                            if (rVar != null) {
                                ((d) rVar.f14467N.f13952e.f14007b).c(d6);
                                d6.J = true;
                                rVar.A(null);
                            }
                        }
                    }
                }
                break;
            case 4:
                b0 b0Var = (b0) obj;
                if (b0Var.z()) {
                    b0Var.f13999h.D();
                }
                break;
            case 5:
                D d7 = (D) obj;
                if (d7.D()) {
                    d7.P(false);
                }
                break;
            case 6:
                D d8 = (D) obj;
                if (d8.D()) {
                    d8.P(false);
                }
                break;
            case 7:
                D d9 = (D) obj;
                if (d9.D()) {
                    d9.N(false);
                }
                break;
            case 8:
                D d10 = (D) obj;
                if (d10.D()) {
                    d10.N(false);
                }
                break;
            case 9:
                D d11 = (D) obj;
                if (d11.D()) {
                    D.O(d11, false, 7);
                }
                break;
            case 10:
                D d12 = (D) obj;
                if (d12.D()) {
                    D.Q(d12, false, 7);
                }
                break;
            default:
                D d13 = (D) obj;
                if (d13.D()) {
                    d13.B();
                }
                break;
        }
        return x.f10867a;
    }
}
