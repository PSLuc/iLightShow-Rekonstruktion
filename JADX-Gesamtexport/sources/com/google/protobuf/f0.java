package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends G4.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8211e;

    public /* synthetic */ f0(int i) {
        this.f8211e = i;
    }

    public static int V(int i, int i3, long j4, byte[] bArr) {
        if (i3 == 0) {
            G4.a aVar = g0.f8213a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i3 == 1) {
            return g0.b(i, e0.g(bArr, j4));
        }
        if (i3 == 2) {
            return g0.c(i, e0.g(bArr, j4), e0.g(bArr, j4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:126:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    @Override // G4.a
    public final int B(byte[] bArr, int i, int i3) {
        int i6;
        int i7;
        long j4;
        byte bG;
        long j6;
        byte bG2;
        long j7;
        switch (this.f8211e) {
            case 0:
                break;
            default:
                if ((i | i3 | (bArr.length - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i3)));
                }
                long j8 = i;
                int i8 = (int) (((long) i3) - j8);
                if (i8 < 16) {
                    i6 = 0;
                } else {
                    int i9 = 8 - (((int) j8) & 7);
                    i6 = 0;
                    long j9 = j8;
                    while (true) {
                        if (i6 < i9) {
                            long j10 = j9 + 1;
                            if (e0.g(bArr, j9) >= 0) {
                                i6++;
                                j9 = j10;
                            }
                        } else {
                            while (true) {
                                int i10 = i6 + 8;
                                if (i10 <= i8) {
                                    if ((e0.f8204c.h(e0.f8207f + j9, bArr) & (-9187201950435737472L)) == 0) {
                                        j9 += 8;
                                        i6 = i10;
                                    }
                                }
                            }
                            while (true) {
                                if (i6 < i8) {
                                    long j11 = j9 + 1;
                                    if (e0.g(bArr, j9) >= 0) {
                                        i6++;
                                        j9 = j11;
                                    }
                                } else {
                                    i6 = i8;
                                }
                            }
                        }
                    }
                }
                int i11 = i8 - i6;
                long j12 = j8 + ((long) i6);
                while (true) {
                    byte bG3 = 0;
                    while (i11 > 0) {
                        long j13 = j12 + 1;
                        bG3 = e0.g(bArr, j12);
                        if (bG3 < 0) {
                            j12 = j13;
                            if (i11 == 0) {
                                return 0;
                            }
                            i7 = i11 - 1;
                            if (bG3 < -32) {
                                if (i7 == 0) {
                                    return bG3;
                                }
                                i11 -= 2;
                                if (bG3 >= -62) {
                                    j4 = j12 + 1;
                                    if (e0.g(bArr, j12) > -65) {
                                        j12 = j4;
                                    }
                                }
                                return -1;
                            }
                            if (bG3 < -16) {
                                if (i7 < 2) {
                                    return V(bG3, i7, j12, bArr);
                                }
                                i11 -= 3;
                                long j14 = j12 + 1;
                                bG = e0.g(bArr, j12);
                                if (bG > -65 && ((bG3 != -32 || bG >= -96) && (bG3 != -19 || bG < -96))) {
                                    j12 += 2;
                                    if (e0.g(bArr, j14) > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (i7 < 3) {
                                return V(bG3, i7, j12, bArr);
                            }
                            i11 -= 4;
                            j6 = j12 + 1;
                            bG2 = e0.g(bArr, j12);
                            if (bG2 <= -65) {
                                if ((((bG2 + 112) + (bG3 << 28)) >> 30) == 0) {
                                    j7 = 2 + j12;
                                    if (e0.g(bArr, j6) <= -65) {
                                        j12 += 3;
                                        if (e0.g(bArr, j7) > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i11--;
                        j12 = j13;
                    }
                    if (i11 == 0) {
                        return 0;
                    }
                    i7 = i11 - 1;
                    if (bG3 < -32) {
                        if (i7 == 0) {
                            return bG3;
                        }
                        i11 -= 2;
                        if (bG3 >= -62) {
                            j4 = j12 + 1;
                            if (e0.g(bArr, j12) > -65) {
                                j12 = j4;
                            }
                        }
                        return -1;
                    }
                    if (bG3 < -16) {
                        if (i7 < 2) {
                            return V(bG3, i7, j12, bArr);
                        }
                        i11 -= 3;
                        long j15 = j12 + 1;
                        bG = e0.g(bArr, j12);
                        if (bG > -65) {
                        }
                        return -1;
                    }
                    if (i7 < 3) {
                        return V(bG3, i7, j12, bArr);
                    }
                    i11 -= 4;
                    j6 = j12 + 1;
                    bG2 = e0.g(bArr, j12);
                    if (bG2 <= -65) {
                        if ((((bG2 + 112) + (bG3 << 28)) >> 30) == 0) {
                            j7 = 2 + j12;
                            if (e0.g(bArr, j6) <= -65) {
                                j12 += 3;
                                if (e0.g(bArr, j7) > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i < i3 && bArr[i] >= 0) {
            i++;
        }
        if (i < i3) {
            while (i < i3) {
                int i12 = i + 1;
                byte b6 = bArr[i];
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i12 >= i3) {
                            return b6;
                        }
                        if (b6 >= -62) {
                            i += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b6 < -16) {
                        if (i12 >= i3 - 1) {
                            return g0.a(bArr, i12, i3);
                        }
                        int i13 = i + 2;
                        byte b7 = bArr[i12];
                        if (b7 <= -65 && ((b6 != -32 || b7 >= -96) && (b6 != -19 || b7 < -96))) {
                            i += 3;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i3 - 2) {
                        return g0.a(bArr, i12, i3);
                    }
                    int i14 = i + 2;
                    byte b8 = bArr[i12];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b6 << 28)) >> 30) == 0) {
                            int i15 = i + 3;
                            if (bArr[i14] <= -65) {
                                i += 4;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i = i12;
            }
        }
        return 0;
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
    @Override // G4.a
    public final String q(byte[] bArr, int i, int i3) throws InvalidProtocolBufferException {
        int i6;
        byte b6;
        int i7;
        byte b7;
        byte b8;
        byte b9;
        switch (this.f8211e) {
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
                                if (b6 >= -62 || p081p0.c.q0(b11)) {
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
                                    if (!p081p0.c.q0(b9)) {
                                        if ((((b9 + 112) + (b6 << 28)) >> 30) != 0 && !p081p0.c.q0(b12) && !p081p0.c.q0(b13)) {
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
                                if (!p081p0.c.q0(b8) || ((b6 == -32 && b8 < -96) || ((b6 == -19 && b8 >= -96) || p081p0.c.q0(b14)))) {
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
                            if (p081p0.c.q0(b8)) {
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
                        if (!p081p0.c.q0(b9)) {
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
                Charset charset = AbstractC0652u.f8224a;
                String str = new String(bArr, i, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i3 + i))) {
                    throw InvalidProtocolBufferException.a();
                }
                return str;
        }
    }
}
