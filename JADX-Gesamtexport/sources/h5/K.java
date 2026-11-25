package h5;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes.dex */
public interface K extends Closeable, Flushable, AutoCloseable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    void flush();

    P timeout();

    void write(C0732j c0732j, long j4);
}
