package p047i4;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Throwable f9590h;

    public d(Throwable th) {
        this.f9590h = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f9590h;
        Throwable th = this.f9590h;
        if (th != obj2) {
            return th != null && th.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return this.f9590h.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f9590h + "]";
    }
}
