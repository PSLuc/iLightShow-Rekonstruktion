package T1;

import B.AbstractC0013g0;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int[] f5150h;
    public final transient char[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final transient byte[] f5151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final char f5153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f5155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f5156o;

    public a(String str, String str2, boolean z5, char c6, int i) {
        int[] iArr = new int[128];
        this.f5150h = iArr;
        char[] cArr = new char[64];
        this.i = cArr;
        this.f5151j = new byte[64];
        this.f5152k = str;
        this.f5155n = z5;
        this.f5153l = c6;
        this.f5154m = i;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(AbstractC0013g0.f(length, "Base64Alphabet length must be exactly 64 (was ", ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < length; i3++) {
            char c7 = this.i[i3];
            this.f5151j[i3] = (byte) c7;
            this.f5150h[c7] = i3;
        }
        if (z5) {
            this.f5150h[c6] = -2;
        }
        this.f5156o = z5 ? 2 : 1;
    }

    public final void a(char c6, int i, String str) {
        String str2;
        if (c6 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c6) + ") as character #" + (i + 1) + " of 4-char base64 unit: can only used between units";
        } else {
            char c7 = this.f5153l;
            if (c6 == c7) {
                str2 = "Unexpected padding character ('" + c7 + "') as character #" + (i + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else if (!Character.isDefined(c6) || Character.isISOControl(c6)) {
                str2 = "Illegal character (code 0x" + Integer.toHexString(c6) + ") in base64 content";
            } else {
                str2 = "Illegal character '" + c6 + "' (code 0x" + Integer.toHexString(c6) + ") in base64 content";
            }
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public final void b(String str, p009b2.c cVar) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt > ' ') {
                int iC = c(cCharAt);
                if (iC < 0) {
                    a(cCharAt, 0, null);
                    throw null;
                }
                if (i3 >= length) {
                    throw new IllegalArgumentException(g());
                }
                int i6 = i + 2;
                char cCharAt2 = str.charAt(i3);
                int iC2 = c(cCharAt2);
                if (iC2 < 0) {
                    a(cCharAt2, 1, null);
                    throw null;
                }
                int i7 = (iC << 6) | iC2;
                int i8 = this.f5156o;
                if (i6 >= length) {
                    if (i8 == 2) {
                        throw new IllegalArgumentException(g());
                    }
                    cVar.c(i7 >> 4);
                    return;
                }
                int i9 = i + 3;
                char cCharAt3 = str.charAt(i6);
                int iC3 = c(cCharAt3);
                String str2 = this.f5152k;
                if (iC3 >= 0) {
                    int i10 = (i7 << 6) | iC3;
                    if (i9 >= length) {
                        if (i8 == 2) {
                            throw new IllegalArgumentException(g());
                        }
                        cVar.o(i10 >> 2);
                        return;
                    }
                    i += 4;
                    char cCharAt4 = str.charAt(i9);
                    int iC4 = c(cCharAt4);
                    if (iC4 >= 0) {
                        cVar.k((i10 << 6) | iC4);
                    } else {
                        if (iC4 != -2) {
                            a(cCharAt4, 3, null);
                            throw null;
                        }
                        if (i8 == 1) {
                            throw new IllegalArgumentException(AbstractC0013g0.i("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                        }
                        cVar.o(i10 >> 2);
                    }
                } else {
                    if (iC3 != -2) {
                        a(cCharAt3, 2, null);
                        throw null;
                    }
                    if (i8 == 1) {
                        throw new IllegalArgumentException(AbstractC0013g0.i("Unexpected end of base64-encoded String: base64 variant '", str2, "' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured"));
                    }
                    if (i9 >= length) {
                        throw new IllegalArgumentException(g());
                    }
                    i += 4;
                    char cCharAt5 = str.charAt(i9);
                    char c6 = this.f5153l;
                    if (cCharAt5 != c6) {
                        a(cCharAt5, 3, "expected padding character '" + c6 + "'");
                        throw null;
                    }
                    cVar.c(i7 >> 4);
                }
            } else {
                i = i3;
            }
        }
    }

    public final int c(char c6) {
        if (c6 <= 127) {
            return this.f5150h[c6];
        }
        return -1;
    }

    public final String d(byte[] bArr) {
        char[] cArr;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        int i = this.f5154m >> 2;
        int i3 = length - 3;
        int i6 = 0;
        loop0: while (true) {
            int i7 = i;
            do {
                cArr = this.i;
                if (i6 > i3) {
                    break loop0;
                }
                int i8 = i6 + 2;
                int i9 = ((bArr[i6 + 1] & 255) | (bArr[i6] << 8)) << 8;
                i6 += 3;
                int i10 = i9 | (bArr[i8] & 255);
                sb.append(cArr[(i10 >> 18) & 63]);
                sb.append(cArr[(i10 >> 12) & 63]);
                sb.append(cArr[(i10 >> 6) & 63]);
                sb.append(cArr[i10 & 63]);
                i7--;
            } while (i7 > 0);
            sb.append("\\n");
        }
        int i11 = length - i6;
        if (i11 > 0) {
            int i12 = i6 + 1;
            int i13 = bArr[i6] << 16;
            if (i11 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            }
            sb.append(cArr[(i13 >> 18) & 63]);
            sb.append(cArr[(i13 >> 12) & 63]);
            if (this.f5155n) {
                char c6 = this.f5153l;
                sb.append(i11 == 2 ? cArr[(i13 >> 6) & 63] : c6);
                sb.append(c6);
            } else if (i11 == 2) {
                sb.append(cArr[(i13 >> 6) & 63]);
            }
        }
        return sb.toString();
    }

    public final int e(char[] cArr, int i, int i3) {
        char[] cArr2 = this.i;
        cArr[i3] = cArr2[(i >> 18) & 63];
        cArr[i3 + 1] = cArr2[(i >> 12) & 63];
        int i6 = i3 + 3;
        cArr[i3 + 2] = cArr2[(i >> 6) & 63];
        int i7 = i3 + 4;
        cArr[i6] = cArr2[i & 63];
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return aVar.f5153l == this.f5153l && aVar.f5154m == this.f5154m && aVar.f5155n == this.f5155n && aVar.f5156o == this.f5156o && this.f5152k.equals(aVar.f5152k);
    }

    public final int f(int i, int i3, int i6, char[] cArr) {
        char[] cArr2 = this.i;
        cArr[i6] = cArr2[(i >> 18) & 63];
        int i7 = i6 + 2;
        cArr[i6 + 1] = cArr2[(i >> 12) & 63];
        if (!this.f5155n) {
            if (i3 != 2) {
                return i7;
            }
            int i8 = i6 + 3;
            cArr[i7] = cArr2[(i >> 6) & 63];
            return i8;
        }
        int i9 = i6 + 3;
        char c6 = this.f5153l;
        cArr[i7] = i3 == 2 ? cArr2[(i >> 6) & 63] : c6;
        int i10 = i6 + 4;
        cArr[i9] = c6;
        return i10;
    }

    public final String g() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", this.f5152k, Character.valueOf(this.f5153l));
    }

    public final int hashCode() {
        return this.f5152k.hashCode();
    }

    public final String toString() {
        return this.f5152k;
    }

    public a(a aVar) {
        int i = aVar.f5156o;
        int[] iArr = new int[128];
        this.f5150h = iArr;
        char[] cArr = new char[64];
        this.i = cArr;
        byte[] bArr = new byte[64];
        this.f5151j = bArr;
        this.f5152k = "MIME-NO-LINEFEEDS";
        byte[] bArr2 = aVar.f5151j;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = aVar.i;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = aVar.f5150h;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this.f5155n = true;
        this.f5153l = '=';
        this.f5154m = Integer.MAX_VALUE;
        this.f5156o = i;
    }
}
