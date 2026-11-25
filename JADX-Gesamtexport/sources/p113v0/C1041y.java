package p113v0;

import D4.e;
import S0.a;
import S0.k;
import java.util.List;
import p124x0.B;

/* JADX INFO: renamed from: v0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1041y extends B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f13201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f13202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041y(B b6, e eVar, String str) {
        super(str);
        this.f13201b = b6;
        this.f13202c = eVar;
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        B b6 = this.f13201b;
        k layoutDirection = h6.getLayoutDirection();
        C1039w c1039w = b6.f13120n;
        c1039w.f13193h = layoutDirection;
        c1039w.i = h6.a();
        c1039w.f13194j = h6.n();
        boolean zS = h6.s();
        e eVar = this.f13202c;
        if (zS || b6.f13115h.f13836j == null) {
            b6.f13116j = 0;
            G g6 = (G) eVar.d(c1039w, new a(j4));
            return new C1040x(g6, b6, b6.f13116j, g6, 1);
        }
        b6.f13117k = 0;
        G g7 = (G) eVar.d(b6.f13121o, new a(j4));
        return new C1040x(g7, b6, b6.f13117k, g7, 0);
    }
}
