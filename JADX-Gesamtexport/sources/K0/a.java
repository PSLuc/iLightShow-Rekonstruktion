package K0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2036a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f2037b = new Object[0];

    public static final int a(int i, int i3, int[] iArr) {
        int i6 = i - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i3) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i3) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }
}
