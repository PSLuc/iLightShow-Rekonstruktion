package kotlinx.coroutines;

import E4.k;
import P4.b0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient b0 f9952h;

    public JobCancellationException(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f9952h = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return k.a(jobCancellationException.getMessage(), getMessage()) && k.a(jobCancellationException.f9952h, this.f9952h) && k.a(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        k.c(message);
        int iHashCode = (this.f9952h.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f9952h;
    }
}
