package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E1.b f6972a = new E1.b();

    public final void a(H h6) {
        AutoCloseable autoCloseable;
        E1.b bVar = this.f6972a;
        if (bVar != null) {
            if (bVar.f1005d) {
                E1.b.a(h6);
                return;
            }
            synchronized (bVar.f1002a) {
                autoCloseable = (AutoCloseable) bVar.f1003b.put("androidx.lifecycle.savedstate.vm.tag", h6);
            }
            E1.b.a(autoCloseable);
        }
    }

    public final void b() {
        E1.b bVar = this.f6972a;
        if (bVar != null && !bVar.f1005d) {
            bVar.f1005d = true;
            synchronized (bVar.f1002a) {
                try {
                    Iterator it = bVar.f1003b.values().iterator();
                    while (it.hasNext()) {
                        E1.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f1004c.iterator();
                    while (it2.hasNext()) {
                        E1.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f1004c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c();
    }

    public void c() {
    }
}
