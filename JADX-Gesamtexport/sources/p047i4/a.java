package p047i4;

import com.google.android.gms.internal.play_billing.G;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AtomicReference {
    public final boolean a(Throwable th) {
        G g6 = c.f9589a;
        while (true) {
            Throwable th2 = (Throwable) get();
            if (th2 == c.f9589a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!compareAndSet(th2, compositeException)) {
                if (get() != th2) {
                }
            }
            return true;
        }
    }

    public final Throwable b() {
        G g6 = c.f9589a;
        Throwable th = (Throwable) get();
        G g7 = c.f9589a;
        return th != g7 ? (Throwable) getAndSet(g7) : th;
    }
}
