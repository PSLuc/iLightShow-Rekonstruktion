package p009b2;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7054c = {8000, 8000, 2000, 2000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7055d = {4000, 4000, 200, 200};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f7056a = new AtomicReferenceArray(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceArray f7057b = new AtomicReferenceArray(4);

    public final char[] a(int i, int i3) {
        int i6 = f7055d[i];
        if (i3 < i6) {
            i3 = i6;
        }
        char[] cArr = (char[]) this.f7057b.getAndSet(i, null);
        return (cArr == null || cArr.length < i3) ? new char[i3] : cArr;
    }
}
