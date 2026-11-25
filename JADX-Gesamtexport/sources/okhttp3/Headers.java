package okhttp3;

import E4.g;
import E4.k;
import F4.a;
import M4.l;
import M4.s;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p084p4.c;
import p084p4.h;
import p089q4.u;
import p133y4.b;

/* JADX INFO: loaded from: classes.dex */
public final class Headers implements Iterable<h>, a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            k.f("line", str);
            int iF0 = l.f0(str, ':', 0, 6);
            if (iF0 == -1) {
                throw new IllegalArgumentException(k.l("Unexpected header: ", str).toString());
            }
            String strSubstring = str.substring(0, iF0);
            k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            String string = l.B0(strSubstring).toString();
            String strSubstring2 = str.substring(iF0 + 1);
            k.e("this as java.lang.String).substring(startIndex)", strSubstring2);
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            k.f("headers", headers);
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            k.f("line", str);
            int iF0 = l.f0(str, ':', 1, 4);
            if (iF0 != -1) {
                String strSubstring = str.substring(0, iF0);
                k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
                String strSubstring2 = str.substring(iF0 + 1);
                k.e("this as java.lang.String).substring(startIndex)", strSubstring2);
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (str.charAt(0) != ':') {
                addLenient$okhttp("", str);
                return this;
            }
            String strSubstring3 = str.substring(1);
            k.e("this as java.lang.String).substring(startIndex)", strSubstring3);
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String get(String str) {
            k.f("name", str);
            int size = this.namesAndValues.size() - 2;
            int iB = b.b(size, 0, -2);
            if (iB > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                if (str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size == iB) {
                    return null;
                }
                size = i;
            }
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            k.f("name", str);
            int i = 0;
            while (i < getNamesAndValues$okhttp().size()) {
                if (str.equalsIgnoreCase(getNamesAndValues$okhttp().get(i))) {
                    getNamesAndValues$okhttp().remove(i);
                    getNamesAndValues$okhttp().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            k.f("name", str);
            k.f("value", date);
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            k.f("name", str);
            k.f("value", instant);
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, Date date) {
            k.f("name", str);
            k.f("value", date);
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            k.f("name", str);
            k.f("value", str2);
            getNamesAndValues$okhttp().add(str);
            getNamesAndValues$okhttp().add(l.B0(str2).toString());
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            k.f("name", str);
            k.f("value", instant);
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
                i = i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(k.l(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2), Util.isSensitiveHeader(str2) ? "" : k.l(": ", str)).toString());
                }
                i = i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iB = b.b(length, 0, -2);
            if (iB > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (s.Q(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == iB) {
                    return null;
                }
                length = i;
            }
        }

        @c
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m61deprecated_of(String... strArr) {
            k.f("namesAndValues", strArr);
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            k.f("namesAndValues", strArr);
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            int i3 = 0;
            while (i3 < length) {
                int i6 = i3 + 1;
                String str = strArr2[i3];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i3] = l.B0(str).toString();
                i3 = i6;
            }
            int iB = b.b(0, strArr2.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    int i7 = i + 2;
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i == iB) {
                        break;
                    }
                    i = i7;
                }
            }
            return new Headers(strArr2, null);
        }

        private Companion() {
        }

        @c
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m60deprecated_of(Map<String, String> map) {
            k.f("headers", map);
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            k.f("<this>", map);
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = l.B0(key).toString();
                String string2 = l.B0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, g gVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    @c
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m59deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        k.f("name", str);
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        k.f("name", str);
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        return DatesKt.toHttpDateOrNull(str2);
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        k.f("name", str);
        Date date = getDate(str);
        if (date == null) {
            return null;
        }
        return date.toInstant();
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<h> iterator() {
        int size = size();
        h[] hVarArr = new h[size];
        for (int i = 0; i < size; i++) {
            hVarArr[i] = new h(name(i), value(i));
        }
        return k.j(hVarArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        k.e("CASE_INSENSITIVE_ORDER", comparator);
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        k.e("unmodifiableSet(result)", setUnmodifiableSet);
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        List<String> namesAndValues$okhttp = builder.getNamesAndValues$okhttp();
        String[] strArr = this.namesAndValues;
        k.f("<this>", namesAndValues$okhttp);
        k.f("elements", strArr);
        namesAndValues$okhttp.addAll(p089q4.k.a0(strArr));
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        k.e("CASE_INSENSITIVE_ORDER", comparator);
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            String strName = name(i);
            Locale locale = Locale.US;
            k.e("US", locale);
            String lowerCase = strName.toLowerCase(locale);
            k.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i));
            i = i3;
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            String strName = name(i);
            String strValue = value(i);
            sb.append(strName);
            sb.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb.append(strValue);
            sb.append("\n");
            i = i3;
        }
        String string = sb.toString();
        k.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        k.f("name", str);
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i3 = i + 1;
            if (str.equalsIgnoreCase(name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
            i = i3;
        }
        if (arrayList == null) {
            return u.f11237h;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        k.e("{\n      Collections.unmodifiableList(result)\n    }", listUnmodifiableList);
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
