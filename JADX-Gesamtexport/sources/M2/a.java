package M2;

import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3476b;

    public a(int i, long j4) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f3475a = i;
        this.f3476b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC0916i.b(this.f3475a, aVar.f3475a) && this.f3476b == aVar.f3476b;
    }

    public final int hashCode() {
        int iD = (AbstractC0916i.d(this.f3475a) ^ 1000003) * 1000003;
        long j4 = this.f3476b;
        return ((int) (j4 ^ (j4 >>> 32))) ^ iD;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.f3475a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f3476b);
        sb.append("}");
        return sb.toString();
    }
}
