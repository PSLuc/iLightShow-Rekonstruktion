package androidx.lifecycle;

import B.C0031p0;
import android.os.Bundle;
import android.view.View;
import com.nanjoran.ilightshow.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W2.g f6957a = new W2.g(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z2.f f6958b = new Z2.f(20, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z2.f f6959c = new Z2.f(19, false);

    public static final void a(O o6, J1.e eVar, C0460u c0460u) {
        AutoCloseable autoCloseable;
        E4.k.f("registry", eVar);
        E4.k.f("lifecycle", c0460u);
        E1.b bVar = o6.f6972a;
        if (bVar != null) {
            synchronized (bVar.f1002a) {
                autoCloseable = (AutoCloseable) bVar.f1003b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        H h6 = (H) autoCloseable;
        if (h6 == null || h6.f6956j) {
            return;
        }
        h6.s(eVar, c0460u);
        j(eVar, c0460u);
    }

    public static final H b(J1.e eVar, C0460u c0460u, String str, Bundle bundle) {
        E4.k.f("registry", eVar);
        E4.k.f("lifecycle", c0460u);
        Bundle bundleB = eVar.b(str);
        Class[] clsArr = G.f6949f;
        H h6 = new H(str, c(bundleB, bundle));
        h6.s(eVar, c0460u);
        j(eVar, c0460u);
        return h6;
    }

    public static G c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new G();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                E4.k.e("key", str);
                map.put(str, bundle2.get(str));
            }
            return new G(map);
        }
        ClassLoader classLoader = G.class.getClassLoader();
        E4.k.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            E4.k.d("null cannot be cast to non-null type kotlin.String", obj);
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new G(linkedHashMap);
    }

    public static final G d(C1.c cVar) {
        W2.g gVar = f6957a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f603h;
        J1.f fVar = (J1.f) linkedHashMap.get(gVar);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        V v6 = (V) linkedHashMap.get(f6958b);
        if (v6 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f6959c);
        String str = (String) linkedHashMap.get(E1.c.f1006a);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        J1.d dVarC = fVar.b().c();
        K k3 = dVarC instanceof K ? (K) dVarC : null;
        if (k3 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = h(v6).f6964b;
        G g6 = (G) linkedHashMap2.get(str);
        if (g6 != null) {
            return g6;
        }
        Class[] clsArr = G.f6949f;
        k3.b();
        Bundle bundle2 = k3.f6962c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = k3.f6962c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = k3.f6962c;
        if (bundle5 != null && bundle5.isEmpty()) {
            k3.f6962c = null;
        }
        G gC = c(bundle3, bundle);
        linkedHashMap2.put(str, gC);
        return gC;
    }

    public static final void e(J1.f fVar) {
        EnumC0454n enumC0454n = fVar.f().f7001c;
        if (enumC0454n != EnumC0454n.i && enumC0454n != EnumC0454n.f6992j) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.b().c() == null) {
            K k3 = new K(fVar.b(), (V) fVar);
            fVar.b().d("androidx.lifecycle.internal.SavedStateHandlesProvider", k3);
            fVar.f().a(new J1.b(2, k3));
        }
    }

    public static final InterfaceC0458s f(View view) {
        E4.k.f("<this>", view);
        return (InterfaceC0458s) L4.l.O(L4.l.Q(L4.l.P(view, W.i), W.f6978j));
    }

    public static final V g(View view) {
        E4.k.f("<this>", view);
        return (V) L4.l.O(L4.l.Q(L4.l.P(view, W.f6979k), W.f6980l));
    }

    public static final L h(V v6) {
        I i = new I();
        U uE = v6.e();
        C1.b bVarD = v6 instanceof InterfaceC0449i ? ((InterfaceC0449i) v6).d() : C1.a.i;
        E4.k.f("store", uE);
        E4.k.f("defaultCreationExtras", bVarD);
        return (L) new C0031p0(uE, i, bVarD).m(E4.x.a(L.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final void i(View view, InterfaceC0458s interfaceC0458s) {
        E4.k.f("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0458s);
    }

    public static void j(J1.e eVar, C0460u c0460u) {
        EnumC0454n enumC0454n = c0460u.f7001c;
        if (enumC0454n == EnumC0454n.i || enumC0454n.compareTo(EnumC0454n.f6993k) >= 0) {
            eVar.e();
        } else {
            c0460u.a(new G2.f(c0460u, 2, eVar));
        }
    }
}
