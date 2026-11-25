package p034f4;

import R3.l;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f8979c = new n("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f8980b = f8979c;

    @Override // R3.l
    public final R3.k a() {
        return new l(this.f8980b);
    }
}
