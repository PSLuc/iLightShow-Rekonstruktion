package h5;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements M {
    private final M delegate;

    public t(M m6) {
        E4.k.f("delegate", m6);
        this.delegate = m6;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final M m10deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final M delegate() {
        return this.delegate;
    }

    @Override // h5.M
    public long read(C0732j c0732j, long j4) {
        E4.k.f("sink", c0732j);
        return this.delegate.read(c0732j, j4);
    }

    @Override // h5.M
    public P timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
