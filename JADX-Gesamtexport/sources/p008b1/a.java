package p008b1;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7045a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d6, double d7, double d8) {
        double d9 = (((-0.4986d) * d8) + (((-1.5372d) * d7) + (3.2406d * d6))) / 100.0d;
        double d10 = ((0.0415d * d8) + ((1.8758d * d7) + ((-0.9689d) * d6))) / 100.0d;
        double d11 = ((1.057d * d8) + (((-0.204d) * d7) + (0.0557d * d6))) / 100.0d;
        double dPow = d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d;
        double dPow2 = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        double dPow3 = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i, int i3) {
        int iAlpha = Color.alpha(i3);
        int iAlpha2 = Color.alpha(i);
        int i6 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i6, c(Color.red(i), iAlpha2, Color.red(i3), iAlpha, i6), c(Color.green(i), iAlpha2, Color.green(i3), iAlpha, i6), c(Color.blue(i), iAlpha2, Color.blue(i3), iAlpha, i6));
    }

    public static int c(int i, int i3, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i3) * (i6 * i7)) + ((i * 255) * i3)) / (i8 * 255);
    }
}
