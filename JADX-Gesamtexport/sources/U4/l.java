package U4;

import O1.C0308a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5366e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5367f = AtomicLongFieldUpdater.newUpdater(l.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0308a f5368g = new C0308a("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f5372d;

    public l(int i, boolean z5) {
        this.f5369a = i;
        this.f5370b = z5;
        int i3 = i - 1;
        this.f5371c = i3;
        this.f5372d = new AtomicReferenceArray(i);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5367f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j4);
            int i3 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.f5371c;
            if (((i3 + 2) & i6) == (i & i6)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f5372d;
            if (this.f5370b || atomicReferenceArray.get(i3 & i6) == null) {
                l lVar = this;
                if (atomicLongFieldUpdater.compareAndSet(lVar, j4, ((-1152921503533105153L) & j4) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i3 & i6, runnable);
                    l lVarC = lVar;
                    while ((atomicLongFieldUpdater.get(lVarC) & 1152921504606846976L) != 0) {
                        lVarC = lVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = lVarC.f5372d;
                        int i7 = lVarC.f5371c & i3;
                        Object obj = atomicReferenceArray2.get(i7);
                        if ((obj instanceof k) && ((k) obj).f5365a == i3) {
                            atomicReferenceArray2.set(i7, runnable);
                        } else {
                            lVarC = null;
                        }
                        if (lVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = lVar;
            } else {
                int i8 = this.f5369a;
                if (i8 < 1024 || ((i3 - i) & 1073741823) > (i8 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5367f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
            l lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j4, 2305843009213693952L | j4)) {
                return true;
            }
            this = lVar;
        }
    }

    public final l c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        l lVar;
        while (true) {
            atomicLongFieldUpdater = f5367f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                lVar = this;
                break;
            }
            long j6 = 1152921504606846976L | j4;
            lVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lVar, j4, j6)) {
                j4 = j6;
                break;
            }
            this = lVar;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5366e;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (lVar2 != null) {
                return lVar2;
            }
            l lVar3 = new l(lVar.f5369a * 2, lVar.f5370b);
            int i = (int) (1073741823 & j4);
            int i3 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i6 = lVar.f5371c;
                int i7 = i & i6;
                if (i7 == (i6 & i3)) {
                    break;
                }
                Object kVar = lVar.f5372d.get(i7);
                if (kVar == null) {
                    kVar = new k(i);
                }
                lVar3.f5372d.set(lVar3.f5371c & i, kVar);
                i++;
            }
            atomicLongFieldUpdater.set(lVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, null, lVar3) && atomicReferenceFieldUpdater.get(lVar) == null) {
            }
        }
    }

    public final Object d() {
        l lVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5367f;
            long j4 = atomicLongFieldUpdater.get(lVarC);
            if ((j4 & 1152921504606846976L) != 0) {
                return f5368g;
            }
            int i = (int) (j4 & 1073741823);
            int i3 = lVarC.f5371c;
            int i6 = ((int) ((1152921503533105152L & j4) >> 30)) & i3;
            int i7 = i3 & i;
            if (i6 != i7) {
                AtomicReferenceArray atomicReferenceArray = lVarC.f5372d;
                Object obj = atomicReferenceArray.get(i7);
                boolean z5 = lVarC.f5370b;
                if (obj == null) {
                    if (z5) {
                    }
                } else if (!(obj instanceof k)) {
                    long j6 = (i + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(lVarC, j4, (j4 & (-1073741824)) | j6)) {
                        atomicReferenceArray.set(i7, null);
                        return obj;
                    }
                    lVarC = this;
                    if (z5) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f5367f;
                            long j7 = atomicLongFieldUpdater2.get(lVarC);
                            int i8 = (int) (j7 & 1073741823);
                            if ((j7 & 1152921504606846976L) != 0) {
                                lVarC = lVarC.c();
                            } else {
                                l lVar = lVarC;
                                lVarC = lVar;
                                if (atomicLongFieldUpdater2.compareAndSet(lVar, j7, (j7 & (-1073741824)) | j6)) {
                                    lVarC.f5372d.set(lVarC.f5371c & i8, null);
                                    lVarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (lVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
