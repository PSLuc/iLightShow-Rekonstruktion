package R4;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f4847a = new h();

    public static b a(int i, int i3, int i6) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = 1;
        }
        if (i == -2) {
            if (i3 != 1) {
                return new k(1, i3);
            }
            f.f4845c.getClass();
            return new b(e.f4844b);
        }
        if (i == -1) {
            if (i3 == 1) {
                return new k(1, 2);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return i3 == 1 ? new b(0) : new k(1, i3);
        }
        if (i != Integer.MAX_VALUE) {
            return i3 == 1 ? new b(i) : new k(i, i3);
        }
        return new b(Integer.MAX_VALUE);
    }
}
