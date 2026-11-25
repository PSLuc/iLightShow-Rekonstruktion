package W0;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5540c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationException f5541a;

    static {
        if (g.f5551d) {
            f5540c = null;
            f5539b = null;
        } else {
            f5540c = new a(false, null);
            f5539b = new a(true, null);
        }
    }

    public a(boolean z5, CancellationException cancellationException) {
        this.f5541a = cancellationException;
    }
}
