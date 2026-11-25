package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f6977a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f6977a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((O) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
