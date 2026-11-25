package okhttp3.internal.http;

import h5.K;
import h5.M;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes.dex */
public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    K createRequestBody(Request request, long j4);

    void finishRequest();

    void flushRequest();

    RealConnection getConnection();

    M openResponseBodySource(Response response);

    Response.Builder readResponseHeaders(boolean z5);

    long reportedContentLength(Response response);

    Headers trailers();

    void writeRequestHeaders(Request request);
}
