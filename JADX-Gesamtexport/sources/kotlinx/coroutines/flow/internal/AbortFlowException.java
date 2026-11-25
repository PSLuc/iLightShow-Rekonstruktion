package kotlinx.coroutines.flow.internal;

import S4.InterfaceC0369f;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient InterfaceC0369f f9953h;

    public AbortFlowException(InterfaceC0369f interfaceC0369f) {
        super("Flow was aborted, no more elements needed");
        this.f9953h = interfaceC0369f;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
