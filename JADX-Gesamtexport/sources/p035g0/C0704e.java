package p035g0;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f9060a;

    public C0704e(Bitmap bitmap) {
        this.f9060a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f9060a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return config == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}
