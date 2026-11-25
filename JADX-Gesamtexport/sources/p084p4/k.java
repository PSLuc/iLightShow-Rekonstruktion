package p084p4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10851h;

    public static final Throwable a(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).f10850h;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return E4.k.a(this.f10851h, ((k) obj).f10851h);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f10851h;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10851h;
        if (obj instanceof j) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
