package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import p091r0.o;

/* JADX INFO: loaded from: classes.dex */
public final class CancelTimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CancelTimeoutCancellationException f6719h = new CancelTimeoutCancellationException();

    private CancelTimeoutCancellationException() {
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(o.f11506c);
        return this;
    }
}
