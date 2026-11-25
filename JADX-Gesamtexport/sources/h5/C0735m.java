package h5;

import B.AbstractC0013g0;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: h5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0735m implements Serializable, Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0735m f9352k = new C0735m(new byte[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f9353h;
    public transient int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient String f9354j;

    public C0735m(byte[] bArr) {
        E4.k.f("data", bArr);
        this.f9353h = bArr;
    }

    public static int g(C0735m c0735m, C0735m c0735m2) {
        c0735m.getClass();
        E4.k.f("other", c0735m2);
        return c0735m.f(0, c0735m2.f9353h);
    }

    public static int k(C0735m c0735m, C0735m c0735m2) {
        c0735m.getClass();
        E4.k.f("other", c0735m2);
        return c0735m.j(c0735m2.f9353h);
    }

    public static /* synthetic */ C0735m o(C0735m c0735m, int i, int i3, int i6) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = -1234567890;
        }
        return c0735m.n(i, i3);
    }

    public String a() {
        byte[] bArr = AbstractC0723a.f9338a;
        byte[] bArr2 = this.f9353h;
        E4.k.f("<this>", bArr2);
        E4.k.f("map", bArr);
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i3 = 0;
        while (i < length) {
            byte b6 = bArr2[i];
            int i6 = i + 2;
            byte b7 = bArr2[i + 1];
            i += 3;
            byte b8 = bArr2[i6];
            bArr3[i3] = bArr[(b6 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            int i7 = i3 + 3;
            bArr3[i3 + 2] = bArr[((b7 & 15) << 2) | ((b8 & 255) >> 6)];
            i3 += 4;
            bArr3[i7] = bArr[b8 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b9 = bArr2[i];
            bArr3[i3] = bArr[(b9 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b9 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (length2 == 2) {
            int i8 = i + 1;
            byte b10 = bArr2[i];
            byte b11 = bArr2[i8];
            bArr3[i3] = bArr[(b10 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b11 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return new String(bArr3, M4.a.f3520a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0735m c0735m) {
        E4.k.f("other", c0735m);
        int iD = d();
        int iD2 = c0735m.d();
        int iMin = Math.min(iD, iD2);
        for (int i = 0; i < iMin; i++) {
            int i3 = i(i) & 255;
            int i6 = c0735m.i(i) & 255;
            if (i3 != i6) {
                return i3 < i6 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public C0735m c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f9353h, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        E4.k.e("digestBytes", bArrDigest);
        return new C0735m(bArrDigest);
    }

    public int d() {
        return this.f9353h.length;
    }

    public String e() {
        byte[] bArr = this.f9353h;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b6 : bArr) {
            int i3 = i + 1;
            char[] cArr2 = i5.b.f9594a;
            cArr[i] = cArr2[(b6 >> 4) & 15];
            i += 2;
            cArr[i3] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0735m) {
            C0735m c0735m = (C0735m) obj;
            int iD = c0735m.d();
            byte[] bArr = this.f9353h;
            if (iD == bArr.length && c0735m.m(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i, byte[] bArr) {
        E4.k.f("other", bArr);
        byte[] bArr2 = this.f9353h;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC0724b.a(iMax, 0, bArr.length, bArr2, bArr)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f9353h;
    }

    public int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f9353h);
        this.i = iHashCode;
        return iHashCode;
    }

    public byte i(int i) {
        return this.f9353h[i];
    }

    public int j(byte[] bArr) {
        E4.k.f("other", bArr);
        int iD = d();
        byte[] bArr2 = this.f9353h;
        for (int iMin = Math.min(iD, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC0724b.a(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i, C0735m c0735m, int i3) {
        E4.k.f("other", c0735m);
        return c0735m.m(0, this.f9353h, i, i3);
    }

    public boolean m(int i, byte[] bArr, int i3, int i6) {
        E4.k.f("other", bArr);
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f9353h;
        return i <= bArr2.length - i6 && i3 >= 0 && i3 <= bArr.length - i6 && AbstractC0724b.a(i, i3, i6, bArr2, bArr);
    }

    public C0735m n(int i, int i3) {
        if (i3 == -1234567890) {
            i3 = d();
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f9353h;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException(AbstractC0013g0.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i3 - i >= 0) {
            return (i == 0 && i3 == bArr.length) ? this : new C0735m(p089q4.k.h0(bArr, i, i3));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public C0735m p() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f9353h;
            if (i >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i];
            if (b6 >= 65 && b6 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                E4.k.e("copyOf(this, size)", bArrCopyOf);
                bArrCopyOf[i] = (byte) (b6 + 32);
                for (int i3 = i + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b7 = bArrCopyOf[i3];
                    if (b7 >= 65 && b7 <= 90) {
                        bArrCopyOf[i3] = (byte) (b7 + 32);
                    }
                }
                return new C0735m(bArrCopyOf);
            }
            i++;
        }
    }

    public final String q() {
        String str = this.f9354j;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        E4.k.f("<this>", bArrH);
        String str2 = new String(bArrH, M4.a.f3520a);
        this.f9354j = str2;
        return str2;
    }

    public void r(int i, C0732j c0732j) {
        E4.k.f("buffer", c0732j);
        c0732j.Y(this.f9353h, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01ae A[EDGE_INSN: B:182:0x01ae->B:183:0x01af BREAK  A[LOOP:0: B:7:0x000e->B:244:0x000e]] */
    public String toString() {
        byte b6;
        int i;
        C0735m c0735m = this;
        byte[] bArr = c0735m.f9353h;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        loop0: while (i3 < length) {
            byte b7 = bArr[i3];
            if (b7 < 0) {
                if ((b7 >> 5) != -2) {
                    if ((b7 >> 4) != -2) {
                        if ((b7 >> 3) != -2) {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                        int i8 = i3 + 3;
                        if (length > i8) {
                            byte b8 = bArr[i3 + 1];
                            if ((b8 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            byte b9 = bArr[i3 + 2];
                            if ((b9 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            byte b10 = bArr[i8];
                            if ((b10 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            int i9 = (((b10 ^ 3678080) ^ (b9 << 6)) ^ (b8 << 12)) ^ (b7 << 18);
                            if (i9 <= 1114111) {
                                if (55296 <= i9 && i9 < 57344) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                }
                                if (i9 >= 65536) {
                                    i = i7 + 1;
                                    if (i7 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        i6 = -1;
                                        break;
                                    }
                                    i6 += i9 < 65536 ? 1 : 2;
                                    i3 += 4;
                                    i7 = i;
                                } else {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                }
                            } else {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                        } else {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                    } else {
                        int i10 = i3 + 2;
                        if (length > i10) {
                            byte b11 = bArr[i3 + 1];
                            if ((b11 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            byte b12 = bArr[i10];
                            if ((b12 & 192) != 128) {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                            int i11 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b7 << 12);
                            if (i11 >= 2048) {
                                if (55296 <= i11 && i11 < 57344) {
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                }
                                i = i7 + 1;
                                if (i7 == 64) {
                                    break;
                                }
                                if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                    i6 = -1;
                                    break;
                                }
                                i6 += i11 < 65536 ? 1 : 2;
                                i3 += 3;
                                i7 = i;
                            } else {
                                if (i7 == 64) {
                                    break;
                                }
                                i6 = -1;
                                break;
                            }
                        } else {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                    }
                } else {
                    int i12 = i3 + 1;
                    if (length > i12) {
                        byte b13 = bArr[i12];
                        if ((b13 & 192) != 128) {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                        int i13 = (b13 ^ 3968) ^ (b7 << 6);
                        if (i13 >= 128) {
                            i = i7 + 1;
                            if (i7 == 64) {
                                break;
                            }
                            if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                i6 = -1;
                                break;
                            }
                            i6 += i13 < 65536 ? 1 : 2;
                            i3 += 2;
                            i7 = i;
                        } else {
                            if (i7 == 64) {
                                break;
                            }
                            i6 = -1;
                            break;
                        }
                    } else {
                        if (i7 == 64) {
                            break;
                        }
                        i6 = -1;
                        break;
                    }
                }
            } else {
                int i14 = i7 + 1;
                if (i7 == 64) {
                    break;
                }
                if ((b7 == 10 || b7 == 13 || ((b7 < 0 || b7 >= 32) && (127 > b7 || b7 >= 160))) && b7 != 65533) {
                    i6 += b7 < 65536 ? 1 : 2;
                    i3++;
                    while (true) {
                        i7 = i14;
                        if (i3 < length && (b6 = bArr[i3]) >= 0) {
                            i3++;
                            i14 = i7 + 1;
                            if (i7 == 64) {
                                break loop0;
                            }
                            if ((b6 == 10 || b6 == 13 || ((b6 < 0 || b6 >= 32) && (127 > b6 || b6 >= 160))) && b6 != 65533) {
                                i6 += b6 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i6 = -1;
                break;
            }
        }
        if (i6 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + c0735m.e() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(AbstractC0013g0.k(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            if (64 != bArr.length) {
                c0735m = new C0735m(p089q4.k.h0(bArr, 0, 64));
            }
            sb.append(c0735m.e());
            sb.append("…]");
            return sb.toString();
        }
        String strQ = c0735m.q();
        String strSubstring = strQ.substring(0, i6);
        E4.k.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
        String strU = M4.s.U(M4.s.U(M4.s.U(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i6 >= strQ.length()) {
            return "[text=" + strU + ']';
        }
        return "[size=" + bArr.length + " text=" + strU + "…]";
    }
}
