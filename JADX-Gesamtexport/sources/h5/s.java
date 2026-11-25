package h5;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements K {
    private final K delegate;

    public s(K k3) {
        E4.k.f("delegate", k3);
        this.delegate = k3;
    }

    @p084p4.c
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final K m9deprecated_delegate() {
        return this.delegate;
    }

    @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.delegate.close();
    }

    public final K delegate() {
        return this.delegate;
    }

    @Override // h5.K, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // h5.K
    public P timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // h5.K
    public void write(C0732j c0732j, long j4) {
        E4.k.f("source", c0732j);
        this.delegate.write(c0732j, j4);
    }
}
