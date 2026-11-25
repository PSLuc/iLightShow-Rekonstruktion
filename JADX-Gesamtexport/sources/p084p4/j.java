package p084p4;

import E4.k;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Throwable f10850h;

    public j(Throwable th) {
        k.f("exception", th);
        this.f10850h = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return k.a(this.f10850h, ((j) obj).f10850h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10850h.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10850h + ')';
    }
}
