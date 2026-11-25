package androidx.compose.ui;

import Z.a;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierNodeDetachedCancellationException extends CancellationException {
    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(a.f5932c);
        return this;
    }
}
