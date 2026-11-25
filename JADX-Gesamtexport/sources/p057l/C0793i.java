package p057l;

import O1.n;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import p035g0.C0715p;
import p052k.j;
import p052k.k;
import p052k.l;
import p052k.p;
import p052k.q;
import p052k.r;
import p052k.u;

/* JADX INFO: renamed from: l.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0793i implements q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public n f10081A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0789g f10082B;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f10084h;
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f10085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LayoutInflater f10086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p f10087l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActionMenuView f10089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0791h f10090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f10091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10097v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10098w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C0787f f10100y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0787f f10101z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10088m = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f10099x = new SparseBooleanArray();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0715p f10083C = new C0715p(10, this);

    public C0793i(Context context) {
        this.f10084h = context;
        this.f10086k = LayoutInflater.from(context);
    }

    @Override // p052k.q
    public final boolean a(k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052k.q
    public final boolean b(u uVar) {
        boolean z5;
        if (uVar.hasVisibleItems()) {
            u uVar2 = uVar;
            while (true) {
                j jVar = uVar2.f9924v;
                if (jVar == this.f10085j) {
                    break;
                }
                uVar2 = (u) jVar;
            }
            ActionMenuView actionMenuView = this.f10089n;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = actionMenuView.getChildAt(i);
                    if ((childAt instanceof r) && ((r) childAt).getItemData() == uVar2.f9925w) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                uVar.f9925w.getClass();
                int size = uVar.f9853f.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z5 = false;
                        break;
                    }
                    MenuItem item = uVar.getItem(i3);
                    if (item.isVisible() && item.getIcon() != null) {
                        z5 = true;
                        break;
                    }
                    i3++;
                }
                C0787f c0787f = new C0787f(this, this.i, uVar, view);
                this.f10101z = c0787f;
                c0787f.f9902g = z5;
                l lVar = c0787f.i;
                if (lVar != null) {
                    lVar.o(z5);
                }
                C0787f c0787f2 = this.f10101z;
                if (!c0787f2.b()) {
                    if (c0787f2.f9900e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0787f2.d(0, 0, false, false);
                }
                p pVar = this.f10087l;
                if (pVar != null) {
                    pVar.i(uVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p052k.q
    public final void c(j jVar, boolean z5) {
        g();
        C0787f c0787f = this.f10101z;
        if (c0787f != null && c0787f.b()) {
            c0787f.i.dismiss();
        }
        p pVar = this.f10087l;
        if (pVar != null) {
            pVar.c(jVar, z5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View d(k kVar, View view, ActionMenuView actionMenuView) {
        r rVar;
        View view2 = kVar.f9893z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.f9892y & 8) != 0 && view2 != null)) {
            if (view instanceof r) {
                rVar = (r) view;
            } else {
                rVar = (r) this.f10086k.inflate(this.f10088m, (ViewGroup) actionMenuView, false);
            }
            rVar.a(kVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) rVar;
            actionMenuItemView.setItemInvoker(this.f10089n);
            if (this.f10082B == null) {
                this.f10082B = new C0789g(this);
            }
            actionMenuItemView.setPopupCallback(this.f10082B);
            view3 = (View) rVar;
        }
        view3.setVisibility(kVar.f9868B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0797k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // p052k.q
    public final boolean e(k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052k.q
    public final void f() {
        int i;
        ActionMenuView actionMenuView = this.f10089n;
        ArrayList arrayList = null;
        boolean z5 = false;
        if (actionMenuView != null) {
            j jVar = this.f10085j;
            if (jVar != null) {
                jVar.i();
                ArrayList arrayListK = this.f10085j.k();
                int size = arrayListK.size();
                i = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    k kVar = (k) arrayListK.get(i3);
                    if ((kVar.f9891x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i);
                        k itemData = childAt instanceof r ? ((r) childAt).getItemData() : null;
                        View viewD = d(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            viewD.setPressed(false);
                            viewD.jumpDrawablesToCurrentState();
                        }
                        if (viewD != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewD.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewD);
                            }
                            this.f10089n.addView(viewD, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i) == this.f10090o) {
                    i++;
                } else {
                    actionMenuView.removeViewAt(i);
                }
            }
        }
        this.f10089n.requestLayout();
        j jVar2 = this.f10085j;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.i;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((k) arrayList2.get(i6)).getClass();
            }
        }
        j jVar3 = this.f10085j;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f9856j;
        }
        if (this.f10093r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z5 = !((k) arrayList.get(0)).f9868B;
            } else if (size3 > 0) {
                z5 = true;
            }
        }
        if (z5) {
            if (this.f10090o == null) {
                this.f10090o = new C0791h(this, this.f10084h);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f10090o.getParent();
            if (viewGroup2 != this.f10089n) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f10090o);
                }
                ActionMenuView actionMenuView2 = this.f10089n;
                C0791h c0791h = this.f10090o;
                actionMenuView2.getClass();
                C0797k c0797kH = ActionMenuView.h();
                c0797kH.f10110a = true;
                actionMenuView2.addView(c0791h, c0797kH);
            }
        } else {
            C0791h c0791h2 = this.f10090o;
            if (c0791h2 != null) {
                ViewParent parent = c0791h2.getParent();
                ActionMenuView actionMenuView3 = this.f10089n;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f10090o);
                }
            }
        }
        this.f10089n.setOverflowReserved(this.f10093r);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        n nVar = this.f10081A;
        if (nVar != null && (actionMenuView = this.f10089n) != null) {
            actionMenuView.removeCallbacks(nVar);
            this.f10081A = null;
            return true;
        }
        C0787f c0787f = this.f10100y;
        if (c0787f == null) {
            return false;
        }
        if (c0787f.b()) {
            c0787f.i.dismiss();
        }
        return true;
    }

    @Override // p052k.q
    public final void h(p pVar) {
        throw null;
    }

    @Override // p052k.q
    public final void i(Context context, j jVar) {
        this.i = context;
        LayoutInflater.from(context);
        this.f10085j = jVar;
        Resources resources = context.getResources();
        if (!this.f10094s) {
            this.f10093r = true;
        }
        int i = 2;
        this.f10095t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i6 > 720) || (i3 > 720 && i6 > 960))) {
            i = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i6 > 480) || (i3 > 480 && i6 > 640))) {
            i = 4;
        } else if (i3 >= 360) {
            i = 3;
        }
        this.f10097v = i;
        int measuredWidth = this.f10095t;
        if (this.f10093r) {
            if (this.f10090o == null) {
                C0791h c0791h = new C0791h(this, this.f10084h);
                this.f10090o = c0791h;
                if (this.f10092q) {
                    c0791h.setImageDrawable(this.f10091p);
                    this.f10091p = null;
                    this.f10092q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f10090o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f10090o.getMeasuredWidth();
        } else {
            this.f10090o = null;
        }
        this.f10096u = measuredWidth;
        float f6 = resources.getDisplayMetrics().density;
    }

    @Override // p052k.q
    public final boolean j() {
        int size;
        ArrayList arrayListK;
        int i;
        boolean z5;
        C0793i c0793i = this;
        j jVar = c0793i.f10085j;
        if (jVar != null) {
            arrayListK = jVar.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i3 = c0793i.f10097v;
        int i6 = c0793i.f10096u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0793i.f10089n;
        int i7 = 0;
        boolean z6 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = 2;
            z5 = true;
            if (i7 >= size) {
                break;
            }
            k kVar = (k) arrayListK.get(i7);
            int i10 = kVar.f9892y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z6 = true;
            }
            if (c0793i.f10098w && kVar.f9868B) {
                i3 = 0;
            }
            i7++;
        }
        if (c0793i.f10093r && (z6 || i9 + i8 > i3)) {
            i3--;
        }
        int i11 = i3 - i8;
        SparseBooleanArray sparseBooleanArray = c0793i.f10099x;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            k kVar2 = (k) arrayListK.get(i12);
            int i14 = kVar2.f9892y;
            boolean z7 = (i14 & 2) == i ? z5 : false;
            int i15 = kVar2.f9870b;
            if (z7) {
                View viewD = c0793i.d(kVar2, null, actionMenuView);
                viewD.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewD.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z5);
                }
                kVar2.d(z5);
            } else {
                if ((i14 & 1) == z5) {
                    boolean z8 = sparseBooleanArray.get(i15);
                    boolean z9 = ((i11 > 0 || z8) && i6 > 0) ? z5 : false;
                    if (z9) {
                        View viewD2 = c0793i.d(kVar2, null, actionMenuView);
                        viewD2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewD2.getMeasuredWidth();
                        i6 -= measuredWidth2;
                        if (i13 == 0) {
                            i13 = measuredWidth2;
                        }
                        z9 &= i6 + i13 > 0;
                    }
                    if (z9 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z8) {
                        sparseBooleanArray.put(i15, false);
                        for (int i16 = 0; i16 < i12; i16++) {
                            k kVar3 = (k) arrayListK.get(i16);
                            if (kVar3.f9870b == i15) {
                                if ((kVar3.f9891x & 32) == 32) {
                                    i11++;
                                }
                                kVar3.d(false);
                            }
                        }
                    }
                    if (z9) {
                        i11--;
                    }
                    kVar2.d(z9);
                } else {
                    kVar2.d(false);
                }
                i12++;
                i = 2;
                c0793i = this;
                z5 = true;
            }
            i12++;
            i = 2;
            c0793i = this;
            z5 = true;
        }
        return z5;
    }

    public final boolean k() {
        j jVar;
        if (!this.f10093r) {
            return false;
        }
        C0787f c0787f = this.f10100y;
        if ((c0787f != null && c0787f.b()) || (jVar = this.f10085j) == null || this.f10089n == null || this.f10081A != null) {
            return false;
        }
        jVar.i();
        if (jVar.f9856j.isEmpty()) {
            return false;
        }
        n nVar = new n(13, (Object) this, (Object) new C0787f(this, this.i, this.f10085j, this.f10090o), false);
        this.f10081A = nVar;
        this.f10089n.post(nVar);
        return true;
    }
}
