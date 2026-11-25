package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import p091r0.o;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputResetException extends CancellationException {
    public PointerInputResetException() {
        super("Pointer input was reset");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(o.f11506c);
        return this;
    }
}
