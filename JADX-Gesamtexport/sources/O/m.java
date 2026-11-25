package O;

import F.C0071m;
import N.C0206c;
import N.C0235q0;
import N.C0237s;
import N.C0252z0;
import N.G0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f4373e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f4375g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f4372d = new m(1, 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f4374f = new m(1, 2, 2);

    static {
        int i = 1;
        f4373e = new m(i, i, 1);
        int i3 = 1;
        f4375g = new m(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i3, int i6) {
        super(i, i3);
        this.f4376c = i6;
    }

    @Override // O.C
    public final void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s) {
        int iC;
        int iO;
        switch (this.f4376c) {
            case 0:
                Object objInvoke = ((D4.a) c0071m.e(0)).invoke();
                C0206c c0206c = (C0206c) c0071m.e(1);
                c0071m.d(0);
                c0206c.getClass();
                g6.L(g6.c(c0206c), objInvoke);
                dVar.getClass();
                dVar.e(objInvoke);
                break;
            case 1:
                C0206c c0206c2 = (C0206c) c0071m.e(0);
                int iD = c0071m.d(0);
                dVar.m();
                c0206c2.getClass();
                Object objW = g6.w(g6.c(c0206c2));
                dVar.getClass();
                ((p124x0.D) dVar.f11478d).w(iD, (p124x0.D) objW);
                break;
            case 2:
                Object objE = c0071m.e(0);
                C0206c c0206c3 = (C0206c) c0071m.e(1);
                int iD2 = c0071m.d(0);
                if (objE instanceof C0252z0) {
                    ((ArrayList) c0237s.f3793c).add(((C0252z0) objE).f3874a);
                }
                int iC2 = g6.c(c0206c3);
                int iG = g6.g(g6.F(iC2, iD2));
                Object[] objArr = g6.f3591c;
                Object obj = objArr[iG];
                objArr[iG] = objE;
                if (obj instanceof C0252z0) {
                    int iO2 = g6.o() - g6.F(iC2, iD2);
                    C0252z0 c0252z0 = (C0252z0) obj;
                    C0206c c0206c4 = c0252z0.f3875b;
                    if (c0206c4 == null || !c0206c4.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = g6.c(c0206c4);
                        iO = g6.o() - g6.f(g6.f3590b, g6.p(g6.q(iC) + iC));
                    }
                    c0237s.h(c0252z0.f3874a, iO2, iC, iO);
                } else if (obj instanceof C0235q0) {
                    ((C0235q0) obj).d();
                }
                break;
            default:
                Object objE2 = c0071m.e(0);
                int iD3 = c0071m.d(0);
                if (objE2 instanceof C0252z0) {
                    ((ArrayList) c0237s.f3793c).add(((C0252z0) objE2).f3874a);
                }
                int iG2 = g6.g(g6.F(g6.f3607t, iD3));
                Object[] objArr2 = g6.f3591c;
                Object obj2 = objArr2[iG2];
                objArr2[iG2] = objE2;
                if (obj2 instanceof C0252z0) {
                    c0237s.h(((C0252z0) obj2).f3874a, g6.o() - g6.F(g6.f3607t, iD3), -1, -1);
                } else if (obj2 instanceof C0235q0) {
                    ((C0235q0) obj2).d();
                }
                break;
        }
    }

    @Override // O.C
    public final String b(int i) {
        switch (this.f4376c) {
            case 0:
                return i == 0 ? "insertIndex" : super.b(i);
            case 1:
                return i == 0 ? "insertIndex" : super.b(i);
            case 2:
                return i == 0 ? "groupSlotIndex" : super.b(i);
            default:
                return i == 0 ? "groupSlotIndex" : super.b(i);
        }
    }

    @Override // O.C
    public final String c(int i) {
        switch (this.f4376c) {
            case 0:
                if (i == 0) {
                    return "factory";
                }
                return i == 1 ? "groupAnchor" : super.c(i);
            case 1:
                return i == 0 ? "groupAnchor" : super.c(i);
            case 2:
                if (i == 0) {
                    return "value";
                }
                return i == 1 ? "anchor" : super.c(i);
            default:
                return i == 0 ? "value" : super.c(i);
        }
    }
}
