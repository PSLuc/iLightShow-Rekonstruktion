package F1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0460u;
import androidx.lifecycle.EnumC0454n;
import androidx.lifecycle.InterfaceC0449i;
import androidx.lifecycle.InterfaceC0458s;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: F1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0096m implements InterfaceC0458s, androidx.lifecycle.V, InterfaceC0449i, J1.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f1353h;
    public B i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f1354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC0454n f1355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0103u f1356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Bundle f1358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0460u f1359o = new C0460u(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F.L f1360p = new F.L(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1361q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EnumC0454n f1362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.lifecycle.M f1363s;

    public C0096m(Context context, B b6, Bundle bundle, EnumC0454n enumC0454n, C0103u c0103u, String str, Bundle bundle2) {
        this.f1353h = context;
        this.i = b6;
        this.f1354j = bundle;
        this.f1355k = enumC0454n;
        this.f1356l = c0103u;
        this.f1357m = str;
        this.f1358n = bundle2;
        p084p4.m mVarZ = G4.a.z(new C0095l(this, 0));
        G4.a.z(new C0095l(this, 1));
        this.f1362r = EnumC0454n.i;
        this.f1363s = (androidx.lifecycle.M) mVarZ.getValue();
    }

    @Override // J1.f
    public final J1.e b() {
        return (J1.e) this.f1360p.f1107d;
    }

    @Override // androidx.lifecycle.InterfaceC0449i
    public final androidx.lifecycle.Q c() {
        return this.f1363s;
    }

    @Override // androidx.lifecycle.InterfaceC0449i
    public final C1.b d() {
        C1.c cVar = new C1.c();
        Context context = this.f1353h;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f603h;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.P.f6974d, application);
        }
        linkedHashMap.put(androidx.lifecycle.J.f6957a, this);
        linkedHashMap.put(androidx.lifecycle.J.f6958b, this);
        Bundle bundleG = g();
        if (bundleG != null) {
            linkedHashMap.put(androidx.lifecycle.J.f6959c, bundleG);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.V
    public final androidx.lifecycle.U e() {
        if (!this.f1361q) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f1359o.f7001c == EnumC0454n.f6991h) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C0103u c0103u = this.f1356l;
        if (c0103u == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f1357m;
        E4.k.f("backStackEntryId", str);
        LinkedHashMap linkedHashMap = c0103u.f1381b;
        androidx.lifecycle.U u6 = (androidx.lifecycle.U) linkedHashMap.get(str);
        if (u6 != null) {
            return u6;
        }
        androidx.lifecycle.U u7 = new androidx.lifecycle.U();
        linkedHashMap.put(str, u7);
        return u7;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C0096m)) {
            C0096m c0096m = (C0096m) obj;
            if (E4.k.a(this.f1357m, c0096m.f1357m) && E4.k.a(this.i, c0096m.i) && E4.k.a(this.f1359o, c0096m.f1359o) && E4.k.a((J1.e) this.f1360p.f1107d, (J1.e) c0096m.f1360p.f1107d)) {
                Bundle bundle = this.f1354j;
                Bundle bundle2 = c0096m.f1354j;
                if (E4.k.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!E4.k.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0458s
    public final C0460u f() {
        return this.f1359o;
    }

    public final Bundle g() {
        Bundle bundle = this.f1354j;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void h(EnumC0454n enumC0454n) {
        E4.k.f("maxState", enumC0454n);
        this.f1362r = enumC0454n;
        i();
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.i.hashCode() + (this.f1357m.hashCode() * 31);
        Bundle bundle = this.f1354j;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((J1.e) this.f1360p.f1107d).hashCode() + ((this.f1359o.hashCode() + (iHashCode * 31)) * 31);
    }

    public final void i() {
        if (!this.f1361q) {
            F.L l6 = this.f1360p;
            l6.h();
            this.f1361q = true;
            if (this.f1356l != null) {
                androidx.lifecycle.J.e(this);
            }
            l6.i(this.f1358n);
        }
        int iOrdinal = this.f1355k.ordinal();
        int iOrdinal2 = this.f1362r.ordinal();
        C0460u c0460u = this.f1359o;
        if (iOrdinal < iOrdinal2) {
            c0460u.g(this.f1355k);
        } else {
            c0460u.g(this.f1362r);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0096m.class.getSimpleName());
        sb.append("(" + this.f1357m + ')');
        sb.append(" destination=");
        sb.append(this.i);
        String string = sb.toString();
        E4.k.e("sb.toString()", string);
        return string;
    }
}
