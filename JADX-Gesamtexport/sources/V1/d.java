package V1;

import java.util.Arrays;
import p009b2.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f5494a = b.a(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5495b;

    static {
        b.f5486c.clone();
        f5495b = new d();
    }

    public static char[] a(String str) {
        int length = str.length();
        char[] cArrJ = new char[Math.min(Math.max(16, Math.min((length >> 3) + 6, 1000) + length), 32000)];
        int[] iArr = b.f5491h;
        int length2 = iArr.length;
        m mVar = null;
        char[] cArr = null;
        int i = 0;
        int i3 = 0;
        loop0: while (i < length) {
            while (true) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= length2 || iArr[cCharAt] == 0) {
                    if (i3 >= cArrJ.length) {
                        if (mVar == null) {
                            mVar = new m(cArrJ);
                        }
                        cArrJ = mVar.j();
                        i3 = 0;
                    }
                    int i6 = i3 + 1;
                    cArrJ[i3] = cCharAt;
                    i++;
                    if (i >= length) {
                        i3 = i6;
                        break loop0;
                    }
                    i3 = i6;
                }
            }
            int i7 = 2;
            if (cArr == null) {
                cArr = new char[]{'\\', 0, '0', '0', 0, 0};
            }
            int i8 = i + 1;
            char cCharAt2 = str.charAt(i);
            int i9 = iArr[cCharAt2];
            if (i9 < 0) {
                cArr[1] = 'u';
                char[] cArr2 = f5494a;
                cArr[4] = cArr2[cCharAt2 >> 4];
                cArr[5] = cArr2[cCharAt2 & 15];
                i7 = 6;
            } else {
                cArr[1] = (char) i9;
            }
            int i10 = i3 + i7;
            if (i10 > cArrJ.length) {
                int length3 = cArrJ.length - i3;
                if (length3 > 0) {
                    System.arraycopy(cArr, 0, cArrJ, i3, length3);
                }
                if (mVar == null) {
                    mVar = new m(cArrJ);
                }
                cArrJ = mVar.j();
                int i11 = i7 - length3;
                System.arraycopy(cArr, length3, cArrJ, 0, i11);
                i3 = i11;
            } else {
                System.arraycopy(cArr, 0, cArrJ, i3, i7);
                i3 = i10;
            }
            i = i8;
        }
        if (mVar == null) {
            return Arrays.copyOfRange(cArrJ, 0, i3);
        }
        mVar.i = i3;
        return mVar.e();
    }
}
