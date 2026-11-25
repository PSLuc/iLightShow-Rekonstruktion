package h5;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: h5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726d implements K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9340h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f9341j;

    public /* synthetic */ C0726d(Object obj, int i, Object obj2) {
        this.f9340h = i;
        this.i = obj;
        this.f9341j = obj2;
    }

    @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        switch (this.f9340h) {
            case 0:
                K k3 = (K) this.f9341j;
                C0728f c0728f = (C0728f) this.i;
                c0728f.enter();
                try {
                    try {
                        k3.close();
                        if (c0728f.exit()) {
                            throw c0728f.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e6) {
                        if (!c0728f.exit()) {
                            throw e6;
                        }
                        throw c0728f.access$newTimeoutException(e6);
                    }
                } catch (Throwable th) {
                    c0728f.exit();
                    throw th;
                }
            default:
                ((OutputStream) this.i).close();
                return;
        }
    }

    @Override // h5.K, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f9340h) {
            case 0:
                K k3 = (K) this.f9341j;
                C0728f c0728f = (C0728f) this.i;
                c0728f.enter();
                try {
                    try {
                        k3.flush();
                        if (c0728f.exit()) {
                            throw c0728f.access$newTimeoutException(null);
                        }
                        return;
                    } catch (IOException e6) {
                        if (!c0728f.exit()) {
                            throw e6;
                        }
                        throw c0728f.access$newTimeoutException(e6);
                    }
                } catch (Throwable th) {
                    c0728f.exit();
                    throw th;
                }
            default:
                ((OutputStream) this.i).flush();
                return;
        }
    }

    @Override // h5.K
    public final P timeout() {
        switch (this.f9340h) {
            case 0:
                return (C0728f) this.i;
            default:
                return (P) this.f9341j;
        }
    }

    public final String toString() {
        switch (this.f9340h) {
            case 0:
                return "AsyncTimeout.sink(" + ((K) this.f9341j) + ')';
            default:
                return "sink(" + ((OutputStream) this.i) + ')';
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e A[LOOP:1: B:12:0x0065->B:25:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    @Override // h5.K
    public final void write(C0732j c0732j, long j4) throws IOException {
        C0728f c0728f;
        switch (this.f9340h) {
            case 0:
                E4.k.f("source", c0732j);
                AbstractC0724b.e(c0732j.i, 0L, j4);
                long j6 = j4;
                while (true) {
                    long j7 = 0;
                    if (j6 <= 0) {
                        return;
                    }
                    H h6 = c0732j.f9351h;
                    E4.k.c(h6);
                    try {
                        try {
                            while (j7 < 65536) {
                                j7 += (long) (h6.f9323c - h6.f9322b);
                                if (j7 >= j6) {
                                    j7 = j6;
                                    K k3 = (K) this.f9341j;
                                    c0728f = (C0728f) this.i;
                                    c0728f.enter();
                                    k3.write(c0732j, j7);
                                    if (!c0728f.exit()) {
                                        throw c0728f.access$newTimeoutException(null);
                                    }
                                    j6 -= j7;
                                } else {
                                    h6 = h6.f9326f;
                                    E4.k.c(h6);
                                }
                            }
                            k3.write(c0732j, j7);
                            if (!c0728f.exit()) {
                                throw c0728f.access$newTimeoutException(null);
                            }
                            j6 -= j7;
                        } catch (IOException e6) {
                            if (!c0728f.exit()) {
                                throw e6;
                            }
                            throw c0728f.access$newTimeoutException(e6);
                        }
                    } catch (Throwable th) {
                        c0728f.exit();
                        throw th;
                    }
                    K k6 = (K) this.f9341j;
                    c0728f = (C0728f) this.i;
                    c0728f.enter();
                }
                break;
            default:
                E4.k.f("source", c0732j);
                AbstractC0724b.e(c0732j.i, 0L, j4);
                while (j4 > 0) {
                    ((P) this.f9341j).throwIfReached();
                    H h7 = c0732j.f9351h;
                    E4.k.c(h7);
                    int iMin = (int) Math.min(j4, h7.f9323c - h7.f9322b);
                    ((OutputStream) this.i).write(h7.f9321a, h7.f9322b, iMin);
                    int i = h7.f9322b + iMin;
                    h7.f9322b = i;
                    long j8 = iMin;
                    j4 -= j8;
                    c0732j.i -= j8;
                    if (i == h7.f9323c) {
                        c0732j.f9351h = h7.a();
                        I.a(h7);
                    }
                }
                return;
        }
    }
}
