package S1;

import java.io.Serializable;

/* JADX INFO: renamed from: S1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0340b implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0340b f4926j = new C0340b(null, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4927h;
    public final Boolean i;

    public C0340b(Object obj, Boolean bool) {
        this.f4927h = obj;
        this.i = bool;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C0340b.class) {
            C0340b c0340b = (C0340b) obj;
            Boolean bool = this.i;
            Boolean bool2 = c0340b.i;
            if (bool == null) {
                zEquals = bool2 == null;
            } else {
                zEquals = bool.equals(bool2);
            }
            if (zEquals) {
                Object obj2 = c0340b.f4927h;
                Object obj3 = this.f4927h;
                if (obj3 == null) {
                    return obj2 == null;
                }
                return obj3.equals(obj2);
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4927h;
        int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
        Boolean bool = this.i;
        return bool != null ? bool.hashCode() + iHashCode : iHashCode;
    }

    public final String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.f4927h, this.i);
    }
}
