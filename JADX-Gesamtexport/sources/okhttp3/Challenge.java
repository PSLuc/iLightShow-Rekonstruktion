package okhttp3;

import B.AbstractC0013g0;
import E4.k;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p084p4.c;
import p089q4.z;

/* JADX INFO: loaded from: classes.dex */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String str, Map<String, String> map) {
        String lowerCase;
        k.f("scheme", str);
        k.f("authParams", map);
        this.scheme = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                lowerCase = null;
            } else {
                Locale locale = Locale.US;
                k.e("US", locale);
                lowerCase = key.toLowerCase(locale);
                k.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k.e("unmodifiableMap<String?, String>(newAuthParams)", mapUnmodifiableMap);
        this.authParams = mapUnmodifiableMap;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
    public final Map<String, String> m33deprecated_authParams() {
        return this.authParams;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
    public final Charset m34deprecated_charset() {
        return charset();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
    public final String m35deprecated_realm() {
        return realm();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m36deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    public final Charset charset() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                k.e("forName(charset)", charsetForName);
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        k.e("ISO_8859_1", charset);
        return charset;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return k.a(challenge.scheme, this.scheme) && k.a(challenge.authParams, this.authParams);
    }

    public int hashCode() {
        return this.authParams.hashCode() + AbstractC0013g0.c(899, this.scheme, 31);
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public final Challenge withCharset(Charset charset) {
        k.f("charset", charset);
        LinkedHashMap linkedHashMapY = z.Y(this.authParams);
        String strName = charset.name();
        k.e("charset.name()", strName);
        linkedHashMapY.put("charset", strName);
        return new Challenge(this.scheme, linkedHashMapY);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Challenge(String str, String str2) {
        k.f("scheme", str);
        k.f("realm", str2);
        Map mapSingletonMap = Collections.singletonMap("realm", str2);
        k.e("singletonMap(\"realm\", realm)", mapSingletonMap);
        this(str, (Map<String, String>) mapSingletonMap);
    }
}
