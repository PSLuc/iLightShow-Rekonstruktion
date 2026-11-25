package p030f0;

import p012c.k;
import p020d2.n;
import p027e3.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8850h;

    static {
        long j4 = a.f8831a;
        n.a(a.b(j4), a.c(j4));
    }

    public e(float f6, float f7, float f8, float f9, long j4, long j6, long j7, long j8) {
        this.f8843a = f6;
        this.f8844b = f7;
        this.f8845c = f8;
        this.f8846d = f9;
        this.f8847e = j4;
        this.f8848f = j6;
        this.f8849g = j7;
        this.f8850h = j8;
    }

    public final float a() {
        return this.f8846d - this.f8844b;
    }

    public final float b() {
        return this.f8845c - this.f8843a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8843a, eVar.f8843a) == 0 && Float.compare(this.f8844b, eVar.f8844b) == 0 && Float.compare(this.f8845c, eVar.f8845c) == 0 && Float.compare(this.f8846d, eVar.f8846d) == 0 && a.a(this.f8847e, eVar.f8847e) && a.a(this.f8848f, eVar.f8848f) && a.a(this.f8849g, eVar.f8849g) && a.a(this.f8850h, eVar.f8850h);
    }

    public final int hashCode() {
        int i = k.i(this.f8846d, k.i(this.f8845c, k.i(this.f8844b, Float.hashCode(this.f8843a) * 31, 31), 31), 31);
        int i3 = a.f8832b;
        return Long.hashCode(this.f8850h) + k.l(k.l(k.l(i, 31, this.f8847e), 31, this.f8848f), 31, this.f8849g);
    }

    public final String toString() {
        String str = a.B0(this.f8843a) + ", " + a.B0(this.f8844b) + ", " + a.B0(this.f8845c) + ", " + a.B0(this.f8846d);
        long j4 = this.f8847e;
        long j6 = this.f8848f;
        boolean zA = a.a(j4, j6);
        long j7 = this.f8849g;
        long j8 = this.f8850h;
        if (!zA || !a.a(j6, j7) || !a.a(j7, j8)) {
            StringBuilder sbW = k.w("RoundRect(rect=", str, ", topLeft=");
            sbW.append((Object) a.d(j4));
            sbW.append(", topRight=");
            sbW.append((Object) a.d(j6));
            sbW.append(", bottomRight=");
            sbW.append((Object) a.d(j7));
            sbW.append(", bottomLeft=");
            sbW.append((Object) a.d(j8));
            sbW.append(')');
            return sbW.toString();
        }
        if (a.b(j4) == a.c(j4)) {
            StringBuilder sbW2 = k.w("RoundRect(rect=", str, ", radius=");
            sbW2.append(a.B0(a.b(j4)));
            sbW2.append(')');
            return sbW2.toString();
        }
        StringBuilder sbW3 = k.w("RoundRect(rect=", str, ", x=");
        sbW3.append(a.B0(a.b(j4)));
        sbW3.append(", y=");
        sbW3.append(a.B0(a.c(j4)));
        sbW3.append(')');
        return sbW3.toString();
    }
}
