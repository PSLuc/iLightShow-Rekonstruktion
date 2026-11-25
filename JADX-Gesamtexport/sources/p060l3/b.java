package p060l3;

import F.L;
import K.y;
import Z2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10375a = new y();

    public final void a(Exception exc) {
        y yVar = this.f10375a;
        yVar.getClass();
        n.c("Exception must not be null", exc);
        synchronized (yVar.f2032c) {
            try {
                if (yVar.f2031b) {
                    return;
                }
                yVar.f2031b = true;
                yVar.f2034e = exc;
                ((L) yVar.f2033d).m(yVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        y yVar = this.f10375a;
        synchronized (yVar.f2032c) {
            try {
                if (yVar.f2031b) {
                    return;
                }
                yVar.f2031b = true;
                yVar.f2030a = obj;
                ((L) yVar.f2033d).m(yVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
