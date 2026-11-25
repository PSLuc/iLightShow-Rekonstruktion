package okhttp3;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import M4.l;
import M4.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p084p4.c;
import p089q4.u;

/* JADX INFO: loaded from: classes.dex */
public final class Cookie {
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class Builder {
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private boolean persistent;
        private boolean secure;
        private String value;
        private long expiresAt = DatesKt.MAX_DATE;
        private String path = "/";

        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j4 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j4, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        public final Builder domain(String str) {
            k.f("domain", str);
            return domain(str, false);
        }

        public final Builder expiresAt(long j4) {
            if (j4 <= 0) {
                j4 = Long.MIN_VALUE;
            }
            if (j4 > DatesKt.MAX_DATE) {
                j4 = 253402300799999L;
            }
            this.expiresAt = j4;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            k.f("domain", str);
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            k.f("name", str);
            if (!k.a(l.B0(str).toString(), str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = str;
            return this;
        }

        public final Builder path(String str) {
            k.f("path", str);
            if (!s.W(str, "/", false)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.path = str;
            return this;
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            k.f("value", str);
            if (!k.a(l.B0(str).toString(), str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = str;
            return this;
        }

        private final Builder domain(String str, boolean z5) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost == null) {
                throw new IllegalArgumentException(k.l("unexpected domain: ", str));
            }
            this.domain = canonicalHost;
            this.hostOnly = z5;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final int dateCharacterOffset(String str, int i, int i3, boolean z5) {
            while (i < i3) {
                int i6 = i + 1;
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z5)) {
                    return i;
                }
                i = i6;
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            return k.a(str, str2) || (s.P(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.canParseAsIpAddress(str));
        }

        private final String parseDomain(String str) {
            if (s.P(str, ".", false)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(l.p0(str, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long parseExpires(String str, int i, int i3) {
            int iDateCharacterOffset = dateCharacterOffset(str, i, i3, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str);
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int iG0 = -1;
            int i9 = -1;
            int i10 = -1;
            while (iDateCharacterOffset < i3) {
                int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i3, true);
                matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
                if (i7 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    k.e("matcher.group(1)", strGroup);
                    i7 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    k.e("matcher.group(2)", strGroup2);
                    i9 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    k.e("matcher.group(3)", strGroup3);
                    i10 = Integer.parseInt(strGroup3);
                } else if (i8 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    k.e("matcher.group(1)", strGroup4);
                    i8 = Integer.parseInt(strGroup4);
                } else if (iG0 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    k.e("matcher.group(1)", strGroup5);
                    Locale locale = Locale.US;
                    k.e("US", locale);
                    String lowerCase = strGroup5.toLowerCase(locale);
                    k.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    k.e("MONTH_PATTERN.pattern()", strPattern);
                    iG0 = l.g0(strPattern, lowerCase, 0, 6) / 4;
                } else if (i6 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    k.e("matcher.group(1)", strGroup6);
                    i6 = Integer.parseInt(strGroup6);
                }
                iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i3, false);
            }
            if (70 <= i6 && i6 < 100) {
                i6 += 1900;
            }
            if (i6 >= 0 && i6 < 70) {
                i6 += 2000;
            }
            if (i6 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iG0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i8 || i8 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i7 < 0 || i7 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i9 < 0 || i9 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i10 < 0 || i10 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i6);
            gregorianCalendar.set(2, iG0 - 1);
            gregorianCalendar.set(5, i8);
            gregorianCalendar.set(11, i7);
            gregorianCalendar.set(12, i9);
            gregorianCalendar.set(13, i10);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long parseMaxAge(String str) {
            try {
                long j4 = Long.parseLong(str);
                if (j4 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j4;
            } catch (NumberFormatException e6) {
                Pattern patternCompile = Pattern.compile("-?\\d+");
                k.e("compile(...)", patternCompile);
                k.f("input", str);
                if (patternCompile.matcher(str).matches()) {
                    return s.W(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e6;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String strEncodedPath = httpUrl.encodedPath();
            if (k.a(strEncodedPath, str)) {
                return true;
            }
            return s.W(strEncodedPath, str, false) && (s.P(str, "/", false) || strEncodedPath.charAt(str.length()) == '/');
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            k.f("url", httpUrl);
            k.f("setCookie", str);
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        public final Cookie parse$okhttp(long j4, HttpUrl httpUrl, String str) {
            long j6;
            k.f("url", httpUrl);
            k.f("setCookie", str);
            int iDelimiterOffset$default = Util.delimiterOffset$default(str, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(str, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            String domain = null;
            if (iDelimiterOffset$default2 != iDelimiterOffset$default) {
                String strTrimSubstring$default = Util.trimSubstring$default(str, 0, iDelimiterOffset$default2, 1, null);
                if (strTrimSubstring$default.length() != 0 && Util.indexOfControlOrNonAscii(strTrimSubstring$default) == -1) {
                    String strTrimSubstring = Util.trimSubstring(str, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
                    if (Util.indexOfControlOrNonAscii(strTrimSubstring) == -1) {
                        int i = iDelimiterOffset$default + 1;
                        int length = str.length();
                        String str2 = null;
                        boolean z5 = false;
                        boolean z6 = false;
                        boolean z7 = false;
                        boolean z8 = true;
                        long maxAge = -1;
                        long expires = DatesKt.MAX_DATE;
                        while (i < length) {
                            int iDelimiterOffset = Util.delimiterOffset(str, ';', i, length);
                            int iDelimiterOffset2 = Util.delimiterOffset(str, '=', i, iDelimiterOffset);
                            String strTrimSubstring2 = Util.trimSubstring(str, i, iDelimiterOffset2);
                            String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                            if (s.Q(strTrimSubstring2, "expires", true)) {
                                try {
                                    expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
                                    z6 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (s.Q(strTrimSubstring2, "max-age", true)) {
                                maxAge = parseMaxAge(strTrimSubstring3);
                                z6 = true;
                            } else if (s.Q(strTrimSubstring2, "domain", true)) {
                                domain = parseDomain(strTrimSubstring3);
                                z8 = false;
                            } else if (s.Q(strTrimSubstring2, "path", true)) {
                                str2 = strTrimSubstring3;
                            } else if (s.Q(strTrimSubstring2, "secure", true)) {
                                z7 = true;
                            } else if (s.Q(strTrimSubstring2, "httponly", true)) {
                                z5 = true;
                            }
                            i = iDelimiterOffset + 1;
                        }
                        if (maxAge == Long.MIN_VALUE) {
                            j6 = Long.MIN_VALUE;
                        } else if (maxAge != -1) {
                            long j7 = j4 + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : Long.MAX_VALUE);
                            j6 = (j7 < j4 || j7 > DatesKt.MAX_DATE) ? 253402300799999L : j7;
                        } else {
                            j6 = expires;
                        }
                        String strHost = httpUrl.host();
                        if (domain == null) {
                            domain = strHost;
                        } else if (!domainMatch(strHost, domain)) {
                            return null;
                        }
                        if (strHost.length() != domain.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(domain) == null) {
                            return null;
                        }
                        String strSubstring = "/";
                        if (str2 == null || !s.W(str2, "/", false)) {
                            String strEncodedPath = httpUrl.encodedPath();
                            int iL0 = l.l0(strEncodedPath, '/', 0, 6);
                            if (iL0 != 0) {
                                strSubstring = strEncodedPath.substring(0, iL0);
                                k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                            }
                            str2 = strSubstring;
                        }
                        return new Cookie(strTrimSubstring$default, strTrimSubstring, j6, domain, str2, z7, z5, z6, z8, null);
                    }
                }
            }
            return null;
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            k.f("url", httpUrl);
            k.f("headers", headers);
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i3 = i + 1;
                Cookie cookie = parse(httpUrl, listValues.get(i));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
                i = i3;
            }
            if (arrayList == null) {
                return u.f11237h;
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            k.e("{\n        Collections.un…ableList(cookies)\n      }", listUnmodifiableList);
            return listUnmodifiableList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j4, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8, g gVar) {
        this(str, str2, j4, str3, str4, z5, z6, z7, z8);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name */
    public final String m41deprecated_domain() {
        return this.domain;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name */
    public final long m42deprecated_expiresAt() {
        return this.expiresAt;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name */
    public final boolean m43deprecated_hostOnly() {
        return this.hostOnly;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name */
    public final boolean m44deprecated_httpOnly() {
        return this.httpOnly;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name */
    public final String m45deprecated_name() {
        return this.name;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name */
    public final String m46deprecated_path() {
        return this.path;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name */
    public final boolean m47deprecated_persistent() {
        return this.persistent;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name */
    public final boolean m48deprecated_secure() {
        return this.secure;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name */
    public final String m49deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return k.a(cookie.name, this.name) && k.a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && k.a(cookie.domain, this.domain) && k.a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return Boolean.hashCode(this.hostOnly) + p012c.k.m(this.persistent, p012c.k.m(this.httpOnly, p012c.k.m(this.secure, AbstractC0013g0.c(AbstractC0013g0.c(p012c.k.l(AbstractC0013g0.c(AbstractC0013g0.c(527, this.name, 31), this.value, 31), 31, this.expiresAt), this.domain, 31), this.path, 31), 31), 31), 31);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        k.f("url", httpUrl);
        if ((this.hostOnly ? k.a(httpUrl.host(), this.domain) : Companion.domainMatch(httpUrl.host(), this.domain)) && Companion.pathMatch(httpUrl, this.path)) {
            return !this.secure || httpUrl.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z5) {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('=');
        sb.append(value());
        if (persistent()) {
            if (expiresAt() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(expiresAt())));
            }
        }
        if (!hostOnly()) {
            sb.append("; domain=");
            if (z5) {
                sb.append(".");
            }
            sb.append(domain());
        }
        sb.append("; path=");
        sb.append(path());
        if (secure()) {
            sb.append("; secure");
        }
        if (httpOnly()) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        k.e("toString()", string);
        return string;
    }

    public final String value() {
        return this.value;
    }

    private Cookie(String str, String str2, long j4, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j4;
        this.domain = str3;
        this.path = str4;
        this.secure = z5;
        this.httpOnly = z6;
        this.persistent = z7;
        this.hostOnly = z8;
    }
}
