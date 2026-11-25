package M4;

import com.philips.lighting.hue.sdk.wrapper.HueLog;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f3533b;

    static {
        int[] iArr = new int[HueLog.LogComponent.STREAMDTLS];
        int i = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = "0123456789abcdef".charAt(i3 & 15) | ("0123456789abcdef".charAt(i3 >> 4) << '\b');
        }
        f3532a = iArr;
        int[] iArr2 = new int[HueLog.LogComponent.STREAMDTLS];
        for (int i6 = 0; i6 < 256; i6++) {
            iArr2[i6] = "0123456789ABCDEF".charAt(i6 & 15) | ("0123456789ABCDEF".charAt(i6 >> 4) << '\b');
        }
        int[] iArr3 = new int[HueLog.LogComponent.STREAMDTLS];
        for (int i7 = 0; i7 < 256; i7++) {
            iArr3[i7] = -1;
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i8)] = i9;
            i8++;
            i9++;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        long[] jArr = new long[HueLog.LogComponent.STREAMDTLS];
        for (int i12 = 0; i12 < 256; i12++) {
            jArr[i12] = -1;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i13)] = i14;
            i13++;
            i14++;
        }
        int i15 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i15;
            i++;
            i15++;
        }
        f3533b = jArr;
    }

    public static final void a(int i, String str, int i3) {
        int i6 = i3 - i;
        if (i6 < 1) {
            String strSubstring = str.substring(i, i3);
            E4.k.e("substring(...)", strSubstring);
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + i6);
        }
        if (i6 > 16) {
            int i7 = (i6 + i) - 16;
            while (i < i7) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbV = p012c.k.v(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbV.append(str.charAt(i));
                    sbV.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbV.toString());
                }
                i++;
            }
        }
    }

    public static long b(int i, String str, int i3) {
        g gVar = g.f3537d;
        E4.k.f("format", gVar);
        p006b.a.q(i, i3, str.length());
        if (gVar.f3540c.f3536a) {
            a(i, str, i3);
            return c(i, str, i3);
        }
        if (i3 - i > 0) {
            a(i, str, i3);
            return c(i, str, i3);
        }
        String strSubstring = str.substring(i, i3);
        E4.k.e("substring(...)", strSubstring);
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(int i, String str, int i3) {
        long j4 = 0;
        while (i < i3) {
            long j6 = j4 << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j7 = f3533b[cCharAt];
                if (j7 >= 0) {
                    j4 = j6 | j7;
                    i++;
                }
            }
            StringBuilder sbV = p012c.k.v(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbV.append(str.charAt(i));
            throw new NumberFormatException(sbV.toString());
        }
        return j4;
    }
}
