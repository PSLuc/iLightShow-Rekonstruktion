package p035g0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import p040h0.c;
import p040h0.d;

/* JADX INFO: renamed from: g0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0708i {
    public static final c a(Bitmap bitmap) {
        c cVarB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (cVarB = u.b(colorSpace)) == null) ? d.f9224c : cVarB;
    }

    public static final Bitmap b(int i, int i3, int i6, boolean z5, c cVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i, i3, H.w(i6), z5, u.a(cVar));
    }
}
