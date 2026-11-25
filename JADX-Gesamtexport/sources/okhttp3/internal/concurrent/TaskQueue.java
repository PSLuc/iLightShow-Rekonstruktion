package okhttp3.internal.concurrent;

import D4.a;
import E4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import okhttp3.internal.Util;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    public static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(k.l(Util.okHttpName, " awaitIdle"), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Task {
        final /* synthetic */ a $block;
        final /* synthetic */ boolean $cancelable;
        final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z5, a aVar) {
            super(str, z5);
            this.$name = str;
            this.$cancelable = z5;
            this.$block = aVar;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Task {
        final /* synthetic */ a $block;
        final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, a aVar) {
            super(str, false, 2, null);
            this.$name = str;
            this.$block = aVar;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            return ((Number) this.$block.invoke()).longValue();
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        k.f("taskRunner", taskRunner);
        k.f("name", str);
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j4, boolean z5, a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j4 = 0;
        }
        if ((i & 4) != 0) {
            z5 = true;
        }
        k.f("name", str);
        k.f("block", aVar);
        taskQueue.schedule(new AnonymousClass1(str, z5, aVar), j4);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j4, int i, Object obj) {
        if ((i & 2) != 0) {
            j4 = 0;
        }
        taskQueue.schedule(task, j4);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            k.c(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        int size = this.futureTasks.size() - 1;
        boolean z5 = false;
        if (size < 0) {
            return false;
        }
        while (true) {
            int i = size - 1;
            if (this.futureTasks.get(size).getCancelable()) {
                Task task2 = this.futureTasks.get(size);
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z5 = true;
            }
            if (i < 0) {
                return z5;
            }
            size = i;
        }
    }

    public final void execute(String str, long j4, boolean z5, a aVar) {
        k.f("name", str);
        k.f("block", aVar);
        schedule(new AnonymousClass1(str, z5, aVar), j4);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> listS0;
        synchronized (this.taskRunner) {
            listS0 = l.s0(getFutureTasks$okhttp());
        }
        return listS0;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (getActiveTask$okhttp() == null && getFutureTasks$okhttp().isEmpty()) {
                return new CountDownLatch(0);
            }
            Task activeTask$okhttp = getActiveTask$okhttp();
            if (activeTask$okhttp instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) activeTask$okhttp).getLatch();
            }
            for (Task task : getFutureTasks$okhttp()) {
                if (task instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(Task task, long j4) {
        k.f("task", task);
        synchronized (this.taskRunner) {
            if (!getShutdown$okhttp()) {
                if (scheduleAndDecide$okhttp(task, j4, false)) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
            } else if (task.getCancelable()) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j4, boolean z5) {
        k.f("task", task);
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j6 = jNanoTime + j4;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j6) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j6);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            TaskLoggerKt.log(task, this, z5 ? k.l("run again after ", TaskLoggerKt.formatDuration(j6 - jNanoTime)) : k.l("scheduled after ", TaskLoggerKt.formatDuration(j6 - jNanoTime)));
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - jNanoTime > j4) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z5) {
        this.cancelActiveTask = z5;
    }

    public final void setShutdown$okhttp(boolean z5) {
        this.shutdown = z5;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            setShutdown$okhttp(true);
            if (cancelAllAndDecide$okhttp()) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
        }
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j4, a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j4 = 0;
        }
        k.f("name", str);
        k.f("block", aVar);
        taskQueue.schedule(new AnonymousClass2(str, aVar), j4);
    }

    public final void schedule(String str, long j4, a aVar) {
        k.f("name", str);
        k.f("block", aVar);
        schedule(new AnonymousClass2(str, aVar), j4);
    }
}
