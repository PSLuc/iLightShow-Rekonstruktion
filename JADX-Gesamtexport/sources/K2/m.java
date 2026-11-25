package K2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f2117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2120f;

    public m(long j4, long j6, j jVar, Integer num, String str, ArrayList arrayList) {
        x xVar = x.f2127h;
        this.f2115a = j4;
        this.f2116b = j6;
        this.f2117c = jVar;
        this.f2118d = num;
        this.f2119e = str;
        this.f2120f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        m mVar = (m) ((t) obj);
        if (this.f2115a != mVar.f2115a) {
            return false;
        }
        if (this.f2116b != mVar.f2116b) {
            return false;
        }
        if (!this.f2117c.equals(mVar.f2117c)) {
            return false;
        }
        Integer num = mVar.f2118d;
        Integer num2 = this.f2118d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = mVar.f2119e;
        String str2 = this.f2119e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f2120f.equals(mVar.f2120f)) {
            return false;
        }
        Object obj2 = x.f2127h;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j4 = this.f2115a;
        long j6 = this.f2116b;
        int iHashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f2117c.hashCode()) * 1000003;
        Integer num = this.f2118d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2119e;
        return ((this.f2120f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ x.f2127h.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f2115a + ", requestUptimeMs=" + this.f2116b + ", clientInfo=" + this.f2117c + ", logSource=" + this.f2118d + ", logSourceName=" + this.f2119e + ", logEvents=" + this.f2120f + ", qosTier=" + x.f2127h + "}";
    }
}
