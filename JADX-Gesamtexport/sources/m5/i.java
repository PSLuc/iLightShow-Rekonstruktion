package m5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ByteArrayOutputStream implements AutoCloseable {
    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Arrays.fill(((ByteArrayOutputStream) this).buf, (byte) 0);
        super.close();
    }
}
