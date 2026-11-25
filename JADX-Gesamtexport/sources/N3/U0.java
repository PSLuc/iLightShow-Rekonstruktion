package N3;

import B.AbstractC0013g0;
import com.nanjoran.ilightshow.Services.PaletteColor;

/* JADX INFO: loaded from: classes.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PaletteColor f4130d;

    public U0(int i, long j4, long j6, PaletteColor paletteColor) {
        this.f4127a = i;
        this.f4128b = j4;
        this.f4129c = j6;
        this.f4130d = paletteColor;
    }

    public static U0 a(U0 u0, long j4, long j6, PaletteColor paletteColor, int i) {
        long j7 = j4;
        int i3 = u0.f4127a;
        if ((i & 2) != 0) {
            j7 = u0.f4128b;
        }
        if ((i & 4) != 0) {
            j6 = u0.f4129c;
        }
        if ((i & 8) != 0) {
            paletteColor = u0.f4130d;
        }
        u0.getClass();
        return new U0(i3, j7, j6, paletteColor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u0 = (U0) obj;
        return this.f4127a == u0.f4127a && p030f0.c.b(this.f4128b, u0.f4128b) && p030f0.c.b(this.f4129c, u0.f4129c) && this.f4130d.equals(u0.f4130d);
    }

    public final int hashCode() {
        return this.f4130d.hashCode() + p012c.k.l(p012c.k.l(Integer.hashCode(this.f4127a) * 31, 31, this.f4128b), 31, this.f4129c);
    }

    public final String toString() {
        String strJ = p030f0.c.j(this.f4128b);
        String strJ2 = p030f0.c.j(this.f4129c);
        StringBuilder sb = new StringBuilder("OffsetColor(id=");
        AbstractC0013g0.s(sb, this.f4127a, ", realOffset=", strJ, ", offset=");
        sb.append(strJ2);
        sb.append(", paletteColor=");
        sb.append(this.f4130d);
        sb.append(")");
        return sb.toString();
    }
}
