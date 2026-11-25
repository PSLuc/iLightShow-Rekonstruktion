package N;

import android.os.Looper;

/* JADX INFO: renamed from: N.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3683b = 0;

    static {
        long id;
        G4.a.z(C0202a.i);
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f3682a = id;
    }
}
