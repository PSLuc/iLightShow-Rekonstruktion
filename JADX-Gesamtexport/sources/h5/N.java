package h5;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class N extends P {
    @Override // h5.P
    public final P deadlineNanoTime(long j4) {
        return this;
    }

    @Override // h5.P
    public final void throwIfReached() {
    }

    @Override // h5.P
    public final P timeout(long j4, TimeUnit timeUnit) {
        E4.k.f("unit", timeUnit);
        return this;
    }
}
