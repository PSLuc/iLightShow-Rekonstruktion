package p084p4;

import E4.k;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10856h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f10857j;

    public n(Object obj, Object obj2, Object obj3) {
        this.f10856h = obj;
        this.i = obj2;
        this.f10857j = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k.a(this.f10856h, nVar.f10856h) && k.a(this.i, nVar.i) && k.a(this.f10857j, nVar.f10857j);
    }

    public final int hashCode() {
        Object obj = this.f10856h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.i;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f10857j;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f10856h + ", " + this.i + ", " + this.f10857j + ')';
    }
}
