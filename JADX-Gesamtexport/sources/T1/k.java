package T1;

/* JADX INFO: loaded from: classes.dex */
public enum k {
    NOT_AVAILABLE(-1, null),
    START_OBJECT(1, "{"),
    END_OBJECT(2, "}"),
    START_ARRAY(3, "["),
    END_ARRAY(4, "]"),
    FIELD_NAME(5, null),
    VALUE_EMBEDDED_OBJECT(12, null),
    VALUE_STRING(6, null),
    VALUE_NUMBER_INT(7, null),
    VALUE_NUMBER_FLOAT(8, null),
    VALUE_TRUE(9, "true"),
    VALUE_FALSE(10, "false"),
    VALUE_NULL(11, "null");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5231h;
    public final char[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f5232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f5235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f5236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f5237o;

    k(int i, String str) {
        boolean z5 = false;
        if (str == null) {
            this.f5231h = null;
            this.i = null;
            this.f5232j = null;
        } else {
            this.f5231h = str;
            char[] charArray = str.toCharArray();
            this.i = charArray;
            int length = charArray.length;
            this.f5232j = new byte[length];
            for (int i3 = 0; i3 < length; i3++) {
                this.f5232j[i3] = (byte) this.i[i3];
            }
        }
        this.f5233k = i;
        if (i != 10) {
        }
        this.f5236n = i == 7 || i == 8;
        boolean z6 = i == 1 || i == 3;
        this.f5234l = z6;
        boolean z7 = i == 2 || i == 4;
        this.f5235m = z7;
        if (!z6 && !z7 && i != 5 && i != -1) {
            z5 = true;
        }
        this.f5237o = z5;
    }
}
