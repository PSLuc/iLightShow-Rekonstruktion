package h5;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class E extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F f9316h;

    public E(F f6) {
        this.f9316h = f6;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f9316h.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        F f6 = this.f9316h;
        if (f6.f9318j) {
            return;
        }
        f6.flush();
    }

    public final String toString() {
        return this.f9316h + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        F f6 = this.f9316h;
        if (f6.f9318j) {
            throw new IOException("closed");
        }
        f6.i.Z((byte) i);
        f6.E();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i3) throws IOException {
        E4.k.f("data", bArr);
        F f6 = this.f9316h;
        if (!f6.f9318j) {
            f6.i.Y(bArr, i, i3);
            f6.E();
            return;
        }
        throw new IOException("closed");
    }
}
