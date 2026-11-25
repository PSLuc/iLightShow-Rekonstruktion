package okhttp3;

import E4.g;
import E4.k;
import Z2.f;
import com.spotify.sdk.android.auth.LoginActivity;
import h5.AbstractC0724b;
import h5.B;
import h5.C0732j;
import h5.C0735m;
import h5.H;
import h5.InterfaceC0734l;
import h5.M;
import h5.O;
import h5.P;
import i5.a;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http1.HeadersReader;

/* JADX INFO: loaded from: classes.dex */
public final class MultipartReader implements Closeable, AutoCloseable {
    public static final Companion Companion = new Companion(null);
    private static final B afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C0735m crlfDashDashBoundary;
    private PartSource currentPart;
    private final C0735m dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final InterfaceC0734l source;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final B getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        private Companion() {
        }
    }

    public static final class Part implements Closeable, AutoCloseable {
        private final InterfaceC0734l body;
        private final Headers headers;

        public Part(Headers headers, InterfaceC0734l interfaceC0734l) {
            k.f("headers", headers);
            k.f("body", interfaceC0734l);
            this.headers = headers;
            this.body = interfaceC0734l;
        }

        public final InterfaceC0734l body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    public final class PartSource implements M {
        final /* synthetic */ MultipartReader this$0;
        private final P timeout;

        public PartSource(MultipartReader multipartReader) {
            k.f("this$0", multipartReader);
            this.this$0 = multipartReader;
            this.timeout = new P();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (k.a(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        @Override // h5.M
        public long read(C0732j c0732j, long j4) {
            k.f("sink", c0732j);
            if (j4 < 0) {
                throw new IllegalArgumentException(k.l("byteCount < 0: ", Long.valueOf(j4)).toString());
            }
            if (!k.a(this.this$0.currentPart, this)) {
                throw new IllegalStateException("closed");
            }
            P pTimeout = this.this$0.source.timeout();
            P p6 = this.timeout;
            MultipartReader multipartReader = this.this$0;
            long jTimeoutNanos = pTimeout.timeoutNanos();
            O o6 = P.Companion;
            long jTimeoutNanos2 = p6.timeoutNanos();
            long jTimeoutNanos3 = pTimeout.timeoutNanos();
            o6.getClass();
            if (jTimeoutNanos2 == 0 || (jTimeoutNanos3 != 0 && jTimeoutNanos2 >= jTimeoutNanos3)) {
                jTimeoutNanos2 = jTimeoutNanos3;
            }
            pTimeout.timeout(jTimeoutNanos2, TimeUnit.NANOSECONDS);
            if (!pTimeout.hasDeadline()) {
                if (p6.hasDeadline()) {
                    pTimeout.deadlineNanoTime(p6.deadlineNanoTime());
                }
                try {
                    long jCurrentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j4);
                    return jCurrentPartBytesRemaining == 0 ? -1L : multipartReader.source.read(c0732j, jCurrentPartBytesRemaining);
                } finally {
                    pTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                    if (p6.hasDeadline()) {
                        pTimeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = pTimeout.deadlineNanoTime();
            if (p6.hasDeadline()) {
                pTimeout.deadlineNanoTime(Math.min(pTimeout.deadlineNanoTime(), p6.deadlineNanoTime()));
            }
            try {
                long jCurrentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j4);
                return jCurrentPartBytesRemaining2 == 0 ? -1L : multipartReader.source.read(c0732j, jCurrentPartBytesRemaining2);
            } finally {
                pTimeout.timeout(jTimeoutNanos, TimeUnit.NANOSECONDS);
                if (p6.hasDeadline()) {
                    pTimeout.deadlineNanoTime(jDeadlineNanoTime);
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
        afterBoundaryOptions = AbstractC0724b.g(f.i("\r\n"), f.i("--"), f.i(" "), f.i("\t"));
    }

    public MultipartReader(InterfaceC0734l interfaceC0734l, String str) {
        k.f("source", interfaceC0734l);
        k.f("boundary", str);
        this.source = interfaceC0734l;
        this.boundary = str;
        C0732j c0732j = new C0732j();
        c0732j.h0("--");
        c0732j.h0(str);
        this.dashDashBoundary = c0732j.j(c0732j.i);
        C0732j c0732j2 = new C0732j();
        c0732j2.h0("\r\n--");
        c0732j2.h0(str);
        this.crlfDashDashBoundary = c0732j2.j(c0732j2.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    public final long currentPartBytesRemaining(long j4) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        this.source.N(this.crlfDashDashBoundary.d());
        C0732j c0732jA = this.source.a();
        C0735m c0735m = this.crlfDashDashBoundary;
        c0732jA.getClass();
        k.f("bytes", c0735m);
        if (c0735m.d() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        H h6 = c0732jA.f9351h;
        if (h6 != null) {
            long j11 = c0732jA.i;
            long j12 = 0;
            if (j11 < 0) {
                while (j11 > 0) {
                    h6 = h6.f9327g;
                    k.c(h6);
                    j11 -= (long) (h6.f9323c - h6.f9322b);
                }
                j6 = -1;
                byte[] bArrH = c0735m.h();
                byte b6 = bArrH[0];
                int iD = c0735m.d();
                j7 = 1;
                long j13 = (c0732jA.i - ((long) iD)) + 1;
                while (true) {
                    if (j11 < j13) {
                        j8 = j11;
                        int iMin = (int) Math.min(h6.f9323c, (((long) h6.f9322b) + j13) - j11);
                        int i = (int) ((((long) h6.f9322b) + j12) - j8);
                        while (true) {
                            if (i >= iMin) {
                                j12 = j8 + ((long) (h6.f9323c - h6.f9322b));
                                h6 = h6.f9326f;
                                k.c(h6);
                                j11 = j12;
                            } else if (h6.f9321a[i] == b6 && a.a(h6, i + 1, bArrH, iD)) {
                                j9 = i - h6.f9322b;
                                j10 = j9 + j8;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            } else {
                j6 = -1;
                j7 = 1;
                long j14 = 0;
                while (true) {
                    long j15 = ((long) (h6.f9323c - h6.f9322b)) + j14;
                    if (j15 > 0) {
                        break;
                    }
                    h6 = h6.f9326f;
                    k.c(h6);
                    j14 = j15;
                }
                byte[] bArrH2 = c0735m.h();
                byte b7 = bArrH2[0];
                int iD2 = c0735m.d();
                long j16 = (c0732jA.i - ((long) iD2)) + 1;
                while (true) {
                    if (j14 < j16) {
                        j8 = j14;
                        int iMin2 = (int) Math.min(h6.f9323c, (((long) h6.f9322b) + j16) - j14);
                        int i3 = (int) ((((long) h6.f9322b) + j12) - j8);
                        while (true) {
                            if (i3 >= iMin2) {
                                j12 = j8 + ((long) (h6.f9323c - h6.f9322b));
                                h6 = h6.f9326f;
                                k.c(h6);
                                j14 = j12;
                            } else if (h6.f9321a[i3] == b7 && a.a(h6, i3 + 1, bArrH2, iD2)) {
                                j9 = i3 - h6.f9322b;
                                j10 = j9 + j8;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
            }
            return j10 == j6 ? Math.min(j4, (this.source.a().i - ((long) this.crlfDashDashBoundary.d())) + j7) : Math.min(j4, j10);
        }
        j6 = -1;
        j7 = 1;
        j10 = j6;
        if (j10 == j6) {
        }
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() throws ProtocolException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.f(0L, this.dashDashBoundary)) {
            this.source.l(this.dashDashBoundary.d());
        } else {
            while (true) {
                long jCurrentPartBytesRemaining = currentPartBytesRemaining(8192L);
                if (jCurrentPartBytesRemaining == 0) {
                    break;
                }
                this.source.l(jCurrentPartBytesRemaining);
            }
            this.source.l(this.crlfDashDashBoundary.d());
        }
        boolean z5 = false;
        while (true) {
            int iK = this.source.K(afterBoundaryOptions);
            if (iK == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iK == 0) {
                this.partCount++;
                Headers headers = new HeadersReader(this.source).readHeaders();
                PartSource partSource = new PartSource(this);
                this.currentPart = partSource;
                return new Part(headers, AbstractC0724b.c(partSource));
            }
            if (iK == 1) {
                if (z5) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iK == 2 || iK == 3) {
                z5 = true;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultipartReader(ResponseBody responseBody) throws ProtocolException {
        k.f(LoginActivity.RESPONSE_KEY, responseBody);
        InterfaceC0734l interfaceC0734lSource = responseBody.source();
        MediaType mediaTypeContentType = responseBody.contentType();
        String strParameter = mediaTypeContentType == null ? null : mediaTypeContentType.parameter("boundary");
        if (strParameter != null) {
            this(interfaceC0734lSource, strParameter);
            return;
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
}
