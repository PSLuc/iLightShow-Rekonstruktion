package F1;

import B.AbstractC0013g0;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Q extends S {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f1311q;

    public Q(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f1311q = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // F1.S
    public final Object a(String str, Bundle bundle) {
        return (Serializable) AbstractC0013g0.e(bundle, "bundle", str, "key", str);
    }

    @Override // F1.S
    public String b() {
        return this.f1311q.getName();
    }

    @Override // F1.S
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        E4.k.f("key", str);
        E4.k.f("value", serializable);
        this.f1311q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        return E4.k.a(this.f1311q, ((Q) obj).f1311q);
    }

    @Override // F1.S
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable c(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f1311q.hashCode();
    }

    public Q(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f1311q = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
