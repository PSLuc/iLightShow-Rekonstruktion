package N3;

import com.nanjoran.ilightshow.Views.DevicesViewRoute;
import com.nanjoran.ilightshow.Views.PaywallViewRoute;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4156h;
    public final /* synthetic */ F1.I i;

    public /* synthetic */ b1(F1.I i, int i3) {
        this.f4156h = i3;
        this.i = i;
    }

    @Override // D4.a
    public final Object invoke() {
        F1.I i;
        switch (this.f4156h) {
            case 0:
                com.nanjoran.ilightshow.Services.M.f8305O.z();
                F1.I i3 = this.i;
                if (i3 != null) {
                    i3.l();
                }
                break;
            case 1:
                com.nanjoran.ilightshow.Services.M.f8305O.z();
                F1.I i6 = this.i;
                if (i6 != null) {
                    i6.l();
                }
                break;
            case 2:
                F1.I i7 = this.i;
                if (i7 != null) {
                    i7.l();
                }
                break;
            case 3:
                if ((com.nanjoran.ilightshow.Services.E0.f8249o.a() != com.nanjoran.ilightshow.Services.F0.MEMBERSHIP_V3 || com.nanjoran.ilightshow.Services.E0.d()) && (i = this.i) != null) {
                    F1.I.k(i, new PaywallViewRoute(false, false, 3, (E4.g) null));
                }
                break;
            default:
                F1.I i8 = this.i;
                if (i8 != null) {
                    F1.I.k(i8, DevicesViewRoute.INSTANCE);
                }
                break;
        }
        return p084p4.x.f10867a;
    }
}
