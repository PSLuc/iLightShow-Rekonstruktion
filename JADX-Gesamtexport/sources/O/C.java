package O;

import F.C0071m;
import N.C0237s;
import N.G0;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4340b;

    public C(int i, int i3) {
        this.f4339a = i;
        this.f4340b = i3;
    }

    public abstract void a(C0071m c0071m, p091r0.d dVar, G0 g6, C0237s c0237s);

    public String b(int i) {
        return "IntParameter(" + i + ')';
    }

    public String c(int i) {
        return "ObjectParameter(" + i + ')';
    }

    public final String toString() {
        String strB = E4.x.a(getClass()).b();
        return strB == null ? "" : strB;
    }

    public /* synthetic */ C(int i, int i3, int i6) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i3);
    }
}
