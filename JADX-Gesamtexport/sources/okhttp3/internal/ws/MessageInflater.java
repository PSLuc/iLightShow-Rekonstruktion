package okhttp3.internal.ws;

import E4.k;
import h5.AbstractC0724b;
import h5.C0732j;
import h5.w;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class MessageInflater implements Closeable, AutoCloseable {
    private final C0732j deflatedBytes;
    private final Inflater inflater;
    private final w inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z5) {
        this.noContextTakeover = z5;
        C0732j c0732j = new C0732j();
        this.deflatedBytes = c0732j;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new w(AbstractC0724b.c(c0732j), inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }

    public final void inflate(C0732j c0732j) throws IOException {
        k.f("buffer", c0732j);
        if (this.deflatedBytes.i != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.r(c0732j);
        this.deflatedBytes.c0(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = this.inflater.getBytesRead() + this.deflatedBytes.i;
        do {
            this.inflaterSource.b(c0732j, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < bytesRead);
    }
}
