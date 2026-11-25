package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class M extends T implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f6965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f6966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f6967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0460u f6968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J1.e f6969e;

    public M(Application application, J1.f fVar, Bundle bundle) {
        P p6;
        E4.k.f("owner", fVar);
        this.f6969e = fVar.b();
        this.f6968d = fVar.f();
        this.f6967c = bundle;
        this.f6965a = application;
        if (application != null) {
            if (P.f6973c == null) {
                P.f6973c = new P(application);
            }
            p6 = P.f6973c;
            E4.k.c(p6);
        } else {
            p6 = new P(null);
        }
        this.f6966b = p6;
    }

    @Override // androidx.lifecycle.Q
    public final O a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.Q
    public final O c(Class cls, C1.c cVar) {
        E1.c cVar2 = E1.c.f1006a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f603h;
        String str = (String) linkedHashMap.get(cVar2);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(J.f6957a) == null || linkedHashMap.get(J.f6958b) == null) {
            if (this.f6968d != null) {
                return e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(P.f6974d);
        boolean zIsAssignableFrom = AbstractC0441a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? N.a(cls, N.f6971b) : N.a(cls, N.f6970a);
        if (constructorA == null) {
            return this.f6966b.c(cls, cVar);
        }
        return (!zIsAssignableFrom || application == null) ? N.b(cls, constructorA, J.d(cVar)) : N.b(cls, constructorA, application, J.d(cVar));
    }

    @Override // androidx.lifecycle.T
    public final void d(O o6) {
        C0460u c0460u = this.f6968d;
        if (c0460u != null) {
            J1.e eVar = this.f6969e;
            E4.k.c(eVar);
            J.a(o6, eVar, c0460u);
        }
    }

    public final O e(String str, Class cls) {
        C0460u c0460u = this.f6968d;
        if (c0460u == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0441a.class.isAssignableFrom(cls);
        Application application = this.f6965a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? N.a(cls, N.f6971b) : N.a(cls, N.f6970a);
        if (constructorA == null) {
            if (application != null) {
                return this.f6966b.a(cls);
            }
            if (S.f6976a == null) {
                S.f6976a = new S();
            }
            E4.k.c(S.f6976a);
            return p027e3.a.V(cls);
        }
        J1.e eVar = this.f6969e;
        E4.k.c(eVar);
        H hB = J.b(eVar, c0460u, str, this.f6967c);
        G g6 = hB.i;
        O oB = (!zIsAssignableFrom || application == null) ? N.b(cls, constructorA, g6) : N.b(cls, constructorA, application, g6);
        oB.a(hB);
        return oB;
    }
}
