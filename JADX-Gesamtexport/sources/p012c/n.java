package p012c;

import C1.c;
import E4.k;
import F.L;
import J1.b;
import J1.e;
import J1.f;
import O1.s;
import S1.h0;
import W2.g;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0453m;
import androidx.lifecycle.EnumC0454n;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0449i;
import androidx.lifecycle.InterfaceC0457q;
import androidx.lifecycle.InterfaceC0458s;
import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p012c.l;
import p023e.a;
import p029f.h;
import p035g0.C0715p;
import p045i1.A;
import p045i1.ViewTreeObserverOnGlobalLayoutListenerC0756q;
import p084p4.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Activity implements V, InterfaceC0449i, f, E, h, InterfaceC0458s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f7155A = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0460u f7156h = new C0460u(this);
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0715p f7157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L f7158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public U f7159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f7160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f7161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f7162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f7163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f7164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f7165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CopyOnWriteArrayList f7166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f7167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f7168u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f7169v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7171x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f7172y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m f7173z;

    public n() {
        a aVar = new a();
        this.i = aVar;
        this.f7157j = new C0715p(new RunnableC0466d(this, 0));
        L l6 = new L(this);
        this.f7158k = l6;
        this.f7160m = new j(this);
        this.f7161n = G4.a.z(new m(this, 2));
        this.f7162o = new AtomicInteger();
        this.f7163p = new l(this);
        this.f7164q = new CopyOnWriteArrayList();
        this.f7165r = new CopyOnWriteArrayList();
        this.f7166s = new CopyOnWriteArrayList();
        this.f7167t = new CopyOnWriteArrayList();
        this.f7168u = new CopyOnWriteArrayList();
        this.f7169v = new CopyOnWriteArrayList();
        C0460u c0460u = this.f7156h;
        if (c0460u == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        c0460u.a(new InterfaceC0457q(this) { // from class: c.e
            public final /* synthetic */ n i;

            {
                this.i = this;
            }

            @Override // androidx.lifecycle.InterfaceC0457q
            public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        n nVar = this.i;
                        k.f("this$0", nVar);
                        if (enumC0453m == EnumC0453m.ON_STOP && (window = nVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n nVar2 = this.i;
                        k.f("this$0", nVar2);
                        if (enumC0453m == EnumC0453m.ON_DESTROY) {
                            nVar2.i.f8637b = null;
                            if (!nVar2.isChangingConfigurations()) {
                                nVar2.e().a();
                            }
                            j jVar = nVar2.f7160m;
                            n nVar3 = jVar.f7145k;
                            nVar3.getWindow().getDecorView().removeCallbacks(jVar);
                            nVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f7156h.a(new InterfaceC0457q(this) { // from class: c.e
            public final /* synthetic */ n i;

            {
                this.i = this;
            }

            @Override // androidx.lifecycle.InterfaceC0457q
            public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
                Window window;
                View viewPeekDecorView;
                switch (i3) {
                    case 0:
                        n nVar = this.i;
                        k.f("this$0", nVar);
                        if (enumC0453m == EnumC0453m.ON_STOP && (window = nVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n nVar2 = this.i;
                        k.f("this$0", nVar2);
                        if (enumC0453m == EnumC0453m.ON_DESTROY) {
                            nVar2.i.f8637b = null;
                            if (!nVar2.isChangingConfigurations()) {
                                nVar2.e().a();
                            }
                            j jVar = nVar2.f7160m;
                            n nVar3 = jVar.f7145k;
                            nVar3.getWindow().getDecorView().removeCallbacks(jVar);
                            nVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                        }
                        break;
                }
            }
        });
        this.f7156h.a(new b(3, this));
        l6.h();
        J.e(this);
        ((e) l6.f1107d).d("android:support:activity-result", new F(1, this));
        C0468f c0468f = new C0468f(this);
        n nVar = aVar.f8637b;
        if (nVar != null) {
            c0468f.a(nVar);
        }
        aVar.f8636a.add(c0468f);
        this.f7172y = G4.a.z(new m(this, 0));
        this.f7173z = G4.a.z(new m(this, 3));
    }

    @Override // p012c.E
    public final D a() {
        return (D) this.f7173z.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        k.e("window.decorView", decorView);
        this.f7160m.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // J1.f
    public final e b() {
        return (e) this.f7158k.f1107d;
    }

    @Override // androidx.lifecycle.InterfaceC0449i
    public final Q c() {
        return (Q) this.f7172y.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0449i
    public final C1.b d() {
        c cVar = new c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f603h;
        if (application != null) {
            g gVar = P.f6974d;
            Application application2 = getApplication();
            k.e("application", application2);
            linkedHashMap.put(gVar, application2);
        }
        linkedHashMap.put(J.f6957a, this);
        linkedHashMap.put(J.f6958b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(J.f6959c, extras);
        }
        return cVar;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        k.f("event", keyEvent);
        k.e("window.decorView", getWindow().getDecorView());
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        k.f("event", keyEvent);
        k.e("window.decorView", getWindow().getDecorView());
        ViewTreeObserverOnGlobalLayoutListenerC0756q viewTreeObserverOnGlobalLayoutListenerC0756q = A.f9394a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.V
    public final U e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f7159l == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f7159l = iVar.f7142a;
            }
            if (this.f7159l == null) {
                this.f7159l = new U();
            }
        }
        U u6 = this.f7159l;
        k.c(u6);
        return u6;
    }

    @Override // androidx.lifecycle.InterfaceC0458s
    public final C0460u f() {
        return this.f7156h;
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        k.e("window.decorView", decorView);
        J.i(decorView, this);
        View decorView2 = getWindow().getDecorView();
        k.e("window.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        k.e("window.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        k.e("window.decorView", decorView4);
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        k.e("window.decorView", decorView5);
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void i(Bundle bundle) {
        super.onCreate(bundle);
        int i = E.f6946h;
        C.b(this);
    }

    public final void j(Bundle bundle) {
        k.f("outState", bundle);
        this.f7156h.g(EnumC0454n.f6992j);
        super.onSaveInstanceState(bundle);
    }

    public final p029f.g k(final g.a aVar, final p029f.b bVar) {
        final l lVar = this.f7163p;
        k.f("registry", lVar);
        final String str = "activity_rq#" + this.f7162o.getAndIncrement();
        k.f("key", str);
        C0460u c0460u = this.f7156h;
        if (c0460u.f7001c.compareTo(EnumC0454n.f6993k) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0460u.f7001c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        lVar.c(str);
        LinkedHashMap linkedHashMap = lVar.f7148c;
        p029f.e eVar = (p029f.e) linkedHashMap.get(str);
        if (eVar == null) {
            eVar = new p029f.e(c0460u);
        }
        InterfaceC0457q interfaceC0457q = new InterfaceC0457q() { // from class: f.c
            @Override // androidx.lifecycle.InterfaceC0457q
            public final void c(InterfaceC0458s interfaceC0458s, EnumC0453m enumC0453m) {
                l lVar2 = lVar;
                k.f("this$0", lVar2);
                String str2 = str;
                b bVar2 = bVar;
                g.a aVar2 = aVar;
                EnumC0453m enumC0453m2 = EnumC0453m.ON_START;
                LinkedHashMap linkedHashMap2 = lVar2.f7150e;
                if (enumC0453m2 != enumC0453m) {
                    if (EnumC0453m.ON_STOP == enumC0453m) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (EnumC0453m.ON_DESTROY == enumC0453m) {
                            lVar2.d(str2);
                            return;
                        }
                        return;
                    }
                }
                linkedHashMap2.put(str2, new d(bVar2, aVar2));
                LinkedHashMap linkedHashMap3 = lVar2.f7151f;
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    bVar2.a(obj);
                }
                Bundle bundle = lVar2.f7152g;
                a aVar3 = (a) h0.q(str2, bundle);
                if (aVar3 != null) {
                    bundle.remove(str2);
                    bVar2.a(new a(aVar3.f8815h, aVar3.i));
                }
            }
        };
        eVar.f8821a.a(interfaceC0457q);
        eVar.f8822b.add(interfaceC0457q);
        linkedHashMap.put(str, eVar);
        return new p029f.g(lVar, str, aVar, 0);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i3, Intent intent) {
        if (this.f7163p.a(i, i3, intent)) {
            return;
        }
        super.onActivityResult(i, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        k.f("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it = this.f7164q.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f7158k.i(bundle);
        a aVar = this.i;
        aVar.getClass();
        aVar.f8637b = this;
        Iterator it = aVar.f8636a.iterator();
        while (it.hasNext()) {
            ((C0468f) it.next()).a(this);
        }
        i(bundle);
        int i = E.f6946h;
        C.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        k.f("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f7157j.i).iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        k.f("item", menuItem);
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f7157j.i).iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5) {
        if (this.f7170w) {
            return;
        }
        Iterator it = this.f7167t.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(new g(17));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        k.f("intent", intent);
        super.onNewIntent(intent);
        Iterator it = this.f7166s.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        k.f("menu", menu);
        Iterator it = ((CopyOnWriteArrayList) this.f7157j.i).iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5) {
        if (this.f7171x) {
            return;
        }
        Iterator it = this.f7168u.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(new Z2.f(17, false));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        k.f("menu", menu);
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f7157j.i).iterator();
        if (it.hasNext()) {
            throw p138z3.b.a(it);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        k.f("permissions", strArr);
        k.f("grantResults", iArr);
        if (this.f7163p.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        U u6 = this.f7159l;
        if (u6 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            u6 = iVar.f7142a;
        }
        if (u6 == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f7142a = u6;
        return iVar2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        k.f("outState", bundle);
        C0460u c0460u = this.f7156h;
        if (c0460u != null) {
            c0460u.g(EnumC0454n.f6992j);
        }
        j(bundle);
        this.f7158k.j(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f7165r.iterator();
        while (it.hasNext()) {
            ((s) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f7169v.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (h0.s()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            t tVar = (t) this.f7161n.getValue();
            synchronized (tVar.f7176a) {
                try {
                    tVar.f7177b = true;
                    ArrayList arrayList = tVar.f7178c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((D4.a) obj).invoke();
                    }
                    tVar.f7178c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        h();
        View decorView = getWindow().getDecorView();
        k.e("window.decorView", decorView);
        this.f7160m.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        k.f("intent", intent);
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i3, int i6, int i7) throws IntentSender.SendIntentException {
        k.f("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i3, i6, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        k.f("intent", intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i3, int i6, int i7, Bundle bundle) throws IntentSender.SendIntentException {
        k.f("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i, intent, i3, i6, i7, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h();
        View decorView = getWindow().getDecorView();
        k.e("window.decorView", decorView);
        this.f7160m.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        k.f("newConfig", configuration);
        this.f7170w = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.f7170w = false;
            Iterator it = this.f7167t.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(new g(17));
            }
        } catch (Throwable th) {
            this.f7170w = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        k.f("newConfig", configuration);
        this.f7171x = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.f7171x = false;
            Iterator it = this.f7168u.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(new Z2.f(17, false));
            }
        } catch (Throwable th) {
            this.f7171x = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        View decorView = getWindow().getDecorView();
        k.e("window.decorView", decorView);
        this.f7160m.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
