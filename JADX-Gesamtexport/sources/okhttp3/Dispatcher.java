package okhttp3;

import E4.k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import p084p4.c;
import p089q4.l;
import p089q4.n;

/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (k.a(asyncCall.getHost(), str)) {
                return asyncCall;
            }
        }
        for (RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
            if (k.a(asyncCall2.getHost(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t6) {
        Runnable idleCallback;
        synchronized (this) {
            if (!deque.remove(t6)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            idleCallback = getIdleCallback();
        }
        if (promoteAndExecute() || idleCallback == null) {
            return;
        }
        idleCallback.run();
    }

    private final boolean promoteAndExecute() {
        int i;
        boolean z5;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                k.e("readyAsyncCalls.iterator()", it);
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= getMaxRequests()) {
                        break;
                    }
                    if (next.getCallsPerHost().get() < getMaxRequestsPerHost()) {
                        it.remove();
                        next.getCallsPerHost().incrementAndGet();
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                z5 = runningCallsCount() > 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((RealCall.AsyncCall) arrayList.get(i)).executeOn(executorService());
        }
        return z5;
    }

    @c
    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m50deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().getCall().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().getCall().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        k.f("call", asyncCall);
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
            }
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        k.f("call", realCall);
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(k.l(Util.okHttpName, " Dispatcher"), false));
            }
            executorService = this.executorServiceOrNull;
            k.c(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        k.f("call", asyncCall);
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(n.P(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            k.e("unmodifiableList(readyAsyncCalls.map { it.call })", listUnmodifiableList);
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        try {
            ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
            ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(n.P(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(l.j0(arrayDeque, arrayList));
            k.e("unmodifiableList(running…yncCalls.map { it.call })", listUnmodifiableList);
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(k.l("max < 1: ", Integer.valueOf(i)).toString());
        }
        synchronized (this) {
            this.maxRequests = i;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(k.l("max < 1: ", Integer.valueOf(i)).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i;
        }
        promoteAndExecute();
    }

    public final void finished$okhttp(RealCall realCall) {
        k.f("call", realCall);
        finished(this.runningSyncCalls, realCall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        k.f("executorService", executorService);
        this.executorServiceOrNull = executorService;
    }
}
