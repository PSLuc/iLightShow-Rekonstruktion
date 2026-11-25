package G0;

import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0105a f1527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f1533g;

    public q(C0105a c0105a, int i, int i3, int i6, int i7, float f6, float f7) {
        this.f1527a = c0105a;
        this.f1528b = i;
        this.f1529c = i3;
        this.f1530d = i6;
        this.f1531e = i7;
        this.f1532f = f6;
        this.f1533g = f7;
    }

    public final long a(long j4, boolean z5) {
        if (z5) {
            long j6 = I.f1468b;
            if (I.a(j4, j6)) {
                return j6;
            }
        }
        int i = I.f1469c;
        int i3 = this.f1528b;
        return AbstractC0599v0.d(((int) (j4 >> 32)) + i3, ((int) (j4 & 4294967295L)) + i3);
    }

    public final int b(int i) {
        int i3 = this.f1529c;
        int i6 = this.f1528b;
        return p081p0.c.O(i, i6, i3) - i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f1527a.equals(qVar.f1527a) && this.f1528b == qVar.f1528b && this.f1529c == qVar.f1529c && this.f1530d == qVar.f1530d && this.f1531e == qVar.f1531e && Float.compare(this.f1532f, qVar.f1532f) == 0 && Float.compare(this.f1533g, qVar.f1533g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1533g) + p012c.k.i(this.f1532f, AbstractC0916i.c(this.f1531e, AbstractC0916i.c(this.f1530d, AbstractC0916i.c(this.f1529c, AbstractC0916i.c(this.f1528b, this.f1527a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f1527a);
        sb.append(", startIndex=");
        sb.append(this.f1528b);
        sb.append(", endIndex=");
        sb.append(this.f1529c);
        sb.append(", startLineIndex=");
        sb.append(this.f1530d);
        sb.append(", endLineIndex=");
        sb.append(this.f1531e);
        sb.append(", top=");
        sb.append(this.f1532f);
        sb.append(", bottom=");
        return p012c.k.t(sb, this.f1533g, ')');
    }
}
