package p084p4;

import E4.k;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10849h;
    public final Object i;

    public h(Object obj, Object obj2) {
        this.f10849h = obj;
        this.i = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.a(this.f10849h, hVar.f10849h) && k.a(this.i, hVar.i);
    }

    public final int hashCode() {
        Object obj = this.f10849h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f10849h + ", " + this.i + ')';
    }
}
