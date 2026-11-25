package p034f4;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f8999h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f9001k;

    public v(Runnable runnable, Long l6, int i) {
        this.f8999h = runnable;
        this.i = l6.longValue();
        this.f9000j = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i;
        v vVar = (v) obj;
        long j4 = vVar.i;
        long j6 = this.i;
        if (j6 < j4) {
            i = -1;
        } else {
            i = j6 > j4 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        int i3 = this.f9000j;
        int i6 = vVar.f9000j;
        if (i3 < i6) {
            return -1;
        }
        return i3 > i6 ? 1 : 0;
    }
}
