package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0436v f6823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6826d;

    public U(AbstractC0436v abstractC0436v, String str, Object[] objArr) {
        this.f6823a = abstractC0436v;
        this.f6824b = str;
        this.f6825c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6826d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i3 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f6826d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i3 = i7;
            }
        }
    }

    public final int a() {
        int i = this.f6826d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
