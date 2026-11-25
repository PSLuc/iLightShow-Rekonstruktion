package okhttp3.internal.concurrent;

import D4.a;
import E4.k;
import java.util.Arrays;
import java.util.logging.Level;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j4) {
        String str;
        if (j4 <= -999500000) {
            str = ((j4 - ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j4 <= -999500) {
            str = ((j4 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j4 <= 0) {
            str = ((j4 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j4 < 999500) {
            str = ((j4 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j4 < 999500000) {
            str = ((j4 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j4 + ((long) 500000000)) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a aVar) {
        long jNanoTime;
        k.f("task", task);
        k.f("queue", taskQueue);
        k.f("block", aVar);
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t6 = (T) aVar.invoke();
            if (zIsLoggable) {
                String strL = k.l("finished run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return t6;
        } finally {
            if (zIsLoggable) {
                log(task, taskQueue, k.l("failed a run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime)));
            }
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a aVar) {
        k.f("task", task);
        k.f("queue", taskQueue);
        k.f("messageBlock", aVar);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) aVar.invoke());
        }
    }
}
