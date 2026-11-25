package okhttp3.internal.http1;

import E4.g;
import E4.k;
import h5.InterfaceC0734l;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final InterfaceC0734l source;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(InterfaceC0734l interfaceC0734l) {
        k.f("source", interfaceC0734l);
        this.source = interfaceC0734l;
        this.headerLimit = 262144L;
    }

    public final InterfaceC0734l getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() {
        String strH = this.source.H(this.headerLimit);
        this.headerLimit -= (long) strH.length();
        return strH;
    }
}
