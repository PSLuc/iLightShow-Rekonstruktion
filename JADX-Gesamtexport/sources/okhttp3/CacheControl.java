package okhttp3;

import E4.g;
import E4.k;
import M4.l;
import M4.s;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import p084p4.c;

/* JADX INFO: loaded from: classes.dex */
public final class CacheControl {
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;
    public static final Companion Companion = new Companion(null);
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j4) {
            if (j4 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j4;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            k.f("timeUnit", timeUnit);
            if (i < 0) {
                throw new IllegalArgumentException(k.l("maxAge < 0: ", Integer.valueOf(i)).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i));
            return this;
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            k.f("timeUnit", timeUnit);
            if (i < 0) {
                throw new IllegalArgumentException(k.l("maxStale < 0: ", Integer.valueOf(i)).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i));
            return this;
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            k.f("timeUnit", timeUnit);
            if (i < 0) {
                throw new IllegalArgumentException(k.l("minFresh < 0: ", Integer.valueOf(i)).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i));
            return this;
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i3 = i + 1;
                if (l.Z(str2, str.charAt(i))) {
                    return i;
                }
                i = i3;
            }
            return str.length();
        }

        public static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004d  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:54:0x013f  */
        /* JADX WARN: Code duplicated, block: B:57:0x014d  */
        /* JADX WARN: Code duplicated, block: B:75:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00c4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x0178 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0106 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0116 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0126 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x0156 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x0167 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00e4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0137 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0147 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x0170 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x015f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x012f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x011e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x010e A[SYNTHETIC] */
        public final CacheControl parse(Headers headers) {
            int iIndexOfElement;
            int iIndexOfElement2;
            boolean z5;
            String string;
            String string2;
            Headers headers2 = headers;
            k.f("headers", headers2);
            int size = headers2.size();
            boolean z6 = true;
            boolean z7 = true;
            int i = 0;
            String str = null;
            boolean z8 = false;
            boolean z9 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (i < size) {
                int i3 = i + 1;
                String strName = headers2.name(i);
                String strValue = headers2.value(i);
                if (s.Q(strName, "Cache-Control", z6)) {
                    if (str == null) {
                        str = strValue;
                    }
                    iIndexOfElement = 0;
                    while (iIndexOfElement < strValue.length()) {
                        iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                        String strSubstring = strValue.substring(iIndexOfElement, iIndexOfElement2);
                        z5 = z6;
                        k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                        string = l.B0(strSubstring).toString();
                        if (iIndexOfElement2 != strValue.length() || strValue.charAt(iIndexOfElement2) == ',' || strValue.charAt(iIndexOfElement2) == ';') {
                            iIndexOfElement = iIndexOfElement2 + 1;
                            string2 = null;
                        } else {
                            int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strValue, iIndexOfElement2 + 1);
                            if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                                iIndexOfElement = indexOfElement(strValue, ",;", iIndexOfNonWhitespace);
                                String strSubstring2 = strValue.substring(iIndexOfNonWhitespace, iIndexOfElement);
                                k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
                                string2 = l.B0(strSubstring2).toString();
                            } else {
                                int i6 = iIndexOfNonWhitespace + 1;
                                int iF0 = l.f0(strValue, '\"', i6, 4);
                                string2 = strValue.substring(i6, iF0);
                                k.e("this as java.lang.String…ing(startIndex, endIndex)", string2);
                                iIndexOfElement = iF0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z8 = z6;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z9 = z6;
                        } else {
                            if ("max-age".equalsIgnoreCase(string)) {
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else if ("s-maxage".equalsIgnoreCase(string)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if ("private".equalsIgnoreCase(string)) {
                                z6 = z5;
                                z10 = z6;
                            } else if ("public".equalsIgnoreCase(string)) {
                                z6 = z5;
                                z11 = z6;
                            } else if ("must-revalidate".equalsIgnoreCase(string)) {
                                z6 = z5;
                                z12 = z6;
                            } else if ("max-stale".equalsIgnoreCase(string)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if ("min-fresh".equalsIgnoreCase(string)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if ("only-if-cached".equalsIgnoreCase(string)) {
                                z6 = z5;
                                z13 = z6;
                            } else if ("no-transform".equalsIgnoreCase(string)) {
                                z6 = z5;
                                z14 = z6;
                            } else if ("immutable".equalsIgnoreCase(string)) {
                                z6 = z5;
                                z15 = z6;
                            }
                            z6 = z5;
                        }
                    }
                    headers2 = headers;
                    i = i3;
                } else {
                    if (s.Q(strName, "Pragma", z6)) {
                    }
                    headers2 = headers;
                    i = i3;
                }
                z7 = false;
                iIndexOfElement = 0;
                while (iIndexOfElement < strValue.length()) {
                    iIndexOfElement2 = indexOfElement(strValue, "=,;", iIndexOfElement);
                    String strSubstring3 = strValue.substring(iIndexOfElement, iIndexOfElement2);
                    z5 = z6;
                    k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring3);
                    string = l.B0(strSubstring3).toString();
                    if (iIndexOfElement2 != strValue.length()) {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    } else {
                        iIndexOfElement = iIndexOfElement2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z8 = z6;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z6 = z5;
                        z9 = z6;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z10 = z6;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z11 = z6;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z12 = z6;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z13 = z6;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z14 = z6;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z6 = z5;
                            z15 = z6;
                        }
                        z6 = z5;
                    }
                }
                headers2 = headers;
                i = i3;
            }
            return new CacheControl(z8, z9, nonNegativeInt, nonNegativeInt2, z10, z11, z12, nonNegativeInt3, nonNegativeInt4, z13, z14, z15, !z7 ? null : str, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z5, boolean z6, int i, int i3, boolean z7, boolean z8, boolean z9, int i6, int i7, boolean z10, boolean z11, boolean z12, String str, g gVar) {
        this(z5, z6, i, i3, z7, z8, z9, i6, i7, z10, z11, z12, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m23deprecated_immutable() {
        return this.immutable;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m24deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m25deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m26deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m27deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m28deprecated_noCache() {
        return this.noCache;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m29deprecated_noStore() {
        return this.noStore;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m30deprecated_noTransform() {
        return this.noTransform;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m31deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m32deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (noCache()) {
            sb.append("no-cache, ");
        }
        if (noStore()) {
            sb.append("no-store, ");
        }
        if (maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(maxAgeSeconds());
            sb.append(", ");
        }
        if (sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(sMaxAgeSeconds());
            sb.append(", ");
        }
        if (isPrivate()) {
            sb.append("private, ");
        }
        if (isPublic()) {
            sb.append("public, ");
        }
        if (mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(maxStaleSeconds());
            sb.append(", ");
        }
        if (minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(minFreshSeconds());
            sb.append(", ");
        }
        if (onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (noTransform()) {
            sb.append("no-transform, ");
        }
        if (immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        this.headerValue = string;
        return string;
    }

    private CacheControl(boolean z5, boolean z6, int i, int i3, boolean z7, boolean z8, boolean z9, int i6, int i7, boolean z10, boolean z11, boolean z12, String str) {
        this.noCache = z5;
        this.noStore = z6;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i3;
        this.isPrivate = z7;
        this.isPublic = z8;
        this.mustRevalidate = z9;
        this.maxStaleSeconds = i6;
        this.minFreshSeconds = i7;
        this.onlyIfCached = z10;
        this.noTransform = z11;
        this.immutable = z12;
        this.headerValue = str;
    }
}
