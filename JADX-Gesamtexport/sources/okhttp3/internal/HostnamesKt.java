package okhttp3.internal;

import E4.k;
import M4.l;
import M4.s;
import h5.C0732j;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (k.h(cCharAt, 31) <= 0 || k.h(cCharAt, 127) >= 0 || l.f0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
            i = i3;
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i3, byte[] bArr, int i6) {
        int i7 = i6;
        while (i < i3) {
            if (i7 == bArr.length) {
                return false;
            }
            if (i7 != i6) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i8 = i;
            int i9 = 0;
            while (i8 < i3) {
                char cCharAt = str.charAt(i8);
                if (k.h(cCharAt, 48) < 0 || k.h(cCharAt, 57) > 0) {
                    break;
                }
                if ((i9 == 0 && i != i8) || (i9 = ((i9 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i8++;
            }
            if (i8 - i == 0) {
                return false;
            }
            bArr[i7] = (byte) i9;
            i7++;
            i = i8;
        }
        return i7 == i6 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[LOOP:1: B:28:0x004b->B:32:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x005e A[EDGE_INSN: B:54:0x005e->B:33:0x005e BREAK  A[LOOP:1: B:28:0x004b->B:32:0x0058], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i, int i3) {
        int i6;
        int i7;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (i < i3) {
            if (i8 == 16) {
                return null;
            }
            int i11 = i + 2;
            if (i11 <= i3 && s.V(i, str, "::", false)) {
                if (i9 != -1) {
                    return null;
                }
                i8 += 2;
                i9 = i8;
                if (i11 == i3) {
                    break;
                }
                i10 = i11;
                i6 = 0;
                i = i10;
                while (i < i3) {
                    hexDigit = Util.parseHexDigit(str.charAt(i));
                    if (hexDigit == -1) {
                        break;
                        break;
                    }
                    i6 = (i6 << 4) + hexDigit;
                    i++;
                }
                i7 = i - i10;
                return i7 == 0 ? null : null;
            }
            if (i8 != 0) {
                if (!s.V(i, str, ":", false)) {
                    if (!s.V(i, str, ".", false) || !decodeIpv4Suffix(str, i10, i3, bArr, i8 - 2)) {
                        return null;
                    }
                    i8 += 2;
                    break;
                }
                i++;
            }
            i10 = i;
            i6 = 0;
            i = i10;
            while (i < i3) {
                hexDigit = Util.parseHexDigit(str.charAt(i));
                if (hexDigit == -1) {
                    break;
                }
                i6 = (i6 << 4) + hexDigit;
                i++;
            }
            i7 = i - i10;
            if (i7 == 0 && i7 <= 4) {
                int i12 = i8 + 1;
                bArr[i8] = (byte) ((i6 >>> 8) & 255);
                i8 += 2;
                bArr[i12] = (byte) (i6 & 255);
            }
        }
        if (i8 != 16) {
            if (i9 == -1) {
                return null;
            }
            int i13 = i8 - i9;
            System.arraycopy(bArr, i9, bArr, 16 - i13, i13);
            Arrays.fill(bArr, i9, (16 - i8) + i9, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = -1;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < bArr.length) {
            int i8 = i6;
            while (i8 < 16 && bArr[i8] == 0 && bArr[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        C0732j c0732j = new C0732j();
        while (i3 < bArr.length) {
            if (i3 == i) {
                c0732j.Z(58);
                i3 += i7;
                if (i3 == 16) {
                    c0732j.Z(58);
                }
            } else {
                if (i3 > 0) {
                    c0732j.Z(58);
                }
                c0732j.b0((Util.and(bArr[i3], 255) << 8) | Util.and(bArr[i3 + 1], 255));
                i3 += 2;
            }
        }
        return c0732j.M();
    }

    public static final String toCanonicalHost(String str) {
        k.f("<this>", str);
        if (!l.a0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                k.e("toASCII(host)", ascii);
                Locale locale = Locale.US;
                k.e("US", locale);
                String lowerCase = ascii.toLowerCase(locale);
                k.e("this as java.lang.String).toLowerCase(locale)", lowerCase);
                if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (s.W(str, "[", false) && s.P(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
