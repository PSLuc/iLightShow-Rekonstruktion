package p034f4;

import W3.a;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f8989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f8991c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f8992d = new ConcurrentHashMap();

    static {
        int i;
        Properties properties = System.getProperties();
        boolean z5 = properties.containsKey("rx2.purge-enabled") ? Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled")) : true;
        if (z5 && properties.containsKey("rx2.purge-period-seconds")) {
            try {
                i = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                i = 1;
            }
        } else {
            i = 1;
        }
        f8989a = z5;
        f8990b = i;
        if (!z5) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f8991c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new n("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    a aVar = new a(3);
                    long j4 = f8990b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, j4, j4, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
