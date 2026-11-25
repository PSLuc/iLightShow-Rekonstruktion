package p005a4;

import java.util.concurrent.atomic.AtomicLong;
import p027e3.a;
import p043h4.f;
import u5.b;
import u5.c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AtomicLong implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f6338h;
    public volatile A i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6339j;

    public z(b bVar) {
        this.f6338h = bVar;
    }

    @Override // u5.c
    public final void cancel() {
        A a6;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (a6 = this.i) == null) {
            return;
        }
        a6.f(this);
        a6.e();
    }

    @Override // u5.c
    public final void e(long j4) {
        long j6;
        if (f.f(j4)) {
            do {
                j6 = get();
                if (j6 == Long.MIN_VALUE || j6 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j6, a.P(j6, j4)));
            A a6 = this.i;
            if (a6 != null) {
                a6.e();
            }
        }
    }
}
