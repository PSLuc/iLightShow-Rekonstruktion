package H4;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f1802h;

    static {
        Integer num = A4.a.f26a;
        f1802h = (num == null || num.intValue() >= 34) ? new I4.a() : new c();
    }

    public abstract int a(int i);

    public abstract int b();

    public abstract int c(int i);

    public int d(int i, int i3) {
        int iB;
        int i6;
        int iA;
        if (i3 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i3) + ").").toString());
        }
        int i7 = i3 - i;
        if (i7 > 0 || i7 == Integer.MIN_VALUE) {
            if (((-i7) & i7) == i7) {
                iA = a(31 - Integer.numberOfLeadingZeros(i7));
            } else {
                do {
                    iB = b() >>> 1;
                    i6 = iB % i7;
                } while ((i7 - 1) + (iB - i6) < 0);
                iA = i6;
            }
            return i + iA;
        }
        while (true) {
            int iB2 = b();
            if (i <= iB2 && iB2 < i3) {
                return iB2;
            }
        }
    }
}
