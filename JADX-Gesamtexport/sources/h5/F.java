package h5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0733k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K f9317h;
    public final C0732j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9318j;

    public F(K k3) {
        E4.k.f("sink", k3);
        this.f9317h = k3;
        this.i = new C0732j();
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k A(int i) {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.Z(i);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k B(byte[] bArr) {
        E4.k.f("source", bArr);
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.X(bArr);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k E() {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        C0732j c0732j = this.i;
        long j4 = c0732j.i;
        if (j4 == 0) {
            j4 = 0;
        } else {
            H h6 = c0732j.f9351h;
            E4.k.c(h6);
            H h7 = h6.f9327g;
            E4.k.c(h7);
            int i = h7.f9323c;
            if (i < 8192 && h7.f9325e) {
                j4 -= (long) (i - h7.f9322b);
            }
        }
        if (j4 > 0) {
            this.f9317h.write(c0732j, j4);
        }
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k O(String str) {
        E4.k.f("string", str);
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.h0(str);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k P(long j4) {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.a0(j4);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final C0732j a() {
        return this.i;
    }

    @Override // h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        K k3 = this.f9317h;
        if (this.f9318j) {
            return;
        }
        C0732j c0732j = this.i;
        long j4 = c0732j.i;
        if (j4 > 0) {
            k3.write(c0732j, j4);
        }
        th = null;
        try {
            k3.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f9318j = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k d(byte[] bArr, int i, int i3) {
        E4.k.f("source", bArr);
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.Y(bArr, i, i3);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k, h5.K, java.io.Flushable
    public final void flush() {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        C0732j c0732j = this.i;
        long j4 = c0732j.i;
        K k3 = this.f9317h;
        if (j4 > 0) {
            k3.write(c0732j, j4);
        }
        k3.flush();
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k h(long j4) {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.b0(j4);
        E();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9318j;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k m() {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        C0732j c0732j = this.i;
        long j4 = c0732j.i;
        if (j4 > 0) {
            this.f9317h.write(c0732j, j4);
        }
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k n(int i) {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.e0(i);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k q(int i) {
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.c0(i);
        E();
        return this;
    }

    @Override // h5.InterfaceC0733k
    public final long r(M m6) {
        long j4 = 0;
        while (true) {
            long j6 = ((C0727e) m6).read(this.i, 8192L);
            if (j6 == -1) {
                return j4;
            }
            j4 += j6;
            E();
        }
    }

    @Override // h5.InterfaceC0733k
    public final InterfaceC0733k t(C0735m c0735m) {
        E4.k.f("byteString", c0735m);
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        this.i.V(c0735m);
        E();
        return this;
    }

    @Override // h5.K
    public final P timeout() {
        return this.f9317h.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f9317h + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        E4.k.f("source", byteBuffer);
        if (this.f9318j) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.i.write(byteBuffer);
        E();
        return iWrite;
    }

    @Override // h5.K
    public final void write(C0732j c0732j, long j4) {
        E4.k.f("source", c0732j);
        if (!this.f9318j) {
            this.i.write(c0732j, j4);
            E();
            return;
        }
        throw new IllegalStateException("closed");
    }
}
