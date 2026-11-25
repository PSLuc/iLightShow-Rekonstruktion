package okhttp3.internal.cache;

import D4.c;
import E4.k;
import h5.C0732j;
import h5.K;
import h5.s;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FaultHidingSink extends s {
    private boolean hasErrors;
    private final c onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(K k3, c cVar) {
        super(k3);
        k.f("delegate", k3);
        k.f("onException", cVar);
        this.onException = cVar;
    }

    @Override // h5.s, h5.K, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.invoke(e6);
        }
    }

    @Override // h5.s, h5.K, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.invoke(e6);
        }
    }

    public final c getOnException() {
        return this.onException;
    }

    @Override // h5.s, h5.K
    public void write(C0732j c0732j, long j4) throws EOFException {
        k.f("source", c0732j);
        if (this.hasErrors) {
            c0732j.l(j4);
            return;
        }
        try {
            super.write(c0732j, j4);
        } catch (IOException e6) {
            this.hasErrors = true;
            this.onException.invoke(e6);
        }
    }
}
