package p057l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import h.a;
import p015c2.AbstractC0473d;
import p035g0.C0715p;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p052k.k;
import p052k.l;
import p052k.s;
import p070n1.j;

/* JADX INFO: renamed from: l.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0788f0 implements InterfaceC0778a0, s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Rect f10049A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10050B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0810s f10051C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0715p f10052D;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f10053h;
    public ListAdapter i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0786e0 f10054j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10060p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f10062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f10063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f10064t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f10069y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10055k = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10061q = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final W f10065u = new W(this, 1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Z f10066v = new Z(this);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Y f10067w = new Y(this);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final W f10068x = new W(this, 0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f10070z = new Rect();

    public C0788f0(Context context, int i) {
        int resourceId;
        this.f10053h = context;
        this.f10069y = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f9201k, i, 0);
        this.f10056l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f10057m = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f10058n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0810s c0810s = new C0810s(context, null, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, a.f9205o, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            j.c(c0810s, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0810s.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0473d.z(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f10051C = c0810s;
        c0810s.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        X x6 = this.f10062r;
        if (x6 == null) {
            this.f10062r = new X(0, this);
        } else {
            ListAdapter listAdapter2 = this.i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(x6);
            }
        }
        this.i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f10062r);
        }
        C0786e0 c0786e0 = this.f10054j;
        if (c0786e0 != null) {
            c0786e0.setAdapter(this.i);
        }
    }

    @Override // p052k.s
    public final void d() {
        int i;
        int iMakeMeasureSpec;
        C0786e0 c0786e0;
        C0786e0 c0786e1 = this.f10054j;
        C0810s c0810s = this.f10051C;
        Context context = this.f10053h;
        if (c0786e1 == null) {
            C0786e0 c0786e2 = new C0786e0(context, !this.f10050B);
            c0786e2.setHoverListener(this);
            this.f10054j = c0786e2;
            c0786e2.setAdapter(this.i);
            this.f10054j.setOnItemClickListener(this.f10064t);
            this.f10054j.setFocusable(true);
            this.f10054j.setFocusableInTouchMode(true);
            this.f10054j.setOnItemSelectedListener(new T(0, this));
            this.f10054j.setOnScrollListener(this.f10067w);
            c0810s.setContentView(this.f10054j);
        }
        Drawable background = c0810s.getBackground();
        Rect rect = this.f10070z;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.f10058n) {
                this.f10057m = -i3;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = U.a(c0810s, this.f10063s, this.f10057m, c0810s.getInputMethodMode() == 2);
        int i6 = this.f10055k;
        if (i6 != -2) {
            iMakeMeasureSpec = i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA2 = this.f10054j.a(iMakeMeasureSpec, iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.f10054j.getPaddingBottom() + this.f10054j.getPaddingTop() + i : 0);
        this.f10051C.getInputMethodMode();
        j.d(c0810s, 1002);
        if (c0810s.isShowing()) {
            View view = this.f10063s;
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            if (view.isAttachedToWindow()) {
                int width = this.f10055k;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f10063s.getWidth();
                }
                c0810s.setOutsideTouchable(true);
                c0810s.update(this.f10063s, this.f10056l, this.f10057m, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.f10055k;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f10063s.getWidth();
        }
        c0810s.setWidth(width2);
        c0810s.setHeight(paddingBottom);
        V.b(c0810s, true);
        c0810s.setOutsideTouchable(true);
        c0810s.setTouchInterceptor(this.f10066v);
        if (this.f10060p) {
            j.c(c0810s, this.f10059o);
        }
        V.a(c0810s, this.f10049A);
        c0810s.showAsDropDown(this.f10063s, this.f10056l, this.f10057m, this.f10061q);
        this.f10054j.setSelection(-1);
        if ((!this.f10050B || this.f10054j.isInTouchMode()) && (c0786e0 = this.f10054j) != null) {
            c0786e0.setListSelectionHidden(true);
            c0786e0.requestLayout();
        }
        if (this.f10050B) {
            return;
        }
        this.f10069y.post(this.f10068x);
    }

    @Override // p052k.s
    public final void dismiss() {
        C0810s c0810s = this.f10051C;
        c0810s.dismiss();
        c0810s.setContentView(null);
        this.f10054j = null;
        this.f10069y.removeCallbacks(this.f10065u);
    }

    @Override // p057l.InterfaceC0778a0
    public final void e(p052k.j jVar, k kVar) {
        C0715p c0715p = this.f10052D;
        if (c0715p != null) {
            c0715p.e(jVar, kVar);
        }
    }

    @Override // p052k.s
    public final ListView g() {
        return this.f10054j;
    }

    @Override // p057l.InterfaceC0778a0
    public final void h(p052k.j jVar, k kVar) {
        C0715p c0715p = this.f10052D;
        if (c0715p != null) {
            c0715p.h(jVar, kVar);
        }
    }

    @Override // p052k.s
    public final boolean k() {
        return this.f10051C.isShowing();
    }
}
