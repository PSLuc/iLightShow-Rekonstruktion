package p123x;

import S0.a;
import java.util.List;
import p089q4.v;
import p113v0.F;
import p113v0.G;
import p113v0.H;

/* JADX INFO: renamed from: x.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1083p implements F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1083p f13790b = new C1083p(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1083p f13791c = new C1083p(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13792a;

    public /* synthetic */ C1083p(int i) {
        this.f13792a = i;
    }

    @Override // p113v0.F
    public final G c(H h6, List list, long j4) {
        switch (this.f13792a) {
            case 0:
                return h6.u(a.j(j4), a.i(j4), v.f11238h, C1082o.i);
            default:
                return h6.u(a.f(j4) ? a.h(j4) : 0, a.e(j4) ? a.g(j4) : 0, v.f11238h, C1082o.f13788k);
        }
    }
}
