package L4;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f3095a;

    public a(j jVar) {
        this.f3095a = new AtomicReference(jVar);
    }

    @Override // L4.j
    public final Iterator iterator() {
        j jVar = (j) this.f3095a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
