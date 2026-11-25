package R0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f4740c = new g(17, f.f4738b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4742b;

    public g(int i, float f6) {
        this.f4741a = f6;
        this.f4742b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        float f6 = gVar.f4741a;
        float f7 = f.f4737a;
        return Float.compare(this.f4741a, f6) == 0 && this.f4742b == gVar.f4742b;
    }

    public final int hashCode() {
        float f6 = f.f4737a;
        return Integer.hashCode(this.f4742b) + (Float.hashCode(this.f4741a) * 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f6 = this.f4741a;
        if (f6 == 0.0f) {
            float f7 = f.f4737a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (f6 == f.f4737a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f6 == f.f4738b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f6 == f.f4739c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i = this.f4742b;
        if (i == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else {
            str2 = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
