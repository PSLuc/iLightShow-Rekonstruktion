package F1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f1399h;
    public final Bundle i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1402l;

    public z(B b6, Bundle bundle, boolean z5, int i, boolean z6) {
        E4.k.f("destination", b6);
        this.f1399h = b6;
        this.i = bundle;
        this.f1400j = z5;
        this.f1401k = i;
        this.f1402l = z6;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z zVar) {
        E4.k.f("other", zVar);
        boolean z5 = zVar.f1400j;
        boolean z6 = this.f1400j;
        if (z6 && !z5) {
            return 1;
        }
        if (!z6 && z5) {
            return -1;
        }
        int i = this.f1401k - zVar.f1401k;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle = zVar.i;
        Bundle bundle2 = this.i;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            E4.k.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z7 = zVar.f1402l;
        boolean z8 = this.f1402l;
        if (!z8 || z7) {
            return (z8 || !z7) ? 0 : -1;
        }
        return 1;
    }
}
