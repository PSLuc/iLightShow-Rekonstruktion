package S1;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: S1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0355q implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0355q f4971o = new C0355q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4972h;
    public final EnumC0354p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Locale f4973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f4974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f4975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0353o f4976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient TimeZone f4977n;

    public C0355q() {
        this("", EnumC0354p.f4961h, "", "", C0353o.f4958c, null);
    }

    public static boolean a(Object obj, Serializable serializable) {
        if (obj == null) {
            return serializable == null;
        }
        if (serializable == null) {
            return false;
        }
        return obj.equals(serializable);
    }

    public final Boolean b(EnumC0352n enumC0352n) {
        C0353o c0353o = this.f4976m;
        c0353o.getClass();
        int iOrdinal = 1 << enumC0352n.ordinal();
        if ((c0353o.f4960b & iOrdinal) != 0) {
            return Boolean.FALSE;
        }
        if ((c0353o.f4959a & iOrdinal) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final TimeZone c() {
        TimeZone timeZone = this.f4977n;
        if (timeZone != null) {
            return timeZone;
        }
        String str = this.f4974k;
        if (str == null) {
            return null;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str);
        this.f4977n = timeZone2;
        return timeZone2;
    }

    public final boolean d() {
        if (this.f4977n != null) {
            return true;
        }
        String str = this.f4974k;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0054 A[PHI: r1
  0x0054: PHI (r1v3 S1.o) = (r1v2 S1.o), (r1v4 S1.o), (r1v2 S1.o), (r1v2 S1.o) binds: [B:25:0x0035, B:39:0x0056, B:37:0x0052, B:29:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    public final C0355q e(C0355q c0355q) {
        C0355q c0355q2;
        TimeZone timeZone;
        if (c0355q == null || c0355q == (c0355q2 = f4971o) || c0355q == this) {
            return this;
        }
        if (this == c0355q2) {
            return c0355q;
        }
        String str = c0355q.f4972h;
        if (str == null || str.isEmpty()) {
            str = this.f4972h;
        }
        String str2 = str;
        EnumC0354p enumC0354p = EnumC0354p.f4961h;
        EnumC0354p enumC0354p2 = c0355q.i;
        if (enumC0354p2 == enumC0354p) {
            enumC0354p2 = this.i;
        }
        EnumC0354p enumC0354p3 = enumC0354p2;
        Locale locale = c0355q.f4973j;
        if (locale == null) {
            locale = this.f4973j;
        }
        Locale locale2 = locale;
        C0353o c0353o = c0355q.f4976m;
        C0353o c0353o2 = this.f4976m;
        if (c0353o2 != null) {
            if (c0353o == null) {
                c0353o = c0353o2;
            } else {
                int i = c0353o.f4960b;
                int i3 = c0353o.f4959a;
                if (i == 0 && i3 == 0) {
                    c0353o = c0353o2;
                } else {
                    int i6 = c0353o2.f4960b;
                    int i7 = c0353o2.f4959a;
                    if (i7 != 0 || i6 != 0) {
                        int i8 = ((~i) & i7) | i3;
                        int i9 = i | ((~i3) & i6);
                        if (i8 != i7 || i9 != i6) {
                            c0353o2 = new C0353o(i8, i9);
                        }
                        c0353o = c0353o2;
                    }
                }
            }
        }
        C0353o c0353o3 = c0353o;
        Boolean bool = c0355q.f4975l;
        if (bool == null) {
            bool = this.f4975l;
        }
        Boolean bool2 = bool;
        String str3 = c0355q.f4974k;
        if (str3 == null || str3.isEmpty()) {
            TimeZone timeZone2 = this.f4977n;
            str3 = this.f4974k;
            timeZone = timeZone2;
        } else {
            timeZone = c0355q.f4977n;
        }
        return new C0355q(str2, enumC0354p3, locale2, str3, timeZone, c0353o3, bool2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0355q.class) {
            return false;
        }
        C0355q c0355q = (C0355q) obj;
        return this.i == c0355q.i && this.f4976m.equals(c0355q.f4976m) && a(this.f4975l, c0355q.f4975l) && a(this.f4974k, c0355q.f4974k) && a(this.f4972h, c0355q.f4972h) && a(this.f4977n, c0355q.f4977n) && a(this.f4973j, c0355q.f4973j);
    }

    public final int hashCode() {
        String str = this.f4974k;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.f4972h;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        int iHashCode2 = this.i.hashCode() + iHashCode;
        Boolean bool = this.f4975l;
        if (bool != null) {
            iHashCode2 ^= bool.hashCode();
        }
        Locale locale = this.f4973j;
        if (locale != null) {
            iHashCode2 += locale.hashCode();
        }
        return this.f4976m.hashCode() ^ iHashCode2;
    }

    public final String toString() {
        return "JsonFormat.Value(pattern=" + this.f4972h + ",shape=" + this.i + ",lenient=" + this.f4975l + ",locale=" + this.f4973j + ",timezone=" + this.f4974k + ",features=" + this.f4976m + ")";
    }

    public C0355q(String str, EnumC0354p enumC0354p, String str2, String str3, C0353o c0353o, Boolean bool) {
        this(str, enumC0354p, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, c0353o, bool);
    }

    public C0355q(String str, EnumC0354p enumC0354p, Locale locale, String str2, TimeZone timeZone, C0353o c0353o, Boolean bool) {
        this.f4972h = str == null ? "" : str;
        this.i = enumC0354p == null ? EnumC0354p.f4961h : enumC0354p;
        this.f4973j = locale;
        this.f4977n = timeZone;
        this.f4974k = str2;
        this.f4976m = c0353o == null ? C0353o.f4958c : c0353o;
        this.f4975l = bool;
    }
}
