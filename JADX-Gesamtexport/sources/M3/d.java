package M3;

import E4.k;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3497e;

    public d(String str, String str2, String str3, int i, String str4) {
        this.f3493a = str;
        this.f3494b = str2;
        this.f3495c = str3;
        this.f3496d = i;
        this.f3497e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.a(this.f3493a, dVar.f3493a) && k.a(this.f3494b, dVar.f3494b) && k.a(this.f3495c, dVar.f3495c) && this.f3496d == dVar.f3496d && k.a(this.f3497e, dVar.f3497e);
    }

    public final int hashCode() {
        int iHashCode = this.f3493a.hashCode() * 31;
        String str = this.f3494b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3495c;
        int iC = AbstractC0916i.c(this.f3496d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f3497e;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveredNanoleaf(id=");
        sb.append(this.f3493a);
        sb.append(", ip=");
        sb.append(this.f3494b);
        sb.append(", name=");
        sb.append(this.f3495c);
        sb.append(", port=");
        sb.append(this.f3496d);
        sb.append(", model=");
        return p012c.k.u(sb, this.f3497e, ")");
    }
}
