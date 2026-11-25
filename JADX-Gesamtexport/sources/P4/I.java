package P4;

import O1.C0308a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class I implements Runnable, Comparable, E {
    private volatile Object _heap;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4611h;
    public int i;

    @Override // P4.E
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C0308a c0308a = AbstractC0336x.f4673b;
                if (obj == c0308a) {
                    return;
                }
                J j4 = obj instanceof J ? (J) obj : null;
                if (j4 != null) {
                    synchronized (j4) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof U4.v ? (U4.v) obj2 : null) != null) {
                            j4.b(this.i);
                        }
                    }
                }
                this._heap = c0308a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j4, J j6, K k3) {
        synchronized (this) {
            if (this._heap == AbstractC0336x.f4673b) {
                return 2;
            }
            synchronized (j6) {
                try {
                    I[] iArr = j6.f5384a;
                    I i = iArr != null ? iArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K.f4613n;
                    k3.getClass();
                    if (K.f4615p.get(k3) != 0) {
                        return 1;
                    }
                    if (i == null) {
                        j6.f4612c = j4;
                    } else {
                        long j7 = i.f4611h;
                        if (j7 - j4 < 0) {
                            j4 = j7;
                        }
                        if (j4 - j6.f4612c > 0) {
                            j6.f4612c = j4;
                        }
                    }
                    long j8 = this.f4611h;
                    long j9 = j6.f4612c;
                    if (j8 - j9 < 0) {
                        this.f4611h = j9;
                    }
                    j6.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(J j4) {
        if (this._heap == AbstractC0336x.f4673b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j4 = this.f4611h - ((I) obj).f4611h;
        if (j4 > 0) {
            return 1;
        }
        return j4 < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f4611h + ']';
    }
}
