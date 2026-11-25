package p123x;

import X.C0386c;
import X.o;
import android.os.Build;
import android.view.View;
import com.nanjoran.ilightshow.R;
import java.util.WeakHashMap;
import p008b1.c;
import p045i1.AbstractC0744e;
import p045i1.C0745f;
import p045i1.c0;
import p080p.A;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final WeakHashMap f13736u = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1068a f13737a = C1069b.c(4, "captionBar");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1068a f13738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1068a f13739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1068a f13740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1068a f13741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1068a f13742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1068a f13743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1068a f13744h;
    public final C1068a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Z f13745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z f13746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z f13747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z f13748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Z f13749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z f13750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z f13751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Z f13752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f13753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final F f13755t;

    public b0(View view) {
        C1068a c1068aC = C1069b.c(128, "displayCutout");
        this.f13738b = c1068aC;
        C1068a c1068aC2 = C1069b.c(8, "ime");
        this.f13739c = c1068aC2;
        C1068a c1068aC3 = C1069b.c(32, "mandatorySystemGestures");
        this.f13740d = c1068aC3;
        this.f13741e = C1069b.c(2, "navigationBars");
        this.f13742f = C1069b.c(1, "statusBars");
        C1068a c1068aC4 = C1069b.c(7, "systemBars");
        this.f13743g = c1068aC4;
        C1068a c1068aC5 = C1069b.c(16, "systemGestures");
        this.f13744h = c1068aC5;
        C1068a c1068aC6 = C1069b.c(64, "tappableElement");
        this.i = c1068aC6;
        Z z5 = new Z(new H(0, 0, 0, 0), "waterfall");
        this.f13745j = z5;
        new X(new X(c1068aC4, c1068aC2), c1068aC);
        new X(new X(new X(c1068aC6, c1068aC3), c1068aC5), z5);
        this.f13746k = C1069b.d(4, "captionBarIgnoringVisibility");
        this.f13747l = C1069b.d(2, "navigationBarsIgnoringVisibility");
        this.f13748m = C1069b.d(1, "statusBarsIgnoringVisibility");
        this.f13749n = C1069b.d(7, "systemBarsIgnoringVisibility");
        this.f13750o = C1069b.d(64, "tappableElementIgnoringVisibility");
        this.f13751p = C1069b.d(8, "imeAnimationTarget");
        this.f13752q = C1069b.d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f13753r = bool != null ? bool.booleanValue() : true;
        this.f13755t = new F(this);
    }

    public static void a(b0 b0Var, c0 c0Var) {
        boolean z5 = false;
        b0Var.f13737a.f(c0Var, 0);
        b0Var.f13739c.f(c0Var, 0);
        b0Var.f13738b.f(c0Var, 0);
        b0Var.f13741e.f(c0Var, 0);
        b0Var.f13742f.f(c0Var, 0);
        b0Var.f13743g.f(c0Var, 0);
        b0Var.f13744h.f(c0Var, 0);
        b0Var.i.f(c0Var, 0);
        b0Var.f13740d.f(c0Var, 0);
        b0Var.f13746k.f(AbstractC1070c.f(c0Var.f9452a.g(4)));
        b0Var.f13747l.f(AbstractC1070c.f(c0Var.f9452a.g(2)));
        b0Var.f13748m.f(AbstractC1070c.f(c0Var.f9452a.g(1)));
        b0Var.f13749n.f(AbstractC1070c.f(c0Var.f9452a.g(7)));
        b0Var.f13750o.f(AbstractC1070c.f(c0Var.f9452a.g(64)));
        C0745f c0745fE = c0Var.f9452a.e();
        if (c0745fE != null) {
            b0Var.f13745j.f(AbstractC1070c.f(Build.VERSION.SDK_INT >= 30 ? c.c(AbstractC0744e.b(c0745fE.f9456a)) : c.f7046e));
        }
        synchronized (o.f5709b) {
            A a6 = ((C0386c) o.i.get()).f5674h;
            if (a6 != null && a6.h()) {
                z5 = true;
            }
        }
        if (z5) {
            o.a();
        }
    }
}
