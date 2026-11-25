package p052k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.nanjoran.ilightshow.R;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f9897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f9900e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f9903h;
    public l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m f9904j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9901f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f9905k = new m(this);

    public o(int i, Context context, View view, j jVar, boolean z5) {
        this.f9896a = context;
        this.f9897b = jVar;
        this.f9900e = view;
        this.f9898c = z5;
        this.f9899d = i;
    }

    public final l a() {
        l tVar;
        if (this.i == null) {
            Context context = this.f9896a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            n.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                tVar = new g(context, this.f9900e, this.f9899d, this.f9898c);
            } else {
                View view = this.f9900e;
                Context context2 = this.f9896a;
                boolean z5 = this.f9898c;
                tVar = new t(this.f9899d, context2, view, this.f9897b, z5);
            }
            tVar.l(this.f9897b);
            tVar.r(this.f9905k);
            tVar.n(this.f9900e);
            tVar.h(this.f9903h);
            tVar.o(this.f9902g);
            tVar.p(this.f9901f);
            this.i = tVar;
        }
        return this.i;
    }

    public final boolean b() {
        l lVar = this.i;
        return lVar != null && lVar.k();
    }

    public void c() {
        this.i = null;
        m mVar = this.f9904j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int i, int i3, boolean z5, boolean z6) {
        l lVarA = a();
        lVarA.s(z6);
        if (z5) {
            int i6 = this.f9901f;
            View view = this.f9900e;
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f9900e.getWidth();
            }
            lVarA.q(i);
            lVarA.t(i3);
            int i7 = (int) ((this.f9896a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            lVarA.f9894h = new Rect(i - i7, i3 - i7, i + i7, i3 + i7);
        }
        lVarA.d();
    }
}
