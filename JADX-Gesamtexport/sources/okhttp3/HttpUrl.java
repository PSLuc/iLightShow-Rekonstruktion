package okhttp3;

import E4.g;
import E4.k;
import M4.l;
import M4.s;
import h5.C0732j;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.slf4j.Marker;
import p084p4.c;
import p089q4.n;
import p089q4.u;
import p089q4.w;
import p133y4.b;

/* JADX INFO: loaded from: classes.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i, int i3) {
                try {
                    int i6 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i3, "", false, false, false, false, null, 248, null));
                    if (1 > i6 || i6 >= 65536) {
                        return -1;
                    }
                    return i6;
                } catch (NumberFormatException unused) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i3) {
                while (i < i3) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i >= i3) {
                                break;
                            }
                        } while (str.charAt(i) != ']');
                    } else if (cCharAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i3) {
                if (i3 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((k.h(cCharAt, 97) >= 0 && k.h(cCharAt, 122) <= 0) || (k.h(cCharAt, 65) >= 0 && k.h(cCharAt, 90) <= 0)) {
                    int i6 = i + 1;
                    while (i6 < i3) {
                        int i7 = i6 + 1;
                        char cCharAt2 = str.charAt(i6);
                        if (('a' <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            i6 = i7;
                        } else if (cCharAt2 == ':') {
                            return i6;
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i, int i3) {
                int i6 = 0;
                while (i < i3) {
                    int i7 = i + 1;
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i6++;
                    i = i7;
                }
                return i6;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            k.c(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return k.a(str, ".") || s.Q(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return k.a(str, "..") || s.Q(str, "%2e.", true) || s.Q(str, ".%2e", true) || s.Q(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void push(String str, int i, int i3, boolean z5, boolean z6) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i3, HttpUrl.PATH_SEGMENT_ENCODE_SET, z6, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z5) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            k.c(list);
            int size = list.size() - 2;
            int iB = b.b(size, 0, -2);
            if (iB > size) {
                return;
            }
            while (true) {
                int i = size - 2;
                List<String> list2 = this.encodedQueryNamesAndValues;
                k.c(list2);
                if (k.a(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    k.c(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    k.c(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    k.c(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iB) {
                    return;
                } else {
                    size = i;
                }
            }
        }

        private final void resolvePath(String str, int i, int i3) {
            if (i == i3) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i6 = i;
            while (i6 < i3) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i6, i3);
                boolean z5 = iDelimiterOffset < i3;
                this = this;
                str = str;
                this.push(str, i6, iDelimiterOffset, z5, true);
                i6 = z5 ? iDelimiterOffset + 1 : iDelimiterOffset;
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            k.f("encodedPathSegment", str);
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            k.f("encodedPathSegments", str);
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            k.f("encodedName", str);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            k.c(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            k.c(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str2 == null ? null : Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder addPathSegment(String str) {
            k.f("pathSegment", str);
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            k.f("pathSegments", str);
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            k.f("name", str);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            k.c(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            k.c(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str2 == null ? null : Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(n.P(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList(n.P(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null));
                }
                arrayList = arrayList3;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            setEncodedFragment$okhttp(str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null));
            return this;
        }

        public final Builder encodedPassword(String str) {
            k.f("encodedPassword", str);
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder encodedPath(String str) {
            k.f("encodedPath", str);
            if (!s.W(str, "/", false)) {
                throw new IllegalArgumentException(k.l("unexpected encodedPath: ", str).toString());
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public final Builder encodedQuery(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            List<String> queryNamesAndValues$okhttp = null;
            if (str != null && (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null) {
                queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        public final Builder encodedUsername(String str) {
            k.f("encodedUsername", str);
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder fragment(String str) {
            setEncodedFragment$okhttp(str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null));
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            k.f("host", str);
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException(k.l("unexpected host: ", str));
            }
            setHost$okhttp(canonicalHost);
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int iDelimiterOffset;
            int i;
            boolean z5;
            int i3;
            int i6;
            char c6;
            int i7;
            String str2 = str;
            k.f("input", str2);
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str2, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str2, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(str2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            boolean z6 = true;
            byte b6 = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (s.V(iIndexOfFirstNonAsciiWhitespace$default, str2, "https:", true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!s.V(iIndexOfFirstNonAsciiWhitespace$default, str2, "http:", true)) {
                        StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str2.substring(0, iSchemeDelimiterOffset);
                        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(k.l("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2.length() > 6 ? k.l(l.A0(6, str2), "...") : str2));
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(str2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b7 = 63;
            byte b8 = 35;
            if (iSlashCount >= 2 || httpUrl == null || !k.a(httpUrl.scheme(), this.scheme)) {
                int i8 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(str2, "@/\\?#", i8, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str2.charAt(iDelimiterOffset) : b6;
                    if (bCharAt == b6 || bCharAt == b8 || bCharAt == 47 || bCharAt == 92 || bCharAt == b7) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z7) {
                            z5 = z6;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append("%40");
                            str2 = str;
                            i3 = iDelimiterOffset;
                            sb2.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, i8, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(str2, ':', i8, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            z5 = z6;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str2, i8, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z8) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i6 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, i6, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z7 = z5;
                            } else {
                                i6 = iDelimiterOffset;
                            }
                            str2 = str;
                            i3 = i6;
                            z8 = z5;
                        }
                        i8 = i3 + 1;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                        z6 = z5;
                        b7 = 63;
                        b6 = -1;
                        b8 = 35;
                    }
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(str2, i8, iDelimiterOffset);
                int i9 = iPortColonOffset + 1;
                if (i9 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str2, i8, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(str2, i9, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = str2.substring(i9, iDelimiterOffset);
                        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str2, i8, iPortColonOffset, false, 4, null));
                    String str3 = this.scheme;
                    k.c(str3);
                    this.port = companion4.defaultPort(str3);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = str2.substring(i8, iPortColonOffset);
                    k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring3);
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str2.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i10 = i;
            int iDelimiterOffset3 = Util.delimiterOffset(str2, "?#", iIndexOfFirstNonAsciiWhitespace$default, i10);
            resolvePath(str2, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= i10 || str2.charAt(iDelimiterOffset3) != '?') {
                c6 = '#';
                i7 = iDelimiterOffset3;
            } else {
                c6 = '#';
                int iDelimiterOffset4 = Util.delimiterOffset(str2, '#', iDelimiterOffset3, i10);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str2, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i7 = iDelimiterOffset4;
            }
            if (i7 < i10 && str2.charAt(i7) == c6) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, i7 + 1, i10, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            k.f("password", str);
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final Builder port(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(k.l("unexpected port: ", Integer.valueOf(i)).toString());
            }
            setPort$okhttp(i);
            return this;
        }

        public final Builder query(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            List<String> queryNamesAndValues$okhttp = null;
            if (str != null && (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) != null) {
                queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            }
            setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String strReplaceAll;
            String host$okhttp = getHost$okhttp();
            if (host$okhttp == null) {
                strReplaceAll = null;
            } else {
                Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
                k.e("compile(...)", patternCompile);
                strReplaceAll = patternCompile.matcher(host$okhttp).replaceAll("");
                k.e("replaceAll(...)", strReplaceAll);
            }
            setHost$okhttp(strReplaceAll);
            int size = getEncodedPathSegments$okhttp().size();
            int i = 0;
            for (int i3 = 0; i3 < size; i3++) {
                getEncodedPathSegments$okhttp().set(i3, Companion.canonicalize$okhttp$default(HttpUrl.Companion, getEncodedPathSegments$okhttp().get(i3), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i < size2) {
                    int i6 = i + 1;
                    String str = encodedQueryNamesAndValues$okhttp.get(i);
                    encodedQueryNamesAndValues$okhttp.set(i, str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null));
                    i = i6;
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            setEncodedFragment$okhttp(encodedFragment$okhttp != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedFragment$okhttp, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null);
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            k.f("encodedName", str);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            k.f("name", str);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            getEncodedPathSegments$okhttp().remove(i);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            k.f("scheme", str);
            if (str.equalsIgnoreCase("http")) {
                setScheme$okhttp("http");
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(k.l("unexpected scheme: ", str));
            }
            setScheme$okhttp("https");
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            k.f("<set-?>", str);
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            k.f("encodedPathSegment", str);
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            getEncodedPathSegments$okhttp().set(i, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(k.l("unexpected path segment: ", str).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            k.f("encodedName", str);
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            k.f("<set-?>", str);
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            k.f("pathSegment", str);
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(k.l("unexpected path segment: ", str).toString());
            }
            getEncodedPathSegments$okhttp().set(i, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            k.f("name", str);
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (getScheme$okhttp() != null) {
                sb.append(getScheme$okhttp());
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (getEncodedUsername$okhttp().length() > 0 || getEncodedPassword$okhttp().length() > 0) {
                sb.append(getEncodedUsername$okhttp());
                if (getEncodedPassword$okhttp().length() > 0) {
                    sb.append(':');
                    sb.append(getEncodedPassword$okhttp());
                }
                sb.append('@');
            }
            if (getHost$okhttp() != null) {
                String host$okhttp = getHost$okhttp();
                k.c(host$okhttp);
                if (l.Z(host$okhttp, ':')) {
                    sb.append('[');
                    sb.append(getHost$okhttp());
                    sb.append(']');
                } else {
                    sb.append(getHost$okhttp());
                }
            }
            if (getPort$okhttp() != -1 || getScheme$okhttp() != null) {
                int iEffectivePort = effectivePort();
                if (getScheme$okhttp() != null) {
                    Companion companion = HttpUrl.Companion;
                    String scheme$okhttp = getScheme$okhttp();
                    k.c(scheme$okhttp);
                    if (iEffectivePort != companion.defaultPort(scheme$okhttp)) {
                        sb.append(':');
                        sb.append(iEffectivePort);
                    }
                } else {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            Companion companion2 = HttpUrl.Companion;
            companion2.toPathString$okhttp(getEncodedPathSegments$okhttp(), sb);
            if (getEncodedQueryNamesAndValues$okhttp() != null) {
                sb.append('?');
                List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
                k.c(encodedQueryNamesAndValues$okhttp);
                companion2.toQueryString$okhttp(encodedQueryNamesAndValues$okhttp, sb);
            }
            if (getEncodedFragment$okhttp() != null) {
                sb.append('#');
                sb.append(getEncodedFragment$okhttp());
            }
            String string = sb.toString();
            k.e("StringBuilder().apply(builderAction).toString()", string);
            return string;
        }

        public final Builder username(String str) {
            k.f("username", str);
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        private final Builder addPathSegments(String str, boolean z5) {
            int i = 0;
            while (true) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                this.push(str, i, iDelimiterOffset, iDelimiterOffset < str.length(), z5);
                i = iDelimiterOffset + 1;
                if (i > str.length()) {
                    return this;
                }
                this = this;
                str = str;
                z5 = z5;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i3, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = 0;
            }
            if ((i6 & 2) != 0) {
                i3 = str.length();
            }
            if ((i6 & 8) != 0) {
                z5 = false;
            }
            if ((i6 & 16) != 0) {
                z6 = false;
            }
            if ((i6 & 32) != 0) {
                z7 = false;
            }
            if ((i6 & 64) != 0) {
                z8 = false;
            }
            if ((i6 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i, i3, str2, z5, z6, z7, z8, charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i3) {
            int i6 = i + 2;
            return i6 < i3 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i6)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i3, boolean z5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = 0;
            }
            if ((i6 & 2) != 0) {
                i3 = str.length();
            }
            if ((i6 & 4) != 0) {
                z5 = false;
            }
            return companion.percentDecode$okhttp(str, i, i3, z5);
        }

        private final void writeCanonicalized(C0732j c0732j, String str, int i, int i3, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset) throws EOFException {
            C0732j c0732j2 = null;
            while (i < i3) {
                int iCodePointAt = str.codePointAt(i);
                if (!z5 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z7) {
                        c0732j.h0(z5 ? Marker.ANY_NON_NULL_MARKER : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || l.Z(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z5 || (z6 && !isPercentEncoded(str, i, i3)))))) {
                        if (c0732j2 == null) {
                            c0732j2 = new C0732j();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            c0732j2.i0(iCodePointAt);
                        } else {
                            c0732j2.f0(str, i, Character.charCount(iCodePointAt) + i, charset);
                        }
                        while (!c0732j2.z()) {
                            byte bW = c0732j2.W();
                            c0732j.Z(37);
                            c0732j.Z(HttpUrl.HEX_DIGITS[((bW & 255) >> 4) & 15]);
                            c0732j.Z(HttpUrl.HEX_DIGITS[bW & 15]);
                        }
                    } else {
                        c0732j.i0(iCodePointAt);
                    }
                }
                i += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(C0732j c0732j, String str, int i, int i3, boolean z5) {
            int i6;
            while (i < i3) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i6 = i + 2) < i3) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i6));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        c0732j.i0(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        c0732j.Z((hexDigit << 4) + hexDigit2);
                        i = Character.charCount(iCodePointAt) + i6;
                    }
                } else if (iCodePointAt == 43 && z5) {
                    c0732j.Z(32);
                    i++;
                } else {
                    c0732j.i0(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        @c
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m81deprecated_get(String str) {
            k.f("url", str);
            return get(str);
        }

        @c
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m84deprecated_parse(String str) {
            k.f("url", str);
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i3, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset) throws EOFException {
            k.f("<this>", str);
            k.f("encodeSet", str2);
            int iCharCount = i;
            while (iCharCount < i3) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || l.Z(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !isPercentEncoded(str, iCharCount, i3)))) || (iCodePointAt == 43 && z7)))) {
                    C0732j c0732j = new C0732j();
                    c0732j.g0(i, str, iCharCount);
                    writeCanonicalized(c0732j, str, iCharCount, i3, str2, z5, z6, z7, z8, charset);
                    return c0732j.M();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i, i3);
            k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            return strSubstring;
        }

        public final int defaultPort(String str) {
            k.f("scheme", str);
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            k.f("<this>", str);
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            k.f("<this>", str);
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i3, boolean z5) {
            k.f("<this>", str);
            int i6 = i;
            while (i6 < i3) {
                int i7 = i6 + 1;
                char cCharAt = str.charAt(i6);
                if (cCharAt == '%' || (cCharAt == '+' && z5)) {
                    C0732j c0732j = new C0732j();
                    c0732j.g0(i, str, i6);
                    writePercentDecoded(c0732j, str, i6, i3, z5);
                    return c0732j.M();
                }
                i6 = i7;
            }
            String strSubstring = str.substring(i, i3);
            k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            k.f("<this>", list);
            k.f("out", sb);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            k.f("<this>", str);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iF0 = l.f0(str, '&', i, 4);
                if (iF0 == -1) {
                    iF0 = str.length();
                }
                int iF1 = l.f0(str, '=', i, 4);
                if (iF1 == -1 || iF1 > iF0) {
                    String strSubstring = str.substring(i, iF0);
                    k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iF1);
                    k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iF1 + 1, iF0);
                    k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring3);
                    arrayList.add(strSubstring3);
                }
                i = iF0 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            k.f("<this>", list);
            k.f("out", sb);
            J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, list.size()), 2);
            int i = bVarC0.f1941h;
            int i3 = bVarC0.i;
            int i6 = bVarC0.f1942j;
            if ((i6 <= 0 || i > i3) && (i6 >= 0 || i3 > i)) {
                return;
            }
            while (true) {
                int i7 = i + i6;
                String str = list.get(i);
                String str2 = list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i3) {
                    return;
                } else {
                    i = i7;
                }
            }
        }

        private Companion() {
        }

        @c
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m83deprecated_get(URL url) {
            k.f("url", url);
            return get(url);
        }

        public final HttpUrl get(URL url) {
            k.f("<this>", url);
            String string = url.toString();
            k.e("toString()", string);
            return parse(string);
        }

        @c
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m82deprecated_get(URI uri) {
            k.f("uri", uri);
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            k.f("<this>", uri);
            String string = uri.toString();
            k.e("toString()", string);
            return parse(string);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        k.f("scheme", str);
        k.f("username", str2);
        k.f("password", str3);
        k.f("host", str4);
        k.f("pathSegments", list);
        k.f("url", str6);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = k.a(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m62deprecated_encodedFragment() {
        return encodedFragment();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m63deprecated_encodedPassword() {
        return encodedPassword();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m64deprecated_encodedPath() {
        return encodedPath();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m65deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m66deprecated_encodedQuery() {
        return encodedQuery();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m67deprecated_encodedUsername() {
        return encodedUsername();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m68deprecated_fragment() {
        return this.fragment;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name */
    public final String m69deprecated_host() {
        return this.host;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name */
    public final String m70deprecated_password() {
        return this.password;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m71deprecated_pathSegments() {
        return this.pathSegments;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m72deprecated_pathSize() {
        return pathSize();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name */
    public final int m73deprecated_port() {
        return this.port;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m74deprecated_query() {
        return query();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m75deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m76deprecated_querySize() {
        return querySize();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m77deprecated_scheme() {
        return this.scheme;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m78deprecated_uri() {
        return uri();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m79deprecated_url() {
        return url();
    }

    @c
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name */
    public final String m80deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(l.f0(this.url, '#', 0, 6) + 1);
        k.e("this as java.lang.String).substring(startIndex)", strSubstring);
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(l.f0(this.url, ':', this.scheme.length() + 3, 4) + 1, l.f0(this.url, '@', 0, 6));
        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String encodedPath() {
        int iF0 = l.f0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        String strSubstring = this.url.substring(iF0, Util.delimiterOffset(str, "?#", iF0, str.length()));
        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iF0 = l.f0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iF0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iF0 < iDelimiterOffset) {
            int i = iF0 + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            String strSubstring = this.url.substring(i, iDelimiterOffset2);
            k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            arrayList.add(strSubstring);
            iF0 = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iF0 = l.f0(this.url, '?', 0, 6) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iF0, Util.delimiterOffset(str, '#', iF0, str.length()));
        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && k.a(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        k.f("name", str);
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, list.size()), 2);
        int i = bVarC0.f1941h;
        int i3 = bVarC0.i;
        int i6 = bVarC0.f1942j;
        if ((i6 <= 0 || i > i3) && (i6 >= 0 || i3 > i)) {
            return null;
        }
        while (true) {
            int i7 = i + i6;
            if (str.equals(this.queryNamesAndValues.get(i))) {
                return this.queryNamesAndValues.get(i + 1);
            }
            if (i == i3) {
                return null;
            }
            i = i7;
        }
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i * 2);
        k.c(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return w.f11239h;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, this.queryNamesAndValues.size()), 2);
        int i = bVarC0.f1941h;
        int i3 = bVarC0.i;
        int i6 = bVarC0.f1942j;
        if ((i6 > 0 && i <= i3) || (i6 < 0 && i3 <= i)) {
            while (true) {
                int i7 = i + i6;
                String str = this.queryNamesAndValues.get(i);
                k.c(str);
                linkedHashSet.add(str);
                if (i == i3) {
                    break;
                }
                i = i7;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        k.e("unmodifiableSet(result)", setUnmodifiableSet);
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        k.f("name", str);
        if (this.queryNamesAndValues == null) {
            return u.f11237h;
        }
        ArrayList arrayList = new ArrayList();
        J4.b bVarC0 = p081p0.c.C0(p081p0.c.D0(0, this.queryNamesAndValues.size()), 2);
        int i = bVarC0.f1941h;
        int i3 = bVarC0.i;
        int i6 = bVarC0.f1942j;
        if ((i6 > 0 && i <= i3) || (i6 < 0 && i3 <= i)) {
            while (true) {
                int i7 = i + i6;
                if (str.equals(this.queryNamesAndValues.get(i))) {
                    arrayList.add(this.queryNamesAndValues.get(i + 1));
                }
                if (i == i3) {
                    break;
                }
                i = i7;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        k.e("unmodifiableList(result)", listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        k.c(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        k.f("link", str);
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder == null) {
            return null;
        }
        return builderNewBuilder.build();
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e6) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                k.e("compile(...)", patternCompile);
                k.f("input", string);
                String strReplaceAll = patternCompile.matcher(string).replaceAll("");
                k.e("replaceAll(...)", strReplaceAll);
                URI uriCreate = URI.create(strReplaceAll);
                k.e("{\n      // Unlikely edge…Unexpected!\n      }\n    }", uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        k.f("link", str);
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
