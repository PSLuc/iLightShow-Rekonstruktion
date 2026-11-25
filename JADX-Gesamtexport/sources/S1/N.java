package S1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final N f4911j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f4912h;
    public final b0 i;

    static {
        b0 b0Var = b0.f4930k;
        f4911j = new N(b0Var, b0Var);
    }

    public N(b0 b0Var, b0 b0Var2) {
        this.f4912h = b0Var;
        this.i = b0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == N.class) {
            N n6 = (N) obj;
            if (n6.f4912h == this.f4912h && n6.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4912h.ordinal() + (this.i.ordinal() << 2);
    }

    public final String toString() {
        return "JsonSetter.Value(valueNulls=" + this.f4912h + ",contentNulls=" + this.i + ")";
    }
}
