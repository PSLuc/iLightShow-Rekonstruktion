package p027e3;

import L2.j;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8739b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f8740a;

    static {
        b bVar = new b();
        bVar.f8740a = null;
        f8739b = bVar;
    }

    public static j a(Context context) {
        j jVar;
        b bVar = f8739b;
        synchronized (bVar) {
            try {
                if (bVar.f8740a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f8740a = new j(context, 1);
                }
                jVar = bVar.f8740a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }
}
