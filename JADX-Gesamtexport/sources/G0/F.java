package G0;

import java.util.List;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0110f f1449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f1450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S0.b f1455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S0.k f1456h;
    public final L0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f1457j;

    public F(C0110f c0110f, J j4, List list, int i, boolean z5, int i3, S0.b bVar, S0.k kVar, L0.d dVar, long j6) {
        this.f1449a = c0110f;
        this.f1450b = j4;
        this.f1451c = list;
        this.f1452d = i;
        this.f1453e = z5;
        this.f1454f = i3;
        this.f1455g = bVar;
        this.f1456h = kVar;
        this.i = dVar;
        this.f1457j = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return E4.k.a(this.f1449a, f6.f1449a) && E4.k.a(this.f1450b, f6.f1450b) && E4.k.a(this.f1451c, f6.f1451c) && this.f1452d == f6.f1452d && this.f1453e == f6.f1453e && this.f1454f == f6.f1454f && E4.k.a(this.f1455g, f6.f1455g) && this.f1456h == f6.f1456h && E4.k.a(this.i, f6.i) && S0.a.b(this.f1457j, f6.f1457j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1457j) + ((this.i.hashCode() + ((this.f1456h.hashCode() + ((this.f1455g.hashCode() + AbstractC0916i.c(this.f1454f, p012c.k.m(this.f1453e, (((this.f1451c.hashCode() + ((this.f1450b.hashCode() + (this.f1449a.hashCode() * 31)) * 31)) * 31) + this.f1452d) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f1449a);
        sb.append(", style=");
        sb.append(this.f1450b);
        sb.append(", placeholders=");
        sb.append(this.f1451c);
        sb.append(", maxLines=");
        sb.append(this.f1452d);
        sb.append(", softWrap=");
        sb.append(this.f1453e);
        sb.append(", overflow=");
        int i = this.f1454f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else {
            str = i == 3 ? "Visible" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.f1455g);
        sb.append(", layoutDirection=");
        sb.append(this.f1456h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) S0.a.k(this.f1457j));
        sb.append(')');
        return sb.toString();
    }
}
