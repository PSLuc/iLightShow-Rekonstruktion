package okhttp3;

import B.AbstractC0013g0;
import E4.g;
import E4.k;
import M4.s;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p084p4.c;
import p133y4.b;

/* JADX INFO: loaded from: classes.dex */
public final class MediaType {
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;
    public static final Companion Companion = new Companion(null);
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @c
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final MediaType m87deprecated_get(String str) {
            k.f("mediaType", str);
            return get(str);
        }

        @c
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final MediaType m88deprecated_parse(String str) {
            k.f("mediaType", str);
            return parse(str);
        }

        public final MediaType get(String str) {
            k.f("<this>", str);
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            k.e("typeSubtype.group(1)", strGroup);
            Locale locale = Locale.US;
            k.e("US", locale);
            String lowerCase = strGroup.toLowerCase(locale);
            k.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
            String strGroup2 = matcher.group(2);
            k.e("typeSubtype.group(2)", strGroup2);
            String lowerCase2 = strGroup2.toLowerCase(locale);
            k.e("this as java.lang.String).toLowerCase(locale)", lowerCase2);
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = MediaType.PARAMETER.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    k.e("this as java.lang.String).substring(startIndex)", strSubstring);
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(AbstractC0013g0.m(sb, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (s.W(strGroup4, "'", false) && s.P(strGroup4, "'", false) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        k.e("this as java.lang.String…ing(startIndex, endIndex)", strGroup4);
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final MediaType parse(String str) {
            k.f("<this>", str);
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, g gVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m85deprecated_subtype() {
        return this.subtype;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final String m86deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && k.a(((MediaType) obj).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        k.f("name", str);
        int i = 0;
        int iB = b.b(0, this.parameterNamesAndValues.length - 1, 2);
        if (iB < 0) {
            return null;
        }
        while (true) {
            int i3 = i + 2;
            if (s.Q(this.parameterNamesAndValues[i], str, true)) {
                return this.parameterNamesAndValues[i + 1];
            }
            if (i == iB) {
                return null;
            }
            i = i3;
        }
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter != null) {
            try {
                return Charset.forName(strParameter);
            } catch (IllegalArgumentException unused) {
            }
        }
        return charset;
    }
}
