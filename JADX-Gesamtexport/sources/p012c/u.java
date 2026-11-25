package p012c;

import E4.i;
import E4.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7180b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f7181c;

    public u(boolean z5) {
        this.f7179a = z5;
    }

    public void a() {
    }

    public abstract void b();

    public void c(C0464b c0464b) {
        k.f("backEvent", c0464b);
    }

    public void d(C0464b c0464b) {
        k.f("backEvent", c0464b);
    }

    public final void e() {
        Iterator it = this.f7180b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0465c) it.next()).cancel();
        }
    }
}
