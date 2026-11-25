package okhttp3.internal.ws;

import E4.k;
import S1.h0;
import h5.AbstractC0724b;
import h5.C0730h;
import h5.C0732j;
import h5.C0735m;
import h5.C0736n;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements Closeable, AutoCloseable {
    private final C0732j deflatedBytes;
    private final Deflater deflater;
    private final C0736n deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z5) {
        this.noContextTakeover = z5;
        C0732j c0732j = new C0732j();
        this.deflatedBytes = c0732j;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C0736n(c0732j, deflater);
    }

    private final boolean endsWith(C0732j c0732j, C0735m c0735m) {
        return c0732j.f(c0732j.i - ((long) c0735m.d()), c0735m);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C0732j c0732j) throws IllegalAccessException, IOException, InvocationTargetException {
        k.f("buffer", c0732j);
        if (this.deflatedBytes.i != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(c0732j, c0732j.i);
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            C0732j c0732j2 = this.deflatedBytes;
            long j4 = c0732j2.i - ((long) 4);
            C0730h c0730hD = c0732j2.D(AbstractC0724b.f9339a);
            try {
                c0730hD.b(j4);
                c0730hD.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    h0.i(c0730hD, th);
                    throw th2;
                }
            }
        } else {
            this.deflatedBytes.Z(0);
        }
        C0732j c0732j3 = this.deflatedBytes;
        c0732j.write(c0732j3, c0732j3.i);
    }
}
