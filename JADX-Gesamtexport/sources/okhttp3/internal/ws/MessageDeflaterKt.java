package okhttp3.internal.ws;

import Z2.f;
import h5.C0735m;

/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflaterKt {
    private static final C0735m EMPTY_DEFLATE_BLOCK;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
        C0735m c0735m = C0735m.f9352k;
        EMPTY_DEFLATE_BLOCK = f.h("000000ffff");
    }
}
