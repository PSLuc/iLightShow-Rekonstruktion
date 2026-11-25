package j5;

import F.C0068j;
import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.io.IOException;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f9729a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 12, 16, 12, 12, 20, 12, 16, 24, 28, 12, 12, 32, 12, 36, 12, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 32, 32, 24, 40, 28, 12, 12, 48, 52, 52, 52, 48, 52, 52, 52, 48, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 48, 52, 52, 52, 52, 52, 24, 12, 28, 12, 12, 12, 56, 60, 60, 60, 56, 60, 60, 60, 56, 60, 60, 60, 60, 60, 56, 60, 60, 60, 60, 60, 56, 60, 60, 60, 60, 60, 24, 12, 28, 12, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 
    40, 40, 40, 40, 40, 40, 40, 40, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 56, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 18, 18, 18, 18, 19, 19, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 23, 23, 23, 23, 24, 24, 24, 24, 25, 25, 25, 25, 26, 26, 26, 26, 27, 27, 27, 27, 28, 28, 28, 28, 29, 29, 29, 29, 30, 30, 30, 30, 31, 31, 31, 31, 32, 32, 32, 32, 33, 33, 33, 33, 34, 34, 34, 34, 35, 35, 35, 35, 36, 36, 36, 36, 37, 37, 37, 37, 38, 38, 38, 38, 39, 39, 39, 39, 40, 40, 40, 40, 41, 41, 41, 41, 42, 42, 42, 42, 43, 43, 43, 43, 44, 44, 44, 44, 45, 45, 45, 45, 46, 46, 46, 46, 47, 47, 47, 47, 48, 48, 48, 48, 49, 49, 49, 49, 50, 50, 50, 50, 51, 51, 51, 51, 52, 52, 52, 52, 53, 53, 53, 53, 54, 54, 54, 54, 55, 55, 55, 55, 56, 56, 56, 56, 57, 57, 57, 57, 58, 58, 58, 58, 59, 59, 59, 59, 60, 60, 60, 60, 61, 61, 61, 61, 62, 62, 62, 62, 63, 63, 63, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f9730b = {1024, 1536, 1280, 1536, 0, HueLog.LogComponent.STREAMDTLS, 768, HueLog.LogComponent.APPCORE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f9731c = {1, 2, 3, 4, 0, 5, 17, 6, 16, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f9732d = {3, 2, 1, 0, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f9733e = {0, 0, 0, 0, -1, 1, -2, 2, -3, 3, -1, 1, -2, 2, -3, 3};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f9734f = {131072, 131076, 131075, 196610, 131072, 131076, 131075, 262145, 131072, 131076, 131075, 196610, 131072, 131076, 131075, 262149};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f9735g = {0, 0, 0, 0, 0, 4096, 9216, 21504, 35840, 44032, 53248, 63488, 74752, 87040, 93696, 100864, 104704, 106752, 108928, 113536, 115968, 118528, 119872, 121280, 122016};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f9736h = {0, 0, 0, 0, 10, 10, 11, 11, 10, 10, 10, 10, 10, 9, 9, 8, 7, 7, 8, 7, 7, 6, 6, 5, 5};
    public static final int[] i = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f9737j = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f9738k = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f9739l = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f9740m = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, 134, 198, 326, 582, 1094, 2118};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f9741n = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f9742o = {0, 0, 8, 8, 0, 16, 8, 16, 16};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f9743p = {0, 8, 0, 8, 16, 0, 16, 8, 16};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f9744q = new byte[1024];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f9745r = new int[1024];

    public static void a(int i3, int i6, int i7, int[] iArr, int[] iArr2) {
        int i8;
        int i9;
        int i10;
        int[] iArr3 = new int[i7];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i11 = 0;
        for (int i12 = 0; i12 < i7; i12++) {
            int i13 = iArr2[i12];
            iArr4[i13] = iArr4[i13] + 1;
        }
        iArr5[1] = 0;
        int i14 = 1;
        while (i14 < 15) {
            int i15 = i14 + 1;
            iArr5[i15] = iArr5[i14] + iArr4[i14];
            i14 = i15;
        }
        for (int i16 = 0; i16 < i7; i16++) {
            int i17 = iArr2[i16];
            if (i17 != 0) {
                int i18 = iArr5[i17];
                iArr5[i17] = i18 + 1;
                iArr3[i18] = i16;
            }
        }
        int i19 = 1 << i6;
        if (iArr5[15] == 1) {
            for (int i20 = 0; i20 < i19; i20++) {
                iArr[i3 + i20] = iArr3[0];
            }
            return;
        }
        int i21 = 2;
        int i22 = 2;
        int i23 = 0;
        int i24 = 1;
        while (i24 <= i6) {
            while (iArr4[i24] > 0) {
                int i25 = i3 + i11;
                int i26 = i23 + 1;
                int i27 = (i24 << 16) | iArr3[i23];
                int i28 = i19;
                do {
                    i28 -= i22;
                    iArr[i25 + i28] = i27;
                } while (i28 > 0);
                int i29 = 1 << (i24 - 1);
                while ((i11 & i29) != 0) {
                    i29 >>= 1;
                }
                i11 = (i11 & (i29 - 1)) + i29;
                iArr4[i24] = iArr4[i24] - 1;
                i23 = i26;
            }
            i24++;
            i22 <<= 1;
        }
        int i30 = i19 - 1;
        int i31 = i6 + 1;
        int i32 = -1;
        int i33 = i3;
        while (i31 <= 15) {
            while (iArr4[i31] > 0) {
                int i34 = i11 & i30;
                if (i34 != i32) {
                    int i35 = i33 + i19;
                    int i36 = 1 << (i31 - i6);
                    int i37 = i31;
                    while (i37 < 15) {
                        int i38 = i36 - iArr4[i37];
                        if (i38 <= 0) {
                            break;
                        }
                        i37++;
                        i36 = i38 << 1;
                    }
                    int i39 = i37 - i6;
                    iArr[i3 + i34] = ((i39 + i6) << 16) | ((i35 - i3) - i34);
                    i8 = i34;
                    i10 = i35;
                    i9 = 1 << i39;
                } else {
                    i8 = i32;
                    i9 = i19;
                    i10 = i33;
                }
                int i40 = i10 + (i11 >> i6);
                int i41 = i23 + 1;
                int i42 = ((i31 - i6) << 16) | iArr3[i23];
                int i43 = i9;
                do {
                    i43 -= i21;
                    iArr[i40 + i43] = i42;
                } while (i43 > 0);
                int i44 = 1 << (i31 - 1);
                while ((i11 & i44) != 0) {
                    i44 >>= 1;
                }
                i11 = (i11 & (i44 - 1)) + i44;
                iArr4[i31] = iArr4[i31] - 1;
                i19 = i9;
                i33 = i10;
                i32 = i8;
                i23 = i41;
            }
            i31++;
            i21 <<= 1;
        }
    }

    public static void b(f fVar, int i3) {
        int i6;
        a aVar = fVar.f9770c;
        int i7 = i3 * 2;
        a.b(aVar);
        int i8 = i3 * 1080;
        int iG = g(fVar.f9772e, i8, aVar);
        a.b(aVar);
        int iG2 = g(fVar.f9773f, i8, aVar);
        fVar.f9780n[i3] = a.d(aVar, f9737j[iG2]) + i[iG2];
        int[] iArr = fVar.f9782p;
        if (iG == 1) {
            i6 = iArr[i7 + 1] + 1;
        } else {
            i6 = iG == 0 ? iArr[i7] : iG - 2;
        }
        int i9 = fVar.f9781o[i3];
        if (i6 >= i9) {
            i6 -= i9;
        }
        int i10 = i7 + 1;
        iArr[i7] = iArr[i10];
        iArr[i10] = i6;
    }

    public static int c(int i3, byte[] bArr, a aVar) {
        int iD;
        a.e(aVar);
        if (a.d(aVar, 1) != 0) {
            int iD2 = a.d(aVar, 3);
            iD = iD2 == 0 ? 1 : a.d(aVar, iD2) + (1 << iD2);
        } else {
            iD = 0;
        }
        int i6 = iD + 1;
        if (i6 == 1) {
            int i7 = 0;
            while (i7 < i3) {
                int iMin = Math.min(i7 + 1024, i3) - i7;
                System.arraycopy(f9744q, 0, bArr, i7, iMin);
                i7 += iMin;
            }
        } else {
            int iD3 = a.d(aVar, 1) == 1 ? a.d(aVar, 4) + 1 : 0;
            int[] iArr = new int[1080];
            f(i6 + iD3, iArr, 0, aVar);
            int i8 = 0;
            while (i8 < i3) {
                a.e(aVar);
                a.b(aVar);
                int iG = g(iArr, 0, aVar);
                if (iG == 0) {
                    bArr[i8] = 0;
                } else if (iG <= iD3) {
                    for (int iD4 = a.d(aVar, iG) + (1 << iG); iD4 != 0; iD4--) {
                        if (i8 >= i3) {
                            throw new c("Corrupted context map");
                        }
                        bArr[i8] = 0;
                        i8++;
                    }
                } else {
                    bArr[i8] = (byte) (iG - iD3);
                }
                i8++;
            }
            if (a.d(aVar, 1) == 1) {
                int[] iArr2 = new int[HueLog.LogComponent.STREAMDTLS];
                for (int i9 = 0; i9 < 256; i9++) {
                    iArr2[i9] = i9;
                }
                for (int i10 = 0; i10 < i3; i10++) {
                    int i11 = bArr[i10] & 255;
                    int i12 = iArr2[i11];
                    bArr[i10] = (byte) i12;
                    if (i11 != 0) {
                        while (i11 > 0) {
                            iArr2[i11] = iArr2[i11 - 1];
                            i11--;
                        }
                        iArr2[0] = i12;
                    }
                }
            }
        }
        return i6;
    }

    public static void d(f fVar) {
        b(fVar, 0);
        int i3 = fVar.f9782p[1];
        int i6 = i3 << 6;
        fVar.f9747A = i6;
        fVar.f9788v = ((int[]) fVar.f9777k.f1184d)[fVar.f9792z[i6] & 255];
        byte b6 = fVar.f9791y[i3];
        int[] iArr = f9730b;
        fVar.f9749C = iArr[b6];
        fVar.f9750D = iArr[b6 + 1];
    }

    /* JADX WARN: Code duplicated, block: B:154:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0402  */
    /* JADX WARN: Code duplicated, block: B:164:0x0440 A[LOOP:7: B:164:0x0440->B:173:0x0489, LOOP_START, PHI: r5
  0x0440: PHI (r5v85 char) = (r5v64 char), (r5v88 char) binds: [B:163:0x043e, B:173:0x0489] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x0446  */
    /* JADX WARN: Code duplicated, block: B:168:0x044d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0489 A[LOOP:7: B:164:0x0440->B:173:0x0489, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x048b  */
    /* JADX WARN: Code duplicated, block: B:177:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:179:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:183:0x0502 A[LOOP:8: B:175:0x049d->B:183:0x0502, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x050e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0517  */
    /* JADX WARN: Code duplicated, block: B:190:0x051c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0520  */
    /* JADX WARN: Code duplicated, block: B:194:0x0528  */
    /* JADX WARN: Code duplicated, block: B:197:0x054f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0551  */
    /* JADX WARN: Code duplicated, block: B:201:0x0564  */
    /* JADX WARN: Code duplicated, block: B:204:0x0595  */
    /* JADX WARN: Code duplicated, block: B:205:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:208:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:210:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:213:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:217:0x05c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:221:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:224:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:233:0x061b  */
    /* JADX WARN: Code duplicated, block: B:238:0x064a  */
    /* JADX WARN: Code duplicated, block: B:256:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:397:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x064f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x07c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x0638 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:? A[LOOP:6: B:231:0x0615->B:431:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x04f3 A[SYNTHETIC] */
    public static void e(f fVar) {
        char c6;
        int i3;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int iD;
        int i9;
        char c7;
        char c8;
        int i10;
        int i11;
        int iG;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iG2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30 = fVar.f9768a;
        if (i30 == 0) {
            throw new IllegalStateException("Can't decompress until initialized");
        }
        char c9 = 11;
        if (i30 == 11) {
            throw new IllegalStateException("Can't decompress after close");
        }
        int i31 = 1;
        int i32 = fVar.f9758P - 1;
        byte[] bArr = fVar.f9771d;
        while (true) {
            int i33 = fVar.f9768a;
            a aVar = fVar.f9770c;
            if (i33 == 10) {
                if (i33 == 10) {
                    if (fVar.f9774g < 0) {
                        throw new c("Invalid metablock length");
                    }
                    int i34 = (64 - aVar.f9724g) & 7;
                    if (i34 != 0 && a.d(aVar, i34) != 0) {
                        throw new c("Corrupted padding bits");
                    }
                    a.a(aVar, true);
                    return;
                }
                return;
            }
            if (i33 != 12) {
                int i35 = 4;
                int i36 = i31;
                int[] iArr3 = fVar.f9782p;
                C0068j c0068j = fVar.f9779m;
                C0068j c0068j2 = fVar.f9778l;
                C0068j c0068j3 = fVar.f9777k;
                int[] iArr4 = fVar.f9780n;
                switch (i33) {
                    case 1:
                        c6 = 11;
                        if (fVar.f9774g < 0) {
                            throw new c("Invalid metablock length");
                        }
                        if (fVar.f9775h) {
                            fVar.f9769b = 10;
                            fVar.f9766X = fVar.f9784r;
                            fVar.f9765W = 0;
                            fVar.f9768a = 12;
                        } else {
                            c0068j3.f1183c = null;
                            c0068j3.f1184d = null;
                            c0068j2.f1183c = null;
                            c0068j2.f1184d = null;
                            c0068j.f1183c = null;
                            c0068j.f1184d = null;
                            a.e(aVar);
                            boolean z5 = a.d(aVar, 1) == 1;
                            fVar.f9775h = z5;
                            fVar.f9774g = 0;
                            fVar.i = false;
                            fVar.f9776j = false;
                            if (!z5 || a.d(aVar, 1) == 0) {
                                int iD2 = a.d(aVar, 2) + 4;
                                if (iD2 == 7) {
                                    fVar.f9776j = true;
                                    if (a.d(aVar, 1) != 0) {
                                        throw new c("Corrupted reserved bit");
                                    }
                                    int iD3 = a.d(aVar, 2);
                                    if (iD3 == 0) {
                                        i3 = 4;
                                    } else {
                                        for (int i37 = 0; i37 < iD3; i37++) {
                                            int iD4 = a.d(aVar, 8);
                                            if (iD4 == 0 && i37 + 1 == iD3 && iD3 > 1) {
                                                throw new c("Exuberant nibble");
                                            }
                                            fVar.f9774g = (iD4 << (i37 * 8)) | fVar.f9774g;
                                        }
                                    }
                                } else {
                                    for (int i38 = 0; i38 < iD2; i38++) {
                                        int iD5 = a.d(aVar, 4);
                                        if (iD5 == 0 && i38 + 1 == iD2 && iD2 > 4) {
                                            throw new c("Exuberant nibble");
                                        }
                                        fVar.f9774g = (iD5 << (i38 * 4)) | fVar.f9774g;
                                    }
                                }
                                i3 = 4;
                                fVar.f9774g++;
                                if (!fVar.f9775h) {
                                    fVar.i = a.d(aVar, 1) == 1;
                                }
                            } else {
                                i3 = 4;
                            }
                            if (fVar.f9774g != 0 || fVar.f9776j) {
                                if (fVar.i || fVar.f9776j) {
                                    int i39 = (64 - aVar.f9724g) & 7;
                                    if (i39 != 0 && a.d(aVar, i39) != 0) {
                                        throw new c("Corrupted padding bits");
                                    }
                                    fVar.f9768a = fVar.f9776j ? i3 : 5;
                                } else {
                                    fVar.f9768a = 2;
                                }
                                if (!fVar.f9776j) {
                                    long j4 = fVar.f9759Q + ((long) fVar.f9774g);
                                    fVar.f9759Q = j4;
                                    int i40 = fVar.f9758P;
                                    int i41 = fVar.f9757O;
                                    if (i40 < i41) {
                                        if (i41 > j4) {
                                            while (true) {
                                                int i42 = i41 >> 1;
                                                if (i42 > ((int) j4) + fVar.f9760R.length) {
                                                    i41 = i42;
                                                } else if (!fVar.f9775h && i41 < 16384 && fVar.f9757O >= 16384) {
                                                    i41 = 16384;
                                                }
                                            }
                                        }
                                        int i43 = fVar.f9758P;
                                        if (i41 > i43) {
                                            byte[] bArr2 = new byte[i41 + 37];
                                            byte[] bArr3 = fVar.f9771d;
                                            if (bArr3 != null) {
                                                System.arraycopy(bArr3, 0, bArr2, 0, i43);
                                            } else {
                                                byte[] bArr4 = fVar.f9760R;
                                                if (bArr4.length != 0) {
                                                    int length = bArr4.length;
                                                    int i44 = fVar.f9756N;
                                                    if (length > i44) {
                                                        int i45 = length - i44;
                                                        length = i44;
                                                        i6 = i45;
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    System.arraycopy(bArr4, i6, bArr2, 0, length);
                                                    fVar.f9784r = length;
                                                    fVar.f9761S = length;
                                                }
                                            }
                                            fVar.f9771d = bArr2;
                                            fVar.f9758P = i41;
                                        }
                                    }
                                }
                            }
                        }
                        i32 = fVar.f9758P - 1;
                        bArr = fVar.f9771d;
                        break;
                        break;
                    case 2:
                        int i46 = i36;
                        c6 = 11;
                        int i47 = 0;
                        while (true) {
                            int[] iArr5 = fVar.f9781o;
                            if (i47 >= 3) {
                                a.e(aVar);
                                fVar.J = a.d(aVar, 2);
                                int iD6 = a.d(aVar, 4);
                                int i48 = fVar.J;
                                int i49 = (iD6 << i48) + 16;
                                fVar.H = i49;
                                fVar.I = (1 << i48) - 1;
                                int i50 = i49 + (48 << i48);
                                char c10 = 0;
                                fVar.f9791y = new byte[iArr5[0]];
                                int i51 = 0;
                                while (true) {
                                    int i52 = iArr5[c10];
                                    if (i51 >= i52) {
                                        i7 = i35;
                                        int i53 = i52 << 6;
                                        byte[] bArr5 = new byte[i53];
                                        fVar.f9792z = bArr5;
                                        int iC = c(i53, bArr5, aVar);
                                        fVar.f9787u = true;
                                        int i54 = 0;
                                        while (true) {
                                            if (i54 < (iArr5[0] << 6)) {
                                                iArr = iArr4;
                                                if (fVar.f9792z[i54] != (i54 >> 6)) {
                                                    fVar.f9787u = false;
                                                } else {
                                                    i54++;
                                                    iArr4 = iArr;
                                                }
                                            } else {
                                                iArr = iArr4;
                                            }
                                        }
                                        int i55 = iArr5[2] << 2;
                                        byte[] bArr6 = new byte[i55];
                                        fVar.G = bArr6;
                                        int iC2 = c(i55, bArr6, aVar);
                                        c0068j3.f1182b = HueLog.LogComponent.STREAMDTLS;
                                        c0068j3.f1183c = new int[iC * 1080];
                                        c0068j3.f1184d = new int[iC];
                                        int i56 = iArr5[1];
                                        c0068j2.f1182b = 704;
                                        c0068j2.f1183c = new int[i56 * 1080];
                                        c0068j2.f1184d = new int[i56];
                                        c0068j.f1182b = i50;
                                        c0068j.f1183c = new int[iC2 * 1080];
                                        c0068j.f1184d = new int[iC2];
                                        C0068j.d(c0068j3, aVar);
                                        C0068j.d(c0068j2, aVar);
                                        C0068j.d(c0068j, aVar);
                                        fVar.f9747A = 0;
                                        fVar.f9748B = 0;
                                        int[] iArr6 = f9730b;
                                        byte b6 = fVar.f9791y[0];
                                        fVar.f9749C = iArr6[b6];
                                        i8 = 1;
                                        fVar.f9750D = iArr6[b6 + 1];
                                        fVar.f9788v = ((int[]) c0068j3.f1184d)[0];
                                        fVar.f9751E = ((int[]) c0068j2.f1184d)[0];
                                        iArr3[i7] = 1;
                                        iArr3[2] = 1;
                                        iArr3[0] = 1;
                                        iArr3[5] = 0;
                                        iArr3[3] = 0;
                                        iArr3[1] = 0;
                                        fVar.f9768a = 3;
                                        if (fVar.f9774g <= 0) {
                                            a.e(aVar);
                                            if (iArr[i8] == 0) {
                                                b(fVar, i8);
                                                fVar.f9751E = ((int[]) c0068j2.f1184d)[iArr3[3]];
                                            }
                                            iArr[i8] = iArr[i8] - i8;
                                            a.b(aVar);
                                            int iG3 = g((int[]) c0068j2.f1183c, fVar.f9751E, aVar);
                                            i9 = iG3 >>> 6;
                                            fVar.f9752F = 0;
                                            if (i9 >= 2) {
                                                i9 -= 2;
                                                fVar.f9752F = -1;
                                            }
                                            int i57 = f9742o[i9] + ((iG3 >>> 3) & 7);
                                            int i58 = f9743p[i9] + (iG3 & 7);
                                            fVar.f9790x = a.d(aVar, f9739l[i57]) + f9738k[i57];
                                            fVar.f9754L = a.d(aVar, f9741n[i58]) + f9740m[i58];
                                            c7 = 0;
                                            fVar.f9789w = 0;
                                            fVar.f9768a = 6;
                                            if (!fVar.f9787u) {
                                                int i59 = fVar.f9784r;
                                                i10 = bArr[(i59 - 1) & i32] & 255;
                                                i11 = bArr[(i59 - 2) & i32] & 255;
                                                while (true) {
                                                    if (fVar.f9789w < fVar.f9790x) {
                                                        a.e(aVar);
                                                        if (iArr[0] == 0) {
                                                            d(fVar);
                                                        }
                                                        byte[] bArr7 = fVar.f9792z;
                                                        int i60 = fVar.f9747A;
                                                        int[] iArr7 = f9729a;
                                                        int i61 = bArr7[i60 + (iArr7[fVar.f9750D + i11] | iArr7[fVar.f9749C + i10])] & 255;
                                                        iArr[0] = iArr[0] - 1;
                                                        a.b(aVar);
                                                        iG = g((int[]) c0068j3.f1183c, ((int[]) c0068j3.f1184d)[i61], aVar);
                                                        i12 = fVar.f9784r;
                                                        bArr[i12] = (byte) iG;
                                                        fVar.f9789w++;
                                                        fVar.f9784r = i12 + 1;
                                                        if (i12 == i32) {
                                                            i13 = 6;
                                                            fVar.f9769b = 6;
                                                            fVar.f9766X = fVar.f9758P;
                                                            fVar.f9765W = 0;
                                                            fVar.f9768a = 12;
                                                        } else {
                                                            int i62 = i10;
                                                            i10 = iG;
                                                            i11 = i62;
                                                        }
                                                    }
                                                }
                                                if (fVar.f9768a != i13) {
                                                    i14 = fVar.f9774g - fVar.f9790x;
                                                    fVar.f9774g = i14;
                                                    if (i14 <= 0) {
                                                        if (fVar.f9752F < 0) {
                                                            a.e(aVar);
                                                            if (iArr[2] == 0) {
                                                                b(fVar, 2);
                                                                fVar.f9748B = iArr3[5] << 2;
                                                            }
                                                            iArr[2] = iArr[2] - 1;
                                                            a.b(aVar);
                                                            int[] iArr8 = (int[]) c0068j.f1183c;
                                                            int[] iArr9 = (int[]) c0068j.f1184d;
                                                            byte[] bArr8 = fVar.G;
                                                            int i63 = fVar.f9748B;
                                                            i21 = fVar.f9754L;
                                                            if (i21 > i7) {
                                                                i22 = 3;
                                                            } else {
                                                                i22 = i21 - 2;
                                                            }
                                                            iG2 = g(iArr8, iArr9[bArr8[i63 + i22] & 255], aVar);
                                                            fVar.f9752F = iG2;
                                                            i23 = fVar.H;
                                                            if (iG2 >= i23) {
                                                                int i64 = iG2 - i23;
                                                                int i65 = fVar.I & i64;
                                                                int i66 = i64 >>> fVar.J;
                                                                fVar.f9752F = i66;
                                                                int i67 = (i66 >>> 1) + 1;
                                                                fVar.f9752F = i23 + i65 + ((a.d(aVar, i67) + ((((i66 & 1) + 2) << i67) - 4)) << fVar.J);
                                                            }
                                                        }
                                                        i15 = fVar.f9752F;
                                                        i16 = fVar.f9786t;
                                                        iArr2 = fVar.f9783q;
                                                        if (i15 < 16) {
                                                            i17 = iArr2[(f9732d[i15] + i16) & 3] + f9733e[i15];
                                                        } else {
                                                            i17 = i15 - 15;
                                                        }
                                                        fVar.f9753K = i17;
                                                        if (i17 >= 0) {
                                                            throw new c("Negative distance");
                                                        }
                                                        i18 = fVar.f9785s;
                                                        i19 = fVar.f9756N;
                                                        if (i18 != i19 || (i20 = fVar.f9784r) >= i19) {
                                                            fVar.f9785s = i19;
                                                        } else {
                                                            fVar.f9785s = i20;
                                                        }
                                                        fVar.f9755M = fVar.f9784r;
                                                        if (i17 > fVar.f9785s) {
                                                            if (i15 > 0) {
                                                                iArr2[i16 & 3] = i17;
                                                                fVar.f9786t = i16 + 1;
                                                            }
                                                            if (fVar.f9754L <= fVar.f9774g) {
                                                                throw new c("Invalid backward reference");
                                                            }
                                                            fVar.f9789w = 0;
                                                            fVar.f9768a = 7;
                                                            int i68 = fVar.f9784r;
                                                            i25 = (i68 - fVar.f9753K) & i32;
                                                            i26 = fVar.f9754L - fVar.f9789w;
                                                            if (i25 + i26 < i32 || i68 + i26 >= i32) {
                                                                while (true) {
                                                                    i27 = fVar.f9789w;
                                                                    if (i27 < fVar.f9754L) {
                                                                        i28 = fVar.f9784r;
                                                                        bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                                        fVar.f9774g--;
                                                                        fVar.f9789w = i27 + 1;
                                                                        fVar.f9784r = i28 + 1;
                                                                        if (i28 == i32) {
                                                                            i29 = 7;
                                                                            fVar.f9769b = 7;
                                                                            fVar.f9766X = fVar.f9758P;
                                                                            fVar.f9765W = 0;
                                                                            fVar.f9768a = 12;
                                                                        }
                                                                    }
                                                                }
                                                                if (fVar.f9768a == i29) {
                                                                    fVar.f9768a = 3;
                                                                }
                                                            } else {
                                                                int i69 = 0;
                                                                while (i69 < i26) {
                                                                    bArr[i68] = bArr[i25];
                                                                    i69++;
                                                                    i68++;
                                                                    i25++;
                                                                }
                                                                fVar.f9789w += i26;
                                                                fVar.f9774g -= i26;
                                                                fVar.f9784r += i26;
                                                            }
                                                            i29 = 7;
                                                            if (fVar.f9768a == i29) {
                                                                fVar.f9768a = 3;
                                                            }
                                                        } else {
                                                            fVar.f9768a = 9;
                                                        }
                                                    } else {
                                                        fVar.f9768a = 3;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                                break;
                                            } else {
                                                while (fVar.f9789w < fVar.f9790x) {
                                                    a.e(aVar);
                                                    if (iArr[c7] == 0) {
                                                        d(fVar);
                                                    }
                                                    iArr[c7] = iArr[c7] - 1;
                                                    a.b(aVar);
                                                    bArr[fVar.f9784r] = (byte) g((int[]) c0068j3.f1183c, fVar.f9788v, aVar);
                                                    fVar.f9789w++;
                                                    i24 = fVar.f9784r;
                                                    fVar.f9784r = i24 + 1;
                                                    if (i24 == i32) {
                                                        fVar.f9769b = 6;
                                                        fVar.f9766X = fVar.f9758P;
                                                        fVar.f9765W = 0;
                                                        fVar.f9768a = 12;
                                                    } else {
                                                        c7 = 0;
                                                    }
                                                }
                                            }
                                            i13 = 6;
                                            if (fVar.f9768a != i13) {
                                                i14 = fVar.f9774g - fVar.f9790x;
                                                fVar.f9774g = i14;
                                                if (i14 <= 0) {
                                                    if (fVar.f9752F < 0) {
                                                        a.e(aVar);
                                                        if (iArr[2] == 0) {
                                                            b(fVar, 2);
                                                            fVar.f9748B = iArr3[5] << 2;
                                                        }
                                                        iArr[2] = iArr[2] - 1;
                                                        a.b(aVar);
                                                        int[] iArr10 = (int[]) c0068j.f1183c;
                                                        int[] iArr11 = (int[]) c0068j.f1184d;
                                                        byte[] bArr9 = fVar.G;
                                                        int i610 = fVar.f9748B;
                                                        i21 = fVar.f9754L;
                                                        if (i21 > i7) {
                                                            i22 = 3;
                                                        } else {
                                                            i22 = i21 - 2;
                                                        }
                                                        iG2 = g(iArr10, iArr11[bArr9[i610 + i22] & 255], aVar);
                                                        fVar.f9752F = iG2;
                                                        i23 = fVar.H;
                                                        if (iG2 >= i23) {
                                                            int i611 = iG2 - i23;
                                                            int i612 = fVar.I & i611;
                                                            int i613 = i611 >>> fVar.J;
                                                            fVar.f9752F = i613;
                                                            int i614 = (i613 >>> 1) + 1;
                                                            fVar.f9752F = i23 + i612 + ((a.d(aVar, i614) + ((((i613 & 1) + 2) << i614) - 4)) << fVar.J);
                                                        }
                                                    }
                                                    i15 = fVar.f9752F;
                                                    i16 = fVar.f9786t;
                                                    iArr2 = fVar.f9783q;
                                                    if (i15 < 16) {
                                                        i17 = iArr2[(f9732d[i15] + i16) & 3] + f9733e[i15];
                                                    } else {
                                                        i17 = i15 - 15;
                                                    }
                                                    fVar.f9753K = i17;
                                                    if (i17 >= 0) {
                                                        throw new c("Negative distance");
                                                    }
                                                    i18 = fVar.f9785s;
                                                    i19 = fVar.f9756N;
                                                    if (i18 != i19) {
                                                        fVar.f9785s = i19;
                                                    } else {
                                                        fVar.f9785s = i19;
                                                    }
                                                    fVar.f9755M = fVar.f9784r;
                                                    if (i17 > fVar.f9785s) {
                                                        if (i15 > 0) {
                                                            iArr2[i16 & 3] = i17;
                                                            fVar.f9786t = i16 + 1;
                                                        }
                                                        if (fVar.f9754L <= fVar.f9774g) {
                                                            throw new c("Invalid backward reference");
                                                        }
                                                        fVar.f9789w = 0;
                                                        fVar.f9768a = 7;
                                                        int i615 = fVar.f9784r;
                                                        i25 = (i615 - fVar.f9753K) & i32;
                                                        i26 = fVar.f9754L - fVar.f9789w;
                                                        if (i25 + i26 < i32) {
                                                            while (true) {
                                                                i27 = fVar.f9789w;
                                                                if (i27 < fVar.f9754L) {
                                                                    i28 = fVar.f9784r;
                                                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                                    fVar.f9774g--;
                                                                    fVar.f9789w = i27 + 1;
                                                                    fVar.f9784r = i28 + 1;
                                                                    if (i28 == i32) {
                                                                        i29 = 7;
                                                                        fVar.f9769b = 7;
                                                                        fVar.f9766X = fVar.f9758P;
                                                                        fVar.f9765W = 0;
                                                                        fVar.f9768a = 12;
                                                                    }
                                                                } else {
                                                                    i29 = 7;
                                                                }
                                                            }
                                                        } else {
                                                            while (true) {
                                                                i27 = fVar.f9789w;
                                                                if (i27 < fVar.f9754L) {
                                                                    i28 = fVar.f9784r;
                                                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                                    fVar.f9774g--;
                                                                    fVar.f9789w = i27 + 1;
                                                                    fVar.f9784r = i28 + 1;
                                                                    if (i28 == i32) {
                                                                        i29 = 7;
                                                                        fVar.f9769b = 7;
                                                                        fVar.f9766X = fVar.f9758P;
                                                                        fVar.f9765W = 0;
                                                                        fVar.f9768a = 12;
                                                                    }
                                                                } else {
                                                                    i29 = 7;
                                                                }
                                                            }
                                                        }
                                                        if (fVar.f9768a == i29) {
                                                            fVar.f9768a = 3;
                                                        }
                                                    } else {
                                                        fVar.f9768a = 9;
                                                    }
                                                } else {
                                                    fVar.f9768a = 3;
                                                }
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            fVar.f9768a = i8;
                                        }
                                    } else {
                                        int iMin = Math.min(i51 + 96, i52);
                                        while (i51 < iMin) {
                                            fVar.f9791y[i51] = (byte) (a.d(aVar, 2) << 1);
                                            i51++;
                                            i35 = i35;
                                        }
                                        a.e(aVar);
                                        c10 = 0;
                                    }
                                }
                            } else {
                                if (a.d(aVar, i46) != 0) {
                                    int iD7 = a.d(aVar, 3);
                                    iD = iD7 == 0 ? i46 : a.d(aVar, iD7) + (i46 << iD7);
                                } else {
                                    iD = 0;
                                }
                                iArr5[i47] = iD + 1;
                                iArr4[i47] = 268435456;
                                int i70 = iArr5[i47];
                                if (i70 > i46) {
                                    int i71 = i47 * 1080;
                                    f(i70 + 2, fVar.f9772e, i71, aVar);
                                    int[] iArr12 = fVar.f9773f;
                                    f(26, iArr12, i71, aVar);
                                    a.b(aVar);
                                    int iG4 = g(iArr12, i71, aVar);
                                    iArr4[i47] = a.d(aVar, f9737j[iG4]) + i[iG4];
                                }
                                i47++;
                                i46 = 1;
                            }
                            break;
                        }
                        break;
                    case 3:
                        c6 = 11;
                        iArr = iArr4;
                        i7 = 4;
                        i8 = i36;
                        if (fVar.f9774g <= 0) {
                            a.e(aVar);
                            if (iArr[i8] == 0) {
                                b(fVar, i8);
                                fVar.f9751E = ((int[]) c0068j2.f1184d)[iArr3[3]];
                            }
                            iArr[i8] = iArr[i8] - i8;
                            a.b(aVar);
                            int iG5 = g((int[]) c0068j2.f1183c, fVar.f9751E, aVar);
                            i9 = iG5 >>> 6;
                            fVar.f9752F = 0;
                            if (i9 >= 2) {
                                i9 -= 2;
                                fVar.f9752F = -1;
                            }
                            int i510 = f9742o[i9] + ((iG5 >>> 3) & 7);
                            int i511 = f9743p[i9] + (iG5 & 7);
                            fVar.f9790x = a.d(aVar, f9739l[i510]) + f9738k[i510];
                            fVar.f9754L = a.d(aVar, f9741n[i511]) + f9740m[i511];
                            c7 = 0;
                            fVar.f9789w = 0;
                            fVar.f9768a = 6;
                            if (!fVar.f9787u) {
                                int i512 = fVar.f9784r;
                                i10 = bArr[(i512 - 1) & i32] & 255;
                                i11 = bArr[(i512 - 2) & i32] & 255;
                                while (true) {
                                    if (fVar.f9789w < fVar.f9790x) {
                                        a.e(aVar);
                                        if (iArr[0] == 0) {
                                            d(fVar);
                                        }
                                        byte[] bArr10 = fVar.f9792z;
                                        int i616 = fVar.f9747A;
                                        int[] iArr13 = f9729a;
                                        int i617 = bArr10[i616 + (iArr13[fVar.f9750D + i11] | iArr13[fVar.f9749C + i10])] & 255;
                                        iArr[0] = iArr[0] - 1;
                                        a.b(aVar);
                                        iG = g((int[]) c0068j3.f1183c, ((int[]) c0068j3.f1184d)[i617], aVar);
                                        i12 = fVar.f9784r;
                                        bArr[i12] = (byte) iG;
                                        fVar.f9789w++;
                                        fVar.f9784r = i12 + 1;
                                        if (i12 == i32) {
                                            i13 = 6;
                                            fVar.f9769b = 6;
                                            fVar.f9766X = fVar.f9758P;
                                            fVar.f9765W = 0;
                                            fVar.f9768a = 12;
                                        } else {
                                            int i618 = i10;
                                            i10 = iG;
                                            i11 = i618;
                                        }
                                    }
                                }
                                if (fVar.f9768a != i13) {
                                    i14 = fVar.f9774g - fVar.f9790x;
                                    fVar.f9774g = i14;
                                    if (i14 <= 0) {
                                        if (fVar.f9752F < 0) {
                                            a.e(aVar);
                                            if (iArr[2] == 0) {
                                                b(fVar, 2);
                                                fVar.f9748B = iArr3[5] << 2;
                                            }
                                            iArr[2] = iArr[2] - 1;
                                            a.b(aVar);
                                            int[] iArr14 = (int[]) c0068j.f1183c;
                                            int[] iArr15 = (int[]) c0068j.f1184d;
                                            byte[] bArr11 = fVar.G;
                                            int i619 = fVar.f9748B;
                                            i21 = fVar.f9754L;
                                            if (i21 > i7) {
                                                i22 = 3;
                                            } else {
                                                i22 = i21 - 2;
                                            }
                                            iG2 = g(iArr14, iArr15[bArr11[i619 + i22] & 255], aVar);
                                            fVar.f9752F = iG2;
                                            i23 = fVar.H;
                                            if (iG2 >= i23) {
                                                int i6110 = iG2 - i23;
                                                int i6111 = fVar.I & i6110;
                                                int i6112 = i6110 >>> fVar.J;
                                                fVar.f9752F = i6112;
                                                int i6113 = (i6112 >>> 1) + 1;
                                                fVar.f9752F = i23 + i6111 + ((a.d(aVar, i6113) + ((((i6112 & 1) + 2) << i6113) - 4)) << fVar.J);
                                            }
                                        }
                                        i15 = fVar.f9752F;
                                        i16 = fVar.f9786t;
                                        iArr2 = fVar.f9783q;
                                        if (i15 < 16) {
                                            i17 = iArr2[(f9732d[i15] + i16) & 3] + f9733e[i15];
                                        } else {
                                            i17 = i15 - 15;
                                        }
                                        fVar.f9753K = i17;
                                        if (i17 >= 0) {
                                            throw new c("Negative distance");
                                        }
                                        i18 = fVar.f9785s;
                                        i19 = fVar.f9756N;
                                        if (i18 != i19) {
                                            fVar.f9785s = i19;
                                        } else {
                                            fVar.f9785s = i19;
                                        }
                                        fVar.f9755M = fVar.f9784r;
                                        if (i17 > fVar.f9785s) {
                                            if (i15 > 0) {
                                                iArr2[i16 & 3] = i17;
                                                fVar.f9786t = i16 + 1;
                                            }
                                            if (fVar.f9754L <= fVar.f9774g) {
                                                throw new c("Invalid backward reference");
                                            }
                                            fVar.f9789w = 0;
                                            fVar.f9768a = 7;
                                            int i6114 = fVar.f9784r;
                                            i25 = (i6114 - fVar.f9753K) & i32;
                                            i26 = fVar.f9754L - fVar.f9789w;
                                            if (i25 + i26 < i32) {
                                                while (true) {
                                                    i27 = fVar.f9789w;
                                                    if (i27 < fVar.f9754L) {
                                                        i28 = fVar.f9784r;
                                                        bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                        fVar.f9774g--;
                                                        fVar.f9789w = i27 + 1;
                                                        fVar.f9784r = i28 + 1;
                                                        if (i28 == i32) {
                                                            i29 = 7;
                                                            fVar.f9769b = 7;
                                                            fVar.f9766X = fVar.f9758P;
                                                            fVar.f9765W = 0;
                                                            fVar.f9768a = 12;
                                                        }
                                                    } else {
                                                        i29 = 7;
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    i27 = fVar.f9789w;
                                                    if (i27 < fVar.f9754L) {
                                                        i28 = fVar.f9784r;
                                                        bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                        fVar.f9774g--;
                                                        fVar.f9789w = i27 + 1;
                                                        fVar.f9784r = i28 + 1;
                                                        if (i28 == i32) {
                                                            i29 = 7;
                                                            fVar.f9769b = 7;
                                                            fVar.f9766X = fVar.f9758P;
                                                            fVar.f9765W = 0;
                                                            fVar.f9768a = 12;
                                                        }
                                                    } else {
                                                        i29 = 7;
                                                    }
                                                }
                                            }
                                            if (fVar.f9768a == i29) {
                                                fVar.f9768a = 3;
                                            }
                                        } else {
                                            fVar.f9768a = 9;
                                        }
                                    } else {
                                        fVar.f9768a = 3;
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            } else {
                                while (fVar.f9789w < fVar.f9790x) {
                                    a.e(aVar);
                                    if (iArr[c7] == 0) {
                                        d(fVar);
                                    }
                                    iArr[c7] = iArr[c7] - 1;
                                    a.b(aVar);
                                    bArr[fVar.f9784r] = (byte) g((int[]) c0068j3.f1183c, fVar.f9788v, aVar);
                                    fVar.f9789w++;
                                    i24 = fVar.f9784r;
                                    fVar.f9784r = i24 + 1;
                                    if (i24 == i32) {
                                        fVar.f9769b = 6;
                                        fVar.f9766X = fVar.f9758P;
                                        fVar.f9765W = 0;
                                        fVar.f9768a = 12;
                                    } else {
                                        c7 = 0;
                                    }
                                }
                            }
                            i13 = 6;
                            if (fVar.f9768a != i13) {
                                i14 = fVar.f9774g - fVar.f9790x;
                                fVar.f9774g = i14;
                                if (i14 <= 0) {
                                    if (fVar.f9752F < 0) {
                                        a.e(aVar);
                                        if (iArr[2] == 0) {
                                            b(fVar, 2);
                                            fVar.f9748B = iArr3[5] << 2;
                                        }
                                        iArr[2] = iArr[2] - 1;
                                        a.b(aVar);
                                        int[] iArr16 = (int[]) c0068j.f1183c;
                                        int[] iArr17 = (int[]) c0068j.f1184d;
                                        byte[] bArr12 = fVar.G;
                                        int i6115 = fVar.f9748B;
                                        i21 = fVar.f9754L;
                                        if (i21 > i7) {
                                            i22 = 3;
                                        } else {
                                            i22 = i21 - 2;
                                        }
                                        iG2 = g(iArr16, iArr17[bArr12[i6115 + i22] & 255], aVar);
                                        fVar.f9752F = iG2;
                                        i23 = fVar.H;
                                        if (iG2 >= i23) {
                                            int i6116 = iG2 - i23;
                                            int i6117 = fVar.I & i6116;
                                            int i6118 = i6116 >>> fVar.J;
                                            fVar.f9752F = i6118;
                                            int i6119 = (i6118 >>> 1) + 1;
                                            fVar.f9752F = i23 + i6117 + ((a.d(aVar, i6119) + ((((i6118 & 1) + 2) << i6119) - 4)) << fVar.J);
                                        }
                                    }
                                    i15 = fVar.f9752F;
                                    i16 = fVar.f9786t;
                                    iArr2 = fVar.f9783q;
                                    if (i15 < 16) {
                                        i17 = iArr2[(f9732d[i15] + i16) & 3] + f9733e[i15];
                                    } else {
                                        i17 = i15 - 15;
                                    }
                                    fVar.f9753K = i17;
                                    if (i17 >= 0) {
                                        throw new c("Negative distance");
                                    }
                                    i18 = fVar.f9785s;
                                    i19 = fVar.f9756N;
                                    if (i18 != i19) {
                                        fVar.f9785s = i19;
                                    } else {
                                        fVar.f9785s = i19;
                                    }
                                    fVar.f9755M = fVar.f9784r;
                                    if (i17 > fVar.f9785s) {
                                        if (i15 > 0) {
                                            iArr2[i16 & 3] = i17;
                                            fVar.f9786t = i16 + 1;
                                        }
                                        if (fVar.f9754L <= fVar.f9774g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        fVar.f9789w = 0;
                                        fVar.f9768a = 7;
                                        int i61110 = fVar.f9784r;
                                        i25 = (i61110 - fVar.f9753K) & i32;
                                        i26 = fVar.f9754L - fVar.f9789w;
                                        if (i25 + i26 < i32) {
                                            while (true) {
                                                i27 = fVar.f9789w;
                                                if (i27 < fVar.f9754L) {
                                                    i28 = fVar.f9784r;
                                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                    fVar.f9774g--;
                                                    fVar.f9789w = i27 + 1;
                                                    fVar.f9784r = i28 + 1;
                                                    if (i28 == i32) {
                                                        i29 = 7;
                                                        fVar.f9769b = 7;
                                                        fVar.f9766X = fVar.f9758P;
                                                        fVar.f9765W = 0;
                                                        fVar.f9768a = 12;
                                                    }
                                                } else {
                                                    i29 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i27 = fVar.f9789w;
                                                if (i27 < fVar.f9754L) {
                                                    i28 = fVar.f9784r;
                                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                    fVar.f9774g--;
                                                    fVar.f9789w = i27 + 1;
                                                    fVar.f9784r = i28 + 1;
                                                    if (i28 == i32) {
                                                        i29 = 7;
                                                        fVar.f9769b = 7;
                                                        fVar.f9766X = fVar.f9758P;
                                                        fVar.f9765W = 0;
                                                        fVar.f9768a = 12;
                                                    }
                                                } else {
                                                    i29 = 7;
                                                }
                                            }
                                        }
                                        if (fVar.f9768a == i29) {
                                            fVar.f9768a = 3;
                                        }
                                    } else {
                                        fVar.f9768a = 9;
                                    }
                                } else {
                                    fVar.f9768a = 3;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            fVar.f9768a = i8;
                        }
                        break;
                    case 4:
                        c8 = 11;
                        while (fVar.f9774g > 0) {
                            a.e(aVar);
                            a.d(aVar, 8);
                            fVar.f9774g--;
                        }
                        fVar.f9768a = 1;
                        c6 = c8;
                        break;
                    case 5:
                        c8 = 11;
                        byte[] bArr13 = fVar.f9771d;
                        int i72 = fVar.f9774g;
                        if (i72 <= 0) {
                            if (aVar.f9724g == 64) {
                                a.e(aVar);
                                a.a(aVar, false);
                                a.b(aVar);
                                a.b(aVar);
                            }
                            fVar.f9768a = i36;
                        } else {
                            int iMin2 = Math.min(fVar.f9758P - fVar.f9784r, i72);
                            int i73 = fVar.f9784r;
                            if ((aVar.f9724g & 7) != 0) {
                                throw new c("Unaligned copyBytes");
                            }
                            int i74 = iMin2;
                            while (true) {
                                int i75 = aVar.f9724g;
                                if (i75 != 64 && i74 != 0) {
                                    bArr13[i73] = (byte) (aVar.f9723f >>> i75);
                                    aVar.f9724g = i75 + 8;
                                    i74--;
                                    i73++;
                                }
                            }
                            if (i74 != 0) {
                                int iMin3 = Math.min(a.c(aVar), i74 >> 2);
                                if (iMin3 > 0) {
                                    int i76 = iMin3 << 2;
                                    System.arraycopy(aVar.f9718a, aVar.f9725h << 2, bArr13, i73, i76);
                                    i73 += i76;
                                    i74 -= i76;
                                    aVar.f9725h += iMin3;
                                }
                                if (i74 != 0) {
                                    if (a.c(aVar) > 0) {
                                        a.b(aVar);
                                        while (i74 != 0) {
                                            long j6 = aVar.f9723f;
                                            int i77 = aVar.f9724g;
                                            bArr13[i73] = (byte) (j6 >>> i77);
                                            aVar.f9724g = i77 + 8;
                                            i74--;
                                            i73++;
                                        }
                                        a.a(aVar, false);
                                    } else {
                                        while (i74 > 0) {
                                            try {
                                                int i78 = aVar.f9721d.read(bArr13, i73, i74);
                                                if (i78 == -1) {
                                                    throw new c("Unexpected end of input");
                                                }
                                                i73 += i78;
                                                i74 -= i78;
                                            } catch (IOException e6) {
                                                throw new c("Failed to read input", e6);
                                            }
                                        }
                                    }
                                }
                            }
                            fVar.f9774g -= iMin2;
                            int i79 = fVar.f9784r + iMin2;
                            fVar.f9784r = i79;
                            int i80 = fVar.f9758P;
                            if (i79 == i80) {
                                fVar.f9769b = 5;
                                fVar.f9766X = i80;
                                fVar.f9765W = 0;
                                fVar.f9768a = 12;
                            } else {
                                if (aVar.f9724g == 64) {
                                    a.e(aVar);
                                    a.a(aVar, false);
                                    a.b(aVar);
                                    a.b(aVar);
                                }
                                fVar.f9768a = 1;
                            }
                        }
                        c6 = c8;
                        break;
                    case 6:
                        iArr = iArr4;
                        i7 = 4;
                        c7 = 0;
                        c6 = 11;
                        if (!fVar.f9787u) {
                            int i513 = fVar.f9784r;
                            i10 = bArr[(i513 - 1) & i32] & 255;
                            i11 = bArr[(i513 - 2) & i32] & 255;
                            while (true) {
                                if (fVar.f9789w < fVar.f9790x) {
                                    a.e(aVar);
                                    if (iArr[0] == 0) {
                                        d(fVar);
                                    }
                                    byte[] bArr14 = fVar.f9792z;
                                    int i6120 = fVar.f9747A;
                                    int[] iArr18 = f9729a;
                                    int i6121 = bArr14[i6120 + (iArr18[fVar.f9750D + i11] | iArr18[fVar.f9749C + i10])] & 255;
                                    iArr[0] = iArr[0] - 1;
                                    a.b(aVar);
                                    iG = g((int[]) c0068j3.f1183c, ((int[]) c0068j3.f1184d)[i6121], aVar);
                                    i12 = fVar.f9784r;
                                    bArr[i12] = (byte) iG;
                                    fVar.f9789w++;
                                    fVar.f9784r = i12 + 1;
                                    if (i12 == i32) {
                                        i13 = 6;
                                        fVar.f9769b = 6;
                                        fVar.f9766X = fVar.f9758P;
                                        fVar.f9765W = 0;
                                        fVar.f9768a = 12;
                                    } else {
                                        int i6122 = i10;
                                        i10 = iG;
                                        i11 = i6122;
                                    }
                                }
                            }
                            if (fVar.f9768a != i13) {
                                i14 = fVar.f9774g - fVar.f9790x;
                                fVar.f9774g = i14;
                                if (i14 <= 0) {
                                    if (fVar.f9752F < 0) {
                                        a.e(aVar);
                                        if (iArr[2] == 0) {
                                            b(fVar, 2);
                                            fVar.f9748B = iArr3[5] << 2;
                                        }
                                        iArr[2] = iArr[2] - 1;
                                        a.b(aVar);
                                        int[] iArr19 = (int[]) c0068j.f1183c;
                                        int[] iArr110 = (int[]) c0068j.f1184d;
                                        byte[] bArr15 = fVar.G;
                                        int i61111 = fVar.f9748B;
                                        i21 = fVar.f9754L;
                                        if (i21 > i7) {
                                            i22 = 3;
                                        } else {
                                            i22 = i21 - 2;
                                        }
                                        iG2 = g(iArr19, iArr110[bArr15[i61111 + i22] & 255], aVar);
                                        fVar.f9752F = iG2;
                                        i23 = fVar.H;
                                        if (iG2 >= i23) {
                                            int i61112 = iG2 - i23;
                                            int i61113 = fVar.I & i61112;
                                            int i61114 = i61112 >>> fVar.J;
                                            fVar.f9752F = i61114;
                                            int i61115 = (i61114 >>> 1) + 1;
                                            fVar.f9752F = i23 + i61113 + ((a.d(aVar, i61115) + ((((i61114 & 1) + 2) << i61115) - 4)) << fVar.J);
                                        }
                                    }
                                    i15 = fVar.f9752F;
                                    i16 = fVar.f9786t;
                                    iArr2 = fVar.f9783q;
                                    if (i15 < 16) {
                                        i17 = iArr2[(f9732d[i15] + i16) & 3] + f9733e[i15];
                                    } else {
                                        i17 = i15 - 15;
                                    }
                                    fVar.f9753K = i17;
                                    if (i17 >= 0) {
                                        throw new c("Negative distance");
                                    }
                                    i18 = fVar.f9785s;
                                    i19 = fVar.f9756N;
                                    if (i18 != i19) {
                                        fVar.f9785s = i19;
                                    } else {
                                        fVar.f9785s = i19;
                                    }
                                    fVar.f9755M = fVar.f9784r;
                                    if (i17 > fVar.f9785s) {
                                        if (i15 > 0) {
                                            iArr2[i16 & 3] = i17;
                                            fVar.f9786t = i16 + 1;
                                        }
                                        if (fVar.f9754L <= fVar.f9774g) {
                                            throw new c("Invalid backward reference");
                                        }
                                        fVar.f9789w = 0;
                                        fVar.f9768a = 7;
                                        int i61116 = fVar.f9784r;
                                        i25 = (i61116 - fVar.f9753K) & i32;
                                        i26 = fVar.f9754L - fVar.f9789w;
                                        if (i25 + i26 < i32) {
                                            while (true) {
                                                i27 = fVar.f9789w;
                                                if (i27 < fVar.f9754L) {
                                                    i28 = fVar.f9784r;
                                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                    fVar.f9774g--;
                                                    fVar.f9789w = i27 + 1;
                                                    fVar.f9784r = i28 + 1;
                                                    if (i28 == i32) {
                                                        i29 = 7;
                                                        fVar.f9769b = 7;
                                                        fVar.f9766X = fVar.f9758P;
                                                        fVar.f9765W = 0;
                                                        fVar.f9768a = 12;
                                                    }
                                                } else {
                                                    i29 = 7;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i27 = fVar.f9789w;
                                                if (i27 < fVar.f9754L) {
                                                    i28 = fVar.f9784r;
                                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                    fVar.f9774g--;
                                                    fVar.f9789w = i27 + 1;
                                                    fVar.f9784r = i28 + 1;
                                                    if (i28 == i32) {
                                                        i29 = 7;
                                                        fVar.f9769b = 7;
                                                        fVar.f9766X = fVar.f9758P;
                                                        fVar.f9765W = 0;
                                                        fVar.f9768a = 12;
                                                    }
                                                } else {
                                                    i29 = 7;
                                                }
                                            }
                                        }
                                        if (fVar.f9768a == i29) {
                                            fVar.f9768a = 3;
                                        }
                                    } else {
                                        fVar.f9768a = 9;
                                    }
                                } else {
                                    fVar.f9768a = 3;
                                }
                            } else {
                                continue;
                            }
                            break;
                        } else {
                            while (fVar.f9789w < fVar.f9790x) {
                                a.e(aVar);
                                if (iArr[c7] == 0) {
                                    d(fVar);
                                }
                                iArr[c7] = iArr[c7] - 1;
                                a.b(aVar);
                                bArr[fVar.f9784r] = (byte) g((int[]) c0068j3.f1183c, fVar.f9788v, aVar);
                                fVar.f9789w++;
                                i24 = fVar.f9784r;
                                fVar.f9784r = i24 + 1;
                                if (i24 == i32) {
                                    fVar.f9769b = 6;
                                    fVar.f9766X = fVar.f9758P;
                                    fVar.f9765W = 0;
                                    fVar.f9768a = 12;
                                } else {
                                    c7 = 0;
                                }
                            }
                        }
                        i13 = 6;
                        if (fVar.f9768a != i13) {
                            i14 = fVar.f9774g - fVar.f9790x;
                            fVar.f9774g = i14;
                            if (i14 <= 0) {
                                if (fVar.f9752F < 0) {
                                    a.e(aVar);
                                    if (iArr[2] == 0) {
                                        b(fVar, 2);
                                        fVar.f9748B = iArr3[5] << 2;
                                    }
                                    iArr[2] = iArr[2] - 1;
                                    a.b(aVar);
                                    int[] iArr111 = (int[]) c0068j.f1183c;
                                    int[] iArr112 = (int[]) c0068j.f1184d;
                                    byte[] bArr16 = fVar.G;
                                    int i61117 = fVar.f9748B;
                                    i21 = fVar.f9754L;
                                    if (i21 > i7) {
                                        i22 = 3;
                                    } else {
                                        i22 = i21 - 2;
                                    }
                                    iG2 = g(iArr111, iArr112[bArr16[i61117 + i22] & 255], aVar);
                                    fVar.f9752F = iG2;
                                    i23 = fVar.H;
                                    if (iG2 >= i23) {
                                        int i61118 = iG2 - i23;
                                        int i61119 = fVar.I & i61118;
                                        int i611110 = i61118 >>> fVar.J;
                                        fVar.f9752F = i611110;
                                        int i611111 = (i611110 >>> 1) + 1;
                                        fVar.f9752F = i23 + i61119 + ((a.d(aVar, i611111) + ((((i611110 & 1) + 2) << i611111) - 4)) << fVar.J);
                                    }
                                }
                                i15 = fVar.f9752F;
                                i16 = fVar.f9786t;
                                iArr2 = fVar.f9783q;
                                if (i15 < 16) {
                                    i17 = iArr2[(f9732d[i15] + i16) & 3] + f9733e[i15];
                                } else {
                                    i17 = i15 - 15;
                                }
                                fVar.f9753K = i17;
                                if (i17 >= 0) {
                                    throw new c("Negative distance");
                                }
                                i18 = fVar.f9785s;
                                i19 = fVar.f9756N;
                                if (i18 != i19) {
                                    fVar.f9785s = i19;
                                } else {
                                    fVar.f9785s = i19;
                                }
                                fVar.f9755M = fVar.f9784r;
                                if (i17 > fVar.f9785s) {
                                    if (i15 > 0) {
                                        iArr2[i16 & 3] = i17;
                                        fVar.f9786t = i16 + 1;
                                    }
                                    if (fVar.f9754L <= fVar.f9774g) {
                                        throw new c("Invalid backward reference");
                                    }
                                    fVar.f9789w = 0;
                                    fVar.f9768a = 7;
                                    int i611112 = fVar.f9784r;
                                    i25 = (i611112 - fVar.f9753K) & i32;
                                    i26 = fVar.f9754L - fVar.f9789w;
                                    if (i25 + i26 < i32) {
                                        while (true) {
                                            i27 = fVar.f9789w;
                                            if (i27 < fVar.f9754L) {
                                                i28 = fVar.f9784r;
                                                bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                fVar.f9774g--;
                                                fVar.f9789w = i27 + 1;
                                                fVar.f9784r = i28 + 1;
                                                if (i28 == i32) {
                                                    i29 = 7;
                                                    fVar.f9769b = 7;
                                                    fVar.f9766X = fVar.f9758P;
                                                    fVar.f9765W = 0;
                                                    fVar.f9768a = 12;
                                                }
                                            } else {
                                                i29 = 7;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i27 = fVar.f9789w;
                                            if (i27 < fVar.f9754L) {
                                                i28 = fVar.f9784r;
                                                bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                                fVar.f9774g--;
                                                fVar.f9789w = i27 + 1;
                                                fVar.f9784r = i28 + 1;
                                                if (i28 == i32) {
                                                    i29 = 7;
                                                    fVar.f9769b = 7;
                                                    fVar.f9766X = fVar.f9758P;
                                                    fVar.f9765W = 0;
                                                    fVar.f9768a = 12;
                                                }
                                            } else {
                                                i29 = 7;
                                            }
                                        }
                                    }
                                    if (fVar.f9768a == i29) {
                                        fVar.f9768a = 3;
                                    }
                                } else {
                                    fVar.f9768a = 9;
                                }
                            } else {
                                fVar.f9768a = 3;
                            }
                        } else {
                            continue;
                        }
                        break;
                    case 7:
                        c6 = 11;
                        int i611113 = fVar.f9784r;
                        i25 = (i611113 - fVar.f9753K) & i32;
                        i26 = fVar.f9754L - fVar.f9789w;
                        if (i25 + i26 < i32) {
                            while (true) {
                                i27 = fVar.f9789w;
                                if (i27 < fVar.f9754L) {
                                    i28 = fVar.f9784r;
                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                    fVar.f9774g--;
                                    fVar.f9789w = i27 + 1;
                                    fVar.f9784r = i28 + 1;
                                    if (i28 == i32) {
                                        i29 = 7;
                                        fVar.f9769b = 7;
                                        fVar.f9766X = fVar.f9758P;
                                        fVar.f9765W = 0;
                                        fVar.f9768a = 12;
                                    }
                                } else {
                                    i29 = 7;
                                }
                            }
                        } else {
                            while (true) {
                                i27 = fVar.f9789w;
                                if (i27 < fVar.f9754L) {
                                    i28 = fVar.f9784r;
                                    bArr[i28] = bArr[(i28 - fVar.f9753K) & i32];
                                    fVar.f9774g--;
                                    fVar.f9789w = i27 + 1;
                                    fVar.f9784r = i28 + 1;
                                    if (i28 == i32) {
                                        i29 = 7;
                                        fVar.f9769b = 7;
                                        fVar.f9766X = fVar.f9758P;
                                        fVar.f9765W = 0;
                                        fVar.f9768a = 12;
                                    }
                                } else {
                                    i29 = 7;
                                }
                            }
                        }
                        if (fVar.f9768a == i29) {
                            fVar.f9768a = 3;
                        }
                        break;
                    case 8:
                        c8 = 11;
                        int i81 = fVar.f9758P;
                        System.arraycopy(bArr, i81, bArr, 0, fVar.f9755M - i81);
                        fVar.f9768a = 3;
                        c6 = c8;
                        break;
                    case 9:
                        int i82 = fVar.f9754L;
                        if (i82 < 4 || i82 > 24) {
                            throw new c("Invalid backward reference");
                        }
                        int i83 = f9735g[i82];
                        int i84 = (fVar.f9753K - fVar.f9785s) - 1;
                        int i85 = f9736h[i82];
                        int i86 = ((i36 << i85) - 1) & i84;
                        int i87 = i84 >>> i85;
                        int i88 = (i86 * i82) + i83;
                        g[] gVarArr = g.f9793d;
                        if (i87 >= gVarArr.length) {
                            throw new c("Invalid backward reference");
                        }
                        int i89 = fVar.f9755M;
                        byte[] bArr17 = e.f9746a;
                        g gVar = gVarArr[i87];
                        int i90 = i89;
                        for (byte b7 : gVar.f9794a) {
                            bArr[i90] = b7;
                            i90++;
                        }
                        int i91 = gVar.f9795b;
                        int i92 = i91 >= 12 ? i91 - 11 : 0;
                        if (i92 > i82) {
                            i92 = i82;
                        }
                        int i93 = i88 + i92;
                        int i94 = (i82 - i92) - (i91 <= 9 ? i91 : 0);
                        int i95 = i94;
                        while (i95 > 0) {
                            bArr[i90] = bArr17[i93];
                            i95--;
                            i90++;
                            i93++;
                        }
                        c8 = 11;
                        if (i91 == 11 || i91 == 10) {
                            int i96 = i90 - i94;
                            if (i91 == 10) {
                                i94 = i36;
                            }
                            while (i94 > 0) {
                                byte b8 = bArr[i96];
                                int i97 = b8 & 255;
                                if (i97 < 192) {
                                    if (i97 >= 97 && i97 <= 122) {
                                        bArr[i96] = (byte) (b8 ^ 32);
                                    }
                                    i96++;
                                    i94--;
                                } else if (i97 < 224) {
                                    int i98 = i96 + 1;
                                    bArr[i98] = (byte) (bArr[i98] ^ 32);
                                    i96 += 2;
                                    i94 -= 2;
                                } else {
                                    int i99 = i96 + 2;
                                    bArr[i99] = (byte) (bArr[i99] ^ 5);
                                    i96 += 3;
                                    i94 -= 3;
                                }
                            }
                        }
                        byte[] bArr18 = gVar.f9796c;
                        for (byte b9 : bArr18) {
                            bArr[i90] = b9;
                            i90++;
                        }
                        int i100 = i90 - i89;
                        int i101 = fVar.f9755M + i100;
                        fVar.f9755M = i101;
                        fVar.f9784r += i100;
                        fVar.f9774g -= i100;
                        int i102 = fVar.f9758P;
                        if (i101 >= i102) {
                            fVar.f9769b = 8;
                            fVar.f9766X = i102;
                            fVar.f9765W = 0;
                            fVar.f9768a = 12;
                        } else {
                            fVar.f9768a = 3;
                        }
                        c6 = c8;
                        break;
                        break;
                    default:
                        throw new c("Unexpected state " + fVar.f9768a);
                }
            } else {
                c6 = c9;
                int i103 = fVar.f9761S;
                if (i103 != 0) {
                    fVar.f9765W += i103;
                    fVar.f9761S = 0;
                }
                int iMin4 = Math.min(fVar.f9763U - fVar.f9764V, fVar.f9766X - fVar.f9765W);
                if (iMin4 != 0) {
                    System.arraycopy(fVar.f9771d, fVar.f9765W, fVar.f9767Y, fVar.f9762T + fVar.f9764V, iMin4);
                    fVar.f9764V += iMin4;
                    fVar.f9765W += iMin4;
                }
                if (fVar.f9764V >= fVar.f9763U) {
                    return;
                }
                int i104 = fVar.f9784r;
                int i105 = fVar.f9756N;
                if (i104 >= i105) {
                    fVar.f9785s = i105;
                }
                fVar.f9784r = i104 & i32;
                fVar.f9768a = fVar.f9769b;
            }
            c9 = c6;
            i31 = 1;
        }
    }

    public static void f(int i3, int[] iArr, int i6, a aVar) {
        int i7;
        int i8;
        int i9;
        a.e(aVar);
        int[] iArr2 = new int[i3];
        int iD = a.d(aVar, 2);
        char c6 = 3;
        boolean z5 = false;
        boolean z6 = true;
        if (iD == 1) {
            int i10 = i3 - 1;
            int[] iArr3 = new int[4];
            int iD2 = a.d(aVar, 2) + 1;
            int i11 = 0;
            while (i10 != 0) {
                i10 >>= 1;
                i11++;
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                int iD3 = a.d(aVar, i11) % i3;
                iArr3[i12] = iD3;
                iArr2[iD3] = 2;
            }
            iArr2[iArr3[0]] = 1;
            if (iD2 != 1) {
                if (iD2 == 2) {
                    int i13 = iArr3[0];
                    int i14 = iArr3[1];
                    z5 = i13 != i14;
                    iArr2[i14] = 1;
                } else if (iD2 != 3) {
                    int i15 = iArr3[0];
                    int i16 = iArr3[1];
                    boolean z7 = (i15 == i16 || i15 == (i8 = iArr3[2]) || i15 == (i9 = iArr3[3]) || i16 == i8 || i16 == i9 || i8 == i9) ? false : true;
                    if (a.d(aVar, 1) == 1) {
                        iArr2[iArr3[2]] = 3;
                        iArr2[iArr3[3]] = 3;
                    } else {
                        iArr2[iArr3[0]] = 2;
                    }
                    z6 = z7;
                } else {
                    int i17 = iArr3[0];
                    int i18 = iArr3[1];
                    if (i17 != i18 && i17 != (i7 = iArr3[2]) && i18 != i7) {
                        z5 = true;
                    }
                }
                z6 = z5;
            }
        } else {
            int[] iArr4 = new int[18];
            int i19 = 0;
            int i20 = 32;
            while (iD < 18 && i20 > 0) {
                int i21 = f9731c[iD];
                a.b(aVar);
                long j4 = aVar.f9723f;
                char c7 = c6;
                int i22 = aVar.f9724g;
                int i23 = f9734f[((int) (j4 >>> i22)) & 15];
                aVar.f9724g = i22 + (i23 >> 16);
                int i24 = i23 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                iArr4[i21] = i24;
                if (i24 != 0) {
                    i20 -= 32 >> i24;
                    i19++;
                }
                iD++;
                c6 = c7;
            }
            if (i19 != 1 && i20 != 0) {
                z6 = false;
            }
            int[] iArr5 = new int[32];
            a(0, 5, 18, iArr5, iArr4);
            int i25 = 8;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 32768;
            while (i26 < i3 && i29 > 0) {
                a.e(aVar);
                a.b(aVar);
                long j6 = aVar.f9723f;
                int i30 = aVar.f9724g;
                int i31 = iArr5[((int) (j6 >>> i30)) & 31];
                aVar.f9724g = i30 + (i31 >> 16);
                int i32 = i31 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                if (i32 < 16) {
                    int i33 = i26 + 1;
                    iArr2[i26] = i32;
                    if (i32 != 0) {
                        i29 -= 32768 >> i32;
                        i25 = i32;
                    }
                    i26 = i33;
                    i28 = 0;
                } else {
                    int i34 = i32 - 14;
                    int i35 = i32 == 16 ? i25 : 0;
                    if (i27 != i35) {
                        i27 = i35;
                        i28 = 0;
                    }
                    int iD4 = a.d(aVar, i34) + 3 + (i28 > 0 ? (i28 - 2) << i34 : i28);
                    int i36 = iD4 - i28;
                    if (i26 + i36 > i3) {
                        throw new c("symbol + repeatDelta > numSymbols");
                    }
                    int i37 = 0;
                    while (i37 < i36) {
                        iArr2[i26] = i27;
                        i37++;
                        i26++;
                    }
                    if (i27 != 0) {
                        i29 -= i36 << (15 - i27);
                    }
                    i28 = iD4;
                }
            }
            if (i29 != 0) {
                throw new c("Unused space");
            }
            int i38 = i3 - i26;
            int i39 = 0;
            while (i39 < i38) {
                int iMin = Math.min(i39 + 1024, i38) - i39;
                System.arraycopy(f9745r, 0, iArr2, i26 + i39, iMin);
                i39 += iMin;
            }
        }
        if (!z6) {
            throw new c("Can't readHuffmanCode");
        }
        a(i6, 8, i3, iArr, iArr2);
    }

    public static int g(int[] iArr, int i3, a aVar) {
        long j4 = aVar.f9723f;
        int i6 = aVar.f9724g;
        int i7 = (int) (j4 >>> i6);
        int i8 = i3 + (i7 & 255);
        int i9 = iArr[i8];
        int i10 = i9 >> 16;
        int i11 = i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i10 <= 8) {
            aVar.f9724g = i6 + i10;
            return i11;
        }
        int i12 = iArr[i8 + i11 + ((i7 & ((1 << i10) - 1)) >>> 8)];
        aVar.f9724g = (i12 >> 16) + 8 + i6;
        return i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }
}
