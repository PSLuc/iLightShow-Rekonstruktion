package V1;

import T1.n;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements n, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f5504j = d.f5495b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5505h;
    public char[] i;

    public h(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f5505h = str;
    }

    public final char[] a() {
        char[] cArr = this.i;
        if (cArr != null) {
            return cArr;
        }
        f5504j.getClass();
        char[] cArrA = d.a(this.f5505h);
        this.i = cArrA;
        return cArrA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != h.class) {
            return false;
        }
        return this.f5505h.equals(((h) obj).f5505h);
    }

    public final int hashCode() {
        return this.f5505h.hashCode();
    }

    public final String toString() {
        return this.f5505h;
    }
}
