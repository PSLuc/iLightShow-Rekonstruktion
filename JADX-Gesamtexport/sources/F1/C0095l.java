package F1;

import B.C0025m0;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;

/* JADX INFO: renamed from: F1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095l extends E4.l implements D4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1352h;
    public final /* synthetic */ C0096m i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0095l(C0096m c0096m, int i) {
        super(0);
        this.f1352h = i;
        this.i = c0096m;
    }

    @Override // D4.a
    public final Object invoke() {
        switch (this.f1352h) {
            case 0:
                C0096m c0096m = this.i;
                Context context = c0096m.f1353h;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new androidx.lifecycle.M(applicationContext instanceof Application ? (Application) applicationContext : null, c0096m, c0096m.g());
            default:
                C0096m c0096m2 = this.i;
                if (!c0096m2.f1361q) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                C0460u c0460u = c0096m2.f1359o;
                if (c0460u.f7001c == EnumC0454n.f6991h) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                C0093j c0093j = new C0093j();
                c0093j.f1349a = (J1.e) c0096m2.f1360p.f1107d;
                c0093j.f1350b = c0460u;
                return ((C0094k) new C0025m0(c0096m2.e(), c0093j, c0096m2.d()).d(E4.x.a(C0094k.class))).f1351b;
        }
    }
}
