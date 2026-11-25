package V1;

import com.philips.lighting.hue.sdk.wrapper.HueLog;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f5485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f5486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f5487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f5488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f5489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f5491h;
    public static final int[] i;

    static {
        int i3;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f5484a = charArray;
        f5485b = "0123456789abcdef".toCharArray();
        int length = charArray.length;
        f5486c = new byte[length];
        f5487d = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            f5486c[i6] = (byte) f5484a[i6];
            f5487d[i6] = (byte) f5485b[i6];
        }
        int[] iArr = new int[HueLog.LogComponent.STREAMDTLS];
        for (int i7 = 0; i7 < 32; i7++) {
            iArr[i7] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f5488e = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i8 = 128; i8 < 256; i8++) {
            if ((i8 & 224) == 192) {
                i3 = 2;
            } else if ((i8 & 240) == 224) {
                i3 = 3;
            } else {
                i3 = (i8 & 248) == 240 ? 4 : -1;
            }
            iArr2[i8] = i3;
        }
        f5489f = iArr2;
        int[] iArr3 = new int[HueLog.LogComponent.STREAMDTLS];
        Arrays.fill(iArr3, -1);
        for (int i9 = 33; i9 < 256; i9++) {
            if (Character.isJavaIdentifierPart((char) i9)) {
                iArr3[i9] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f5490g = iArr3;
        int[] iArr4 = new int[HueLog.LogComponent.STREAMDTLS];
        System.arraycopy(iArr3, 0, iArr4, 0, HueLog.LogComponent.STREAMDTLS);
        Arrays.fill(iArr4, 128, 128, 0);
        int[] iArr5 = new int[HueLog.LogComponent.STREAMDTLS];
        int[] iArr6 = f5489f;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr7 = new int[HueLog.LogComponent.STREAMDTLS];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i10 = 0; i10 < 32; i10++) {
            iArr8[i10] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f5491h = iArr8;
        int[] iArr9 = new int[HueLog.LogComponent.STREAMDTLS];
        i = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i11 = 0; i11 < 10; i11++) {
            i[i11 + 48] = i11;
        }
        for (int i12 = 0; i12 < 6; i12++) {
            int[] iArr10 = i;
            int i13 = i12 + 10;
            iArr10[i12 + 97] = i13;
            iArr10[i12 + 65] = i13;
        }
    }

    public static char[] a(boolean z5) {
        return (char[]) (z5 ? f5484a.clone() : f5485b.clone());
    }
}
