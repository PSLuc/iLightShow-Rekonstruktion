package G0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f1547b = new v(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1548a;

    public v() {
        this.f1548a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f1548a == ((v) obj).f1548a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f1548a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f1548a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public v(boolean z5) {
        this.f1548a = z5;
    }
}
