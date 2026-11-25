package p028e4;

import X3.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f8746p = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f8747q = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f8748h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AtomicReferenceArray f8751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AtomicReferenceArray f8753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicLong f8754o;

    public b(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f8748h = atomicLong;
        this.f8754o = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i3 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f8751l = atomicReferenceArray;
        this.f8750k = i3;
        this.i = Math.min(iNumberOfLeadingZeros / 4, f8746p);
        this.f8753n = atomicReferenceArray;
        this.f8752m = i3;
        this.f8749j = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // X3.h
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // X3.h
    public final boolean isEmpty() {
        return this.f8748h.get() == this.f8754o.get();
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f8751l;
        AtomicLong atomicLong = this.f8748h;
        long j4 = atomicLong.get();
        int i = this.f8750k;
        int i3 = ((int) j4) & i;
        if (j4 < this.f8749j) {
            atomicReferenceArray.lazySet(i3, obj);
            atomicLong.lazySet(j4 + 1);
            return true;
        }
        long j6 = ((long) this.i) + j4;
        if (atomicReferenceArray.get(((int) j6) & i) == null) {
            this.f8749j = j6 - 1;
            atomicReferenceArray.lazySet(i3, obj);
            atomicLong.lazySet(j4 + 1);
            return true;
        }
        long j7 = j4 + 1;
        if (atomicReferenceArray.get(((int) j7) & i) == null) {
            atomicReferenceArray.lazySet(i3, obj);
            atomicLong.lazySet(j7);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f8751l = atomicReferenceArray2;
        this.f8749j = (j4 + ((long) i)) - 1;
        atomicReferenceArray2.lazySet(i3, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f8747q);
        atomicLong.lazySet(j7);
        return true;
    }

    @Override // X3.h
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f8753n;
        AtomicLong atomicLong = this.f8754o;
        long j4 = atomicLong.get();
        int i = this.f8752m;
        int i3 = ((int) j4) & i;
        Object obj = atomicReferenceArray.get(i3);
        boolean z5 = obj == f8747q;
        if (obj != null && !z5) {
            atomicReferenceArray.lazySet(i3, null);
            atomicLong.lazySet(j4 + 1);
            return obj;
        }
        if (!z5) {
            return null;
        }
        int i6 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i6);
        atomicReferenceArray.lazySet(i6, null);
        this.f8753n = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i3);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i3, null);
            atomicLong.lazySet(j4 + 1);
        }
        return obj2;
    }
}
