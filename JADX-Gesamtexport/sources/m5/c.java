package m5;

import java.io.UnsupportedEncodingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f10435a = LoggerFactory.getLogger((Class<?>) c.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f10436b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10437c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10438d = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    public static void a(byte[] bArr, int i, int i3, byte[] bArr2, int i6, int i7) {
        byte[] bArr3;
        if ((i7 & 16) == 16) {
            bArr3 = f10437c;
        } else {
            bArr3 = (i7 & 32) == 32 ? f10438d : f10436b;
        }
        int i8 = (i3 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i3 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i3 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i3 == 1) {
            bArr2[i6] = bArr3[i8 >>> 18];
            bArr2[i6 + 1] = bArr3[(i8 >>> 12) & 63];
            if ((i7 & 64) == 0) {
                bArr2[i6 + 2] = 61;
                bArr2[i6 + 3] = 61;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return;
            }
            bArr2[i6] = bArr3[i8 >>> 18];
            bArr2[i6 + 1] = bArr3[(i8 >>> 12) & 63];
            bArr2[i6 + 2] = bArr3[(i8 >>> 6) & 63];
            bArr2[i6 + 3] = bArr3[i8 & 63];
            return;
        }
        bArr2[i6] = bArr3[i8 >>> 18];
        bArr2[i6 + 1] = bArr3[(i8 >>> 12) & 63];
        bArr2[i6 + 2] = bArr3[(i8 >>> 6) & 63];
        if ((i7 & 64) == 0) {
            bArr2[i6 + 3] = 61;
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException(p012c.k.r(length, "Cannot have length offset: "));
        }
        if (length > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(length), Integer.valueOf(bArr.length)));
        }
        int i = length % 3;
        int i3 = ((length / 3) * 4) + (i > 0 ? i + 1 : 0);
        byte[] bArr2 = new byte[i3];
        int i6 = length - 2;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            byte[] bArr3 = bArr;
            a(bArr3, i7, 3, bArr2, i8, 81);
            i7 += 3;
            i8 += 4;
            bArr = bArr3;
        }
        byte[] bArr4 = bArr;
        if (i7 < length) {
            a(bArr4, i7, length - i7, bArr2, i8, 81);
            i8 += 4;
        }
        if (i8 <= i3 - 1) {
            byte[] bArr5 = new byte[i8];
            System.arraycopy(bArr2, 0, bArr5, 0, i8);
            bArr2 = bArr5;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }
}
