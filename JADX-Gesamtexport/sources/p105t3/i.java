package p105t3;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f12560d = new i("", "", false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12563c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z5) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f12561a = str;
        this.f12562b = str2;
        this.f12563c = z5;
    }
}
