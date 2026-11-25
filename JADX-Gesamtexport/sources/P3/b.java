package P3;

import B.AbstractC0013g0;
import M4.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4601a = {-103, -101, 106, -115, 74, -92, 27, 97, -116, 12, -62, 5, 45, -102, -94, 63, 10, 100, 21, 16, -61, 41, -23, 46, -92, 94, 29, 66, -82, -40, 10, -92, -45, 76, 63, 22, -13, -87, -20, -111, 3, 59, 37, 9, -128, -56, -19, 8, -106, 78, 75, 121, -3, -78, -97, -122, -43, -21, 36, -31, 28, -46, 107, 6, -68, 116, -124, 116, 69, -53, -109, 120, 60, 18, 71, 97, -91, 91, -94, 109, -64, 42, 112, 43, -54, -118, 69, -112, -27, 6, 107, 102, -102, -57, -89, -31, 104, 67, 75, 122, -81, -124, -70, 66, -27, 31, 57, 9, -75, -29, -94, -69};

    public static final String a(int i) {
        int i3 = i / 3600;
        int i6 = (i % 3600) / 60;
        return l.B0((i6 > 0 || i3 > 0) ? AbstractC0013g0.f(i6, "", "min") : "< 1min").toString();
    }
}
