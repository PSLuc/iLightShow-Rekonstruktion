package S1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f4932h;
    public final Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f4933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4934k;

    public c0(Class cls, Class cls2, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Can not construct IdKey for null key");
        }
        this.f4932h = cls;
        this.i = cls2;
        this.f4933j = obj;
        int iHashCode = cls.getName().hashCode() + obj.hashCode();
        this.f4934k = cls2 != null ? iHashCode ^ cls2.getName().hashCode() : iHashCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != c0.class) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f4933j.equals(this.f4933j) && c0Var.f4932h == this.f4932h && c0Var.i == this.i;
    }

    public final int hashCode() {
        return this.f4934k;
    }

    public final String toString() {
        Class cls = this.f4932h;
        String name = cls == null ? "NONE" : cls.getName();
        Class cls2 = this.i;
        return String.format("[ObjectId: key=%s, type=%s, scope=%s]", this.f4933j, name, cls2 != null ? cls2.getName() : "NONE");
    }
}
