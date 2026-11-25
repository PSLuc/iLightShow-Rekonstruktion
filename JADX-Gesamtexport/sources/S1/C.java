package S1;

import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class C implements Serializable {
    public static final C i = new C(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f4909h;

    public C(Set set) {
        this.f4909h = set;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C.class) {
            Set set = this.f4909h;
            Set set2 = ((C) obj).f4909h;
            if (set == null) {
                zEquals = set2 == null;
            } else {
                zEquals = set.equals(set2);
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set set = this.f4909h;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public final String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", this.f4909h);
    }
}
