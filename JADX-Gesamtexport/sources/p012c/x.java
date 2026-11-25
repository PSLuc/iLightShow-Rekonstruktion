package p012c;

import D4.a;
import E4.k;
import V0.m;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f7184a = new x();

    public final OnBackInvokedCallback a(a aVar) {
        k.f("onBackInvoked", aVar);
        return new m(1, aVar);
    }

    public final void b(Object obj, int i, Object obj2) {
        k.f("dispatcher", obj);
        k.f("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        k.f("dispatcher", obj);
        k.f("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
