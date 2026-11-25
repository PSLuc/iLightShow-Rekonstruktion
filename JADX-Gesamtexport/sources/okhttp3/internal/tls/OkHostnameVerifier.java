package okhttp3.internal.tls;

import B.AbstractC0013g0;
import E4.k;
import M4.s;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.slf4j.Marker;
import p089q4.l;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        k.e("US", locale);
        String lowerCase = str.toLowerCase(locale);
        k.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        Object obj;
        u uVar = u.f11237h;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return uVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && k.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return uVar;
        }
    }

    private final boolean isAscii(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC0013g0.g("endIndex < beginIndex: ", length2, 0, " < ").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbV = p012c.k.v(length2, "endIndex > string.length: ", " > ");
            sbV.append(str.length());
            throw new IllegalArgumentException(sbV.toString().toString());
        }
        long j4 = 0;
        int i3 = 0;
        while (i3 < length2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                j4++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i6 = i3 + 1;
                    char cCharAt2 = i6 < length2 ? str.charAt(i6) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j4++;
                        i3 = i6;
                    } else {
                        j4 += (long) 4;
                        i3 += 2;
                    }
                }
                j4 += (long) i;
            }
            i3++;
        }
        return length == ((int) j4);
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (k.a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        k.f("certificate", x509Certificate);
        return l.j0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        k.f("host", str);
        k.f("session", sSLSession);
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        k.f("host", str);
        k.f("certificate", x509Certificate);
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        int length;
        if (str != null && str.length() != 0 && !s.W(str, ".", false) && !s.P(str, "..", false) && str2 != null && str2.length() != 0 && !s.W(str2, ".", false) && !s.P(str2, "..", false)) {
            if (!s.P(str, ".", false)) {
                str = k.l(str, ".");
            }
            if (!s.P(str2, ".", false)) {
                str2 = k.l(str2, ".");
            }
            String strAsciiToLowercase = asciiToLowercase(str2);
            if (!M4.l.a0(strAsciiToLowercase, Marker.ANY_MARKER)) {
                return k.a(str, strAsciiToLowercase);
            }
            if (s.W(strAsciiToLowercase, "*.", false) && M4.l.f0(strAsciiToLowercase, '*', 1, 4) == -1 && str.length() >= strAsciiToLowercase.length() && !"*.".equals(strAsciiToLowercase)) {
                String strSubstring = strAsciiToLowercase.substring(1);
                k.e("this as java.lang.String).substring(startIndex)", strSubstring);
                if (s.P(str, strSubstring, false) && ((length = str.length() - strSubstring.length()) <= 0 || M4.l.l0(str, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
