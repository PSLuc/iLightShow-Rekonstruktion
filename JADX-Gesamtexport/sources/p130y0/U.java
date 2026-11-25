package p130y0;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class U implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f14306a;

    public U(ViewConfiguration viewConfiguration) {
        this.f14306a = viewConfiguration;
    }

    @Override // p130y0.G0
    public final float a() {
        return this.f14306a.getScaledMaximumFlingVelocity();
    }

    @Override // p130y0.G0
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p130y0.G0
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p130y0.G0
    public final float d() {
        return this.f14306a.getScaledTouchSlop();
    }

    @Override // p130y0.G0
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return V.f14314a.b(this.f14306a);
        }
        return 2.0f;
    }

    @Override // p130y0.G0
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return V.f14314a.a(this.f14306a);
        }
        return 16.0f;
    }
}
