package F1;

import B.AbstractC0013g0;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class P extends S {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f1310q;

    public P(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f1310q = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        return AbstractC0013g0.e(bundle, "bundle", str, "key", str);
    }

    @Override // F1.S
    public final String b() {
        return this.f1310q.getName();
    }

    @Override // F1.S
    public final Object c(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        E4.k.f("key", str);
        this.f1310q.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !P.class.equals(obj.getClass())) {
            return false;
        }
        return E4.k.a(this.f1310q, ((P) obj).f1310q);
    }

    public final int hashCode() {
        return this.f1310q.hashCode();
    }
}
