package h5;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class y extends r {
    @Override // h5.r
    public C0739q b(C c6) {
        E4.k.f("path", c6);
        File fileE = c6.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileE.exists()) {
            return new C0739q(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    public void c(C c6, C c7) throws IOException {
        E4.k.f("target", c7);
        if (c6.e().renameTo(c7.e())) {
            return;
        }
        throw new IOException("failed to move " + c6 + " to " + c7);
    }

    public final void d(C c6) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = c6.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + c6);
    }

    public final x e(C c6) {
        return new x(false, new RandomAccessFile(c6.e(), "r"));
    }

    public final M f(C c6) {
        E4.k.f("file", c6);
        return AbstractC0724b.i(c6.e());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
