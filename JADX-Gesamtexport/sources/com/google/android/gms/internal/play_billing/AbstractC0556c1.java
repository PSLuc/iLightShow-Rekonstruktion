package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0556c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7938a = 0;

    static {
        if (AbstractC0550a1.f7934e && AbstractC0550a1.f7933d) {
            int i = AbstractC0578k0.f7955a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i, int i3) {
        int i6 = i3 - i;
        byte b6 = bArr[i - 1];
        if (i6 == 0) {
            if (b6 <= -12) {
                return b6;
            }
            return -1;
        }
        if (i6 == 1) {
            byte b7 = bArr[i];
            if (b6 > -12 || b7 > -65) {
                return -1;
            }
            return (b7 << 8) ^ b6;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b8 = bArr[i];
        byte b9 = bArr[i + 1];
        if (b6 > -12 || b8 > -65 || b9 > -65) {
            return -1;
        }
        return (b9 << 16) ^ ((b8 << 8) ^ b6);
    }

    public static int b(int i, int i3, String str, byte[] bArr) {
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i6 = i + i3;
            if (i9 >= length || (i8 = i9 + i) >= i6 || (cCharAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) cCharAt;
            i9++;
        }
        if (i9 == length) {
            return i + length;
        }
        int i10 = i + i9;
        while (i9 < length) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 128 && i10 < i6) {
                bArr[i10] = (byte) cCharAt2;
                i10++;
            } else if (cCharAt2 < 2048 && i10 <= i6 - 2) {
                bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i10 > i6 - 3) {
                    if (i10 > i6 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i7 = i9 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i7)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new C0553b1(i9, length);
                    }
                    int i11 = i9 + 1;
                    if (i11 != str.length()) {
                        char cCharAt3 = str.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i12 = i10 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i9 = i11;
                        } else {
                            i9 = i11;
                        }
                    }
                    throw new C0553b1(i9 - 1, length);
                }
                bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i10 += 3;
            }
            i9++;
        }
        return i10;
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i6 = length;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new C0553b1(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i6 += i;
                break;
            }
            i6 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    public static boolean d(byte[] bArr, int i, int i3) {
        while (i < i3 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i3) {
            return true;
        }
        while (i < i3) {
            int i6 = i + 1;
            int iA = bArr[i];
            if (iA >= 0) {
                i = i6;
            } else if (iA < -32) {
                if (i6 >= i3) {
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                if (iA < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i6] > -65) {
                    return false;
                }
            } else if (iA < -16) {
                if (i6 >= i3 - 1) {
                    iA = a(bArr, i6, i3);
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                int i7 = i + 2;
                byte b6 = bArr[i6];
                if (b6 > -65) {
                    return false;
                }
                if (iA == -32 && b6 < -96) {
                    return false;
                }
                if (iA == -19 && b6 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i7] > -65) {
                    return false;
                }
            } else {
                if (i6 >= i3 - 2) {
                    iA = a(bArr, i6, i3);
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                int i8 = i + 2;
                byte b7 = bArr[i6];
                if (b7 > -65) {
                    return false;
                }
                if ((((b7 + 112) + (iA << 28)) >> 30) != 0) {
                    return false;
                }
                int i9 = i + 3;
                if (bArr[i8] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i9] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
