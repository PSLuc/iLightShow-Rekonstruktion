package p121w3;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p012c.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f13458a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c6, int i, String str) {
        return i < str.length() && str.charAt(i) == c6;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TRY_LEAVE, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x012e, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) {
        String str2;
        int i;
        int i3;
        int iC;
        int iC2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str3;
        String id;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int iC3 = c(index, str, i6);
            if (a('-', i6, str)) {
                i6 = index + 5;
            }
            int i7 = i6 + 2;
            int iC4 = c(i6, str, i7);
            if (a('-', i7, str)) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int iC5 = c(i7, str, i8);
            boolean zA = a('T', i8, str);
            if (!zA && str.length() <= i8) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i8);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i9 = i7 + 5;
                int iC6 = c(i7 + 3, str, i9);
                if (a(':', i9, str)) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                int iC7 = c(i9, str, i10);
                if (a(':', i10, str)) {
                    i10 = i9 + 3;
                }
                if (str.length() <= i10 || (cCharAt2 = str.charAt(i10)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i8 = i10;
                    i = iC6;
                    i3 = iC7;
                } else {
                    int i11 = i10 + 2;
                    iC2 = c(i10, str, i11);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a('.', i11, str)) {
                        int i12 = i10 + 3;
                        int i13 = i10 + 4;
                        while (true) {
                            if (i13 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i13);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i13++;
                            }
                            length2 = i13;
                            break;
                        }
                        int iMin = Math.min(length2, i10 + 6);
                        iC = c(i12, str, iMin);
                        int i14 = iMin - i12;
                        if (i14 == 1) {
                            iC *= 100;
                        } else if (i14 == 2) {
                            iC *= 10;
                        }
                        i = iC6;
                        i8 = length2;
                        i3 = iC7;
                    } else {
                        i = iC6;
                        i8 = i11;
                        i3 = iC7;
                        iC = 0;
                    }
                }
                if (str.length() > i8) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i8);
                timeZone = f13458a;
                if (cCharAt == 'Z') {
                    length = i8 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i8);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i8 + strSubstring.length();
                    if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                        str3 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str3);
                        id = timeZone.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iC3);
                gregorianCalendar2.set(2, iC4 - 1);
                gregorianCalendar2.set(5, iC5);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i3);
                gregorianCalendar2.set(13, iC2);
                gregorianCalendar2.set(14, iC);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            i3 = 0;
            iC = 0;
            iC2 = 0;
            if (str.length() > i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i8);
            timeZone = f13458a;
            if (cCharAt == 'Z') {
                length = i8 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i8);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i8 + strSubstring.length();
                if (!strSubstring.equals("+0000")) {
                    str3 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str3);
                    id = timeZone.getID();
                    if (!id.equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iC3);
            gregorianCalendar3.set(2, iC4 - 1);
            gregorianCalendar3.set(5, iC5);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i3);
            gregorianCalendar3.set(13, iC2);
            gregorianCalendar3.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e6) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            String message = e6.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e6.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(k.s("Failed to parse date [", str2, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e6);
            throw parseException;
        }
    }

    public static int c(int i, String str, int i3) {
        int i6;
        int i7;
        if (i < 0 || i3 > str.length() || i > i3) {
            throw new NumberFormatException(str);
        }
        if (i < i3) {
            i7 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i3));
            }
            i6 = -iDigit;
        } else {
            i6 = 0;
            i7 = i;
        }
        while (i7 < i3) {
            int i8 = i7 + 1;
            int iDigit2 = Character.digit(str.charAt(i7), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i3));
            }
            i6 = (i6 * 10) - iDigit2;
            i7 = i8;
        }
        return -i6;
    }
}
