package p016c3;

import Z2.w;
import android.content.Context;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f7346a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f7347b;

    public final void a(Context context, w wVar) {
        try {
            context.unbindService(wVar);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }
}
