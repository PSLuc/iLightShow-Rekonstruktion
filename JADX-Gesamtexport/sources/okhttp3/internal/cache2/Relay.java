package okhttp3.internal.cache2;

import E4.g;
import E4.k;
import Z2.f;
import h5.C0732j;
import h5.C0735m;
import h5.M;
import h5.P;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C0735m PREFIX_CLEAN;
    public static final C0735m PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C0732j buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C0735m metadata;
    private int sourceCount;
    private M upstream;
    private final C0732j upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Relay edit(File file, M m6, C0735m c0735m, long j4) throws IOException {
            k.f("file", file);
            k.f("upstream", m6);
            k.f("metadata", c0735m);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, m6, 0L, c0735m, j4, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            k.f("file", file);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            k.e("randomAccessFile.channel", channel);
            FileOperator fileOperator = new FileOperator(channel);
            C0732j c0732j = new C0732j();
            fileOperator.read(0L, c0732j, Relay.FILE_HEADER_SIZE);
            C0735m c0735m = Relay.PREFIX_CLEAN;
            if (!k.a(c0732j.j(c0735m.d()), c0735m)) {
                throw new IOException("unreadable cache file");
            }
            long jU = c0732j.u();
            long jU2 = c0732j.u();
            C0732j c0732j2 = new C0732j();
            fileOperator.read(Relay.FILE_HEADER_SIZE + jU, c0732j2, jU2);
            return new Relay(randomAccessFile, null, jU, c0732j2.j(c0732j2.i), 0L, null);
        }

        private Companion() {
        }
    }

    public final class RelaySource implements M {
        private FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ Relay this$0;
        private final P timeout;

        public RelaySource(Relay relay) {
            k.f("this$0", relay);
            this.this$0 = relay;
            this.timeout = new P();
            RandomAccessFile file = relay.getFile();
            k.c(file);
            FileChannel channel = file.getChannel();
            k.e("file!!.channel", channel);
            this.fileOperator = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = this.this$0;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
            }
            if (randomAccessFile == null) {
                return;
            }
            Util.closeQuietly(randomAccessFile);
        }

        @Override // h5.M
        public long read(C0732j c0732j, long j4) throws IOException {
            char c6;
            C0732j c0732j2 = c0732j;
            k.f("sink", c0732j2);
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = this.this$0;
            synchronized (relay) {
                while (true) {
                    if (this.sourcePos == relay.getUpstreamPos()) {
                        if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.setUpstreamReader(Thread.currentThread());
                                c6 = 1;
                                break;
                            }
                            this.timeout.waitUntilNotified(relay);
                            c0732j2 = c0732j;
                        } else {
                            return -1L;
                        }
                    } else {
                        long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().i;
                        if (this.sourcePos < upstreamPos) {
                            c6 = 2;
                            break;
                        }
                        long jMin = Math.min(j4, relay.getUpstreamPos() - this.sourcePos);
                        relay.getBuffer().k(this.sourcePos - upstreamPos, c0732j2, jMin);
                        this.sourcePos += jMin;
                        return jMin;
                    }
                }
                if (c6 == 2) {
                    long jMin2 = Math.min(j4, this.this$0.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    k.c(fileOperator);
                    fileOperator.read(this.sourcePos + Relay.FILE_HEADER_SIZE, c0732j, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    M upstream = this.this$0.getUpstream();
                    k.c(upstream);
                    long j6 = upstream.read(this.this$0.getUpstreamBuffer(), this.this$0.getBufferMaxSize());
                    if (j6 == -1) {
                        Relay relay2 = this.this$0;
                        relay2.commit(relay2.getUpstreamPos());
                        Relay relay3 = this.this$0;
                        synchronized (relay3) {
                            relay3.setUpstreamReader(null);
                            relay3.notifyAll();
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(j6, j4);
                    this.this$0.getUpstreamBuffer().k(0L, c0732j, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    k.c(fileOperator2);
                    fileOperator2.write(this.this$0.getUpstreamPos() + Relay.FILE_HEADER_SIZE, this.this$0.getUpstreamBuffer().clone(), j6);
                    Relay relay4 = this.this$0;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().write(relay4.getUpstreamBuffer(), j6);
                            if (relay4.getBuffer().i > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().l(relay4.getBuffer().i - relay4.getBufferMaxSize());
                            }
                            relay4.setUpstreamPos(relay4.getUpstreamPos() + j6);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Relay relay5 = this.this$0;
                    synchronized (relay5) {
                        relay5.setUpstreamReader(null);
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th2) {
                    Relay relay6 = this.this$0;
                    synchronized (relay6) {
                        relay6.setUpstreamReader(null);
                        relay6.notifyAll();
                        throw th2;
                    }
                }
            }
        }

        @Override // h5.M
        public P timeout() {
            return this.timeout;
        }
    }

    static {
        C0735m c0735m = C0735m.f9352k;
        PREFIX_CLEAN = f.i("OkHttp cache v1\n");
        PREFIX_DIRTY = f.i("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, M m6, long j4, C0735m c0735m, long j6, g gVar) {
        this(randomAccessFile, m6, j4, c0735m, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(C0735m c0735m, long j4, long j6) throws IOException {
        C0732j c0732j = new C0732j();
        c0732j.V(c0735m);
        c0732j.d0(j4);
        c0732j.d0(j6);
        if (c0732j.i != FILE_HEADER_SIZE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        k.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        k.e("file!!.channel", channel);
        new FileOperator(channel).write(0L, c0732j, FILE_HEADER_SIZE);
    }

    private final void writeMetadata(long j4) throws IOException {
        C0732j c0732j = new C0732j();
        c0732j.V(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        k.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        k.e("file!!.channel", channel);
        new FileOperator(channel).write(FILE_HEADER_SIZE + j4, c0732j, this.metadata.d());
    }

    public final void commit(long j4) throws IOException {
        writeMetadata(j4);
        RandomAccessFile randomAccessFile = this.file;
        k.c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j4, this.metadata.d());
        RandomAccessFile randomAccessFile2 = this.file;
        k.c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            setComplete(true);
        }
        M m6 = this.upstream;
        if (m6 != null) {
            Util.closeQuietly(m6);
        }
        this.upstream = null;
    }

    public final C0732j getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final M getUpstream() {
        return this.upstream;
    }

    public final C0732j getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final C0735m metadata() {
        return this.metadata;
    }

    public final M newSource() {
        synchronized (this) {
            if (getFile() == null) {
                return null;
            }
            setSourceCount(getSourceCount() + 1);
            return new RelaySource(this);
        }
    }

    public final void setComplete(boolean z5) {
        this.complete = z5;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(M m6) {
        this.upstream = m6;
    }

    public final void setUpstreamPos(long j4) {
        this.upstreamPos = j4;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, M m6, long j4, C0735m c0735m, long j6) {
        this.file = randomAccessFile;
        this.upstream = m6;
        this.upstreamPos = j4;
        this.metadata = c0735m;
        this.bufferMaxSize = j6;
        this.upstreamBuffer = new C0732j();
        this.complete = m6 == null;
        this.buffer = new C0732j();
    }
}
