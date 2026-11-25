package okhttp3.internal.http;

import E4.k;
import h5.InterfaceC0734l;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC0734l source;

    public RealResponseBody(String str, long j4, InterfaceC0734l interfaceC0734l) {
        k.f("source", interfaceC0734l);
        this.contentTypeString = str;
        this.contentLength = j4;
        this.source = interfaceC0734l;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }

    @Override // okhttp3.ResponseBody
    public InterfaceC0734l source() {
        return this.source;
    }
}
