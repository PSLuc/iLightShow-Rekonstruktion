package h5;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: h5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731i extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9350h;
    public final /* synthetic */ InterfaceC0734l i;

    public /* synthetic */ C0731i(InterfaceC0734l interfaceC0734l, int i) {
        this.f9350h = i;
        this.i = interfaceC0734l;
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f9350h) {
            case 0:
                return (int) Math.min(((C0732j) this.i).i, Integer.MAX_VALUE);
            default:
                G g6 = (G) this.i;
                if (g6.f9320j) {
                    throw new IOException("closed");
                }
                return (int) Math.min(g6.i.i, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f9350h) {
            case 0:
                break;
            default:
                ((G) this.i).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f9350h) {
            case 0:
                C0732j c0732j = (C0732j) this.i;
                if (c0732j.i > 0) {
                    return c0732j.W() & 255;
                }
                return -1;
            default:
                G g6 = (G) this.i;
                if (g6.f9320j) {
                    throw new IOException("closed");
                }
                C0732j c0732j2 = g6.i;
                if (c0732j2.i == 0 && g6.f9319h.read(c0732j2, 8192L) == -1) {
                    return -1;
                }
                return c0732j2.W() & 255;
        }
    }

    public final String toString() {
        switch (this.f9350h) {
            case 0:
                return ((C0732j) this.i) + ".inputStream()";
            default:
                return ((G) this.i) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i3) throws IOException {
        switch (this.f9350h) {
            case 0:
                E4.k.f("sink", bArr);
                return ((C0732j) this.i).C(bArr, i, i3);
            default:
                E4.k.f("data", bArr);
                G g6 = (G) this.i;
                if (!g6.f9320j) {
                    AbstractC0724b.e(bArr.length, i, i3);
                    C0732j c0732j = g6.i;
                    if (c0732j.i == 0 && g6.f9319h.read(c0732j, 8192L) == -1) {
                        return -1;
                    }
                    return c0732j.C(bArr, i, i3);
                }
                throw new IOException("closed");
        }
    }
}
