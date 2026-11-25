package p052k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.nanjoran.ilightshow.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import p035g0.C0715p;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p057l.AbstractC0780b0;
import p057l.AbstractC0782c0;
import p057l.C0786e0;
import p057l.C0788f0;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9819A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9821C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p f9822D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewTreeObserver f9823E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public m f9824F;
    public boolean G;
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9826k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9827l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f9828m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f9831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f9832q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f9836u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f9837v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9838w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9839x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9840y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9841z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9829n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f9830o = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0715p f9833r = new C0715p(9, this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9834s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9835t = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9820B = false;

    public g(Context context, View view, int i, boolean z5) {
        int i3 = 0;
        this.f9831p = new c(this, i3);
        this.f9832q = new d(i3, this);
        this.i = context;
        this.f9836u = view;
        this.f9826k = i;
        this.f9827l = z5;
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        this.f9838w = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9825j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9828m = new Handler();
    }

    @Override // p052k.q
    public final boolean b(u uVar) {
        ArrayList arrayList = this.f9830o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f fVar = (f) obj;
            if (uVar == fVar.f9817b) {
                fVar.f9816a.f10054j.requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        l(uVar);
        p pVar = this.f9822D;
        if (pVar != null) {
            pVar.i(uVar);
        }
        return true;
    }

    @Override // p052k.q
    public final void c(j jVar, boolean z5) {
        ArrayList arrayList = this.f9830o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i)).f9817b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i3 = i + 1;
        if (i3 < arrayList.size()) {
            ((f) arrayList.get(i3)).f9817b.c(false);
        }
        f fVar = (f) arrayList.remove(i);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = fVar.f9817b.f9864r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            q qVar = (q) weakReference.get();
            if (qVar == null || qVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z6 = this.G;
        C0788f0 c0788f0 = fVar.f9816a;
        if (z6) {
            AbstractC0780b0.b(c0788f0.f10051C, null);
            c0788f0.f10051C.setAnimationStyle(0);
        }
        c0788f0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f9838w = ((f) arrayList.get(size2 - 1)).f9818c;
        } else {
            View view = this.f9836u;
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            this.f9838w = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z5) {
                ((f) arrayList.get(0)).f9817b.c(false);
                return;
            }
            return;
        }
        dismiss();
        p pVar = this.f9822D;
        if (pVar != null) {
            pVar.c(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f9823E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f9823E.removeGlobalOnLayoutListener(this.f9831p);
            }
            this.f9823E = null;
        }
        this.f9837v.removeOnAttachStateChangeListener(this.f9832q);
        this.f9824F.onDismiss();
    }

    @Override // p052k.s
    public final void d() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.f9829n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            v((j) obj);
        }
        arrayList.clear();
        View view = this.f9836u;
        this.f9837v = view;
        if (view != null) {
            boolean z5 = this.f9823E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9823E = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9831p);
            }
            this.f9837v.addOnAttachStateChangeListener(this.f9832q);
        }
    }

    @Override // p052k.s
    public final void dismiss() {
        ArrayList arrayList = this.f9830o;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i = size - 1; i >= 0; i--) {
                f fVar = fVarArr[i];
                if (fVar.f9816a.f10051C.isShowing()) {
                    fVar.f9816a.dismiss();
                }
            }
        }
    }

    @Override // p052k.q
    public final void f() {
        ArrayList arrayList = this.f9830o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((f) obj).f9816a.f10054j.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // p052k.s
    public final ListView g() {
        ArrayList arrayList = this.f9830o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f9816a.f10054j;
    }

    @Override // p052k.q
    public final void h(p pVar) {
        this.f9822D = pVar;
    }

    @Override // p052k.q
    public final boolean j() {
        return false;
    }

    @Override // p052k.s
    public final boolean k() {
        ArrayList arrayList = this.f9830o;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f9816a.f10051C.isShowing();
    }

    @Override // p052k.l
    public final void l(j jVar) {
        jVar.b(this, this.i);
        if (k()) {
            v(jVar);
        } else {
            this.f9829n.add(jVar);
        }
    }

    @Override // p052k.l
    public final void n(View view) {
        if (this.f9836u != view) {
            this.f9836u = view;
            int i = this.f9834s;
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            this.f9835t = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p052k.l
    public final void o(boolean z5) {
        this.f9820B = z5;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f9830o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i);
            if (!fVar.f9816a.f10051C.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (fVar != null) {
            fVar.f9817b.c(false);
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
        if (this.f9834s != i) {
            this.f9834s = i;
            View view = this.f9836u;
            ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
            this.f9835t = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p052k.l
    public final void q(int i) {
        this.f9839x = true;
        this.f9841z = i;
    }

    @Override // p052k.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9824F = (m) onDismissListener;
    }

    @Override // p052k.l
    public final void s(boolean z5) {
        this.f9821C = z5;
    }

    @Override // p052k.l
    public final void t(int i) {
        this.f9840y = true;
        this.f9819A = i;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141  */
    /* JADX WARN: Code duplicated, block: B:57:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0183  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0194  */
    public final void v(j jVar) {
        int i;
        f fVar;
        View childAt;
        Rect rect;
        Rect rect2;
        C0786e0 c0786e0;
        int[] iArr;
        Rect rect3;
        int i3;
        boolean z5;
        MenuItem item;
        h hVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.i;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h hVar2 = new h(jVar, layoutInflaterFrom, this.f9827l, R.layout.abc_cascading_menu_item_layout);
        if (!k() && this.f9820B) {
            hVar2.f9843j = true;
        } else if (k()) {
            hVar2.f9843j = l.u(jVar);
        }
        int iM = l.m(hVar2, context, this.f9825j);
        C0788f0 c0788f0 = new C0788f0(context, this.f9826k);
        c0788f0.f10052D = this.f9833r;
        c0788f0.f10064t = this;
        c0788f0.f10051C.setOnDismissListener(this);
        c0788f0.f10063s = this.f9836u;
        c0788f0.f10061q = this.f9835t;
        c0788f0.f10050B = true;
        c0788f0.f10051C.setFocusable(true);
        c0788f0.f10051C.setInputMethodMode(2);
        c0788f0.a(hVar2);
        Drawable background = c0788f0.f10051C.getBackground();
        if (background != null) {
            Rect rect4 = c0788f0.f10070z;
            background.getPadding(rect4);
            c0788f0.f10055k = rect4.left + rect4.right + iM;
        } else {
            c0788f0.f10055k = iM;
        }
        c0788f0.f10061q = this.f9835t;
        ArrayList arrayList = this.f9830o;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f9817b;
            int size = jVar2.f9853f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = jVar2.getItem(i6);
                if (item.hasSubMenu() && jVar == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item != null) {
                C0786e0 c0786e1 = fVar.f9816a.f10054j;
                ListAdapter adapter = c0786e1.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    headersCount = 0;
                }
                int count = hVar.getCount();
                i = 1;
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (item == hVar.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                childAt = (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - c0786e1.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0786e1.getChildCount()) ? c0786e1.getChildAt(firstVisiblePosition) : null;
                if (childAt != null) {
                    AbstractC0782c0.a(c0788f0.f10051C, false);
                    AbstractC0780b0.a(c0788f0.f10051C, null);
                    c0786e0 = ((f) arrayList.get(arrayList.size() - 1)).f9816a.f10054j;
                    iArr = new int[2];
                    c0786e0.getLocationOnScreen(iArr);
                    rect3 = new Rect();
                    this.f9837v.getWindowVisibleDisplayFrame(rect3);
                    if (this.f9838w == i) {
                        if (c0786e0.getWidth() + iArr[0] + iM > rect3.right) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                    } else if (iArr[0] - iM < 0) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.f9838w = i3;
                    c0788f0.f10063s = childAt;
                    if ((this.f9835t & 5) == 5) {
                        if (!z5) {
                            iM = 0 - childAt.getWidth();
                        }
                    } else if (z5) {
                        iM = childAt.getWidth();
                    } else {
                        iM = 0 - iM;
                    }
                    c0788f0.f10056l = iM;
                    c0788f0.f10060p = true;
                    c0788f0.f10059o = true;
                    c0788f0.f10057m = 0;
                    c0788f0.f10058n = true;
                } else {
                    if (this.f9839x) {
                        c0788f0.f10056l = this.f9841z;
                    }
                    if (this.f9840y) {
                        c0788f0.f10057m = this.f9819A;
                        c0788f0.f10058n = true;
                    }
                    rect = this.f9894h;
                    if (rect != null) {
                        rect2 = new Rect(rect);
                    } else {
                        rect2 = null;
                    }
                    c0788f0.f10049A = rect2;
                }
                arrayList.add(new f(c0788f0, jVar, this.f9838w));
                c0788f0.d();
                C0786e0 c0786e2 = c0788f0.f10054j;
                c0786e2.setOnKeyListener(this);
                if (fVar == null || !this.f9821C || jVar.f9858l == null) {
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0786e2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                frameLayout.setEnabled(false);
                textView.setText(jVar.f9858l);
                c0786e2.addHeaderView(frameLayout, null, false);
                c0788f0.d();
                return;
            }
            i = 1;
        } else {
            i = 1;
            fVar = null;
        }
        if (childAt != null) {
            AbstractC0782c0.a(c0788f0.f10051C, false);
            AbstractC0780b0.a(c0788f0.f10051C, null);
            c0786e0 = ((f) arrayList.get(arrayList.size() - 1)).f9816a.f10054j;
            iArr = new int[2];
            c0786e0.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f9837v.getWindowVisibleDisplayFrame(rect3);
            if (this.f9838w == i) {
                if (c0786e0.getWidth() + iArr[0] + iM > rect3.right) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f9838w = i3;
            c0788f0.f10063s = childAt;
            if ((this.f9835t & 5) == 5) {
                if (!z5) {
                    iM = 0 - childAt.getWidth();
                }
            } else if (z5) {
                iM = childAt.getWidth();
            } else {
                iM = 0 - iM;
            }
            c0788f0.f10056l = iM;
            c0788f0.f10060p = true;
            c0788f0.f10059o = true;
            c0788f0.f10057m = 0;
            c0788f0.f10058n = true;
        } else {
            if (this.f9839x) {
                c0788f0.f10056l = this.f9841z;
            }
            if (this.f9840y) {
                c0788f0.f10057m = this.f9819A;
                c0788f0.f10058n = true;
            }
            rect = this.f9894h;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c0788f0.f10049A = rect2;
        }
        arrayList.add(new f(c0788f0, jVar, this.f9838w));
        c0788f0.d();
        C0786e0 c0786e3 = c0788f0.f10054j;
        c0786e3.setOnKeyListener(this);
        if (fVar == null) {
        }
    }
}
