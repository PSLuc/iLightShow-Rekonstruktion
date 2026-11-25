package h5;

import B.AbstractC0013g0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: h5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0727e implements M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9342h = 0;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f9343j;

    public C0727e(InputStream inputStream, P p6) {
        E4.k.f("timeout", p6);
        this.i = inputStream;
        this.f9343j = p6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f9342h) {
            case 0:
                M m6 = (M) this.f9343j;
                C0728f c0728f = (C0728f) this.i;
                c0728f.enter();
                try {
                    try {
                        m6.close();
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
                ((InputStream) this.i).close();
                return;
        }
    }

    @Override // h5.M
    public final long read(C0732j c0732j, long j4) {
        switch (this.f9342h) {
            case 0:
                E4.k.f("sink", c0732j);
                M m6 = (M) this.f9343j;
                C0728f c0728f = (C0728f) this.i;
                c0728f.enter();
                try {
                    try {
                        long j6 = m6.read(c0732j, j4);
                        if (c0728f.exit()) {
                            throw c0728f.access$newTimeoutException(null);
                        }
                        return j6;
                    } catch (IOException e6) {
                        if (c0728f.exit()) {
                            throw c0728f.access$newTimeoutException(e6);
                        }
                        throw e6;
                    }
                } catch (Throwable th) {
                    c0728f.exit();
                    throw th;
                }
            default:
                E4.k.f("sink", c0732j);
                if (j4 == 0) {
                    return 0L;
                }
                if (j4 < 0) {
                    throw new IllegalArgumentException(AbstractC0013g0.h("byteCount < 0: ", j4).toString());
                }
                try {
                    ((P) this.f9343j).throwIfReached();
                    H hT = c0732j.T(1);
                    int i = ((InputStream) this.i).read(hT.f9321a, hT.f9323c, (int) Math.min(j4, 8192 - hT.f9323c));
                    if (i == -1) {
                        if (hT.f9322b == hT.f9323c) {
                            c0732j.f9351h = hT.a();
                            I.a(hT);
                        }
                        return -1L;
                    }
                    hT.f9323c += i;
                    long j7 = i;
                    c0732j.i += j7;
                    return j7;
                } catch (AssertionError e7) {
                    if (AbstractC0724b.f(e7)) {
                        throw new IOException(e7);
                    }
                    throw e7;
                }
        }
    }

    @Override // h5.M
    public final P timeout() {
        switch (this.f9342h) {
            case 0:
                return (C0728f) this.i;
            default:
                return (P) this.f9343j;
        }
    }

    public final String toString() {
        switch (this.f9342h) {
            case 0:
                return "AsyncTimeout.source(" + ((M) this.f9343j) + ')';
            default:
                return "source(" + ((InputStream) this.i) + ')';
        }
    }

    public C0727e(C0728f c0728f, M m6) {
        this.i = c0728f;
        this.f9343j = m6;
    }
}
