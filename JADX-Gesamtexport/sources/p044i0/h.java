package p044i0;

import p012c.k;
import p096s.AbstractC0916i;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9393d;

    public h(float f6, float f7, int i, int i3, int i6) {
        f7 = (i6 & 2) != 0 ? 4.0f : f7;
        i = (i6 & 4) != 0 ? 0 : i;
        i3 = (i6 & 8) != 0 ? 0 : i3;
        this.f9390a = f6;
        this.f9391b = f7;
        this.f9392c = i;
        this.f9393d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f9390a == hVar.f9390a && this.f9391b == hVar.f9391b) {
            if (this.f9392c == hVar.f9392c) {
                if (this.f9393d == hVar.f9393d) {
                    hVar.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0916i.c(this.f9393d, AbstractC0916i.c(this.f9392c, k.i(this.f9391b, Float.hashCode(this.f9390a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f9390a);
        sb.append(", miter=");
        sb.append(this.f9391b);
        sb.append(", cap=");
        String str2 = "Unknown";
        int i = this.f9392c;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(", join=");
        int i3 = this.f9393d;
        if (i3 == 0) {
            str2 = "Miter";
        } else if (i3 == 1) {
            str2 = "Round";
        } else if (i3 == 2) {
            str2 = "Bevel";
        }
        sb.append((Object) str2);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
