package com.philips.lighting.hue.sdk.wrapper.utilities;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class Executor {
    private static Lock lock;
    private static Condition notEmptyCondition;
    private static List<Runnable> tasks = new LinkedList();

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        notEmptyCondition = reentrantLock.newCondition();
        Thread thread = new Thread(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.utilities.Executor.1
            @Override // java.lang.Runnable
            public void run() {
                Executor.threadProc();
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    public static void submit(final Runnable runnable) {
        lock.lock();
        try {
            tasks.add(new Runnable() { // from class: com.philips.lighting.hue.sdk.wrapper.utilities.Executor.2
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            });
            notEmptyCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void threadProc() {
        while (true) {
            lock.lock();
            try {
                if (tasks.isEmpty()) {
                    try {
                        notEmptyCondition.await();
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                        lock.unlock();
                        return;
                    }
                }
                Runnable runnableRemove = !tasks.isEmpty() ? tasks.remove(0) : null;
                lock.unlock();
                if (runnableRemove != null) {
                    runnableRemove.run();
                }
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }
    }
}
