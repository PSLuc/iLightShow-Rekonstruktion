package V0;

import F.L;
import F1.C0101s;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.J;
import com.fasterxml.jackson.databind.deser.std.d0;
import com.nanjoran.ilightshow.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import p012c.D;
import p012c.E;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Dialog implements InterfaceC0458s, E, J1.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0460u f5453h;
    public final L i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final D f5454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public D4.a f5455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f5456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f5457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f5458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5459o;

    public v(D4.a aVar, s sVar, View view, S0.k kVar, S0.b bVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || sVar.f5451e) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.i = new L(this);
        D d6 = new D(new I3.a(10, this));
        this.f5454j = d6;
        this.f5455k = aVar;
        this.f5456l = sVar;
        this.f5457m = view;
        float f6 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f5459o = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        d0.B(window, this.f5456l.f5451e);
        r rVar = new r(getContext(), window);
        rVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        rVar.setClipChildren(false);
        rVar.setElevation(bVar.y(f6));
        rVar.setOutlineProvider(new u(0));
        this.f5458n = rVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(rVar);
        J.i(rVar, J.f(view));
        rVar.setTag(R.id.view_tree_view_model_store_owner, J.g(view));
        rVar.setTag(R.id.view_tree_saved_state_registry_owner, p020d2.n.r(view));
        g(this.f5455k, this.f5456l, kVar);
        d6.a(this, new C0101s(new C0382a(this, 1)));
    }

    public static void c(v vVar) {
        E4.k.f("this$0", vVar);
        super.onBackPressed();
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof r) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // p012c.E
    public final D a() {
        return this.f5454j;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        E4.k.f("view", view);
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // J1.f
    public final J1.e b() {
        return (J1.e) this.i.f1107d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e() {
        Window window = getWindow();
        E4.k.c(window);
        View decorView = window.getDecorView();
        E4.k.e("window!!.decorView", decorView);
        J.i(decorView, this);
        Window window2 = getWindow();
        E4.k.c(window2);
        View decorView2 = window2.getDecorView();
        E4.k.e("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        E4.k.c(window3);
        View decorView3 = window3.getDecorView();
        E4.k.e("window!!.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0458s
    public final C0460u f() {
        C0460u c0460u = this.f5453h;
        if (c0460u != null) {
            return c0460u;
        }
        C0460u c0460u2 = new C0460u(this);
        this.f5453h = c0460u2;
        return c0460u2;
    }

    public final void g(D4.a aVar, s sVar, S0.k kVar) {
        Window window;
        this.f5455k = aVar;
        this.f5456l = sVar;
        int i = sVar.f5449c;
        boolean zB = l.b(this.f5457m);
        int iD = AbstractC0916i.d(i);
        int i3 = 0;
        if (iD != 0) {
            if (iD == 1) {
                zB = true;
            } else {
                if (iD != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zB = false;
            }
        }
        Window window2 = getWindow();
        E4.k.c(window2);
        window2.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal = kVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 1;
        }
        r rVar = this.f5458n;
        rVar.setLayoutDirection(i3);
        boolean z5 = sVar.f5450d;
        if (z5 && !rVar.f5445r && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        rVar.f5445r = z5;
        if (Build.VERSION.SDK_INT < 31) {
            if (sVar.f5451e) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f5459o);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f5454j.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            E4.k.e("onBackInvokedDispatcher", onBackInvokedDispatcher);
            D d6 = this.f5454j;
            d6.getClass();
            d6.f7124e = onBackInvokedDispatcher;
            d6.d(d6.f7126g);
        }
        this.i.i(bundle);
        C0460u c0460u = this.f5453h;
        if (c0460u == null) {
            c0460u = new C0460u(this);
            this.f5453h = c0460u;
        }
        c0460u.d(EnumC0453m.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        E4.k.e("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.i.j(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0460u c0460u = this.f5453h;
        if (c0460u == null) {
            c0460u = new C0460u(this);
            this.f5453h = c0460u;
        }
        c0460u.d(EnumC0453m.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0460u c0460u = this.f5453h;
        if (c0460u == null) {
            c0460u = new C0460u(this);
            this.f5453h = c0460u;
        }
        c0460u.d(EnumC0453m.ON_DESTROY);
        this.f5453h = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f5456l.f5448b) {
            this.f5455k.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        E4.k.f("view", view);
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        E4.k.f("view", view);
        e();
        super.setContentView(view, layoutParams);
    }
}
