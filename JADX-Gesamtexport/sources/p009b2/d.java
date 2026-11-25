package p009b2;

import T1.r;
import Y1.f;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f7064k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f7066j;
    public final int i = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char[] f7065h = new char[32];

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = "\n";
        }
        f7064k = new d(property);
    }

    public d(String str) {
        int i = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            "  ".getChars(0, 2, this.f7065h, i);
            i += 2;
        }
        this.f7066j = str;
    }

    public final void c(f fVar, int i) {
        fVar.i0(this.f7066j);
        if (i <= 0) {
            return;
        }
        int length = i * this.i;
        while (true) {
            char[] cArr = this.f7065h;
            if (length <= cArr.length) {
                fVar.N0(cArr, length);
                return;
            } else {
                fVar.N0(cArr, cArr.length);
                length -= cArr.length;
            }
        }
    }
}
