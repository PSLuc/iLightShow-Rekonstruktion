package T1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparable, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s f5250j = new s();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5251h = "";
    public final String i = "";

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        if (sVar == this) {
            return 0;
        }
        int iCompareTo = this.f5251h.compareTo(sVar.f5251h);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.i.compareTo(sVar.i);
        if (iCompareTo2 == 0) {
            return 0;
        }
        return iCompareTo2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.i.equals(this.i) && sVar.f5251h.equals(this.f5251h);
    }

    public final int hashCode() {
        return this.f5251h.hashCode() ^ this.i.hashCode();
    }

    public final String toString() {
        return new StringBuilder("0.0.0").toString();
    }
}
