package p113v0;

import p030f0.f;

/* JADX INFO: renamed from: v0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1025h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13167a;

    public /* synthetic */ C1025h(int i) {
        this.f13167a = i;
    }

    public long a(long j4, long j6) {
        switch (this.f13167a) {
            case 0:
                float fMin = Math.min(f.d(j6) / f.d(j4), f.b(j6) / f.b(j4));
                return U.a(fMin, fMin);
            default:
                if (f.d(j4) <= f.d(j6) && f.b(j4) <= f.b(j6)) {
                    return U.a(1.0f, 1.0f);
                }
                float fMin2 = Math.min(f.d(j6) / f.d(j4), f.b(j6) / f.b(j4));
                return U.a(fMin2, fMin2);
        }
    }

    public String toString() {
        switch (this.f13167a) {
            case 2:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
