package p052k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.nanjoran.ilightshow.R;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.C0786e0;
import p057l.C0788f0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f9906A;
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f9907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f9908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0788f0 f9912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f9913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f9914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public m f9915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f9916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f9917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p f9918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewTreeObserver f9919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9921x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9922y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9923z = 0;

    public t(int i, Context context, View view, j jVar, boolean z5) {
        int i3 = 1;
        this.f9913p = new c(this, i3);
        this.f9914q = new d(i3, this);
        this.i = context;
        this.f9907j = jVar;
        this.f9909l = z5;
        this.f9908k = new h(jVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f9911n = i;
        Resources resources = context.getResources();
        this.f9910m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9916s = view;
        this.f9912o = new C0788f0(context, i);
        jVar.b(this, context);
    }

    @Override // p052k.q
    public final boolean b(u uVar) {
        if (uVar.hasVisibleItems()) {
            o oVar = new o(this.f9911n, this.i, this.f9917t, uVar, this.f9909l);
            p pVar = this.f9918u;
            oVar.f9903h = pVar;
            l lVar = oVar.i;
            if (lVar != null) {
                lVar.h(pVar);
            }
            boolean zU = l.u(uVar);
            oVar.f9902g = zU;
            l lVar2 = oVar.i;
            if (lVar2 != null) {
                lVar2.o(zU);
            }
            oVar.f9904j = this.f9915r;
            this.f9915r = null;
            this.f9907j.c(false);
            C0788f0 c0788f0 = this.f9912o;
            int width = c0788f0.f10056l;
            int i = !c0788f0.f10058n ? 0 : c0788f0.f10057m;
            int i3 = this.f9923z;
            View view = this.f9916s;
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                width += this.f9916s.getWidth();
            }
            if (!oVar.b()) {
                if (oVar.f9900e != null) {
                    oVar.d(width, i, true, true);
                }
            }
            p pVar2 = this.f9918u;
            if (pVar2 != null) {
                pVar2.i(uVar);
            }
            return true;
        }
        return false;
    }

    @Override // p052k.q
    public final void c(j jVar, boolean z5) {
        if (jVar != this.f9907j) {
            return;
        }
        dismiss();
        p pVar = this.f9918u;
        if (pVar != null) {
            pVar.c(jVar, z5);
        }
    }

    @Override // p052k.s
    public final void d() {
        View view;
        if (k()) {
            return;
        }
        if (this.f9920w || (view = this.f9916s) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f9917t = view;
        C0788f0 c0788f0 = this.f9912o;
        c0788f0.f10051C.setOnDismissListener(this);
        c0788f0.f10064t = this;
        c0788f0.f10050B = true;
        c0788f0.f10051C.setFocusable(true);
        View view2 = this.f9917t;
        boolean z5 = this.f9919v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9919v = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9913p);
        }
        view2.addOnAttachStateChangeListener(this.f9914q);
        c0788f0.f10063s = view2;
        c0788f0.f10061q = this.f9923z;
        boolean z6 = this.f9921x;
        Context context = this.i;
        h hVar = this.f9908k;
        if (!z6) {
            this.f9922y = l.m(hVar, context, this.f9910m);
            this.f9921x = true;
        }
        int i = this.f9922y;
        Drawable background = c0788f0.f10051C.getBackground();
        if (background != null) {
            Rect rect = c0788f0.f10070z;
            background.getPadding(rect);
            c0788f0.f10055k = rect.left + rect.right + i;
        } else {
            c0788f0.f10055k = i;
        }
        c0788f0.f10051C.setInputMethodMode(2);
        Rect rect2 = this.f9894h;
        c0788f0.f10049A = rect2 != null ? new Rect(rect2) : null;
        c0788f0.d();
        C0786e0 c0786e0 = c0788f0.f10054j;
        c0786e0.setOnKeyListener(this);
        if (this.f9906A) {
            j jVar = this.f9907j;
            if (jVar.f9858l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0786e0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f9858l);
                }
                frameLayout.setEnabled(false);
                c0786e0.addHeaderView(frameLayout, null, false);
            }
        }
        c0788f0.a(hVar);
        c0788f0.d();
    }

    @Override // p052k.s
    public final void dismiss() {
        if (k()) {
            this.f9912o.dismiss();
        }
    }

    @Override // p052k.q
    public final void f() {
        this.f9921x = false;
        h hVar = this.f9908k;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // p052k.s
    public final ListView g() {
        return this.f9912o.f10054j;
    }

    @Override // p052k.q
    public final void h(p pVar) {
        this.f9918u = pVar;
    }

    @Override // p052k.q
    public final boolean j() {
        return false;
    }

    @Override // p052k.s
    public final boolean k() {
        return !this.f9920w && this.f9912o.f10051C.isShowing();
    }

    @Override // p052k.l
    public final void l(j jVar) {
    }

    @Override // p052k.l
    public final void n(View view) {
        this.f9916s = view;
    }

    @Override // p052k.l
    public final void o(boolean z5) {
        this.f9908k.f9843j = z5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f9920w = true;
        this.f9907j.c(true);
        ViewTreeObserver viewTreeObserver = this.f9919v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9919v = this.f9917t.getViewTreeObserver();
            }
            this.f9919v.removeGlobalOnLayoutListener(this.f9913p);
            this.f9919v = null;
        }
        this.f9917t.removeOnAttachStateChangeListener(this.f9914q);
        m mVar = this.f9915r;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p052k.l
    public final void p(int i) {
        this.f9923z = i;
    }

    @Override // p052k.l
    public final void q(int i) {
        this.f9912o.f10056l = i;
    }

    @Override // p052k.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9915r = (m) onDismissListener;
    }

    @Override // p052k.l
    public final void s(boolean z5) {
        this.f9906A = z5;
    }

    @Override // p052k.l
    public final void t(int i) {
        C0788f0 c0788f0 = this.f9912o;
        c0788f0.f10057m = i;
        c0788f0.f10058n = true;
    }
}
