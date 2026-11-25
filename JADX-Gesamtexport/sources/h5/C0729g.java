package h5;

import java.io.EOFException;

/* JADX INFO: renamed from: h5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0729g implements K {
    @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // h5.K, java.io.Flushable
    public final void flush() {
    }

    @Override // h5.K
    public final P timeout() {
        return P.NONE;
    }

    @Override // h5.K
    public final void write(C0732j c0732j, long j4) throws EOFException {
        E4.k.f("source", c0732j);
        c0732j.l(j4);
    }
}
