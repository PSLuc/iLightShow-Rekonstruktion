package L;

import com.philips.lighting.hue.sdk.wrapper.HueLog;

/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0.J f2746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0.J f2747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G0.J f2748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G0.J f2749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0.J f2750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G0.J f2751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G0.J f2752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G0.J f2753h;
    public final G0.J i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G0.J f2754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G0.J f2755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final G0.J f2756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final G0.J f2757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G0.J f2758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G0.J f2759o;

    public g2(G0.J j4, int i) {
        G0.J j6 = M.v.f3377d;
        G0.J j7 = M.v.f3378e;
        G0.J j8 = M.v.f3379f;
        G0.J j9 = M.v.f3380g;
        G0.J j10 = M.v.f3381h;
        G0.J j11 = M.v.i;
        G0.J j12 = M.v.f3385m;
        G0.J j13 = M.v.f3386n;
        G0.J j14 = M.v.f3387o;
        j4 = (i & HueLog.LogComponent.APPCORE) != 0 ? M.v.f3374a : j4;
        G0.J j15 = M.v.f3375b;
        G0.J j16 = M.v.f3376c;
        G0.J j17 = M.v.f3382j;
        G0.J j18 = M.v.f3383k;
        G0.J j19 = M.v.f3384l;
        this.f2746a = j6;
        this.f2747b = j7;
        this.f2748c = j8;
        this.f2749d = j9;
        this.f2750e = j10;
        this.f2751f = j11;
        this.f2752g = j12;
        this.f2753h = j13;
        this.i = j14;
        this.f2754j = j4;
        this.f2755k = j15;
        this.f2756l = j16;
        this.f2757m = j17;
        this.f2758n = j18;
        this.f2759o = j19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return E4.k.a(this.f2746a, g2Var.f2746a) && E4.k.a(this.f2747b, g2Var.f2747b) && E4.k.a(this.f2748c, g2Var.f2748c) && E4.k.a(this.f2749d, g2Var.f2749d) && E4.k.a(this.f2750e, g2Var.f2750e) && E4.k.a(this.f2751f, g2Var.f2751f) && E4.k.a(this.f2752g, g2Var.f2752g) && E4.k.a(this.f2753h, g2Var.f2753h) && E4.k.a(this.i, g2Var.i) && E4.k.a(this.f2754j, g2Var.f2754j) && E4.k.a(this.f2755k, g2Var.f2755k) && E4.k.a(this.f2756l, g2Var.f2756l) && E4.k.a(this.f2757m, g2Var.f2757m) && E4.k.a(this.f2758n, g2Var.f2758n) && E4.k.a(this.f2759o, g2Var.f2759o);
    }

    public final int hashCode() {
        return this.f2759o.hashCode() + ((this.f2758n.hashCode() + ((this.f2757m.hashCode() + ((this.f2756l.hashCode() + ((this.f2755k.hashCode() + ((this.f2754j.hashCode() + ((this.i.hashCode() + ((this.f2753h.hashCode() + ((this.f2752g.hashCode() + ((this.f2751f.hashCode() + ((this.f2750e.hashCode() + ((this.f2749d.hashCode() + ((this.f2748c.hashCode() + ((this.f2747b.hashCode() + (this.f2746a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Typography(displayLarge=" + this.f2746a + ", displayMedium=" + this.f2747b + ",displaySmall=" + this.f2748c + ", headlineLarge=" + this.f2749d + ", headlineMedium=" + this.f2750e + ", headlineSmall=" + this.f2751f + ", titleLarge=" + this.f2752g + ", titleMedium=" + this.f2753h + ", titleSmall=" + this.i + ", bodyLarge=" + this.f2754j + ", bodyMedium=" + this.f2755k + ", bodySmall=" + this.f2756l + ", labelLarge=" + this.f2757m + ", labelMedium=" + this.f2758n + ", labelSmall=" + this.f2759o + ')';
    }
}
