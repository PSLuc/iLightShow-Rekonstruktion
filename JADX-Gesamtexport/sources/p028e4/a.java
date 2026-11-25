package p028e4;

import X3.g;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReferenceArray implements g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Integer f8741m = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8742h;
    public final AtomicLong i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8743j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicLong f8744k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8745l;

    public a(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f8742h = length() - 1;
        this.i = new AtomicLong();
        this.f8744k = new AtomicLong();
        this.f8745l = Math.min(i / 4, f8741m.intValue());
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
        return this.i.get() == this.f8744k.get();
    }

    @Override // X3.h
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.i;
        long j4 = atomicLong.get();
        int i = this.f8742h;
        int i3 = ((int) j4) & i;
        if (j4 >= this.f8743j) {
            long j6 = ((long) this.f8745l) + j4;
            if (get(i & ((int) j6)) == null) {
                this.f8743j = j6;
            } else if (get(i3) != null) {
                return false;
            }
        }
        lazySet(i3, obj);
        atomicLong.lazySet(j4 + 1);
        return true;
    }

    @Override // X3.h
    public final Object poll() {
        AtomicLong atomicLong = this.f8744k;
        long j4 = atomicLong.get();
        int i = ((int) j4) & this.f8742h;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j4 + 1);
        lazySet(i, null);
        return obj;
    }
}
