package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6680h;

    public ComposeRuntimeError(String str) {
        this.f6680h = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6680h;
    }
}
