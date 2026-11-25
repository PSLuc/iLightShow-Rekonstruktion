package B;

import N.C0222k;
import N.C0230o;

/* JADX INFO: renamed from: B.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0010f extends E4.l implements D4.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0010f f311h = new C0010f(3);

    @Override // D4.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        Z.o oVar = (Z.o) obj;
        C0230o c0230o = (C0230o) obj2;
        ((Number) obj3).intValue();
        c0230o.V(-2126899193);
        long j4 = ((F.Y) c0230o.k(F.Z.f1154a)).f1152a;
        Z.l lVar = Z.l.f5957a;
        boolean zE = c0230o.e(j4);
        Object objK = c0230o.K();
        if (zE || objK == C0222k.f3714a) {
            objK = new C0008e(0, j4);
            c0230o.f0(objK);
        }
        Z.o oVarK = oVar.k(androidx.compose.ui.draw.a.b(lVar, (D4.c) objK));
        c0230o.p(false);
        return oVarK;
    }
}
