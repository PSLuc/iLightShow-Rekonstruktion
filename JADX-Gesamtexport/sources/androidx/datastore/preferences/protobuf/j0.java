package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends AbstractC0599v0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6883k;

    public /* synthetic */ j0(int i) {
        this.f6883k = i;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final String o(byte[] bArr, int i, int i3) throws InvalidProtocolBufferException {
        int i6;
        byte b6;
        int i7;
        byte b7;
        byte b8;
        byte b9;
        switch (this.f6883k) {
            case 0:
                if ((i | i3 | ((bArr.length - i) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i3)));
                }
                int i8 = i + i3;
                char[] cArr = new char[i3];
                int i9 = 0;
                while (i < i8) {
                    byte b10 = bArr[i];
                    if (b10 < 0) {
                        while (i < i8) {
                            i6 = i + 1;
                            b6 = bArr[i];
                            if (b6 < 0) {
                                i7 = i9 + 1;
                                cArr[i9] = (char) b6;
                                while (i6 < i8) {
                                    b7 = bArr[i6];
                                    if (b7 >= 0) {
                                        i6++;
                                        cArr[i7] = (char) b7;
                                        i7++;
                                    } else {
                                        i9 = i7;
                                        i = i6;
                                    }
                                }
                                i9 = i7;
                                i = i6;
                            } else if (b6 < -32) {
                                if (i6 < i8) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i += 2;
                                byte b11 = bArr[i6];
                                int i10 = i9 + 1;
                                if (b6 >= -62 || com.fasterxml.jackson.databind.deser.std.d0.t(b11)) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i9] = (char) ((b11 & 63) | ((b6 & 31) << 6));
                                i9 = i10;
                            } else {
                                if (b6 >= -16) {
                                    if (i6 < i8 - 2) {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                    b9 = bArr[i6];
                                    int i11 = i + 3;
                                    byte b12 = bArr[i + 2];
                                    i += 4;
                                    byte b13 = bArr[i11];
                                    int i12 = i9 + 1;
                                    if (!com.fasterxml.jackson.databind.deser.std.d0.t(b9)) {
                                        if ((((b9 + 112) + (b6 << 28)) >> 30) != 0 && !com.fasterxml.jackson.databind.deser.std.d0.t(b12) && !com.fasterxml.jackson.databind.deser.std.d0.t(b13)) {
                                            int i13 = ((b9 & 63) << 12) | ((b6 & 7) << 18) | ((b12 & 63) << 6) | (b13 & 63);
                                            cArr[i9] = (char) ((i13 >>> 10) + 55232);
                                            cArr[i12] = (char) ((i13 & 1023) + 56320);
                                            i9 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.a();
                                }
                                if (i6 < i8 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i14 = i + 2;
                                b8 = bArr[i6];
                                i += 3;
                                byte b14 = bArr[i14];
                                int i15 = i9 + 1;
                                if (!com.fasterxml.jackson.databind.deser.std.d0.t(b8) || ((b6 == -32 && b8 < -96) || ((b6 == -19 && b8 >= -96) || com.fasterxml.jackson.databind.deser.std.d0.t(b14)))) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i9] = (char) (((b8 & 63) << 6) | ((b6 & 15) << 12) | (b14 & 63));
                                i9 = i15;
                            }
                        }
                        return new String(cArr, 0, i9);
                    }
                    i++;
                    cArr[i9] = (char) b10;
                    i9++;
                }
                while (i < i8) {
                    i6 = i + 1;
                    b6 = bArr[i];
                    if (b6 < 0) {
                        if (b6 < -32) {
                            if (i6 < i8) {
                                throw InvalidProtocolBufferException.a();
                            }
                            i += 2;
                            byte b15 = bArr[i6];
                            int i16 = i9 + 1;
                            if (b6 >= -62) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (b6 >= -16) {
                            if (i6 < i8 - 1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i17 = i + 2;
                            b8 = bArr[i6];
                            i += 3;
                            byte b16 = bArr[i17];
                            int i18 = i9 + 1;
                            if (com.fasterxml.jackson.databind.deser.std.d0.t(b8)) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (i6 < i8 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        b9 = bArr[i6];
                        int i19 = i + 3;
                        byte b17 = bArr[i + 2];
                        i += 4;
                        byte b18 = bArr[i19];
                        int i110 = i9 + 1;
                        if (!com.fasterxml.jackson.databind.deser.std.d0.t(b9)) {
                            if ((((b9 + 112) + (b6 << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.a();
                    }
                    i7 = i9 + 1;
                    cArr[i9] = (char) b6;
                    while (i6 < i8) {
                        b7 = bArr[i6];
                        if (b7 >= 0) {
                            i6++;
                            cArr[i7] = (char) b7;
                            i7++;
                        } else {
                            i9 = i7;
                            i = i6;
                        }
                    }
                    i9 = i7;
                    i = i6;
                }
                return new String(cArr, 0, i9);
            default:
                Charset charset = AbstractC0438x.f6926a;
                String str = new String(bArr, i, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i3 + i))) {
                    throw InvalidProtocolBufferException.a();
                }
                return str;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0599v0
    public final int t(int i, int i3, String str, byte[] bArr) {
        int i6;
        int i7;
        char cCharAt;
        long j4;
        long j6;
        long j7;
        int i8;
        char cCharAt2;
        switch (this.f6883k) {
            case 0:
                int length = str.length();
                int i9 = i3 + i;
                int i10 = 0;
                while (i10 < length && (i7 = i10 + i) < i9 && (cCharAt = str.charAt(i10)) < 128) {
                    bArr[i7] = (byte) cCharAt;
                    i10++;
                }
                if (i10 == length) {
                    return i + length;
                }
                int i11 = i + i10;
                while (i10 < length) {
                    char cCharAt3 = str.charAt(i10);
                    if (cCharAt3 < 128 && i11 < i9) {
                        bArr[i11] = (byte) cCharAt3;
                        i11++;
                    } else if (cCharAt3 < 2048 && i11 <= i9 - 2) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) ((cCharAt3 >>> 6) | 960);
                        i11 += 2;
                        bArr[i12] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i11 > i9 - 3) {
                            if (i11 > i9 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i6 = i10 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i6)))) {
                                    throw new k0(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i11);
                            }
                            int i13 = i10 + 1;
                            if (i13 != str.length()) {
                                char cCharAt4 = str.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i11 + 3;
                                    bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i11 += 4;
                                    bArr[i14] = (byte) ((codePoint & 63) | 128);
                                    i10 = i13;
                                } else {
                                    i10 = i13;
                                }
                            }
                            throw new k0(i10 - 1, length);
                        }
                        bArr[i11] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i15 = i11 + 2;
                        bArr[i11 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i11 += 3;
                        bArr[i15] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i10++;
                }
                return i11;
            default:
                long j8 = i;
                long j9 = ((long) i3) + j8;
                int length2 = str.length();
                if (length2 > i3 || bArr.length - i3 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i3));
                }
                int i16 = 0;
                while (true) {
                    j4 = 1;
                    if (i16 < length2 && (cCharAt2 = str.charAt(i16)) < 128) {
                        i0.j(bArr, j8, (byte) cCharAt2);
                        i16++;
                        j8 = 1 + j8;
                    }
                }
                if (i16 != length2) {
                    while (i16 < length2) {
                        char cCharAt5 = str.charAt(i16);
                        if (cCharAt5 < 128 && j8 < j9) {
                            i0.j(bArr, j8, (byte) cCharAt5);
                            j7 = j9;
                            j6 = j4;
                            j8 += j4;
                        } else if (cCharAt5 >= 2048 || j8 > j9 - 2) {
                            j6 = j4;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j8 > j9 - 3) {
                                j7 = j9;
                                if (j8 > j7 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i8 = i16 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i8)))) {
                                        throw new k0(i16, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j8);
                                }
                                int i17 = i16 + 1;
                                if (i17 != length2) {
                                    char cCharAt6 = str.charAt(i17);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        i0.j(bArr, j8, (byte) ((codePoint2 >>> 18) | 240));
                                        i0.j(bArr, j8 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j10 = j8 + 3;
                                        i0.j(bArr, j8 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j8 += 4;
                                        i0.j(bArr, j10, (byte) ((codePoint2 & 63) | 128));
                                        i16 = i17;
                                    } else {
                                        i16 = i17;
                                    }
                                }
                                throw new k0(i16 - 1, length2);
                            }
                            i0.j(bArr, j8, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j11 = j8 + 2;
                            j7 = j9;
                            i0.j(bArr, j8 + j6, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j8 += 3;
                            i0.j(bArr, j11, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j6 = j4;
                            long j12 = j8 + j6;
                            i0.j(bArr, j8, (byte) ((cCharAt5 >>> 6) | 960));
                            j8 += 2;
                            i0.j(bArr, j12, (byte) ((cCharAt5 & '?') | 128));
                            j7 = j9;
                        }
                        i16++;
                        j4 = j6;
                        j9 = j7;
                    }
                }
                return (int) j8;
        }
    }
}
