package p124x0;

import D4.a;
import E4.k;
import E4.l;
import p084p4.x;
import p113v0.M;
import p130y0.r;

/* JADX INFO: loaded from: classes.dex */
public final class G extends l implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J f13863h;
    public final /* synthetic */ f0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f13864j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(J j4, f0 f0Var, long j6) {
        super(0);
        this.f13863h = j4;
        this.i = f0Var;
        this.f13864j = j6;
    }

    @Override // D4.a
    public final Object invoke() {
        N nK0;
        J j4 = this.f13863h;
        M placementScope = null;
        if (AbstractC1098f.o(j4.f13907a)) {
            Y y2 = j4.a().f13991u;
            if (y2 != null) {
                placementScope = y2.f13936p;
            }
        } else {
            Y y6 = j4.a().f13991u;
            if (y6 != null && (nK0 = y6.K0()) != null) {
                placementScope = nK0.f13936p;
            }
        }
        if (placementScope == null) {
            placementScope = ((r) this.i).getPlacementScope();
        }
        N nK1 = j4.a().K0();
        k.c(nK1);
        M.e(placementScope, nK1, this.f13864j);
        return x.f10867a;
    }
}
