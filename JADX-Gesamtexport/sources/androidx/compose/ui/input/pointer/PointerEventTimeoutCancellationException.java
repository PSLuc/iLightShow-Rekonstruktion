package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import p091r0.o;

/* JADX INFO: loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j4) {
        super("Timed out waiting for " + j4 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(o.f11506c);
        return this;
    }
}
