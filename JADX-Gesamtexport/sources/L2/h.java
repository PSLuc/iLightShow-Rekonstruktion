package L2;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f3060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f3061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f3064f;

    public h(String str, Integer num, l lVar, long j4, long j6, HashMap map) {
        this.f3059a = str;
        this.f3060b = num;
        this.f3061c = lVar;
        this.f3062d = j4;
        this.f3063e = j6;
        this.f3064f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f3064f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f3064f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final A0.b c() {
        A0.b bVar = new A0.b();
        String str = this.f3059a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        bVar.f8a = str;
        bVar.f9b = this.f3060b;
        l lVar = this.f3061c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        bVar.f10c = lVar;
        bVar.f11d = Long.valueOf(this.f3062d);
        bVar.f12e = Long.valueOf(this.f3063e);
        bVar.f13f = new HashMap(this.f3064f);
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f3059a.equals(hVar.f3059a)) {
            return false;
        }
        Integer num = hVar.f3060b;
        Integer num2 = this.f3060b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f3061c.equals(hVar.f3061c) && this.f3062d == hVar.f3062d && this.f3063e == hVar.f3063e && this.f3064f.equals(hVar.f3064f);
    }

    public final int hashCode() {
        int iHashCode = (this.f3059a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3060b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f3061c.hashCode()) * 1000003;
        long j4 = this.f3062d;
        int i = (iHashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j6 = this.f3063e;
        return this.f3064f.hashCode() ^ ((i ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f3059a + ", code=" + this.f3060b + ", encodedPayload=" + this.f3061c + ", eventMillis=" + this.f3062d + ", uptimeMillis=" + this.f3063e + ", autoMetadata=" + this.f3064f + "}";
    }
}
