package h5;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: h5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0725c {
    public static C0728f a() throws InterruptedException {
        C0728f c0728f = C0728f.head;
        E4.k.c(c0728f);
        C0728f c0728f2 = c0728f.next;
        if (c0728f2 == null) {
            long jNanoTime = System.nanoTime();
            C0728f.condition.await(C0728f.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            C0728f c0728f3 = C0728f.head;
            E4.k.c(c0728f3);
            if (c0728f3.next != null || System.nanoTime() - jNanoTime < C0728f.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return C0728f.head;
        }
        long jAccess$remainingNanos = C0728f.access$remainingNanos(c0728f2, System.nanoTime());
        if (jAccess$remainingNanos > 0) {
            C0728f.condition.await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        C0728f c0728f4 = C0728f.head;
        E4.k.c(c0728f4);
        c0728f4.next = c0728f2.next;
        c0728f2.next = null;
        return c0728f2;
    }
}
