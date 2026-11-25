package p058l0;

import java.util.ArrayList;
import p027e3.a;
import p035g0.O;
import p035g0.r;

/* JADX INFO: renamed from: l0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0822e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10278h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0821d f10279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10280k;

    public C0822e(String str, float f6, float f7, float f8, float f9, long j4, int i, boolean z5, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        long j6 = (i3 & 32) != 0 ? r.f9085l : j4;
        int i6 = (i3 & 64) != 0 ? 5 : i;
        this.f10271a = str;
        this.f10272b = f6;
        this.f10273c = f7;
        this.f10274d = f8;
        this.f10275e = f9;
        this.f10276f = j6;
        this.f10277g = i6;
        this.f10278h = z5;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        C0821d c0821d = new C0821d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f10279j = c0821d;
        arrayList.add(c0821d);
    }

    public static void a(C0822e c0822e, ArrayList arrayList, O o6) {
        if (c0822e.f10280k) {
            a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        ArrayList arrayList2 = c0822e.i;
        ((C0821d) arrayList2.get(arrayList2.size() - 1)).f10270j.add(new K("", arrayList, 0, o6, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final C0823f b() {
        if (this.f10280k) {
            a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            throw null;
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() <= 1) {
                C0821d c0821d = this.f10279j;
                C0823f c0823f = new C0823f(this.f10271a, this.f10272b, this.f10273c, this.f10274d, this.f10275e, new F(c0821d.f10262a, c0821d.f10263b, c0821d.f10264c, c0821d.f10265d, c0821d.f10266e, c0821d.f10267f, c0821d.f10268g, c0821d.f10269h, c0821d.i, c0821d.f10270j), this.f10276f, this.f10277g, this.f10278h);
                this.f10280k = true;
                return c0823f;
            }
            if (this.f10280k) {
                a.y0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                throw null;
            }
            C0821d c0821d2 = (C0821d) arrayList.remove(arrayList.size() - 1);
            ((C0821d) arrayList.get(arrayList.size() - 1)).f10270j.add(new F(c0821d2.f10262a, c0821d2.f10263b, c0821d2.f10264c, c0821d2.f10265d, c0821d2.f10266e, c0821d2.f10267f, c0821d2.f10268g, c0821d2.f10269h, c0821d2.i, c0821d2.f10270j));
        }
    }
}
