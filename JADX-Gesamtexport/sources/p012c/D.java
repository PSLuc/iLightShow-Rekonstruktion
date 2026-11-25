package p012c;

import E4.k;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import androidx.lifecycle.InterfaceC0458s;
import java.util.Iterator;
import java.util.ListIterator;
import p089q4.j;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f7120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f7121b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f7122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f7123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f7124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7126g;

    public D(Runnable runnable) {
        this.f7120a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f7123d = i >= 34 ? z.f7189a.a(new v(this, 0), new v(this, 1), new w(this, 0), new w(this, 1)) : x.f7184a.a(new w(this, 2));
        }
    }

    public final void a(InterfaceC0458s interfaceC0458s, u uVar) {
        k.f("owner", interfaceC0458s);
        k.f("onBackPressedCallback", uVar);
        C0460u c0460uF = interfaceC0458s.f();
        if (c0460uF.f7001c == EnumC0454n.f6991h) {
            return;
        }
        uVar.f7180b.add(new A(this, c0460uF, uVar));
        e();
        uVar.f7181c = new C(0, this, D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
    }

    public final void b() {
        Object objPrevious;
        u uVar = this.f7122c;
        if (uVar == null) {
            j jVar = this.f7121b;
            ListIterator<E> listIterator = jVar.listIterator(jVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((u) objPrevious).f7179a);
            uVar = (u) objPrevious;
        }
        this.f7122c = null;
        if (uVar != null) {
            uVar.a();
        }
    }

    public final void c() {
        Object objPrevious;
        u uVar = this.f7122c;
        if (uVar == null) {
            j jVar = this.f7121b;
            ListIterator listIterator = jVar.listIterator(jVar.c());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((u) objPrevious).f7179a);
            uVar = (u) objPrevious;
        }
        this.f7122c = null;
        if (uVar != null) {
            uVar.b();
        } else {
            this.f7120a.run();
        }
    }

    public final void d(boolean z5) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f7124e;
        OnBackInvokedCallback onBackInvokedCallback = this.f7123d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        x xVar = x.f7184a;
        if (z5 && !this.f7125f) {
            xVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f7125f = true;
        } else {
            if (z5 || !this.f7125f) {
                return;
            }
            xVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f7125f = false;
        }
    }

    public final void e() {
        boolean z5 = this.f7126g;
        boolean z6 = false;
        j jVar = this.f7121b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (((u) it.next()).f7179a) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f7126g = z6;
        if (z6 == z5 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z6);
    }
}
