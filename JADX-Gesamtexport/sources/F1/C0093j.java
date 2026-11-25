package F1;

import androidx.lifecycle.C0460u;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: F1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0093j extends androidx.lifecycle.T implements androidx.lifecycle.Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J1.e f1349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0460u f1350b;

    @Override // androidx.lifecycle.Q
    public final androidx.lifecycle.O a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f1350b == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        J1.e eVar = this.f1349a;
        E4.k.c(eVar);
        C0460u c0460u = this.f1350b;
        E4.k.c(c0460u);
        androidx.lifecycle.H hB = androidx.lifecycle.J.b(eVar, c0460u, canonicalName, null);
        C0094k c0094k = new C0094k(hB.i);
        c0094k.a(hB);
        return c0094k;
    }

    @Override // androidx.lifecycle.Q
    public final androidx.lifecycle.O c(Class cls, C1.c cVar) {
        String str = (String) ((LinkedHashMap) cVar.f603h).get(E1.c.f1006a);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        J1.e eVar = this.f1349a;
        if (eVar == null) {
            return new C0094k(androidx.lifecycle.J.d(cVar));
        }
        E4.k.c(eVar);
        C0460u c0460u = this.f1350b;
        E4.k.c(c0460u);
        androidx.lifecycle.H hB = androidx.lifecycle.J.b(eVar, c0460u, str, null);
        C0094k c0094k = new C0094k(hB.i);
        c0094k.a(hB);
        return c0094k;
    }

    @Override // androidx.lifecycle.T
    public final void d(androidx.lifecycle.O o6) {
        J1.e eVar = this.f1349a;
        if (eVar != null) {
            C0460u c0460u = this.f1350b;
            E4.k.c(c0460u);
            androidx.lifecycle.J.a(o6, eVar, c0460u);
        }
    }
}
