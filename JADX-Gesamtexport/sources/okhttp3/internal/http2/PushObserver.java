package okhttp3.internal.http2;

import E4.k;
import h5.InterfaceC0734l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i, InterfaceC0734l interfaceC0734l, int i3, boolean z5) {
                k.f("source", interfaceC0734l);
                interfaceC0734l.l(i3);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i, List<Header> list, boolean z5) {
                k.f("responseHeaders", list);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i, List<Header> list) {
                k.f("requestHeaders", list);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i, ErrorCode errorCode) {
                k.f("errorCode", errorCode);
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i, InterfaceC0734l interfaceC0734l, int i3, boolean z5);

    boolean onHeaders(int i, List<Header> list, boolean z5);

    boolean onRequest(int i, List<Header> list);

    void onReset(int i, ErrorCode errorCode);
}
