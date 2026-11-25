package R0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4735b = 66305;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4736a;

    public static String a(int i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i3 = i & 255;
        String str3 = "Invalid";
        if (i3 == 1) {
            str = "Strategy.Simple";
        } else if (i3 == 2) {
            str = "Strategy.HighQuality";
        } else if (i3 == 3) {
            str = "Strategy.Balanced";
        } else {
            str = i3 == 0 ? "Strategy.Unspecified" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", strictness=");
        int i6 = (i >> 8) & 255;
        if (i6 == 1) {
            str2 = "Strictness.None";
        } else if (i6 == 2) {
            str2 = "Strictness.Loose";
        } else if (i6 == 3) {
            str2 = "Strictness.Normal";
        } else if (i6 == 4) {
            str2 = "Strictness.Strict";
        } else {
            str2 = i6 == 0 ? "Strictness.Unspecified" : "Invalid";
        }
        sb.append((Object) str2);
        sb.append(", wordBreak=");
        int i7 = (i >> 16) & 255;
        if (i7 == 1) {
            str3 = "WordBreak.None";
        } else if (i7 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i7 == 0) {
            str3 = "WordBreak.Unspecified";
        }
        sb.append((Object) str3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f4736a == ((e) obj).f4736a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4736a);
    }

    public final String toString() {
        return a(this.f4736a);
    }
}
