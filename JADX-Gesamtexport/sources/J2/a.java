package J2;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f1907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1908e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1910b;

    static {
        String strP0 = p027e3.a.p0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f1906c = strP0;
        p027e3.a.p0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        p027e3.a.p0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1907d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new I2.b("proto"), new I2.b("json"))));
        f1908e = new a(strP0, null);
    }

    public a(String str, String str2) {
        this.f1909a = str;
        this.f1910b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
