package I2;

import com.google.android.gms.internal.play_billing.v1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f1852a;

    public a(v1 v1Var) {
        this.f1852a = v1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (!this.f1852a.equals(aVar.f1852a)) {
            return false;
        }
        Object obj2 = c.f1854h;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f1852a.hashCode() ^ (1000003 * 1000003)) * 1000003) ^ c.f1854h.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f1852a + ", priority=" + c.f1854h + "}";
    }
}
