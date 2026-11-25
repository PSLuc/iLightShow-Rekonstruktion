package L;

import F.C0066h;
import N.C0222k;
import N.C0230o;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2582h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2583j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(int i, Object obj, boolean z5) {
        super(3);
        this.f2582h = i;
        this.i = obj;
        this.f2583j = z5;
    }

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f2582h) {
            case 0:
                A0 a6 = (A0) obj;
                C0230o c0230o = (C0230o) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c0230o.f(a6) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c0230o.B()) {
                    c0230o.P();
                } else {
                    U0.f2512a.b(a6, null, (O0) this.i, this.f2583j, c0230o, (iIntValue & 14) | 24576);
                }
                return p084p4.x.f10867a;
            case 1:
                C0188w1 c0188w1 = (C0188w1) obj;
                C0230o c0230o2 = (C0230o) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0230o2.f(c0188w1) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18 && c0230o2.B()) {
                    c0230o2.P();
                } else {
                    U0.f2512a.c(c0188w1, null, (O0) this.i, this.f2583j, c0230o2, (iIntValue2 & 14) | 24576);
                }
                return p084p4.x.f10867a;
            default:
                Z.o oVar = (Z.o) obj;
                C0230o c0230o3 = (C0230o) obj2;
                ((Number) obj3).intValue();
                c0230o3.V(-196777734);
                long j4 = ((F.Y) c0230o3.k(F.Z.f1154a)).f1152a;
                boolean zE = c0230o3.e(j4);
                D4.a aVar = (D4.a) this.i;
                boolean zF = zE | c0230o3.f(aVar);
                boolean z5 = this.f2583j;
                boolean zG = zF | c0230o3.g(z5);
                Object objK = c0230o3.K();
                if (zG || objK == C0222k.f3714a) {
                    objK = new C0066h(j4, aVar, z5);
                    c0230o3.f0(objK);
                }
                Z.o oVarB = androidx.compose.ui.draw.a.b(oVar, (D4.c) objK);
                c0230o3.p(false);
                return oVarB;
        }
    }
}
