package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Map.Entry, F4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f5753h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ A f5754j;

    public z(A a6) {
        this.f5754j = a6;
        Map.Entry entry = a6.f5646k;
        E4.k.c(entry);
        this.f5753h = entry.getKey();
        Map.Entry entry2 = a6.f5646k;
        E4.k.c(entry2);
        this.i = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5753h;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        A a6 = this.f5754j;
        if (a6.f5644h.a().f5726d != a6.f5645j) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.i;
        a6.f5644h.put(this.f5753h, obj);
        this.i = obj;
        return obj2;
    }
}
