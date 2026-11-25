package p109u2;

import B.AbstractC0013g0;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class x extends DateFormat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f12719n = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f12720o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f12721p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final TimeZone f12722q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Locale f12723r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SimpleDateFormat f12724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x f12725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final GregorianCalendar f12726u;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient TimeZone f12727h;
    public final Locale i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f12728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient Calendar f12729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient DateFormat f12730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f12731m;

    static {
        try {
            f12720o = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            f12721p = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            f12722q = timeZone;
            Locale locale = Locale.US;
            f12723r = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            f12724s = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            f12725t = new x();
            f12726u = new GregorianCalendar(timeZone, locale);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public x() {
        this.f12731m = true;
        this.i = f12723r;
    }

    public static int b(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static int c(String str) {
        return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
    }

    public static void f(StringBuffer stringBuffer, int i) {
        int i3 = i / 10;
        if (i3 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i3 + 48));
            i -= i3 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    public static void g(StringBuffer stringBuffer, int i) {
        int i3 = i / 100;
        if (i3 == 0) {
            stringBuffer.append('0');
            stringBuffer.append('0');
        } else {
            if (i3 > 99) {
                stringBuffer.append(i3);
            } else {
                f(stringBuffer, i3);
            }
            i -= i3 * 100;
        }
        f(stringBuffer, i);
    }

    public final Calendar a(TimeZone timeZone) {
        Calendar calendar = this.f12729k;
        if (calendar == null) {
            calendar = (Calendar) f12726u.clone();
            this.f12729k = calendar;
        }
        if (!calendar.getTimeZone().equals(timeZone)) {
            calendar.setTimeZone(timeZone);
        }
        calendar.setLenient(isLenient());
        return calendar;
    }

    @Override // java.text.DateFormat, java.text.Format
    public final Object clone() {
        return new x(this.f12727h, this.i, this.f12728j, this.f12731m);
    }

    public final Date d(String str) throws ParseException {
        String str2;
        int i;
        int iB;
        int length = str.length();
        Calendar calendarA = a((this.f12727h == null || 'Z' == str.charAt(length + (-1))) ? f12722q : this.f12727h);
        calendarA.clear();
        int iCharAt = 0;
        if (length > 10) {
            Matcher matcher = f12720o.matcher(str);
            if (matcher.matches()) {
                int iStart = matcher.start(2);
                int iEnd = matcher.end(2);
                int i3 = iEnd - iStart;
                if (i3 > 1) {
                    int iB2 = b(iStart + 1, str) * 3600;
                    if (i3 >= 5) {
                        iB2 += b(iEnd - 2, str) * 60;
                    }
                    calendarA.set(15, str.charAt(iStart) == '-' ? iB2 * (-1000) : iB2 * 1000);
                    calendarA.set(16, 0);
                }
                int iC = c(str);
                int iB3 = b(5, str) - 1;
                int iB4 = b(8, str);
                int iB5 = b(11, str);
                int iB6 = b(14, str);
                if (length <= 16 || str.charAt(16) != ':') {
                    i = iC;
                    iB = 0;
                } else {
                    i = iC;
                    iB = b(17, str);
                }
                calendarA.set(i, iB3, iB4, iB5, iB6, iB);
                int iStart2 = matcher.start(1);
                int i6 = iStart2 + 1;
                int iEnd2 = matcher.end(1);
                if (i6 >= iEnd2) {
                    calendarA.set(14, 0);
                } else {
                    int i7 = iEnd2 - i6;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3 && i7 > 9) {
                                    throw new ParseException(AbstractC0013g0.j("Cannot parse date \"", str, "\": invalid fractional seconds '", matcher.group(1).substring(1), "'; can use at most 9 digits"), i6);
                                }
                                iCharAt = str.charAt(iStart2 + 3) - '0';
                            }
                            iCharAt += (str.charAt(iStart2 + 2) - '0') * 10;
                        }
                        iCharAt += (str.charAt(i6) - '0') * 100;
                    }
                    calendarA.set(14, iCharAt);
                }
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
        } else {
            if (f12719n.matcher(str).matches()) {
                calendarA.set(c(str), b(5, str) - 1, b(8, str), 0, 0, 0);
                calendarA.set(14, 0);
                return calendarA.getTime();
            }
            str2 = "yyyy-MM-dd";
        }
        Boolean bool = this.f12728j;
        StringBuilder sbO = AbstractC0013g0.o("Cannot parse date \"", str, "\": while it seems to fit format '", str2, "', parsing fails (leniency? ");
        sbO.append(bool);
        sbO.append(")");
        throw new ParseException(sbO.toString(), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r2 < 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date e(java.lang.String r6, java.text.ParsePosition r7) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p109u2.x.e(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        TimeZone timeZone = this.f12727h;
        if (timeZone == null) {
            timeZone = f12722q;
        }
        Calendar calendarA = a(timeZone);
        calendarA.setTime(date);
        int i = calendarA.get(1);
        if (calendarA.get(0) != 0) {
            if (i > 9999) {
                stringBuffer.append('+');
            }
            g(stringBuffer, i);
        } else if (i == 1) {
            stringBuffer.append("+0000");
        } else {
            stringBuffer.append('-');
            g(stringBuffer, i - 1);
        }
        stringBuffer.append('-');
        f(stringBuffer, calendarA.get(2) + 1);
        stringBuffer.append('-');
        f(stringBuffer, calendarA.get(5));
        stringBuffer.append('T');
        f(stringBuffer, calendarA.get(11));
        stringBuffer.append(':');
        f(stringBuffer, calendarA.get(12));
        stringBuffer.append(':');
        f(stringBuffer, calendarA.get(13));
        stringBuffer.append('.');
        int i3 = calendarA.get(14);
        int i6 = i3 / 100;
        if (i6 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i6 + 48));
            i3 -= i6 * 100;
        }
        f(stringBuffer, i3);
        int offset = timeZone.getOffset(calendarA.getTimeInMillis());
        boolean z5 = this.f12731m;
        if (offset == 0) {
            if (z5) {
                stringBuffer.append("+00:00");
                return stringBuffer;
            }
            stringBuffer.append("+0000");
            return stringBuffer;
        }
        int i7 = offset / 60000;
        int iAbs = Math.abs(i7 / 60);
        int iAbs2 = Math.abs(i7 % 60);
        stringBuffer.append(offset < 0 ? '-' : '+');
        f(stringBuffer, iAbs);
        if (z5) {
            stringBuffer.append(':');
        }
        f(stringBuffer, iAbs2);
        return stringBuffer;
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.f12727h;
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this.f12728j;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateE = e(strTrim, parsePosition);
        if (dateE != null) {
            return dateE;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : f12721p) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(AbstractC0013g0.j("Cannot parse date \"", strTrim, "\": not compatible with any of standard forms (", sb.toString(), ")"), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Boolean bool = this.f12728j;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this.f12728j = boolValueOf;
        this.f12730l = null;
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.f12727h)) {
            return;
        }
        this.f12730l = null;
        this.f12727h = timeZone;
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", x.class.getName(), this.f12727h, this.i, this.f12728j);
    }

    public x(TimeZone timeZone, Locale locale, Boolean bool, boolean z5) {
        this.f12727h = timeZone;
        this.i = locale;
        this.f12728j = bool;
        this.f12731m = z5;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return e(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
