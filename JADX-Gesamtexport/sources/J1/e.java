package J1;

import E4.k;
import android.os.Bundle;
import androidx.lifecycle.C0450j;
import java.util.Iterator;
import java.util.Map;
import p015c2.A;
import p046i2.AbstractC0771g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1903g;

    public e() {
        this.f1897a = 0;
        this.f1901e = new p068n.f();
        this.f1900d = true;
    }

    public e a(e eVar) {
        e eVar2 = (e) this.f1902f;
        return eVar2 == null ? g(eVar) : g(eVar2.a(eVar));
    }

    public Bundle b(String str) {
        k.f("key", str);
        if (!this.f1899c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1902f;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1902f;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1902f;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f1902f = null;
        return bundle2;
    }

    public d c() {
        String str;
        d dVar;
        Iterator it = ((p068n.f) this.f1901e).iterator();
        do {
            p068n.b bVar = (p068n.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            k.e("components", entry);
            str = (String) entry.getKey();
            dVar = (d) entry.getValue();
        } while (!k.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public void d(String str, d dVar) {
        Object obj;
        k.f("provider", dVar);
        p068n.f fVar = (p068n.f) this.f1901e;
        p068n.c cVarC = fVar.c(str);
        if (cVarC != null) {
            obj = cVarC.i;
        } else {
            p068n.c cVar = new p068n.c(str, dVar);
            fVar.f10508k++;
            p068n.c cVar2 = fVar.i;
            if (cVar2 == null) {
                fVar.f10506h = cVar;
                fVar.i = cVar;
            } else {
                cVar2.f10502j = cVar;
                cVar.f10503k = cVar2;
                fVar.i = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void e() {
        if (!this.f1900d) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = (a) this.f1903g;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f1903g = aVar;
        try {
            C0450j.class.getDeclaredConstructor(null);
            a aVar2 = (a) this.f1903g;
            if (aVar2 != null) {
                aVar2.f1895a.add(C0450j.class.getName());
            }
        } catch (NoSuchMethodException e6) {
            throw new IllegalArgumentException("Class " + C0450j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
        }
    }

    public e f() {
        e eVar = (e) this.f1902f;
        if (eVar == null) {
            return this;
        }
        e eVarF = eVar.f();
        if (((A) this.f1903g) != null) {
            return ((A) eVarF.f1903g) == null ? g(null) : g(eVarF);
        }
        if (((A) eVarF.f1903g) == null) {
            boolean z5 = eVarF.f1899c;
            boolean z6 = this.f1899c;
            if (z6 == z5) {
                return g(eVarF);
            }
            if (z6) {
                return g(null);
            }
        }
        return eVarF;
    }

    public e g(e eVar) {
        if (eVar == ((e) this.f1902f)) {
            return this;
        }
        return new e((AbstractC0771g) this.f1901e, eVar, (A) this.f1903g, this.f1898b, this.f1899c, this.f1900d);
    }

    public e h() {
        e eVarH;
        boolean z5 = this.f1900d;
        e eVar = (e) this.f1902f;
        if (!z5) {
            return (eVar == null || (eVarH = eVar.h()) == eVar) ? this : g(eVarH);
        }
        if (eVar == null) {
            return null;
        }
        return eVar.h();
    }

    public e i() {
        if (((e) this.f1902f) == null) {
            return this;
        }
        return new e((AbstractC0771g) this.f1901e, null, (A) this.f1903g, this.f1898b, this.f1899c, this.f1900d);
    }

    public e j() {
        e eVar = (e) this.f1902f;
        e eVarJ = eVar == null ? null : eVar.j();
        return this.f1899c ? g(eVarJ) : eVarJ;
    }

    public String toString() {
        switch (this.f1897a) {
            case 1:
                String str = ((AbstractC0771g) this.f1901e).toString() + "[visible=" + this.f1899c + ",ignore=" + this.f1900d + ",explicitName=" + this.f1898b + "]";
                e eVar = (e) this.f1902f;
                if (eVar == null) {
                    return str;
                }
                return str + ", " + eVar.toString();
            default:
                return super.toString();
        }
    }

    public e(AbstractC0771g abstractC0771g, e eVar, A a6, boolean z5, boolean z6, boolean z7) {
        this.f1897a = 1;
        this.f1901e = abstractC0771g;
        this.f1902f = eVar;
        A a7 = (a6 == null || a6.c()) ? null : a6;
        this.f1903g = a7;
        if (z5) {
            if (a7 != null) {
                if (a6.f7195h.isEmpty()) {
                    z5 = false;
                }
            } else {
                throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
            }
        }
        this.f1898b = z5;
        this.f1899c = z6;
        this.f1900d = z7;
    }
}
