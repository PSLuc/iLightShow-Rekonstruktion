package p035g0;

import android.graphics.BlendModeColorFilter;
import p012c.k;

/* JADX INFO: renamed from: g0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlendModeColorFilter f9068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9070c;

    public C0709j(long j4, int i, BlendModeColorFilter blendModeColorFilter) {
        this.f9068a = blendModeColorFilter;
        this.f9069b = j4;
        this.f9070c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0709j)) {
            return false;
        }
        C0709j c0709j = (C0709j) obj;
        if (r.c(this.f9069b, c0709j.f9069b)) {
            return this.f9070c == c0709j.f9070c;
        }
        return false;
    }

    public final int hashCode() {
        int i = r.f9086m;
        return Integer.hashCode(this.f9070c) + (Long.hashCode(this.f9069b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        k.z(this.f9069b, sb, ", blendMode=");
        int i = this.f9070c;
        if (i == 0) {
            str = "Clear";
        } else if (i == 1) {
            str = "Src";
        } else if (i == 2) {
            str = "Dst";
        } else if (i == 3) {
            str = "SrcOver";
        } else if (i == 4) {
            str = "DstOver";
        } else if (i == 5) {
            str = "SrcIn";
        } else if (i == 6) {
            str = "DstIn";
        } else if (i == 7) {
            str = "SrcOut";
        } else if (i == 8) {
            str = "DstOut";
        } else if (i == 9) {
            str = "SrcAtop";
        } else if (i == 10) {
            str = "DstAtop";
        } else if (i == 11) {
            str = "Xor";
        } else if (i == 12) {
            str = "Plus";
        } else if (i == 13) {
            str = "Modulate";
        } else if (i == 14) {
            str = "Screen";
        } else if (i == 15) {
            str = "Overlay";
        } else if (i == 16) {
            str = "Darken";
        } else if (i == 17) {
            str = "Lighten";
        } else if (i == 18) {
            str = "ColorDodge";
        } else if (i == 19) {
            str = "ColorBurn";
        } else if (i == 20) {
            str = "HardLight";
        } else if (i == 21) {
            str = "Softlight";
        } else if (i == 22) {
            str = "Difference";
        } else if (i == 23) {
            str = "Exclusion";
        } else if (i == 24) {
            str = "Multiply";
        } else if (i == 25) {
            str = "Hue";
        } else if (i == 26) {
            str = "Saturation";
        } else if (i == 27) {
            str = "Color";
        } else {
            str = i == 28 ? "Luminosity" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
