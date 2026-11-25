package K2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2096h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f2097j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f2098k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2099l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f2089a = num;
        this.f2090b = str;
        this.f2091c = str2;
        this.f2092d = str3;
        this.f2093e = str4;
        this.f2094f = str5;
        this.f2095g = str6;
        this.f2096h = str7;
        this.i = str8;
        this.f2097j = str9;
        this.f2098k = str10;
        this.f2099l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f2089a;
            if (num != null ? num.equals(((h) aVar).f2089a) : ((h) aVar).f2089a == null) {
                String str = this.f2090b;
                if (str != null ? str.equals(((h) aVar).f2090b) : ((h) aVar).f2090b == null) {
                    String str2 = this.f2091c;
                    if (str2 != null ? str2.equals(((h) aVar).f2091c) : ((h) aVar).f2091c == null) {
                        String str3 = this.f2092d;
                        if (str3 != null ? str3.equals(((h) aVar).f2092d) : ((h) aVar).f2092d == null) {
                            String str4 = this.f2093e;
                            if (str4 != null ? str4.equals(((h) aVar).f2093e) : ((h) aVar).f2093e == null) {
                                String str5 = this.f2094f;
                                if (str5 != null ? str5.equals(((h) aVar).f2094f) : ((h) aVar).f2094f == null) {
                                    String str6 = this.f2095g;
                                    if (str6 != null ? str6.equals(((h) aVar).f2095g) : ((h) aVar).f2095g == null) {
                                        String str7 = this.f2096h;
                                        if (str7 != null ? str7.equals(((h) aVar).f2096h) : ((h) aVar).f2096h == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(((h) aVar).i) : ((h) aVar).i == null) {
                                                String str9 = this.f2097j;
                                                if (str9 != null ? str9.equals(((h) aVar).f2097j) : ((h) aVar).f2097j == null) {
                                                    String str10 = this.f2098k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f2098k) : ((h) aVar).f2098k == null) {
                                                        String str11 = this.f2099l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f2099l) : ((h) aVar).f2099l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f2089a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2090b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2091c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2092d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2093e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2094f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2095g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2096h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f2097j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f2098k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f2099l;
        return iHashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f2089a);
        sb.append(", model=");
        sb.append(this.f2090b);
        sb.append(", hardware=");
        sb.append(this.f2091c);
        sb.append(", device=");
        sb.append(this.f2092d);
        sb.append(", product=");
        sb.append(this.f2093e);
        sb.append(", osBuild=");
        sb.append(this.f2094f);
        sb.append(", manufacturer=");
        sb.append(this.f2095g);
        sb.append(", fingerprint=");
        sb.append(this.f2096h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.f2097j);
        sb.append(", mccMnc=");
        sb.append(this.f2098k);
        sb.append(", applicationBuild=");
        return p012c.k.u(sb, this.f2099l, "}");
    }
}
