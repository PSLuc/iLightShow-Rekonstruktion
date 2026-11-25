package H1;

import B.AbstractC0013g0;
import E4.k;
import F1.S;
import M4.s;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends S {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f1747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f1748r;

    public b(Class cls) {
        super(true);
        this.f1747q = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (cls.isEnum()) {
            this.f1748r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        Object objE = AbstractC0013g0.e(bundle, "bundle", str, "key", str);
        if (objE instanceof Serializable) {
            return (Serializable) objE;
        }
        return null;
    }

    @Override // F1.S
    public final String b() {
        return this.f1748r.getName();
    }

    @Override // F1.S
    public final Object c(String str) {
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.f1748r;
        Object[] enumConstants = cls.getEnumConstants();
        k.c(enumConstants);
        for (Object obj2 : enumConstants) {
            Enum r6 = (Enum) obj2;
            k.c(r6);
            if (s.Q(r6.name(), str, true)) {
                obj = obj2;
                break;
            }
        }
        Enum r7 = (Enum) obj;
        if (r7 != null) {
            return r7;
        }
        StringBuilder sbW = p012c.k.w("Enum value ", str, " not found for type ");
        sbW.append(cls.getName());
        sbW.append('.');
        throw new IllegalArgumentException(sbW.toString());
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        k.f("key", str);
        bundle.putSerializable(str, (Serializable) this.f1747q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return k.a(this.f1747q, ((b) obj).f1747q);
    }

    public final int hashCode() {
        return this.f1747q.hashCode();
    }
}
