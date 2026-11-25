package p012c;

import B.AbstractC0013g0;
import android.window.BackEvent;

/* JADX INFO: renamed from: c.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0464b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7136d;

    public C0464b(BackEvent backEvent) {
        C0463a c0463a = C0463a.f7132a;
        float fD = c0463a.d(backEvent);
        float fE = c0463a.e(backEvent);
        float fB = c0463a.b(backEvent);
        int iC = c0463a.c(backEvent);
        this.f7133a = fD;
        this.f7134b = fE;
        this.f7135c = fB;
        this.f7136d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f7133a);
        sb.append(", touchY=");
        sb.append(this.f7134b);
        sb.append(", progress=");
        sb.append(this.f7135c);
        sb.append(", swipeEdge=");
        return AbstractC0013g0.k(sb, this.f7136d, '}');
    }
}
