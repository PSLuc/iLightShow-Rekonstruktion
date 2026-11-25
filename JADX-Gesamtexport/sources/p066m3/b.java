package p066m3;

import android.app.PendingIntent;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f10410h;
    public final boolean i;

    public b(PendingIntent pendingIntent, boolean z5) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f10410h = pendingIntent;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10410h.equals(((b) aVar).f10410h) && this.i == ((b) aVar).i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.i ? 1237 : 1231) ^ ((this.f10410h.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbW = k.w("ReviewInfo{pendingIntent=", this.f10410h.toString(), ", isNoOp=");
        sbW.append(this.i);
        sbW.append("}");
        return sbW.toString();
    }
}
