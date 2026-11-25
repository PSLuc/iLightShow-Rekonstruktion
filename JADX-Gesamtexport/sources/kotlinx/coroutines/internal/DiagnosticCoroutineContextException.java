package kotlinx.coroutines.internal;

import p111u4.i;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient i f9954h;

    public DiagnosticCoroutineContextException(i iVar) {
        this.f9954h = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f9954h.toString();
    }
}
