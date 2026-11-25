package p035g0;

import android.graphics.BlendModeColorFilter;
import defpackage.b;

/* JADX INFO: renamed from: g0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0710k f9071a = new C0710k();

    public final BlendModeColorFilter a(long j4, int i) {
        return new BlendModeColorFilter(H.v(j4), H.r(i));
    }

    public final C0709j b(BlendModeColorFilter blendModeColorFilter) {
        int i;
        long jC = H.c(blendModeColorFilter.getColor());
        switch (AbstractC0700a.f9055a[blendModeColorFilter.getMode().ordinal()]) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
            default:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case 11:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case 13:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
            case 16:
                i = 15;
                break;
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                i = 16;
                break;
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                i = 17;
                break;
            case b.SINGLELIGHTUSE_FIELD_NUMBER /* 19 */:
                i = 18;
                break;
            case 20:
                i = 19;
                break;
            case 21:
                i = 20;
                break;
            case 22:
                i = 21;
                break;
            case 23:
                i = 22;
                break;
            case 24:
                i = 23;
                break;
            case 25:
                i = 24;
                break;
            case 26:
                i = 25;
                break;
            case 27:
                i = 26;
                break;
            case 28:
                i = 27;
                break;
            case 29:
                i = 28;
                break;
        }
        return new C0709j(jC, i, blendModeColorFilter);
    }
}
