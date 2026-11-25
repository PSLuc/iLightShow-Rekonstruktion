package androidx.appcompat.widget;

import B.C0031p0;
import L2.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p015c2.AbstractC0473d;
import p035g0.C0715p;
import p045i1.AbstractC0762x;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p052k.j;
import p052k.k;
import p057l.A;
import p057l.C0787f;
import p057l.C0793i;
import p057l.C0796j0;
import p057l.C0809q;
import p057l.D0;
import p057l.E0;
import p057l.F0;
import p057l.G;
import p057l.G0;
import p057l.H0;
import p057l.I0;
import p057l.J0;
import p057l.K0;
import p057l.L0;
import p057l.M0;
import p057l.P0;
import p057l.r;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0796j0 f6509A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f6510B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f6511C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f6512D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f6513E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f6514F;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public boolean J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ArrayList f6515K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final ArrayList f6516L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int[] f6517M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C0715p f6518N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f6519O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final E0 f6520P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public L0 f6521Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public H0 f6522R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f6523S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public OnBackInvokedCallback f6524T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public OnBackInvokedDispatcher f6525U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6526V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final o f6527W;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMenuView f6528h;
    public A i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public A f6529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0809q f6530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f6531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Drawable f6532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CharSequence f6533n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0809q f6534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f6535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f6536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6540u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6541v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6543x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6544y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f6545z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f6512D = 8388627;
        this.f6515K = new ArrayList();
        this.f6516L = new ArrayList();
        this.f6517M = new int[2];
        this.f6518N = new C0715p(new D0(this, 1));
        this.f6519O = new ArrayList();
        this.f6520P = new E0(this);
        this.f6527W = new o(7, this);
        Context context2 = getContext();
        int[] iArr = h.a.f9209s;
        C0031p0 c0031p0O = C0031p0.o(context2, attributeSet, iArr, R.attr.toolbarStyle);
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
        AbstractC0762x.d(this, context, iArr, attributeSet, (TypedArray) c0031p0O.f394j, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) c0031p0O.f394j;
        this.f6538s = typedArray.getResourceId(28, 0);
        this.f6539t = typedArray.getResourceId(19, 0);
        this.f6512D = typedArray.getInteger(0, 8388627);
        this.f6540u = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f6545z = dimensionPixelOffset;
        this.f6544y = dimensionPixelOffset;
        this.f6543x = dimensionPixelOffset;
        this.f6542w = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f6542w = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f6543x = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f6544y = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f6545z = dimensionPixelOffset5;
        }
        this.f6541v = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0796j0 c0796j0 = this.f6509A;
        c0796j0.f10109h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0796j0.f10106e = dimensionPixelSize;
            c0796j0.f10102a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0796j0.f10107f = dimensionPixelSize2;
            c0796j0.f10103b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0796j0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f6510B = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f6511C = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f6532m = c0031p0O.h(4);
        this.f6533n = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f6536q = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableH = c0031p0O.h(16);
        if (drawableH != null) {
            setNavigationIcon(drawableH);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableH2 = c0031p0O.h(11);
        if (drawableH2 != null) {
            setLogo(drawableH2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0031p0O.g(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0031p0O.g(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0031p0O.p();
    }

    public static I0 g() {
        I0 i3 = new I0(-2, -2);
        i3.f9985b = 0;
        i3.f9984a = 8388627;
        return i3;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.d(getContext());
    }

    public static I0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z5 = layoutParams instanceof I0;
        if (z5) {
            I0 i3 = (I0) layoutParams;
            I0 i6 = new I0(i3);
            i6.f9985b = 0;
            i6.f9985b = i3.f9985b;
            return i6;
        }
        if (z5) {
            I0 i7 = new I0((I0) layoutParams);
            i7.f9985b = 0;
            return i7;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            I0 i8 = new I0(layoutParams);
            i8.f9985b = 0;
            return i8;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        I0 i9 = new I0(marginLayoutParams);
        i9.f9985b = 0;
        ((ViewGroup.MarginLayoutParams) i9).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) i9).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) i9).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) i9).bottomMargin = marginLayoutParams.bottomMargin;
        return i9;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z5) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                I0 i6 = (I0) childAt.getLayoutParams();
                if (i6.f9985b == 0 && r(childAt)) {
                    int i7 = i6.f9984a;
                    ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q2 = p045i1.A.f9394a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            View childAt2 = getChildAt(i8);
            I0 i9 = (I0) childAt2.getLayoutParams();
            if (i9.f9985b == 0 && r(childAt2)) {
                int i10 = i9.f9984a;
                ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q3 = p045i1.A.f9394a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z5) {
        I0 i0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            i0H = g();
        } else {
            i0H = !checkLayoutParams(layoutParams) ? h(layoutParams) : (I0) layoutParams;
        }
        i0H.f9985b = 1;
        if (!z5 || this.f6535p == null) {
            addView(view, i0H);
        } else {
            view.setLayoutParams(i0H);
            this.f6516L.add(view);
        }
    }

    public final void c() {
        if (this.f6534o == null) {
            C0809q c0809q = new C0809q(getContext());
            this.f6534o = c0809q;
            c0809q.setImageDrawable(this.f6532m);
            this.f6534o.setContentDescription(this.f6533n);
            I0 i0G = g();
            i0G.f9984a = (this.f6540u & 112) | 8388611;
            i0G.f9985b = 2;
            this.f6534o.setLayoutParams(i0G);
            this.f6534o.setOnClickListener(new F0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof I0);
    }

    public final void d() {
        if (this.f6509A == null) {
            C0796j0 c0796j0 = new C0796j0();
            c0796j0.f10102a = 0;
            c0796j0.f10103b = 0;
            c0796j0.f10104c = Integer.MIN_VALUE;
            c0796j0.f10105d = Integer.MIN_VALUE;
            c0796j0.f10106e = 0;
            c0796j0.f10107f = 0;
            c0796j0.f10108g = false;
            c0796j0.f10109h = false;
            this.f6509A = c0796j0;
        }
    }

    public final void e() {
        if (this.f6528h == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f6528h = actionMenuView;
            actionMenuView.setPopupTheme(this.f6537r);
            this.f6528h.setOnMenuItemClickListener(this.f6520P);
            ActionMenuView actionMenuView2 = this.f6528h;
            E0 e6 = new E0(this);
            actionMenuView2.getClass();
            actionMenuView2.f6449A = e6;
            I0 i0G = g();
            i0G.f9984a = (this.f6540u & 112) | 8388613;
            this.f6528h.setLayoutParams(i0G);
            b(this.f6528h, false);
        }
        ActionMenuView actionMenuView3 = this.f6528h;
        if (actionMenuView3.f6455w == null) {
            j jVar = (j) actionMenuView3.getMenu();
            if (this.f6522R == null) {
                this.f6522R = new H0(this);
            }
            this.f6528h.setExpandedActionViewsExclusive(true);
            jVar.b(this.f6522R, this.f6536q);
            s();
        }
    }

    public final void f() {
        if (this.f6530k == null) {
            this.f6530k = new C0809q(getContext());
            I0 i0G = g();
            i0G.f9984a = (this.f6540u & 112) | 8388611;
            this.f6530k.setLayoutParams(i0G);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0809q c0809q = this.f6534o;
        if (c0809q != null) {
            return c0809q.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0809q c0809q = this.f6534o;
        if (c0809q != null) {
            return c0809q.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0796j0 c0796j0 = this.f6509A;
        if (c0796j0 != null) {
            return c0796j0.f10108g ? c0796j0.f10102a : c0796j0.f10103b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f6511C;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0796j0 c0796j0 = this.f6509A;
        if (c0796j0 != null) {
            return c0796j0.f10102a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0796j0 c0796j0 = this.f6509A;
        if (c0796j0 != null) {
            return c0796j0.f10103b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0796j0 c0796j0 = this.f6509A;
        if (c0796j0 != null) {
            return c0796j0.f10108g ? c0796j0.f10103b : c0796j0.f10102a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f6510B;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j jVar;
        ActionMenuView actionMenuView = this.f6528h;
        return (actionMenuView == null || (jVar = actionMenuView.f6455w) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f6511C, 0));
    }

    public int getCurrentContentInsetLeft() {
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f6510B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        r rVar = this.f6531l;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        r rVar = this.f6531l;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f6528h.getMenu();
    }

    public View getNavButtonView() {
        return this.f6530k;
    }

    public CharSequence getNavigationContentDescription() {
        C0809q c0809q = this.f6530k;
        if (c0809q != null) {
            return c0809q.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0809q c0809q = this.f6530k;
        if (c0809q != null) {
            return c0809q.getDrawable();
        }
        return null;
    }

    public C0793i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f6528h.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f6536q;
    }

    public int getPopupTheme() {
        return this.f6537r;
    }

    public CharSequence getSubtitle() {
        return this.f6514F;
    }

    public final TextView getSubtitleTextView() {
        return this.f6529j;
    }

    public CharSequence getTitle() {
        return this.f6513E;
    }

    public int getTitleMarginBottom() {
        return this.f6545z;
    }

    public int getTitleMarginEnd() {
        return this.f6543x;
    }

    public int getTitleMarginStart() {
        return this.f6542w;
    }

    public int getTitleMarginTop() {
        return this.f6544y;
    }

    public final TextView getTitleTextView() {
        return this.i;
    }

    public G getWrapper() {
        Drawable drawable;
        if (this.f6521Q == null) {
            L0 l6 = new L0();
            l6.f10003l = 0;
            l6.f9993a = this;
            l6.f10000h = getTitle();
            l6.i = getSubtitle();
            l6.f9999g = l6.f10000h != null;
            l6.f9998f = getNavigationIcon();
            C0031p0 c0031p0O = C0031p0.o(getContext(), null, h.a.f9192a, R.attr.actionBarStyle);
            l6.f10004m = c0031p0O.h(15);
            TypedArray typedArray = (TypedArray) c0031p0O.f394j;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                l6.f9999g = true;
                l6.f10000h = text;
                if ((l6.f9994b & 8) != 0) {
                    Toolbar toolbar = l6.f9993a;
                    toolbar.setTitle(text);
                    if (l6.f9999g) {
                        p045i1.A.b(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                l6.i = text2;
                if ((l6.f9994b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableH = c0031p0O.h(20);
            if (drawableH != null) {
                l6.f9997e = drawableH;
                l6.c();
            }
            Drawable drawableH2 = c0031p0O.h(17);
            if (drawableH2 != null) {
                l6.f9996d = drawableH2;
                l6.c();
            }
            if (l6.f9998f == null && (drawable = l6.f10004m) != null) {
                l6.f9998f = drawable;
                int i = l6.f9994b & 4;
                Toolbar toolbar2 = l6.f9993a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            l6.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = l6.f9995c;
                if (view != null && (l6.f9994b & 16) != 0) {
                    removeView(view);
                }
                l6.f9995c = viewInflate;
                if (viewInflate != null && (l6.f9994b & 16) != 0) {
                    addView(viewInflate);
                }
                l6.a(l6.f9994b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f6509A.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f6538s = resourceId2;
                A a6 = this.i;
                if (a6 != null) {
                    a6.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f6539t = resourceId3;
                A a7 = this.f6529j;
                if (a7 != null) {
                    a7.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0031p0O.p();
            if (R.string.abc_action_bar_up_description != l6.f10003l) {
                l6.f10003l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = l6.f10003l;
                    l6.f10001j = i3 != 0 ? getContext().getString(i3) : null;
                    l6.b();
                }
            }
            l6.f10001j = getNavigationContentDescription();
            setNavigationOnClickListener(new F0(l6));
            this.f6521Q = l6;
        }
        return this.f6521Q;
    }

    public final int i(View view, int i) {
        I0 i3 = (I0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i7 = i3.f9984a & 112;
        if (i7 != 16 && i7 != 48 && i7 != 80) {
            i7 = this.f6512D & 112;
        }
        if (i7 == 48) {
            return getPaddingTop() - i6;
        }
        if (i7 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) i3).bottomMargin) - i6;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i8 = ((ViewGroup.MarginLayoutParams) i3).topMargin;
        if (iMax < i8) {
            iMax = i8;
        } else {
            int i9 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i10 = ((ViewGroup.MarginLayoutParams) i3).bottomMargin;
            if (i9 < i10) {
                iMax = Math.max(0, iMax - (i10 - i9));
            }
        }
        return paddingTop + iMax;
    }

    public final void l() {
        ArrayList arrayList = this.f6519O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f6518N.i).iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f6519O = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f6516L.contains(view);
    }

    public final int n(View view, int i, int i3, int[] iArr) {
        I0 i6 = (I0) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) i6).leftMargin - iArr[0];
        int iMax = Math.max(0, i7) + i;
        iArr[0] = Math.max(0, -i7);
        int i8 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i8, iMax + measuredWidth, view.getMeasuredHeight() + i8);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) i6).rightMargin + iMax;
    }

    public final int o(View view, int i, int i3, int[] iArr) {
        I0 i6 = (I0) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) i6).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i7);
        iArr[1] = Math.max(0, -i7);
        int i8 = i(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i8, iMax, view.getMeasuredHeight() + i8);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) i6).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f6527W);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.J = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0286  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295 A[LOOP:0: B:104:0x0293->B:105:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad A[LOOP:1: B:107:0x02ab->B:108:0x02ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02cd A[LOOP:2: B:110:0x02cb->B:111:0x02cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0313 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0315  */
    /* JADX WARN: Code duplicated, block: B:117:0x0319  */
    /* JADX WARN: Code duplicated, block: B:120:0x0321 A[LOOP:3: B:119:0x031f->B:120:0x0321, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:89:0x021c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0222  */
    /* JADX WARN: Code duplicated, block: B:95:0x0236  */
    /* JADX WARN: Code duplicated, block: B:96:0x0259  */
    /* JADX WARN: Code duplicated, block: B:98:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x027e  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i3, int i6, int i7) {
        int iN;
        int iO;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        A a6;
        A a7;
        I0 i8;
        I0 i9;
        int i10;
        boolean z6;
        int i11;
        boolean z7;
        int paddingTop;
        int i12;
        int iMax2;
        int i13;
        int i14;
        int iMax3;
        int i15;
        int i16;
        int i17;
        int iMax4;
        int i18;
        int i19;
        int i20;
        int i21;
        ArrayList arrayList;
        int size;
        int iN2;
        int i22;
        int size2;
        int i23;
        int i24;
        int size3;
        int i25;
        int i26;
        int measuredWidth;
        int i27;
        int i28;
        int size4;
        int i29;
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
        boolean z8 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i30 = width - paddingRight;
        int[] iArr = this.f6517M;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i7 - i3) : 0;
        if (r(this.f6530k)) {
            if (z8) {
                iO = o(this.f6530k, i30, iMin2, iArr);
                iN = paddingLeft;
            } else {
                iN = n(this.f6530k, paddingLeft, iMin2, iArr);
            }
            if (r(this.f6534o)) {
                if (z8) {
                    iO = o(this.f6534o, iO, iMin2, iArr);
                } else {
                    iN = n(this.f6534o, iN, iMin2, iArr);
                }
            }
            if (r(this.f6528h)) {
                if (z8) {
                    iN = n(this.f6528h, iN, iMin2, iArr);
                } else {
                    iO = o(this.f6528h, iO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iN);
            iArr[1] = Math.max(0, currentContentInsetRight - (i30 - iO));
            iMax = Math.max(iN, currentContentInsetLeft);
            iMin = Math.min(iO, i30 - currentContentInsetRight);
            if (r(this.f6535p)) {
                if (z8) {
                    iMin = o(this.f6535p, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.f6535p, iMax, iMin2, iArr);
                }
            }
            if (r(this.f6531l)) {
                if (z8) {
                    iMin = o(this.f6531l, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.f6531l, iMax, iMin2, iArr);
                }
            }
            zR = r(this.i);
            zR2 = r(this.f6529j);
            if (zR) {
                I0 i31 = (I0) this.i.getLayoutParams();
                measuredHeight = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i31).topMargin + ((ViewGroup.MarginLayoutParams) i31).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                I0 i32 = (I0) this.f6529j.getLayoutParams();
                measuredHeight = this.f6529j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i32).topMargin + ((ViewGroup.MarginLayoutParams) i32).bottomMargin + measuredHeight;
            }
            if (!zR || zR2) {
                if (zR) {
                    a6 = this.i;
                } else {
                    a6 = this.f6529j;
                }
                if (zR2) {
                    a7 = this.f6529j;
                } else {
                    a7 = this.i;
                }
                i8 = (I0) a6.getLayoutParams();
                i9 = (I0) a7.getLayoutParams();
                i10 = measuredHeight;
                z6 = (!zR && this.i.getMeasuredWidth() > 0) || (zR2 && this.f6529j.getMeasuredWidth() > 0);
                i11 = this.f6512D & 112;
                z7 = z8;
                if (i11 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i8).topMargin + this.f6544y;
                } else if (i11 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - i10) / 2;
                    i18 = ((ViewGroup.MarginLayoutParams) i8).topMargin + this.f6544y;
                    if (iMax4 < i18) {
                        iMax4 = i18;
                    } else {
                        i19 = (((height - paddingBottom) - i10) - iMax4) - paddingTop2;
                        i20 = ((ViewGroup.MarginLayoutParams) i8).bottomMargin;
                        i21 = this.f6545z;
                        if (i19 < i20 + i21) {
                            iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) i9).bottomMargin + i21) - i19));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i9).bottomMargin) - this.f6545z) - i10;
                }
                if (z7) {
                    if (z6) {
                        i15 = this.f6542w;
                    } else {
                        i15 = 0;
                    }
                    int i33 = i15 - iArr[1];
                    iMin -= Math.max(0, i33);
                    iArr[1] = Math.max(0, -i33);
                    if (zR) {
                        I0 i34 = (I0) this.i.getLayoutParams();
                        int measuredWidth2 = iMin - this.i.getMeasuredWidth();
                        int measuredHeight2 = this.i.getMeasuredHeight() + paddingTop;
                        this.i.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i16 = measuredWidth2 - this.f6543x;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) i34).bottomMargin;
                    } else {
                        i16 = iMin;
                    }
                    if (zR2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((I0) this.f6529j.getLayoutParams())).topMargin;
                        this.f6529j.layout(iMin - this.f6529j.getMeasuredWidth(), i35, iMin, this.f6529j.getMeasuredHeight() + i35);
                        i17 = iMin - this.f6543x;
                    } else {
                        i17 = iMin;
                    }
                    if (z6) {
                        iMin = Math.min(i16, i17);
                    }
                    iMax3 = iMax;
                } else {
                    if (z6) {
                        i12 = this.f6542w;
                    } else {
                        i12 = 0;
                    }
                    int i36 = i12 - iArr[0];
                    iMax2 = Math.max(0, i36) + iMax;
                    iArr[0] = Math.max(0, -i36);
                    if (zR) {
                        I0 i37 = (I0) this.i.getLayoutParams();
                        int measuredWidth3 = this.i.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.i.getMeasuredHeight() + paddingTop;
                        this.i.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i13 = measuredWidth3 + this.f6543x;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) i37).bottomMargin;
                    } else {
                        i13 = iMax2;
                    }
                    if (zR2) {
                        int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((I0) this.f6529j.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f6529j.getMeasuredWidth() + iMax2;
                        this.f6529j.layout(iMax2, i38, measuredWidth4, this.f6529j.getMeasuredHeight() + i38);
                        i14 = measuredWidth4 + this.f6543x;
                    } else {
                        i14 = iMax2;
                    }
                    if (z6) {
                        iMax3 = Math.max(i13, i14);
                    } else {
                        iMax3 = iMax2;
                    }
                }
            } else {
                iMax3 = iMax;
            }
            arrayList = this.f6515K;
            a(3, arrayList);
            size = arrayList.size();
            iN2 = iMax3;
            for (i22 = 0; i22 < size; i22++) {
                iN2 = n((View) arrayList.get(i22), iN2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i23 = 0; i23 < size2; i23++) {
                iMin = o((View) arrayList.get(i23), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i39 = iArr[0];
            i24 = iArr[1];
            size3 = arrayList.size();
            i25 = i39;
            i26 = 0;
            measuredWidth = 0;
            while (i26 < size3) {
                View view = (View) arrayList.get(i26);
                I0 i40 = (I0) view.getLayoutParams();
                int i41 = i24;
                int i42 = ((ViewGroup.MarginLayoutParams) i40).leftMargin - i25;
                int i43 = ((ViewGroup.MarginLayoutParams) i40).rightMargin - i41;
                int iMax5 = Math.max(0, i42);
                int iMax6 = Math.max(0, i43);
                int iMax7 = Math.max(0, -i42);
                int iMax8 = Math.max(0, -i43);
                measuredWidth += view.getMeasuredWidth() + iMax5 + iMax6;
                i26++;
                i25 = iMax7;
                i24 = iMax8;
            }
            i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i28 = measuredWidth + i27;
            if (i27 >= iN2) {
                if (i28 > iMin) {
                    iN2 = i27 - (i28 - iMin);
                } else {
                    iN2 = i27;
                }
            }
            size4 = arrayList.size();
            for (i29 = 0; i29 < size4; i29++) {
                iN2 = n((View) arrayList.get(i29), iN2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iN = paddingLeft;
        iO = i30;
        if (r(this.f6534o)) {
            if (z8) {
                iO = o(this.f6534o, iO, iMin2, iArr);
            } else {
                iN = n(this.f6534o, iN, iMin2, iArr);
            }
        }
        if (r(this.f6528h)) {
            if (z8) {
                iN = n(this.f6528h, iN, iMin2, iArr);
            } else {
                iO = o(this.f6528h, iO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iN);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i30 - iO));
        iMax = Math.max(iN, currentContentInsetLeft2);
        iMin = Math.min(iO, i30 - currentContentInsetRight2);
        if (r(this.f6535p)) {
            if (z8) {
                iMin = o(this.f6535p, iMin, iMin2, iArr);
            } else {
                iMax = n(this.f6535p, iMax, iMin2, iArr);
            }
        }
        if (r(this.f6531l)) {
            if (z8) {
                iMin = o(this.f6531l, iMin, iMin2, iArr);
            } else {
                iMax = n(this.f6531l, iMax, iMin2, iArr);
            }
        }
        zR = r(this.i);
        zR2 = r(this.f6529j);
        if (zR) {
            I0 i310 = (I0) this.i.getLayoutParams();
            measuredHeight = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i310).topMargin + ((ViewGroup.MarginLayoutParams) i310).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            I0 i311 = (I0) this.f6529j.getLayoutParams();
            measuredHeight = this.f6529j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) i311).topMargin + ((ViewGroup.MarginLayoutParams) i311).bottomMargin + measuredHeight;
        }
        if (zR) {
            if (zR) {
                a6 = this.i;
            } else {
                a6 = this.f6529j;
            }
            if (zR2) {
                a7 = this.f6529j;
            } else {
                a7 = this.i;
            }
            i8 = (I0) a6.getLayoutParams();
            i9 = (I0) a7.getLayoutParams();
            i10 = measuredHeight;
            if (zR) {
            }
            i11 = this.f6512D & 112;
            z7 = z8;
            if (i11 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i8).topMargin + this.f6544y;
            } else if (i11 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - i10) / 2;
                i18 = ((ViewGroup.MarginLayoutParams) i8).topMargin + this.f6544y;
                if (iMax4 < i18) {
                    iMax4 = i18;
                } else {
                    i19 = (((height - paddingBottom) - i10) - iMax4) - paddingTop2;
                    i20 = ((ViewGroup.MarginLayoutParams) i8).bottomMargin;
                    i21 = this.f6545z;
                    if (i19 < i20 + i21) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) i9).bottomMargin + i21) - i19));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i9).bottomMargin) - this.f6545z) - i10;
            }
            if (z7) {
                if (z6) {
                    i15 = this.f6542w;
                } else {
                    i15 = 0;
                }
                int i312 = i15 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zR) {
                    I0 i313 = (I0) this.i.getLayoutParams();
                    int measuredWidth5 = iMin - this.i.getMeasuredWidth();
                    int measuredHeight4 = this.i.getMeasuredHeight() + paddingTop;
                    this.i.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i16 = measuredWidth5 - this.f6543x;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) i313).bottomMargin;
                } else {
                    i16 = iMin;
                }
                if (zR2) {
                    int i314 = paddingTop + ((ViewGroup.MarginLayoutParams) ((I0) this.f6529j.getLayoutParams())).topMargin;
                    this.f6529j.layout(iMin - this.f6529j.getMeasuredWidth(), i314, iMin, this.f6529j.getMeasuredHeight() + i314);
                    i17 = iMin - this.f6543x;
                } else {
                    i17 = iMin;
                }
                if (z6) {
                    iMin = Math.min(i16, i17);
                }
                iMax3 = iMax;
            } else {
                if (z6) {
                    i12 = this.f6542w;
                } else {
                    i12 = 0;
                }
                int i315 = i12 - iArr[0];
                iMax2 = Math.max(0, i315) + iMax;
                iArr[0] = Math.max(0, -i315);
                if (zR) {
                    I0 i316 = (I0) this.i.getLayoutParams();
                    int measuredWidth6 = this.i.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.i.getMeasuredHeight() + paddingTop;
                    this.i.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i13 = measuredWidth6 + this.f6543x;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) i316).bottomMargin;
                } else {
                    i13 = iMax2;
                }
                if (zR2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((I0) this.f6529j.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f6529j.getMeasuredWidth() + iMax2;
                    this.f6529j.layout(iMax2, i317, measuredWidth7, this.f6529j.getMeasuredHeight() + i317);
                    i14 = measuredWidth7 + this.f6543x;
                } else {
                    i14 = iMax2;
                }
                if (z6) {
                    iMax3 = Math.max(i13, i14);
                } else {
                    iMax3 = iMax2;
                }
            }
        } else {
            if (zR) {
                a6 = this.i;
            } else {
                a6 = this.f6529j;
            }
            if (zR2) {
                a7 = this.f6529j;
            } else {
                a7 = this.i;
            }
            i8 = (I0) a6.getLayoutParams();
            i9 = (I0) a7.getLayoutParams();
            i10 = measuredHeight;
            if (zR) {
            }
            i11 = this.f6512D & 112;
            z7 = z8;
            if (i11 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) i8).topMargin + this.f6544y;
            } else if (i11 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - i10) / 2;
                i18 = ((ViewGroup.MarginLayoutParams) i8).topMargin + this.f6544y;
                if (iMax4 < i18) {
                    iMax4 = i18;
                } else {
                    i19 = (((height - paddingBottom) - i10) - iMax4) - paddingTop2;
                    i20 = ((ViewGroup.MarginLayoutParams) i8).bottomMargin;
                    i21 = this.f6545z;
                    if (i19 < i20 + i21) {
                        iMax4 = Math.max(0, iMax4 - ((((ViewGroup.MarginLayoutParams) i9).bottomMargin + i21) - i19));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) i9).bottomMargin) - this.f6545z) - i10;
            }
            if (z7) {
                if (z6) {
                    i15 = this.f6542w;
                } else {
                    i15 = 0;
                }
                int i318 = i15 - iArr[1];
                iMin -= Math.max(0, i318);
                iArr[1] = Math.max(0, -i318);
                if (zR) {
                    I0 i319 = (I0) this.i.getLayoutParams();
                    int measuredWidth8 = iMin - this.i.getMeasuredWidth();
                    int measuredHeight6 = this.i.getMeasuredHeight() + paddingTop;
                    this.i.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i16 = measuredWidth8 - this.f6543x;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) i319).bottomMargin;
                } else {
                    i16 = iMin;
                }
                if (zR2) {
                    int i3110 = paddingTop + ((ViewGroup.MarginLayoutParams) ((I0) this.f6529j.getLayoutParams())).topMargin;
                    this.f6529j.layout(iMin - this.f6529j.getMeasuredWidth(), i3110, iMin, this.f6529j.getMeasuredHeight() + i3110);
                    i17 = iMin - this.f6543x;
                } else {
                    i17 = iMin;
                }
                if (z6) {
                    iMin = Math.min(i16, i17);
                }
                iMax3 = iMax;
            } else {
                if (z6) {
                    i12 = this.f6542w;
                } else {
                    i12 = 0;
                }
                int i3111 = i12 - iArr[0];
                iMax2 = Math.max(0, i3111) + iMax;
                iArr[0] = Math.max(0, -i3111);
                if (zR) {
                    I0 i3112 = (I0) this.i.getLayoutParams();
                    int measuredWidth9 = this.i.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.i.getMeasuredHeight() + paddingTop;
                    this.i.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i13 = measuredWidth9 + this.f6543x;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) i3112).bottomMargin;
                } else {
                    i13 = iMax2;
                }
                if (zR2) {
                    int i3113 = paddingTop + ((ViewGroup.MarginLayoutParams) ((I0) this.f6529j.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f6529j.getMeasuredWidth() + iMax2;
                    this.f6529j.layout(iMax2, i3113, measuredWidth10, this.f6529j.getMeasuredHeight() + i3113);
                    i14 = measuredWidth10 + this.f6543x;
                } else {
                    i14 = iMax2;
                }
                if (z6) {
                    iMax3 = Math.max(i13, i14);
                } else {
                    iMax3 = iMax2;
                }
            }
        }
        arrayList = this.f6515K;
        a(3, arrayList);
        size = arrayList.size();
        iN2 = iMax3;
        while (i22 < size) {
            iN2 = n((View) arrayList.get(i22), iN2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i23 < size2) {
            iMin = o((View) arrayList.get(i23), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i320 = iArr[0];
        i24 = iArr[1];
        size3 = arrayList.size();
        i25 = i320;
        i26 = 0;
        measuredWidth = 0;
        while (i26 < size3) {
            View view2 = (View) arrayList.get(i26);
            I0 i44 = (I0) view2.getLayoutParams();
            int i45 = i24;
            int i46 = ((ViewGroup.MarginLayoutParams) i44).leftMargin - i25;
            int i47 = ((ViewGroup.MarginLayoutParams) i44).rightMargin - i45;
            int iMax9 = Math.max(0, i46);
            int iMax10 = Math.max(0, i47);
            int iMax11 = Math.max(0, -i46);
            int iMax12 = Math.max(0, -i47);
            measuredWidth += view2.getMeasuredWidth() + iMax9 + iMax10;
            i26++;
            i25 = iMax11;
            i24 = iMax12;
        }
        i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i28 = measuredWidth + i27;
        if (i27 >= iN2) {
            if (i28 > iMin) {
                iN2 = i27 - (i28 - iMin);
            } else {
                iN2 = i27;
            }
        }
        size4 = arrayList.size();
        while (i29 < size4) {
            iN2 = n((View) arrayList.get(i29), iN2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = P0.a(this);
        int i6 = !zA ? 1 : 0;
        int i7 = 0;
        if (r(this.f6530k)) {
            q(this.f6530k, i, 0, i3, this.f6541v);
            iJ = j(this.f6530k) + this.f6530k.getMeasuredWidth();
            iMax = Math.max(0, k(this.f6530k) + this.f6530k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f6530k.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.f6534o)) {
            q(this.f6534o, i, 0, i3, this.f6541v);
            iJ = j(this.f6534o) + this.f6534o.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f6534o) + this.f6534o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6534o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        int[] iArr = this.f6517M;
        iArr[zA ? 1 : 0] = iMax4;
        if (r(this.f6528h)) {
            q(this.f6528h, i, iMax3, i3, this.f6541v);
            iJ2 = j(this.f6528h) + this.f6528h.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f6528h) + this.f6528h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6528h.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[i6] = Math.max(0, currentContentInsetEnd - iJ2);
        if (r(this.f6535p)) {
            iMax5 += p(this.f6535p, i, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, k(this.f6535p) + this.f6535p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6535p.getMeasuredState());
        }
        if (r(this.f6531l)) {
            iMax5 += p(this.f6531l, i, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, k(this.f6531l) + this.f6531l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f6531l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (((I0) childAt.getLayoutParams()).f9985b == 0 && r(childAt)) {
                iMax5 += p(childAt, i, iMax5, i3, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i9 = iMax5;
        int i10 = this.f6544y + this.f6545z;
        int i11 = this.f6542w + this.f6543x;
        if (r(this.i)) {
            p(this.i, i, i9 + i11, i3, i10, iArr);
            int iJ3 = j(this.i) + this.i.getMeasuredWidth();
            iK = k(this.i) + this.i.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.f6529j)) {
            iMax2 = Math.max(iMax2, p(this.f6529j, i, i9 + i11, i3, i10 + iK, iArr));
            iK += k(this.f6529j) + this.f6529j.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f6529j.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i9 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f6523S) {
            i7 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i7 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof K0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        K0 k3 = (K0) parcelable;
        super.onRestoreInstanceState(k3.f11210h);
        ActionMenuView actionMenuView = this.f6528h;
        j jVar = actionMenuView != null ? actionMenuView.f6455w : null;
        int i = k3.f9990j;
        if (i != 0 && this.f6522R != null && jVar != null && (menuItemFindItem = jVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (k3.f9991k) {
            o oVar = this.f6527W;
            removeCallbacks(oVar);
            post(oVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        C0796j0 c0796j0 = this.f6509A;
        boolean z5 = i == 1;
        if (z5 == c0796j0.f10108g) {
            return;
        }
        c0796j0.f10108g = z5;
        if (!c0796j0.f10109h) {
            c0796j0.f10102a = c0796j0.f10106e;
            c0796j0.f10103b = c0796j0.f10107f;
            return;
        }
        if (z5) {
            int i3 = c0796j0.f10105d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0796j0.f10106e;
            }
            c0796j0.f10102a = i3;
            int i6 = c0796j0.f10104c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = c0796j0.f10107f;
            }
            c0796j0.f10103b = i6;
            return;
        }
        int i7 = c0796j0.f10104c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c0796j0.f10106e;
        }
        c0796j0.f10102a = i7;
        int i8 = c0796j0.f10105d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = c0796j0.f10107f;
        }
        c0796j0.f10103b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0793i c0793i;
        C0787f c0787f;
        k kVar;
        K0 k3 = new K0(super.onSaveInstanceState());
        H0 h1 = this.f6522R;
        if (h1 != null && (kVar = h1.i) != null) {
            k3.f9990j = kVar.f9869a;
        }
        ActionMenuView actionMenuView = this.f6528h;
        k3.f9991k = (actionMenuView == null || (c0793i = actionMenuView.f6458z) == null || (c0787f = c0793i.f10100y) == null || !c0787f.b()) ? false : true;
        return k3;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.I = false;
        return true;
    }

    public final int p(View view, int i, int i3, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i, int i3, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void s() {
        boolean z5;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = G0.a(this);
            H0 h1 = this.f6522R;
            if (h1 == null || h1.i == null || onBackInvokedDispatcherA == null) {
                z5 = false;
            } else {
                ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = p045i1.A.f9394a;
                if (isAttachedToWindow() && this.f6526V) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (z5 && this.f6525U == null) {
                if (this.f6524T == null) {
                    this.f6524T = G0.b(new D0(this, i));
                }
                G0.c(onBackInvokedDispatcherA, this.f6524T);
                this.f6525U = onBackInvokedDispatcherA;
                return;
            }
            if (z5 || (onBackInvokedDispatcher = this.f6525U) == null) {
                return;
            }
            G0.d(onBackInvokedDispatcher, this.f6524T);
            this.f6525U = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.f6526V != z5) {
            this.f6526V = z5;
            s();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0473d.z(getContext(), i));
    }

    public void setCollapsible(boolean z5) {
        this.f6523S = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f6511C) {
            this.f6511C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f6510B) {
            this.f6510B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0473d.z(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0473d.z(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f6530k.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(J0 j4) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f6528h.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f6537r != i) {
            this.f6537r = i;
            if (i == 0) {
                this.f6536q = getContext();
            } else {
                this.f6536q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f6545z = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f6543x = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f6542w = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f6544y = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        I0 i3 = new I0(context, attributeSet);
        i3.f9984a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f9193b);
        i3.f9984a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        i3.f9985b = 0;
        return i3;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0809q c0809q = this.f6534o;
        if (c0809q != null) {
            c0809q.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f6534o.setImageDrawable(drawable);
        } else {
            C0809q c0809q = this.f6534o;
            if (c0809q != null) {
                c0809q.setImageDrawable(this.f6532m);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f6531l == null) {
                this.f6531l = new r(getContext(), 0);
            }
            if (!m(this.f6531l)) {
                b(this.f6531l, true);
            }
        } else {
            r rVar = this.f6531l;
            if (rVar != null && m(rVar)) {
                removeView(this.f6531l);
                this.f6516L.remove(this.f6531l);
            }
        }
        r rVar2 = this.f6531l;
        if (rVar2 != null) {
            rVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f6531l == null) {
            this.f6531l = new r(getContext(), 0);
        }
        r rVar = this.f6531l;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0809q c0809q = this.f6530k;
        if (c0809q != null) {
            c0809q.setContentDescription(charSequence);
            M0.a(this.f6530k, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f6530k)) {
                b(this.f6530k, true);
            }
        } else {
            C0809q c0809q = this.f6530k;
            if (c0809q != null && m(c0809q)) {
                removeView(this.f6530k);
                this.f6516L.remove(this.f6530k);
            }
        }
        C0809q c0809q2 = this.f6530k;
        if (c0809q2 != null) {
            c0809q2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            A a6 = this.f6529j;
            if (a6 != null && m(a6)) {
                removeView(this.f6529j);
                this.f6516L.remove(this.f6529j);
            }
        } else {
            if (this.f6529j == null) {
                Context context = getContext();
                A a7 = new A(context, null);
                this.f6529j = a7;
                a7.setSingleLine();
                this.f6529j.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f6539t;
                if (i != 0) {
                    this.f6529j.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.f6529j.setTextColor(colorStateList);
                }
            }
            if (!m(this.f6529j)) {
                b(this.f6529j, true);
            }
        }
        A a8 = this.f6529j;
        if (a8 != null) {
            a8.setText(charSequence);
        }
        this.f6514F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        A a6 = this.f6529j;
        if (a6 != null) {
            a6.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            A a6 = this.i;
            if (a6 != null && m(a6)) {
                removeView(this.i);
                this.f6516L.remove(this.i);
            }
        } else {
            if (this.i == null) {
                Context context = getContext();
                A a7 = new A(context, null);
                this.i = a7;
                a7.setSingleLine();
                this.i.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f6538s;
                if (i != 0) {
                    this.i.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.i.setTextColor(colorStateList);
                }
            }
            if (!m(this.i)) {
                b(this.i, true);
            }
        }
        A a8 = this.i;
        if (a8 != null) {
            a8.setText(charSequence);
        }
        this.f6513E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        A a6 = this.i;
        if (a6 != null) {
            a6.setTextColor(colorStateList);
        }
    }
}
