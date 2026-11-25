package K2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f2114g;

    public l(long j4, Integer num, long j6, byte[] bArr, String str, long j7, o oVar) {
        this.f2108a = j4;
        this.f2109b = num;
        this.f2110c = j6;
        this.f2111d = bArr;
        this.f2112e = str;
        this.f2113f = j7;
        this.f2114g = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        l lVar = (l) sVar;
        if (this.f2108a != lVar.f2108a) {
            return false;
        }
        Integer num = this.f2109b;
        if (num == null) {
            if (lVar.f2109b != null) {
                return false;
            }
        } else if (!num.equals(lVar.f2109b)) {
            return false;
        }
        if (this.f2110c != lVar.f2110c) {
            return false;
        }
        if (!Arrays.equals(this.f2111d, sVar instanceof l ? ((l) sVar).f2111d : lVar.f2111d)) {
            return false;
        }
        String str = lVar.f2112e;
        String str2 = this.f2112e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f2113f != lVar.f2113f) {
            return false;
        }
        o oVar = lVar.f2114g;
        o oVar2 = this.f2114g;
        if (oVar2 == null) {
            return oVar == null;
        }
        return oVar2.equals(oVar);
    }

    public final int hashCode() {
        long j4 = this.f2108a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2109b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j6 = this.f2110c;
        int iHashCode2 = (((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2111d)) * 1000003;
        String str = this.f2112e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f2113f;
        int i3 = (iHashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        o oVar = this.f2114g;
        return i3 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f2108a + ", eventCode=" + this.f2109b + ", eventUptimeMs=" + this.f2110c + ", sourceExtension=" + Arrays.toString(this.f2111d) + ", sourceExtensionJsonProto3=" + this.f2112e + ", timezoneOffsetSeconds=" + this.f2113f + ", networkConnectionInfo=" + this.f2114g + "}";
    }
}
